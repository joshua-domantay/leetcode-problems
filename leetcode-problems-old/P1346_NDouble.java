public class P1346_NDouble {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10,2,5,3}));
        System.out.println(checkIfExist(new int[]{7,1,14,11}));
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }

    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = (i + 1); j < arr.length; j++) {
                if((2 * arr[i]) == arr[j]) {
                    return true;
                } else if((arr[i] % 2) == 0) {
                    if((arr[i] / 2) == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}