package designpatterns.behavior.nullobject;

public class TestNullObject {

	  public static void main(String[] args) {

	      AbstractUser user1 = UserFactory.getUser("Liza");
	      AbstractUser user2 = UserFactory.getUser("Mike");
	      AbstractUser user3 = UserFactory.getUser("Julie");

	      System.out.println("Users : ");
	      System.out.println(user1.getName());
	      System.out.println(user2.getName());
	      System.out.println(user3.getName());
	   }
}
