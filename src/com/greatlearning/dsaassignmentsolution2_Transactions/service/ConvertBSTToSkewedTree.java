package com.greatlearning.dsaassignmentsolution2_Transactions.service;

public class ConvertBSTToSkewedTree {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void BSTToSkewedTreeConversion(Node root)
	{
	
		if(root == null)
		{
			return;
		}
	
		BSTToSkewedTreeConversion(root.left);
		Node rightNode = root.right;
//		Node leftNode = root.left;
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		BSTToSkewedTreeConversion(rightNode);
	}

	static void traverseConvertedSkewedTree(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		traverseConvertedSkewedTree(root.right);	
	}
	
	public static void main(String[] args) {
		ConvertBSTToSkewedTree tree = new ConvertBSTToSkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
	
		BSTToSkewedTreeConversion(node);
		traverseConvertedSkewedTree(headNode);

	}

}
