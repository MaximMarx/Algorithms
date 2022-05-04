public class AreNumbersEqual {
    public int areNumbersEqual(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a < b) {
            return -1;
        }
        return 1;

    }
}
