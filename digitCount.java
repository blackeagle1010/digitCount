import java.util.Scanner;

public class digitCount {

    public static void main(String[] args) {
        int Num, total=0, remainder;
        Scanner Input=new Scanner (System.in);
        System.out.println("Enter a number:");
        Num=Input.nextInt();
        do {
            remainder=Num%10;
            Num=Num/10;
            total=total+remainder;
        }while (remainder>0);
        System.out.println("Number total digits count:"+total);
    }
}
