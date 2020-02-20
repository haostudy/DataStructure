package Test.singlyLinkedList;

public class SinglyLinkedList {
    public ListNode Solution(ListNode headA,ListNode headB){
        int length1 = getLength(headA);
        int length2 = getLength(headB);
        while (length1 < length2){
            headB=headB.next;
            length2--;
        }
        while (length1>length2){
            headA=headA.next;
            length1--;
        }
        while (headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }

                return headA;
    }
    private int getLength(ListNode head){
        int length =0;
        while (head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}
