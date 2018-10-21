import java.io.IOException;
import java.util.Scanner;

public class Show{
    public static void main(String[] args) throws IOException {
        Converter cn = new Converter();
        cn.Converter();

        System.out.println("Выберите операцию: " + "\n" + "1.Доллар перевести в тенге" + "\n" + "2.Тенге перевести в доллар" + "\n");
        Scanner sn1 = new Scanner(System.in);
        int vibor = sn1.nextInt();

        if(vibor==1){
            System.out.println("Введите сумму в долларах: ");
            Scanner sn2 = new Scanner(System.in);
            cn.dollar = sn2.nextInt();
            double counttenge = cn.courseUSA*cn.dollar;
            System.out.println(cn.dollar + "$" + " будет " + counttenge + "тг по курсу " + cn.courseUSA);
        }

        else if(vibor==2){
            System.out.println("Введите сумму в тенге: ");
            Scanner sn3 = new Scanner(System.in);
            cn.tenge = sn3.nextInt();
            double countdollar = Math.round(cn.tenge/cn.courseUSA);
            System.out.println(cn.tenge + "тг" + " будет " + countdollar + "$ по курсу " + cn.courseUSA);
        }
    }
}
