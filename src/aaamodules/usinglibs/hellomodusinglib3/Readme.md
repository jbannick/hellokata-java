This modularized app uses the Log4J2 library for event logging.

The library consists of a single JAR file and is itself fully modularized.  
It is a versioned JAR, versioned to include Java 9.

Because we use only the log4j-api.2.11.0.jar, and not also the log4j-core.2.11.0.jar, 
we are limited to Log4J2's SimpleLogger.

The app is deployed in a JAR file.  

To build and run this app:

- You must have the Java JDK 9 or greater installed
- You must have log4j-api.2.11.0.jar at LOG4J2_HOME

Download this JAR from:  
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

Hello Modularized Using Library 3!  
05:15:46.254 INFO HelloModUsingLib3 This is an information entry  
05:15:46.285 DEBUG HelloModUsingLib3 This is a debugging entry  
05:15:46.285 WARN HelloModUsingLib3 This is a warning entry  
05:15:46.285 ERROR HelloModUsingLib3 This is an error entry  

To deploy this app:

- You must have the Java JRE at or later than the release you used to build this installed on the destination computer
1. Copy the appmod.jar, log4j-api.2.11.0.jar, and run.sh file to the destination computer and directory
2. At the command line, cd to that location
3. At the command line, execute: run.sh

The console should display as above.


