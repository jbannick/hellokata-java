This modularized app is a Custom Runtime Image that:

1. Reads and parses a CSV file
2. Publishes those records to a subscriber
3. Which converts them into JSON

It contains its own on-board subset of the Java runtime environment.

Java 9 and later JRE's are modularized.

A Custom Runtime Image contains your app, as a module, and a JRE that contains only those modules required to run your app.

It needs the Java 9 or later JDK on your build computer to build, but does not need Java installed on the destination computer to run.

It may be run only on computers using the same operating system, though not necessarily the same release, as the computer on which you built this app.

The modularized app uses four libraries:

- The Apache Commons CSVParser library to parse a CSV file
- The Jackson JSON library to write JSON output
- The EventBus publish / subscribe library to transmit data between the two
- The Log4J2 library to log the events

All libraries used by a Custom Runtime Image must be fully modularized.  
Three of these libraries are totally non-modularized.

- The CSVParser library consists of one JAR.  
  We use a hack to modularize it by adding a module-info.class file to its JAR  
  
- The Jackson JSON library consists of three JARs.  
  We use the same hack to modularize those JARs.
  
- The EventBus library consists of one JAR.  
  We use the same hack to modularize that JAR.
 
- The Log4J2 library normally consists of two JARs.

Both JAR's are multi-release, containing version directory trees for Java 9.
Both JAR's contain version directory trees for Java 9.

The log4j-api.2.11.0.jar is fully modularized.

The log4j-core.2.11.0.jar is an Automatic Module. 
It is so specified in its MANIFEST.MF file.

As such, it can ***not*** be used in a custom image.  
I tried for a week to apply the above hack to this JAR, unsuccessfully.  
Maybe the folks at Apache knew what they were doing by not modularizing it at this time.

However, Log4J2's Simple Logger will work with just the log4j-api.2.11.0.jar.  
Therefore, for this custom image modularized app, I use Log4J's SimpleLogger.

To build and run this app:

- You must have Java JDK 9 or greater installed  

- You must have commons-csv-1.5.jar at CSV_HOME  
- You must have jackson-core.2.9.0.jar at JSON_HOME 
- You must have jackson-annotations.2.9.0.jar at JSON_HOME  
- You must have jackson-databind.2.9.0.jar at JSON_HOME 
- You must have eventbus-1.4.jar at EBUS_HOME. 
- You must have log4j-api.2.11.0.jar at LOG4J2_HOME  

Download CSVParser from: 
https://commons.apache.org/proper/commons-csv/download_csv.cgi

Download Jckson JSON from:  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.0/  

Download eventbus from: 
https://mvnrepository.com/artifact/org.bushe/eventbus/1.4

Download Log4J2 from:   
http://central.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.11.0/  

WARNING: Log4J2's version 2.10.0 DOES NOT WORK here.  
Specifically, it throws the exception:
```
java.lang.NoClassDefFoundError: Could not initialize class org.apache.logging.log4j.util.PropertiesUtil
```
WARNING: Jackson's databind for versions 2.9.1 - 2.9.5 DO NOT WORK here.  
Specifically, Java can not find the jackson.databind module.  
So we use version 2.9.0.

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello Modules Custom Image Using Multiple Libraries!  
18:27:31.574 INFO HelloModImageUsingLibs Reading CSV  
18:27:31.935 INFO JSONWriter {"first_name":"john","last_name":"bannick"}  
18:27:31.936 INFO JSONWriter {"first_name":"elmer","last_name":"fudd"}  
18:27:31.936 INFO JSONWriter {"first_name":"bugs","last_name":"bunny"}  
18:27:31.936 INFO HelloModImageUsingLibs Finished reading CSV  

A file named hellolog4j2.log should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.

Note that the Log4J2 configuration is defined in the log4j2.xml file,
which is located within the app module.

The names.csv file is not in the app's JAR.  
Go ahead and add your name.

To deploy this app:

- You must have Java JRE at or later than the release you used to build this installed on the destination computer

1. Copy the appmod_image directory, and run.sh file, and names.csv file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello Modules Custom Image Using Multiple Libraries!  
18:27:31.574 INFO HelloModImageUsingLibs Reading CSV  
18:27:31.935 INFO JSONWriter {"first_name":"john","last_name":"bannick"}  
18:27:31.936 INFO JSONWriter {"first_name":"elmer","last_name":"fudd"}  
18:27:31.936 INFO JSONWriter {"first_name":"bugs","last_name":"bunny"}  
18:27:31.936 INFO HelloModImageUsingLibs Finished reading CSV  

A file named hellolog4j2.log should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.
