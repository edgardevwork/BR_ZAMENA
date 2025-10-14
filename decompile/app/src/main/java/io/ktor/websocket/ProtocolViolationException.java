package io.ktor.websocket;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import io.ktor.util.internal.ExceptionUtilsJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThrowable;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProtocolViolationException.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0000H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\f"}, m7105d2 = {"Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/CopyableThrowable;", "violation", "", "(Ljava/lang/String;)V", ThrowableDeserializer.PROP_NAME_MESSAGE, "getMessage", "()Ljava/lang/String;", "getViolation", "createCopy", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ProtocolViolationException extends Exception implements CopyableThrowable<ProtocolViolationException> {

    @NotNull
    public final String violation;

    @NotNull
    public final String getViolation() {
        return this.violation;
    }

    public ProtocolViolationException(@NotNull String violation) {
        Intrinsics.checkNotNullParameter(violation, "violation");
        this.violation = violation;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return "Received illegal frame: " + this.violation;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    @NotNull
    public ProtocolViolationException createCopy() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.violation);
        ExceptionUtilsJvmKt.initCauseBridge(protocolViolationException, this);
        return protocolViolationException;
    }
}
