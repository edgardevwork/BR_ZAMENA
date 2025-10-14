package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.ln */
/* loaded from: classes6.dex */
public final class C9689ln implements InterfaceC8970Ia {
    @Override // io.appmetrica.analytics.impl.InterfaceC8970Ia
    @Nullable
    /* renamed from: a */
    public final String mo5266a(@NonNull Context context) {
        IdentifiersResult identifiersResultM6549q = new C9730ne(C9398a7.m5836a(context.getApplicationContext()).m5838a()).m6549q();
        if (TextUtils.isEmpty(identifiersResultM6549q.f9419id)) {
            return null;
        }
        return identifiersResultM6549q.f9419id;
    }
}
