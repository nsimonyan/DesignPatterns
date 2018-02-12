package designpatterns.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/*
 * concrete mediator 
 * have a list of users in the group and provide logic for the communication between the users.
 */
public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	
	public ChatMediatorImpl(){
		this.users=new ArrayList<>();
	}
	
	@Override
	public void addUser(User user){
		this.users.add(user);
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		//message should not be received by the user sending it
		users.stream()
					.filter(u -> !u.equals(user))
						.forEach(u -> u.receive(msg));
//		for(User u : this.users){
//			if(u != user){
//				u.receive(msg);
//			}
//		}
	}

}