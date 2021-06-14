package dayoneQs_1.day09;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/1
 */
public class Qs01 {
    public int addAB(int A, int B) {
        int C = (A&B)<<1;
        A = A ^ B;
        B = C;
        while (B!=0){
            C = (A&B)<<1;
            A = A^B;
            B = C;
        }
        return A;
    }
}
