package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.appmetrica.analytics.coreutils.internal.p047db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.ivy.core.event.IvyEventFilter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.M6 */
/* loaded from: classes8.dex */
public final class C9062M6 {

    /* renamed from: a */
    public final ReentrantReadWriteLock.ReadLock f6974a;

    /* renamed from: b */
    public final ReentrantReadWriteLock.WriteLock f6975b;

    /* renamed from: c */
    public final C9373Z6 f6976c;

    /* renamed from: d */
    public final C9038L6 f6977d;

    /* renamed from: e */
    public final Object f6978e;

    /* renamed from: f */
    public final ArrayList f6979f;

    /* renamed from: g */
    public final Context f6980g;

    /* renamed from: h */
    public final C9571h5 f6981h;

    /* renamed from: i */
    public final AtomicLong f6982i;

    /* renamed from: j */
    public final ArrayList f6983j;

    /* renamed from: k */
    public final C8966I6 f6984k;

    /* renamed from: l */
    public final C9573h7 f6985l;

    static {
        HashSet hashSet = new HashSet();
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public C9062M6(C9571h5 c9571h5, C9373Z6 c9373z6, C8966I6 c8966i6, C9573h7 c9573h7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6974a = reentrantReadWriteLock.readLock();
        this.f6975b = reentrantReadWriteLock.writeLock();
        this.f6978e = new Object();
        this.f6979f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f6982i = atomicLong;
        this.f6983j = new ArrayList();
        this.f6976c = c9373z6;
        this.f6980g = c9571h5.getContext();
        this.f6981h = c9571h5;
        this.f6984k = c8966i6;
        this.f6985l = c9573h7;
        atomicLong.set(m5398b());
        C9038L6 c9038l6 = new C9038L6(this, c9571h5);
        this.f6977d = c9038l6;
        c9038l6.setName(m5385a(c9571h5));
    }

    /* renamed from: a */
    public final long m5390a() {
        this.f6974a.lock();
        try {
            return this.f6982i.get();
        } finally {
            this.f6974a.unlock();
        }
    }

    /* renamed from: b */
    public final long m5398b() {
        SQLiteDatabase readableDatabase;
        this.f6974a.lock();
        try {
            readableDatabase = this.f6976c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.f6974a.unlock();
        return jQueryRowsCount;
    }

    /* renamed from: c */
    public final void m5399c() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f6974a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f6976c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                    this.f6974a.unlock();
                    AbstractC9664kn.m6340a(cursorRawQuery);
                    AbstractC9664kn.m6340a(cursorRawQuery2);
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f6974a.unlock();
        AbstractC9664kn.m6340a(cursorRawQuery);
        AbstractC9664kn.m6340a(cursorRawQuery2);
    }

    /* renamed from: d */
    public final void m5400d() {
        this.f6977d.start();
    }

    /* renamed from: a */
    public final long m5391a(Set set) {
        this.f6974a.lock();
        Cursor cursorRawQuery = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f6976c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb.append(IvyEventFilter.f9956OR);
                    }
                    sb.append("type == " + num);
                    i++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC9664kn.m6340a(cursorRawQuery);
        this.f6974a.unlock();
        return j;
    }

    /* renamed from: a */
    public final void m5397a(InterfaceC9136P8 interfaceC9136P8) {
        this.f6983j.add(interfaceC9136P8);
    }

    /* renamed from: a */
    public static String m5385a(InterfaceC8821Ca interfaceC8821Ca) {
        return "DatabaseWorker [" + interfaceC8821Ca.mo5024b().mo5830e() + "]";
    }

