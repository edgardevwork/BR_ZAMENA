package com.google.android.gms.internal.play_billing;

import com.google.common.collect.Hashing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzae {
    public static int zza(int i) {
        return (int) (Integer.rotateLeft((int) (i * Hashing.f814C1), 15) * Hashing.f815C2);
    }
}
