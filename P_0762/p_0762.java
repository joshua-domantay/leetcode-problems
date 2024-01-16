import java.util.ArrayList;

public class p_0762 {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6, 10));
        System.out.println(countPrimeSetBits(10, 15));
        System.out.println(countPrimeSetBits(289051, 294301));
    }

    public static int countPrimeSetBits(int left, int right) {
        ArrayList<Integer> primes = getPrimes();

        int result = 0, temp, count;
        for(int i = left; i <= right; i++) {
            temp = i;
            count = 0;
            while(temp != 0) {
                if((temp & 1) == 1) {
                    count++;
                }
                temp = temp >> 1;
            }
            if(primes.contains((Integer) count)) {
                result++;
            }
        }

        return result;
    }

    public static ArrayList<Integer> getPrimes() {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);

        int sqrt;
        boolean add;
        for(int i = 7; i <= 64; i++) {
            sqrt = (int) Math.ceil(Math.sqrt(i));
            add = true;
            for(int j = 0; j < primes.size(); j++) {
                if((i % primes.get(j)) == 0) {
                    add = false;
                }
            }
            if(add) { primes.add(i); }
        }
        return primes;
    }
}