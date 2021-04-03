
class Employee{
    private int id;
    private String name;

    public Employee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public Employee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee ashvin = new Employee("ProgrammingWithAShvin", 12);
        //Employee ashvin = new Employee();
        // ashvin.setName("CodeWithASHVIN");
        // ashvin.setId(34);
        System.out.println(ashvin.getId());
        System.out.println(ashvin.getName());
    }
}
