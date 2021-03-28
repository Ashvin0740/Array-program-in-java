class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CallPhone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("vibrating.....");
    }
    public void callFriend(){
        System.out.println("callin bob.....");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hitt(){
        System.out.println("hitting the enemy.....");
    }
    public void run(){
        System.out.println("Running from the enemy.....");
    }
    public void firing(){
        System.out.println("Firing on the enemy.........");
    }

}



public class ProblemSet_39{
     public static void main(String [] args) {

        /*
        // Problem 1
        Employee alice = new Employee();
        alice.setName("Alice blotch");
        alice.salary = 233;
        System.out.println(alice.getSalary());
        System.out.println(alice.getName());
        
        //Problem 2
        CallPhone asus = new CallPhone();
        asus.ring();
        asus.callFriend();
        asus.vibrate();
       //Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         */
        //Problem 4
         Tommy tm = new Tommy();
         tm.hitt();
         tm.run();
         tm.firing();

    }
}