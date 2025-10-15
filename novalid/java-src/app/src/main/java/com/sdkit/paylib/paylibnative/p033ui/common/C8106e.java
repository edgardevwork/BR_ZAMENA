package com.sdkit.paylib.paylibnative.p033ui.common;

import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatus;
import com.sdkit.paylib.paylibdomain.api.entity.PaymentStatusPayload;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.error.AbstractC8110d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.longpolling.C8145a;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity.C8162e;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.models.InterfaceC8166d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.EnumC8231e;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8346b;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.NoInvoiceIdError;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibBackendFailure;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.e */
/* loaded from: classes8.dex */
public final class C8106e {

    /* renamed from: a */
    public final InterfaceC8097f f1819a;

    /* renamed from: b */
    public final InterfaceC8131b f1820b;

    /* renamed from: c */
    public final InterfaceC8166d f1821c;

    /* renamed from: d */
    public final InvoicePaymentInteractor f1822d;

    /* renamed from: e */
    public final InterfaceC8238l f1823e;

    /* renamed from: f */
    public final InterfaceC8232f f1824f;

    /* renamed from: g */
    public final InternalPaylibRouter f1825g;

    /* renamed from: h */
    public final PaylibLogger f1826h;

    /* renamed from: i */
    public boolean f1827i;

    /* renamed from: j */
    public final int f1828j;

    /* renamed from: k */
    public PaymentStatusPayload f1829k;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a */
    public final class a {

        /* renamed from: a */
        public final Function0 f1830a;

        /* renamed from: b */
        public final Function0 f1831b;

        /* renamed from: c */
        public final Function1 f1832c;

        /* renamed from: d */
        public final Function1 f1833d;

        /* renamed from: e */
        public final Function1 f1834e;

        /* renamed from: f */
        public final Function1 f1835f;

        /* renamed from: g */
        public final /* synthetic */ C8106e f1836g;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11907a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1837a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f1838b;

