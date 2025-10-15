package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzau {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
