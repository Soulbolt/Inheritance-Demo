package inheritancedemo;

import java.util.Scanner;

public class Member {

    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member() {

        System.out.println("Parent Constructor with no parameter");     //Constructor1
    }

    public Member(String pName, int pMemberID, int pMemberSince) {      //Constructor2 assigns parameters
                                                                        // of the private fields in the Member class
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }
    //Method1
    public double getDiscount() {

        return discount;
    }
    //Method2
    public void setDiscount() {

        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");  //ask user for password
        password = input.nextLine();

        if (!password.equals("abcd")) { //if password does not match, print next line

            System.out.println("Invalid password. You do not have authority  to edit the discount.");
        } else {

            System.out.print("Please enter the discount: ");    //if password matches, ask user to enter discount
            discount = input.nextInt();
        }
    }
    //Method3
    public void displayMemInfo() {

        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);

    }
    //Method4
    public void calculateAnnualFee() {

        annualFee = 0;

    }
}