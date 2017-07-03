import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by sky on 10.03.2017.
 */
public class View {
    public void printResultArray(int[] array) {
        System.out.println("Array of compared elements: " + Arrays.toString(array));
    }

    public void printIndexTable(int[] array) {

        System.out.println("Array of compared indexes: " + Arrays.toString(array));
    }
}
