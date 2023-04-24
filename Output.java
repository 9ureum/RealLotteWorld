public class Output {
	InputData inputdata = new InputData();
	LotteWorldFunction lwf = new LotteWorldFunction();
	public void ticketOut() {
		System.out.println("권종을 선택하세요");
		System.out.println("1. 주간권 ");
		System.out.println("2. 야간권 ");
		inputdata.setSelectDayOrNight();
	}

	public void registrationOut() {	
		System.out.println("생년월일 8자리를 입력하세요.(YYYYMMDD)");
		inputdata.setResidentRegistrationNumber();
	}

	public void numberOfTicketOut() {
		System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
		inputdata.setNumberOfTicket();
	}

	public void preferOut() {
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음 (나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		inputdata.setSelectPrefer();
	}
	public void finPriceOut() {
		LotteWorldFunction lwf = new LotteWorldFunction();
		System.out.printf("가격은 %d 원 입니다.\n", lwf.getPayment());
		System.out.println("감사합니다.");

	}
	public void continueOut() {
		System.out.println("계속 발권하시겠습니까?\n");
		System.out.println("1. 티켓 발권\n");
		System.out.println("2. 종료\n");
		inputdata.setInputSelectNumber();
	}
	
	public void sumTicketPrice() {
		System.out.printf("티켓 발권을 종료합니다. 감사합니다.\n");
		System.out.printf("============ 롯데월드 ============\n");
		System.out.printf("\n입장료 총액은 %d 원 입니다.\n",lwf.getSumTicketCost());
		System.out.printf("===============================\n");
	}
}
