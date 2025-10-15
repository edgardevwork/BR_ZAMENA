package com.sdkit.paylib.paylibdomain.impl.sbol.interactors;

import android.content.Context;
import android.content.pm.PackageManager;
import com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor;
import com.sdkit.paylib.paylibdomain.impl.utils.AbstractC8075b;
import com.sdkit.paylib.paylibutils.lib.C8610b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.sbol.interactors.a */
/* loaded from: classes5.dex */
public final class C8069a implements SbolAvailabilityInteractor {

    /* renamed from: a */
    public final Context f1473a;

    public C8069a(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f1473a = appContext;
    }

    /* renamed from: a */
    public final boolean m1646a(String str) {
        try {
            AbstractC8075b.m1690a(this.f1473a, str);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor
    public boolean isProdSbolSupported() {
        return m1646a("ru." + C8610b.f5886a.m4714a() + "bankmobile");
    }

    @Override // com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor
    public boolean isSbolSupported() {
        StringBuilder sb = new StringBuilder("ru.");
        sb.append(C8610b.f5886a.m4714a());
        sb.append("bankmobile_alpha");
        return isProdSbolSupported() || m1646a(sb.toString());
    }
}
