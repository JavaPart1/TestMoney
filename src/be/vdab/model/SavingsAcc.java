package be.vdab.model;

public class SavingsAcc extends Account{
    private double interestPerc;
    private CurrentAcc curAcc;

    public SavingsAcc(Person owner, double interestPerc, CurrentAcc curAcc) {
        super(owner);
        this.interestPerc = interestPerc;
        this.curAcc = curAcc;
    }

    public double intCalc(double calcAmount, double interestPerc){
        return calcAmount*interestPerc/100;
    }

    @Override
    public String toString() {
        return "SavingsAcc{" +
                "owner: " + super.getOwner() +
                "amount: " + super.getAmount() +
                "interestPerc=" + interestPerc +
                ", curAcc=" + curAcc +
                '}';
    }
}
