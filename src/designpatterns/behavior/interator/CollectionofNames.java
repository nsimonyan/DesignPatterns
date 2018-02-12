package designpatterns.behavior.interator;

public class CollectionofNames implements Container {  
public String names[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};   
      
@Override  
    public Iterator getIterator() {  
        return new ConcreteIterator(names) ;  
    }   
}  
