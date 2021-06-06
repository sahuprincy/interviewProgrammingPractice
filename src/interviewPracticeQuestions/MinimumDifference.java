package interviewPracticeQuestions;

public class MinimumDifference {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(12);
		root.right = new TreeNode(56);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(46);
		root.right.right = new TreeNode(88);

		int minimumDifference = getMinimumDifference(root);
		System.out.println(minimumDifference);
	}

	public static int getMinimumDifference(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return helper(root);
	}
/**
 * 1. if root.left !=null,  left = root.left
 * 2. while (left!=null && left.right!=null)
 * 3. left = root.right
 * 4. Math.min(val,root.val- left.val)
 * 
 * */
	public static int helper(TreeNode root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int val = Integer.MAX_VALUE;
		if (root.left != null) {
			TreeNode left = root.left;
			while (left != null && left.right != null) {
				left = left.right;
			}
			val = Math.min(val, root.val - left.val);
		}
		if (root.right != null) {
			TreeNode right = root.right;
			while (right != null && right.left != null) {
				right = right.left;
			}
			val = Math.min(val, right.val - root.val);
		}
		return Math.min(val, Math.min(helper(root.left), helper(root.right)));
	}

}
