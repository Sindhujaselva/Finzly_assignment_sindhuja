public class Circle implements Shape {
    int radius;
    public  Circle(int radius) {


        this.radius = radius;
    }
    @Override
    public  double calculateArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

}
class Rectangle implements  Shape{
    int width;
    int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height=height;
    }
    @Override
    public  double calculateArea(){
        System.out.println("trinagle area:");
        return width*height;
    }
    @Override
    public double calculatePerimeter(){
        return 2*(width+height);
    }

}
class Triangle implements  Shape{
    int base;
    int height;
    public Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    @Override
    public  double calculateArea(){
        return (0.5)*base*height;
    }

    @Override
    public double calculatePerimeter() {
        return 3*base;
    }


}





