package Model;

import Utility.IllegalPolicyException;

/**
 * Created by 777 on 18.06.2016.
 */
public abstract class LifePolicy extends Policy {

    int ownerAge;
    int moneyCover;
    double risc;
    int threshold = 30;
    double p;
    double BASIC_AMOUNT;

    public LifePolicy(String PolicyNo, int Year, int OwnerAge, int MoneyCover, double Risc) throws IllegalPolicyException {
        super(PolicyNo, Year);
        ownerAge = OwnerAge;
        moneyCover = MoneyCover;
        if (risc < 0 && risc > 5) {
            throw new IllegalPolicyException("Risc должен быть десятичным числом от 0 до 5");
        } else {
            risc = Risc;
        }

        BASIC_AMOUNT = (moneyCover / 1000) * 10;
        p = (BASIC_AMOUNT * 1 + risc);
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public int getMoneyCover() {
        return moneyCover;
    }

    public double getRisc() {
        return risc;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public void setMoneyCover(int moneyCover) {
        this.moneyCover = moneyCover;
    }

    public void setRisc(double risc) throws IllegalPolicyException {
        if (risc < 0 && risc > 5) {
            throw new IllegalPolicyException("Risc должен быть десятичным числом от 0 до 5");
        } else {
            this.risc = risc;
        }
    }

    @Override
    public double getPremium() {
        if (p < threshold) {
            return p;
        } else {
            threshold = (int) (p * ownerAge / threshold);
            return threshold;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ваш возраст: ").append(ownerAge).append("\n");
        sb.append("Сумма выплаты: ").append(moneyCover).append("\n");
        sb.append("Риск: ").append(risc).append("!");
        return sb.toString();
    }
}

/**
 * 3 дополнительных поял:
 * - ownerAge: int - возраст покупателя
 * - moneyCover: int - сумма выплаты
 * - risk: double - риск того что что то слуиться (от 0..5)
 * - int threshold = 30
 * BASIC_AMOUNT - 10$ за куждую 1000$
 * p = BASIC_AMOUNT * 1+risk
 *
 * getPremium()
 * если возраст меньше threshold то вернуть  "p"
 * else p*ownerAge/threshold
 */