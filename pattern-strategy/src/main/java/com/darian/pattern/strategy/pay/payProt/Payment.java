package com.darian.pattern.strategy.pay.payProt;

import com.darian.pattern.strategy.pay.PayState;

/**
 * <br>
 * <br>Darian
 **/
public interface Payment {
    // 每次增加一个支付渠道，我们就要去维护这个接口一次
//    public final static Payment ALI_PAY = new AliPay();
//    public final static Payment JD_PAY = new JDPay();
//    public final static Payment WECHAT_PAY = new WeChatPay();
//    public final static Payment UNION_PAY = new UnionPay();

    PayState pay(String uid, double amount);
}
