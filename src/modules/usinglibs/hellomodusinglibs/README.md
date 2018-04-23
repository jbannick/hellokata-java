This modularized app uses four libraries:

- The Apache Commons CSVParser library to parse a CSV file
- The Jackson JSON library to write JSON output
- The EventBus publish / subscribe library to transmit data between the two
- The Log4J2 library to log the events

None of these libraries are modularized.

- The CSVParser library consists of one JAR.  
- The Jackson JSON library consists of three JARs.  
- The EventBus library consists of one JAR.  
- The Log4J2 library consists of two JARs.

The log4j-core.2.11.0.jar's MANIFEST.MF contains:  
Automatic-Module-Name: org.apache.logging.log4j.core

The MANIFEST.MF in both JARs contain:  
Multi-Release: true

Both JAR's contain version directory trees for Java 9.

WARNING: Log4J2's version 2.10.0 DOES NOT WORK here.  
Specifically, it throws the exception:
```
java.lang.NoClassDefFoundError: Could not initialize class org.apache.logging.log4j.util.PropertiesUtil
```

WARNING: Jackson's databind for versions 2.9.1 - 2.9.5 DO NOT WORK here.
Specifically, Java can not find the jackson.databind module.

Here we make all of these libraries into Automatic modules.

The app itself is deployed in a JAR.  
The log4j2.xml configuration file is included in that JAR.

To build and run this app:

- You must have any Java JDK release 9 or later installed
- You must have commons-csv-1.5.jar at CSV_HOME
- You must have jackson-core.2.9.0.jar at JSON_HOME
- You must have jackson-annotations.2.9.0.jar at JSON_HOME
- You must have jackson-databind.2.9.0.jar at JSON_HOME
- You must have eventbus-1.4.jar at EBUS_HOME
- You must have log4j-core.2.11.0.jar at LOG4J2_HOME
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
http://central.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.11.0/  
http://central.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.11.0/  

1. Copy the src directory tree to your destination location
2. Copy names.csv to that location  
3. Copy build.sh to that location
4. Copy run.sh to that location
5. At the command line, cd to your destination location
6. At the command line, execute: build.sh

The app should build.

7. At the command line, execute: run.sh

The console should display:

Hello Modules Using Multiple Libraries  
04:54:42.055 [AWT-EventQueue-0] INFO  kata.app.HelloModUsingLibs - Reading CSV  
04:54:42.098 [AWT-EventQueue-0] INFO  kata.app.JSONWriter - {"first_name":"john","last_name":"bannick"}  
04:54:42.099 [AWT-EventQueue-0] INFO  kata.app.JSONWriter - {"first_name":"elmer","last_name":"fudd"}  
04:54:42.099 [AWT-EventQueue-0] INFO  kata.app.JSONWriter - {"first_name":"bugs","last_name":"bunny"}  
04:54:42.099 [AWT-EventQueue-0] INFO  kata.app.HelloModUsingLibs - Finished reading CSV  
  
A file named hellolog4j2.log should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.

Note that the Log4J2 configuration is defined in the log4j2.xml file,
which is located within the app module.

To deploy this app:

- You must have the Java JRE at or later than the release you used to build this installed on the destination computer

1. Copy the mods directory, names.csv file, and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello Modules Using Multiple Libraries  
04:54:42.055 [AWT-EventQueue-0] INFO  kata.app.HelloModUsingLibs - Reading CSV  
04:54:42.098 [AWT-EventQueue-0] INFO  kata.app.JSONWriter - {"first_name":"john","last_name":"bannick"}  
04:54:42.099 [AWT-EventQueue-0] INFO  kata.app.JSONWriter - {"first_name":"elmer","last_name":"fudd"}  
04:54:42.099 [AWT-EventQueue-0] INFO  kata.app.JSONWriter - {"first_name":"bugs","last_name":"bunny"}  
04:54:42.099 [AWT-EventQueue-0] INFO  kata.app.HelloModUsingLibs - Finished reading CSV  
  
A file named hellolog4j2.log should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.
