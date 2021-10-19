// Java program to demonstrate encapsulation
class Encapsulation {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String userName;
    private int userRoll;
    private int userAge;

    // get method for age to access
    // private variable geekAge
    public int getAge() {
        return userAge;
    }

    // get method for name to access
    // private variable userName
    public String getName() {
        return userName;
    }

    // get method for roll to access
    // private variable userRoll
    public int getRoll() {
        return userRoll;
    }

    // set method for age to access
    // private variable userAge
    public void setAge(int newAge) {
        userAge = newAge;
    }

    // set method for name to access
    // private variable userName
    public void setName(String newName) {
        userName = newName;
    }

    // set method for roll to access
    // private variable userRoll
    public void setRoll(int newRoll) {
        userRoll = newRoll;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("User's name: " + obj.getName());
        System.out.println("User's age: " + obj.getAge());
        System.out.println("User's roll: " + obj.getRoll());

        // Direct access of userRoll is not possible
        // due to encapsulation
        // System.out.println("User's roll: " +
        // obj.userName);
    }
}
