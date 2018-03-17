This app formats its Log4J2 output the way I like.

- ERROR and WARNING entries have easily identifiable prefixes; INFO and DEBUG have none.  
- The timestamp is just time, including milliseconds.
- The thread name is bracketed.  
- The logger string includes the package, truncated to just the useful part.  
- A dash separates the message.

Output to the log file replaces the logger string with the file name and line number.

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

5. At the command line, execute: run.sh

The console should display:

Hello Log4J2 Format!
14:58:22.780 [main] foo.HelloLog4J2Format - This is an info entry
14:58:22.785 [main] foo.HelloLog4J2Format - This is a debug entry
+++14:58:22.786 [main] foo.HelloLog4J2Format - This is a warn entry
***14:58:22.787 [main] foo.HelloLog4J2Format - This is an error entry
14:58:22.788 [main] foo.Foo - Instantiated
14:58:22.789 [main] foo.bar.Bar - Instantiated

A file named hellolog4j2.log containing the same entries should be written to your ./logs directory.
Note that, by default, Log4J2 appends to existing log files.

The log file should include:

15:11:29.989 [main] HelloLog4J2Format.java:11 - This is an info entry
15:11:29.996 [main] HelloLog4J2Format.java:12 - This is a debug entry
+++15:11:29.996 [main] HelloLog4J2Format.java:13 - This is a warn entry
***15:11:29.997 [main] HelloLog4J2Format.java:14 - This is an error entry
15:11:30.013 [main] Foo.java:10 - Instantiated
15:11:30.035 [main] Bar.java:10 - Instantiated
