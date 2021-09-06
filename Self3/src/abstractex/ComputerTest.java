package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer deskTop = new Desktop();
		Computer myNoteBook = new MyNoteBook();
		
		deskTop.display();
		myNoteBook.display();
	}

}
