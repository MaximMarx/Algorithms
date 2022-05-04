import java.util.Arrays;

public class MinMaxAve {
    public int[] minMaxAve(int[] array, int index1, int index2) {
        int[] array1 = new int[index2 - index1 + 1];

        for (int i = index1, j = 0; i <= index2; i++, j++) {
            array1[j] = array[i];
        }

        Arrays.sort(array1);
        int min = array1[0];
        int max = array1[array1.length - 1];
        int avg = 0;

        for (int i = 0; i < array1.length; i++) {
            avg += array1[i];
        }
        int[] result = {min, max, avg / array1.length};
        return result;
    }
}
