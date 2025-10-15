package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.uf */
/* loaded from: classes7.dex */
public final class C9906uf {

    /* renamed from: a */
    public final C8851Df f9178a;

    /* renamed from: b */
    public final C9976xa f9179b;

    /* renamed from: c */
    public final C9119Of f9180c;

    /* renamed from: d */
    public final Lazy f9181d = LazyKt__LazyJVMKt.lazy(new C9831rf(this));

    /* renamed from: e */
    public final Lazy f9182e = LazyKt__LazyJVMKt.lazy(new C9781pf(this));

    /* renamed from: f */
    public final Lazy f9183f = LazyKt__LazyJVMKt.lazy(new C9881tf(this));

    /* renamed from: g */
    public final ArrayList f9184g = new ArrayList();

    public C9906uf(C8851Df c8851Df, C9095Nf c9095Nf, C9976xa c9976xa, C9119Of c9119Of) {
        this.f9178a = c8851Df;
        this.f9179b = c9976xa;
        this.f9180c = c9119Of;
    }

    /* renamed from: a */
    public static final InterfaceC9706mf m6856a(C9906uf c9906uf) {
        return (InterfaceC9706mf) c9906uf.f9181d.getValue();
    }

    /* renamed from: a */
    public static final void m6857a(C9906uf c9906uf, C8901Ff c8901Ff, InterfaceC9706mf interfaceC9706mf) {
        boolean zAreEqual;
        c9906uf.f9184g.add(c8901Ff);
        C9119Of c9119Of = c9906uf.f9180c;
        if (c8901Ff == null) {
            c9119Of.getClass();
        } else {
            SafePackageManager safePackageManager = c9119Of.f7060b;
            Context context = c9119Of.f7059a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c8901Ff.f6598d.ordinal();
            if (iOrdinal == 1) {
                zAreEqual = Intrinsics.areEqual(c9119Of.f7064f, installerPackageName);
            } else if (iOrdinal == 2) {
                zAreEqual = Intrinsics.areEqual(c9119Of.f7065g, installerPackageName);
            }
            if (zAreEqual) {
                c9906uf.m6858a(c8901Ff);
                return;
            }
        }
        interfaceC9706mf.mo6488a();
    }

    /* renamed from: a */
    public final void m6858a(C8901Ff c8901Ff) {
        C8851Df c8851Df = this.f9178a;
        synchronized (c8851Df) {
            c8851Df.f6470b = c8901Ff;
            c8851Df.f6471c = true;
            c8851Df.f6472d.m6908a(c8901Ff);
            c8851Df.f6472d.m6913d();
            c8851Df.m5069a(c8851Df.f6470b);
        }
    }
}
