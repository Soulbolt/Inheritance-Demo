/******************Object Oriented************************
 * Program for a fitness club that has two types
 * of memberships - VIP and Normal. To demonstrate
 * derived classes, parent, child, methods, protected
 * fields, getter and setter, constructors, polymorphism,
 * arrays, and calculated discount based on membership.
 ********************************************************/





package inheritancedemo;



public class Main {

    public static void main(String[] args) {

       /* Member[] clubMembers = new Member[6]; //to Demonstrate Polymorphism

        clubMembers[0] = new NormalMember("James", 1, 2010);
        clubMembers[1] = new NormalMember("Andy", 2, 2011);
        clubMembers[2] = new NormalMember("Bill", 3, 2011);
        clubMembers[3] = new VIPMember("Carol", 4, 2012);
        clubMembers[4] = new VIPMember("Evelyn", 5, 2012);
        clubMembers[5] = new Member("Yvonne", 6, 2013);

        for (Member m : clubMembers) { //for statement to calculate the annual fee of each member and display the information

            m.calculateAnnualFee();
            m.displayMemInfo();

        }*/
        NormalMember mem1 = new NormalMember("James", 1, 2010); //to show inheritance
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
                                            //comment out in exchange Polymorphism block
        mem1.displayMemInfo();
        mem2.displayMemInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
    }
    }
//}  //to end block for polymorphism code
