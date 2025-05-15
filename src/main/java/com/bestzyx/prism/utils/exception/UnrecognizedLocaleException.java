package com.bestzyx.prism.utils.exception;

/**
 * Created by zhangyongxiang on 2025/5/15 14:18
 *
 * @author zhangyongxiang
 */
public class UnrecognizedLocaleException extends RuntimeException {
    
    private static final long serialVersionUID = -7167868119042782784L;
    
    public UnrecognizedLocaleException(final String locale) {
        super("Unrecognized locale: " + locale);
    }
    
    public UnrecognizedLocaleException(final String locale,
            final Throwable cause) {
        super("Unrecognized locale: " + locale, cause);
    }
    
    public UnrecognizedLocaleException(final Throwable cause) {
        super(cause);
    }
    
    public UnrecognizedLocaleException(final String locale,
            final Throwable cause, final boolean enableSuppression,
            final boolean writableStackTrace) {
        super("Unrecognized locale: " + locale, cause, enableSuppression,
                writableStackTrace);
    }
    
}
