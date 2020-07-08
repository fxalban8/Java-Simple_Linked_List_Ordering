package eda.simple.linked.list;



public class SimpleLinkedList {

	Node head;
	
	
	//Node class
	public class Node {
		Node next;
		int value;
	
		//Constructor
		public Node(int x) {
			this();
			this.value=x;
			
		}
		
		public Node() {
			this.next=null;
		}
		
		
	
		
		
	}
	public void insertBeginning(int val) {
		Node newNode= new Node(val);
		newNode.next=this.head;
		this.head=newNode;
	}
	
	private void insertAfter(int index, int val) {
		Node newNode= new Node(val);
		//go through the list until finding the index
		Node current = this.head;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		//once the index of the node is found, we insert the new Node after this node
		newNode.next=current.next;
		current.next=newNode;
		
		
		
	}
	
	
	public void addElement(int val) {
		if(head==null) {
			head= new Node(val);
		}else {
			if(head.value>=val) {	//if the Head's value is greater than the new Node's value
				this.insertBeginning(val);
			}else {
				Node current = head;
				int index=1; 
				
				while(current.next!=null) {	//verifying there are more elements next to the current one {
					if (current.next.value<val) {	//if we can still go through the list
						current=current.next;
						index++;
					}else {
						break;	//if not, break the cycle
					}
				//once we are in the node whose position is before the node we are placing...
				
				}
				
				this.insertAfter(index, val);
				
				}
								
			}
	}
	
		
	
	public void showElements() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.value+ " --> ");
			current=current.next;
		}
		System.out.println(current);
	}
	
	public void deleteElements(int val) {
		//Node current=head;
		if(head.value==val) {
			
			this.head=head.next;
			System.out.println("Value "+ val+ " has been deleted");
			//current=null;
			
		}else {
			Node current=head;
			while(current.next!=null&&current.next.value<val) {
				current=current.next;	//keep going through the list
			}
			
			if(current.next.value==val) {
				Node after= current.next.next;	
				current.next.next=null;
				current.next=after;
				System.out.println("Value "+ val+ " has been deleted");
			}else {
				System.out.println("Value "+ val+ " NOT found");
					
			}
			
		}
	}
	
	
	//MAIN 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList sll1 = new SimpleLinkedList();
		sll1.addElement(8);
		sll1.showElements();
	
		sll1.addElement(6);
		sll1.showElements();
					
		sll1.addElement(7);
		sll1.showElements();
		
		sll1.addElement(2);
		sll1.showElements();
		
		sll1.addElement(7);
		sll1.showElements();
		
		sll1.addElement(9);
		sll1.showElements();
		
		sll1.addElement(5);
		sll1.showElements();
		
		sll1.addElement(0);
		sll1.showElements();
		
		sll1.addElement(0);
		sll1.showElements();
		
		sll1.addElement(2);
		sll1.showElements();
		
		sll1.addElement(5);
		sll1.showElements();
		
		
		sll1.addElement(1);
		sll1.showElements();
		
		
		sll1.addElement(7);
		sll1.showElements();
		
		
		sll1.addElement(-1);
		sll1.showElements();
		
		sll1.deleteElements(0);
		sll1.showElements();
		
		sll1.deleteElements(-1);
		sll1.showElements();


		sll1.deleteElements(7);
		sll1.showElements();
		
		sll1.deleteElements(8);
		sll1.showElements();
		
		
		
		
	}

}
