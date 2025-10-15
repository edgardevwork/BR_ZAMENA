package org.apache.commons.p059io;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class TaggedIOException extends IOExceptionWithCause {
    public static final long serialVersionUID = -6994123481142850163L;
    public final Serializable tag;

    public static boolean isTaggedWith(Throwable th, Object obj) {
        return obj != null && (th instanceof TaggedIOException) && obj.equals(((TaggedIOException) th).tag);
    }

    public static void throwCauseIfTaggedWith(Throwable th, Object obj) throws IOException {
        if (isTaggedWith(th, obj)) {
            throw ((TaggedIOException) th).getCause();
        }
    }

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.tag = serializable;
    }

    public Serializable getTag() {
        return this.tag;
    }

    @Override // java.lang.Throwable
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
