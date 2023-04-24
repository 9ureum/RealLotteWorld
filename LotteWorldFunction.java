import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LotteWorldFunction {
	private InputData inputdata = null;
	private static int man_age;
	private static int ticketPrice;
	private static int payment;
	private static int sumTicketCost = 0;
	private static int sumTicketCount = 0;


	public LotteWorldFunction() {
		inputdata = new InputData();
	}

	public void residentRegistration() {

		int currentTime = 0;
		int residentRegistrationNumber = inputdata.getResidentRegistrationNumber();
		int man_age_cal = 0;
		String man_age_string;
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formatedNow = now.format(formatter);
		currentTime = Integer.parseInt(formatedNow);
		man_age_cal = currentTime - residentRegistrationNumber;
		man_age_string = Integer.toString(man_age_cal);
		man_age = Integer.parseInt(man_age_string.substring(0, 2));
		System.out.printf("만나이는 %d세 입니다.\n", man_age);


	}


	public void preferFunction() {

		int selectDayOrNight = inputdata.getSelectDayOrNight();
		int selectPrefer = inputdata.getSelectPrefer(); 

		if (selectPrefer == 1) {
			if (selectDayOrNight == 1) {
				if ( man_age == 0) {
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_REALBABY;
				} else if (man_age >= 1 && man_age <= 3){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_BABY;
				} else if (man_age > 3 && man_age <=12 || man_age >= 65){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_CHILD_AND_OLDMAN;
				} else if (man_age >= 13 && man_age <= 18){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_YOUTH;
				} else {
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_ADULT;
				}
			} else {
				if ( man_age == 0) {
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_REALBABY;
				} else if (man_age >= 1 && man_age <= 3){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_BABY;
				} else if (man_age > 3 && man_age <=12 || man_age >= 65){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_CHILD_AND_OLDMAN;
				} else if (man_age >= 13 && man_age <= 18){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_YOUTH;
				} else {
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_ADULT;
				}
			}

		} else if (selectPrefer == 2 || selectPrefer == 3) {
			if (selectDayOrNight == 1) {
				if ( man_age == 0) {
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_REALBABY;
				} else if (man_age >= 1 && man_age <= 3){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_BABY;
				} else if (man_age > 3 && man_age <=12 || man_age >= 65){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_DISABLED_CHILD;
				} else if (man_age >= 13 && man_age <= 18){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_DISABLED_YOUTH;
				} else {
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_DISABLED_ADULT;
				}
			} else {
				if ( man_age == 0) {
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_REALBABY;
				} else if (man_age >= 1 && man_age <= 3){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_BABY;
				} else if (man_age > 3 && man_age <=12 || man_age >= 65){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_DISABLED_CHILD;
				} else if (man_age >= 13 && man_age <= 18){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_DISABLED_YOUTH;
				} else {
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_DISABLED_ADULT;
				}
			}
		} else if (selectPrefer == 4) {
			if (selectDayOrNight == 1) {
				if ( man_age == 0) {
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_REALBABY;
				} else if (man_age >= 1 && man_age <= 3){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_BABY;
				} else if (man_age > 3 && man_age <=12 || man_age >= 65){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_MUTI_CHILD_CHILD;
				} else if (man_age >= 13 && man_age <= 18){
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_MUTI_CHILD_YOUTH;
				} else {
					ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_MUTI_CHILD_ADULT;
				}
			} else {
				if ( man_age == 0) {
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_REALBABY;
				} else if (man_age >= 1 && man_age <= 3){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_BABY;
				} else if (man_age > 3 && man_age <=12 || man_age >= 65){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_MUTI_CHILD_CHILD;
				} else if (man_age >= 13 && man_age <= 18){
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_MUTI_CHILD_YOUTH;
				} else {
					ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_MUTI_CHILD_ADULT;
				}
			}
		} else if (selectPrefer == 5) {
			if (selectDayOrNight == 1) {
				ticketPrice = ConstValueClass.ALLDAY_TICKET_PRICE_PREGNANT_WOMAN;
			} else {
				ticketPrice = ConstValueClass.NIGHT_TICKET_PRICE_PREGNANT_WOMAN;
			} 
		} else {

		}


	}
	public int getSumTicketCost() {
		return sumTicketCost;
	}

	public void setSumTicketCost() {
		LotteWorldFunction.sumTicketCost += payment;
	}

	public int getSumTicketCount() {
		return sumTicketCount;
	}

	public void setSumTicketCount() {
		LotteWorldFunction.sumTicketCount += inputdata.getNumberOfTicket();
	}
	public void finPrice() {
		payment = ticketPrice * inputdata.getNumberOfTicket();
	}



	public int getMan_age() {
		return man_age;
	}


	public int getTicketPrice() {
		return ticketPrice;
	}


	public int getPayment() {
		return payment;
	}




}

