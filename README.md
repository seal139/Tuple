# Description
A tuple is an object which is contains multiple value(of any type).
All of the tuple implementation in this libraries are inherited directly from base class named Tuple<K>. 

In this libary, the first object index in the tuple are called K or key which is the base data for comparation purpose.
if K in the generic parameter are instance of Comparable interface, we will use the default compare function of object K. Otherwise, we will use the HashCode for comparation.
Please note that data contained in a tuple are immutable.

# Add Dependency
 
1. Maven
```
  <dependency>
    <groupId>io.github.seal139</groupId>
    <artifactId>tuple</artifactId>
    <version>1.0.1</version>
  </dependency>
 ```
2. Gradle
 ```
 dependencies {
  compile group: 'io.github.seal139', name: 'tuple', version: '1.0.1'
}
 ```
3. Jar Direct Download
 ```
  https://repo.maven.apache.org/maven2/io/github/seal139/tuple/1.0.1/tuple-1.0.1-sources.jar
 ```
 
  
# Code Snippet
 
  ```
  package test;

  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.List;

  import io.github.seal139.Triple;
  
  public class Test {
    public static void main(String... args) {
        List<Triple<String, Integer, Integer>> triples = new ArrayList<Triple<String, Integer, Integer>>();
        triples.add(new Triple<String, Integer, Integer>("Foo", 22, 2000));
        triples.add(new Triple<String, Integer, Integer>("Bar", 16, 2005));
        triples.add(new Triple<String, Integer, Integer>("test", 10, 2012));

        Collections.sort(triples);

        for (Triple<String, Integer, Integer> t : triples) {
            String v1 = t.getK();
            String v2 = t.getA().toString();
            String v3 = t.getB().toString();

            System.out.println(v1 + ": " + v2 + "-" + v3);
        }
    }
}
```
  
  output:
  ```
  Bar: 16-2005
  Foo: 22-2000
  test: 10-2012
```
