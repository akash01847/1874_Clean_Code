/* Convert an array to reduced form following Clean Code Principles */
import java.util.Arrays;
import java.util.HashMap;

/* Class that contain two mwthods reducedArray and main function. */
public class Reducer {
    public static int[] reducedArray(int[] given_array) {
        int[] sortedArray = Arrays.copyOf(given_array, given_array.length);
        Arrays.sort(sortedArray);

/* HashMap class implements the Map interface which allows us to store key and value pair */
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int index = 0; index < sortedArray.length; index++) {
            indexMap.put(sortedArray[index], index);
        }

        int[] reducedArr = new int[given_array.length];
        for (int index = 0; index < given_array.length; index++) {
            reducedArr[index] = indexMap.get(given_array[index]);
        }
        return reducedArr;
    }

/* Main function */
    public static void main(String[] args) {
        int[] given_array = { 5, 10, 40, 30, 20 };
        int[] reducedArr = reducedArray(given_array);
        System.out.println(Arrays.toString(reducedArr));
    }
}