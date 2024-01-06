public class p_1184 {
    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 1));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 2));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 3));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,1}, 0, 2));
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,1}, 3, 1));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        return Math.min(getDistance(distance, start, destination), getDistance(distance, destination, start));
    }

    public static int getDistance(int[] distance, int start, int destination) {
        int dist = 0, x = start;
        while(start != destination) {
            dist += distance[start];
            start = (start  + 1) % distance.length;
        }
        return dist;
    }
}