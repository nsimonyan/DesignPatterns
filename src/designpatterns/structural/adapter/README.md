## Explanation

Real world example

> Converts the interface of a class into another interface that a client wants

Adapter lets classes work together that couldn't otherwise because of
incompatible interfaces.
One of the great real life example of Adapter design pattern is mobile charger. Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter between mobile charging socket and the wall socket.

## Advantage

It allows two or more previously incompatible objects to interact.
It allows re-usability of existing functionality.

## Usage

* When an object needs to utilize an existing class with an incompatible interface.
* When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
* When you want to create a reusable class that cooperates with classes which don't have compatible interface


## Main paths of adapter

1. Target Interface: This is the desired interface class which will be used by the clients.
2. Adapter class: This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.
3. Adaptee class: This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.
4. Client: This class will interact with the Adapter class.

Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
Object Adapter – This form uses Java Composition and adapter contains the source object.

## Real world examples

* [java.util.Arrays#asList()](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList%28T...%29)
* [java.util.Collections#list()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-)
* [java.util.Collections#enumeration()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-)
* [javax.xml.bind.annotation.adapters.XMLAdapter](http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#marshal-BoundType-)
