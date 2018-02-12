package designpatterns.behavior.memento;

//caretaker
public class FileWriterCaretaker {

	private Object memento;
	
	public void save(FileWriterUtil fileWriter){
		this.memento=fileWriter.save();
	}
	
	public void undo(FileWriterUtil fileWriter){
		fileWriter.undoToLastSave(memento);
	}
}
