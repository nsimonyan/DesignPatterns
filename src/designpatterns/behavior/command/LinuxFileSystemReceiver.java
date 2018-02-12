package designpatterns.behavior.command;

public class LinuxFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in Linux OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Linux OS");
	}

}