package sorting;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] num) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] num) {
		System.out.println("HeapSort ascending");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort 입니다.");
	}
	
}
