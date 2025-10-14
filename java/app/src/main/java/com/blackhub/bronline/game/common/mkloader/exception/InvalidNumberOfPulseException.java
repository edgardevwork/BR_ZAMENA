package com.blackhub.bronline.game.common.mkloader.exception;

/* loaded from: classes.dex */
public class InvalidNumberOfPulseException extends Exception {
    @Override // java.lang.Throwable
    public String getMessage() {
        return "The number of pulse must be between 2 and 6";
    }
}
