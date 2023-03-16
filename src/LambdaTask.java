import PackOfInterfaces.*;

public class LambdaTask {
    public static void main(String[] args) {
        // T return type realize
        ReturnT<String> returnT = name -> "Word is: "+name;
        System.out.println(returnT.returnT("Lola"));
        // two Input but without return
        TwoStringNoReturn twoStringNoReturn = (name1,name2)-> System.out.println(name1 + " " + name2);
        // Two Input With Return
        TwoIntegerReturn twoIntegerReturn = (a,b) -> a*b;
        System.out.println(twoIntegerReturn.twoIntegerReturn(7,8));
        //OneReturnOneInput
        StringReturn stringReturn = (str) -> "Word is: " + str;
        System.out.println(stringReturn.stringReturn("Messi"));
        // no return and input
        WithoutReturn withoutReturn = () -> System.out.println("No return");
        withoutReturn.withoutReturn();
    }
}

