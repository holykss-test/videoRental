package step1

class ConsoleStatement {
    fun getStatement(customer: Customer): String {
        return header(customer) + body(customer) + tail(customer)
    }

    private fun header(customer: Customer) = customer.header

    private fun body(customer: Customer) = customer.figures

    private fun tail(customer: Customer) = customer.tail
}
