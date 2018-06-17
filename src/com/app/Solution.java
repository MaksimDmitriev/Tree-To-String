package com.app;

class Solution {

    StringBuilder builder = new StringBuilder();

    // Preorder (Root, Left, Right)
    public String tree2str(TreeNode t) {
        tree2strRecursive(t);
        String s = builder.toString();
        return s;
    }

    private void tree2strRecursive(TreeNode t) {
        if (t != null) {
            builder.append(t.val);

            if (t.left != null && t.right != null) {
                builder.append("(");
                tree2strRecursive(t.left);
                builder.append(")(");
                tree2strRecursive(t.right);
                builder.append(")");
            } else if (t.right != null) {
                builder.append("()(");
                tree2strRecursive(t.right);
                builder.append(")");
            } else if (t.left != null) {
                builder.append("(");
                tree2strRecursive(t.left);
                builder.append(")");
            }
        }
    }
}
