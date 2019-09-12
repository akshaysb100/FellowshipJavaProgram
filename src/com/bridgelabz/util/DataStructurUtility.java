package com.bridgelabz.util;

import java.io.FileWriter;
import java.util.Scanner;

public class DataStructurUtility<T> {
	
	public T obj;  
	public void add(T obj){
		this.obj=obj;
	}  
	public T get(){
		return obj;
	}
	
	
	 Node head = null;
	 int size;
   
	 Scanner scanner=new Scanner(System.in);
		
	    /**
	     * purpose : create function to Accept the integer values from user
	     * 
	     * @return : value return integer value
	     */
	    
	    public int scanInt() {
	    	
	    	
	      int value = scanner.nextInt();
		return value;
		}

	    /**
	     * purpose : create function to Accepstringt the String values from user
	     * 
	     * @return : value return String value
	     */
	    
	    public  String scanString() {
	    	String value = scanner.next();
	    	return value;
	    }
	    public double scanDouble() {
	    	double value=scanner.nextDouble();
	    	return value;
	    }
		
		/**
		 * purpose : Dynamically Add and Delete String list and integer list
		 * 
		 * @author admin Akshay
		 *
		 */
		 class Node{
			private T data;
	   	   // private T string;
	   	    private Node next;
	   	    
	   	    public Node() {
	   	    data=null;
	   	    next=null;
	   	    }
	   	    public Node(T data,Node next) {
	   	    	this.data=data;
	   	    	this.next=next;
	   	    	
	   	    }
	   	    
	   	  /* 
	   	    public Node(String string,Node next) {
	   	    this.string=string;
	   	    this.next=next;
	   	    }
	   	    */
	    }
		
		
		 /**
		  * purpose : this function used to add string at first posititon 
		  * 
		  * @param string : string element
		 */
		public void addFirst(T string) {
			Node newNode=new Node();
			newNode.data=string;
			if(head==null) {
				head=newNode;
			}else {
				Node temp=newNode;
				temp.next=head;
				head=temp;
				
			}
			size++;
		}
		
		
		 /**
		  * purpose : this function used to add string list dynamically
		  * 
		  * @param string : string element
		 */
		public void addList(T string) {
		    	Node newNode=new Node();
		    	newNode.data=string;
		    	
		    	if(head==null) {
		    		head=newNode;
		    	}else {
		    	   Node	temp=head;
		    	   while(temp.next!=null) {
		    		   temp=temp.next;
		    	   }
		    	   temp.next=newNode;
		    	}
		    	size++;
		    }
		
		
		 /**
		  * purpose : this function used to add string at position number in list
		  * 
		  * @param string : string element
		 */
		public void addAdPosition(String string) {
			
		}
		    
		    /**
		     * purpose : this function used for display the string elements in list
		     * 
		     */
		    public void viewList() {
		    	
		    	if(head==null) {
		    		System.out.println("List is empty : ");
		    	}else {
		    		Node temp=head;
		    		while(temp!=null) {
		    			System.out.print(temp.data+" ");
		    			temp=temp.next;
		    		}
		    	}
		    }
		    
		    
		    /**
		     * purpose : this function used to delete first element in string list
		     * 
		     */
		    public void deleteFirst() {
		    	if(head==null) {
		    		System.out.println("List is empty : ");
		    	}else {
		    		head=head.next;
		    	}
		    	size--;
		    }
		    
		    
		    /**
		     * purpose : this function used to delete last element in string list
		     * 
		     */
		    public void deleteLast() {
		    	Node temp=head;
		    	for(int index=1;index<size-1;index++) {
		    		temp=temp.next;
		    	}
		    	temp.next=null;
		    	size--;
		    }
		    
		    
		    /**
		     * purpose : this function used to delete the element at position in string list
		     * 
		     * @param position : postion number of delete element
		     * 
		     */
		    public void deleteAtPosition(int position) {
		    	if(position==1) {
		    		deleteFirst();
		    	}else if(position==size) {
		    		deleteLast();
		    	}else if(position>1 && position<=size-1){
		    		Node temp,temp1;
		    		temp=head;
		    		for(int index=1;index<position-1;index++) {
		    			temp=temp.next;
		    		}
		    		temp1=temp.next;
		    		temp.next=temp1.next;
		    		
		    	}else {
		    		System.out.println("position is not found : ");
		    	}
		    	size--;
		    }
		    
		    
		    /**
		     * purpose : this function used to search string element in list if string element is not found 
		     *           than add the string element in list else if string element is found than delete the
		     *           string element in list
		     *           
		     * @param string : serching element in list
	 	     */
		    public void searchData(T string) {
		    	Node temp=head;
		    	int count=0;
		    	int position=1;
		    	while(temp!=null) {
		    	if(temp.data.equals(string)) {
		    		count=1;
		    		deleteAtPosition(position);
		    	}
		    	position=position+1;
		    	temp=temp.next;
		      }
		    	if(temp==null && count==0) {
		    	  addList(string);
		    	}
		    	
		    }
		    
