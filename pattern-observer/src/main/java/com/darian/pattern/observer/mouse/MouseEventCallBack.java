package com.darian.pattern.observer.mouse;

import com.darian.pattern.observer.core.Event;

/**
 * 观察者
 * <p>
 * 回调响应的逻辑，由自己实现
 * <br>Darian
 **/
public class MouseEventCallBack {
    public void onClick(Event e) {
        System.out.println(">>>>>>>>>>>这是鼠标单机以后要执行的逻辑：开始");
        System.out.println("===========触发了鼠标的单击事件============\n" + e);
        System.out.println(">>>>>>>>>>>这是鼠标单机以后要执行的逻辑：结束");
    }

    public void onDoubleClick(Event e) {
        System.out.println("===========触发了鼠标的双击事件============\n" + e);
    }

    public void onUp(Event e) {
        System.out.println("===========触发了鼠标的弹起事件============\n" + e);
    }

    public void onDown(Event e) {
        System.out.println("===========触发了鼠标的按下事件============\n" + e);
    }

    public void onWheel(Event e) {
        System.out.println("===========触发了鼠标的滚动事件============\n" + e);
    }

    public void onMove(Event e) {
        System.out.println("===========触发了鼠标的移动事件============\n" + e);
    }

    public void onOver(Event e) {
        System.out.println("===========触发了鼠标的悬停事件============\n" + e);
    }
}
