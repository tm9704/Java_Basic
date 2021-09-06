package ch03;

public class MakeReport {
	//캡슐화 
	StringBuffer buffer = new StringBuffer();
	
	private String line = "====================================\n";
	private String title = "  이름\t    주소 \t\t. 전화번호  \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		
	}
	
	private void generateFooter() {
		
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		generateFooter();
		return buffer.toString();
	}
}
