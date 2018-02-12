## Explanation

> To reuse the object that are expensive to create

Basically, an Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. Objects in the pool have a lifecycle: creation, validation and destroy.

A pool helps to manage available resources in a better way. There are many using examples: especially in application servers there are data source pools, thread pools etc.


## Advantage
It boosts the performance of the application significantly.
It is most effective in a situation where the rate of initializing a class instance is high.
It manages the connections and provides a way to reuse and share them.
It can also provide the limit for the maximum number of objects that can be created.

## Usage

* When an application requires objects which are expensive to create. Eg: there is a need of opening too many connections for the database then it takes too longer to create a new one and the database server will be overloaded.
* When there are several clients who need the same resource at different times.

## Main parts

Client : This is the class that uses an object of the PooledObject type.
ReuseablePool: The PooledObject class is the type that is expensive or slow to instantiate, or that has limited availability, so is to be held in the object pool.
ObjectPool : The Pool class is the most important class in the object pool design pattern. ObjectPool maintains a list of available objects and a collection of objects that have already been requested from the pool.
