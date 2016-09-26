package Model;

import Utility.IllegalPolicyException;

import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by 777 on 18.06.2016.
 */

public class Belay {
    static boolean mainRun = true;
    static boolean run = true;
    static Scanner intScan = new Scanner(System.in);
    static Scanner stringScan = new Scanner(System.in);
    static int policyType;
    static double risc;
    static double value;
    static int Year = -1;
    static int Age = -1;
    static int Money = -1;
    static double Value = -1;
    static double noClaim = -1;
    static double isFull = -1;
    static String B = "b";
    static String C = "c";
    static String L = "l";
    static String V = "v";

    public static void main(String[] Belay) throws IllegalPolicyException {

//        JFrame simpleFrame = new JFrame("Автобиография");
//        simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel gpmPanel = new JPanel();
//        gpmPanel.setBackground(Color.yellow);
//        gpmPanel.setPreferredSize(new Dimension(500, 150));
//
//        JLabel myName = new JLabel("Я Мусаев Ислам Рамзанович");
//        myName.setFont(new Font("Arial", Font.BOLD, 32));
//        JLabel myTeam = new JLabel("родился 17 июля 1998 года в поселке Алды г.Грозный.");
//        myTeam.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 24));
//        gpmPanel.add(myName);
//        gpmPanel.add(myTeam);
//
//        JTextArea txtArea = new JTextArea(5, 40);
//        txtArea.setBackground(Color.BLUE);
//        txtArea.setFont(new Font("Arial", Font.BOLD, 16));
//        String someInfo = "\nпродолжи автобиографию.\n\n";
//        someInfo += ".............";
//        txtArea.setText(someInfo);
//        gpmPanel.add(txtArea);
//
//        simpleFrame.getContentPane().add(gpmPanel);
//        simpleFrame.pack();
//        simpleFrame.setVisible(true);
//
//        JOptionPane.showMessageDialog(simpleFrame, "Эта программа с двумя частями: синяя и желтая");

        System.out.println("Выберите себе номер страховки: " + "\n" + "1. " + "Дом" + "\n" + "2. " + "Имущество" + "\n" + "3. " + "Жизнь" + "\n" + "4. " + "Авто");
        run = true;
        while (run) {
            try {
                policyType = intScan.nextInt();
                if (policyType < 0 || policyType > 4) {
                    throw new IllegalPolicyException("Число должно быть от 0 до 4");
                }
                run = false;
            } catch (InputMismatchException b) {
                System.out.println("Введенные данные должны быть целым числом");
                intScan = new Scanner(System.in);
            } catch (IllegalPolicyException e) {
                intScan = new Scanner(System.in);
                System.out.println("Число должно быть от 0 до 4");
            }
        }

        Policy policy = null;
        switch (policyType) {
            case 1:
                policy = createBuildingPolicy();
                break;
            case 2:
                policy = createContentPolicy();
                break;
            case 3:
                policy = createLifePolicy();
                break;
            case 4:
                policy = createCarPolicy();
                break;
            default:
                break;
        }
    }

    private static Policy createBuildingPolicy() {
        BuildingPolicy result = null;
        while (mainRun) {

            System.out.println("Введите год страховки");
            run = true;
            while (run) {
                try {
                    Year = intScan.nextInt();
                    run = false;
                } catch (InputMismatchException b) {
                    System.out.println("Введенные данные должны быть целым числов");
                    intScan = new Scanner(System.in);
                }
            }
            try {

                run = true;
                while (run) {
                    System.out.println("Введите риск");
                    try {
                        risc = intScan.nextDouble();
                        if (risc < 0 || risc > 1) {
                            throw new IllegalArgumentException();
                        }
                        run = false;
                    } catch (Exception e) {
                        System.out.println("Значение риска должно быть от 0 до 1");
                        intScan = new Scanner(System.in);
                    }
                }

                run = true;
                while (run) {
                    System.out.println("Введите цену востановления: ");
                    try {
                        value = intScan.nextDouble();
                        if (value > 0) {
                            run = false;
                        }
                    } catch (Exception e) {
                        System.out.println("Цена должна быть больше нуля");
                        intScan = new Scanner(System.in);
                    }
                }

                String first = "";
                if (policyType == 1) {
                    first = "A";
                } else if (policyType == 2) {
                    first = "C";
                }
                if (policyType == 3) {
                    first = "L";
                } else if (policyType == 4) {
                    first = "V";
                }

                String policyNumber = first + " " + Year + " " + Utility.Random.random(1000, 9999);
                result = new BuildingPolicy(policyNumber, Year, risc, value);
                System.out.println("Ваша страховка: " + policyNumber + "\n" + result.toString());
                mainRun = false;
            } catch (IllegalPolicyException e) {
                System.out.println("----------------------------");
                System.out.println("Начинаем заново ");
            }
        }
        return result;
    }

