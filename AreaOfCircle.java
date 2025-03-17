 class Circle {
    private double pi;
   private int radius;

    public double getPi(){
        return pi;
    }
    public int getRadius(){
        return radius;
    }
    public void setPi(double pi){
        this.pi = pi;
    }

     public void setRadius(int radius) {
         this.radius = radius;
     }
 }
 public class AreaOfCircle {
     public static void main(String[] args) {
         Circle details = new Circle();
         details.setPi(3.14);
         details.setRadius(7);

         double pi = details.getPi();
         int radius = details.getRadius();
         double area = pi*radius*radius;
         double perimeter = pi*2*radius;
         System.out.println(" Area of circle is : " + area);
         System.out.println(" Area of perimeter is : " +perimeter);
     }
}
