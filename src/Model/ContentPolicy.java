package Model;

import Utility.IllegalPolicyException;

/**
 * Created by 777 on 18.06.2016.
 */
public class ContentPolicy extends Policy {

    static double ContentFactor = 0.01;
    double valueOfProperty;
    private double risc;
    boolean run = true;

    public ContentPolicy(String PolicyNo, int Year, double ValueOfProperty, double Risc) throws IllegalPolicyException {
        super(PolicyNo, Year);
        if (valueOfProperty > 0) {
            valueOfProperty = ValueOfProperty;
        } else {
            throw new IllegalPolicyException("Стоимость должна быть больше нуля.");
        }
        if (Risc < 0 || Risc > 1) {
            throw new IllegalPolicyException("Risc должен быть от 0 до 1");
        } else {
            risc = Risc;
        }
        run = false;
    }

    public ContentPolicy(String PolicyNo, int Year) throws IllegalPolicyException {
        super(PolicyNo, Year);
    }

    public double getValueOfProperty() {
        return valueOfProperty;
    }

    public double getRisc() {
        return risc;
    }

    public void setValueOfProperty(Object ValueOfProperty) throws IllegalPolicyException {
        if (ValueOfProperty instanceof Double) {
            if (valueOfProperty > 0) {
                valueOfProperty = (Double) ValueOfProperty;
            } else {
                throw new IllegalPolicyException("Стоимость должна быть больше нуля.");
            }
        } else {
            throw new IllegalPolicyException("Вы должны ввести десятичное число");
        }
    }

    public void setRisc(double Risc) throws IllegalPolicyException {
        if (risc > 0 && risc < 1) {
            risc = Risc;
        } else {
            throw new IllegalPolicyException("Risc должен быть от 0 до 1");
        }
    }

    @Override
    public double getPremium() {
        return valueOfProperty * ContentFactor * (1 + risc);
    }

    @Override
    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Тип страховки: ContentPolicy \n");
        sb.append("Стоимость страховки: ").append(valueOfProperty).append("\n");
        sb.append("Риск: ").append(risc).append("!");
        return sb.toString();
    }
}
