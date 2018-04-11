This app uses a single non-modularized library, which consists of three JAR files.

That library is the Jackson JSON library, here used to derive JSON from class instances.

To build and run this app:

- You must have a Java JDK installed
- You must have jackson-core.2.9.0.jar at JSON_HOME
- You must have jackson-annotations.2.9.0.jar at JSON_HOME
- You must have jackson-databind.2.9.0.jar at JSON_HOME

Download these Jars from:  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.0/  

WARNING: Jackson's databind for versions later than 2.9.0 would work here. However, it will not work with Java Modules.
Specifically, Java can not find the jackson.databind module.

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:
```
Hello JSON using Jackson!  
{
  "name" : "Hat",
  "count" : 5,
  "discount" : false,
  "notes" : "The Queen likes them"
}
{
  "name" : "Bundle",
  "count" : 1,
  "discount" : false,
  "subfields" : [ {
    "name" : "Coat",
    "count" : 7,
    "discount" : true,
    "notes" : "Out of fashion"
  }, {
    "name" : "Shoes",
    "count" : 8,
    "discount" : false
  } ]
}
```

To deploy this app:

- You must have Java JRE for the release you used for building, or greater, installed on the destination computer

1. Copy the lib, and out directories and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

```
Hello JSON using Jackson!
{
  "name" : "Hat",
  "count" : 5,
  "discount" : false,
  "notes" : "The Queen likes them"
}
{
  "name" : "Bundle",
  "count" : 1,
  "discount" : false,
  "subfields" : [ {
    "name" : "Coat",
    "count" : 7,
    "discount" : true,
    "notes" : "Out of fashion"
  }, {
    "name" : "Shoes",
    "count" : 8,
    "discount" : false
  } ]
}
```
