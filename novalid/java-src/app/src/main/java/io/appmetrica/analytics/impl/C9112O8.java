package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.O8 */
/* loaded from: classes5.dex */
public final class C9112O8 {

    /* renamed from: a */
    public final C9064M8 f7051a;

    /* renamed from: b */
    public final C9088N8 f7052b;

    /* renamed from: c */
    public final IBinaryDataHelper f7053c;

    public C9112O8(Context context, C9396a5 c9396a5) {
        this(new C9088N8(), new C9064M8(), C9398a7.m5836a(context).m5837a(c9396a5));
    }

    public C9112O8(C9088N8 c9088n8, C9064M8 c9064m8, IBinaryDataHelper iBinaryDataHelper) {
        this.f7052b = c9088n8;
        this.f7051a = c9064m8;
        this.f7053c = iBinaryDataHelper;
    }
}
