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
}
*/

class Solution {
    public void postOrder(Node root, List<Integer> list){
        for(Node node: root.children){
            if(node !=null)
            postOrder(node, list);
        }
        list.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list= new ArrayList<>();
        if(root !=null){
            postOrder(root, list);
        }

        return list;
    }
}
