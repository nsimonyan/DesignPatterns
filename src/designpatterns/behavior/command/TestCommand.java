package designpatterns.behavior.command;

public class TestCommand {

	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		//creating command and associating with receiver . 
		//Encapsulate a request under an object as a command
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		//Creating invoker and associating with Command
		/*
		 * pass openFileCommand it to invoker object. 
		 * Invoker object looks for the appropriate object which can handle this command
		 * and pass the command to the corresponding object and 
		 * that object executes the command
		 */
		FileInvoker file = new FileInvoker(openFileCommand);
		
		//perform action on invoker object
		file.execute();
				
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}
}
