# Simple SLF4J WebLogic binding

This is a simple SLF4J binder for WebLogic server (tested with WebLogic 10.3).

## Installation

This project has a dependency on WebLogic client, locate your `wlclient.jar` and import it into maven:

    $ mvn install:install-file -DgroupId=weblogic -DartifactId=wlclient -Dversion=10.3 -Dpackaging=jar -DgeneratePom=true -Dfile=wlclient.jar

Download `slf4j-weblogic` and compile it:

    $ git clone https://github.com/MicroWorld/slf4j-weblogic.git
    $ cd slf4j-weblogic
    $ mvn install

## Use it

Add the dependency to your maven `pom.xml` file:

    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-weblogic</artifactId>
      <version>1.7.7</version>
      <scope>runtime</scope>
    </dependency>

## License

Apache License Version 2.0.

## Note

Logging into Weblogic console can also be done with some configuration in Weblogic, see [Using SLF4J with WebLogic Server Logging](http://buttso.blogspot.fr/2011/06/using-slf4j-with-weblogic-server.html).
