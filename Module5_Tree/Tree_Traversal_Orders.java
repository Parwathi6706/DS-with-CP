// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    int data;
    Node l,r;
    
    Node(int a){
        this.data=a;
        this.l =this.r = null;
    }
    
    // recursive  method
    void PostorderTreeTraverse(Node n){
        //base condition
        if(n==null)return;
        PostorderTreeTraverse(n.l);
        PostorderTreeTraverse(n.r);
        //post order traversal
        System.out.println(n.data);
    }
    
    void PreorderTreeTraverse(Node n){
        //base condition
        if(n==null)return;
        //pre order traversal
        System.out.println(n.data);
        PreorderTreeTraverse(n.l);
        PreorderTreeTraverse(n.r);
        
    }
    
    void LevelorderTreeTraverse(Node n){
        //base condition
        if(n==null)return;
        
        LevelorderTreeTraverse(n.l);
        //level order traversal
        System.out.println(n.data);
        LevelorderTreeTraverse(n.r);
        
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        
        //linking
        a.l=b;
        a.r=c;
        b.l=d;
        
         System.out.println("post order traversal");
         a.PostorderTreeTraverse(a);
         
         System.out.println("pre order traversal");
         a.PreorderTreeTraverse(a);
         
         System.out.println("level order traversal");
         a.LevelorderTreeTraverse(a);
         
        
        
                       
                       
                       
                       
                       
    }
}
