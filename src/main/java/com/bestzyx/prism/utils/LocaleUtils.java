package com.bestzyx.prism.utils;

import java.util.Locale;

/**
 * Created by zhangyongxiang on 2025/4/20 18:01
 *
 * @author zhangyongxiang
 */
public final class LocaleUtils {
    
    private LocaleUtils() {}
    
    public static String getLanguage(final Locale locale) {
        return null;
    }
    
    public static Locale getLocale(final String locale) {
        final String[] split = locale.split("[_\\-]", 2);
        if (split.length >= 2) {
            return new Locale(split[0], split[1]);
        } else {
            return new Locale(split[0], "");
        }
    }
    
    public static Locale getLocale(final String language, final String region) {
        return new Locale(language, region);
    }
}
