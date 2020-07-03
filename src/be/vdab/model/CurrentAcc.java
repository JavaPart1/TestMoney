package be.vdab.model;

public class CurrentAcc extends Account{
    public CurrentAcc(Person owner) {
        super(owner);
    }

    public void deposit(double depAmount){
        this.setAmount(this.getAmount() + depAmount);

    }
    public void withdraw(double wdrawAmount){
        this.setAmount(this.getAmount() - wdrawAmount);

    }
}
