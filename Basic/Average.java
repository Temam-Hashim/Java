public class Average {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 2, 10, 3 };
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
