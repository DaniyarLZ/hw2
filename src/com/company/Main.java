package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(metodOne(slu4ainost(),Rtemperatura() ));
        System.out.println(metodOne(slu4ainost(),Rtemperatura() ));
        System.out.println(metodOne(slu4ainost(),Rtemperatura() ));
        System.out.println(metodOne(slu4ainost(),Rtemperatura() ));
        System.out.println(metodOne(slu4ainost(),Rtemperatura() ));



    }


    public static String metodOne(int vozrast, int temperatura) {
        System.out.println("возраст " + vozrast + " " + "температура " + temperatura);

        if (vozrast > 20 && vozrast <= 45 && temperatura >= -20 && temperatura <= 30) {
            return ("можно идти гулять");
        } else if (vozrast >= 20 && temperatura <= 0 && temperatura >= 28) {
            return ("можно идти гулять");
        } else if (vozrast < 45 && temperatura < -10 && temperatura >= 25) {
            return ("можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }
    public static int slu4ainost() {
        Random random = new Random();
        return random.nextInt(68);
    }
    public static int Rtemperatura(){
        Random rtemp = new Random();
            return rtemp.nextInt(30);
        }

}
