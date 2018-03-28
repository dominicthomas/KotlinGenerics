
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnnecessaryLocalVariable")
public class JavaGenerics {

    public static void main(String[] args) {

        // Java Arrays - Covariant :(
        final Integer[] array1 = new Integer[]{1, 2, 3};
        final Number[] array2 = array1; // ok
        //System.out.println(array2[0]);
        //System.out.println(array2.getClass().getSimpleName());


        // Java Collections - Invariant :)
        final ArrayList<Integer> arrayList1 = new ArrayList<>();
        // final List<Integer> list2 = arrayList1; // ok
        // final ArrayList<Number> list1 = arrayList1; // not ok


        // Java - Generics (Wildcard) - Covariant
        final List<?> list3 = arrayList1;
        final Object object = list3.get(0); // read allowed
        //arrayList3.add("hello"); // write not allowed
    }

}
