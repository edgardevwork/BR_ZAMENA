package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.Vl */
/* loaded from: classes5.dex */
public abstract class AbstractC9292Vl {
    /* renamed from: a */
    public final ProtobufStateStorage<Object> m5697a(@NonNull Context context) {
        return mo5468a(context, mo5469c(context));
    }

    @NonNull
    /* renamed from: a */
    public abstract ProtobufStateStorage<Object> mo5468a(@NonNull Context context, @NonNull IBinaryDataHelper iBinaryDataHelper);

    /* renamed from: b */
    public final ProtobufStateStorage<Object> m5698b(@NonNull Context context) {
        return mo5468a(context, mo5470d(context));
    }

    @NonNull
    /* renamed from: c */
    public abstract IBinaryDataHelper mo5469c(@NonNull Context context);

    @NonNull
    /* renamed from: d */
    public abstract IBinaryDataHelper mo5470d(@NonNull Context context);
}
