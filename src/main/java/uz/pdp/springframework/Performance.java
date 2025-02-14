package uz.pdp.springframework;

import java.util.Random;

public class Performance {
    public void perform(){
        // turn off phones
        // take a seat
        Random random = new Random();

        if (random.nextBoolean()) {
            System.out.println("performing well..");
        }else
            throw new RuntimeException("Performed Bad");
        /*
         *  clap clap /// applause
         *  complaining about a action
         * */
    }

}