package Litcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedList83 {
    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1)));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return current;
    }

}
