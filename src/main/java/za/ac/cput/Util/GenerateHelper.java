package za.ac.cput.Util;

import java.util.UUID;

public class GenerateHelper {
    public static String generateEmp_Num(){
        return UUID.randomUUID().toString();
    }
}
