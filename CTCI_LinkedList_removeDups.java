/*
remove duplicate from linked list without using extra space 
space - O(1)
time - O(n^2)
*/
public static void removeDups(LinkedListNode head){
    if(head == null)
    	return ;
    LinkedListNode current = head;
    
   while(current!=null){
   	LinkedListNode runner = current;
   	 while(runner!=null){
    	if(runner.next.data == current.data){
    		runner.next = runner.next.next;
    	}
    	else{
    		runner=runner.next;
    	}
    	
    }
    current = current.next;
   }
    
}
