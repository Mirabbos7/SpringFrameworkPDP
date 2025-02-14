package uz.pdp.springframework;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Before("execution(* uz.pdp.springframework.Performance.perform(..))")
    public void silencingPhone() {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* uz.pdp.springframework.Performance.perform(..))")
    public void takingSeats() {
        System.out.println("Taking a Seat");
    }

    @AfterReturning("execution(* uz.pdp.springframework.Performance.perform(..))")
    public void applause() {
        System.out.println("\uD83D\uDC4F\uD83C\uDFFB\uD83D\uDC4F\uD83C\uDFFB\uD83D\uDC4F\uD83C\uDFFB\uD83D\uDC4F\uD83C\uDFFB\uD83D\uDC4F\uD83C\uDFFB");
    }

    @After("execution(* uz.pdp.springframework.Performance.perform(..))")
    public void leave() {
        System.out.println("leave concert Hall");
    }

    @AfterThrowing("execution(* uz.pdp.springframework.Performance.perform(..))")
    public void refund() {
        System.out.println("Refund.........\uD83E\uDD2C\uD83E\uDD2C");
    }


}
