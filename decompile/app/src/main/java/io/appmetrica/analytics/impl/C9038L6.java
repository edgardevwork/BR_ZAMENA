package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.L6 */
/* loaded from: classes8.dex */
public final class C9038L6 extends InterruptionSafeThread {

    /* renamed from: a */
    public final C9571h5 f6922a;

    /* renamed from: b */
    public final /* synthetic */ C9062M6 f6923b;

    public C9038L6(C9062M6 c9062m6, C9571h5 c9571h5) {
        this.f6923b = c9062m6;
        this.f6922a = c9571h5;
    }

    /* renamed from: a */
    public final synchronized void m5345a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f6923b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f6923b.f6983j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC9136P8) it2.next()).mo5100a(arrayList2);
            }
            this.f6922a.f8244q.m6633b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (C9062M6.m5387a(this.f6923b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f6923b.f6978e) {
                arrayList = new ArrayList(this.f6923b.f6979f);
                this.f6923b.f6979f.clear();
            }
            C9062M6 c9062m6 = this.f6923b;
            c9062m6.getClass();
            if (!arrayList.isEmpty()) {
                c9062m6.f6975b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = c9062m6.f6976c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                c9062m6.f6982i.incrementAndGet();
                                c9062m6.m5396a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            c9062m6.f6982i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            c9062m6.f6975b.unlock();
                            m5345a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                c9062m6.f6975b.unlock();
            }
            m5345a(arrayList);
        }
    }
}
