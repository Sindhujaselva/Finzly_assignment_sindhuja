package Fxtrading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class  tradinr {
    static List<FXTradingProgram> customers = new ArrayList<>();
    static int globaltradenumber = 1;


    static class FXTradingProgram {
        private static String cusname;
        private static String curpair;
        private static int amt;
        private static float rate;

        public String getCusname() {
            return cusname;
        }

        public  String getCurpair() {
            return curpair;
        }

        public static int getAmt() {
            return amt;
        }

        public static float getRate() {
            return rate;
        }

        public FXTradingProgram(String cusname, String curpair, int amt, float rate) {
            this.cusname = cusname;
            this.curpair = curpair;
            this.amt = amt;
            this.rate = rate;
        }
    }

        public static void bookTrade() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name:");
            String a = sc.next();
            System.out.println("enter the pari:");
            String b = sc.next();
            if (!b.equalsIgnoreCase("usdinr")) {
                System.out.println("only usdinr is allower.");
            }
            System.out.println("enter the amt:");
            int c = sc.nextInt();
            System.out.println("enter the rate:");
            int d = sc.nextInt();
            System.out.println("do you want to book");
            String ab = sc.next();
            if (ab.equalsIgnoreCase("yes")) {
                System.out.println("ye stransfered");

            } else {
                System.out.println("trade is cancelled");
            }
//            FXTradingProgram customer = new FXTradingProgram(cusname, curpair, amt, rate);
//            customers.add(customer);
            globaltradenumber++;

        }

        private static void printTrade55() {
            System.out.println("trade no " + " cusname");

//            System.out.printf("%s%s%d%s%n", getCusname(), getCurpair(), getAmt(), getRate());

        }


        public static void main(String[] args) {

            Scanner ab = new Scanner(System.in);
            do {
                System.out.println("1. Book Trade");
                System.out.println("2. Print Trades");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int option = ab.nextInt();
                switch (option) {
                    case 1:
                        bookTrade();
                        break;
                    case 2:
                        printTrade55();
                        break;
                    case 3:
                        System.out.println("do u want to exit");
                        String cd = ab.next();
                        if (cd.equalsIgnoreCase("yes")) {
                            System.out.println("Bye - have a good day");
                            return;
                        }
                        break;


                    default:
                        System.out.println("Invalid choice. Please select a valid option.");

                }
            } while (true);


        }


    }


