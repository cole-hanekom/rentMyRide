package za.ac.cput.Entity;
 /*
    @Description:Employees.java -> Employees class for Employees Entity
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 28 May 2021
  */

public class Employee {
    private String employeeNumber, name, surname, loginCredentials, userType;

    private Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.name = builder.name;
        this.surname = builder.surname;
        this.loginCredentials = builder.loginCredentials;
        this.userType = builder.userType;
    }

    public static class Builder{
        private String employeeNumber, name, surname, loginCredentials, userType;

        public Builder setEmp_Num(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder setFirstName(String firstName){
        this.name = firstName;
        return  this;
        }
        public Builder setSurname(String surname){
        this.surname = surname;
        return this;
        }
        public Builder setLogin_Credentials(String loginCredentials){
        this.loginCredentials = loginCredentials;
        return this;
        }
        public Builder setUserType(String userType){
            this.userType =  userType;
            return this;
        }
        public Employee build(){
            return new Employee( this);
        }

       public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.name = employee.name;
            this.surname = employee.surname;
            this.loginCredentials = employee.loginCredentials;
            this.userType = employee.userType;
            return this;
       }

    }//inner class

    @Override
    public String toString() {
        return "Employee{" +
                "Employee Number='" + employeeNumber + '\'' +
                ", First Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Login Credentials='" + loginCredentials + '\'' +
                '}';
    }

    public String getEmp_Num() {
        return employeeNumber;
    }

    public String getFirstName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin_Credentials() {
        return loginCredentials;
    }

    public String getUserType() { return userType; }
}// outer class
