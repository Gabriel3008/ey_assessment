import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Customer{

int accountNo;
String fullName;
String address;
int phone;
double accountBalance;
ArrayList<Invoice> invoices;
ArrayList<Product> productsPurchased;

public Customer(int accountNo,
String fullName,
 String address,
  int phone) {
    this.accountNo = accountNo;
    this.fullName = fullName;
    this.address = address;
    this.phone = phone;
    this.invoices = new ArrayList<Invoice>();
    this.accountBalance = getAccountBalance(invoices);
    this.productsPurchased = new ArrayList<Product>();
   }

    

    //Generates a new invoice based on the product purchased and the quantity
    public void addToCard(Product product, int quantity){
        addInvoiceUpdateBalance(new Invoice(this.accountNo, new Date().toString(), product, quantity));
    }

    //adds the new invoice in the list of invoices, updates the account balance and prints the new balance
    private void addInvoiceUpdateBalance(Invoice newInvoice){
        this.invoices.add(newInvoice);
        this.accountBalance = getAccountBalance(this.invoices); 
        System.out.println("Updated Balance: " + String.valueOf(this.accountBalance));
    }

    //add all the invoice amounts to calculate the total account balance
    private double getAccountBalance(ArrayList<Invoice> invoices)
    {
        double tempAccountBalance =0;
        for(int i=0; i<invoices.size(); i++)
        {
            tempAccountBalance += invoices.get(i).totalAmount;
        }
        return tempAccountBalance;
    }


    public String toString(){
        return "accountNo: " + this.accountNo + 
        "\nfullName: " + this.fullName +
         "\naddress:" + this.address+ 
        "\nphone: " + this.phone;
    }

    //Temporary list of random customers used for testing purposes
    final public static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>(){
        {
        add(new Customer(modCount, "John Doe", "Nicosia", 99111111));
        add(new Customer(modCount, "Jane Doe", "Limassol", 99222222));
        add(new Customer(modCount, "Gabriel Wheeler", "Larnaca", 99333333));
        }
    };
    
}
