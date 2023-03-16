import PackOfInterfaces.*;

public class ReferenceRealize {
    public static void main(String[] args) {
        WithoutReturn withoutReturn = ReferenceRealize::withoutReturn;
        withoutReturn.withoutReturn();

        StringReturn stringReturn = ReferenceRealize::stringReturn;
        System.out.println(stringReturn.stringReturn("Kate"));

        TwoIntegerReturn twoIntegerReturn = ReferenceRealize::twoIntegerReturn;
        System.out.println(twoIntegerReturn.twoIntegerReturn(4,7));

        TwoStringNoReturn twoStringNoReturn = ReferenceRealize::twoStringNoReturn;
        twoStringNoReturn.twoStringNoReturn("Kate","Anna");

        ReturnT<Integer> returnT = ReferenceRealize::returnT;
        System.out.println(returnT.returnT(9));
    }
    public static void withoutReturn() {
        System.out.println("Calling a method reference");
    }

    public static String stringReturn(String str) {
        return "Inputed word: " + str;
    }

    public static Integer twoIntegerReturn(int num1, int num2) {
        return num1*num2;
    }

    public static void twoStringNoReturn(String s1, String s2) {
        System.out.println("First word: " + s1 + " " + "Second word: " + s2);
    }
    public static <T> T  returnT(T t) {
        return t;
    }
}
