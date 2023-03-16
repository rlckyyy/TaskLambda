import PackOfInterfaces.*;

public class AnonymousRealize {
    public static void main(String[] args) {
        // T return type realize
        ReturnT<Integer> returnT = new ReturnT<Integer>() {
            @Override
            public Integer returnT(Integer integer) {
                return integer/10;
            }
        };
        System.out.println(returnT.returnT(80));
        // two Input but without return
        TwoStringNoReturn twoStringNoReturn = new TwoStringNoReturn() {
            @Override
            public void twoStringNoReturn(String a, String b) {
                System.out.println("First word: " + a + ",Second word: " + b);
            }
        };
        twoStringNoReturn.twoStringNoReturn("Yernur","Alina");
        // Two Input With Return
        TwoIntegerReturn twoIntegerReturn = new TwoIntegerReturn() {
            @Override
            public Integer twoIntegerReturn(int a, int b) {
                 return  a * b;
            }
        };
        System.out.println(twoIntegerReturn.twoIntegerReturn(8,6));
        //OneReturnOneInput
        StringReturn stringReturn = new StringReturn() {
            @Override
            public String stringReturn(String s) {
                return "Word is : " + s;
            }
        };
        System.out.println(stringReturn.stringReturn("Zhanna"));
        // no return and input
        WithoutReturn withoutReturn = new WithoutReturn() {
            @Override
            public void withoutReturn() {
                System.out.println("No return here");
            }
        };
        withoutReturn.withoutReturn();
    }
}
