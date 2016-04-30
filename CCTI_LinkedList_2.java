/*
kth to last element in linked list 
time - O(n)
space - O(1)
*/

public LinkedListNode void nthToLast(LinkedListNode head, int k){
	//check initial null condition 
    if(head == null)
    	return null;
    LinkedListNode p1 = head;
    LinkedListNode p2 = head;
	// create k spaces between pointers 
    for(int i=0;i<k-1;k++){
    	if(p2 == null)
    		return null;
    	p2= p2.next;
    } 
    if(p2 == null)
    	return null
	//move both pointers till reach end of list
	while(p2!=null){
		p1 = p1.next;
		p2 = p2.next;
	}
	return p1;
}