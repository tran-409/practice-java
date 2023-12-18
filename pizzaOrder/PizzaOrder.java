package pizzaOrder;

public class PizzaOrder {
	
	private int orderID;
	private String orderTopping;
	private int customerId;
	private double totalPrice;
	
	PizzaOrder(int orderID, String orderInfo, int customerId, double totalPrice){
		this.orderID = orderID;
		this.orderTopping = orderInfo;
		this.customerId = customerId;
		this.totalPrice = totalPrice;
	}
	
	
	public String getOrderTopping() {
		return orderTopping;
	}

	public void setOrderTopping(String orderTopping) {
		this.orderTopping = orderTopping;
	}


	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
