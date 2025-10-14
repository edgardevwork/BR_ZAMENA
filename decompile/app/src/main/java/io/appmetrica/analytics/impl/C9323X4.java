package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.X4 */
/* loaded from: classes5.dex */
public final class C9323X4 extends DatabaseScript {

    /* renamed from: a */
    public final int f7440a = 2000;

    /* renamed from: b */
    public final String f7441b = "number";

    /* renamed from: c */
    public final String f7442c = "global_number";

    /* renamed from: d */
    public final String f7443d = "number_of_type";

    /* renamed from: e */
    public final String f7444e = "name";

    /* renamed from: f */
    public final String f7445f = "value";

    /* renamed from: g */
    public final String f7446g = "type";

    /* renamed from: h */
    public final String f7447h = "time";

    /* renamed from: i */
    public final String f7448i = "session_id";

    /* renamed from: j */
    public final String f7449j = "error_environment";

    /* renamed from: k */
    public final String f7450k = "session_type";

    /* renamed from: l */
    public final String f7451l = "app_environment";

    /* renamed from: m */
    public final String f7452m = "app_environment_revision";

    /* renamed from: n */
    public final String f7453n = "truncated";

    /* renamed from: o */
    public final String f7454o = "custom_type";

    /* renamed from: p */
    public final String f7455p = "encrypting_mode";

    /* renamed from: q */
    public final String f7456q = "profile_id";

    /* renamed from: r */
    public final String f7457r = "first_occurrence_status";

    /* renamed from: s */
    public final String f7458s = "source";

    /* renamed from: t */
    public final String f7459t = "attribution_id_changed";

    /* renamed from: u */
    public final String f7460u = "open_id";

    /* renamed from: v */
    public final String f7461v = "extras";

    /* renamed from: w */
    public final String f7462w = "reports";

    /* renamed from: x */
    public final C9573h7 f7463x = new C9573h7(null, 1, 0 == true ? 1 : 0);

