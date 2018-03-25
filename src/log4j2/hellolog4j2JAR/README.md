This app includes Log4J2 and deploys and executes from a single JAR file.

The contents of the two required Log4J2 JAR files are extracted and copied into the target HelloLog4J2JAR.jar file.

To build and run this app:

- You must have Java installed
- You must have log4j-core-2.10.0.jar at LOG4J2_HOME
- You must have log4j-api-2.10.0.jar  at LOG4J2_HOME

Download Log4J2 from: https://logging.apache.org/log4j/2.x/download.html

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello Log4J2 JAR!  
16:07:05.809 [main] foo.HelloLog4J2JAR - This is an info entry  
16:07:05.843 [main] foo.HelloLog4J2JAR - This is a debug entry  
+++16:07:05.843 [main] foo.HelloLog4J2JAR - This is a warn entry  
***16:07:05.844 [main] foo.HelloLog4J2JAR - This is an error entry  
16:07:05.845 [main] foo.bar.Bar - Instantiated

A file named hellolog4j2.log should be written to your ./logs directory.
Note that, by default, Log4J2 appends to existing log files.
