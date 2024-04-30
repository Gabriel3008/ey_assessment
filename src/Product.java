import java.util.ArrayList;

public class Product
{


    String name;
    int modelNo;
    String description;
    double price;



    public Product(String name,
        int modelNo,
        String description,
        double price) {
            this.name = name;
            this.modelNo = modelNo;
            this.price = price;
            this.description = description;
        }

        
    //Temporary  list of products used for testing purposes. 
    final public static ArrayList<Product> PRODUCTS = new ArrayList<Product>(){
        {
        add(new Product(GrillNames.GRILL1, 0, "This is a description for Big Green Egg", 1000));
        add(new Product(GrillNames.GRILL2, 1, "This is a description for Char-Griller Akorn", 1500));
        add(new Product(GrillNames.GRILL3, 2, "This is a description for Kamado Joe Classic", 2000));
        }
    };

}
