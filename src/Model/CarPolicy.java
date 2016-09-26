package Model;

import Utility.IllegalPolicyException;

/**
 * Created by 777 on 18.06.2016.
 */

public abstract class CarPolicy extends Policy {

    private double value;
    private int driversAge;
    private int noClaim;
    boolean isFull;

    public CarPolicy(String PolicyNo, int Year, double Value, int DriversAge, int NoClaim, boolean IsFull) throws IllegalPolicyException {
        super(PolicyNo, Year);
        value = Value;
        if (DriversAge > 17 && DriversAge < 99) {
            driversAge = DriversAge;
        } else {
            throw new IllegalPolicyException("Возраст должен быть от 17 до 99");
        }
        noClaim = NoClaim;
        isFull = IsFull;
    }

    public double getValue() {
        return value;
    }

    public int getDriversAge() {
        return driversAge;
    }

    public int getNoClaim() {
        return noClaim;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void setValue(double Value) {
        this.value = Value;
    }

    public void setDriversAge(int DriversAge) throws IllegalPolicyException {
        if (DriversAge > 17 && DriversAge < 99) {
            driversAge = DriversAge;
        } else {
            throw new IllegalPolicyException("Возраст должен быть от 17 до 99");
        }
    }

    public void setNoClaim(int noClaim) {
        this.noClaim = noClaim;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }

    @Override
    public double getPremium() {
        int BASIC_COVER = 100;
        int initial_premium = 0;

        int carPercentage = (int) (value / 100 * 10);
        initial_premium =  BASIC_COVER + carPercentage;

        if (isFull) {
            initial_premium = initial_premium / 100 * 50;
        }

        double no_clames_bonus = 0;
        if (driversAge > 17 && driversAge < 25) {
            initial_premium = initial_premium + (initial_premium  / 100 * 50);
        }
        no_clames_bonus = noClaim + (initial_premium  / 100 * 7.5);


        return initial_premium - no_clames_bonus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("цена машины : ").append(value).append("\n");
        sb.append("Ваш возраст: ").append(driversAge).append("\n");
        sb.append("Года без выдачи страховки: ").append(noClaim).append("\n");
        sb.append("Полная или не полная страховака: ").append(isFull).append("!");
        return sb.toString();
    }
}

/**
 *       CarPolicy 4 поля :
 * value : double - цена машины
 * driversAge : int - возраст водителя
 * noClaim : int - года без выдачи страховки
 * isFull : boolean - полная или не полная страховака
 *
 * driversAge > 17 && < 99 Премиум завис от того полная ли сраховк, является ли
 * водитель молодым(от 17 до 25) и no_clames_bonus за каждый год noClaim 7.5%
 * скидка от premium
 *
 * getPremium() - initial_premium = BASIC_COVER + carPercentage
 * BASIC_COVER = 100
 * carPercentage = 10% от стоимости машины
 *
 * если isFull premium = premiun + 50% of premium
 *
 * если водитель молодой добавить еще 50% от премиума к стоимости премиума
 *
 * отнять noClaims bonus
 */

////        String[] colors = new String[3];
////        colors[0] = "black";
////        colors[1] = "white";
////        colors[2] = "yellow";
//          String[] colors = {"black","white", "yellow"};
//
////        превратить массив в лист
//          ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(colors));
////        String a = (String) arrayList.get(0);
////        содержит ли лист элемент "white"?
//          boolean white = arrayList.contains("white111");
////        добавить в лист
//          arrayList.add("red");
//          arrayList.add("blue");
////        удалить из листа
//          arrayList.remove(1);
////        размер листа
//          arrayList.size();
//
//          System.out.println(white);
