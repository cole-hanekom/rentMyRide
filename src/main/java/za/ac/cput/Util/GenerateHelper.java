package za.ac.cput.Util;
/*
    @Description:Employees.java -> Employees class for Employees Entity
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 28 May 2021
  */
import java.util.UUID;

public class GenerateHelper {
    public static String generateEmp_Num(){
        return UUID.randomUUID().toString();
    }

    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public static String generateAccountNumber(){
        return UUID.randomUUID().toString();
    }
}
