/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author Ayman
 */
class TreeNode{
    int data;
    TreeNode left, right;
    
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
    
}
public class BinaryTree {
    TreeNode root;
    BinaryTree(){
        this.root = null;
    }
    public static void main(String args[]){
        BinaryTree b = new BinaryTree();
        b.insert(7);
        b.insert(5);
        b.insert(12);
        b.inOrderTraversal(b.root);
        
    }
    
    
    public void insert(int data){
        TreeNode prev = null;
        TreeNode temp = root;
        if(root == null){
            root = new TreeNode(data);
        }
        else{
            while(temp!=null ){
                prev=temp;
            if (data < temp.data )
                temp=temp.left;
            else
                temp= temp.right;
            }
            if(data < prev.data){
                prev.left=new TreeNode(data);
            }
            else{
                prev.right= new TreeNode(data);
            }
           
    }
    }
    public void inOrderTraversal(TreeNode root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
}
