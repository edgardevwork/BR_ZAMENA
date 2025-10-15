package ru.rustore.sdk.reactive.single;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.clientConfiguration.ClientProperties;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Dispatchers;

/* compiled from: SingleTimeout.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m7105d2 = {ClientProperties.PROP_TIMEOUT, "Lru/rustore/sdk/reactive/single/Single;", ExifInterface.GPS_DIRECTION_TRUE, "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "dispatcher", "Lru/rustore/sdk/reactive/core/Dispatcher;", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class SingleTimeoutKt {
    public static /* synthetic */ Single timeout$default(Single single, long j, TimeUnit timeUnit, Dispatcher dispatcher, int i, Object obj) {
        if ((i & 4) != 0) {
            dispatcher = Dispatchers.INSTANCE.getIo();
        }
        return timeout(single, j, timeUnit, dispatcher);
    }

    @NotNull
    public static final <T> Single<T> timeout(@NotNull Single<T> single, long j, @NotNull TimeUnit timeUnit, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new SingleTimeout(single, j, timeUnit, dispatcher);
    }
}
