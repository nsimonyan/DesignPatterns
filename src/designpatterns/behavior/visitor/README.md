## Explanation

> Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.

For example, think of a Shopping cart where we can add different type of items (Elements). When we click on checkout button, it calculates the total amount to be paid. Now we can have the calculation logic in item classes or we can move out this logic to another class using visitor pattern. 

Shopping in the supermarket is another common example, where the shopping cart is your set of elements. When you get to the checkout, the cashier acts as a visitor, taking the disparate set of elements (your shopping), some with prices and others that need to be weighed, in order to provide you with a total. 

## Advantage

If the logic of operation changes, then we need to make change only in the visitor implementation rather than doing it in all the item classes.
Adding a new item to the system is easy, it will require change only in visitor interface and implementation and existing item classes will not be affected.

## Disadvantage 

We should know the return type of visit() methods at the time of designing otherwise we will have to change the interface and all of its implementations.
If there are too many implementations of visitor interface, it makes it hard to extend.

## Usage

* when an object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes

## Main part
a method called Visit() which is implemented by the visitor and is called for every element in the data structure
visitable classes providing Accept() methods that accept a visitor

Client : The Client class is a consumer of the classes of the visitor design pattern. It has access to the data structure objects and can instruct them to accept a Visitor to perform the appropriate processing.
Visitor : This is an interface or an abstract class used to declare the visit operations for all the types of visitable classes.
ConcreteVisitor : For each type of visitor all the visit methods, declared in abstract visitor, must be implemented. Each Visitor will be responsible for different operations.
Visitable : is an interface which declares the accept operation. This is the entry point which enables an object to be “visited” by the visitor object.
ConcreteVisitable : Those classes implements the Visitable interface or class and defines the accept operation. The visitor object is passed to this object using the accept operation.

## Real world examples

* [javax.lang.model.element.AnnotationValue](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValue.html) and [AnnotationValueVisitor](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValueVisitor.html)
* [javax.lang.model.element.Element](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/Element.html) and [Element Visitor](http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/ElementVisitor.html)


## Useful link
* [Visitor vs composite](https://stackoverflow.com/questions/11239983/difference-between-visitor-and-composite-pattern)
