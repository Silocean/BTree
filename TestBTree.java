/**
 * Created by Silocean on 2016-03-18.
 */
public class TestBTree {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.insert(tree, 5, "buzhidao");
        tree.insert(tree, 8, "xiaonan");
        tree.insert(tree, 3, "xi");
        tree.insert(tree, 4, "bai");
        tree.insert(tree, 7, "amier");
        tree.insert(tree, 0, "lizhicheng");
        tree.insert(tree, 1, "chalibai");
        tree.insert(tree, 9, "nenglishi");
        String result = tree.search(3);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("result not found!");
        }
    }
}
