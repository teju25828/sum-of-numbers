//program for adding n natural numbers using while loop
import java.util.Scanner;

public class SumUsingWhile {
    public static void main(String[] args) {
        int i = 1,number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number --> ");
        number = scanner.nextInt();
        long sum = 0;
        while(i<=number){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of numbers from 0 to "+number+" is --> "+sum);
    }
}
