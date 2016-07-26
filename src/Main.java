import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Node root1 = initData1();
        Node root2 = initData2();

        root1.printNode();
        root2.printNode();

        getTopNode(root1, 4);
        getTopNode(root2, 10);

    }

    private static void getTopNode(Node root, int k){

        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Node> targetList = new ArrayList<Node>();
        targetList.add(root);

        for(int i = 0 ; i < k ; i ++){
            int maxValue = 0;
            Node popNode = null;
            for(Node node : targetList){
                if(maxValue < node.getValue()){
                    popNode = node;
                    maxValue = node.getValue();
                }
            }
            result.add(maxValue);
            targetList.remove(popNode);
            if(popNode.getRightNode() != null){
                targetList.add(popNode.getRightNode());
            }

            if(popNode.getLeftNode() != null){
                targetList.add(popNode.getLeftNode());
            }
        }

        for(int value : result){
            System.out.print(value + ", ");
        }
        System.out.print("\n");
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
        root.setRightNode(new Node(80));

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

}
