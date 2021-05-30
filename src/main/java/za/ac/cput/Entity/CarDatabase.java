package za.ac.cput.Entity;

/*
    @Description:CarDatabase.java -> Car Database class for CarDatabase Entity
    @Author: Elrich John Herman
    @Student Number: 218150040
    @Date: 30 May 2021
  */


public class CarDatabase {

    private String numPlate, carSize;

    private CarDatabase(Builder builder) {
        this.numPlate = builder.numPlate;
        this.carSize = builder.carSize;
    }

    public static class Builder {
        private String numPlate, carSize;

        public Builder setNumPlate(String numPlate) {
            this.numPlate = numPlate;
            return this;
        }

        public Builder setCarSize(String carSize) {
            this.carSize = carSize;
            return this;
        }

        public CarDatabase build(){
            return new CarDatabase(this);
        }

        public CarDatabase.Builder copy(CarDatabase cardatabase) {
            this.carSize = cardatabase.carSize;
            this.numPlate = cardatabase.numPlate;
            return this;
        }

        public String getNumPlate() {
            return numPlate;
        }

        public String getCarSize() {
            return carSize;
        }

        @Override
        public String toString() {
            return "Builder{" + "numPlate='" + numPlate + '\'' + ", carSize='" + carSize + '\'' + '}';
        }



    }
}