            static {
                int[] iArr = new int[PaymentStatus.values().length];
                try {
                    iArr[PaymentStatus.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentStatus.CANCELLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PaymentStatus.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PaymentStatus.TIMEOUT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f1837a = iArr;
                int[] iArr2 = new int[PurchaseState.values().length];
                try {
                    iArr2[PurchaseState.CONFIRMED.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[PurchaseState.CONSUMED.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[PurchaseState.PAID.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[PurchaseState.PAUSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[PurchaseState.CANCELLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[PurchaseState.CLOSED.ordinal()] = 6;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[PurchaseState.CREATED.ordinal()] = 7;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[PurchaseState.TERMINATED.ordinal()] = 8;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[PurchaseState.INVOICE_CREATED.ordinal()] = 9;
                } catch (NoSuchFieldError unused13) {
                }
                f1838b = iArr2;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$b */
        /* loaded from: classes6.dex */
        public static final class b extends ContinuationImpl {

            /* renamed from: a */
            public Object f1839a;

            /* renamed from: b */
            public Object f1840b;

            /* renamed from: c */
            public Object f1841c;

            /* renamed from: d */
            public int f1842d;

            /* renamed from: e */
            public /* synthetic */ Object f1843e;

            /* renamed from: g */
            public int f1845g;

            public b(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f1843e = obj;
                this.f1845g |= Integer.MIN_VALUE;
                return a.this.m1896a(0, this);
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$c */
        /* loaded from: classes6.dex */
        public static final class c extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ int f1846a;

            /* renamed from: b */
            public final /* synthetic */ C8145a f1847b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i, C8145a c8145a) {
                super(0);
                this.f1846a = i;
                this.f1847b = c8145a;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "checkPaymentState retriesCounter(" + this.f1846a + ") longPollingParams(" + this.f1847b + ')';
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$d */
        /* loaded from: classes6.dex */
        public static final class d extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ C8106e f1848a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C8106e c8106e) {
                super(0);
                this.f1848a = c8106e;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "checkPaymentLongPollingState " + this.f1848a.f1824f.mo2283b();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$e */
        /* loaded from: classes6.dex */
        public static final class e extends Lambda implements Function0 {

            /* renamed from: b */
            public final /* synthetic */ PaymentStatusPayload f1850b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(PaymentStatusPayload paymentStatusPayload) {
                super(0);
                this.f1850b = paymentStatusPayload;
            }

            /* renamed from: a */
            public final void m1907a() {
                a.this.f1833d.invoke(new AbstractC8110d.c(this.f1850b, false));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1907a();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$f */
        /* loaded from: classes6.dex */
        public static final class f extends Lambda implements Function0 {

            /* renamed from: b */
            public final /* synthetic */ PaymentStatusPayload f1852b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(PaymentStatusPayload paymentStatusPayload) {
                super(0);
                this.f1852b = paymentStatusPayload;
            }

            /* renamed from: a */
            public final void m1908a() {
                a.this.f1833d.invoke(new AbstractC8110d.c(this.f1852b, false));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1908a();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$g */
        /* loaded from: classes6.dex */
        public static final class g extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ Throwable f1853a;

            /* renamed from: b */
            public final /* synthetic */ C8106e f1854b;

            /* renamed from: c */
            public final /* synthetic */ a f1855c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Throwable th, C8106e c8106e, a aVar) {
                super(0);
                this.f1853a = th;
                this.f1854b = c8106e;
                this.f1855c = aVar;
            }

            /* renamed from: a */
            public final void m1909a() {
                if (this.f1853a instanceof NoInvoiceIdError) {
                    AbstractC8096e.m1815o(this.f1854b.f1819a);
                }
                if (this.f1855c.f1835f == null) {
                    this.f1855c.m1901a(this.f1853a);
                } else {
                    this.f1855c.f1835f.invoke(new AbstractC8110d.e(this.f1853a, false));
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1909a();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$h */
        /* loaded from: classes5.dex */
        public static final class h implements FlowCollector {

            /* renamed from: b */
            public final /* synthetic */ int f1857b;

            public h(int i) {
                this.f1857b = i;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AsyncState asyncState, Continuation continuation) {
                Object objM1897a = a.this.m1897a(asyncState, this.f1857b, continuation);
                return objM1897a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1897a : Unit.INSTANCE;
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$a$i */
        /* loaded from: classes6.dex */
        public static final class i extends ContinuationImpl {

            /* renamed from: a */
            public Object f1858a;

            /* renamed from: b */
            public /* synthetic */ Object f1859b;

            /* renamed from: d */
            public int f1861d;

            public i(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                this.f1859b = obj;
                this.f1861d |= Integer.MIN_VALUE;
                Object objM1898a = a.this.m1898a((Long) null, this);
                return objM1898a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1898a : Result.m15698boximpl(objM1898a);
            }
        }

        public a(C8106e c8106e, Function0 onSuccessfulPayment, Function0 onPurchaseStateLoading, Function1 onRetry, Function1 showPaymentStatusError, Function1 showPurchaseError, Function1 function1) {
            Intrinsics.checkNotNullParameter(onSuccessfulPayment, "onSuccessfulPayment");
            Intrinsics.checkNotNullParameter(onPurchaseStateLoading, "onPurchaseStateLoading");
            Intrinsics.checkNotNullParameter(onRetry, "onRetry");
            Intrinsics.checkNotNullParameter(showPaymentStatusError, "showPaymentStatusError");
            Intrinsics.checkNotNullParameter(showPurchaseError, "showPurchaseError");
            this.f1836g = c8106e;
            this.f1830a = onSuccessfulPayment;
            this.f1831b = onPurchaseStateLoading;
            this.f1832c = onRetry;
            this.f1833d = showPaymentStatusError;
            this.f1834e = showPurchaseError;
            this.f1835f = function1;
        }

        /* renamed from: a */
        public final FinishReason m1894a() {
            AbstractC8237k abstractC8237kMo2351c = this.f1836g.f1823e.mo2351c();
            if (!(abstractC8237kMo2351c instanceof AbstractC8237k.a.b)) {
                if (abstractC8237kMo2351c instanceof AbstractC8237k.a.c) {
                    return ((AbstractC8237k.a.c) abstractC8237kMo2351c).m2304b();
                }
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.a.d) && !(abstractC8237kMo2351c instanceof AbstractC8237k.a.e) && !(abstractC8237kMo2351c instanceof AbstractC8237k.c) && !(abstractC8237kMo2351c instanceof AbstractC8237k.d) && !(abstractC8237kMo2351c instanceof AbstractC8237k.e.a)) {
                    if (abstractC8237kMo2351c instanceof AbstractC8237k.e.b) {
                        return ((AbstractC8237k.e.b) abstractC8237kMo2351c).m2310b();
                    }
                    if (!(abstractC8237kMo2351c instanceof AbstractC8237k.e.d) && !(abstractC8237kMo2351c instanceof AbstractC8237k.g.a)) {
                        if (abstractC8237kMo2351c instanceof AbstractC8237k.g.b) {
                            return ((AbstractC8237k.g.b) abstractC8237kMo2351c).m2330b();
                        }
                        if (!(abstractC8237kMo2351c instanceof AbstractC8237k.g.c) && !(abstractC8237kMo2351c instanceof AbstractC8237k.g.e)) {
                            if (!(abstractC8237kMo2351c instanceof AbstractC8237k.f.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.f.a)) {
                                if (abstractC8237kMo2351c instanceof AbstractC8237k.f.b) {
                                    return ((AbstractC8237k.f.b) abstractC8237kMo2351c).m2316b();
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public final Object m1902b(int i2, Continuation continuation) {
            Object objCollect = this.f1836g.f1821c.mo2032a().collect(new h(i2), continuation);
            return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }

        /* renamed from: a */
        public final Object m1895a(int i2, Integer num, Function0 function0, Continuation continuation) throws Throwable {
            boolean z = false;
            if (i2 < (num != null ? num.intValue() : 0)) {
                PaymentStatusPayload paymentStatusPayload = this.f1836g.f1829k;
                if (paymentStatusPayload != null ? paymentStatusPayload.isRequestWithLongPollingTimedOut() : false) {
                    z = true;
                }
            }
            if (!z) {
                function0.invoke();
                return Unit.INSTANCE;
            }
            this.f1832c.invoke(this.f1836g.f1829k);
            Object objM1896a = m1896a(i2 + 1, continuation);
            return objM1896a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1896a : Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01dd A[RETURN] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m1896a(int i2, Continuation continuation) throws Throwable {
            b bVar;
            C8145a c8145aMo2009d;
            long jM2050c;
            Long lBoxLong;
            Object objM1898a;
            a aVar;
            C8145a c8145a;
            C8106e c8106e;
            Throwable thM15702exceptionOrNullimpl;
            Integer numBoxInt;
            g gVar;
            int i3 = i2;
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i4 = bVar.f1845g;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar.f1845g = i4 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(continuation);
                }
            }
            Object obj = bVar.f1843e;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (bVar.f1845g) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    c8145aMo2009d = this.f1836g.f1820b.mo2009d();
                    PaylibLogger.DefaultImpls.d$default(this.f1836g.f1826h, null, new c(i3, c8145aMo2009d), 1, null);
                    PaylibLogger.DefaultImpls.d$default(this.f1836g.f1826h, null, new d(this.f1836g), 1, null);
                    if (i3 == 0) {
                        if (c8145aMo2009d != null) {
                            jM2050c = c8145aMo2009d.m2048a();
                            lBoxLong = Boxing.boxLong(jM2050c);
                        }
                        lBoxLong = null;
                    } else {
                        if (c8145aMo2009d != null) {
                            jM2050c = c8145aMo2009d.m2050c();
                            lBoxLong = Boxing.boxLong(jM2050c);
                        }
                        lBoxLong = null;
                    }
                    bVar.f1839a = this;
                    bVar.f1840b = c8145aMo2009d;
                    bVar.f1842d = i3;
                    bVar.f1845g = 1;
                    objM1898a = m1898a(lBoxLong, bVar);
                    if (objM1898a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = this;
                    C8106e c8106e2 = aVar.f1836g;
                    if (Result.m15706isSuccessimpl(objM1898a)) {
                        c8106e2.f1829k = (PaymentStatusPayload) objM1898a;
                        PaymentStatusPayload paymentStatusPayload = c8106e2.f1829k;
                        if (paymentStatusPayload != null) {
                            aVar.m1899a(paymentStatusPayload.getPaymentStatus());
                            int i5 = C11907a.f1837a[paymentStatusPayload.getPaymentStatus().ordinal()];
                            if (i5 == 1) {
                                AbstractC8237k abstractC8237kMo2351c = c8106e2.f1823e.mo2351c();
                                if (abstractC8237kMo2351c instanceof AbstractC8237k.e) {
                                    aVar.f1830a.invoke();
                                    aVar.m1903b();
                                } else {
                                    if (abstractC8237kMo2351c instanceof AbstractC8237k.a ? true : abstractC8237kMo2351c instanceof AbstractC8237k.g) {
                                        c8106e2.f1824f.mo2282a(EnumC8231e.PURCHASE);
                                        bVar.f1839a = aVar;
                                        bVar.f1840b = c8145aMo2009d;
                                        bVar.f1841c = objM1898a;
                                        bVar.f1842d = i3;
                                        bVar.f1845g = 2;
                                        if (aVar.m1902b(0, bVar) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (abstractC8237kMo2351c instanceof AbstractC8237k.f) {
                                        c8106e2.f1824f.mo2282a(EnumC8231e.PURCHASE);
                                        bVar.f1839a = aVar;
                                        bVar.f1840b = c8145aMo2009d;
                                        bVar.f1841c = objM1898a;
                                        bVar.f1842d = i3;
                                        bVar.f1845g = 3;
                                        if (aVar.m1902b(0, bVar) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (!(abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Integer numBoxInt2 = c8145aMo2009d != null ? Boxing.boxInt(c8145aMo2009d.m2049b()) : null;
                                        e eVar = aVar.new e(paymentStatusPayload);
                                        bVar.f1839a = aVar;
                                        bVar.f1840b = c8145aMo2009d;
                                        bVar.f1841c = objM1898a;
                                        bVar.f1842d = i3;
                                        bVar.f1845g = 4;
                                        if (aVar.m1895a(i3, numBoxInt2, eVar, bVar) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                c8145a = c8145aMo2009d;
                                AbstractC8375j.m3481a(Unit.INSTANCE);
                                c8106e = aVar.f1836g;
                                thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM1898a);
                                if (thM15702exceptionOrNullimpl != null && !(thM15702exceptionOrNullimpl.getCause() instanceof CancellationException)) {
                                    numBoxInt = c8145a == null ? Boxing.boxInt(c8145a.m2049b()) : null;
                                    gVar = new g(thM15702exceptionOrNullimpl, c8106e, aVar);
                                    bVar.f1839a = objM1898a;
                                    bVar.f1840b = null;
                                    bVar.f1841c = null;
                                    bVar.f1845g = 6;
                                    if (aVar.m1895a(i3, numBoxInt, gVar, bVar) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            if (i5 == 2 || i5 == 3 || i5 == 4) {
                                Integer numBoxInt3 = c8145aMo2009d != null ? Boxing.boxInt(c8145aMo2009d.m2049b()) : null;
                                f fVar = aVar.new f(paymentStatusPayload);
                                bVar.f1839a = aVar;
                                bVar.f1840b = c8145aMo2009d;
                                bVar.f1841c = objM1898a;
                                bVar.f1842d = i3;
                                bVar.f1845g = 5;
                                if (aVar.m1895a(i3, numBoxInt3, fVar, bVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    c8145a = c8145aMo2009d;
                    c8106e = aVar.f1836g;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM1898a);
                    if (thM15702exceptionOrNullimpl != null) {
                        if (c8145a == null) {
                        }
                        gVar = new g(thM15702exceptionOrNullimpl, c8106e, aVar);
                        bVar.f1839a = objM1898a;
                        bVar.f1840b = null;
                        bVar.f1841c = null;
                        bVar.f1845g = 6;
                        if (aVar.m1895a(i3, numBoxInt, gVar, bVar) == coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    i3 = bVar.f1842d;
                    C8145a c8145a2 = (C8145a) bVar.f1840b;
                    aVar = (a) bVar.f1839a;
                    ResultKt.throwOnFailure(obj);
                    objM1898a = ((Result) obj).getValue();
                    c8145aMo2009d = c8145a2;
                    C8106e c8106e22 = aVar.f1836g;
                    if (Result.m15706isSuccessimpl(objM1898a)) {
                    }
                    c8145a = c8145aMo2009d;
                    c8106e = aVar.f1836g;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM1898a);
                    if (thM15702exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                case 2:
                case 3:
                case 4:
                    i3 = bVar.f1842d;
                    objM1898a = bVar.f1841c;
                    c8145a = (C8145a) bVar.f1840b;
                    aVar = (a) bVar.f1839a;
                    ResultKt.throwOnFailure(obj);
                    AbstractC8375j.m3481a(Unit.INSTANCE);
                    c8106e = aVar.f1836g;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM1898a);
                    if (thM15702exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    i3 = bVar.f1842d;
                    objM1898a = bVar.f1841c;
                    c8145a = (C8145a) bVar.f1840b;
                    aVar = (a) bVar.f1839a;
                    ResultKt.throwOnFailure(obj);
                    c8106e = aVar.f1836g;
                    thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM1898a);
                    if (thM15702exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: b */
        public final void m1903b() {
            Boolean boolIsSubscription;
            InternalPaylibRouter internalPaylibRouter = this.f1836g.f1825g;
            EnumC8105d enumC8105d = EnumC8105d.SUCCESSFUL_PAYMENT;
            PaymentStatusPayload paymentStatusPayload = this.f1836g.f1829k;
            boolean zBooleanValue = (paymentStatusPayload == null || (boolIsSubscription = paymentStatusPayload.isSubscription()) == null) ? false : boolIsSubscription.booleanValue();
            PaymentStatusPayload paymentStatusPayload2 = this.f1836g.f1829k;
            internalPaylibRouter.mo2492a(new C8346b(true, enumC8105d, null, zBooleanValue, paymentStatusPayload2 != null ? paymentStatusPayload2.getCardNumber() : null, 4, null));
        }

        /* renamed from: a */
        public final Object m1897a(AsyncState asyncState, int i2, Continuation continuation) {
            if (asyncState instanceof AsyncState.Loading) {
                this.f1831b.invoke();
            } else if (asyncState instanceof AsyncState.Content) {
                m1900a((C8162e) ((AsyncState.Content) asyncState).getContent());
            } else if (asyncState instanceof AsyncState.Error) {
                AsyncState.Error error = (AsyncState.Error) asyncState;
                if ((error.getError() instanceof PayLibBackendFailure.TimeoutError) && i2 < this.f1836g.f1828j) {
                    Object objM1902b = m1902b(i2 + 1, continuation);
                    return objM1902b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1902b : Unit.INSTANCE;
                }
                Function1 function1 = this.f1835f;
                if (function1 == null) {
                    m1901a(error.getError());
                } else {
                    function1.invoke(new AbstractC8110d.e(error.getError(), true));
                }
            } else {
                boolean z = asyncState instanceof AsyncState.None;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: b */
        public final void m1904b(PaymentStatus paymentStatus) {
            int i2 = C11907a.f1837a[paymentStatus.ordinal()];
            if (i2 == 1) {
                AbstractC8096e.m1814n(this.f1836g.f1819a);
                return;
            }
            if (i2 == 2) {
                AbstractC8096e.m1812l(this.f1836g.f1819a);
            } else if (i2 == 3 || i2 == 4) {
                AbstractC8096e.m1813m(this.f1836g.f1819a);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m1898a(Long l, Continuation continuation) throws Throwable {
            i iVar;
            Object value;
            C8106e c8106e;
            if (continuation instanceof i) {
                iVar = (i) continuation;
                int i2 = iVar.f1861d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.f1861d = i2 - Integer.MIN_VALUE;
                } else {
                    iVar = new i(continuation);
                }
            }
            Object obj = iVar.f1859b;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = iVar.f1861d;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                C8106e c8106e2 = this.f1836g;
                c8106e2.m1887a(true);
                InvoicePaymentInteractor invoicePaymentInteractor = c8106e2.f1822d;
                iVar.f1858a = c8106e2;
                iVar.f1861d = 1;
                Object objMo15357getPaymentStatusForExecutedInvoicegIAlus = invoicePaymentInteractor.mo15357getPaymentStatusForExecutedInvoicegIAlus(l, iVar);
                if (objMo15357getPaymentStatusForExecutedInvoicegIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objMo15357getPaymentStatusForExecutedInvoicegIAlus;
                c8106e = c8106e2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8106e = (C8106e) iVar.f1858a;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            c8106e.m1887a(false);
            return value;
        }

        /* renamed from: a */
        public final void m1899a(PaymentStatus paymentStatus) {
            FinishReason finishReasonM1894a = m1894a();
            boolean z = true;
            if (finishReasonM1894a instanceof FinishReason.SbolPayCompleted ? true : finishReasonM1894a instanceof FinishReason.SbolPayCompletedWithState) {
                m1904b(paymentStatus);
            } else {
                if (!(finishReasonM1894a instanceof FinishReason.SbpPayCompletedWithState ? true : finishReasonM1894a instanceof FinishReason.TPayCompletedWithState) && finishReasonM1894a != null) {
                    z = false;
                }
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            AbstractC8375j.m3481a(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final void m1900a(C8162e c8162e) {
            switch (C11907a.f1838b[c8162e.m2086a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    this.f1830a.invoke();
                    m1903b();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f1834e.invoke(new AbstractC8110d.d(c8162e, true));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            AbstractC8375j.m3481a(Unit.INSTANCE);
        }

        /* renamed from: a */
        public final void m1901a(Throwable th) {
            this.f1836g.f1825g.mo2491a(new C8340d(null, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(EnumC8262b.DEEPLINK_RESULT, AbstractC8128b.i.f1941a), false, EnumC8105d.UNHANDLED_FORM_ERROR, null, 41, null));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f1862a = new b();

        public b() {
            super(0);
        }

        /* renamed from: a */
        public final void m1911a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1911a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public static final c f1863a = new c();

        public c() {
            super(0);
        }

        /* renamed from: a */
        public final void m1912a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1912a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.e$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a */
        public static final d f1864a = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final void m1913a(PaymentStatusPayload paymentStatusPayload) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1913a((PaymentStatusPayload) obj);
            return Unit.INSTANCE;
        }
    }

    public C8106e(InterfaceC8097f analytics, InterfaceC8131b config, InterfaceC8166d getPurchaseInfoModel, InvoicePaymentInteractor invoicePaymentInteractor, InterfaceC8238l paylibStateManager, InterfaceC8232f paylibLongPollingStateManager, InternalPaylibRouter router, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(getPurchaseInfoModel, "getPurchaseInfoModel");
        Intrinsics.checkNotNullParameter(invoicePaymentInteractor, "invoicePaymentInteractor");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paylibLongPollingStateManager, "paylibLongPollingStateManager");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1819a = analytics;
        this.f1820b = config;
        this.f1821c = getPurchaseInfoModel;
        this.f1822d = invoicePaymentInteractor;
        this.f1823e = paylibStateManager;
        this.f1824f = paylibLongPollingStateManager;
        this.f1825g = router;
        this.f1826h = loggerFactory.get("PaymentStateCheckerWithRetries");
        this.f1828j = 1;
    }

    /* renamed from: a */
    public final Object m1886a(Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Continuation continuation) throws Throwable {
        a aVar = new a(this, function0, function02, function1, function12, function13, function14);
        if (this.f1824f.mo2283b() == EnumC8231e.PURCHASE) {
            Object objM1902b = aVar.m1902b(0, continuation);
            if (objM1902b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM1902b;
            }
        } else {
            Object objM1896a = aVar.m1896a(0, continuation);
            if (objM1896a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM1896a;
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void m1887a(boolean z) {
        this.f1827i = z;
    }

    /* renamed from: a */
    public final boolean m1888a() {
        return this.f1827i;
    }
}
