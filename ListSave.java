import java.util.ArrayList;
import java.util.List;

public class ListSave {
	
	private static List<OrderList> data = new ArrayList<OrderList>();
		
	
		public void setOrderLists(int idNumber, int age, int prefer, int amount, int cost) {
			OrderList order = new OrderList();
			order.setIdNumber(idNumber);
			order.setAge(age);
			order.setPrefer(prefer);
			order.setAmount(amount);
			order.setCost(cost);
			
			data.add(order);
		}
	

	public  List<OrderList> getData() {
		return data;
	}
	
	
}
