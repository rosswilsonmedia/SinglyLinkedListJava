package com.codingdojo.singlylinkedlist;

public class SinglyLinkedList {
    private Node head;
    public SinglyLinkedList() {
    	setHead(null);
    }
    
    public Node getHead() {
    	return head;
    }
    public void setHead(Node head) {
    	this.head = head;
    }
    
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(getHead() == null) {
            setHead(newNode);
        } else {
            Node runner = getHead();
            while(runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(newNode);
        }
    }
    
    public void remove() {
    	Node runner = getHead();
    	while(runner.getNext().getNext()!=null) {
    		runner=runner.getNext();
    	}
    	runner.setNext(null);
    }
    
    public void printValues() {
    	Node runner = getHead();
    	while(runner != null) {
    		System.out.println(runner.getValue());
    		runner = runner.getNext();
    	}
    }
    
    public Node find(int val) {
    	Node runner = getHead();
    	while(runner != null) {
    		if(runner.getValue() == val) {
    			return runner;
    		}
    		runner = runner.getNext();
    	}
    	return null;
    }
    
    public void removeAt(int val) {
    	Node runner = getHead();
    	int i = 0;
    	while(i < val-1 && runner != null) {
    		runner = runner.getNext();
    		i++;
    	}
    	if(runner != null) {
    		runner.setNext(runner.getNext().getNext());
    	}
    }
}