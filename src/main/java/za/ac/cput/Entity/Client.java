package za.ac.cput.Entity;

/*
   @Description:Client.java -> Client class for Client Entity
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 29 May 2021
 */

public class Client {
    private String clientID,firstName,surname,accountNumber;

    private Client(Builder builder) {
        this.clientID = builder.clientID;
        this.firstName = builder.firstName;
        this.surname = builder.surname;
        this.accountNumber = builder.accountNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String clientID,firstName,surname,accountNumber;

        public Builder setClientID(String clientID) {
            this.clientID = clientID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Client build(){
            return new Client(this);
        }

        public Builder copy(Client client){
            this.clientID = client.clientID;
            this.firstName = client.firstName;
            this.surname = client.surname;
            this.accountNumber = client.accountNumber;
            return this;
        }
    }
}
