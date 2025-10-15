package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0 */
/* loaded from: classes5.dex */
public final /* synthetic */ class C7544x75145c29 {
    /* renamed from: m */
    public static /* synthetic */ boolean m1345m(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
