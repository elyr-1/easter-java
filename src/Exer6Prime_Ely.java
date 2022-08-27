//Manlagnit, Ely Rick
//Exercise 6

public class Exer6Prime_Ely {

    public static void main(String[] args) {
        int j, n;
        System.out.println("The first 100 prime numbers are: ");
        //increment i up to 541
        for (int i = 2; i <= 541; i++) {
            //n is the number of factors
            n = 0;
            //increment j up to i
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    n++;
                }
            }
            //prime number has only 2 factors, 1 and itself
            if (n == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
