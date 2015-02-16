package entity;

/**
 *
 * @author Felix
 */
public enum Amounts {

    Q1000(1000),
    Q2000(2000),
    Q3000(3000),
    Q5000(5000),
    Q10000(10000),
    Q20000(20000),
    Q40000(40000),
    Q80000(80000),
    Q160000(160000),
    Q320000(320000),
    Q640000(640000),
    Q1250000(1250000),
    Q2500000(2500000),
    Q5000000(5000000),
    Q10000000(10000000);
    private int value;

    private Amounts(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static Amounts getNext(Amounts a) {
        boolean next = false;
        for (Amounts amount : values()) {
            if (next) {
                return amount;
            }
            if (amount.equals(a)) {
                next = true;
            }
        }
        return a;
    }
}
