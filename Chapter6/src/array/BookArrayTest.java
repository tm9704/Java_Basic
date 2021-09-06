 package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		//Book이 다섯권 생기는건 아님 배열이 생기는 거임
		//한권 한권 new를 해줘야 한다.
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		//주소 출력
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
		
	}

}
