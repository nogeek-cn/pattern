package com.darian.pattern.prototype;

import com.darian.pattern.prototype.deep.QiTianDaSheng;

/**
 * <br>
 * <br>Darian
 **/
public class TestPrototype {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng.getJinGuBang() == clone.getJinGuBang());
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng copy = qiTianDaSheng.copy(qiTianDaSheng);
        System.out.println(copy == qiTianDaSheng);
    }
}
