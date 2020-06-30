package inheritancedemo;

public class VIPMember extends Member {

    public VIPMember(String pName, int pMemberID, int pMemberSince) {

        super(pName, pMemberID, pMemberSince);
    }

    @Override
    public void calculateAnnualFee() { //Method

        annualFee = (1-0.01*getDiscount())*1200;

    }
}
