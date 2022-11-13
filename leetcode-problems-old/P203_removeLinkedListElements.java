class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P203_removeLinkedListElements {
    public static void main(String[] args) {
        ListNode n = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        printAndRemove(n, 6);
        n = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4)))));
        printAndRemove(n, 3);
        n = new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
        printAndRemove(n, 2);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1, head);
        ListNode curr = head, prev = newHead;
        while(curr != null) {
            if(curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return newHead.next;
    }

    public static void printAndRemove(ListNode n, int val) {
        ListNode n2 = n;
        while(n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();
        n = removeElements(n2, val);
        while(n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();
    }
}
