package com.darian.pattern.strategy.pay;

import com.darian.pattern.strategy.pay.payProt.PayType;
import com.darian.pattern.strategy.pay.payProt.Payment;
import lombok.Data;

/**
 * <br>
 * <br>Darian
 **/
public class Order {
    private String uId;
    private String orderId;
    private double amount;

    public Order(String uId, String orderId, double amount) {
        this.uId = uId;
        this.orderId = orderId;
        this.amount = amount;
    }

//    public PayState pay(Payment payment) {
//        return payment.pay(this.uId,this.amount);
//    }

    // 这个参数，完全可以用 Payment 这个接口来代替
    // 为什么?

    // 完美的结局了 switch 的过程， 不需要在代码逻辑中写 switch le
    // 更不需要写 if else 了
    public PayState pay(PayType payType) {
        return payType.getPayment().pay(this.uId, this.amount);
    }
}
