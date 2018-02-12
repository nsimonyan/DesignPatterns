## Explanation

> Avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request

In other words in chain of responsibility, sender sends a request to a chain of objects. The request can be handled by any object in the chain.

For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

Other example. Let’s see the example of chain of responsibility pattern in JDK . We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind of a processor to process that particular exception. So when any exception occurs in the try block, its send to the first catch block to process. If the catch block is not able to process it, it forwards the request to next object in chain i.e next catch block. If even the last catch block is not able to process it, the exception is thrown outside of the chain to the calling program.

## Advantage

It reduces the coupling.
It adds flexibility while assigning the responsibilities to objects.
It allows a set of classes to act as one; events produced in one class can be sent to other handler classes with the help of composition.

## Usage

* When more than one object can handle a request and the handler is unknown.
* When the group of objects that can handle the request must be specified in dynamic way.

## Real world examples

* [java.util.logging.Logger#log()](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log%28java.util.logging.Level,%20java.lang.String%29)
* [Apache Commons Chain](https://commons.apache.org/proper/commons-chain/index.html)
* [javax.servlet.Filter#doFilter()](http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-)
