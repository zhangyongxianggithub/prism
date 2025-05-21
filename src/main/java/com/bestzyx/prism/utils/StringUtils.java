package com.bestzyx.prism.utils;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Created by zhangyongxiang on 2025/5/15 14:10
 *
 * @author zhangyongxiang
 */
public final class StringUtils {
    
    public static final String EMPTY_STRING = "";
    
    private StringUtils() {}
    
    public static String trim(final String str) {
        if (nonNull(str)) {
            return str.trim();
        }
        return str;
    }
    
    public static boolean isEmpty(final String str) {
        return isNull(str) || str.isEmpty();
    }
    
    public static boolean isNotEmpty(final String str) {
        return !isEmpty(str);
    }
    
    public static boolean isBlank(final String str) {
        return isNull(str) || str.isBlank();
    }
    
    public static boolean isNotBlank(final String str) {
        return !isBlank(str);
    }
    
    public static String defaultString(final String str) {
        return defaultString(str, EMPTY_STRING);
    }
    
    public static String defaultString(final String str,
            final String defaultString) {
        return str == null ? defaultString : str;
    }
    
}
