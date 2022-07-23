public class BinaryTree {
    Node root;

    class Node{
        int key;
        String name;

        Node left;
        Node right;

        public Node(int key, String name){
            this.name = name;
        }

        public String toString(){
            return name + " has a key " + key;
        }
        
    }
    public void insertRecursion(int key, String name){
        Node newNode = new Node(key, name);

        if(this.root == null){
            this.root = newNode; 
        } else {
            insertRecursion(key, name);

        }
    }
    public void insert(int key, String name){
        
    }
    public static void main(String[] args) {
        
    }
}
