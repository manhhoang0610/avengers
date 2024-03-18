package com.cls.avengers.exceptions;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Exception translator for all throwable classes of MetropolisDuck.
 */
@AllArgsConstructor
public class ExceptionTranslator {

    private final MessageSource messageSource;

    /**
     * String.format (must contains 2 variables like %s)
     */
    private final String defaultMessage;

    private final Locale locale;


    /**
     * translate exception with cause.
     * <h3>usage:</h3>
     * <pre>
     * ExceptionTranslator exp;
     * Throwable cause;
     * throw exp.translate(NotExistsException::new, cause,"not.exists", id);
     * </pre>
     *
     * @param throwable   {@code (message, errorCode, cause) => Throwable } function (for example... RuntimeException::new ).
     * @param messageCode error code
     * @param cause       cause of exception
     * @param errorCode   message code
     * @param args        message arguments
     * @param <T>         translated exception type
     * @param <C>         cause exception type
     * @return translated exception
     */
    public <T extends Throwable, C extends Throwable> T translate(
            TriFunction<String, String, C, T> throwable,
            String messageCode, C cause, String errorCode, Object... args) {
        String message =
                messageSource.getMessage(messageCode, args, String.format(locale, defaultMessage, messageCode, Arrays.toString(args)),
                        locale);
        return throwable.apply(message, errorCode, cause);
    }

    /**
     * translate exception without cause.
     * <h3>usage:</h3>
     * <pre>
     * ExceptionTranslator exp;
     * throw exp.translate(NotExistsException::new, "not.exists", id);
     * </pre>
     *
     * @param throwable   {@code (message, errorCode) => Throwable } function (for example... RuntimeException::new )
     * @param messageCode error code
     * @param errorCode   message code
     * @param args        message arguments
     * @param <T>         translated exception type
     * @return translated exception
     */
    public <T extends Throwable> T translate(BiFunction<String, String, T> throwable, String messageCode,
                                             String errorCode, Object... args) {
        String message =
                messageSource.getMessage(messageCode, args, String.format(locale, defaultMessage, messageCode, Arrays.toString(args)),
                        locale);
        return throwable.apply(message, errorCode);
    }

    /**
     * translate exception with cause.
     * <h3>usage:</h3>
     * <pre>
     * ExceptionTranslator exp;
     * Throwable cause;
     * throw exp.translate(NotExistsException::new, cause,"not.exists", id);
     * </pre>
     *
     * @param throwable   {@code (message, cause) => Throwable } function (for example... RuntimeException::new ).
     * @param cause       cause of exception
     * @param messageCode message code
     * @param args        message arguments
     * @param <T>         translated exception type
     * @param <C>         cause exception type
     * @return translated exception
     */
    public <T extends Throwable, C extends Throwable> T translate(BiFunction<String, C, T> throwable, C cause,
                                                                  String messageCode, Object... args) {
        String message =
                messageSource.getMessage(messageCode, args, String.format(locale, defaultMessage, messageCode, Arrays.toString(args)),
                        locale);
        return throwable.apply(message, cause);
    }

    /**
     * translate exception without cause.
     * <h3>usage:</h3>
     * <pre>
     * ExceptionTranslator exp;
     * throw exp.translate(NotExistsException::new, "not.exists", id);
     * </pre>
     *
     * @param throwable {@code (message) => Throwable } function (for example... RuntimeException::new )
     * @param code      message code
     * @param args      message arguments
     * @param <T>       translated exception type
     * @return translated exception
     */
    public <T extends Throwable> T translate(Function<String, T> throwable, String code, Object... args) {
        String message =
                messageSource.getMessage(code, args, String.format(locale, defaultMessage, code, Arrays.toString(args)),
                        locale);
        return throwable.apply(message);
    }
}
