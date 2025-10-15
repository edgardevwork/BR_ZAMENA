package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Z6 */
/* loaded from: classes6.dex */
public final class C9373Z6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    public final String f7623a;

    /* renamed from: b */
    public final PublicLogger f7624b;

    /* renamed from: c */
    public final C9638jm f7625c;

    public C9373Z6(Context context, String str, C9638jm c9638jm, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC8841D5.f6459b);
        this.f7625c = c9638jm;
        this.f7623a = str;
        this.f7624b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f7624b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f7623a);
            C9610ij c9610ij = AbstractC8954Hi.f6726a;
            c9610ij.getClass();
            c9610ij.m6292a(new C8978Ii("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f7624b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f7623a);
            C9610ij c9610ij = AbstractC8954Hi.f6726a;
            c9610ij.getClass();
            c9610ij.m6292a(new C8978Ii("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f7625c.f8478a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C9638jm c9638jm = this.f7625c;
        if (i <= i2) {
            c9638jm.getClass();
            return;
        }
        try {
            c9638jm.f8479b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c9638jm.f8478a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C9638jm c9638jm = this.f7625c;
        c9638jm.getClass();
        try {
            C9663km c9663km = c9638jm.f8481d;
            if (c9663km == null || c9663km.m6337a(sQLiteDatabase)) {
                return;
            }
            try {
                c9638jm.f8479b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c9638jm.f8478a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        C9638jm c9638jm = this.f7625c;
        c9638jm.getClass();
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    Collection collection = (Collection) c9638jm.f8480c.f8720a.get(Integer.valueOf(i3));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z || (!c9638jm.f8481d.m6337a(sQLiteDatabase))) {
            try {
                c9638jm.f8479b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c9638jm.f8478a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
