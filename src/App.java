public class App {



    public static void main(String[] args) throws Exception {


   
        Customer customer = Customer.CUSTOMERS.get(0);
        System.out.println(customer.toString());
        customer.addToCard(Product.PRODUCTS.get(0), 2);
        customer.addToCard(Product.PRODUCTS.get(1),3);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");


        Customer customer2 = Customer.CUSTOMERS.get(1);
        System.out.println(customer2.toString());
        customer2.addToCard(Product.PRODUCTS.get(2), 2);
        customer2.addToCard(Product.PRODUCTS.get(1), 10);
    }
}
