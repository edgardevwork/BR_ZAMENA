package ru.rustore.sdk.metrics.internal;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.metrics.internal.B */
/* loaded from: classes7.dex */
public final class C11584B {

    /* renamed from: a */
    public final C11641w f10610a;

    /* renamed from: b */
    public final C11642x f10611b;

    /* renamed from: c */
    public final C11644z f10612c;

    /* renamed from: d */
    public final C11583A f10613d;

    /* renamed from: ru.rustore.sdk.metrics.internal.B$a */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: a */
        public static final a f10614a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return "'" + it + ExtendedMessageFormat.QUOTE;
        }
    }

    public C11584B(C11641w migrationDtoVer1Factory, C11642x migrationDtoVer1Serializer, C11644z migrationDtoVer2Mapper, C11583A migrationDtoVer2Serializer) {
        Intrinsics.checkNotNullParameter(migrationDtoVer1Factory, "migrationDtoVer1Factory");
        Intrinsics.checkNotNullParameter(migrationDtoVer1Serializer, "migrationDtoVer1Serializer");
        Intrinsics.checkNotNullParameter(migrationDtoVer2Mapper, "migrationDtoVer2Mapper");
        Intrinsics.checkNotNullParameter(migrationDtoVer2Serializer, "migrationDtoVer2Serializer");
        this.f10610a = migrationDtoVer1Factory;
        this.f10611b = migrationDtoVer1Serializer;
        this.f10612c = migrationDtoVer2Mapper;
        this.f10613d = migrationDtoVer2Serializer;
    }

    /* renamed from: a */
    public final void m7483a(SQLiteDatabase db) throws JSONException, SQLException {
        C11584B c11584b = this;
        Intrinsics.checkNotNullParameter(db, "db");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Cursor cursorRawQuery = db.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                C11641w c11641w = c11584b.f10610a;
                String value = cursorRawQuery.getString(columnIndexOrThrow);
                Intrinsics.checkNotNullExpressionValue(value, "cursor.getString(uuidColumnIndex)");
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                String strDecodeToString = StringsKt__StringsJVMKt.decodeToString(blob);
                c11641w.getClass();
                arrayList.add(C11641w.m7505a(value, strDecodeToString));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorRawQuery, null);
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11640v dto = (C11640v) it.next();
                C11644z c11644z = c11584b.f10612c;
                c11644z.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                String str = dto.f10712a;
                String str2 = dto.f10713b;
                Map<String, String> map = dto.f10714c;
                c11644z.f10719a.getClass();
                C11643y dto2 = new C11643y(str, str2, map, System.currentTimeMillis());
                c11584b.f10611b.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", dto.f10713b);
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : dto.f10714c.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("data", jSONObject2);
                String string = jSONObject.toString(i);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString(0)");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                Intrinsics.checkNotNullParameter(bytes, "<this>");
                String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(bytes, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C11608a.f10665a, 30, (Object) null);
                c11584b.f10613d.getClass();
                Intrinsics.checkNotNullParameter(dto2, "dto");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("name", dto2.f10716b);
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, String> entry2 : dto2.f10717c.entrySet()) {
                    jSONObject4.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
                jSONObject3.put("time", dto2.f10718d);
                String string2 = jSONObject3.toString(0);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString(0)");
                byte[] bytes2 = string2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                Intrinsics.checkNotNullParameter(bytes2, "<this>");
                String str3 = "\n                WHEN metrics_event = x'" + strJoinToString$default + "' THEN x'" + ArraysKt___ArraysKt.joinToString$default(bytes2, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C11608a.f10665a, 30, (Object) null) + "'\n            ";
                arrayList2.add(dto.f10712a);
                sb.append(str3);
                i = 0;
                c11584b = this;
            }
            sb.append("\n                END\n                WHERE uuid IN (" + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, a.f10614a, 31, null) + ")\n            ");
            String string3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "updateQuery.toString()");
            db.execSQL(StringsKt__IndentKt.trimIndent(string3));
        } finally {
        }
    }
}
