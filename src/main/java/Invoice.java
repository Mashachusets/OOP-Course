public class Invoice {
    String partNumber;
    String partDescription;
    int itemQuantity;
    int itemPrice;

    public Invoice(String partNumber, String partDescription, int itemQuantity, int itemPrice){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    int getInvoiceAmount(){
        if(this.itemQuantity<0){
            this.itemQuantity = 0;
        }
        if(this.itemPrice<0){
            this.itemPrice = 0;
        }
        return this.itemQuantity*this.itemPrice;
    }
}