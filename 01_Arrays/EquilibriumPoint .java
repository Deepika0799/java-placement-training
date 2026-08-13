class EquilibriumPoint {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 1};

        for (int i = 0; i < arr.length; i++) {

            int left = 0;
            int right = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                left = left + arr[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < arr.length; j++) {
                right = right + arr[j];
            }

            if (left == right) {
                System.out.println("Equilibrium point at index: " + i);
            }
        }
    }
}