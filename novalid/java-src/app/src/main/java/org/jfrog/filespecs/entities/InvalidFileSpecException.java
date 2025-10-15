package org.jfrog.filespecs.entities;

import java.io.IOException;

/* loaded from: classes5.dex */
public class InvalidFileSpecException extends IOException {
    public InvalidFileSpecException(String str) {
        super(str);
    }

    public InvalidFileSpecException(String str, Throwable th) {
        super(str, th);
    }
}
