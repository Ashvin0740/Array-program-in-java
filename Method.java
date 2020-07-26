class Method{
   public static void myMethod(int i){
        System.out.println("myMeyhod (int)");
    }
     public static void myMethod(double i){
        System.out.println("myMeyhod (double)");
    }

public static void main(String[] args){
    myMethod(100);
    myMethod(10.0);
    myMethod(25);
    myMethod(25.9);
}
}