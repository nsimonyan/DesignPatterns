##Explanation

> Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

In State pattern a class behavior changes based on its state. 
State design pattern is one of the behavioral design pattern. State design pattern is used when an Object change its behavior based on its internal state.

If we have to change the behavior of an object based on its state, we can have a state variable in the Object. Then use if-else condition block to perform different actions based on the state. 

## Advantage

With State pattern, the benefits of implementing polymorphic behavior are evident, and it is also easier to add states to support additional behavior.
In the State design pattern, an object’s behavior is the result of the function of its state, and the behavior gets changed at runtime depending on the state. This removes the dependency on the if/else or switch/case conditional logic. For example, in the TV remote scenario, we could have also implemented the behavior by simply writing one class and method that will ask for a parameter and perform an action (switch the TV on/off) with an if/else block.
The State design pattern also improves Cohesion since state-specific behaviors are aggregated into the ConcreteState classes, which are placed in one location in the code.

## Usage

* The State design pattern can be used when we need to change state of object at runtime by inputting in it different subclasses of some State base class. This circumstance is advantage and disadvantage in the same time, because we have a clear separate State classes with some logic and from the other hand the number of classes grows up.

## Main parts

State design pattern is used to provide a systematic and loosely coupled way to achieve this through Context and State implementations.

State Pattern Context is the class that has a State reference to one of the concrete implementations of the State. Context forwards the request to the state object for processing. 

Context: Defines an interface to client to interact. It maintains references to concrete state object which may be used to define current state of object.
State: Defines interface for declaring what each concrete state should do.
ConcreteState: Provides implementation for methods defined in State.

## Real world examples

* [javax.faces.lifecycle.Lifecycle#execute()](http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html#execute-javax.faces.context.FacesContext-) controlled by [FacesServlet](http://docs.oracle.com/javaee/7/api/javax/faces/webapp/FacesServlet.html), the behavior is dependent on current phase of lifecycle.
