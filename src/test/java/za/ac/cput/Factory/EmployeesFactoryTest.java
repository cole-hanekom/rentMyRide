package za.ac.cput.Factory;
/*
    @Description:Employees.java -> Employees class for Employees Entity
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 28 May 2021
  */
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Employee;


class EmployeesFactoryTest {
    @Test
    public void createEmployees(){
        Employee employees = EmployeesFactory.createEmployees("Tyronne", "Hendricks","Admin","Admin");
        System.out.println(employees);
    }

}