package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes8.dex */
final class zzgv extends zzhu {
    private final Context zza;

    @Nullable
    private final Supplier<Optional<zzhh>> zzb;

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        Supplier<Optional<zzhh>> supplier = this.zzb;
        return iHashCode ^ (supplier == null ? 0 : supplier.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    @Nullable
    public final Supplier<Optional<zzhh>> zzb() {
        return this.zzb;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + WebvttCssParser.RULE_END;
    }

    public zzgv(Context context, @Nullable Supplier<Optional<zzhh>> supplier) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(Object obj) {
        Supplier<Optional<zzhh>> supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhu) {
            zzhu zzhuVar = (zzhu) obj;
            if (this.zza.equals(zzhuVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zzhuVar.zzb()) : zzhuVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }
}
