package Visa.vises;

import Visa.applicant.Applicant;

import java.util.Date;

public class BusinessVisa extends VisaApplication {

    private String visaType="Business";
    private String companyName;
    private String positionInCompany;
    private boolean isInvitationLetter;
    private Date returnDate;


    public BusinessVisa(Applicant applicant, String purpose, Date dateToEnter, String companyName,
                        String positionInCompany, boolean isInvitationLetter, Date returnDate) {
        super(applicant, purpose, dateToEnter);
        this.companyName = companyName;
        this.positionInCompany = positionInCompany;
        this.isInvitationLetter = isInvitationLetter;
        this.returnDate = returnDate;
    }

    @Override
    public boolean giveVisa() {
        if(isInvitationLetter)
            return true;
        return false;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public String getVisaType() {
        return visaType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPositionInCompany() {
        return positionInCompany;
    }

    public boolean isInvitationLetter() {
        return isInvitationLetter;
    }
}

