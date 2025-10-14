package com.sdkit.paylib.paylibdomain.impl.tbank.interactors;

import android.content.Context;
import android.content.pm.PackageManager;
import com.sdkit.paylib.paylibdomain.api.tbank.interactors.TBankAvailabilityInteractor;
import com.sdkit.paylib.paylibdomain.impl.utils.AbstractC8075b;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.tbank.interactors.a */
/* loaded from: classes5.dex */
public final class C8073a implements TBankAvailabilityInteractor {

    /* renamed from: a */
    public final Context f1563a;

    public C8073a(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f1563a = appContext;
    }

    /* renamed from: a */
    public final boolean m1687a(String str) {
        try {
            AbstractC8075b.m1690a(this.f1563a, str);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.sdkit.paylib.paylibdomain.api.tbank.interactors.TBankAvailabilityInteractor
    public boolean isTBankSupported() {
        String string = this.f1563a.getString(C11403R.string.paylib_domain_tbank_application_package_name);
        Intrinsics.checkNotNullExpressionValue(string, "appContext.getString(R.s…application_package_name)");
        return m1687a(string);
    }
}
