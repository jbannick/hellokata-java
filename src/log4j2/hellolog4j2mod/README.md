This modularized app uses the Log4J2 library for event logging.

That library is itself modularized library, and consists of two JAR files.

To build and run this app:

- You must have Java JDK 9 or greater installed
- You must have log4j-core.2.11.0.jar at LOG4J2_HOME
- You must have log4j-api.2.11.0.jar at LOG4J2_HOME

Download these Jars from:  
http://central.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.11.0/  
http://central.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.11.0/  

WARNING: Log4J2's modularization for version 2.10.0 DOES NOT WORK here.  
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

Hello Log4J2 Modularized!  
05:05:10.796 [main] INFO  kata.app.HelloLog4J2Mod - This is an information entry  
05:05:10.800 [main] DEBUG kata.app.HelloLog4J2Mod - This is a debugging entry  
05:05:10.800 [main] WARN  kata.app.HelloLog4J2Mod - This is a warning entry  
05:05:10.800 [main] ERROR kata.app.HelloLog4J2Mod - This is an error entry  

A file named hellolog4j2.log should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.

Note that the Log4J2 configuration is defined in the log4j2.xml file,
which is located within the app module.

To deploy this app:

- You must have Java JRE at or later than the release you used to build this installed on the destination computer

1. Copy the mods and out directories and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello Log4J2 Modularized!  
05:05:10.796 [main] INFO  kata.app.HelloLog4J2Mod - This is an information entry  
05:05:10.800 [main] DEBUG kata.app.HelloLog4J2Mod - This is a debugging entry  
05:05:10.800 [main] WARN  kata.app.HelloLog4J2Mod - This is a warning entry  
05:05:10.800 [main] ERROR kata.app.HelloLog4J2Mod - This is an error entry  

A file named hellolog4j2.log should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.
