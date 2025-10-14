package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Va */
/* loaded from: classes5.dex */
public final class C9281Va implements Parcelable {
    public static final Parcelable.Creator<C9281Va> CREATOR = new C9257Ua();

    /* renamed from: a */
    public final ResultReceiver f7352a;

    /* renamed from: b */
    public final List f7353b;

    /* renamed from: c */
    public final HashMap f7354c;

    public C9281Va(ResultReceiverC8817C6 resultReceiverC8817C6, List list, Map map) {
        this.f7353b = list;
        this.f7352a = resultReceiverC8817C6;
        this.f7354c = map == null ? new HashMap() : new HashMap(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f7352a);
        if (this.f7353b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f7353b));
        }
        HashMap map = this.f7354c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", AbstractC9029Kl.m5334a((Map) map));
        }
        parcel.writeBundle(bundle);
    }

    public C9281Va(Parcel parcel) {
        Bundle bundle = parcel.readBundle(ResultReceiverC8817C6.class.getClassLoader());
        if (bundle != null) {
            this.f7352a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f7353b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f7354c = AbstractC9029Kl.m5335a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f7354c = new HashMap();
    }
}
