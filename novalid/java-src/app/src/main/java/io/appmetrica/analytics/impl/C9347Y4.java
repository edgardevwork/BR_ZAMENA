package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Y4 */
/* loaded from: classes5.dex */
public final class C9347Y4 extends DatabaseScript {

    /* renamed from: a */
    public final String f7551a = "sessions";

    /* renamed from: b */
    public final int f7552b = 200;

    /* renamed from: c */
    public final String f7553c = "id";

    /* renamed from: d */
    public final String f7554d = "start_time";

    /* renamed from: e */
    public final String f7555e = "report_request_parameters";

    /* renamed from: f */
    public final String f7556f = "server_time_offset";

    /* renamed from: g */
    public final String f7557g = "type";

    /* renamed from: h */
    public final String f7558h = "obtained_before_first_sync";

    /* renamed from: i */
    public final C9923v7 f7559i = new C9923v7(null, 1, 0 == true ? 1 : 0);

    /* renamed from: a */
    public final C9898u7 m5771a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7553c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7557g));
            EnumC9436bk enumC9436bk = EnumC9436bk.FOREGROUND;
            boolean z = true;
            if (i != 0) {
                enumC9436bk = EnumC9436bk.BACKGROUND;
                if (i != 1) {
                    enumC9436bk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f7555e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7554d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7556f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f7558h)) != 1) {
                z = false;
            }
            return new C9898u7(lValueOf, enumC9436bk, string, new C9873t7(lValueOf2, lValueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    @Override // io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) throws SQLException {
        Cursor cursorQuery;
        Iterator it;
        Long l;
        String str;
        Long l2;
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = sQLiteDatabase.query(this.f7551a, null, null, null, null, null, null, String.valueOf(this.f7552b));
            while (cursorQuery.moveToNext()) {
                try {
                    C9898u7 c9898u7M5771a = m5771a(cursorQuery);
                    if (c9898u7M5771a != null && (l = c9898u7M5771a.f9166a) != null && l.longValue() >= 0 && c9898u7M5771a.f9167b != null && (str = c9898u7M5771a.f9168c) != null && str.length() != 0 && (l2 = c9898u7M5771a.f9169d.f9087a) != null && l2.longValue() > 0) {
                        arrayList.add(this.f7559i.fromModel(c9898u7M5771a));
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7551a);
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                }
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7551a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
            } catch (Throwable unused3) {
            }
        }
    }
}
