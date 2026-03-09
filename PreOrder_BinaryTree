class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans= new ArrayList<>();
        
        if(root==null)
            return ans;
        
        Stack<Node> st= new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            Node node= st.pop();
            ans.add(node.data);
            
            if(node.right != null)
                st.push(node.right);
                
            if(node.left != null)
                st.push(node.left);
        }
        
        return ans;
        
    }
}
