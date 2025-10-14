package ru.rustore.sdk.billingclient.impl.presentation.auth;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import ru.rustore.sdk.billingclient.impl.domain.factory.C11500b;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;
import ru.rustore.sdk.billingclient.impl.domain.model.C11513j;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11527n;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.user.profile.model.UserProfile;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.e */
/* loaded from: classes5.dex */
public final class C11538e extends Lambda implements Function1<String, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11537d f10565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11538e(C11537d c11537d) {
        super(1);
        this.f10565a = c11537d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) throws JSONException {
        String info = str;
        Intrinsics.checkNotNullParameter(info, "info");
        ((C11542i) this.f10565a.f10561d.getValue()).getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        Lazy<C11497a> lazy = C11497a.f10328u0;
        C11500b c11500b = (C11500b) C11497a.C11965b.m7463a().f10345Q.getValue();
        c11500b.getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        JSONObject jSONObject = new JSONObject(info).getJSONObject("body");
        c11500b.f10470a.f10321a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = jSONObject.getString("jwe");
        Intrinsics.checkNotNullExpressionValue(string, "getString(PAY_TOKEN_IWE_KEY)");
        C11513j c11513j = new C11513j(jCurrentTimeMillis, string, jSONObject.getInt("ttl"));
        boolean z = jSONObject.has("sandbox") ? jSONObject.getBoolean("sandbox") : false;
        String value = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(value, "getString(BACKAND_URL_KEY)");
        Intrinsics.checkNotNullParameter(value, "value");
        C11511h webAuthorizationInfo = new C11511h(c11513j, z, value, jSONObject.has(UserProfile.KEY_USER_ID) ? new C11510g(jSONObject.getLong(UserProfile.KEY_USER_ID)) : null);
        C11527n c11527n = (C11527n) C11497a.C11965b.m7463a().f10347S.getValue();
        c11527n.getClass();
        Intrinsics.checkNotNullParameter(webAuthorizationInfo, "webAuthorizationInfo");
        c11527n.f10531a.m7462a(webAuthorizationInfo);
        this.f10565a.requireActivity().finish();
        return Unit.INSTANCE;
    }
}
