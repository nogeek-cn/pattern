package com.darian.pattern.delegte.mvc;

import com.darian.pattern.delegte.mvc.controllers.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 相当于项目经理的角色，
 * 解放双手，再也不需要写个方法，配一个 URL
 * <br>Darian
 **/
public class ServletDispatcher {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public ServletDispatcher(List<Handler> handlerMapping) {
        try {
            Class<?> memberActionClass = MemberAction.class;
            handlerMapping.add(new Handler()
                    .setController(memberActionClass.newInstance())
                    .setMethod(memberActionClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response) {
        doDispatch(request, response);
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        // 1. 获取用户请求的 URL
        //      如果按照 J2EE 的标准，一个 URL 对应一个 Servlet,URL 由浏览器输入
        String uri = request.getRequestURI();
        // 2. Servlet 拿到 URL 以后，要做权衡（要做判断，要做选择）
        //      根据用户请求的 URL，去找到这个 URL 对用的某一个类的方法

        // 3. 通过拿到的 URL 去 HandlerMapper （我们把它认为是策略常量）
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (h.getUrl().equals(uri)) {
                handler = h;
                break;
            }
        }
        // 4. 将具体的任务分发给 Method，（通过反射去调用对用的方法）
        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(), request.getParameter("mId"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 5. 获取到 Method 执行的结果，通过 Response 返回出去
        try {
            response.getWriter().write(object.toString().toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Handler {
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
