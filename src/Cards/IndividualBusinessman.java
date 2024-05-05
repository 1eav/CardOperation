package Cards;

public class IndividualBusinessman extends ClientOfAccounts implements Information {
    public IndividualBusinessman() {
        infoClient();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public boolean take(double amountToTake) {
        boolean finish = true;
        if (amount < 1000) {
            amount = amount - amountToTake / 1.012;
            System.out.println("Write off balance: " + amountToTake + "\nPromotion: +1% (less than 1000)");
        } else if (amount >= 1000) {
            finish = false;
            amount = amount - amountToTake / 1.001;
            System.out.println("Write off balance: " + amountToTake + "\nPromotion: +0.5% (more than 1000)");
        }
        return finish;
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void infoClient() {
        System.out.println("INDIVIDUAL OWNER");
    }
}