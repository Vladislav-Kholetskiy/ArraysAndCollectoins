import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T>
    int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return java.util.Collections.binarySearch(list, key);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return java.util.Collections.binarySearch(list, key, c);
    }
}