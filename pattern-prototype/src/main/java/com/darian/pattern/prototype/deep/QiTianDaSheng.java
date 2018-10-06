package com.darian.pattern.prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.Date;

/**
 * <br>
 * <br>Darian
 **/
@Data
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    private JinGuBang jinGuBang;

    public QiTianDaSheng() {
        // 只是初始化
        super.setBrithday(new Date());
        this.jinGuBang = new JinGuBang();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            QiTianDaSheng copy = (QiTianDaSheng) objectInputStream.readObject();
            copy.setBrithday(new Date());
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public QiTianDaSheng copy(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setHeight(target.getHeight());
        qiTianDaSheng.setWeight(target.getWeight());
        JinGuBang jinGuBang = new JinGuBang();
        jinGuBang.setD(target.getJinGuBang().getD());
        jinGuBang.setH(target.getJinGuBang().getH());
        qiTianDaSheng.setJinGuBang(jinGuBang);
        qiTianDaSheng.setBrithday(new Date());
        return qiTianDaSheng;
    }
}
