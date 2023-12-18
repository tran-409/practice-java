package pizzaOrder;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HMap m = new HMap();
		
	while(true) {
			System.out.println("1) Place Order");
			System.out.println("2) Display Order");
			System.out.println("3) Exit");
			
			int option = scan.nextInt();
			scan.nextLine();
			
			if(option == 1) {
				
				Random ranNum = new Random();
				int orderId = ranNum.nextInt(1000);
				int custId = ranNum.nextInt(1000);
				double price = 350;
				
			System.out.println("Enter name of the customer: ");
			String name = scan.nextLine();
			System.out.println("Enter customer address: ");
			String address = scan.nextLine();
			System.out.println("Enter customer phone number: ");
			String phoneNumber = scan.nextLine();
			
			System.out.println("Type of pizza topping preferred: (Capsicum, Mushroom, Jalapeno, Paneer");
			String topping = scan.nextLine();
			
			if(topping.equalsIgnoreCase("Pepperoni")){
				price = price + 30;
			} 
			else if(topping.equalsIgnoreCase("Mushroom")) {
				price = price + 50;
			}
			else if(topping.equalsIgnoreCase("Jalapeno")) {
				price = price + 70;
			}
			else if(topping.equalsIgnoreCase("Sausage")) {
				price = price + 85;
			}
			else {
				System.out.println("Only these topping is allowed: /n"
						+ "Please start over!");
				System.exit(0);
			}
			
			if(phoneNumber.length() == 10) {
				LocalDate date = LocalDate.now();
			System.out.println("Price: $" + price + " [ Date: " + date + " ]");
			
			Customer cust = new Customer(custId, name, address, phoneNumber);
			PizzaOrder piz = new PizzaOrder(orderId,topping, custId, price);
			
			m.placeOrder(cust, piz);
			System.out.println("Pizza order successfully placed with order ID: " + orderId);
			System.out.println();
			}
			else {
				System.out.println("Enter valid phone number: /n"
						+ "Exiting....");
				System.exit(0);
			}
			}
			
			else if(option == 2) {
				System.out.println("Enter your Order ID: ");
				int orderid = scan.nextInt();
				m.getOrderDetails(orderid);
			}
			
			else if(option == 3) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
		}
	}
}
