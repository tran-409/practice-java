package pizzaOrder;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	Map<Integer, PizzaOrder> pizzaInput = new HashMap<>();
	Map<Integer, Customer> custInput = new HashMap<>();
	
	public int placeOrder(Customer customer, PizzaOrder pizza) {
		
		custInput.put(customer.getCustomerId(), customer);
		pizzaInput.put(pizza.getOrderID(), pizza);
		
		return 0;
	}
	
	public PizzaOrder getOrderDetails(int orderID) {
		
		System.out.println("Your order details");
		System.out.println("Order ID: " + pizzaInput.get(orderID).getOrderID());
		System.out.println("Order: " + pizzaInput.get(orderID).getOrderTopping());
		System.out.println("Customer ID: " + pizzaInput.get(orderID).getCustomerId());
		System.out.println("Price : $ " + pizzaInput.get(orderID).getTotalPrice());
		
		
		return null;
		
	}
	
}
