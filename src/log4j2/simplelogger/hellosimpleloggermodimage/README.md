This simple modularized app is a Custom Runtime Image that uses the Log4J SimpleLogger to log events to the console.

It contains its own on-board subset of the Java runtime environment.

Java 9 and later JRE's are modularized.

A Custom Runtime Image contains your app, as a module, and a JRE that contains only those modules required to run your app.

It needs the Java 9 or later JDK on your build computer to build, but does not need Java installed on the destination computer to run.

It may be run only on computers using the same operating system, though not necessarily the same release, as the computer on which you built this app.

The modularized app uses just one library:

- The Log4J2 library to log events

All libraries used by a Custom Runtime Image must be fully modularized.  
 
The Log4J2 library normally consists of two JARs.

Both JAR's are multi-release, containing version directory trees for Java 9.
Both JAR's contain version directory trees for Java 9.

The log4j-api.2.11.0.jar is fully modularized.

The log4j-core.2.11.0.jar is an Automatic Module. 
It is so specified in its MANIFEST.MF file.

As such, it can ***not*** be used in a custom image.  

However, Log4J2's Simple Logger will work with just the log4j-api.2.11.0.jar.  

To build and run this app:

- You must have Java JDK 9 or greater installed  

- You must have log4j-api.2.11.0.jar at LOG4J2_HOME  

Download Log4J2 from:   
http://central.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.11.0/  

WARNING: Log4J2's version 2.10.0 DOES NOT WORK here.  
Specifically, it throws the exception:
```
java.lang.NoClassDefFoundError: Could not initialize class org.apache.logging.log4j.util.PropertiesUtil
```

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello Log4J2 SimpleLogger Modularized Image!  
11:44:26 INFO HelloLog4J2SimpleLoggerModImage This is an information entry  
11:44:26 DEBUG HelloLog4J2SimpleLoggerModImage This is a debugging entry  
11:44:26 WARN HelloLog4J2SimpleLoggerModImage This is a warning entry  
11:44:26 ERROR HelloLog4J2SimpleLoggerModImage This is an error entry

To deploy this app:

- You must have Java JRE at or later than the release you used to build this installed on the destination computer

1. Copy the appmod_image directory and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello Log4J2 SimpleLogger Modularized Image!  
11:44:26 INFO HelloLog4J2SimpleLoggerModImage This is an information entry  
11:44:26 DEBUG HelloLog4J2SimpleLoggerModImage This is a debugging entry  
11:44:26 WARN HelloLog4J2SimpleLoggerModImage This is a warning entry  
11:44:26 ERROR HelloLog4J2SimpleLoggerModImage This is an error entry
