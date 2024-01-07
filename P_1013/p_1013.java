public class p_1013 {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1}));
        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,7,9,-1,2,0,1}));
        System.out.println(canThreePartsEqualSum(new int[]{3,3,6,5,-2,2,5,1,-9,4}));
        System.out.println(canThreePartsEqualSum(new int[]{1,-1,1,-1}));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        if((sum % 3) != 0) {
            return false;
        }

        int partitionSum = sum / 3;
        int partSum = arr[0], start = 0, count = 0;;
        for(int i = 1; i < arr.length; i++) {
            if(partSum == partitionSum) {
                partSum = 0;
                start = i;
                count++;

                if(count == 2) { return true; }
            }

            partSum += arr[i];
            start = i;
        }

        return (count >= 2);
    }
}
