package be.vdab.model;

public abstract class Account {
    private Person owner;
    private double amount;

    public void transfer(Account accFrom,Account accTo,double tranAmount){
        accFrom.setAmount(accFrom.getAmount() - tranAmount);
        accTo.setAmount(accTo.getAmount() + tranAmount);

    }

    public Account(Person owner) {
        this.owner = owner;
        this.amount = 0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner=" + owner +
                ", amount=" + amount +
                '}';
    }
}
