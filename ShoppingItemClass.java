public class ShoppingListClass {
    public String name;
    public float price;
    public int quantity;

    public ShoppingListClass(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String calculateTotalCost(){
        float totalCost = this.price * this.quantity;
        return "The total cost of " + this.name + " is £" + totalCost;

    }

    public String updateQuantity(int newQuantity){
        this.quantity = newQuantity;
        return "The new quantity of " + this.name + " is " + newQuantity;
    }

}
