package io.ktor.client.plugins.logging;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Logger.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/client/plugins/logging/SimpleLogger;", "Lio/ktor/client/plugins/logging/Logger;", "()V", "log", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class SimpleLogger implements Logger {
    @Override // io.ktor.client.plugins.logging.Logger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println((Object) ("HttpClient: " + message));
    }
}
