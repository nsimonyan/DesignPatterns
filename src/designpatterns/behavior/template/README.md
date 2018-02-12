## Explanation

> Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.

Template Method design pattern is used to create a method stub and deferring some of the steps of implementation to the subclasses.

The template method is used in frameworks, where each implements the invariant parts of a domain’s architecture, leaving “placeholders” for customization options.

Most of the times, subclasses calls methods from super class but in template pattern, superclass template method calls methods from subclasses, this is known as Hollywood Principle – “don’t call us, we’ll call you.”.

## Usage
* Let subclasses implement varying behavior (through method overriding)
* Avoid duplication in the code , the general workflow structure is implemented once in the abstract class’s algorithm, and necessary variations are implemented in the subclasses.
* Control at what points subclassing is allowed. As opposed to a simple polymorphic override, where the base method would be entirely rewritten allowing radical change to the workflow, only the specific details of the workflow are allowed to change.

## Main parts

AbstractClass contains the templateMethod() which should be made final so that it cannot be overridden. This template method makes use of other operations available in order to run the algorithm but is decoupled for the actual implementation of these methods. All operations used by this template method are made abstract, so their implementation is deferred to subclasses.
ConcreteClass implements all the operations required by the templateMethod that were defined as abstract in the parent class. There can be many different ConcreteClasses.

## Real word example
All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
