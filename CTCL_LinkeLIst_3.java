CTCL_LinkeLIst_3.java
/*
 Delete a node in middle of linked list given only access to that node
*/

 public static boolean deleteNode(LinkedListNode n){
 	//if no node exists i.e. linkedlist is empty or consists of only one node
 	if(n == null || n.next == null)
 		return false;
 	n.data = n.next.data;
 	n.next = n.next.next;
 	return true;
 }