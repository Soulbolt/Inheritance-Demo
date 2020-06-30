package inheritancedemo;

public class NormalMember extends Member { //Use of extends Member is to indicate NormalMember derived from Member class

    public NormalMember(String pName, int pMemberID, int pMemberSince) {

        super(pName, pMemberID, pMemberSince);
    }

    @Override
    public void calculateAnnualFee() {

        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }
}
