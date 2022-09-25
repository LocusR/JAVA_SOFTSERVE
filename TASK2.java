public class TASK2 {

        public static boolean isLeapYear(int year) {
            if (year % 4 == 0){
                if (year % 100 != 0) {
                    return true;
                }
                else {
                    if (year % 400 == 0){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            } else {
                return false;
            }

        }

        public static void main(String[] args) {
            System.out.println(isLeapYear(1952));
            System.out.println(isLeapYear(1974));
            System.out.println(isLeapYear(2020));
            System.out.println(isLeapYear(2000));
            System.out.println(isLeapYear(1900));

        }

}
