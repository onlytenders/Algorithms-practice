public class Recursion {
    public void countdown(int i) {
        System.out.println(i);
        if (i == 0) {
            return;
        } else {
            countdown(i-1);
        }
    }
}
