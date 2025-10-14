package ru.rustore.sdk.metrics.internal;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.metrics.internal.AbstractC11604W;

/* renamed from: ru.rustore.sdk.metrics.internal.T */
/* loaded from: classes7.dex */
public final class C11601T {

    /* renamed from: a */
    public final C11596N f10648a;

    /* renamed from: b */
    public final C11600S f10649b;

    public C11601T(C11596N persistentMetricsEventRepository, C11600S remoteMetricsEventRepository) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        Intrinsics.checkNotNullParameter(remoteMetricsEventRepository, "remoteMetricsEventRepository");
        this.f10648a = persistentMetricsEventRepository;
        this.f10649b = remoteMetricsEventRepository;
    }

    /* renamed from: a */
    public final AbstractC11604W m7489a() throws JSONException {
        String str;
        String strM7496a;
        C11596N c11596n = this.f10648a;
        C11591I c11591i = c11596n.f10634a;
        c11591i.getClass();
        String strTrimIndent = StringsKt__IndentKt.trimIndent("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((SQLiteDatabase) c11591i.f10625c.getValue()).rawQuery(strTrimIndent, new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                String value = cursorRawQuery.getString(columnIndexOrThrow);
                Intrinsics.checkNotNullExpressionValue(value, "cursor.getString(uuidColumnIndex)");
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(new C11592J(value, blob));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorRawQuery, null);
            List<C11592J> list = CollectionsKt___CollectionsKt.toList(arrayList);
            c11591i.f10624b.mo7493a(new C11590H(list));
            C11594L c11594l = c11596n.f10636c;
            ArrayList values = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (C11592J dto : list) {
                c11594l.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                String str2 = dto.f10628a;
                C11638t c11638t = c11594l.f10632a;
                String jsonString = StringsKt__StringsJVMKt.decodeToString(dto.f10629b);
                c11638t.getClass();
                Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                JSONObject jSONObject = new JSONObject(jsonString);
                String string = jSONObject.getString("name");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(NAME_KEY)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
                Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList2.add(TuplesKt.m7112to(next, jSONObject2.get(next).toString()));
                }
                values.add(new C11586D(str2, new MetricsEvent(string, MapsKt__MapsKt.toMap(arrayList2), jSONObject.getLong("time"))));
            }
            if (values.isEmpty()) {
                return AbstractC11604W.a.f10655a;
            }
            C11600S c11600s = this.f10649b;
            c11600s.getClass();
            Intrinsics.checkNotNullParameter(values, "values");
            String value2 = c11600s.f10645b.f10615a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(value2, "context.packageName");
            Intrinsics.checkNotNullParameter(value2, "value");
            C11611b0 c11611b0 = c11600s.f10644a;
            SharedPreferences sharedPreferences = c11611b0.f10667a.f10661a;
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
            String value3 = sharedPreferences.getString("USER_ID_KEY", null);
            if (value3 != null) {
                Intrinsics.checkNotNullParameter(value3, "value");
            } else {
                value3 = null;
            }
            if (value3 == null) {
                synchronized (C11611b0.f10666c) {
                    try {
                        SharedPreferences sharedPreferences2 = c11611b0.f10667a.f10661a;
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "sharedPreferences");
                        String value4 = sharedPreferences2.getString("USER_ID_KEY", null);
                        if (value4 != null) {
                            Intrinsics.checkNotNullParameter(value4, "value");
                        } else {
                            value4 = null;
                        }
                        strM7496a = value4 == null ? c11611b0.m7496a() : value4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                str = strM7496a;
            } else {
                str = value3;
            }
            C11615d0 c11615d0 = (C11615d0) c11600s.f10647d.f10673b.getValue();
            String str3 = c11615d0 != null ? c11615d0.f10671a : null;
            ArrayList values2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
            Iterator it = values.iterator();
            while (it.hasNext()) {
                C11586D c11586d = (C11586D) it.next();
                values2.add(new C11598P(value2, c11586d.f10616a, str, str3, c11586d.f10617b));
            }
            C11597O c11597o = c11600s.f10646c;
            c11597o.getClass();
            Intrinsics.checkNotNullParameter(values2, "values");
            c11597o.f10638a.m7503b(values2);
            return new AbstractC11604W.b(values);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorRawQuery, th2);
                throw th3;
            }
        }
    }
}
