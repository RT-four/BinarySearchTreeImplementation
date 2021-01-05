package rtfour;

import java.lang.invoke.MutableCallSite;

public class Main {
    public static void main(String[] args) {
//
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//        String stringData = "n d w a g";
//
//        String[] data = stringData.split(" ");
//
//        for (String s : data) {
//            list.addItem(new Node(s));
//        }
//        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("Darwin"));
        tree.traverse(tree.getRoot());

    }
}
