package bank;

public class SavingsAccount  extends Account {


    public SavingsAccount(String name) {
        super(name);
    }

    public void applyInterest() {
        System.out.println(super.balance());

    }


}
