package io.ktor.client.call;

import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientCall.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m7105d2 = {"Lio/ktor/client/call/DoubleReceiveException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", NotificationCompat.CATEGORY_CALL, "Lio/ktor/client/call/HttpClientCall;", "(Lio/ktor/client/call/HttpClientCall;)V", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DoubleReceiveException extends IllegalStateException {

    @NotNull
    public final String message;

    public DoubleReceiveException(@NotNull HttpClientCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.message = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
