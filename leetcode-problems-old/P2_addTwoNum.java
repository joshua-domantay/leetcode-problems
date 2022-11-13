class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P2_addTwoNum {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode n2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode r = addTwoNumbers(n1, n2);
        while(r != null) {
            System.out.print(r.val + " ");
            r = r.next;
        }
        System.out.println();

        n1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        n2 = new ListNode(9, new ListNode(6, new ListNode(4, new ListNode(1))));
        r = addTwoNumbers(n1, n2);
        while(r != null) {
            System.out.print(r.val + " ");
            r = r.next;
        }
        System.out.println();

        n1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        n2 = new ListNode(9, new ListNode(6, new ListNode(8)));
        r = addTwoNumbers(n1, n2);
        while(r != null) {
            System.out.print(r.val + " ");
            r = r.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode curr = result;
        int sum = 0, carry = 0;
        while((l1 != null) || (l2 != null) || (carry != 0)) {
            sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = (sum / 10);
            sum %= 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        return result.next;
    }
}
