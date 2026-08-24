import java.util.Scanner;

public class bin2dec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 8-Bit binary number, only 1s and 0s are allowed");
        String binary = sc.nextLine();
        int results = 0;
        if(binary.length() > 8){
            System.out.println("Error: Please enter 8 numbers or less");
            return;
        }

        boolean isValid = true;

        for(int i = 0; i < binary.length(); i++){
            char currentChar = binary.charAt(i);

            if(currentChar != '0' && currentChar != '1'){
                System.out.println("Error: Please enter only 0s and 1s");
                isValid = false;
                break;
            }
            int digit = currentChar - '0';
            int power = binary.length() - 1 - i;
            results += digit * Math.pow(2, power);
        }
        if (isValid){
            System.out.println("Decimal value:" + results);
        }


    }    
}