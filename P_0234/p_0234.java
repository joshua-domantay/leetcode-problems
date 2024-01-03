import java.util.ArrayList;

public class p_0234 {
    public static void main(String[] args) {
        ListNode test = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(test));
        test = new ListNode(1, new ListNode(2));
        System.out.println(isPalindrome(test));
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode headCopy = head;
        while(headCopy != null) {
            arr.add(headCopy.val);
            headCopy = headCopy.next;
        }

        for(int i = (arr.size() - 1); i >= 0; i--) {
            if(arr.get(i) != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}