    private static Policy createContentPolicy() {
        ContentPolicy result = null;
        while (mainRun) {

            System.out.println("Введите год страховки");
            run = true;
            while (run) {
                try {
                    Year = intScan.nextInt();
                    run = false;
                } catch (InputMismatchException b) {
                    System.out.println("Введенные данные должны быть целым числов");
                    intScan = new Scanner(System.in);
                }
            }

            try {
                run = true;
                while (run) {
                    System.out.println("Введите риск");
                    try {
                        risc = intScan.nextDouble();
                        if (risc < 0 && risc > 1) {
                            throw new IllegalArgumentException("Значение риска должно быть от 0 до 1");
                        }
                        run = false;
                    } catch (Exception e) {
                        System.out.println("Значение риска должно быть от 0 до 1");
                        intScan = new Scanner(System.in);
                    }
                }

                run = true;
                while (run) {
                    System.out.println("Введите стоимость");
                    try {
                        value = intScan.nextDouble();
                        if (value > 0) {
                            run = false;
                        } else {
                            throw new IllegalPolicyException("Стоимость должна быть больше нуля");
                        }
                    } catch (IllegalPolicyException e) {
                        System.out.println(e.getMessage());
                        intScan = new Scanner(System.in);
                    }
                }

                String first = "";
                if (policyType == 1) {
                    first = "A";
                } else if (policyType == 2) {
                    first = "C";
                }
                if (policyType == 3) {
                    first = "L";
                } else if (policyType == 4) {
                    first = "V";
                }

                String policyNumber = first + Year + Utility.Random.random(1000, 9999);
                result = new ContentPolicy(policyNumber, Year, value, risc);
                System.out.println(result.toString());
                mainRun = false;
            } catch (IllegalPolicyException e) {
                System.out.println("----------------------------");
                e.getMessage();
                System.out.println(e.getMessage());
                System.out.println("Начинаем заново ");
            }
        }
        return result;
    }

    private static Policy createLifePolicy() {
        LifePolicy result = null;
        while (mainRun) {
            System.out.println("Введите год страховки");
            run = true;
            while (run) {
                try {
                    Year = intScan.nextInt();
                    run = false;
                } catch (InputMismatchException b) {
                    System.out.println("Введенные данные должны быть целым числов");
                    intScan = new Scanner(System.in);
                }
            }

            try {
                run = true;
                while (run) {
                    System.out.println("Введите ваш возрост: ");
                    try {
                        Age = intScan.nextInt();
                        if (Age > 0) {
                            run = false;
                        } else {
                            throw new IllegalPolicyException("Возраст должен быть больше нуля!");
                        }
                    } catch (Exception e) {
                        System.out.println("Возраст должен быть больше нуля!");
                        intScan = new Scanner(System.in);
                    }
                }

                run = true;
                while (run) {
                    System.out.println("Введите риск");
                    try {
                        risc = intScan.nextDouble();
                        if (risc < 0 && risc > 5) {
                            throw new IllegalArgumentException("Значение риска должно быть от 0 до 1");
                        }
                        run = false;
                    } catch (Exception e) {
                        System.out.println("Значение риска должно быть от 0 до 1");
                        intScan = new Scanner(System.in);
                    }
                }

                run = true;
                while (run) {
                    System.out.println("Введите сумма выплаты денег: ");
                    try {
                        Money = intScan.nextInt();
                        if (Money > 0) {
                            run = false;
                        } else {
                            throw new IllegalPolicyException("Сумма должна быть больше нуля");
                        }
                    } catch (Exception e) {
                        System.out.println("Сумма должна быть больше нуля");
                        intScan = new Scanner(System.in);
                    }
                }

                String first = "";
                if (policyType == 1) {
                    first = "A";
                } else if (policyType == 2) {
                    first = "C";
                }
                if (policyType == 3) {
                    first = "L";
                } else if (policyType == 4) {
                    first = "V";
                }

                String pn = first + " " + Year + " " + Utility.Random.random(1000, 9999);
                result = new LifePolicy(pn, Year, Age, Money, risc) {
                };
                System.out.println("Ваша страховка: " + pn + "\n" + result.toString());
                mainRun = false;
            } catch (Exception e) {
                System.out.println("----------------------------");
                System.out.println("Начинаем заново ");
            }
        }
        return result;
    }

