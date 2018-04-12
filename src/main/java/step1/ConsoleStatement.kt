package step1

class ConsoleStatement {
    fun getStatement(customer: Customer): String {
        return header(customer) + body(customer) + tail(customer)
    }

    private fun header(customer: Customer) = "Rental Record for ${customer.name}\n"

    private fun body(customer: Customer): String {
        var result = ""
        for (rental in customer.rentals) {
            result += rental.statementResult
        }
        return result
    }

    private fun tail(customer: Customer): String {
        return """Amount owed is ${customer.totalAmount}
You earned ${customer.frequentRenterPoints} frequent renter pointers"""
    }
}
