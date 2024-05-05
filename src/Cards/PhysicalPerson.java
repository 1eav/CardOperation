package Cards;

public class PhysicalPerson extends ClientOfAccounts implements Information {
    public PhysicalPerson() {
        infoClient();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public boolean take(double amountToTake) {
        super.take(amountToTake);
        return false;
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void infoClient() {
        System.out.println("INDIVIDUALS");
    }
}