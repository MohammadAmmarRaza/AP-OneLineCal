import java.util.Scanner;
public class calc{
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        String calc = calculator.nextLine();
        int length=calc.length();

        StringBuffer num = new StringBuffer(), operator = new StringBuffer();
        for (int i=0; i<calc.length(); i++)
        {
            if (Character.isDigit(calc.charAt(i)))
                num.append(calc.charAt(i));

            else
                operator.append(calc.charAt(i));
        }
        int operator_Index = calc.indexOf(String.valueOf(operator));
        String num1;
        String num2;
        num1 = calc.substring(0,operator_Index);
        num2= calc.substring(operator_Index+1,length) ;
        if (calc.contains("+")) {
            System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
        }
        else  if (calc.contains("-")) {
            System.out.println(Integer.parseInt(num1)-Integer.parseInt(num2));
        }
        else  if (calc.contains("*")) {
            System.out.println(Integer.parseInt(num1)*Integer.parseInt(num2));
        }
        else if (calc.contains("/")) {
            if (Integer.parseInt(num2)>0){

                System.out.println(Integer.parseInt(num1)/Integer.parseInt(num2));
            }
            else{
                System.out.println("Math Error!");
            }

        }
        else {
            System.out.println("Invalid Operation!");
        }


    }
}