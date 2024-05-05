package Cards;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat myFormat;
        myFormat = new DecimalFormat("#.00");
        System.out.println("***");
        ClientOfAccounts physicalPerson = new PhysicalPerson();
        physicalPerson.put(125.50);
        physicalPerson.take(100.15);
        double amount = physicalPerson.amount;
        System.out.println("Amount: " + myFormat.format(amount));
        System.out.println("***");
        ClientOfAccounts legalPerson = new LegalPerson();
        legalPerson.put(2500);
        legalPerson.take(1000);
        double amount2 = legalPerson.amount;
        System.out.println("Amount: " + myFormat.format(amount2));
        System.out.println("***");
        ClientOfAccounts individualBusinessman = new IndividualBusinessman();
        individualBusinessman.put(190000);
        individualBusinessman.take(160000);
        double amount3 = individualBusinessman.amount;
        System.out.println("Amount: " + myFormat.format(amount3));
        System.out.println("***");
    }
}