    /* renamed from: a */
    public final void m5394a(long j, EnumC9436bk enumC9436bk, long j2) {
        JSONObject jSONObject;
        boolean zM6760a;
        C9923v7 c9923v7 = new C9923v7(null, 1, 0 == true ? 1 : 0);
        C8902Fg c8902Fg = (C8902Fg) this.f6981h.f8239l.m6880a();
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        try {
            jSONObject = new JSONObject().put("dId", c8902Fg.getDeviceId()).put("uId", c8902Fg.getUuid()).put("appVer", c8902Fg.getAppVersion()).put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, c8902Fg.getAppBuildNumber()).put("kitBuildType", c8902Fg.getAnalyticsSdkBuildType()).put("osVer", c8902Fg.getOsVersion()).put("osApiLev", c8902Fg.getOsApiLevel()).put(WebvttCueParser.TAG_LANG, c8902Fg.getLocale()).put("root", c8902Fg.getDeviceRootStatus()).put("app_debuggable", ((C9204S5) c8902Fg).f7231a).put(CommonUrlParts.APP_FRAMEWORK, c8902Fg.getAppFramework()).put("attribution_id", c8902Fg.f6614s).put("analyticsSdkVersionName", c8902Fg.getAnalyticsSdkVersionName()).put("kitBuildNumber", c8902Fg.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(AbstractC8958Hm.m5254a());
        C9735nj c9735nj = AbstractC9710mj.f8655a;
        synchronized (c9735nj) {
            zM6760a = c9735nj.f8760b.m6760a(true);
        }
        ContentValues contentValuesFromModel = c9923v7.fromModel(new C9898u7(lValueOf, enumC9436bk, string, new C9873t7(lValueOf2, lValueOf3, Boolean.valueOf(zM6760a))));
        if (contentValuesFromModel == null) {
            return;
        }
        this.f6975b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f6976c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesFromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f6975b.unlock();
    }

    /* renamed from: a */
    public final void m5395a(ContentValues contentValues) {
        synchronized (this.f6978e) {
            this.f6979f.add(contentValues);
        }
        synchronized (this.f6977d) {
            this.f6977d.notifyAll();
        }
    }

    /* renamed from: a */
    public final int m5389a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f6984k.m5259a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC9875t9.f9113i), TextUtils.join(", ", AbstractC9875t9.f9114j), 10), 2, this.f6981h.f8229b.f7669b, true).f6656b;
        } catch (Throwable th) {
            C9610ij c9610ij = AbstractC8954Hi.f6726a;
            c9610ij.getClass();
            c9610ij.m6292a(new C8978Ii("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    /* renamed from: a */
    public final void m5393a(long j, int i, int i2, boolean z) {
        if (i2 <= 0) {
            return;
        }
        this.f6975b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), "id", "events", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.f6976c.getWritableDatabase();
            if (writableDatabase != null) {
                C8917G6 c8917g6M5259a = this.f6984k.m5259a(writableDatabase, str, 1, this.f6981h.f8229b.f7669b, z);
                if (c8917g6M5259a.f6655a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c8917g6M5259a.f6655a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f6983j.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC9136P8) it2.next()).mo5101b(arrayList);
                    }
                }
                List list = c8917g6M5259a.f6655a;
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        m5396a((ContentValues) list.get(i3), "Event removed from db");
                    }
                }
                this.f6982i.addAndGet(-c8917g6M5259a.f6656b);
            }
        } catch (Throwable unused) {
        }
        this.f6975b.unlock();
    }

    /* renamed from: a */
    public final ContentValues m5392a(long j, EnumC9436bk enumC9436bk) {
        ContentValues contentValues = new ContentValues();
        this.f6974a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f6976c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j), Integer.valueOf(enumC9436bk.f7798a)), null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC9664kn.m6340a(cursorRawQuery);
        this.f6974a.unlock();
        return contentValues;
    }

    /* renamed from: a */
    public static String m5386a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? IvyEventFilter.AND : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m5388a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public final void m5396a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC9875t9.f9108d.contains(EnumC9329Xa.m5744a(asInteger != null ? asInteger.intValue() : -1))) {
            C9548g7 model = new C9573h7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f6981h.f8241n;
            EnumC9329Xa enumC9329Xa = model.f8174d;
            C9523f7 c9523f7 = model.f8177g;
            publicLogger.info(AbstractC9556gf.m6185a(str, enumC9329Xa, c9523f7.f8066b, c9523f7.f8067c), new Object[0]);
        }
    }

    /* renamed from: a */
    public static boolean m5387a(C9062M6 c9062m6) {
        boolean zIsEmpty;
        synchronized (c9062m6.f6978e) {
            zIsEmpty = c9062m6.f6979f.isEmpty();
        }
        return zIsEmpty;
    }
}
