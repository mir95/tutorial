//package Temp;
//
///**
// * Created by 777 on 12.07.2016.
// */
//
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
///**
// * Created by 777 on 19.06.2016.
// */
//public static class Human {
//
//    int i = 0;
//
//    int random(int min, int max){
//        int range = (max-min)+1;
//        return (int) (Math.random()*range)+min;
//    }
//
//    private int years;
//    private String surname;
//    private String name;
//    int parole;
//    private ArrayList<Human> friends;
//
//    public Human (String Surname, String Name){
//        surname = Surname;
//        name = Name;
//        years = random(20,40);
//        parole = random(111111,999999);
//        friends = new ArrayList();
//    }
//
//    public Human (){
//        years = random(20,40);
//        parole = random (111111,999999);
//        friends = new ArrayList();
//    }
//
//    public Human (int Years, String Surname, String Name, int Parole){
//
//        years = random (20, 40);
//        surname = Surname;
//        name = Name;
//        parole = random (111111,999999);
//        friends = new ArrayList();
//    }
//
//    public Human get(int index){
//        return friends.get(index);
//    }
//
//    public void setFriends(ArrayList<Human>friends){
//        this.friends = friends;
//    }
//
//    public void remove(int index){
//        friends.remove(index);
//    }
//
//    public void addFriend (Human friend){
//        if(friend != this){
//            friends.add(friend);
//            System.out.println(friend);
//        }
//    }
//
//    public int getYears(){
//        return years;
//    }
//
//    public void setYears(int Years){
//        years = Years;
//    }
//
//    public String getSurname(){
//        return surname;
//    }
//
//    public void setSurname(String Surname){
//        this.surname = Surname;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String Name){
//        this.name = Name;
//    }
//
//    public int getParole(){
//        return parole;
//    }
//
//    public void setParole(int Parole){
//        parole = Parole;
//    }
//
//    @Override
//    public String toString(){
//        String a = "";
//        return "                 "+years+","+surname+","+name+"\n";
//    }
//}
//
///**
// * Created by 777 on 15.06.2016.
// * Singleton class
// * Класс который может быть инстанциирован только один раз
// */
//public static class Director extends Person{
//
//    //классовые переменные
//    public static Director instance;
//
//    //Делаем конструктор приватным, чтобы запретить создание экзепляров вне предела класса
//    private Director(String Name, int Age){
//        super( Name, Age);
//    }
//
//    //Статичный метод для создания экземпляра от класса
//    //Если не было созданно ни одного экземпляра класса (объекта) - создать его, сохранить временную
//    // instance и вернуть.
//    //Иначе просто веpнуть то что находится в instace
//    public static Director getIncetance(String Name, int Age){
//        if(instance==null){
//            instance =  new Director(Name, Age);
//        }
//        return instance;
//    }
//}
//
///**
// * Created by 777 on 15.06.2016.
// */
//static class Person {
//
//    private String firstname;
//    private int age;
//    private String lastnme;
//
//    Person(String firstname, int age) {
//        this.firstname = firstname;
//        this.age = age;
//    }
//
//    Person(){
//
//    }
//
//    Person(String firstname, String lastname) {
//        this.firstname = firstname;
//        this.lastnme = lastname;
//    }
//
//    Person(String firstname, int age, String lastname) {
//        this.firstname = firstname;
//        this.lastnme = lastname;
//        this.age= age;
//    }
//
//    Person(String firstname) {
//        this.firstname = firstname;
//    }
//
//    Person(int age) {
//        this.age = age;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//    public String getFirstname(boolean something) {
//        System.out.println();
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getLastnme() {
//        return lastnme;
//    }
//
//    public void setLastnme(String lastnme) {
//        this.lastnme = lastnme;
//    }
//
//    @Override
//    public String toString() {
//        return "Director{" +
//                "firstname='" + firstname + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
///**
// * Created by 777 on 19.06.2016.
// */
//public static class Wall {
//
//    public static void main(String [] wall){
//
//        //Задание:
//        //Использовать Exception handling для ввода паролей
//        //Убедиться что пароль не начинаеться с цифры и содержит $
//        String surname = "";
//        String name = null;
//        int parole = -1;
//        int years = 0;
//        boolean run = true;
//        String d = "";
//        Scanner intScan = new Scanner(System.in);
//        Scanner stringScan = new Scanner(System.in);
//
//        System.out.println("Регистрация ");
//        // выкидывает java.util.InputMismatchException еслт введенные данные
//        //не сходятся с ожидаемыми
//
//        System.out.println("  Возраст:");
//        while(run){
//            try{
//                years = intScan.nextInt();
//                run = false;
//            }catch (InputMismatchException e){
//                //e.getLocalizedMessage();
//                //e.printStackTrace();
//                System.out.println("Вы должны ввести целое число!");
//                intScan = new Scanner (System.in);
//            }
//        }
//
//        run = true;
//        while(run){
//            try{
//                System.out.println("\n"+"Фамилия:");
//                surname = stringScan.nextLine();
//                try{
//                    int temp = Integer.valueOf(surname);
//                    System.out.println("фамилия должна состоять только из букв");
//                }catch (NumberFormatException e){
//                    run = false;
//                }
//            }
//            catch (InputMismatchException a){
//                System.out.println("фамилия должна состоять только из букв");
//                stringScan = new Scanner(System.in);
//            }
//        }
//
//        run = true;
//        while(run){
//            System.out.println("\n"+"Имя:");
//            name = stringScan.nextLine();
//            boolean start = name.startsWith("1");
//            boolean names = name.contains(".");
//            if (!start)
//                System.out.println("В начале имени должно быть ( 1 )");
//            if(!names)
//                System.out.println("В имени должно быть символ точка ( . )");
//            if(start && names){
//                run = false;
//            }
//        }
//
//        run = true;
//        while(run){
//            try {
//                System.out.println("\n"+"Введите пароль:");
//                parole = intScan.nextInt();
//                System.out.println("Повторите пароль");
//                int parol = intScan.nextInt();
//                run = true;
//                while (run){
//                    if (parole == parol){
//                        System.out.println("Пароль совпадает");
//                        run = false;
//                    }else{
//                        System.out.println("Пароль не совпадает");
//                        System.out.println("\n"+"Введите пароль:");
//                        parole = intScan.nextInt();
//                        System.out.println("Повторите пароль");
//                        parol = intScan.nextInt();
//                    }
//                }
//            }
//            catch (InputMismatchException b){
//                System.out.println("Вы должны ввести целые числа!");
//                intScan = new Scanner (System.in);
//            }
//        }
//        //        System.out.println("Добавь себе друзей из списка ");
//
//        Human human1 = new Human(years, surname, name, parole);
//        System.out.println("\n"+"    !!!Поздравляю вы успешно создали аккаунт!!! "
//                +"\n"+"                "+ "   Ваши данные: ");
//        System.out.println("      Возраст: "+years+" Фамилия: "+surname+" Имя: "+name+"\n"+"                   Ваши друзья:");
//
//        Human human2 = new Human("Мусаев", "Иса");
//        Human human3 = new Human("Мусаев", "Эми");
//
//        ArrayList<Human> users = new ArrayList();
//        users.add(human1);
//        users.add(human2);
//        users.add(human3);
//
//        human1.addFriend(users.get(1));
//        human1.addFriend(users.get(2));
//        human1.addFriend(users.get(0));
//    }
//}
