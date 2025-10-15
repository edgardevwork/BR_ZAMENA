package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rm */
/* loaded from: classes6.dex */
public final class C9838rm implements TempCacheStorage {

    /* renamed from: a */
    public final InterfaceC10022z6 f9023a;

    /* renamed from: b */
    public final String f9024b;

    /* renamed from: c */
    public final SystemTimeProvider f9025c = new SystemTimeProvider();

    public C9838rm(@NotNull InterfaceC10022z6 interfaceC10022z6, @NotNull String str) {
        this.f9023a = interfaceC10022z6;
        this.f9024b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<TempCacheStorage.Entry> get(@NotNull String str, int i) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseMo5554a;
        SQLiteDatabase sQLiteDatabase;
        C9888tm c9888tm;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            sQLiteDatabaseMo5554a = this.f9023a.mo5554a();
            sQLiteDatabase = sQLiteDatabaseMo5554a;
        } catch (Throwable unused) {
            cursorQuery = null;
        }
        if (sQLiteDatabaseMo5554a != 0) {
            try {
                cursorQuery = sQLiteDatabaseMo5554a.query(false, this.f9024b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i));
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                c9888tm = new C9888tm(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(PomReader.SCOPE)), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("timestamp")), cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c9888tm = null;
                            }
                            if (c9888tm != null) {
                                arrayList.add(c9888tm);
                            }
                        } catch (Throwable unused3) {
                            cursor = sQLiteDatabaseMo5554a;
                            sQLiteDatabaseMo5554a = cursor;
                            cursor = cursorQuery;
                            sQLiteDatabase = sQLiteDatabaseMo5554a;
                            AbstractC9664kn.m6340a(cursor);
                            this.f9023a.mo5555a(sQLiteDatabase);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursorQuery = null;
            }
            cursor = cursorQuery;
            sQLiteDatabase = sQLiteDatabaseMo5554a;
        }
        AbstractC9664kn.m6340a(cursor);
        this.f9023a.mo5555a(sQLiteDatabase);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j, @NotNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseMo5554a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo5554a = this.f9023a.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(PomReader.SCOPE, str);
                    contentValues.put("timestamp", Long.valueOf(j));
                    contentValues.put("data", bArr);
                    long jInsertOrThrow = sQLiteDatabaseMo5554a.insertOrThrow(this.f9024b, null, contentValues);
                    this.f9023a.mo5555a(sQLiteDatabaseMo5554a);
                    return jInsertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo5554a;
                    sQLiteDatabaseMo5554a = sQLiteDatabase;
                    this.f9023a.mo5555a(sQLiteDatabaseMo5554a);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f9023a.mo5555a(sQLiteDatabaseMo5554a);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        m6784a("id=?", new String[]{String.valueOf(j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j) {
        m6784a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f9025c.currentTimeMillis() - j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return (TempCacheStorage.Entry) CollectionsKt___CollectionsKt.firstOrNull((List) get(str, 1));
    }

    /* renamed from: a */
    public final void m6784a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseMo5554a;
        try {
            sQLiteDatabaseMo5554a = this.f9023a.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    sQLiteDatabaseMo5554a.delete(this.f9024b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseMo5554a = null;
        }
        this.f9023a.mo5555a(sQLiteDatabaseMo5554a);
    }
}
