class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P21_mergeTwoLists {
    public static void main(String[] args) {
        // ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // ListNode n2 = new ListNode(1, new ListNode(8));
        ListNode n1 = new ListNode(-9, new ListNode(3));
        ListNode n2 = new ListNode(5, new ListNode(7));
        ListNode n3 = mergeTwoLists(n1, n2);
        while(n3 != null) {
            System.out.print(n3.val + " ");
            n3 = n3.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode curr = result;
        while((l1 != null) && (l2 != null)) {
            if(l1.val < l2.val) {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        while(l1 != null) {
            curr.next = new ListNode(l1.val);
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2 != null) {
            curr.next = new ListNode(l2.val);
            l2 = l2.next;
            curr = curr.next;
        }
        return result.next;
    }
}
