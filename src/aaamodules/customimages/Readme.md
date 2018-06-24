Custom runtime images must be totally modularized.  
These Kata show how to build custom runtime images including an image that, 
- Is a HelloWorld app
- Runs on Linux, Windows, or MacOS
- Calls a library we build
- Calls a multi-versioned library we build that includes code for Java 7, 9, and 10, and runs on linux, Windows, or MacOS
- Calls a simple third-party library that is HACKED to make it modularized
- Calls the Jackson JSON library that is similarly HACKED
- Calls the Apache CSV library that is similarly HACKED
- Calls the modularized Apache Log4J library SimpleLogger
- Calls 4 libraries, including Log4J2
