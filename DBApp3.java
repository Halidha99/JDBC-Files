import java.util.List;

public class DBApp3{
    public static void main(String args[]) {
      
       List<Employee> employeeList =EmployeeDao.getAll();
         
      for(Employee employee: employeeList){
        System.out.print(employee.getId() + "\t");
        System.out.print(employee.getName() + "\t");
        System.out.print(employee.getNic() + "\t");
        System.out.print(employee.getGender() + "\t");

        System.out.println("");
        
    
      }
    }
}