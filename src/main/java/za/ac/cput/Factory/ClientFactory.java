package za.ac.cput.Factory;

/*
   @Description:ClientFactory.java
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 29 May 2021
 */

import za.ac.cput.Entity.Client;
import za.ac.cput.Util.GenerateHelper;

public class ClientFactory {
    public static Client createClient(String firstName, String surname) {
        String clientId = GenerateHelper.generateId();
        Client client = new Client.Builder()
                .setId(clientId)
                .setFirstName(firstName)
                .setSurname(surname)
                .build();

        return client;
    }
}
