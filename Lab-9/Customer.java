public class Customer
{
    public int arrivalTime;
    public int transactionTime;
    public int customerNumber;

    // constructor
    public Customer(int arrivalTime, int transactionTime, int customerNumber)
    {
        this.arrivalTime = arrivalTime;
        this.transactionTime = transactionTime;
        this.customerNumber = customerNumber;
    }

    public int getArrivalTime()
    {
        return arrivalTime;
    }

    public int getTransactionTime()
    {
        return transactionTime;
    }

    public int getCustomerNumber()
    {
        return customerNumber;
    }
}