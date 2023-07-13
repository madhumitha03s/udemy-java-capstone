package pojo;

import java.math.BigDecimal;

public class CashAccount extends TradeAccount {
    public CashAccount(String id) {
        super(id);
    }

    public CashAccount(String id, BigDecimal cashBalance) {
        super(id);
        this.cashBalance = cashBalance;
    }

    // public CashAccount(String id, CashAccount source) {
    // super(id);
    // this.cashBalance = source.cashBalance;
    // }

    private BigDecimal cashBalance;

    public BigDecimal getCashBalance() {
        return this.cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    @Override
    public TradeAccount clone() {
        throw new UnsupportedOperationException("Unimplemented method 'clone'");
    }
}
