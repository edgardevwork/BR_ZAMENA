package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.km */
/* loaded from: classes5.dex */
public final class C9663km {

    /* renamed from: a */
    public final HashMap f8532a;

    public C9663km(@NonNull String str, @NonNull HashMap<String, List<String>> map) {
        this.f8532a = map;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public final HashMap<String, List<String>> m6336a() {
        return this.f8532a;
    }

    /* renamed from: a */
    public final boolean m6337a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f8532a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        AbstractC9664kn.m6340a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    AbstractC9664kn.m6340a(cursorQuery);
                } catch (Throwable th) {
                    AbstractC9664kn.m6340a((Cursor) null);
                    throw th;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
