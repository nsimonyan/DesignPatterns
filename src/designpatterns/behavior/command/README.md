##Explanation

> Encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

It is also known as Action or Transaction.

One example of the command pattern being executed in the real world is the idea of a table order at a restaurant: the waiter takes the order, which is a command from the customer.This order is then queued for the kitchen staff.  The waiter tells the chef that the a new order has come in, and the chef has enough information to cook the meal.

#Advantage 

It separates the object that invokes the operation from the object that actually performs the operation.
It makes easy to add new commands, because existing classes remain unchanged.

##Usage

* When you need parameterize objects according to an action perform.
* When you need to create and execute requests at different times.
* When you need to support rollback, logging or transaction functionality.

## Real world examples

* [java.lang.Runnable](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
* [javax.swing.Action](http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html)

