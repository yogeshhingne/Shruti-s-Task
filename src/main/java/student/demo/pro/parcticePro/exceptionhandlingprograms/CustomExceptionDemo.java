package student.demo.pro.parcticePro.exceptionhandlingprograms;

import student.demo.pro.parcticePro.exception.InsufficientFundException;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        double accountBalance=10000;

        System.out.println("Please enter your choice \n 1)Withdraw \n 2)Deposit");
        Scanner sc =new Scanner(System.in);
        int ch=sc.nextInt();
        switch (ch){
            case 1: {
                System.out.println("Enter the withdraw amount");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount <= accountBalance) {
                    System.out.println("Your transaction is successful");
                    accountBalance=accountBalance-withdrawAmount;
                    System.out.println("AccountBalance after withdraw is " + accountBalance);
                } else {
                    throw new InsufficientFundException("You don't have that much account balance");
                }
                break;
            }
            case 2:
                System.out.println("Enter the amount you want to deposit");
                double depositAmount= sc.nextDouble();
                System.out.println("You have successfully deposited amount");
                accountBalance= accountBalance+depositAmount;
                System.out.println("AccountBalance after deposit is " + accountBalance);
        }
    }
}
