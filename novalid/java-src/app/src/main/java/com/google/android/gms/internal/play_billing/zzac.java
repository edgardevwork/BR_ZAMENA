package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes7.dex */
abstract class zzac extends zzaw {
    private final int zza;
    private int zzb;

    public zzac(int i, int i2) {
        zzaa.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzb;
        this.zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.zzb - 1;
        this.zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i);
}
