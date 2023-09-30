


public class TreeProgram {
    public static void main(String[] args) {
        TreeProgram tree = new TreeProgram();
        String[] data = {"Green", "Blue", "Red", "Orange", "Purple", "Violet", "White", "Blue"};

        //Create tree
        tree.buildTree();
        System.out.println("The size of the tree is: " + tree.getSize());


        //Transverse the tree
        System.out.println("In PREORDER");
        tree.printPreOrder();

        System.out.println("\n\nIn INORDER");
        tree.printInOrder();

        System.out.println("\n\nIn POSTORDER");
        tree.printPostOrder();

        System.out.println("\n\nIn BREADTHFIRST");
        tree.printBreadthFirst();



        //Delete specified element
        System.out.println("Remove 'Purple'");
        tree.removeNode("Purple");



        //Transverse the tree AGAIN
        System.out.println("In PREORDER");
        tree.printPreOrder();

        System.out.println("\n\nIn INORDER");
        tree.printInOrder();

        System.out.println("\n\nIn POSTORDER");
        tree.printPostOrder();

        System.out.println("\n\nIn BREADTHFIRST");
        tree.printBreadthFirst();

    }
}