		    /**
		     * purpose : this function used to add string element in file using linke list
		     * 
		     */
		    public  void addFile() {
		    	try {
		    		 FileWriter write=new FileWriter("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/SearchDeleteAdd.txt");
			            Node temp=head;
			            while(temp!=null) {
			            	write.write(temp.data+",");
			            	temp=temp.next;
			            }
			            write.close();
		    	}catch (Exception e) {
					System.out.println("Not write anythink in file : ");
				}
		    }
		    
		    /**
			  * purpose : this function used to add integer data at first posititon 
			  * 
			  * @param data :  this element is added in list
			 */
			public void addFirst1(T data) {
				Node newNode=new Node();
				newNode.data=data;
				if(head==null) {
					head=newNode;
				}else {
					Node temp=newNode;
					temp.next=head;
					head=temp;
					
				}
			}
			
			/**
			 * purpose : this function used to add integer data at last posititon 
			 * 
			 * @param data : this element is added in list
			 */
			public void addLast(T data) {
		    	Node newNode=new Node();
		    	newNode.data=data;
		    	
		    	if(head==null) {
		    		head=newNode;
		    	}else {
		    	   Node	temp=head;
		    	   while(temp.next!=null) {
		    		   temp=temp.next;
		    	   }
		    	   temp.next=newNode;
		    	}
		    	size++;
		    }
		
			
			public void inseartAtPosition(T data,int postion) {
			
			 if(postion>1 && postion<=size){
					Node newNode = new Node();
					newNode.data=data;
					Node temp = head;
					
					for(int i=1;i<postion-1;i++) {
					    temp=temp.next;	
					}
					newNode.next=temp.next;
					temp.next=newNode;
				}
				size++;
			}
		
		
			/**
		     * purpose : this function used for display the integer elements in list
		     * 
		     */
		    public void printList() {
		    	
		    	if(head==null) {
		    		System.out.println("List is empty : ");
		    	}else {
		    		Node temp=head;
		    		while(temp!=null) {
		    			System.out.print(temp.data+" ");
		    			temp=temp.next;
		    		}
		    	}
		    }
		    
		    
		    /**
		     * purpose : this function used to search string element in list if string element is not found 
		     *           than add the string element in list else if string element is found than delete the
		     *           string element in list
		     *           
		     * @param string : serching element in list
	 	     */
		    public void search(T data) {
		    	Node temp=head;
		    	int count=0;
		    	int position=1;
		    	while(temp!=null) {
		    	if(temp.data==data) {
		    		count=1;
		    		deleteAtPosition(position);
		    	}
		    	position=position+1;
		    	temp=temp.next;
		      }
		    	if(temp==null && count==0) {
		    	  addLast(data);
		    	}
		    	
		    }
		    
		    /**
		     * purpose : this function is used for finding the index number of your elements 
		     * 
		     * @param data : searching element in list
		     * @return : return index number
		     */
		    
		    public  int index(T data) {
		    	Node search=head;
		    	int count=0;
		    	int index=0;
		    	while(search != null) {
		    		if(search.data==data) {
		    			index=count;
		    		  break;
		    		}
		    		count++;
		    		search=search.next;
		    	}
		    	return index;
		    }
		    
		
		    

}
