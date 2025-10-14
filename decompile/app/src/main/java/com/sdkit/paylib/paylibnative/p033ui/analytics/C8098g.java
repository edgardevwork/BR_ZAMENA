package com.sdkit.paylib.paylibnative.p033ui.analytics;

import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.analytics.PaylibEvent;
import com.sdkit.paylib.paylibnative.api.analytics.PaylibMetric;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8100i;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.g */
/* loaded from: classes5.dex */
public final class C8098g implements InterfaceC8097f {

    /* renamed from: d */
    public static final a f1744d = new a(null);

    /* renamed from: a */
    public final CustomPaylibAnalytics f1745a;

    /* renamed from: b */
    public final InterfaceC8131b f1746b;

    /* renamed from: c */
    public final InterfaceC8238l f1747c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.g$a */
    /* loaded from: classes8.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.g$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1748a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1749b;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f1748a = iArr;
            int[] iArr2 = new int[EnumC8092a.values().length];
            try {
                iArr2[EnumC8092a.BISTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC8092a.TBANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC8092a.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC8092a.MOBILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC8092a.NEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC8092a.SBOLPAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f1749b = iArr2;
        }
    }

    public C8098g(CustomPaylibAnalytics customPaylibAnalytics, InterfaceC8131b config, InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f1745a = customPaylibAnalytics;
        this.f1746b = config;
        this.f1747c = paylibStateManager;
    }

    /* renamed from: a */
    public final String m1827a(EnumC8092a enumC8092a) {
        switch (b.f1749b[enumC8092a.ordinal()]) {
            case 1:
                return "sbp";
            case 2:
                return "tbank_p";
            case 3:
                return "card";
            case 4:
                return "mobile";
            case 5:
                return "new_card";
            case 6:
                return "sbolpay";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public final String m1829b(AbstractC8100i abstractC8100i) {
        if (abstractC8100i instanceof AbstractC8100i.l) {
            return "PAYLIB_INVOICE_LOADING_FAIL";
        }
        if (abstractC8100i instanceof AbstractC8100i.m) {
            return "PAYLIB_INVOICE_LOADING_SUCCESS";
        }
        if (abstractC8100i instanceof AbstractC8100i.n) {
            return "PAYLIB_INVOICE_WITH_LOYALTY_LOADING_SUCCESS";
        }
        if (abstractC8100i instanceof AbstractC8100i.q) {
            return "PAYMENT_ERROR";
        }
        if (abstractC8100i instanceof AbstractC8100i.r) {
            return "PAYMENT_EXIT";
        }
        if (abstractC8100i instanceof AbstractC8100i.s) {
            return "PAYMENTS_EXIT_TIMEOUT";
        }
        if (abstractC8100i instanceof AbstractC8100i.t) {
            return "PAYMENTS_LOADING";
        }
        if (abstractC8100i instanceof AbstractC8100i.u) {
            return "PAYMENTS_ORDER_SHOWN";
        }
        if (abstractC8100i instanceof AbstractC8100i.v) {
            return "PAYMENTS_PAY_FAILED";
        }
        if (abstractC8100i instanceof AbstractC8100i.w) {
            return "PAYMENTS_PAY_LOADING";
        }
        if (abstractC8100i instanceof AbstractC8100i.x) {
            return "PAYMENTS_PAY_SUCCEEDED";
        }
        if (abstractC8100i instanceof AbstractC8100i.y) {
            return "PAYMENTS_SBOLPAY_SALUT_FAIL";
        }
        if (abstractC8100i instanceof AbstractC8100i.z) {
            return "PAYMENTS_SBOLPAY_SBOL_CANCEL";
        }
        if (abstractC8100i instanceof AbstractC8100i.a0) {
            return "PAYMENTS_SBOLPAY_SBOL_FAIL";
        }
        if (abstractC8100i instanceof AbstractC8100i.b0) {
            return "PAYMENTS_SBOLPAY_SBOL_SUCCESS";
        }
        if (abstractC8100i instanceof AbstractC8100i.c0) {
            return "PAYMENTS_SBOLPAY_STARTED";
        }
        if (abstractC8100i instanceof AbstractC8100i.d0) {
            return "PAYMENTS_SCREEN_OPENED";
        }
        if (abstractC8100i instanceof AbstractC8100i.e0) {
            return "PAYMENTS_USE_WEB";
        }
        if (abstractC8100i instanceof AbstractC8100i.f0) {
            return "PAYMENTS_USE_WEB_CANCEL";
        }
        if (abstractC8100i instanceof AbstractC8100i.g0) {
            return "PAYMENTS_USE_WEB_FAIL";
        }
        if (abstractC8100i instanceof AbstractC8100i.h0) {
            return "PAYMENTS_USE_WEB_STARTED";
        }
        if (abstractC8100i instanceof AbstractC8100i.i0) {
            return "PAYMENTS_USE_WEB_SUCCESS";
        }
        if (abstractC8100i instanceof AbstractC8100i.k0) {
            return "SPASIBO_PAYMENTS_PAY_SUCCEEDED";
        }
        if (abstractC8100i instanceof AbstractC8100i.l0) {
            return "WEB_PAYMENT_RECEIVED_SSL_ERROR";
        }
        if (abstractC8100i instanceof AbstractC8100i.p) {
            return "paySheetPaymentMethodSelect";
        }
        if (abstractC8100i instanceof AbstractC8100i.c) {
            return "paySheetPaymentMethodShowFull";
        }
        if (abstractC8100i instanceof AbstractC8100i.b) {
            return "paySheetPaymentMethodSaveAndPay";
        }
        if (abstractC8100i instanceof AbstractC8100i.d) {
            return "paySheetPaymentProceed";
        }
        if (abstractC8100i instanceof AbstractC8100i.j0) {
            return "paySheetPaymentAgain";
        }
        if (abstractC8100i instanceof AbstractC8100i.o) {
            return "PAYLIBSDK_FAILED";
        }
        if (abstractC8100i instanceof AbstractC8100i.a) {
            return "paySheetAddCardClicked";
        }
        if (abstractC8100i instanceof AbstractC8100i.g) {
            return "paySheetPaymentSBP";
        }
        if (abstractC8100i instanceof AbstractC8100i.h) {
            return "paySheetPaymentSBPMissedPackages";
        }
        if (abstractC8100i instanceof AbstractC8100i.e) {
            return "paySheetAddPhoneNumber";
        }
        if (abstractC8100i instanceof AbstractC8100i.j) {
            return "paySheetPhoneNumberConfirmed";
        }
        if (abstractC8100i instanceof AbstractC8100i.i) {
            return "paySheetPhoneNumberCodeAgain";
        }
        if (abstractC8100i instanceof AbstractC8100i.k) {
            return "paySheetSaveCardSelected";
        }
        if (abstractC8100i instanceof AbstractC8100i.f) {
            return "paySheetPaymentAvailableMethods";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public final List m1830c(AbstractC8100i abstractC8100i) {
        PaylibMetric.StringParam stringParam;
        if (abstractC8100i instanceof AbstractC8100i.q) {
            AbstractC8100i.q qVar = (AbstractC8100i.q) abstractC8100i;
            PaylibMetric.StringParam stringParam2 = new PaylibMetric.StringParam("source", qVar.m1849a());
            String strM1850b = qVar.m1850b();
            return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new PaylibMetric.StringParam[]{stringParam2, strM1850b != null ? new PaylibMetric.StringParam("state", strM1850b) : null});
        }
        if (abstractC8100i instanceof AbstractC8100i.l) {
            AbstractC8100i.l lVar = (AbstractC8100i.l) abstractC8100i;
            String strM1844a = lVar.m1844a();
            PaylibMetric.StringParam stringParam3 = strM1844a != null ? new PaylibMetric.StringParam("code", strM1844a) : null;
            String strM1845b = lVar.m1845b();
            return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new PaylibMetric.StringParam[]{stringParam3, strM1845b != null ? new PaylibMetric.StringParam("status", strM1845b) : null});
        }
        if (abstractC8100i instanceof AbstractC8100i.p) {
            stringParam = new PaylibMetric.StringParam("method_type", m1828a(((AbstractC8100i.p) abstractC8100i).m1848a()));
        } else {
            if (abstractC8100i instanceof AbstractC8100i.b) {
                return CollectionsKt__CollectionsJVMKt.listOf(new PaylibMetric.StringParam("method_type", "card"));
            }
            if (abstractC8100i instanceof AbstractC8100i.d) {
                AbstractC8100i.d dVar = (AbstractC8100i.d) abstractC8100i;
                return CollectionsKt__CollectionsKt.listOf((Object[]) new PaylibMetric.StringParam[]{new PaylibMetric.StringParam("purchaseId", dVar.m1836b()), new PaylibMetric.StringParam("method_type", m1828a(dVar.m1835a()))});
            }
            if (abstractC8100i instanceof AbstractC8100i.o) {
                AbstractC8100i.o oVar = (AbstractC8100i.o) abstractC8100i;
                String strM1846a = oVar.m1846a();
                PaylibMetric.StringParam stringParam4 = strM1846a != null ? new PaylibMetric.StringParam("code", strM1846a) : null;
                String strM1847b = oVar.m1847b();
                return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new PaylibMetric.StringParam[]{stringParam4, strM1847b != null ? new PaylibMetric.StringParam("trace_id", strM1847b) : null});
            }
            if (abstractC8100i instanceof AbstractC8100i.x) {
                AbstractC8100i.x xVar = (AbstractC8100i.x) abstractC8100i;
                PaylibMetric.StringParam stringParam5 = new PaylibMetric.StringParam("purchaseId", xVar.m1856b());
                EnumC8092a enumC8092aM1855a = xVar.m1855a();
                return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new PaylibMetric.StringParam[]{stringParam5, enumC8092aM1855a != null ? new PaylibMetric.StringParam("payment_method", m1827a(enumC8092aM1855a)) : null});
            }
            if (abstractC8100i instanceof AbstractC8100i.v) {
                AbstractC8100i.v vVar = (AbstractC8100i.v) abstractC8100i;
                PaylibMetric.StringParam stringParam6 = new PaylibMetric.StringParam("purchaseId", vVar.m1853b());
                EnumC8092a enumC8092aM1852a = vVar.m1852a();
                return CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new PaylibMetric.StringParam[]{stringParam6, enumC8092aM1852a != null ? new PaylibMetric.StringParam("payment_method", m1827a(enumC8092aM1852a)) : null});
            }
            if (abstractC8100i instanceof AbstractC8100i.g) {
                AbstractC8100i.g gVar = (AbstractC8100i.g) abstractC8100i;
                return CollectionsKt__CollectionsKt.listOf((Object[]) new PaylibMetric.Param[]{new PaylibMetric.StringParam("selected_app_bank_name", gVar.m1840b()), new PaylibMetric.StringParam("selected_app_package_name", gVar.m1841c()), new PaylibMetric.IntParam("installed_apps_count", gVar.m1839a().size()), new PaylibMetric.StringParam("installed_apps", CollectionsKt___CollectionsKt.joinToString$default(gVar.m1839a(), "|", null, null, 0, null, null, 62, null))});
            }
            if (abstractC8100i instanceof AbstractC8100i.h) {
                stringParam = new PaylibMetric.StringParam("packages", CollectionsKt___CollectionsKt.joinToString$default(((AbstractC8100i.h) abstractC8100i).m1842a(), "|", null, null, 0, null, null, 62, null));
            } else if (abstractC8100i instanceof AbstractC8100i.k) {
                stringParam = new PaylibMetric.StringParam("is_save_card_selected", String.valueOf(((AbstractC8100i.k) abstractC8100i).m1843a()));
            } else {
                if (abstractC8100i instanceof AbstractC8100i.f) {
                    AbstractC8100i.f fVar = (AbstractC8100i.f) abstractC8100i;
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new PaylibMetric.StringParam[]{new PaylibMetric.StringParam("purchaseId", fVar.m1838b()), new PaylibMetric.StringParam("methods", CollectionsKt___CollectionsKt.joinToString$default(fVar.m1837a(), "|", null, null, 0, null, null, 62, null))});
                }
                if (abstractC8100i instanceof AbstractC8100i.w) {
                    stringParam = new PaylibMetric.StringParam("purchaseId", ((AbstractC8100i.w) abstractC8100i).m1854a());
                } else {
                    if (!(abstractC8100i instanceof AbstractC8100i.t)) {
                        if (abstractC8100i instanceof AbstractC8100i.e ? true : abstractC8100i instanceof AbstractC8100i.j ? true : abstractC8100i instanceof AbstractC8100i.i ? true : abstractC8100i instanceof AbstractC8100i.m ? true : abstractC8100i instanceof AbstractC8100i.n ? true : abstractC8100i instanceof AbstractC8100i.r ? true : abstractC8100i instanceof AbstractC8100i.s ? true : abstractC8100i instanceof AbstractC8100i.u ? true : abstractC8100i instanceof AbstractC8100i.y ? true : abstractC8100i instanceof AbstractC8100i.z ? true : abstractC8100i instanceof AbstractC8100i.a0 ? true : abstractC8100i instanceof AbstractC8100i.b0 ? true : abstractC8100i instanceof AbstractC8100i.c0 ? true : abstractC8100i instanceof AbstractC8100i.d0 ? true : abstractC8100i instanceof AbstractC8100i.e0 ? true : abstractC8100i instanceof AbstractC8100i.f0 ? true : abstractC8100i instanceof AbstractC8100i.g0 ? true : abstractC8100i instanceof AbstractC8100i.h0 ? true : abstractC8100i instanceof AbstractC8100i.i0 ? true : abstractC8100i instanceof AbstractC8100i.k0 ? true : abstractC8100i instanceof AbstractC8100i.c ? true : abstractC8100i instanceof AbstractC8100i.j0 ? true : abstractC8100i instanceof AbstractC8100i.a ? true : abstractC8100i instanceof AbstractC8100i.l0) {
                            return CollectionsKt__CollectionsKt.emptyList();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    stringParam = new PaylibMetric.StringParam("purchaseId", ((AbstractC8100i.t) abstractC8100i).m1851a());
                }
            }
        }
        return CollectionsKt__CollectionsJVMKt.listOf(stringParam);
    }

