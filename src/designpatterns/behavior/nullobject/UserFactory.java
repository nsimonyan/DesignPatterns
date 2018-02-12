package designpatterns.behavior.nullobject;

public class UserFactory {
	static final String[] users = {"John" , "Sara", "Mike" , "Liza"};
	
	public static AbstractUser getUser(String name) {
		 for (int i = 0; i < users.length; i++) {
	         if (users[i].equalsIgnoreCase(name)){
	            return new RealUser(name);
	         }
	      }
	      return new NullUser();
	}
}
