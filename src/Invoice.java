import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Invoice {

    int no;
    String dateCreated;
    private ArrayList<Item> items;
    double totalAmount;
    Product newProduct;
    int quantity;

    Invoice(int no, String dateCreated, Product newProduct, int quantity){
        this.no = no;
        this.dateCreated = dateCreated;
        this.items = new ArrayList<Item>();
        this.items.add(new Item(newProduct.name,quantity));
        this.totalAmount= getTotalAmount(items);
        this.quantity = quantity;
    }


    //adds all items to get the total amount for each invoice
    static double getTotalAmount(ArrayList<Item> items){
        double tempAmounts = 0d;
        for(Item item : items){
            tempAmounts += item.amount;
        }
        
        return tempAmounts;
    }



    
    
    
}



