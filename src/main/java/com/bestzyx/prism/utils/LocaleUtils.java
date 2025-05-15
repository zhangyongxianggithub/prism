package com.bestzyx.prism.utils;

import java.util.Locale;
import java.util.regex.Pattern;

import com.bestzyx.prism.utils.exception.UnrecognizedLocaleException;

import static com.bestzyx.prism.utils.StringUtils.defaultString;

/**
 * Created by zhangyongxiang on 2025/4/20 18:01
 *
 * @author zhangyongxiang
 */
public final class LocaleUtils {
    
    private static Pattern LOCALE_PATTERN = Pattern.compile(
            "^(?<language>\\p{Alpha}{2,3})([_\\-](?<region>\\w{2,3}).*)?");
    
    private LocaleUtils() {}
    
    public static String getLanguage(final Locale locale) {
        return null;
    }
    
    public static Locale getLocale(final String locale) {
        final var matcher = LOCALE_PATTERN.matcher(locale);
        if (matcher.matches()) {
            return getLocale(matcher.group("language").toLowerCase(),
                    defaultString(matcher.group("region")).toUpperCase());
        } else {
            throw new UnrecognizedLocaleException(locale);
        }
    }
    
    private static Locale getLocale(final String language,
            final String region) {
        return new Locale(language, region);
    }
}
