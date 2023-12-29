public class p_0869 {
    public static void main(String[] args) {
        System.out.println(reorderedPowerOf2(1));
        System.out.println(reorderedPowerOf2(10));
        System.out.println(reorderedPowerOf2(512));
        System.out.println(reorderedPowerOf2(81));
        System.out.println(reorderedPowerOf2(125));
        System.out.println(reorderedPowerOf2(46));
    }

    public static boolean reorderedPowerOf2(int n) {
        int numDigits = 0;
        int[] nums = new int[10];
        while(n > 0) {
            numDigits++;
            nums[n % 10]++;
            n /= 10;
        }
        int[] numsCopy = nums.clone();

        int target = 1;
        while(countDigits(target) != numDigits) {
            target *= 2;
        }
        
        int targetCopy = target;
        while(countDigits(target) == numDigits) {
            while(targetCopy > 0) {
                if(numsCopy[targetCopy % 10] <= 0) {
                    break;
                }
                numsCopy[targetCopy % 10]--;
                targetCopy /= 10;
            }

            if(targetCopy == 0) {
                return true;
            }

            numsCopy = nums.clone();
            target *= 2;
            targetCopy = target;
        }

        return false;
    }

    public static int countDigits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}