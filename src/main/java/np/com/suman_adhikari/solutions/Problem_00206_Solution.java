package np.com.suman_adhikari.solutions;


public class Problem_00206_Solution {


    /**
     * 206. Reverse Linked List
     *
     * <a href="https://leetcode.com/problems/reverse-linked-list">206. Reverse Linked List</a>
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode reversed = null;

        ListNode node = head;

        while (node != null) {

            ListNode n = new ListNode(node.val);

            n.next = reversed;
            reversed = n;

            node = node.next;
        }

        return reversed;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
