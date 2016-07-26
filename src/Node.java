import java.util.ArrayList;

/**
 * Created by babosamo on 2016. 7. 25..
 */
public class Node {

    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void printNode(){
        ArrayList<ArrayList<Integer>> valueList = new ArrayList<ArrayList<Integer>> ();
        findNodeDepth(this, 0, valueList);
        for(ArrayList<Integer> depthList :valueList){
            System.out.print("# " );
            for(int value : depthList){
                System.out.print(value + ",");
            }
            System.out.print("\n" );
        }
        System.out.print("\n" );
    }

    private void findNodeDepth(Node node, int depth, ArrayList<ArrayList<Integer>> valueList){

        ArrayList<Integer> depthList = null;
        if(valueList.size() > depth){
            depthList = valueList.get(depth);
        }else{
            depthList = new ArrayList<Integer>();
            valueList.add(depth, depthList);
        }

        depthList.add(node.getValue());
        if(node.getLeftNode() != null ){
            findNodeDepth(node.getLeftNode(), depth + 1, valueList);
        }

        if(node.getRightNode() != null) {
            findNodeDepth(node.getRightNode(), depth + 1, valueList);
        }
    }
}
