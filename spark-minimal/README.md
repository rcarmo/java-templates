# spark-minimal

This is a minimal project setup for building standalone Java web apps with [Spark][s].

## Crib Sheet:

    xmllint --format pom.xml # reindent POM without hassles
    mvn clean package        # rebuild uberjar
    java -cp target/spark-minimal-1.0-SNAPSHOT-standalone.jar com.taoofmac.java.App

[s]: http://www.sparkjava.com
