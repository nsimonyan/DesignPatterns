package designpatterns.behavior.nullobject;

public class NullUser extends AbstractUser{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "The user is not available!";
	}

}
