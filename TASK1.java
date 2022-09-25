public class TASK1 {

        public static int gSum(int number) {
            int sum;
            for(sum = 0; number != 0; number /= 10) {
                sum += number % 10;
            }

            return sum;
        }

        public static void main(String[] args) {
            int numOne = 756;
            System.out.println(gSum(numOne));
        }

}