    /* renamed from: d */
    public final PaylibEvent m1831d(AbstractC8100i abstractC8100i) {
        PaylibEvent paymentsPayLoading;
        String strM1827a;
        String strM1827a2;
        if (abstractC8100i instanceof AbstractC8100i.m) {
            return PaylibEvent.PaylibInvoiceLoadingSuccess.INSTANCE;
        }
        if (abstractC8100i instanceof AbstractC8100i.p) {
            paymentsPayLoading = new PaylibEvent.PaySheetPaymentMethodSelect(m1828a(((AbstractC8100i.p) abstractC8100i).m1848a()));
        } else {
            if (abstractC8100i instanceof AbstractC8100i.c) {
                return PaylibEvent.PaySheetPaymentMethodShowFull.INSTANCE;
            }
            if (abstractC8100i instanceof AbstractC8100i.b) {
                return PaylibEvent.PaySheetPaymentMethodSaveAndPay.INSTANCE;
            }
            if (abstractC8100i instanceof AbstractC8100i.d) {
                AbstractC8100i.d dVar = (AbstractC8100i.d) abstractC8100i;
                paymentsPayLoading = new PaylibEvent.PaySheetPaymentProceed(dVar.m1836b(), m1828a(dVar.m1835a()));
            } else {
                if (abstractC8100i instanceof AbstractC8100i.j0) {
                    return PaylibEvent.PaySheetPaymentAgain.INSTANCE;
                }
                if (abstractC8100i instanceof AbstractC8100i.g) {
                    AbstractC8100i.g gVar = (AbstractC8100i.g) abstractC8100i;
                    paymentsPayLoading = new PaylibEvent.PaySheetPaymentSBP(gVar.m1840b(), gVar.m1841c(), gVar.m1839a());
                } else {
                    if (abstractC8100i instanceof AbstractC8100i.e) {
                        return PaylibEvent.PaySheetAddPhoneNumber.INSTANCE;
                    }
                    if (abstractC8100i instanceof AbstractC8100i.j) {
                        return PaylibEvent.PaySheetPhoneNumberConfirmed.INSTANCE;
                    }
                    if (abstractC8100i instanceof AbstractC8100i.i) {
                        return PaylibEvent.PaySheetPhoneNumberCodeAgain.INSTANCE;
                    }
                    if (abstractC8100i instanceof AbstractC8100i.k) {
                        paymentsPayLoading = new PaylibEvent.PaySheetSaveCardSelected(((AbstractC8100i.k) abstractC8100i).m1843a());
                    } else if (abstractC8100i instanceof AbstractC8100i.f) {
                        AbstractC8100i.f fVar = (AbstractC8100i.f) abstractC8100i;
                        paymentsPayLoading = new PaylibEvent.PaySheetPaymentAvailableMethods(fVar.m1838b(), fVar.m1837a());
                    } else {
                        String str = "";
                        if (abstractC8100i instanceof AbstractC8100i.x) {
                            AbstractC8100i.x xVar = (AbstractC8100i.x) abstractC8100i;
                            String strM1856b = xVar.m1856b();
                            if (xVar.m1855a() != null && (strM1827a2 = m1827a(xVar.m1855a())) != null) {
                                str = strM1827a2;
                            }
                            return new PaylibEvent.PaymentsPaySucceeded(strM1856b, str);
                        }
                        if (abstractC8100i instanceof AbstractC8100i.v) {
                            AbstractC8100i.v vVar = (AbstractC8100i.v) abstractC8100i;
                            String strM1853b = vVar.m1853b();
                            if (vVar.m1852a() != null && (strM1827a = m1827a(vVar.m1852a())) != null) {
                                str = strM1827a;
                            }
                            return new PaylibEvent.PaymentsPayFailed(strM1853b, str);
                        }
                        if (abstractC8100i instanceof AbstractC8100i.t) {
                            paymentsPayLoading = new PaylibEvent.PaymentsLoading(((AbstractC8100i.t) abstractC8100i).m1851a());
                        } else {
                            if (!(abstractC8100i instanceof AbstractC8100i.w)) {
                                if (abstractC8100i instanceof AbstractC8100i.l ? true : abstractC8100i instanceof AbstractC8100i.u ? true : abstractC8100i instanceof AbstractC8100i.n ? true : abstractC8100i instanceof AbstractC8100i.q ? true : abstractC8100i instanceof AbstractC8100i.r ? true : abstractC8100i instanceof AbstractC8100i.s ? true : abstractC8100i instanceof AbstractC8100i.y ? true : abstractC8100i instanceof AbstractC8100i.z ? true : abstractC8100i instanceof AbstractC8100i.a0 ? true : abstractC8100i instanceof AbstractC8100i.b0 ? true : abstractC8100i instanceof AbstractC8100i.c0 ? true : abstractC8100i instanceof AbstractC8100i.d0 ? true : abstractC8100i instanceof AbstractC8100i.e0 ? true : abstractC8100i instanceof AbstractC8100i.f0 ? true : abstractC8100i instanceof AbstractC8100i.g0 ? true : abstractC8100i instanceof AbstractC8100i.h0 ? true : abstractC8100i instanceof AbstractC8100i.i0 ? true : abstractC8100i instanceof AbstractC8100i.h ? true : abstractC8100i instanceof AbstractC8100i.k0 ? true : abstractC8100i instanceof AbstractC8100i.o ? true : abstractC8100i instanceof AbstractC8100i.a ? true : abstractC8100i instanceof AbstractC8100i.l0) {
                                    return PaylibEvent.Other.INSTANCE;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            paymentsPayLoading = new PaylibEvent.PaymentsPayLoading(((AbstractC8100i.w) abstractC8100i).m1854a());
                        }
                    }
                }
            }
        }
        return paymentsPayLoading;
    }

    /* renamed from: a */
    public final String m1828a(InterfaceC8419e.a aVar) {
        String str;
        switch (b.f1748a[aVar.ordinal()]) {
            case 1:
                str = "new_card";
                break;
            case 2:
                str = "card";
                break;
            case 3:
                str = "sbolpay";
                break;
            case 4:
                str = "sbp";
                break;
            case 5:
                str = "tbank_p";
                break;
            case 6:
                str = "mobile";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (String) AbstractC8375j.m3481a(str);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f
    /* renamed from: a */
    public void mo1826a(AbstractC8100i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String strConcat = this.f1746b.isSandbox() ? "SANDBOX_" : "";
        if (this.f1747c.mo2351c() instanceof AbstractC8237k.f) {
            strConcat = strConcat.concat("CPM_");
        }
        CustomPaylibAnalytics customPaylibAnalytics = this.f1745a;
        if (customPaylibAnalytics != null) {
            customPaylibAnalytics.logEvent(m1831d(event), new PaylibMetric(strConcat + m1829b(event), m1830c(event)));
        }
    }
}
