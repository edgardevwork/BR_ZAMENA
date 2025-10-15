package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
/* loaded from: classes7.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    @SafeParcelable.VersionField(m1072id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getButtonSize", m1069id = 2)
    private final int zab;

    @SafeParcelable.Field(getter = "getColorScheme", m1069id = 3)
    private final int zac;

    @Nullable
    @SafeParcelable.Field(getter = "getScopes", m1069id = 4)
    @Deprecated
    private final Scope[] zad;

    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param(m1070id = 1) int i, @SafeParcelable.Param(m1070id = 2) int i2, @SafeParcelable.Param(m1070id = 3) int i3, @Nullable @SafeParcelable.Param(m1070id = 4) Scope[] scopeArr) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zad, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
