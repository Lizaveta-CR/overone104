package overone104.com.lessons.les_17.classwork.task_0;

import java.util.Objects;

public class Money {
    private int amount;
    private String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == this)
//            return true;
//        if (!(o instanceof Money))
//            return false;
//        Money other = (Money) o;
//        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
//                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
//        return this.amount == other.amount && currencyCodeEquals;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currencyCode);
    }

    public void print(){
        System.out.println("");
    }
    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currencyCode='" + currencyCode + '\'' +
                '}';
    }
//generate
}
