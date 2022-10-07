package udemy.Lesson6;

import java.util.Scanner;

public class numberToWords {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        try (Scanner scan = new Scanner(System.in)) {
            String numberString = Integer.toString(scan.nextInt());
            String orgNumber = "";
            for(int i =0; i<numberString.length(); i++){
                char newNumber = numberString.charAt(i);
                if(newNumber == '1'){
                    orgNumber += "One ";
                }else if (newNumber == '2'){
                    orgNumber += "Two ";
                }else if (newNumber == '3'){
                    orgNumber += "Three ";
                }else if (newNumber == '4'){
                    orgNumber += "Four ";
                }else if (newNumber == '5'){
                    orgNumber += "Five ";
                }else if (newNumber == '6'){
                    orgNumber += "Six ";
                }else if (newNumber == '7'){
                    orgNumber += "Seven ";
                }else if (newNumber == '8'){
                    orgNumber += "Eight ";
                }else if (newNumber == '9'){
                    orgNumber += "Nine ";
                }else{
                    orgNumber += "Zero ";
                }
            }
            System.out.println(orgNumber);
        }
    }
    
}
