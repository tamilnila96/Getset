 class Employee {
    int employee_id;
    String employee_name;
    int employee_salary;

     public int getEmployee_id() {
         return employee_id;
     }

     public String getEmployee_name() {
         return employee_name;

     }

     public int getEmployee_salary() {
         return employee_salary;
     }

     public void setEmployee_id(int employee_id) {
         this.employee_id = employee_id;

     }

     public void setEmployee_salary(int employee_salary) {
         this.employee_salary = employee_salary;

     }

     public void setEmployee_name(String employee_name) {
         this.employee_name = employee_name;
     }
 }
public class OfficeDetails {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmployee_id(4575);
        obj.setEmployee_name("Vignesh");
        obj.setEmployee_salary(1000000);


        int employee_id = obj.getEmployee_id();
        String employee_name = obj.getEmployee_name();
        int employee_salary = obj.getEmployee_salary();
        System.out.println("employee_id : " + employee_id );
        System.out.println("employee_name : " + employee_name);
        System.out.println("employee_Salary :  " + employee_salary);

    }
}