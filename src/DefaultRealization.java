import RealizationPackage.*;

public class DefaultRealization {
    public static void main(String[] args) {
        // no return and input
        WithoutReturn withoutReturn = new WithoutReturn();
        withoutReturn.withoutReturn();
        //OneReturnOneInput
        StringReturn stringReturn = new StringReturn();
        stringReturn.stringReturn("Kate");
        // Two Input With Return
        TwoIntegerReturn twoIntegerReturn = new TwoIntegerReturn();
        System.out.println(twoIntegerReturn.twoIntegerReturn(4,5));
        // two Input but without return
        TwoStringNoReturn twoStringNoReturn = new TwoStringNoReturn();
        twoStringNoReturn.twoStringNoReturn("Lola","Jessica");
        // T return type realize
        ReturnT<String > returnT = new ReturnT<>();
        System.out.println(returnT.returnT("Nanika"));
    }
}
