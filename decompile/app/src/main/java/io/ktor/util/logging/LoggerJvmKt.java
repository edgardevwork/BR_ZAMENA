package io.ktor.util.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

/* compiled from: LoggerJvm.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0004*\n\u0010\u0005\"\u00020\u00022\u00020\u0002¨\u0006\u0006"}, m7105d2 = {"isTraceEnabled", "", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "(Lorg/slf4j/Logger;)Z", "Logger", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class LoggerJvmKt {
    public static final boolean isTraceEnabled(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<this>");
        return logger.isTraceEnabled();
    }
}
