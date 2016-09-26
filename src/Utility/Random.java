package Utility;

/**
 * Created by 777 on 18.06.2016.
 */
public class Random {

    public static int random(int min, int max){
        int range = (max-min)+1;
        return (int) (Math.random()*range)+min;
    }
}
