package default_method;

/**
 * test1
 */
public class test1 implements Interface1{

    @Override
    public void m1() {
        System.out.println("m1 implemented");
    }

    @Override
    public void m2() {
        System.out.println("m2 implemented");
    }

    @Override
    public void m3(){
        // System.out.println("Overriding default implementation of default methods");
        Interface1.super.m3();
    }
    
    public static void main(String[] args) {
        test1 ob = new test1();
        ob.m1();
        ob.m2();
        ob.m3();
    }
    
}