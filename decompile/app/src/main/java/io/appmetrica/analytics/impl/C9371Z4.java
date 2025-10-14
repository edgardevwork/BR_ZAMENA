package io.appmetrica.analytics.impl;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Z4 */
/* loaded from: classes5.dex */
public final class C9371Z4 extends DatabaseScript {

    /* renamed from: a */
    public final C9347Y4 f7618a = new C9347Y4();

    /* renamed from: b */
    public final C9323X4 f7619b = new C9323X4();

    @Override // io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) throws SQLException {
        this.f7618a.runScript(sQLiteDatabase);
        this.f7619b.runScript(sQLiteDatabase);
    }
}
