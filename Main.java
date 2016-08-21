package Visa;

import Visa.applicant.Applicant;
import Visa.vises.BusinessVisa;
import Visa.vises.VisaApplication;

import java.util.Date;

public class Main {

    public static void main(String []args){
        Applicant applicant1 = new Applicant("Ara","Arayan","Baghramyn 1",true);
        Date date1 = new Date();
       Date date2= new Date();

        VisaApplication visaApplication=new BusinessVisa(applicant1, "purpose", date1, "Google",
               "developer",false, date2);
        System.out.println("You Get Visa  :  "+ visaApplication.giveVisa());


    }

}
