## Explanation

> Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.

Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime
Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.


## Advantage

A family of algorithms can be defined as a class hierarchy and can be used interchangeably to alter application behavior without changing its architecture.
By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.
The application can switch strategies at run-time.
Strategy enables the clients to choose the required algorithm, without using a “switch” statement or a series of “if-else” statements.
Data structures used for implementing the algorithm are completely encapsulated in Strategy classes. Therefore, the implementation of an algorithm can be changed without affecting the Context class.

## Disadvantage

The application must be aware of all the strategies to select the right one for the right situation.
Context and the Strategy classes normally communicate through the interface specified by the abstract Strategy base class. Strategy base class must expose interface for all the required behaviours, which some concrete Strategy classes might not implement.
In most cases, the application configures the Context with the required Strategy object. Therefore, the application needs to create and maintain two objects in place of one.
 
 
## Usage

* When many related classes differ only in their behavior. Strategies provide a way to configure a class either one of many behaviors
* when you need different variants of an algorithm. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
* when an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures

## Main part
defines a family of algorithms,
encapsulates each algorithm, and
makes the algorithms interchangeable within that family.


## Useful link
* [Strategy vs visitor](https://stackoverflow.com/questions/8665295/what-is-the-difference-between-strategy-pattern-and-visitor-pattern)
* [Strategy vs state](https://stackoverflow.com/questions/1658192/what-is-the-difference-between-strategy-design-pattern-and-state-design-pattern)

