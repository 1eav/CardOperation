package Cards;

public class LegalPerson extends ClientOfAccounts implements Information {
    public LegalPerson() {
        infoClient();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public boolean take(double amountToTake) {
        boolean finish = true;
        if (amountToTake <= amount) {
            amount = amount - amountToTake * 1.012;
            System.out.println("Write off balance: " + amountToTake + "\nCommission: -1%");
        } else {
            finish = false;
            System.out.println("You are trying to withdraw the amount: " + amountToTake);
            System.out.println("Insufficient funds");
        }
        return finish;
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void infoClient() {
        System.out.println("LEGAL ENTITY");
    }
}