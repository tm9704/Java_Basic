package hidingex;

public class MyDate {
	private int day, month, year;
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10:
		case 12:
			if(day < 0 || day > 31) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		case 4: case 6: case 9: case 11:
			if(day <0 || day > 30) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		case 2:
			if(day <0 || day > 29) {
				isValid = false;
			}else {
				this.day = day;
			}
			break;
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void dateInfo() {
		if(isValid == false) {
			System.out.println("유효하지 않은 날짜입니다.");
		}else {
			System.out.println("유효한 날짜입니다.");
		}
	}
}
