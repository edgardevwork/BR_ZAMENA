package io.ktor.utils.p050io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pollers.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m7105d2 = {"Lio/ktor/utils/io/jvm/javaio/DefaultParking;", "Lio/ktor/utils/io/jvm/javaio/Parking;", "Ljava/lang/Thread;", "()V", "park", "", "timeNanos", "", "token", "unpark", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class DefaultParking implements Parking<Thread> {

    @NotNull
    public static final DefaultParking INSTANCE = new DefaultParking();

    @Override // io.ktor.utils.p050io.jvm.javaio.Parking
    @NotNull
    public Thread token() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "currentThread()");
        return threadCurrentThread;
    }

    @Override // io.ktor.utils.p050io.jvm.javaio.Parking
    public void park(long timeNanos) {
        if (timeNanos < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        LockSupport.parkNanos(timeNanos);
    }

    @Override // io.ktor.utils.p050io.jvm.javaio.Parking
    public void unpark(@NotNull Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        LockSupport.unpark(token);
    }
}
