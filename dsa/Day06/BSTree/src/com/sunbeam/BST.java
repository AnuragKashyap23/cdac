package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create a newnode with given data
		Node newnode = new Node(value);
		//2. if BSTree is empty
		if(root == null)
			// add newnode into root itself
			root = newnode;
		//3. if BSTree is not empty
		else {
			//3.1 create a trav refereance and start at root node
			Node trav = root;
			while(true) {
				//3.2 compare value with current node data
				//3.2.1 if value is less than current node data
				if(value < trav.data) {
					// if left of current node is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					// if left of current node is not empty
					else
						// go into left of current node
						trav = trav.left;
				}
				//3.2.2 if value is greater or equal than current node data
				else {
					// if right of current node is empty
					if(trav.right == null) {
						// add newnode into right of current node
						trav.right = newnode;
						break;
					}
					// if right of current node is not empty
					else
						// go into right of current node
						trav = trav.right;
				}
			}//3.3 repeat step 3.2 untill node is added into BSTree
		}
	}
	
	private void preOrder(Node trav) {
		//0. stop is trav is null
		if(trav == null)
			return;
		System.out.print(" " + trav.data);		//1. visit
		preOrder(trav.left);					//2. left sub tree
		preOrder(trav.right); 					//3. right sub tree
	}
	
	public void preOrder() {				// wrapper method
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
	
	public void inOrder(Node trav) {
		//0. stop is trav is null
		if(trav == null)
			return;
		inOrder(trav.left);						//2. left sub tree
		System.out.print(" " + trav.data);		//1. visit
		inOrder(trav.right); 					//3. right sub tree
	}
	
	public void inOrder() {				// wrapper method
		System.out.print("InOrder : ");
		inOrder(root);
		System.out.println("");
	}
	
	public void postOrder(Node trav) {
		//0. stop is trav is null
		if(trav == null)
			return;
		postOrder(trav.left);					//2. left sub tree
		postOrder(trav.right); 					//3. right sub tree
		System.out.print(" " + trav.data);		//1. visit
	}
	
	public void postOrder() {				// wrapper method
		System.out.print("PostOrder : ");
		postOrder(root);
		System.out.println("");
	}
	
	public boolean searchNode(int key) {
		//1. create trav and start at root node
		Node trav = root;
		while(trav != null) {
			//2. compare key with current node
			if(key == trav.data)
				//2.1 if key is matching return true
				return true;
			//3. if key is less than current node data
			else if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current node data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat till leaf node of the tree
		//6. if key is not found
		return false;
	}
	
	public void deleteNode(int key) {
		//1. search a key into BStree along with its parent
		Node trav = root, parent = null;
		while(trav != null) {
			if(key == trav.data)
				break;
			parent = trav;
			if(key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		//2. if key is not found then return
		if(trav == null)
			return;
		//3. if key is found then delete it
		//3.1 node having two childs
		if(trav.left != null && trav.right != null) {
			//3.1.1 find predecessor
			Node pred = trav.left;
			parent = trav;
			while(pred.right != null) {
				parent = pred;
				pred = pred.right;
			}
			//3.1.2 replace node data by predecessor data
			trav.data = pred.data;
			//3.1.3 delete predecessor (mark)
			trav = pred;
		}
		//3.2 node having single child (left child)
		if(trav.right == null) {
			if(trav == root)
				root = trav.left;
			else if(trav == parent.left)
				parent.left = trav.left;
			else if(trav == parent.right)
				parent.right = trav.left;
		}
		//3.3. node having single child (right child)
		else 	// if(trav.left == null) 
		{
			if(trav == root)
				root = trav.right;
			else if(trav == parent.left)
				parent.left = trav.right;
			else if(trav == parent.right)
				parent.right = trav.right;
		}
	}
	
	public void DFSTraversal() {
		//0. create stack to push nodes
		Stack<Node> st = new Stack<BST.Node>();
		//1. push root on stack
		System.out.print("DFS Traversal : ");
		st.push(root);
		while(!st.isEmpty()) {
			//2. pop node from stack
			Node trav = st.pop();
			//3. visit node
			System.out.print(" " + trav.data);
			//4. if right exist, push
			if(trav.right != null)
				st.push(trav.right);
			//5. if left exist, push
			if(trav.left != null)
				st.push(trav.left);
		}//6.  while stack is not empty
		System.out.println("");
	}
	
	public void BFSTraversal() {
		//0. create queue to push nodes
		Queue<Node> q = new LinkedList<BST.Node>();
		//1. push root on queue
		System.out.print("BFS Traversal : ");
		q.offer(root);		// push()
		while(!q.isEmpty()) {
			//2. pop node from stack
			Node trav = q.poll();	// pop()
			//3. visit node
			System.out.print(" " + trav.data);
			//4. if left exist, push
			if(trav.left != null)
				q.offer(trav.left);
			//5. if right exist, push
			if(trav.right != null)
				q.offer(trav.right);
		}//6.  while queue is not empty
		System.out.println("");
	}
	
	public void deleteAll() {
		root = null;
	}
	
}













