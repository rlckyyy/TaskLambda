package RealizationPackage;

public class TwoStringNoReturn implements PackOfInterfaces.TwoStringNoReturn {
    @Override
    public void twoStringNoReturn(String a, String b) {
        System.out.println("First word " + a + " second word: " + b);
    }
}
