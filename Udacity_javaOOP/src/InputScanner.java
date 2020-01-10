import java.util.Scanner;

public class InputScanner {


    public void WhatAddress(){
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }
    }

    public void WhatGrade(){
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }
    }

    public static void main(String[] args) {
        InputScanner obj = new InputScanner();

        obj.WhatGrade();
    }
}
