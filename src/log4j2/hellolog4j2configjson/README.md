This app uses a JSON Log4J2 configuration file.

It displays your INFO, DEBUG, WARN, and ERROR messages to the console.

In order to parse the JSON configuration file, it requires the Jackson JSON parser library.

To build and run this app:

- You must have Java installed
- You must have log4j-core-2.11.0.jar at LOG4J2_HOME
- You must have log4j-api-2.11.0.jar  at LOG4J2_HOME
- You must have jackson-core-2.9.0.jar        at JSON_HOME
- You must have jackson-databind-2.9.0.jar    at JSON_HOME
- You must have jackson-annotations-2.9.0.jar at JSON_HOME

WARNING: Jackson's databind for versions later than 2.9.0 DOES NOT WORK with Java Modules.
Specifically, Java can not find the jackson.databind module.

WARNING: Log4J2 2.10 has a bug that causes a runtime error when used with Java Modules.
Best use 2.11 or later.
Download Log4J2 from: https://logging.apache.org/log4j/2.x/download.html

Download the Jackson JSON parser from:  
http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0  
http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0    
http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.0  

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello Log4J2 Config JSON!  
04:50:56.781 [main] INFO  HelloLog4J2ConfigJSON - This is an info entry  
04:50:56.785 [main] DEBUG HelloLog4J2ConfigJSON - This is a debug entry  
04:50:56.785 [main] WARN  HelloLog4J2ConfigJSON - This is a warn entry  
04:50:56.785 [main] ERROR HelloLog4J2ConfigJSON - This is an error entry  

A file named hellolog4j2.log containing the same entries should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.
