package io.reactivex.rxjava3.exceptions;

/* loaded from: classes7.dex */
public final class MissingBackpressureException extends RuntimeException {
    public static final String DEFAULT_MESSAGE = "Could not emit value due to lack of requests";
    public static final long serialVersionUID = 8517344746016032542L;

    public MissingBackpressureException() {
    }

    public MissingBackpressureException(String message) {
        super(message);
    }

    public static MissingBackpressureException createDefault() {
        return new MissingBackpressureException(DEFAULT_MESSAGE);
    }
}
