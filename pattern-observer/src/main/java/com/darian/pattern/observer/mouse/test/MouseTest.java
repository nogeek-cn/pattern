package com.darian.pattern.observer.mouse.test;

import com.darian.pattern.observer.core.Event;
import com.darian.pattern.observer.mouse.Mouse;
import com.darian.pattern.observer.mouse.MouseEventCallBack;
import com.darian.pattern.observer.mouse.MouseEventType;

import java.lang.reflect.Method;

/**
 * <br>
 * <br>Darian
 **/
public class MouseTest {
    public static void main(String[] args) {
        /***
         *      var input = document.getElementById("username");
         *      input.addListener("click", function(){
         *           alert("鼠标点击了这个文本框 ")
         *      });
         *
         * 给一个回调的逻辑
         */

        // 观察者和被观察者之间没有必然的联系
        // 注册的时候，才产生联系

        // 解耦

        try {
            MouseEventCallBack callBack = new MouseEventCallBack();
            Method onClick = MouseEventCallBack.class.getMethod("onClick", Event.class);

            // 人为的调用鼠标的单击事件
            Mouse mouse = new Mouse();
            mouse.addListener(MouseEventType.ON_CLICK, callBack, onClick);

            mouse.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
