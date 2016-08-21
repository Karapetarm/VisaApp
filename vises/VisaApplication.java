package Visa.vises;


import Visa.applicant.Applicant;

import java.util.Date;

public abstract class VisaApplication  {

    private Applicant applicant;
    private String purpose;;
    private Date dateToEnter;

       public VisaApplication(Applicant applicant, String purpose, Date dateToEnter) {
        this.applicant = applicant;
        this.purpose = purpose;
        this.dateToEnter = dateToEnter;
    }


    public abstract boolean giveVisa();

    public Applicant getApplicant() {
        return applicant;
    }

    public String getPurpose() {
        return purpose;
    }

    public Date getDateToEnter() {
        return dateToEnter;
    }
}
