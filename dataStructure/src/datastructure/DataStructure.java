/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructure;

/**
 *
 * @author suraj
 */
class listNode{
    int val;
    listNode next;
    listNode(){}
    listNode(int val){
        this.val=val;
    }
    listNode (int val,listNode next){
        this.val=val;
        this.next=next;
    }
    
}
class Solution{
    public listNode removeNthFromEnd(listNode head, int n){
        if(head.next==null){
            return null;//if linked is empty return null
        }
        int size=0;
        listNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;//hold number of element in linked list
        }
        int indexToSearch=size-n;
        listNode prev=head;
        int i=1;
        while(i<indexToSearch){
        prev=prev.next;
        i++;
        
    }
        prev.next=prev.next.next;
        return head;
        
        
    }
}
public class DataStructure {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
