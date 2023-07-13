package pojo;

import java.math.BigDecimal;

public class MarginAccount extends TradeAccount {
    private BigDecimal margin;

    public MarginAccount(String id, BigDecimal margin) {
        super(id);
        this.margin = margin;
    }

    public MarginAccount(String id, MarginAccount source) {
        super(id);
        this.margin = source.margin;
    }

    public BigDecimal getMargin() {
        return this.margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    @Override
    public TradeAccount clone() {
        throw new UnsupportedOperationException("Unimplemented method 'clone'");
    }
}
