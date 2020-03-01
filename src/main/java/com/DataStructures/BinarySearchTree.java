package com.DataStructures;

class TreeNode {

	int data;
	public TreeNode leftchild;
	public TreeNode rightChild;

	public TreeNode(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value == data) {
			return;
		}
		if (value < data) {
			if (leftchild == null) {
				leftchild = new TreeNode(value);
			} else {
				leftchild.insert(value);
			}
		} else {
			if (rightChild == null) {
				rightChild = new TreeNode(value);
			} else {
				rightChild.insert(value);
			}
		}
	}

	public void travserseInOrder() {
		if(leftchild != null) {
			leftchild.travserseInOrder();
		}
		System.out.print(data + ",");
		if(rightChild != null) {
			rightChild.travserseInOrder();
		}
	}
	
	public void travsersePreOrder() {
		if(leftchild != null) {
			System.out.print(data + ",");
			leftchild.travsersePreOrder();
		}
		
		if(rightChild != null) {
			System.out.print(data + ",");
			rightChild.travsersePreOrder();
		}
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(TreeNode leftchild) {
		this.leftchild = leftchild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

}

class Tree {
	TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}
	
	public void travserseInOrder() {
		if(root != null) {
			root.travserseInOrder();
		}
	}
	
	public void travsersePreOrder() {
		if(root != null) {
			root.travserseInOrder();
		}
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		Tree t1 = new Tree();
		t1.insert(16);
		t1.insert(19);
		t1.insert(13);
		t1.insert(11);
		t1.insert(15);
		t1.insert(17);
		System.out.println("\n\nInorder");
		t1.travserseInOrder();
		System.out.println("\n\nPreorder");
		t1.travsersePreOrder();

	}

}
