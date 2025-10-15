package com.sdkit.paylib.paylibnative.p033ui.analytics;

import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.j */
/* loaded from: classes8.dex */
public abstract class AbstractC8101j {
    /* JADX WARN: Removed duplicated region for block: B:126:0x007e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC8092a m1857a(AbstractC8237k abstractC8237k) {
        FinishReason finishReasonM2316b;
        Intrinsics.checkNotNullParameter(abstractC8237k, "<this>");
        if (!(abstractC8237k instanceof AbstractC8237k.a.b)) {
            if (abstractC8237k instanceof AbstractC8237k.a.c) {
                finishReasonM2316b = ((AbstractC8237k.a.c) abstractC8237k).m2304b();
            } else if (!(abstractC8237k instanceof AbstractC8237k.a.d) && !(abstractC8237k instanceof AbstractC8237k.a.e) && !Intrinsics.areEqual(abstractC8237k, AbstractC8237k.c.f2482a) && !Intrinsics.areEqual(abstractC8237k, AbstractC8237k.d.f2483a) && !(abstractC8237k instanceof AbstractC8237k.e.a)) {
                if (abstractC8237k instanceof AbstractC8237k.e.b) {
                    finishReasonM2316b = ((AbstractC8237k.e.b) abstractC8237k).m2310b();
                } else if (!(abstractC8237k instanceof AbstractC8237k.e.d) && !(abstractC8237k instanceof AbstractC8237k.g.a)) {
                    if (abstractC8237k instanceof AbstractC8237k.g.b) {
                        finishReasonM2316b = ((AbstractC8237k.g.b) abstractC8237k).m2330b();
                    } else if ((abstractC8237k instanceof AbstractC8237k.g.c) || (abstractC8237k instanceof AbstractC8237k.g.e) || (abstractC8237k instanceof AbstractC8237k.f.a)) {
                        finishReasonM2316b = null;
                    } else if (abstractC8237k instanceof AbstractC8237k.f.b) {
                        finishReasonM2316b = ((AbstractC8237k.f.b) abstractC8237k).m2316b();
                    } else {
                        if (!(abstractC8237k instanceof AbstractC8237k.f.e) && !(abstractC8237k instanceof AbstractC8237k.f.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        finishReasonM2316b = null;
                    }
                }
            }
        }
        if ((finishReasonM2316b instanceof FinishReason.SbolPayCompleted) || (finishReasonM2316b instanceof FinishReason.SbolPayCompletedWithState)) {
            return EnumC8092a.SBOLPAY;
        }
        if (finishReasonM2316b instanceof FinishReason.SbpPayCompletedWithState) {
            return EnumC8092a.BISTRO;
        }
        if (finishReasonM2316b instanceof FinishReason.TPayCompletedWithState) {
            return EnumC8092a.TBANK;
        }
        if (finishReasonM2316b == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
