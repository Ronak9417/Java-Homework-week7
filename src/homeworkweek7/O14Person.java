package homeworkweek7;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */
public class O14Person {
    String firstName, lastName;
    int age;
//Declare main method
    public static void main(String[] args) {
        O14Person o14Person = new O14Person();
        o14Person.setFirstName(""); // firstName is set to empty string
        o14Person.setLastName(""); // lastName is set to empty string
        o14Person.setAge(10);
        System.out.println("fullName= " + o14Person.getFullName());
        System.out.println("teen= " + o14Person.isTeen());
        o14Person.setFirstName("John"); // firstName is set to John
        o14Person.setAge(18);
        System.out.println("fullName= " + o14Person.getFullName());
        System.out.println("teen= " + o14Person.isTeen());
        o14Person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + o14Person.getFullName());
    }
//Declare an instance method
    public void getFirstName() {
        System.out.println(firstName);
        //return firstName;
    }
    //Declare an instance method
    public void getLastName() {
        System.out.println(lastName);
        // return lastName;
    }
    //Declare an instance method
    public void getAge() {
        System.out.println(age);
    }
//Declare an instance method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//Declare an instance method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Declare an instance method with params
    public void setAge(int age) {

        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }
    //Declare an instance method
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }
    }
//Declare static method without params
    public String getFullName() {
        //System.out.println(firstName + " "+ lastName);
        if (firstName.isEmpty() && lastName.isEmpty()) {

            //System.out.println(" ");
            return " ";
        } else if (firstName.isEmpty()) {
            // System.out.println(firstName);
            return lastName;
        } else if (lastName.isEmpty()) {
            // System.out.println(lastName);
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }
}