    /* renamed from: a */
    public static boolean m5730a(C9548g7 c9548g7) {
        Long l;
        EnumC9329Xa enumC9329Xa;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        Long l5 = c9548g7.f8171a;
        return (l5 == null || l5.longValue() < RealConnection.IDLE_CONNECTION_HEALTHY_NS || c9548g7.f8172b == null || (l = c9548g7.f8173c) == null || l.longValue() < 0 || (enumC9329Xa = c9548g7.f8174d) == null || enumC9329Xa == EnumC9329Xa.EVENT_TYPE_UNDEFINED || (l2 = c9548g7.f8175e) == null || l2.longValue() < 0 || (l3 = c9548g7.f8176f) == null || l3.longValue() < 0 || ((l4 = c9548g7.f8177g.f8068d) != null && l4.longValue() < 0) || ((num = c9548g7.f8177g.f8073i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) throws SQLException {
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query(this.f7462w, null, null, null, null, null, null, String.valueOf(this.f7440a));
            while (cursorQuery.moveToNext()) {
                try {
                    C9548g7 c9548g7M5731a = m5731a(cursorQuery);
                    if (c9548g7M5731a != null && m5730a(c9548g7M5731a)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f7463x.fromModel(c9548g7M5731a));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursorQuery = cursor;
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7462w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f7462w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|2|65|3|(1:5)(2:6|(2:8|5)(1:9))|10|(1:12)(3:13|(1:15)(2:16|(1:18)(1:19))|12)|20|63|21|(2:24|(1:26)(16:27|30|57|31|(1:33)(2:34|(0)(1:37))|61|40|(1:43)|44|59|45|48|(1:50)(1:51)|52|53|54))|23|57|31|(0)(0)|61|40|(0)|44|59|45|48|(0)(0)|52|53|54|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC9675l9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[PHI: r4
  0x0115: PHI (r4v7 io.appmetrica.analytics.impl.l9) = (r4v5 io.appmetrica.analytics.impl.l9), (r4v6 io.appmetrica.analytics.impl.l9) binds: [B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:31:0x0107, B:34:0x0118), top: B:57:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:10:0x002a, B:20:0x00e0, B:44:0x0132, B:48:0x0142, B:52:0x0157, B:51:0x0151, B:38:0x0120, B:29:0x0103, B:13:0x00d4, B:16:0x00d9, B:6:0x0024, B:31:0x0107, B:34:0x0118, B:21:0x00ea, B:24:0x00fb, B:27:0x0100), top: B:65:0x0005, inners: #0, #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9548g7 m5731a(Cursor cursor) {
        EnumC9436bk enumC9436bk;
        EnumC8894F8 enumC8894F8;
        EnumC9426ba enumC9426ba;
        EnumC9426ba enumC9426ba2;
        EnumC9675l9 enumC9675l9;
        int i;
        int i2;
        EnumC9426ba enumC9426ba3;
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7448i)));
            int i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7450k));
            EnumC9436bk enumC9436bk2 = EnumC9436bk.FOREGROUND;
            if (i3 != 0) {
                enumC9436bk2 = EnumC9436bk.BACKGROUND;
                enumC9436bk = i3 == 1 ? enumC9436bk2 : null;
            }
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7441b)));
            EnumC9329Xa enumC9329XaM5744a = EnumC9329Xa.m5744a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7446g)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7442c)));
            Long lValueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7447h)));
            Integer numValueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7454o)));
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f7444e));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7445f));
            Long lValueOf5 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7443d)));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7449j));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7451l));
            Long lValueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f7452m)));
            Integer numValueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f7453n)));
            int i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7455p));
            EnumC8894F8 enumC8894F82 = EnumC8894F8.NONE;
            if (i4 == 0) {
                enumC8894F8 = enumC8894F82;
            } else {
                enumC8894F82 = EnumC8894F8.AES_VALUE_ENCRYPTION;
                if (i4 != 2) {
                    enumC8894F82 = EnumC8894F8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                    if (i4 != 1) {
                        enumC8894F8 = null;
                    }
                }
                enumC8894F8 = enumC8894F82;
            }
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f7456q));
            try {
                i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7457r));
                enumC9426ba3 = EnumC9426ba.FIRST_OCCURRENCE;
            } catch (Throwable unused) {
                enumC9426ba = EnumC9426ba.UNKNOWN;
            }
            if (i2 != 1) {
                enumC9426ba3 = EnumC9426ba.NON_FIRST_OCCURENCE;
                if (i2 != 2) {
                    enumC9426ba = EnumC9426ba.UNKNOWN;
                    enumC9426ba2 = enumC9426ba;
                    i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7458s));
                    EnumC9675l9 enumC9675l92 = EnumC9675l9.NATIVE;
                    if (i != 0) {
                        enumC9675l9 = enumC9675l92;
                    } else {
                        enumC9675l92 = EnumC9675l9.JS;
                        if (i != 1) {
                            enumC9675l9 = null;
                        }
                    }
                    boolean z = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7459t)) == 1;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    int i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7460u));
                    Integer numValueOf3 = Integer.valueOf(i5);
                    int columnIndex = cursor.getColumnIndex(this.f7461v);
                    return new C9548g7(lValueOf, enumC9436bk, lValueOf2, enumC9329XaM5744a, lValueOf3, lValueOf4, new C9523f7(numValueOf, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf2, null, null, enumC8894F8, string5, enumC9426ba2, enumC9675l9, boolValueOf, numValueOf3, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
                }
            }
            enumC9426ba2 = enumC9426ba3;
            i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7458s));
            EnumC9675l9 enumC9675l922 = EnumC9675l9.NATIVE;
            if (i != 0) {
            }
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f7459t)) == 1) {
            }
            Boolean boolValueOf2 = Boolean.valueOf(z);
            int i52 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f7460u));
            Integer numValueOf32 = Integer.valueOf(i52);
            int columnIndex2 = cursor.getColumnIndex(this.f7461v);
            return new C9548g7(lValueOf, enumC9436bk, lValueOf2, enumC9329XaM5744a, lValueOf3, lValueOf4, new C9523f7(numValueOf, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf2, null, null, enumC8894F8, string5, enumC9426ba2, enumC9675l9, boolValueOf2, numValueOf32, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
