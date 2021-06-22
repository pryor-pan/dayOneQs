package dayoneQs_2.day17;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/11
 */

class X{
    public String name = "abc";
    Y y = new Y();

}

class Y{
    public Y(){
        System.out.println("Y");
    }
}

public class Z extends X{
    Y y = new Y();
    public Z(){
        System.out.println("Z");
    }
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        System.out.println(x1.equals(x2)+" " + x1.name.equals(x2.name));
    }
}

