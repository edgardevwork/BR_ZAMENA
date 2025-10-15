package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.uk */
/* loaded from: classes5.dex */
public final class C9911uk implements InterfaceC10022z6 {

    /* renamed from: a */
    public final C9373Z6 f9195a;

    public C9911uk(C9373Z6 c9373z6) {
        this.f9195a = c9373z6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10022z6
    /* renamed from: a */
    public final void mo5555a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10022z6
    @Nullable
    /* renamed from: a */
    public final SQLiteDatabase mo5554a() {
        try {
            return this.f9195a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
