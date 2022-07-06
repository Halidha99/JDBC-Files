import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class EmployeeDao {
    public static List<Employee> getAll(){
        List<Employee> employeeList = new ArrayList<Employee>();
            try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/euc1","root","1234");
            Statement stm = con.createStatement(1004,1007);
            ResultSet resultSet = stm.executeQuery("Select *from employee;");

           while(resultSet.next()){
           int id = resultSet.getInt("id");
           String name =resultSet.getString("name");
           String nic =resultSet.getString("nic");
           int genderId=resultSet.getInt("gender_id");

           Employee employee=new Employee();
           employee.setId(id);
           employee.setName(name);
           employee.setNic(nic);
           employee.setGender(genderId);

           employeeList.add(employee);
           }
           

        }catch(SQLException ex){
                System.out.println("Database Error " + ex.getMessage());
            

         }
         return employeeList;
        }
    }
    

