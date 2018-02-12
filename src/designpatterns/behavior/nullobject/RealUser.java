package designpatterns.behavior.nullobject;

public class RealUser extends AbstractUser{

	public RealUser(String name) {
		this.name = name;		
	}
	   
	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
