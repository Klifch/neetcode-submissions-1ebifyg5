class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        Stack<Double> fleets = new Stack<>();

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i]; 
        }

        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        for (int[] car : cars) {
            double eta = (double) (target - car[0]) / car[1];
            if (fleets.empty() || eta > fleets.peek()) {
                fleets.push(eta);
            }
        }

        return fleets.size();
    }
}
