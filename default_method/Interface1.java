package default_method;

/**
 * Interface1
 */
public interface Interface1 {

    public void m1();
    public void m2();

    default void m3(){
        System.out.println("Default methods in Interface");
    }

    default int hasCode(){
        return 10;
    }
}