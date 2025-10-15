package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.se */
/* loaded from: classes7.dex */
public final class C9855se implements ProtobufConverter {

    /* renamed from: a */
    public final C8950He f9046a;

    public C9855se() {
        this(new C8950He());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8875Ee fromModel(@NonNull C9905ue c9905ue) {
        C8875Ee c8875Ee = new C8875Ee();
        if (!TextUtils.isEmpty(c9905ue.f9175a)) {
            c8875Ee.f6545a = c9905ue.f9175a;
        }
        c8875Ee.f6546b = c9905ue.f9176b.toString();
        c8875Ee.f6547c = this.f9046a.fromModel(c9905ue.f9177c).intValue();
        return c8875Ee;
    }

    public C9855se(C8950He c8950He) {
        this.f9046a = c8950He;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9905ue toModel(@NonNull C8875Ee c8875Ee) {
        JSONObject jSONObject;
        String str = c8875Ee.f6545a;
        String str2 = c8875Ee.f6546b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C9905ue(str, jSONObject, this.f9046a.toModel(Integer.valueOf(c8875Ee.f6547c)));
    }
}
