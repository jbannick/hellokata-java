This modularized app uses a single non-modularized library, which consists of three JAR files.

That library is the Jackson JSON library, here used to derive JSON from class instances.

To build and run this app:

- You must have Java 9 or greater installed
- You must have jackson-core.2.9.0.jar at JSON_HOME
- You must have jackson-annotations.2.9.0.jar at JSON_HOME
- You must have jackson-databind.2.9.0.jar at JSON_HOME

Download these Jars from:  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/annotations/jackson-annotations/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/databind/jackson-databind/2.9.0/  

Note: The databind JAR is treated here as an Automatic Module. The other two JARs are classpathed and considered the Unnamed Module.

WARNING: Jackson's databind for versions later than 2.9.0 DOES NOT WORK here.
Specifically, Java can not find the jackson.databind module.

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello Modules Using a Non-Modularized Library 2!    
{"name":"Field01","subfields":[{"name":"FieldA"},{"name":"FieldB"}]} 

To deploy this app:

- You must have Java 9 or greater installed on the destination computer

1. Copy the mods, lib, and out directories and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello Modules Using a Non-Modularized Library 2!   
{"name":"Field01","subfields":[{"name":"FieldA"},{"name":"FieldB"}]}
