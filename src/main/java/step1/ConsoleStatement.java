package step1;

public class ConsoleStatement {

	public String statement(Customer customer) {
		return  statementHeader(customer) 
				+ showFigures(customer) 
				+ statementTail(customer);
	}

	private String statementTail(Customer customer) {
		String result = "Amount owed is " + customer.getTotalAmount() + "\n";
		result += "You earned " + customer.getFrequentRenterPoints() + " frequent renter pointers";
		return result;
	}

	private String showFigures(Customer customer) {
		String result = "";
		for ( Rental rental : customer.getRentals() ) {
			result += "\t" +  String.valueOf(rental.getPrice()) + "(" + rental.getMovie().getTitle() + ")" + "\n";
		}
		return result;
	}

	private String statementHeader(Customer customer) {
		return "Rental Record for " + customer.getName() + "\n";
	}

}
