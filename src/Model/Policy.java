package Model;

/**
 * Created by 777 on 15.06.2016.
 */

import Utility.IllegalPolicyException;
import java.util.Calendar;
import static Utility.Common.cal;

public abstract class Policy {

    private String policyNo;
    private int year;

    public Policy(String PolicyNo, int Year) throws IllegalPolicyException {
        policyNo = PolicyNo;

        if (Year >= 1990 && Year <= cal.get(Calendar.YEAR)) {
            year = Year;
        } else {
            throw new IllegalPolicyException("Год должен быть от 1990 до " + cal.get(Calendar.YEAR));
        }
    }

    public abstract double getPremium();

    public void PolicyNo() {

    }

    public String getPolicyNo() {
        return policyNo;
    }

    public int getYear() {
        return year;
    }

    public void setPoliceNo(String PolicyNo) throws IllegalPolicyException {

        char firstLetter = PolicyNo.charAt(0);
        if (firstLetter != 'A' && firstLetter != 'C' && firstLetter != 'L' || firstLetter != 'V') {
            throw new IllegalPolicyException("Первый символ должен быть одним из:"
                    + "A,C,L,V");
        }

        int year = Integer.valueOf(PolicyNo.substring(1, 5));
        if (year > 1990 && year < 2016) {
        } else {
            throw new IllegalPolicyException("Год должен быть от 1990 до " + cal.get(Calendar.YEAR));
        }

        if (PolicyNo.length() != 9) {
            throw new IllegalPolicyException("Номер страховки должен быть из 9 симвлов");
        }
        this.policyNo = PolicyNo;
    }

    public void setYear(int Year) throws IllegalPolicyException{

        if (year < 1990 || year > 2016 ){
            throw new IllegalPolicyException("Год должен быть от 1990 до " + cal.get(Calendar.YEAR));
        }else{
            this.year = Year;
        }
    }

    @Override
    public String toString() {
        //StringBuilder
        return year + ", " + policyNo;
    }
}