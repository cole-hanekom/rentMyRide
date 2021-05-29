package za.ac.cput.Entity;
 /*
    @Description:Employees.java -> Employees class for Employees Entity
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 28 May 2021
  */

public class Employees {
    private String emp_Num, firstName, surname, login_Credentials;

    private Employees(Builder builder){
        this.emp_Num = builder.emp_Num;
        this.firstName = builder.firstName;
        this.surname = builder.surname;
        this.login_Credentials = builder.login_Credentials;
    }

    public static class Builder{
        private String emp_Num, firstName, surname, login_Credentials;

        public Builder setEmp_Num(String emp_Num){
            this.emp_Num = emp_Num;
            return this;
        }
        public Builder setFirstName(String firstName){
        this.firstName = firstName;
        return  this;
        }
        public Builder setSurname(String surname){
        this.surname = surname;
        return this;
        }
        public Builder setLogin_Credentials(String login_Credentials){
        this.login_Credentials = login_Credentials;
        return this;
        }
        public Employees build(){
            return new Employees( this);
        }

       public Builder copy(Employees employee){
            this.emp_Num = employee.emp_Num;
            this.firstName = employee.firstName;
            this.surname = employee.surname;
            this.login_Credentials = employee.login_Credentials;
            return this;
       }

    }//inner class

    @Override
    public String toString() {
        return "Employee{" +
                "Employee Number='" + emp_Num + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Surname='" + surname + '\'' +
                ", Login Credentials='" + login_Credentials + '\'' +
                '}';
    }

    public String getEmp_Num() {
        return emp_Num;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin_Credentials() {
        return login_Credentials;
    }

}//class
