package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.f */
/* loaded from: classes5.dex */
public final class C11539f extends Lambda implements Function1<String, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11537d f10566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11539f(C11537d c11537d) {
        super(1);
        this.f10566a = c11537d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Object objM15699constructorimpl;
        String url = str;
        Intrinsics.checkNotNullParameter(url, "pageUrl");
        ((C11542i) this.f10566a.f10561d.getValue()).getClass();
        Intrinsics.checkNotNullParameter(url, "pageUrl");
        Lazy<C11497a> lazy = C11497a.f10328u0;
        C11543j c11543j = (C11543j) C11497a.C11965b.m7463a().f10352X.getValue();
        if (!StringsKt__StringsJVMKt.startsWith$default(url, "https://", false, 2, null)) {
            url = "https://" + url;
        }
        c11543j.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addFlags(268435456);
            c11543j.f10573a.startActivity(intent);
            objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl != null) {
            Log.e("AuthRouter", thM15702exceptionOrNullimpl.toString());
        }
        return Unit.INSTANCE;
    }
}
