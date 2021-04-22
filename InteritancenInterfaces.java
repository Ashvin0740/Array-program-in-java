interface sampleInterface{
    void math1();
    void math2();
}
interface childsampleInterface extends sampleInterface{
    void math3();
    void math4();
}
class MySampleInterface implements childsampleInterface{
    public void math1(){
        System.out.println("math1");
    }
    public void math2(){
        System.out.println("math2");
    }
    public void math3(){
        System.out.println("math3");
    }
    public void math4(){
        System.out.println("math4");
    }
}
class InteritanceInInterfaces{
    public static void main(String[] args) {
        MySampleInterface si = new MySampleInterface();
        si.math1();
        si.math2();

        si.math3();

        si.math4();

        
    }
}