package Visa.visacanter;

import Visa.vises.BusinessVisa;
import Visa.vises.ImmigrantVisa;
import Visa.vises.VisaApplication;

public class VisaCanter {


    private VisaApplication visaApplication;

    public VisaCanter(VisaApplication visaApplication) {
        this.visaApplication = visaApplication;
    }


    public boolean applyToVisa(VisaApplication visaApplication){

     return visaApplication.giveVisa();

    }
}
