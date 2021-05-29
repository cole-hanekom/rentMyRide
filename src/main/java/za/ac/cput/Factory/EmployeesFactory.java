package za.ac.cput.Factory;
/*
    @Description:Employees.java -> Employees class for Employees Entity
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 28 May 2021
  */
import za.ac.cput.Entity.Employees;
import za.ac.cput.Util.GenerateHelper;

public class EmployeesFactory {
    public static Employees createEmployees(String firstname, String surname, String loginCredentials){
        String employeeNumber = GenerateHelper.generateEmp_Num();

        Employees employees = new Employees.Builder()
                    .setEmp_Num(employeeNumber )
                    .setFirstName(firstname)
                    .setSurname(surname)
                    .setLogin_Credentials(loginCredentials)
                    .build();
                    return employees;
    }
}//End of class
