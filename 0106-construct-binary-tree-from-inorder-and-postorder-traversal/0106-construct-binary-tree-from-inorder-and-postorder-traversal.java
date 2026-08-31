class Solution {
    int index;

    private TreeNode helper(int[] postorder,int st,int end,HashMap<Integer, Integer> map) {
        if (st > end) return null;
        int rootVal = postorder[index--];
        TreeNode node = new TreeNode(rootVal);
        int inorderIndex = map.get(rootVal);

        node.right = helper(postorder,inorderIndex + 1,end,map);
        node.left = helper(postorder,st,inorderIndex - 1,map);
        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        index = postorder.length - 1;
        return helper(postorder,0,inorder.length - 1,map);
    }
}