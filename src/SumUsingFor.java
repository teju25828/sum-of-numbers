//program for adding n natural numbers using for loop
import java.util.Scanner;
public class SumUsingFor {

        public static void main(String[] args) {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number --> ");
            number = scanner.nextInt();
            long sum = 0;
            for(int i=1;i<=number;i++){
                sum=sum+i;
            }
            System.out.println("The sum of numbers from 0 to "+number+" is --> "+sum);
        }

}
