class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        while(true){
            System.out.println("My Thank you: ");
        }
    }
}

public class thread_methods {
    public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        t2.start();

    }
}