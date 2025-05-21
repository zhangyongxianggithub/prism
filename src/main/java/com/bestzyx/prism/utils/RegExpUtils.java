package com.bestzyx.prism.utils;

import static com.bestzyx.prism.utils.StringUtils.isNotEmpty;

/**
 * Created by zhangyongxiang on 2025/5/22 00:48
 *
 * @author zhangyongxiang
 */
public final class RegExpUtils {
    
    private RegExpUtils() {
        
    }
    
    public static boolean isAlphabetic(String str) {
        return isNotEmpty(str) && str.matches("^\\p{Alpha}+$");
    }
}
