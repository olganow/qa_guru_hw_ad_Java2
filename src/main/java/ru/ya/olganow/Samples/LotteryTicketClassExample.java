package ru.ya.olganow.Samples;

import ru.ya.olganow.Samples.LotteryTicketClass;
import utils.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class LotteryTicketClassExample {

    public static void main(String[] args) {

        LotteryTicketClass someLotteryTicket = new LotteryTicketClass(234,
                getRandomLotteryTicket(6));

        someLotteryTicket.printNumberOfLotteryTicket();
        someLotteryTicket.updateNumbersOfLotteryTicket();
        someLotteryTicket.removeOneNumber();
        someLotteryTicket.addNewNumber();
        someLotteryTicket.searchNumberByIndex();
        someLotteryTicket.doesTheLotteryTicketContainNumber();

    }

    static List<Integer> getRandomLotteryTicket(int amountOfNumbersInTicket) {
        RandomGenerator randomGenerator = new RandomGenerator();
        List<Integer> randomLotteryTicket = new ArrayList<>();
        for (int i = 0; i < amountOfNumbersInTicket; i++) {
            randomLotteryTicket.add(randomGenerator.getRandomInt(0, 10));
        }
        return randomLotteryTicket;
    }


}
