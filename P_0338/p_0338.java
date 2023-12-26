public class p_0338 {
    public static void main(String[] args) {
        printArray(countBits(2));
        printArray(countBits(5));
        printArray(countBits(32));
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        int[] bits = new int[32];
        for(int i = 1; i < result.length; i++) {
            if(bits[0] == 0) {
                result[i] = result[i - 1] + 1;
                bits[0]++;
            } else {
                bits[0] = 0;
                for(int j = 1; true; j++) {
                    if(bits[j] == 1) {
                        bits[j] = 0;
                    } else {
                        bits[j] = 1;
                        break;
                    }
                }
                for(int j = 0; j < bits.length; j++) {
                    result[i] += bits[j];
                }
            }
        }
        
        return result;
    }
}
