public class p_0771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
        System.out.println(numJewelsInStones("aA", "aAAbbbAbab"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char x : stones.toCharArray()) {
            if(jewels.indexOf(x) != -1) {
                count++;
            }
        }
        return count;
    }
}
