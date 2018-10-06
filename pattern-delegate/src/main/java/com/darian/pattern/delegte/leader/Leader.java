package com.darian.pattern.delegte.leader;

import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 * <br>Darian
 **/
public class Leader implements ITarget {

    private Map<String, ITarget> targets = new HashMap<String, ITarget>();

    public Leader() {
        targets.put("加密", new TargetA());
        targets.put("登陆", new TargetB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
