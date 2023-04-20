package com.microsoft.xbox.telemetry.utc;

/**
 * 07.01.2021
 *
 * @author <a href="https://github.com/TimScriptov">TimScriptov</a>
 */

public class PageAction extends CommonData {
    private static final int PAGEACTIONVERSION = 1;
    public String actionName;
    public String pageName;

    public PageAction() {
        super(1);
    }
}
