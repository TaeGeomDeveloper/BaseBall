public class ObjectMain {
    public static void main(String[] args){
        ObjectMain om = new ObjectMain();
        om.testPoint();
    }
    public void testAbstract() {
        TestClass tc = new TestSubClass();
        tc.eat();
        tc.work();
        //tc.sleep();        // 오류

        TestSubClass tsc = (TestSubClass)tc;
        tsc.sleep();
    }
    public void testPoint(){
        //Point 객체
        Point p1 = new Point(3, 6);
        Point p2 = new Point(3, 6);

        System.out.println(p1);
        System.out.println(p2);
        
        // P1,P2 가 동일한 x,y 좌표를 가지는지 확인
        if(p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        // equals
        boolean flag = p1.equals(p2);
        if(flag){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }
    }
    public static void test1(){
        ObjectTest ot = new ObjectTest();
        ot.compareTest();
    }
    public void test2(){
        ObjectTest ot = new ObjectTest();
        ot.compareTest2();
    }

}
