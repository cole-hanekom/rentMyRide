package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Employees;

import static org.junit.jupiter.api.Assertions.*;


class EmployeesFactoryTest {
    @Test
    public void createEmployees(){
        Employees employees = EmployeesFactory.createEmployees("Tyronne", "Hendricks","Admin");
        System.out.println(employees);
    }

}