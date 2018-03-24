This app uses SLF4J and its Log4j (ONE) binding for logging.

It displays your INFO, WARN, and ERROR messages to the console.
By default, SLF4J does not display your DEBUG messages.

To build and run this app:

- You must have Java installed  
- You must have slf4j-api-1.8.0-beta2.jar    at SLF4J_HOME  
- You must have slf4j-simple-1.8.0-beta2.jar at SLF4J_HOME  
- you must have log4j-core-2.10.0.jar        at LOG4J_HOME  
- you must have log4j-api-2.10.0.jar         at LOG4J_HOME  
- You must have log4j-slf4j-impl-2.10.0.jar  at LOG4J_HOME

Download slf4j from: https://www.slf4j.org/download.html  
Download Log4J2 from: https://logging.apache.org/log4j/2.x/download.html

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

5. At the command line, execute: run.sh

The console should display:

Hello SLF4J Log4J2!  
14:29:59.057 [main] HelloSLF4JLog4J2.java:9 - This is an info message  
14:29:59.062 [main] HelloSLF4JLog4J2.java:10 - This is a debug message  
+++14:29:59.062 [main] HelloSLF4JLog4J2.java:11 - This is a warning message  
***14:29:59.063 [main] HelloSLF4JLog4J2.java:12 - This is an error message  
 

A file named helloslf4jlog4j2.log containing the same entries should be written to your ./logs directory.
Note that, by default, Log4J2 appends to existing log files.
