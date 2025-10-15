package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import com.blackhub.bronline.game.core.preferences.Preferences;
import io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e4 */
/* loaded from: classes8.dex */
public final class C9495e4 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete(Preferences.NAME, "key = ?", new String[]{"NEXT_STARTUP_TIME"});
    }
}
