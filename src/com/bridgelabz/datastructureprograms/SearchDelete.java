/******************************************************************************
 *  Purpose : Search and delete element using linked list
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   12-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.io.FileReader;
import java.io.FileWriter;

public class SearchDelete {
	private Node head;
    private int size=0;
	public static void main(String[] args) {
		try {
			
			SearchDelete list=new SearchDelete();
			FileReader reader=new FileReader("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/searchdeletefile.txt");
			    int character;
	            String split="";
			
	            for(character=0;(character=reader.read())!=-1;character++) {
	            	
	            	split=split+(char) character;
	            }
	            
	            String[] searchString = split.split(",");
	           
	            for(int index=0;index<searchString.length;index++) {
	            	   list.addList(searchString[index]);
	            }
	            System.out.println("List element of  file : ");
	            list.viewList();
	            
	            System.out.println();
	            list.searchdata("aa");
	           // list.deleteAtPosition(3);
	            list.viewList();
	            
	            System.out.println();
	            list.searchdata("ap");
	            list.viewList();
	            
	            System.out.println();
	            list.addFile();
	           reader.close();
	          
		}catch (Exception e) {
			System.out.println("file is empty");
		}

	}
	    class Node{
	   	    private String string;
	   	    private Node next;
	   	    public Node(){
	   	    string=null;
	   	    next=null;
	   	    }
	   	   
	   	    public Node(String string,Node next) {
	   	    this.string=string;
	   	    this.next=next;
	   	    }
	    }
	    public void addList(String string) {
	    	Node newNode=new Node();
	    	newNode.string=string;
	    	
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
	    
	    public void viewList() {
	    	
	    	if(head==null) {
	    		System.out.println("List is empty : ");
	    	}else {
	    		Node temp=head;
	    		while(temp!=null) {
	    			System.out.print(temp.string+" ");
	    			temp=temp.next;
	    		}
	    	}
	    }
	    public void deleteFirst() {
	    	if(head==null) {
	    		System.out.println("List is empty : ");
	    	}else {
	    		head=head.next;
	    	}
	    	size--;
	    }
	    public void deleteLast() {
	    	Node temp=head;
	    	for(int index=1;index<size-1;index++) {
	    		temp=temp.next;
	    	}
	    	temp.next=null;
	    	size--;
	    }
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
	    public void searchdata(String string) {
	    	Node temp=head;
	    	int count=0;
	    	int position=1;
	    	while(temp!=null) {
	    	if(temp.string.equals(string)) {
	    		count=1;
	    		deleteAtPosition(position);
	    	}
	    	position=position+1;
	    	temp=temp.next;
	      }
	    	if(temp==null && count==0) {
	    	  addList(string);
	    	}else {
	    		System.out.println("element is not insert : ");
	    	}
	    	
	    }
	    public void addFile() {
	    	try {
	    		 FileWriter write=new FileWriter("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/searchdeletefile.txt");
		            Node temp=head;
		            while(temp!=null) {
		            	write.write(temp.string+" ");
		            	temp=temp.next;
		            }
		            write.close();
	    	}catch (Exception e) {
				System.out.println("file is empty : ");
			}
	    }

}
