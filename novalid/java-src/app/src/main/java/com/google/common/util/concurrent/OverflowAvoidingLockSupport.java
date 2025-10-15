package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class OverflowAvoidingLockSupport {
    public static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    public static void parkNanos(@CheckForNull Object blocker, long nanos) {
        LockSupport.parkNanos(blocker, Math.min(nanos, MAX_NANOSECONDS_THRESHOLD));
    }
}
