/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public void preOrder(Node root, List<Integer> list){
        list.add(root.val);
        for(Node node: root.children){
            if(node!= null){
                preOrder(node, list);
            }
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list= new ArrayList<>();
        if(root !=null){
            preOrder(root, list);
        }

        return list;
    }
}
