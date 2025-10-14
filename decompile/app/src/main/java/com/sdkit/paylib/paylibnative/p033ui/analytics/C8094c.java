package com.sdkit.paylib.paylibnative.p033ui.analytics;

import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.c */
/* loaded from: classes5.dex */
public final class C8094c implements InterfaceC8093b {

    /* renamed from: a */
    public final InterfaceC8238l f1739a;

    /* renamed from: b */
    public final InterfaceC8412a f1740b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.c$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1741a;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f1741a = iArr;
        }
    }

    public C8094c(InterfaceC8238l paylibStateManager, InterfaceC8412a paymentWaySelector) {
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        this.f1739a = paylibStateManager;
        this.f1740b = paymentWaySelector;
    }

    /* renamed from: a */
    public final EnumC8092a m1785a(InterfaceC8419e.a aVar) {
        switch (aVar == null ? -1 : a.f1741a[aVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnumC8092a.BISTRO;
            case 2:
                return EnumC8092a.TBANK;
            case 3:
                return EnumC8092a.CARD;
            case 4:
                return EnumC8092a.MOBILE;
            case 5:
                return EnumC8092a.SBOLPAY;
            case 6:
                return EnumC8092a.NEW;
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b
    public EnumC8092a getPaymentMethod() {
        EnumC8092a enumC8092aM1857a = AbstractC8101j.m1857a(this.f1739a.mo2351c());
        if (enumC8092aM1857a != null) {
            return enumC8092aM1857a;
        }
        InterfaceC8419e.a aVar = (InterfaceC8419e.a) this.f1740b.mo3643a().getValue();
        if (aVar != null) {
            return m1785a(aVar);
        }
        return null;
    }
}
