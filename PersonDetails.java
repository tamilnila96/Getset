 class NameAge {
     private String name;
     private int age;
     private String country;
 public String getName(){
     return name;
 }
     public void setName(String name){
     this.name = name;
     }
     public int getAge(){
     return age;
     }
     public void setAge(int age){
     this.age = age;
     }
     public String getCountry(){
     return country;
     }
     public void setCountry(String country){
     this.country = country;
     }
 }
 public class PersonDetails{
     public static void main(String[] args) {
         NameAge nameage = new NameAge();

         nameage.setName("Pallavi");
         nameage.setAge(5);
         nameage.setCountry("India");

         String name= nameage.getName();
             int age = nameage.getAge();
             String country = nameage.getCountry();


         System.out.println(" Name :" + name);
         System.out.println(" Age :" + age);
         System.out.println(" Country :" + country);
     }
}



