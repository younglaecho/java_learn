package Quiz6;

class A {
    void abc() {
        try {
            bcd();
        } catch (InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    void bcd() throws  InterruptedException, ClassNotFoundException {
        Thread.sleep(1000);
        Class.forName("java.lang.Object");
    }
}
public class Q6 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}
