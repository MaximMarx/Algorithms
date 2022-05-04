public class OddIndices {
    public int[] oddIndices (int[] array){
        int[] arrayOdd = new int[array.length/2];
        for (int i = 1, j = 0; i <array.length ; i+=2, j++) {
            arrayOdd[j] = array[i];
        } return arrayOdd;
    }
}
