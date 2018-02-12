package designpatterns.behavior.interator;

public class ConcreteIterator implements Iterator{  
    int i;  
    String names[];
    public ConcreteIterator(String[] names) {
		this.names = names;
	}
    private ConcreteIterator() { }
    
	@Override  
    public boolean hasNext() {  
        if (i<names.length){  
            return true;  
        }  
        return false;  
    }  
    @Override  
    public Object next() {  
        if(this.hasNext()){  
            return names[i++];  
        }  
        return null;      
    }  
} 