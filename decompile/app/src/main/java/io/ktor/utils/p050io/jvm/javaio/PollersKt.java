package io.ktor.utils.p050io.jvm.javaio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pollers.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\b\u0010\u0007\u001a\u00020\bH\u0001\u001a\b\u0010\t\u001a\u00020\nH\u0001\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"parkingImpl", "Lio/ktor/utils/io/jvm/javaio/Parking;", "Ljava/lang/Thread;", "getParkingImpl", "()Lio/ktor/utils/io/jvm/javaio/Parking;", "parkingImplLocal", "Ljava/lang/ThreadLocal;", "isParkingAllowed", "", "prohibitParking", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmName(name = "PollersKt")
/* loaded from: classes5.dex */
public final class PollersKt {

    @NotNull
    public static final ThreadLocal<Parking<Thread>> parkingImplLocal = new ThreadLocal<>();

    @JvmName(name = "getParkingImpl")
    @NotNull
    public static final Parking<Thread> getParkingImpl() {
        Parking<Thread> parking = parkingImplLocal.get();
        return parking == null ? DefaultParking.INSTANCE : parking;
    }

    @JvmName(name = "prohibitParking")
    public static final void prohibitParking() {
        parkingImplLocal.set(ProhibitParking.INSTANCE);
    }

    @JvmName(name = "isParkingAllowed")
    public static final boolean isParkingAllowed() {
        return getParkingImpl() != ProhibitParking.INSTANCE;
    }
}
