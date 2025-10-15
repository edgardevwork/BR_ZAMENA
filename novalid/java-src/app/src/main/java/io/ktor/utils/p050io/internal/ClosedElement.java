package io.ktor.utils.p050io.internal;

import io.ktor.utils.p050io.ClosedWriteChannelException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, m7105d2 = {"Lio/ktor/utils/io/internal/ClosedElement;", "", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "sendException", "getSendException", "toString", "", "Companion", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ClosedElement {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ClosedElement EmptyCause = new ClosedElement(null);

    @Nullable
    public final Throwable cause;

    public ClosedElement(@Nullable Throwable th) {
        this.cause = th;
    }

    @Nullable
    public final Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final Throwable getSendException() {
        Throwable th = this.cause;
        return th == null ? new ClosedWriteChannelException("The channel was closed") : th;
    }

    @NotNull
    public String toString() {
        return "Closed[" + getSendException() + AbstractJsonLexerKt.END_LIST;
    }

    /* compiled from: ByteBufferChannelInternals.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/utils/io/internal/ClosedElement$Companion;", "", "()V", "EmptyCause", "Lio/ktor/utils/io/internal/ClosedElement;", "getEmptyCause", "()Lio/ktor/utils/io/internal/ClosedElement;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ClosedElement getEmptyCause() {
            return ClosedElement.EmptyCause;
        }
    }
}
