package MergeTwoSortedLists;

import java.util.Scanner;

/**
 * Created by brightwise on 17/7/22.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { this.val = x; }
}

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if( l1 == null || l2 == null)
            return l1 == null ? l2 : l1;

        ListNode head = l1.val <= l2.val ? l1 : l2;
        ListNode cur1 = head == l1 ? l1 : l2;
        ListNode cur2 = head == l1 ? l2 : l1;

        ListNode pre = null;
        ListNode next = null;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                pre = cur1;
                cur1 = cur1.next;
            } else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null ? cur2 : cur1;
        return head;
    }

    public ListNode generateListNode(String str) {
        if (str.length() <= 2)
            return null;
        String list = str.substring(1, str.length() - 1).trim();
        if (list.equals(""))
            return null;
        String[] numStr =list.split(",");
        ListNode head = null;
        ListNode pre = null;
        for(int i = 0 ; i < numStr.length ; i++) {
            ListNode node = new ListNode(Integer.parseInt(numStr[i].trim()));
            if ( i == 0) {
                head = node;
                pre = node;
            }
            else {
                pre.next = node;
                pre = node;
            }
        }
        return head;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine().trim();
        String line2 = scanner.nextLine().trim();

        Solution solution = new Solution();
        ListNode head1 = solution.generateListNode(line1);
        ListNode head2 = solution.generateListNode(line2);

        ListNode head = solution.mergeTwoLists(head1, head2);

        System.out.print("[");
        while(head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) System.out.print(",");
        }
        System.out.print("]");
    }
}
