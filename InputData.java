import java.util.Scanner;

public class InputData {

	Scanner scanner = new Scanner(System.in);
	private static int selectDayOrNight;
	private static int residentRegistrationNumber;
	private static int numberOfTicket;
	private static int selectPrefer;
	private static int inputSelectNumber;
	
	public int getSelectDayOrNight() {
		return selectDayOrNight;
	}
	public void setSelectDayOrNight() {
		selectDayOrNight = scanner.nextInt();
	}
	public int getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}
	public void setResidentRegistrationNumber() {
		residentRegistrationNumber = scanner.nextInt();
	}
	public int getNumberOfTicket() {
		return numberOfTicket;
	}
	public void setNumberOfTicket() {
		numberOfTicket = scanner.nextInt();
	}
	public int getSelectPrefer() {
		return selectPrefer;
	}
	public void setSelectPrefer() {
		selectPrefer = scanner.nextInt();
	}
	public int getInputSelectNumber() {
		return inputSelectNumber;
	}
	public void setInputSelectNumber() {
		inputSelectNumber = scanner.nextInt();
	}
	
	
}
