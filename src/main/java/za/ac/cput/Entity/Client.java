package za.ac.cput.Entity;

/*
   @Description:Client.java -> Client class for Client Entity
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 29 May 2021
 */

public class Client {
    private String id,firstName,surname;

    private Client(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.surname = builder.surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class Builder{
        private String id,firstName,surname;

        public Builder setId(String id) {
            this.id = id;
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

        public Client build(){
            return new Client(this);
        }

        public Builder copy(Client client){
            this.id = client.id;
            this.firstName = client.firstName;
            this.surname = client.surname;
            return this;
        }
    }
}
