package ru.rustore.sdk.remoteconfig.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.FilesKt__FileReadWriteKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.b */
/* loaded from: classes5.dex */
public final class C11719b {

    /* renamed from: a */
    public final C11687L f10885a;

    /* renamed from: b */
    public final C11732e f10886b;

    public C11719b(C11687L fileSystemWrapper, C11732e actualConfigDtoSerializer) {
        Intrinsics.checkNotNullParameter(fileSystemWrapper, "fileSystemWrapper");
        Intrinsics.checkNotNullParameter(actualConfigDtoSerializer, "actualConfigDtoSerializer");
        this.f10885a = fileSystemWrapper;
        this.f10886b = actualConfigDtoSerializer;
    }

    /* renamed from: a */
    public final C11722c m7532a() throws JSONException {
        C11689M c11689mM7521a = C11683J.m7521a(this.f10885a.m7522a());
        if (c11689mM7521a == null) {
            return null;
        }
        String jsonString = StringsKt__StringsJVMKt.decodeToString(FilesKt__FileReadWriteKt.readBytes(c11689mM7521a.f10833a));
        C11732e c11732e = this.f10886b;
        c11732e.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        JSONObject jSONObject2 = jSONObject.getJSONObject("CONFIG_KEY");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(CONFIG_KEY)");
        Map<String, String> mapM7523a = C11697Q.m7523a(jSONObject2);
        C11682I0 c11682i0 = c11732e.f10916a;
        String strOptString = jSONObject.optString("SHORT_SEGMENTS_KEY");
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(SHORT_SEGMENTS_KEY)");
        c11682i0.getClass();
        String strM7520a = C11682I0.m7520a(strOptString);
        long j = jSONObject.getLong("VERSION_KEY");
        String value = jSONObject.getString("HASH_KEY");
        Intrinsics.checkNotNullExpressionValue(value, "jsonObject.getString(HASH_KEY)");
        Intrinsics.checkNotNullParameter(value, "value");
        return new C11722c(mapM7523a, new C11759r(j, value), strM7520a);
    }

    /* renamed from: a */
    public final void m7533a(C11722c actualConfigDto) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(actualConfigDto, "actualConfigDto");
        C11687L c11687l = this.f10885a;
        String fileName = String.valueOf(actualConfigDto.f10891b.f10971a);
        c11687l.getClass();
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File((File) c11687l.f10831a.getValue(), fileName);
        file.delete();
        file.createNewFile();
        Intrinsics.checkNotNullParameter(file, "file");
        C11732e c11732e = this.f10886b;
        c11732e.getClass();
        Intrinsics.checkNotNullParameter(actualConfigDto, "actualConfigDto");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("VERSION_KEY", actualConfigDto.f10891b.f10971a);
        jSONObject.put("HASH_KEY", actualConfigDto.f10891b.f10972b);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : actualConfigDto.f10890a.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("CONFIG_KEY", jSONObject2);
        C11682I0 c11682i0 = c11732e.f10916a;
        String shortSegments = actualConfigDto.f10892c;
        c11682i0.getClass();
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("short_segments", shortSegments);
        String string = jSONObject3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
        jSONObject.put("SHORT_SEGMENTS_KEY", new JSONObject(string));
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        byte[] bytes = string2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }
}
