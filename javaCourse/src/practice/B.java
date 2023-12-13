package practice;

public class B extends A{

    int number = 200;
    void method(){

        System.out.println("Child......");

    }

    public static void main(String args[]){

        B obj = new B();
        System.out.println(obj.number);
        obj.method();

    }
    
}
