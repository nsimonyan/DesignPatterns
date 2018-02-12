package designpatterns.structural.proxy;

public class TestProxy {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Naira", "@Test$nA");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
