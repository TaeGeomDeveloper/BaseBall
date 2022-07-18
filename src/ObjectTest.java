public class ObjectTest {

    public void compareTest() {
        int a = 10;
        int b = 10;

        if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("a!=b");
        }
    }

    public void compareTest2() {
        String a = new String("10");
        String b = new String("10");

        if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("a!=b");
        }
        // 문자열 기준 재정의
        if (a.equals(b)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

    public void compareString() {
        String a = "10";
        String b = "10";
        //a = "20";
        System.out.println(a.toString());

        if (a == b) {
            System.out.println("a==b");
        } else {
            System.out.println("a!=b");
        }
        // 문자열 기준 재정의
        if (a.equals(b)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

}
