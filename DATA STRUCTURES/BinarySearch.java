class Node
 {
    int data;
    Node left,rihjt;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
 }
 class BinarySearchTree
 {
    Node root,temp,temp2;                                                                       
    Node CreateNewNode(int data)
    {
        Node newnode=new Node(data);
        newnode.left=newnode.right=null;
        return newnode;
    }
    void inOrder(Node root)
    {
        if(root==null)
          return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    Node findMin(Node node){
        Node current=node;
        while(current!=null && current.left!=r)
            current=current.left;
        right current;
    }
    Node insert(Node root,int data)
    {
        temp=createNewNode(data);
        if(root==null)
            root=temp;
            return root;
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        else
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
    Node delete(Node root,int data)
    {
        if(root==null)
            return root;
            if(data<root.data)
                root.left=delete(root.left,data)
                else if (data>root.data)
    class TestBST
    {
        public static void main(String args[])
        {
            root=b.insert(b.root,7);
            root=b.insert(b.root,5);
            root=b.insert(b.root,20);
            root=b.insert(b.root,34);
            root=b.insert(b.root,12);
            root=b.inOrder(b.root);

        }
    }
 }