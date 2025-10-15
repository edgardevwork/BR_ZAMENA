package io.ktor.utils.p050io.jvm.javaio;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.ant.IvyBuildList;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pollers.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\f"}, m7105d2 = {"Lio/ktor/utils/io/jvm/javaio/ProhibitParking;", "Lio/ktor/utils/io/jvm/javaio/Parking;", "Ljava/lang/Thread;", "()V", IvyBuildList.OnMissingDescriptor.FAIL, "", "park", "", "timeNanos", "", "token", "unpark", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ProhibitParking implements Parking<Thread> {

    @NotNull
    public static final ProhibitParking INSTANCE = new ProhibitParking();

    @Override // io.ktor.utils.p050io.jvm.javaio.Parking
    @NotNull
    public Thread token() {
        fail();
        throw new KotlinNothingValueException();
    }

    @Override // io.ktor.utils.p050io.jvm.javaio.Parking
    public void park(long timeNanos) {
        fail();
        throw new KotlinNothingValueException();
    }

    @Override // io.ktor.utils.p050io.jvm.javaio.Parking
    public void unpark(@NotNull Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        DefaultParking.INSTANCE.unpark(token);
    }

    public final Void fail() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }
}
