This app uses an XML Log4J2 configuration file that is NOT named log4j2.xml.

Normally this would cause Log4J2 to complain and then display only ERROR messages.

However, when we pass in the JVM command line option -Dlog4j.configurationFile=log4j2alt.xml, Log4J2 uses the specified file when initializing.

The app displays your INFO, DEBUG, WARN, and ERROR messages to the console.
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
Hello Log4J2 Config System Property!  
log4j.configurationFile=/Users/johnbannick/IdeaProjects/HelloLog4J2ConfigSysProp/src/log4j2alt.xml  
11:17:16.655 [main] INFO  HelloLog4J2ConfigSysProp - This is an info entry  
11:17:16.670 [main] DEBUG HelloLog4J2ConfigSysProp - This is a debug entry  
11:17:16.671 [main] WARN  HelloLog4J2ConfigSysProp - This is a warn entry  
11:17:16.671 [main] ERROR HelloLog4J2ConfigSysProp - This is an error entry
A file named hellolog4j2.log containing the same entries should be written to your ./logs directory.  
Note that, by default, Log4J2 appends to existing log files.
