package com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain;

import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8161d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.domain.d */
/* loaded from: classes5.dex */
public final class C8156d implements InterfaceC8155c {

    /* renamed from: a */
    public final InterfaceC8238l f2048a;

    public C8156d(InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f2048a = paylibStateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.InterfaceC8155c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8161d provide() {
        String strM2315d;
        String strM2314c;
        C8161d.a aVar;
        AbstractC8237k abstractC8237kMo2351c = this.f2048a.mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.g.c) {
            AbstractC8237k.g.c cVar = (AbstractC8237k.g.c) abstractC8237kMo2351c;
            strM2314c = cVar.m2335b();
            strM2315d = cVar.m2336c();
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.b) {
            AbstractC8237k.g.b bVar = (AbstractC8237k.g.b) abstractC8237kMo2351c;
            strM2314c = bVar.m2331c();
            strM2315d = bVar.m2332d();
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.a) {
            AbstractC8237k.g.a aVar2 = (AbstractC8237k.g.a) abstractC8237kMo2351c;
            strM2314c = aVar2.m2326c();
            strM2315d = aVar2.m2327d();
        } else {
            if (abstractC8237kMo2351c instanceof AbstractC8237k.a.d) {
                AbstractC8237k.a.d dVar = (AbstractC8237k.a.d) abstractC8237kMo2351c;
                strM2314c = dVar.m2307b();
                strM2315d = dVar.m2308c();
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.a.c) {
                AbstractC8237k.a.c cVar2 = (AbstractC8237k.a.c) abstractC8237kMo2351c;
                strM2314c = cVar2.m2305c();
                strM2315d = cVar2.m2306d();
            } else {
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.a.b)) {
                    if (abstractC8237kMo2351c instanceof AbstractC8237k.f.c) {
                        AbstractC8237k.f.c cVar3 = (AbstractC8237k.f.c) abstractC8237kMo2351c;
                        strM2314c = cVar3.m2319b();
                        strM2315d = cVar3.m2320c();
                    } else if (abstractC8237kMo2351c instanceof AbstractC8237k.f.b) {
                        AbstractC8237k.f.b bVar2 = (AbstractC8237k.f.b) abstractC8237kMo2351c;
                        strM2314c = bVar2.m2317c();
                        strM2315d = bVar2.m2318d();
                    } else {
                        if (!(abstractC8237kMo2351c instanceof AbstractC8237k.f.a)) {
                            if (!(abstractC8237kMo2351c instanceof AbstractC8237k.a.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strM2315d = null;
                            strM2314c = null;
                            aVar = null;
                            AbstractC8375j.m3481a(Unit.INSTANCE);
                            if (strM2315d != null || strM2314c == null || aVar == null) {
                                return null;
                            }
                            return new C8161d(aVar, strM2315d, strM2314c);
                        }
                        AbstractC8237k.f.a aVar3 = (AbstractC8237k.f.a) abstractC8237kMo2351c;
                        strM2314c = aVar3.m2314c();
                        strM2315d = aVar3.m2315d();
                    }
                    aVar = C8161d.a.CHANGE_PAYMENT_METHOD;
                    AbstractC8375j.m3481a(Unit.INSTANCE);
                    return strM2315d != null ? null : null;
                }
                AbstractC8237k.a.b bVar3 = (AbstractC8237k.a.b) abstractC8237kMo2351c;
                strM2314c = bVar3.m2302c();
                strM2315d = bVar3.m2303d();
            }
            aVar = C8161d.a.APPLICATION;
            AbstractC8375j.m3481a(Unit.INSTANCE);
            if (strM2315d != null) {
            }
        }
        aVar = C8161d.a.PRODUCT;
        AbstractC8375j.m3481a(Unit.INSTANCE);
        if (strM2315d != null) {
        }
    }
}
