package ru.rustore.sdk.billingclient.impl.data.datasource;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.billingclient.impl.data.deserializer.C11445a;
import ru.rustore.sdk.billingclient.impl.data.model.C11453a;
import ru.rustore.sdk.billingclient.impl.data.model.C11454b;
import ru.rustore.sdk.core.exception.RuStoreException;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.f */
/* loaded from: classes8.dex */
public final class C11428f extends Lambda implements Function1<C11453a, C11454b> {

    /* renamed from: a */
    public final /* synthetic */ C11429g f10214a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11428f(C11429g c11429g) {
        super(1);
        this.f10214a = c11429g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11454b invoke(C11453a c11453a) throws JSONException {
        C11453a response = c11453a;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.f10238b != 200) {
            throw new RuStoreException(response.f10238b + " response with error from " + response.f10237a);
        }
        C11445a c11445a = this.f10214a.f10216b;
        String jsonString = response.f10239c;
        c11445a.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        String value = new JSONObject(jsonString).getJSONObject("body").getString("jwe");
        Intrinsics.checkNotNullExpressionValue(value, "jsonResponse.getString(JWE_KEY)");
        Intrinsics.checkNotNullParameter(value, "value");
        return new C11454b(value);
    }
}
