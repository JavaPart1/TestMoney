package be.vdab.model;

public class SavingsAcc extends Account{
    private double interestPerc;

    public double intCalc(double calcAmount,double interestPerc){
        return calcAmount*interestPerc/100;
    }
}
