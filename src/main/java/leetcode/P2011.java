package leetcode;

public class P2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if ("++X".equals(s) || "X++".equals(s)) {
                x++;
            } else if ("--X".equals(s) || "X--".equals(s)) {
                x--;
            }
        }
        return x;
    }
}
