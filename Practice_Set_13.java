class Practice_13 extends Thread{
    public void run(){
        
            while(true){
                System.out.println("Good Morning!");
            }
        
    }
}


class Practice_13b extends Thread{
public void run(){
    int i= 0;
    //    while(false){
    //        try {
    //            Thread.sleep(200);
    //        }
    //        catch (Exception e){
    //            System.out.println(e);
    //        }
    //        System.out.println("Welcome");
       
    //     }
}
}

 public class Practice_Set_13{
public static void main(String[] args) {
    Practice_13 p1 = new Practice_13();
    Practice_13b p2 = new Practice_13b();
        // p1.setPriority(6);
        // p2.setPriority(9);

    System.out.println(p1.getPriority());
    System.out.println(p2.getPriority());
    System.out.println(p2.getState());
    // p1.start();
    p2.start();
    System.out.println(p2.getState());
    System.out.println(Thread.currentThread().getState());

    } 
}