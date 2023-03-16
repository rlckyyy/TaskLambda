package RealizationPackage;

public class ReturnT<T> implements PackOfInterfaces.ReturnT<T> {
    @Override
    public T returnT(T t) {
        return t;
    }
}
