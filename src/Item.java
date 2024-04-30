public class Item{

    String productName;
    int quantity;
    double amount;
    
    public Item(
        String productName, int quantity)
        {
            this.productName = productName;
            this.quantity =  quantity;
            this.amount = getTotalAmount(productName);
            
        }


        //calculates the total amount of an item
        double getTotalAmount(String productName){
            for(Product product : Product.PRODUCTS){
                if(productName == product.name){
                    // System.out.println("Product: " + product.name + " product price: " + String.valueOf(product.price));
                    return this.quantity * product.price;}
            }
            return -1;
        
        }

    }