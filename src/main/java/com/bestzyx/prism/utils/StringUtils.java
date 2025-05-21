package com.bestzyx.prism.utils;

import static java.util.Objects.isNull;

/**
 * Created by zhangyongxiang on 2025/5/15 14:10
 *
 * @author zhangyongxiang
 */
public final class StringUtils {
    
    public static final String EMPTY_STRING = "";
    
    private StringUtils() {}
    
    public static boolean isEmpty(final String str) {
        return isNull(str) || str.isEmpty();
    }
    
    public static boolean isBlank(final String str) {
        return isNull(str) || str.isBlank();
    }
    
    public static String defaultString(final String str) {
        return defaultString(str, EMPTY_STRING);
    }
    
    public static String defaultString(final String str,
            final String defaultString) {
        return str == null ? defaultString : str;
    }
    
}
