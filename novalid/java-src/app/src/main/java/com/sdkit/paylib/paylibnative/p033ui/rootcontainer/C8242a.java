package com.sdkit.paylib.paylibnative.p033ui.rootcontainer;

import com.sdkit.paylib.paylibnative.p033ui.p034di.C8212c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.a */
/* loaded from: classes8.dex */
public final class C8242a {

    /* renamed from: a */
    public static final C8242a f2529a = new C8242a();

    /* renamed from: b */
    public static C8212c f2530b;

    /* renamed from: c */
    public static InterfaceC8254b f2531c;

    /* renamed from: a */
    public final InterfaceC8254b m2362a() {
        InterfaceC8254b interfaceC8254bM2210a;
        InterfaceC8254b interfaceC8254b = f2531c;
        if (interfaceC8254b != null) {
            return interfaceC8254b;
        }
        C8212c c8212c = f2530b;
        if (c8212c == null || (interfaceC8254bM2210a = c8212c.m2210a()) == null) {
            return null;
        }
        f2531c = interfaceC8254bM2210a;
        return interfaceC8254bM2210a;
    }

    /* renamed from: b */
    public final void m2364b() {
        f2531c = null;
        f2530b = null;
    }

    /* renamed from: a */
    public final void m2363a(C8212c api) {
        Intrinsics.checkNotNullParameter(api, "api");
        f2531c = null;
        f2530b = api;
    }
}
