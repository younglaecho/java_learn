class B {

}

class C extends B {

}
public class multipleException {
    public static void main(String[] args) {
        try {
            int [] array = {1, 2, 3};
            int index = 4;
            System.out.println(array[index]);
            B bb = new B();
            C cc = (C)bb;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열값 읽기 실패");
        } catch (ClassCastException e) {
            System.out.println("클래스 다운캐스팅 실패");
        } finally {
            System.out.println("처리 완료");
        }
    }
}
