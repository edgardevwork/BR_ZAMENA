package io.ktor.utils.p050io;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteBufferChannel.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"BYTE_BUFFER_CAPACITY", "", "DEFAULT_CLOSE_MESSAGE", "", "rethrowClosed", "", "cause", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ByteBufferChannelKt {
    public static final int BYTE_BUFFER_CAPACITY = 4088;

    @NotNull
    public static final String DEFAULT_CLOSE_MESSAGE = "Byte channel was closed";

    public static final Void rethrowClosed(Throwable th) throws Throwable {
        Throwable thTryCopyException;
        try {
            thTryCopyException = ExceptionUtilsJvmKt.tryCopyException(th, th);
        } catch (Throwable unused) {
            thTryCopyException = null;
        }
        if (thTryCopyException == null) {
            throw th;
        }
        throw thTryCopyException;
    }
}
