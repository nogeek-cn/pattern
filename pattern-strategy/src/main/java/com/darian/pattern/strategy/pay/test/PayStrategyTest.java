package com.darian.pattern.strategy.pay.test;

import com.darian.pattern.strategy.pay.Order;
import com.darian.pattern.strategy.pay.PayState;
import com.darian.pattern.strategy.pay.payProt.AliPay;
import com.darian.pattern.strategy.pay.payProt.JDPay;
import com.darian.pattern.strategy.pay.payProt.PayType;
import com.darian.pattern.strategy.pay.payProt.Payment;

/**
 * <br>
 * <br>Darian
 **/
public class PayStrategyTest {
    public static void main(String[] args) {
        // 省略把商品添加到购物车，再从购物车下单
        // 直接从订单开始
        Order order = new Order("1", "20180311001000009", 324.11);

        // 开始支付，选择  微信支付、支付宝、银联卡、京东白条、财付通
        // 每个渠道它支付的具体的算法是不一样的
        // 基本的算法是固定的
//        PayState payState = order.pay(new AliPay());
//        PayState payState = order.pay(new JDPay());
        // 这个值是在支付的时候才决定用哪个值
        PayState payState = order.pay(PayType.ALI_PAY);
        System.out.println(payState);
    }
}
