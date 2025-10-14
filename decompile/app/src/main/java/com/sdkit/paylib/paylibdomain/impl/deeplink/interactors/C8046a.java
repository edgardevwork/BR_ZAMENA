package com.sdkit.paylib.paylibdomain.impl.deeplink.interactors;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.impl.utils.AbstractC8075b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.interactors.a */
/* loaded from: classes6.dex */
public final class C8046a implements DeeplinkSupportInteractor {

    /* renamed from: a */
    public final Context f1164a;

    public C8046a(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f1164a = appContext;
    }

    @Override // com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor
    public boolean isDeepLinkSupported(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullExpressionValue(new Intent("android.intent.action.VIEW", Uri.parse(deeplink)).addFlags(268435456), "Intent(Intent.ACTION_VIE…t.FLAG_ACTIVITY_NEW_TASK)");
        return !AbstractC8075b.m1692a(this.f1164a, r3).isEmpty();
    }
}
