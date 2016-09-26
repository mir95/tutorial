package Model;

import Utility.IllegalPolicyException;

/**
 * Created by 777 on 15.06.2016.
 */
public class BuildingPolicy extends Policy {

    static double RebuildFactor = 0.001;
    private double risc;
    private double priceRecovery;

    public BuildingPolicy(String PolicyNo, int Year, double Risc, Object PriceRecovery) throws IllegalPolicyException {
        super(PolicyNo, Year);
        if (PriceRecovery instanceof Double) {
            priceRecovery = (Double) PriceRecovery;
            if (risc < 0 || risc > 1) {
                throw new IllegalPolicyException("Вы должны ввести десятичное число");
            } else {
                risc = Risc;
            }
        } else {
            throw new IllegalPolicyException("Вы должны ввести десятичное число");
        }
    }

    public BuildingPolicy(String PolicyNo, int Year) throws IllegalPolicyException {
        super(PolicyNo, Year);
    }

    public double getRisc() {
        return risc;
    }

    public double getpriceRecovery() {
        return priceRecovery;
    }

    public void setRisc(double Risc) throws IllegalPolicyException {
        if (risc > 0 || risc < 1) {
            risc = Risc;
        } else {
            throw new IllegalPolicyException("Risc должен быть десятичным числом от 0 до 1");
        }
    }

    public void setPriceRecovery(Object PriceRecovery) throws IllegalPolicyException {
        if (PriceRecovery instanceof Double) {
            priceRecovery = (Double) PriceRecovery;
        } else {
            throw new IllegalPolicyException("Вы должны ввести десятичное число");
        }
    }

    @Override
    public double getPremium() {
        return priceRecovery * RebuildFactor * (1 + risc);
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append("Риск: ").append(risc).append("\n");
        a.append("Цена восстановления: ").append(priceRecovery);
        return a.toString();
    }
//    System.out.println("Выберите себе номер страховки: " + "\n" + "1. " + "Дом" + "\n" + "2. " + "Имущество" + "\n" + "3. " + "Жизнь" + "\n" + "4. " + "Авто");
//
//        run = true;
//        while (run) {
//            try {
//                policyType = intScan.nextInt();
//                if(policyType<0 || policyType>4){
//                    throw new IllegalPolicyException("Число должно быть от 0 до 4");
//                }
//                run = false;
//            } catch (InputMismatchException b) {
//                System.out.println("Введенные данные должны быть целым числов");
//                intScan = new Scanner(System.in);
//            } catch (IllegalPolicyException e){
//                intScan = new Scanner(System.in);
//                System.out.println("Число должно быть от 0 до 4");
//            }
//        }
//        policyType = intScan.nextInt();
//        Policy policy = null;
//
//        switch (policyType) {
//            case 1:
//                policy = createBuildingPolicy();
//                break;
//            case 2:
//                policy = createContentPolicy();
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            default:
//                break;
//        }
}