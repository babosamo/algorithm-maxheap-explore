public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Node root1 = initData1();
        Node root2 = initData2();

        root1.printNode();
        root2.printNode();
    }

    private static Node initData1(){

        Node root = new Node(30);

        root.setLeftNode(new Node(15));
        root.setRightNode(new Node(20));

        Node depth1Left = root.getLeftNode();
        Node depth1Right = root.getRightNode();

        depth1Left.setLeftNode(new Node(3));
        depth1Left.setRightNode(new Node(5));

        depth1Right.setLeftNode(new Node(17));
        depth1Right.setRightNode(new Node(1));

        return root;
    }

    private static Node initData2(){

        Node root = new Node(100);

        root.setLeftNode(new Node(50));
        root.setRightNode(new Node(30));

        Node depth1Left = root.getLeftNode();
        Node depth1Right = root.getRightNode();

        depth1Left.setLeftNode(new Node(45));
        depth1Left.setRightNode(new Node(30));

        depth1Right.setLeftNode(new Node(70));
        depth1Right.setRightNode(new Node(60));

        Node depth2Left1 = depth1Left.getLeftNode();
        Node depth2Right1 = depth1Left.getRightNode();

        Node depth2Left2 = depth1Right.getLeftNode();
        Node depth2Right2 = depth1Right.getRightNode();

        depth2Left1.setLeftNode(new Node(10));
        depth2Left1.setRightNode(new Node(6));

        depth2Right1.setLeftNode(new Node(25));
        depth2Right1.setRightNode(new Node(20));

        depth2Left2.setLeftNode(new Node(40));
        depth2Left2.setRightNode(new Node(15));

        depth2Right2.setLeftNode(new Node(1));
        depth2Right2.setRightNode(new Node(55));

        return root;
    }

    private static void printNode(Node root, int depth){

        System.out.println("depth: " + depth + ", value " +  root.getValue());

        if(root.getLeftNode() != null ){
            printNode(root.getLeftNode(), depth + 1);
        }

        if(root.getRightNode() != null){
            printNode(root.getRightNode(), depth + 1);
        }
    }
}
