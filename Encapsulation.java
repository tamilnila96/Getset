 class Car {
     private String company_name;
     private String model_name;
     private int year;
     private double mileage;


     public String getCompany_name() {
         return company_name;
     }

     public String getModel_name() {
         return model_name;
     }

     public int getYear() {
         return year;
     }

     public double getMileage() {
         return mileage;
     }

     public void setCompany_name(String company_name) {
         this.company_name = company_name;
     }

     public void setModel_name(String model_name) {
         this.model_name = model_name;
     }

     public void setYear(int year) {
         this.year = year;
     }
 }
public class Encapsulation{
        public static void main (String[] args) {
        Car carObj = new Car();
        carObj.setCompany_name("BMW");
        carObj.setModel_name("new series");
        carObj.setYear(2025);

        String  company_name = carObj.getCompany_name();
         String model_name = carObj.getModel_name();
         int year = carObj.getYear();
        System.out.println( company_name + model_name + year);
    }
    }



