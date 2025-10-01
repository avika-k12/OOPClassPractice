public class RectangleMain {
    public static void main(String[] args){
        RectangleClass theCoolestRectangle = new RectangleClass(20.2f, 12.3f);

        System.out.println("Welcome to the rectangle calculator!");
        System.out.println(theCoolestRectangle.calculateArea());
        System.out.println(theCoolestRectangle.calculatePerimeter());

    }
}
