package dayoneQs_1.day13;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/7
 */
class Test {
    public int aMethod() {
        int i = 0;
        i++;
        return i;
    }
}
public class Qtest {
    public static void main(String args[]){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }

}
