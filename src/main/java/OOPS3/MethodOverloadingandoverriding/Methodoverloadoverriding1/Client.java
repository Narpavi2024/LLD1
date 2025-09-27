package OOPS3.MethodOverloadingandoverriding.Methodoverloadoverriding1;

public class Client {
    public static void main(String[] args) {
//        P obj = new P();
//        System.out.println(obj.d1);
//        System.out.println(obj.d);
//        obj.fun1();
//        obj.fun();
//        obj.sfun();

//        P obj = new C();
//        System.out.println(obj.d1);
//        System.out.println(obj.d);
//        obj.fun1();
//        obj.fun();
//        obj.sfun();

//        C obj = new P();   //Compile time error
//        System.out.println(obj.d1);
//        System.out.println(obj.d);
//        obj.fun1();
//        obj.fun();
//        obj.sfun();

        C obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }
}
