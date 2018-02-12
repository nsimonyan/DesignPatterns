# DesignPatterns-## Design patterns
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design . A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.

## Gang of Four (GOF)

In 1994, four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.

These authors are collectively known as Gang of Four (GOF). According to these authors design patterns are primarily based on the following principles of object orientated design.


## Creational design patterns 

Creational design patterns are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).
These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.

Everyone knows an object is created by using new keyword in java. For example:

UserInfo usrInfo = new UserInfo();  

Hard-Coded code is not the good programming approach. Here, we are creating the instance by using the new keyword. Sometimes, the nature of the object must be changed according to the nature of the program. In such cases, we must get the help of creational design patterns to provide more general and flexible approach.

>Factory Method
Creates an instance of several derived classes

>Abstract Factory
Creates an instance of several families of classes

>Builder
Separates object construction from its representation

>Object Pool
Avoid expensive acquisition and release of resources by recycling objects that are no longer in use

>Prototype
A fully initialized instance to be copied or cloned

>Singleton
A class of which only a single instance can exist



##Structural design patterns

These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality.

Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.

The structural design patterns simplifies the structure by identifying the relationships.

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.


>Adapter
Match interfaces of different classes

>Bridge
Separates an object�s interface from its implementation

>Composite
A tree structure of simple and composite objects

>Decorator
Add responsibilities to objects dynamically

>Facade
A single class that represents an entire subsystem

>Flyweight
A fine-grained instance used for efficient sharing

>Proxy
An object representing another object

## Behavioral design patterns

These design patterns are all about Class's objects communication. Behavioral patterns are those patterns that are most specifically concerned with communication between objects.

In these design patterns,the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.

> Chain of responsibility
A way of passing a request between a chain of objects

>Command
Encapsulate a command request as an object

>Interpreter
A way to include language elements in a program

>Iterator
Sequentially access the elements of a collection

>Mediator
Defines simplified communication between classes

>Memento
Capture and restore an object's internal state

>Null Object
Designed to act as a default value of an object

>Observer
A way of notifying change to a number of classes

>State
Alter an object's behavior when its state changes

>Strategy
Encapsulates an algorithm inside a class

>Template method
Defer the exact steps of an algorithm to a subclass

>Visitor
Defines a new operation to a class without change

## Useful links

* [Monitis slides](https://www.slideshare.net/arsooo/design-patterns-in-java-monitis-2017) 
* [Java T point](https://www.javatpoint.com/design-patterns-in-java)
* [Tutorials point](https://www.tutorialspoint.com/design_pattern)
* [Journal dev](https://www.journaldev.com/1827/java-design-patterns-example-tutorial)
* [Source making](https://sourcemaking.com/design_patterns)
* [Geeks for geeks](https://www.geeksforgeeks.org/software-design-patterns/)
* [Dzon DP] (https://dzone.com/articles/design-patterns-abstract-factory)

## Quiz to pass
