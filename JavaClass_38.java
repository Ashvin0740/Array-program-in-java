class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class JavaClass_38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Alice = new Employee(); // Instantiating a new Employee Object
        Employee bob = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Alice
        Alice.id = 12;
        Alice.salary = 34;
        Alice.name = "";

        // Setting Attributes for Bob
        bob.id = 17;
        bob.salary = 12;
        bob.name = "bob Khandelwal";

        // Printing the Attributes
        Alice.printDetails();
        bob.printDetails();
        int salary = Alice.getSalary();
        System.out.println(salary);
        // System.out.println(alice.id);
        // System.out.println(alice.name);
    }
}
