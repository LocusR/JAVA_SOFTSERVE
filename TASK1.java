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
            System.out.println(TASK2.isLeapYear(1952));
            System.out.println(TASK2.isLeapYear(1974));
            System.out.println(TASK2.isLeapYear(2020));
            System.out.println(TASK2.isLeapYear(2000));
            System.out.println(TASK2.isLeapYear(1900));
        }

}
