package io.ktor.serialization;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentConvertException.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/serialization/WebsocketDeserializeException;", "Lio/ktor/serialization/WebsocketContentConvertException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", TypedValues.AttributesType.S_FRAME, "Lio/ktor/websocket/Frame;", "(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/Frame;)V", "getFrame", "()Lio/ktor/websocket/Frame;", "ktor-serialization"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class WebsocketDeserializeException extends WebsocketContentConvertException {

    @NotNull
    public final Frame frame;

    public /* synthetic */ WebsocketDeserializeException(String str, Throwable th, Frame frame, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, frame);
    }

    @NotNull
    public final Frame getFrame() {
        return this.frame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(@NotNull String message, @Nullable Throwable th, @NotNull Frame frame) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.frame = frame;
    }
}
