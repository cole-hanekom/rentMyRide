package za.ac.cput.Entity;

/*
    @Description:CarRentalService.java -> Car Rental Service class for Car Rental Service Entity
    @Author: Grant Hendricks
    @Student Number: 215138849
    @Date: 29 May 2021
  */

public class CarRentalService {

    private String userType, username, password;

    private CarRentalService(Builder builder){
        this.userType = builder.userType;
        this.username = builder.username;
        this.password = builder.password;
    }

    @Override
    public String toString() {
        return "CarRentalService{" +
                "userType='" + userType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String userType, username, password;

        public Builder setUserType(String userType){
            this.userType = userType;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public CarRentalService build(){
            return new CarRentalService(this);
        }

        public Builder copy(CarRentalService CarRentalService){
            this.userType = CarRentalService.userType;
            this.username = CarRentalService.username;
            this.password = CarRentalService.password;
            return this;
        }

    }   //Builder class ends

    public String getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
