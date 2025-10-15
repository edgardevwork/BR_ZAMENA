package ru.rustore.sdk.billingclient.impl.presentation.handler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.handler.a */
/* loaded from: classes7.dex */
public final class C11546a implements DeeplinkHandler {

    /* renamed from: a */
    public final String f10580a;

    /* renamed from: b */
    public final Context f10581b;

    public C11546a(String deeplinkPrefix, Context appContext) {
        Intrinsics.checkNotNullParameter(deeplinkPrefix, "deeplinkPrefix");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f10580a = deeplinkPrefix;
        this.f10581b = appContext;
    }

    @Override // com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler
    public final boolean openDeeplink(String deeplink, String str) {
        Object objM15699constructorimpl;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.f10581b;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setPackage(str);
            intent.setData(Uri.parse(deeplink));
            context.startActivity(intent);
            objM15699constructorimpl = Result.m15699constructorimpl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            Log.w("openSberPayDeepLink exception! \"" + thM15702exceptionOrNullimpl.getLocalizedMessage() + '\"', thM15702exceptionOrNullimpl);
            objM15699constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM15699constructorimpl).booleanValue();
    }

    @Override // com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler
    public final String provideInitialReturnDeepLink() {
        return this.f10580a;
    }
}
