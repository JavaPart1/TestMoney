package be.vdab.apps;

import be.vdab.model.CurrentAcc;
import be.vdab.model.Person;
import be.vdab.model.SavingsAcc;

public class AccApp {
    public static void main(String[] args) {
        // Creer person
        Person johny = new Person("Johny");
        // Creer zichtrek
        CurrentAcc curAcou = new CurrentAcc(johny);
        SavingsAcc savBook = new SavingsAcc(johny,2.3,curAcou);
        // Stort wat op rek
        curAcou.deposit(500);
        // Transfer nr spaar
        curAcou.transfer(curAcou,savBook,400);
        // geld opnemen
        curAcou.withdraw(150);

        // interst
        double intAmount = savBook.intCalc(savBook.getAmount(),savBook.getInterestPerc());

        // Display
        System.out.println(curAcou);
        System.out.println(savBook);
        System.out.println("Interest op savings : " + intAmount);


    }
}
