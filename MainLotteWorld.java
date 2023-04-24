public class MainLotteWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputData inputdata = new InputData();
		Output output = new Output();
		LotteWorldFunction lwf = new LotteWorldFunction();
		do {
		output.ticketOut();
		output.registrationOut();
		lwf.residentRegistration();
		output.numberOfTicketOut();
		output.preferOut();
		lwf.preferFunction();
		lwf.finPrice();
		lwf.setSumTicketCost();
		lwf.setSumTicketCount();
		output.finPriceOut();
		output.continueOut();
		} while(inputdata.getInputSelectNumber() == 1);
		
		output.sumTicketPrice();
				
	}

}
