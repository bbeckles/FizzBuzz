import java.util.Scanner;

class FizzBuzz {

    public static void main(String[] args) {
        StartFizzBuzz();
    }

    private static void StartFizzBuzz(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to display : ");

        int fizzBuzzLength = input.nextInt();
        for (int i = 1; i < fizzBuzzLength + 1; i++) {
            if (i == fizzBuzzLength) {
                System.out.print(getNum(i));
            }
            else{
                System.out.print(getNum(i) + ", ");
            }
        }
    }

    private static String getNum(int i) {
        String number = String.valueOf(i);
        if (i % 3 == 0 || i % 5 == 0)
            number = "";
        if (i % 3 == 0)
            number += "Fizz";
        if (i % 5 == 0)
            number += "Buzz";
        return number;
    }
    }





