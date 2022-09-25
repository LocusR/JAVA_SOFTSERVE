public class TASK3 {
        public static int century(int year) {
            int cuntutyC = 0;
            while(year > 0) {
                year -= 100;
                cuntutyC++;
            }
            return cuntutyC;
        }
}
