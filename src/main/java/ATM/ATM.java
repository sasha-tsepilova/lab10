package ATM;

public class ATM {
    private final Bill firstBill;
    public ATM(){
        Bill bill5 = new Bill5();
        Bill bill10 = new Bill10();
        Bill20 bill20 =  new Bill20();

        bill20.setNext(bill10);
        bill10.setNext(bill5);
        firstBill = bill20;
    }
    public void process (int amount) throws Exception {

        firstBill.process(amount);
    }
}
