package RemoveDuplicatesFromSortedList;

import java.util.Scanner;

/**
 * Created by brightwise on 17/8/6.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;

        while(cur != null) {
            if (pre.val == cur.val) {
                cur = cur.next;
            } else {
                pre.next = cur;
                pre = cur;
                cur = cur.next;
            }
        }
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
        String line = scanner.nextLine().trim();

        Solution solution = new Solution();
        ListNode ahead = solution.generateListNode(line);
        ListNode head = solution.deleteDuplicates(ahead);

        System.out.print("[");
        while(head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) System.out.print(",");
        }
        System.out.print("]");
    }
}