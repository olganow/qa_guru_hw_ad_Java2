package ru.ya.olganow;

import utils.RandomGenerator;

import java.util.List;

public class LotteryTicketClass {
    int numberOfTicket;
    List<Integer> lotteryTicket;

    public LotteryTicketClass(int numberOfTicket, List<Integer> lotteryTicket) {
        this.numberOfTicket = numberOfTicket;
        this.lotteryTicket = lotteryTicket;
    }

    RandomGenerator randomGenerator = new RandomGenerator();

    public void printNumberOfLotteryTicket() {
        System.out.println("Numbers of your lottery ticket " + numberOfTicket +": ");
        for(Integer number : lotteryTicket) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }


    public void updateNumbersOfLotteryTicket() {
        for(int i = 0; i < 6; i++) {
            lotteryTicket.set(i,randomGenerator.getRandomInt(0,10));
        }
        System.out.println("Updated");
        printNumberOfLotteryTicket();
    }

}
