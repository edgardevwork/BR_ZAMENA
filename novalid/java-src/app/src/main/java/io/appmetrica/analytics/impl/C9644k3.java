package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.k3 */
/* loaded from: classes6.dex */
public final class C9644k3 implements IBinaryDataHelper {

    /* renamed from: a */
    public final InterfaceC10022z6 f8492a;

    public C9644k3(C9911uk c9911uk) {
        this.f8492a = c9911uk;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:7:0x001c, B:9:0x0023, B:11:0x0029, B:15:0x003e), top: B:27:0x001c }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] get(String str) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseMo5554a;
        try {
            sQLiteDatabaseMo5554a = this.f8492a.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    cursorQuery = sQLiteDatabaseMo5554a.query("binary_data", null, "data_key = ?", new String[]{str}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                                byte[] blob = cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("value"));
                                AbstractC9664kn.m6340a(cursorQuery);
                                this.f8492a.mo5555a(sQLiteDatabaseMo5554a);
                                return blob;
                            }
                            if (cursorQuery != null) {
                                cursorQuery.getCount();
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (cursorQuery != null) {
                    }
                } catch (Throwable unused2) {
                }
            } else {
                cursorQuery = null;
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
            sQLiteDatabaseMo5554a = null;
        }
        AbstractC9664kn.m6340a(cursorQuery);
        this.f8492a.mo5555a(sQLiteDatabaseMo5554a);
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseMo5554a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo5554a = this.f8492a.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseMo5554a.insertWithOnConflict("binary_data", null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo5554a;
                    sQLiteDatabaseMo5554a = sQLiteDatabase;
                    this.f8492a.mo5555a(sQLiteDatabaseMo5554a);
                }
            }
        } catch (Throwable unused2) {
        }
        this.f8492a.mo5555a(sQLiteDatabaseMo5554a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        SQLiteDatabase sQLiteDatabaseMo5554a;
        try {
            sQLiteDatabaseMo5554a = this.f8492a.mo5554a();
            if (sQLiteDatabaseMo5554a != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseMo5554a.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseMo5554a = null;
        }
        this.f8492a.mo5555a(sQLiteDatabaseMo5554a);
    }
}
