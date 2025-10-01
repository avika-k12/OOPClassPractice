public class RectangleClass {
    public float length;
    public float width;

    public RectangleClass(float length, float width){
        this.length = length;
        this.width = width;

        System.out.println("Rectangle created! It has length " + this.length + "cm and width " + this.width + "cm");
    }

    public String calculateArea(){
        float area = this.length * this.width;
        return "The area of a rectangle with length " + this.length + "cm and width " + this.width + "cm is " + area + "cm squared";
    }

    public String calculatePerimeter(){
        float perim = this.length + this.length + this.width + this.width;
        return "The perimeter of a rectangle with length " + this.length + "cm and width " + this.width + "cm is " + perim + "cm";
    }
}
