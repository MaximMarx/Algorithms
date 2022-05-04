public class mPerform {
    public String mPerform(int m) {
        if (m % 3 == 0 && m % 5 == 0) {
            return "Good number";
        }
        if (m % 3 == 0 && m % 5 != 0) {
            return "Bad number";
        }
        if (m % 5 == 0 && m % 3 != 0) {
            return "Poor number";
        }
        return "-1";
    }
}
