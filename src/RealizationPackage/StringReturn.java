package RealizationPackage;

public class StringReturn implements PackOfInterfaces.StringReturn {
    @Override
    public String stringReturn(String s) {
        return "Inputed word is: " + s;
    }
}
