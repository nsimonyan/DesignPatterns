package designpatterns.behavior.mediator;

public class TestMediator {


	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "July");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Adam");
		User user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		
	}
}
