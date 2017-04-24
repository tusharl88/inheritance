package inheritance;

public class tuck extends car {
    public void m1() {
        System.out.println("truck 1");
    }
     
    public void m2() {
        super.m1();         //super.m1() overrided car2 to m2.
    }
     
    public String toString() {
        return super.toString() + super.toString();
    }
}