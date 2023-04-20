package com.microsoft.xbox.toolkit;

/**
 * 07.01.2021
 *
 * @author <a href="https://github.com/TimScriptov">TimScriptov</a>
 */

public interface ModelData<T> {
    void updateWithNewData(AsyncResult<T> asyncResult);
}
