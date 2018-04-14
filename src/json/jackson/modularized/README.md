This app uses the Jackson JSON library to derive JSON from class instances.

This app is modularized.

The Jackson JSON library is not modularized.  
It consists of three JAR files.  
Here we make one of those JAR filea an Automatic module.  
We leave the other two JAR files classpathed, or in the Unnamed module.

This is because our app depends on databind, but not on the other two. 
Databind depends on those.   
We could have made all three into Automatic modules.

To build and run this app:

- You must have Java JDK 9 or greater installed
- You must have jackson-core.2.9.0.jar at JSON_HOME
- You must have jackson-annotations.2.9.0.jar at JSON_HOME
- You must have jackson-databind.2.9.0.jar at JSON_HOME

Download these Jars from:  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.0/  

WARNING: Jackson's databind for versions 2.9.1 - 2.9.5 DOES NOT WORK here.
Specifically, Java can not find the jackson.databind module.

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello JSON Jackson Modularized!    
{"name":"Field01","subfields":[{"name":"FieldA"},{"name":"FieldB"}]} 

To deploy this app:

- You must have Java JRE at or later than the release you used to build this installed on the destination computer

1. Copy the mods, lib, and out directories and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello JSON Jackson Modularized!  
{"name":"Field01","subfields":[{"name":"FieldA"},{"name":"FieldB"}]}
