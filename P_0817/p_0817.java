import java.util.HashSet;

public class p_0817 {
    public static void main(String[] args) {
        ListNode test = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        System.out.println(numComponents(test, new int[]{0,1,3}));
        test = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        System.out.println(numComponents(test, new int[]{0,3,1,4}));
    }

    public static int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int x : nums) {
            numSet.add(x);
        }

        int count = 0;
        boolean countStart = false;
        while(head != null) {
            if(numSet.contains(head.val)) {
                countStart = true;
            } else {
                if(countStart) {
                    count++;
                }
                countStart = false;
            }
            head = head.next;
        }
        if(countStart) {
            count++;
        }

        return count;
    }
}