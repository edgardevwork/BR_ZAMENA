package org.apache.commons.p059io.input;

/* loaded from: classes6.dex */
public class UnsupportedOperationExceptions {
    public static final String MARK_RESET = "mark/reset";

    public static UnsupportedOperationException mark() {
        return method(MARK_RESET);
    }

    public static UnsupportedOperationException method(String str) {
        return new UnsupportedOperationException(str + " not supported");
    }

    public static UnsupportedOperationException reset() {
        return method(MARK_RESET);
    }
}
