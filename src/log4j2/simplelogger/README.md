These Kata are for Log4J2's SimpleLogger class.

SimpleLogger is "...the default logger that is used when no suitable logging implementation is available." Apache.

It requires only the log4j-api-2.nn.nn.jar file, which is fully modularized.  
This enables apps using SimpleLogger, as opposed to the Log4J standard logger, to be made into a Custom Runtime Image.
(The standard logger also requires log4j-core-2.nn.nn.jar, which is not modularized.)

Java Custom Runtime Images carry their own app-specific subset of the Java Runtime Environment.

The value added by Custom Images is that:
1. The target computer does not require Java to be installed
2. You can use the same code to create Custom Images for different operating systems, MacOS, Windows, Linux.

Custom images must be built using Java 9 or greater.

Similar to the standard logger, SimpleLogger lets your app:
- Use all verbosities: INFO, DEBUG, WARN, ERROR
- Include the timestamp in the output
- Control the timestamp format
- Include the message origin classname in the output
- Output to stdout, stderr, or a file

It does not enable the standard logger's:
- Additional information the app can include in its logging output: thread, filename, line numbers, etc.
- More powerful output formatting
- Use of alternate configuration file formats: XML, JSON, etc.
- Many additional and powerful features
