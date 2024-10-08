package Arrays;

class Test1{
    int x;
    int y;
}

class Test3 implements Cloneable{
    
    int a;
    int b;

    Test1 t = new Test1();

    public Object clone() throws CloneNotSupportedException{

        Test3 t1 = (Test3) super.clone();

        t1.t = new Test1();
        t1.t.x = t.x;
        t1.t.y = t.y;

        return t1;
    }    
}

public class CloneDeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException{
        
        Test3 t3 = new Test3();
        t3.a = 10;
        t3.b = 20;
        t3.t.x = 30;
        t3.t.y = 40;

        Test3 t4 = (Test3) t3.clone();
        t4.a = 100;
        t4.t.x = 300;

        System.out.println(t3.a + " " + t3.b + " " + t3.t.x + " " + t3.t.y);
        System.out.println(t4.a + " " + t4.b + " " + t4.t.x + " " + t4.t.y);
    }
    
}
