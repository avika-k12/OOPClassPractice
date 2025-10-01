public class ShoppingListMain {
    public static void main(String[] args){
        ShoppingListClass fantasticItem = new ShoppingListClass("Kure Kure", 0.98f, 10);

        System.out.println(fantasticItem.calculateTotalCost());
        System.out.println(fantasticItem.updateQuantity(12));
    }

}
