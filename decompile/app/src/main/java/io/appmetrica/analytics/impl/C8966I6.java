package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.I6 */
/* loaded from: classes8.dex */
public final class C8966I6 {

    /* renamed from: a */
    public final CounterConfigurationReporterType f6769a;

    /* renamed from: b */
    public final C8904Fi f6770b;

    public C8966I6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, C9676la.m6362h().m6383t());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8917G6 m5259a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor cursorRawQuery;
        ArrayList<ContentValues> arrayList;
        int iDelete;
        C8904Fi c8904Fi;
        C8854Di c8854Di;
        C9445c4 c9445c4;
        Integer num;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", "type", "event_description", "events", str), null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        arrayList = new ArrayList(cursorRawQuery.getCount());
                        while (cursorRawQuery.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                            arrayList.add(contentValues);
                        }
                    } else {
                        arrayList = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C9610ij c9610ij = AbstractC8954Hi.f6726a;
                        c9610ij.getClass();
                        c9610ij.m6292a(new C8978Ii("select_rows_to_delete_exception", th));
                        AbstractC9664kn.m6340a(cursorRawQuery);
                        arrayList = null;
                        iDelete = sQLiteDatabase.delete("events", str, null);
                        if (arrayList != null) {
                            CounterConfigurationReporterType counterConfigurationReporterType = this.f6769a;
                            synchronized (c8904Fi) {
                            }
                        }
                        return new C8917G6(arrayList, iDelete);
                    } finally {
                        AbstractC9664kn.m6340a(cursorRawQuery);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorRawQuery = null;
        }
        try {
            iDelete = sQLiteDatabase.delete("events", str, null);
        } catch (Throwable unused) {
            iDelete = 0;
        }
        if (arrayList != null && arrayList.size() != 0 && iDelete == arrayList.size() && z && str2 != null && (c8904Fi = this.f6770b) != null) {
            CounterConfigurationReporterType counterConfigurationReporterType2 = this.f6769a;
            synchronized (c8904Fi) {
                c8854Di = (C8854Di) c8904Fi.f6623c.get(str2);
                if (c8854Di == null) {
                    c8854Di = new C8854Di(str2, c8904Fi.f6622b, counterConfigurationReporterType2, c8904Fi.f6621a);
                    c8904Fi.f6623c.put(str2, c8854Di);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (ContentValues contentValues2 : arrayList) {
                    Integer asInteger = contentValues2.getAsInteger("global_number");
                    Integer asInteger2 = contentValues2.getAsInteger("type");
                    if (asInteger != null && asInteger2 != null) {
                        jSONArray.put(asInteger);
                        EnumC9329Xa enumC9329XaM5744a = EnumC9329Xa.m5744a(asInteger2.intValue());
                        if (enumC9329XaM5744a == null) {
                            Map map = AbstractC9531ff.f8126a;
                            num = null;
                        } else {
                            num = (Integer) AbstractC9531ff.f8128c.get(enumC9329XaM5744a);
                        }
                        jSONArray2.put(num);
                    }
                }
                jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                JSONObject jSONObjectPut = new JSONObject().put("details", new JSONObject().put("reason", AbstractC8942H6.m5236a(i)).put("cleared", jSONObject).put("actual_deleted_number", iDelete));
                PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                String string = jSONObjectPut.toString();
                Set set = AbstractC9875t9.f9105a;
                EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
                c9445c4 = new C9445c4(string, "", 12290, 0, orCreatePublicLogger);
            } catch (Throwable unused2) {
                c9445c4 = null;
            }
            if (c9445c4 != null && c8854Di.f6489c != null) {
                try {
                    CounterConfiguration counterConfiguration = new CounterConfiguration(c8854Di.f6487a);
                    counterConfiguration.setReporterType(c8854Di.f6489c);
                    c8854Di.f6490d.f6681a.reportData(1, c9445c4.m5658d(new C9383Zg(new C9213Se(c8854Di.f6488b, (ResultReceiver) null), counterConfiguration, null).m5812c()));
                } catch (Throwable unused3) {
                }
            }
        }
        return new C8917G6(arrayList, iDelete);
    }

    public C8966I6(CounterConfigurationReporterType counterConfigurationReporterType, C8904Fi c8904Fi) {
        this.f6769a = counterConfigurationReporterType;
        this.f6770b = c8904Fi;
    }
}
