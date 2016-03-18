/**
 * Created by Silocean on 2016-03-18.
 */
public class TestBTree {
	public static void main(String[] args) {
		BTree tree = new BTree();
		tree.insert(5, "buzhidao");
		tree.insert(8, "xiaonan");
		tree.insert(3, "xi");
		tree.insert(4, "bai");
		tree.insert(7, "amier");
		tree.insert(0, "lizhicheng");
		tree.insert(1, "chalibai");
		tree.insert(9, "nenglishi");
		String result = tree.search(5);
		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("result not found!");
		}
	}
}
