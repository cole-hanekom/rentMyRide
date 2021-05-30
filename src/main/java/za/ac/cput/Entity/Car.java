package za.ac.cput.Entity;
/* Car.java
   Entity for the Car
   Author: Rick Allen Herbert (219014337)
   Date: 30 May 2021
*/
public class Car {

    private String numberPlate;
    private String color;
    private String make;
    private double rentalPrice;

    public Car(Builder builder) {
        this.numberPlate = builder.numberPlate;
        this.color = builder.color;
        this.make = builder.make;
        this.rentalPrice = builder.rentalPrice;
    }

    public static class Builder {

        private String numberPlate;
        private String color;
        private String make;
        private double rentalPrice;

        public Builder numberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder rentalPrice(double rentalPrice) {
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public boolean Availability_Status() {
        return true;
    }

    public void Rent_Car() {

    }
}