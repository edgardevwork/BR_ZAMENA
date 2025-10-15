package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.Sb */
/* loaded from: classes5.dex */
public final class C9210Sb implements InterfaceC10022z6 {

    /* renamed from: a */
    public final Context f7241a;

    /* renamed from: b */
    public final String f7242b;

    /* renamed from: c */
    public final C9638jm f7243c;

    /* renamed from: d */
    public final C9304W9 f7244d;

    /* renamed from: e */
    public C9373Z6 f7245e;

    public C9210Sb(Context context, String str, @NonNull C9638jm c9638jm) {
        this(context, str, new C9304W9(str), c9638jm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10022z6
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public final synchronized SQLiteDatabase mo5554a() {
        C9373Z6 c9373z6;
        try {
            this.f7244d.m5715a();
            c9373z6 = new C9373Z6(this.f7241a, this.f7242b, this.f7243c, PublicLogger.getAnonymousInstance());
            this.f7245e = c9373z6;
        } catch (Throwable unused) {
            return null;
        }
        return c9373z6.getWritableDatabase();
    }

    @VisibleForTesting
    public C9210Sb(@NonNull Context context, @NonNull String str, @NonNull C9304W9 c9304w9, @NonNull C9638jm c9638jm) {
        this.f7241a = context;
        this.f7242b = str;
        this.f7244d = c9304w9;
        this.f7243c = c9638jm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10022z6
    @WorkerThread
    /* renamed from: a */
    public final synchronized void mo5555a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC9664kn.m6341a((Closeable) this.f7245e);
        this.f7244d.m5716b();
        this.f7245e = null;
    }
}
