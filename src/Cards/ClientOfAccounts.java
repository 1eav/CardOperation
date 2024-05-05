package Cards;

public abstract class ClientOfAccounts {
    protected double amount;
    public void put(double amountToPut) {
        amount = amount + amountToPut;
        System.out.println("Top up balance: " + amountToPut);
    }

    public boolean take(double amountToTake) {
        boolean finish = true;
        if (amountToTake <= amount) {
            amount = amount - amountToTake;
            System.out.println("Write off balance: " + amountToTake);
        } else {
            finish = false;
            System.out.println("You are trying to withdraw the amount: " + amountToTake);
            System.out.println("Insufficient funds");
        }
        return finish;
    }

    public double getAmount() {
        return amount;
    }
}