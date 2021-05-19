class Runnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(true){
        System.out.println("I am a thread 1 not a threat 1");
         i++;
        }
    }

}
class Runnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(true){
        System.out.println("I am a thread 2 not a threat 2" );
         i++;
        }
    }
}
public class Runnable_Ex {
    public static void main(String[] args) {
        Runnable1 bullet1 = new Runnable1();
        Thread gun1 = new Thread(bullet1);

        Runnable2 bullet2 = new Runnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