    private static Policy createCarPolicy() {
        CarPolicy result = null;
        while (mainRun) {
            System.out.println("Введите год страховки");
            run = true;
            while (run) {
                try {
                    Year = intScan.nextInt();
                    run = false;
                } catch (InputMismatchException b) {
                    System.out.println("Введенные данные должны быть целым числов");
                    intScan = new Scanner(System.in);
                }
            }

            try {
                System.out.println("Введите цену вашей машины: ");
                run = true;
                while (run) {
                    try {
                        Value = intScan.nextDouble();
                        if (Value > 0) {
                            run = false;
                        } else {
                            throw new IllegalPolicyException("Цена должна быть больше нуля");
                        }
                    } catch (Exception e) {
                        System.out.println("Цена должна быть больше нуля");
                        intScan = new Scanner(System.in);
                    }
                }

                System.out.println("Введите ваш возрост: ");
                run = true;
                while (run) {
                    try {
                        Age = intScan.nextInt();
                        run = false;
                    } catch (Exception e) {
                        System.out.println("Возраст должен быть больше нуля!");
                        intScan = new Scanner(System.in);
                    }
                }

                System.out.println("Введите года без выдачи страховки: ");
                run = true;
                while (run) {
                    try {
                        noClaim = intScan.nextInt();
                        if (noClaim > 0) {
                            run = false;
                        } else {
                            throw new IllegalPolicyException("Года без выдачи страховки должны быть больше нуля!");
                        }
                    } catch (Exception e) {
                        System.out.println("Года без выдачи страховки должны быть больше нуля!");
                        intScan = new Scanner(System.in);
                    }
                }

                System.out.println("\nВыберите себе страховку из списка: \n1 - полная \n2 - частичная");
                run = true;
                while (run) {
                    try {
                        isFull = intScan.nextInt();
                        if (noClaim < 1 || noClaim > 2) {
                            throw new IllegalPolicyException("Число должно быть 1 или 2");
                        }
                        run = false;
                    } catch (InputMismatchException b) {
                        System.out.println("Введенные данные должны быть целым числом");
                        intScan = new Scanner(System.in);
                    } catch (IllegalPolicyException e) {
                        intScan = new Scanner(System.in);
                        System.out.println("Число должно быть от 0 до 1");
                    }
                }

                String first = "";
                if (policyType == 1) {
                    first = "A";
                } else if (policyType == 2) {
                    first = "C";
                }
                if (policyType == 3) {
                    first = "L";
                } else if (policyType == 4) {
                    first = "V";
                }

                String pn = first + " " + Year + " " + Utility.Random.random(1000, 9999);
                result = new CarPolicy(pn, Year, value, Age, Year, run) {
                };
                System.out.println("Ваша страховка: " + pn + "\n" + result.toString());
                mainRun = false;
            } catch (IllegalPolicyException e) {
                System.out.println("----------------------------");
                System.out.println("Начинаем заново ");
            }
        }
        return result;
    }
}
