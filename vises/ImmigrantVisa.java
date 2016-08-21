package Visa.vises;


import Visa.applicant.Applicant;

import java.util.Date;

public class ImmigrantVisa extends VisaApplication {

    private String cityToLive;
    private String visaType="Immigrant";
    private boolean isWork;

    public ImmigrantVisa(Applicant applicant, String purpose, Date dateToEnter, String cityToLive, boolean isWork) {
        super(applicant, purpose, dateToEnter);
        this.cityToLive = cityToLive;
        this.isWork = isWork;
    }

    public boolean giveVisa() {
        if(isWork)
            return true;
        return false;
    }

    public boolean isWork() {
        return isWork;
    }
}
