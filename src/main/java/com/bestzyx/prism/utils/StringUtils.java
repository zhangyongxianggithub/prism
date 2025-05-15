package com.bestzyx.prism.utils;

/**
 * Created by zhangyongxiang on 2025/5/15 14:10
 *
 * @author zhangyongxiang
 */
public final class StringUtils {
    
    public static String EMPTY_STRING = "";
    
    private StringUtils() {}
    
    /**
     * 如果输入字符串为null，返回空字符串；否则返回原字符串。
     * 此方法作为defaultString(String, String)的重载方法，提供默认空字符串参数。
     *
     * @param str 要检查null值的输入字符串
     * @return 当str为null时返回空字符串，否则返回str本身
     * @see #defaultString(String, String)
     */
    public static String defaultString(final String str) {
        return defaultString(str, EMPTY_STRING);
    }
    
    /**
     * 返回指定字符串或其默认值。
     * 当输入字符串为null时返回默认字符串，否则返回输入字符串本身。
     *
     * @param str           需要判断的输入字符串（可能为null）
     * @param defaultString 当输入字符串为null时返回的默认字符串
     * @return 非null的字符串对象，取自str或defaultString中的有效值
     */
    public static String defaultString(final String str,
            final String defaultString) {
        return str == null ? defaultString : str;
    }
    
}
