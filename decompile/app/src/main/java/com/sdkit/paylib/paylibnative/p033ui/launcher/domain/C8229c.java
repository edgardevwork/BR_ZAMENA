package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.paylibdomain.api.entity.ResultInfo;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.c */
/* loaded from: classes8.dex */
public final class C8229c {

    /* renamed from: a */
    public final InvoiceHolder f2442a;

    /* renamed from: b */
    public final InterfaceC8238l f2443b;

    /* renamed from: c */
    public final PaylibLogger f2444c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f2445a;

        /* renamed from: b */
        public Object f2446b;

        /* renamed from: c */
        public /* synthetic */ Object f2447c;

        /* renamed from: e */
        public int f2449e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f2447c = obj;
            this.f2449e |= Integer.MIN_VALUE;
            Object objM2273a = C8229c.this.m2273a(null, false, this);
            return objM2273a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM2273a : Result.m15698boximpl(objM2273a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ String f2450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f2450a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "loadInvoiceDetails invoiceId = " + this.f2450a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.c$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ ResultInfo f2451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ResultInfo resultInfo) {
            super(0);
            this.f2451a = resultInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "loadInvoiceDetails onSuccess resultInfo = " + this.f2451a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.c$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f2452a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.f2452a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "loadInvoiceDetails onFailure error = " + this.f2452a;
        }
    }

    public C8229c(InvoiceHolder invoiceHolder, InterfaceC8238l paylibStateManager, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2442a = invoiceHolder;
        this.f2443b = paylibStateManager;
        this.f2444c = loggerFactory.get("LoadInvoiceDetailsInteractorImpl");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2273a(String str, boolean z, Continuation continuation) throws Throwable {
        a aVar;
        Object objMo15354fetchInvoiceDetailsgIAlus;
        C8229c c8229c;
        Throwable thM15702exceptionOrNullimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f2449e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f2449e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objFirst = aVar.f2447c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f2449e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            PaylibLogger.DefaultImpls.d$default(this.f2444c, null, new b(str), 1, null);
            this.f2442a.setInvoiceId(str);
            InvoiceHolder invoiceHolder = this.f2442a;
            aVar.f2445a = this;
            aVar.f2449e = 1;
            objMo15354fetchInvoiceDetailsgIAlus = invoiceHolder.mo15354fetchInvoiceDetailsgIAlus(z, aVar);
            if (objMo15354fetchInvoiceDetailsgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8229c = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objMo15354fetchInvoiceDetailsgIAlus = aVar.f2446b;
                c8229c = (C8229c) aVar.f2445a;
                ResultKt.throwOnFailure(objFirst);
                c8229c.f2443b.mo2347a(((Invoice) objFirst).getOrderId());
                thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15354fetchInvoiceDetailsgIAlus);
                if (thM15702exceptionOrNullimpl != null) {
                    PaylibLogger.DefaultImpls.d$default(c8229c.f2444c, null, new d(thM15702exceptionOrNullimpl), 1, null);
                    c8229c.f2443b.mo2349a(thM15702exceptionOrNullimpl);
                }
                return objMo15354fetchInvoiceDetailsgIAlus;
            }
            C8229c c8229c2 = (C8229c) aVar.f2445a;
            ResultKt.throwOnFailure(objFirst);
            c8229c = c8229c2;
            objMo15354fetchInvoiceDetailsgIAlus = ((Result) objFirst).getValue();
        }
        if (Result.m15706isSuccessimpl(objMo15354fetchInvoiceDetailsgIAlus)) {
            PaylibLogger.DefaultImpls.d$default(c8229c.f2444c, null, new c((ResultInfo) objMo15354fetchInvoiceDetailsgIAlus), 1, null);
            Flow<Invoice> invoice = c8229c.f2442a.getInvoice();
            aVar.f2445a = c8229c;
            aVar.f2446b = objMo15354fetchInvoiceDetailsgIAlus;
            aVar.f2449e = 2;
            objFirst = FlowKt.first(invoice, aVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8229c.f2443b.mo2347a(((Invoice) objFirst).getOrderId());
        }
        thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15354fetchInvoiceDetailsgIAlus);
        if (thM15702exceptionOrNullimpl != null) {
        }
        return objMo15354fetchInvoiceDetailsgIAlus;
    }
}
