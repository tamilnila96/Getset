import java.sql.SQLOutput;

class Shapes {
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shapes {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    @Override
    public double getArea() {
        return length * width;
    }
}


    class Value {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(4.0,5.0);
            System.out.println(rectangle.getArea());

        }
    }


