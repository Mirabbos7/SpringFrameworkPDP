package uz.pdp.springframework;

import java.util.Random;

public class Performance {
    public void perform(){
        Random random = new Random();

        if (random.nextBoolean()) {
            System.out.println("performing well..");
        }else
            throw new RuntimeException("Performed Bad");
    }

}