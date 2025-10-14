package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Je */
/* loaded from: classes8.dex */
public final class C8998Je implements ProtobufConverter {

    /* renamed from: a */
    public final C8950He f6826a = new C8950He();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8850De fromModel(@NonNull C8974Ie c8974Ie) {
        C8850De c8850De = new C8850De();
        if (!TextUtils.isEmpty(c8974Ie.f6780a)) {
            c8850De.f6464a = c8974Ie.f6780a;
        }
        c8850De.f6465b = c8974Ie.f6781b.toString();
        c8850De.f6466c = c8974Ie.f6782c;
        c8850De.f6467d = c8974Ie.f6783d;
        c8850De.f6468e = this.f6826a.fromModel(c8974Ie.f6784e).intValue();
        return c8850De;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8974Ie toModel(@NonNull C8850De c8850De) {
        JSONObject jSONObject;
        String str = c8850De.f6464a;
        String str2 = c8850De.f6465b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C8974Ie(str, jSONObject, c8850De.f6466c, c8850De.f6467d, this.f6826a.toModel(Integer.valueOf(c8850De.f6468e)));
    }
}
