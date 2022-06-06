package javaLogin;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        int ps = 4718, lg = 2000;
        int balance = 1000000, balanceUsd = 0, balanceRuble = 0, balanceEuro = 0;
        String history1 = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter Login: ");
        Scanner scan1 = new Scanner(System.in);
        int log = scan1.nextInt();
        System.out.println("Enter Password: ");
        int pass = scan1.nextInt();

        if (pass == ps && log == lg){
            System.out.println("Welcome " + name + "\n");
            while (true){
                System.out.println("Menu\n" + "-------------\n");
                System.out.println("Choose an option below:\n");
                System.out.println("1.Balance\n" + "2.Money Withdraw\n" + "3.Money Add\n" + "4.Reset Password\n" + "5.Exchange\n" + "6.History\n" + "7.Payment\n");
                int op = scan1.nextInt();
                switch (op){
                    case 1: {
                        System.out.println("Which balance:\n" + "1.UZS\n" + "2.USD\n" + "3.Euro\n" + "4.Ruble\n");
                        int op2 = scan1.nextInt();
                        switch (op2){
                            case 1: {
                                System.out.println("Your UZS balance " + balance + " UZS");
                                break;
                            }
                            case 2: {
                                System.out.println("Your USD balance " + balanceUsd + " USD");
                                break;
                            }
                            case 3: {
                                System.out.println("Your Euro balance " + balanceEuro + " Euro");
                                break;
                            }
                            case 4: {
                                System.out.println("Your Ruble balance " + balanceRuble + " Ruble");
                                break;
                            }
                        } break;
                    }
                    case 2: {
                        System.out.println("Enter how much money you want to withdraw:\n");
                        int with = scan1.nextInt();
                        if (with <= balance){
                            System.out.println("Operation is done\n");
                            balance = balance - with;
                            System.out.println("Current balance: " + balance + " UZS");
                            history1 = history1 + "From your balance " + with + " UZS withdrawed from your UZS balance\n ";
                        } else {
                            System.out.println("You don't have enough balance!\n");
                        } break;
                    }
                    case 3: {
                        System.out.println("Enter how much money you want to add to your UZS account:\n");
                        int add = scan1.nextInt();
                        balance += add;
                        history1 = history1 + add + "UZS added to your account";
                        System.out.println("Operation is done\n" + "Now you have " + balance + " UZS in your account\n");
                        break;
                    }
                    case 4: {
                        System.out.println("To change your password, you have to confirm your old password\n");
                        System.out.println("Enter our password\n");
                        int oldPassword = scan1.nextInt();
                        if (oldPassword == pass) {
                            System.out.println("Enter new password\n");
                            int newPassword = scan1.nextInt();
                            history1 = history1 + " Your old password: " + pass + " changed to " + newPassword + "\n";
                            newPassword = pass;
                        } else {
                            System.out.println("Password is incorrect!!!\n");
                        } break;
                    }
                    case 5: {
                        System.out.println("Choose an operation from menu:\n");
                        System.out.println("1.UZS -> USD\n" + "2.UZS -> Euro\n" + "3.UZS -> Ruble\n");
                        int op3 = scan1.nextInt();
                        switch (op3){
                            case 1: {
                                System.out.println("$1 = 10,900.00 UZS\n");
                                System.out.println("Enter the amount to convert\n");
                                int usd = scan1.nextInt();
                                balance -= usd;
                                history1 = history1 + "You have converted " + usd + "UZS to USD and it added to your USD account\n";
                                usd /= 10900;
                                balanceUsd += usd;
                                System.out.println("Operation is done.\n" + "Current USD amount: " + "$" + balanceUsd + " USD\n");
                                break;
                            }
                            case 2: {
                                System.out.println("1 Euro = 12,042.79 UZS\n");
                                System.out.println("Enter the amount to convert\n");
                                int euro = scan1.nextInt();
                                balance -= euro;
                                history1 = history1 + "You have converted " + euro + "UZS to Euro and it added to your Euro account\n";
                                euro /= 12042;
                                balanceEuro += euro;
                                System.out.println("Operation is done.\n" + "Current Euro amount: " + balanceEuro + " Euro\n");
                                break;
                            }
                            case 3: {
                                System.out.println("1 Ruble = 99.00 UZS\n");
                                System.out.println("Enter the amount to convert\n");
                                int ruble = scan1.nextInt();
                                balance -= ruble;
                                history1 = history1 + "You have converted " + ruble + "UZS to Ruble and it added to your Ruble account\n";
                                ruble /= 99;
                                balanceRuble += ruble;
                                System.out.println("Operation is done.\n" + "Current Ruble amount: " + balanceRuble + " Ruble\n");
                                break;
                            }
                        } break;
                    }
                    case 6: {
                        System.out.println(history1);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter your mobile number:\n ");
                        int number = scan1.nextInt();
                        System.out.println("Enter a value:\n");
                        int value = scan1.nextInt();
                        System.out.println("Operation is done.\n");
                        history1 = history1 + value + "UZS sent to " + number + "\n";
                        balance -= value;
                        break;
                    }
                }
            }
        } else {
            System.out.println("Login or Password is incorrect. Try again!");
        }
    }
}

