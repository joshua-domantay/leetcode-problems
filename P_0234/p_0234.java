import java.util.ArrayList;

public class p_0234 {
    public static void main(String[] args) {
        // ListNode test = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        // System.out.println(isPalindrome(test));
        // test = new ListNode(1, new ListNode(2));
        // System.out.println(isPalindrome(test));
        // test = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(1))));
        // System.out.println(isPalindrome(test));
        // test = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        // System.out.println(isPalindrome(test));
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int arrSize = arr.size();
        for(int i = 0; i < (arrSize / 2); i++) {
            if(arr.get(i) != arr.get(arrSize - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}