package io.ktor.websocket;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import io.ktor.util.internal.ExceptionUtilsJvmKt;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;
import org.jetbrains.annotations.NotNull;

/* compiled from: FrameTooBigException.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u0000H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m7105d2 = {"Lio/ktor/websocket/FrameTooBigException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/CopyableThrowable;", "frameSize", "", "(J)V", "getFrameSize", "()J", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "createCopy", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class FrameTooBigException extends Exception implements CopyableThrowable<FrameTooBigException> {
    public final long frameSize;

    public final long getFrameSize() {
        return this.frameSize;
    }

    public FrameTooBigException(long j) {
        this.frameSize = j;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "Frame is too big: " + this.frameSize;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    @NotNull
    public FrameTooBigException createCopy() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.frameSize);
        ExceptionUtilsJvmKt.initCauseBridge(frameTooBigException, this);
        return frameTooBigException;
    }
}
