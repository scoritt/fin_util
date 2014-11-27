package ru.sct.fin.core;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by mpet on 26/11/14.
 *
 */
public class Payment {
    private BigDecimal amount;
    private Date paymentDate;
    private List<Classifier> classifiers;
    private boolean committed;

    public Payment(BigDecimal amount, Date paymentDate, List<Classifier> classifiers, boolean committed) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.classifiers = classifiers;
        this.committed = committed;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public List<Classifier> getClassifiers() {
        return classifiers;
    }

    public boolean isCommitted() {
        return committed;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", classifiers=" + classifiers +
                ", committed=" + committed +
                '}';
    }
}
