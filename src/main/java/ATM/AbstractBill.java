package ATM;

public class AbstractBill implements Bill{

    private Bill nextBill = null;
    protected final int billAmount;
    protected AbstractBill(int billAmount){
        this.billAmount = billAmount;
    }
    public void setNext(Bill bill) {
        nextBill = bill;
    }

    public void process(int amount) throws Exception {
        if (amount == 0) return;
        if (nextBill == null && amount % billAmount != 0) throw new Exception("Cant get this amount");
        if (nextBill != null) nextBill.process(amount%billAmount);

        System.out.println("Took "+ (int)amount/billAmount + " "+billAmount+"-bills.");


    }
}
