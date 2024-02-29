package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1609 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private List<Integer> prev = new ArrayList<>();

    public boolean isEvenOddTree(TreeNode root) {
        return dfs(root, 0);
    }

    private boolean dfs(TreeNode current, int level) {
        if (current == null) return true;

        if (current.val % 2 == level % 2) return false;

        while (prev.size() <= level) prev.add(0);

        if (
                prev.get(level) != 0 &&
                        (
                                (level % 2 == 0 && current.val <= prev.get(level)) ||
                                        (level % 2 == 1 && current.val >= prev.get(level))
                        )
        ) return false;

        prev.set(level, current.val);

        return dfs(current.left, level + 1) && dfs(current.right, level + 1);
    }
}
