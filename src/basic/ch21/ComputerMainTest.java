package basic.ch21;

public class ComputerMainTest {

	public static void main(String[] args) {

		DeskTop desktop = new DeskTop();
		desktop.turnOn();
		desktop.display();
		desktop.typing();
		desktop.turnOff();
		System.out.println("--------------------");
		MyNoteBook myNoteBook = new MyNoteBook();
		myNoteBook.turnOn();
		myNoteBook.display();
		myNoteBook.typing();
		myNoteBook.turnOff();

	}

}
