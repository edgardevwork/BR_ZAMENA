package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import com.sdkit.paylib.paylibdomain.api.entity.FinishReason;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.AbstractC8237k;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayload;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibBackendFailure;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.m */
/* loaded from: classes5.dex */
public final class C8239m implements InterfaceC8238l {

    /* renamed from: a */
    public final InterfaceC8232f f2519a;

    /* renamed from: b */
    public final PaylibLogger f2520b;

    /* renamed from: c */
    public volatile AbstractC8237k f2521c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.m$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8237k f2522a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8237k abstractC8237k) {
            super(0);
            this.f2522a = abstractC8237k;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "updateWithError: trying to switch from invalid state " + this.f2522a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.m$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8237k f2523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC8237k abstractC8237k) {
            super(0);
            this.f2523a = abstractC8237k;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "updateWithOrderId: trying to switch from invalid state " + this.f2523a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.m$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC8237k f2524a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC8237k abstractC8237k) {
            super(0);
            this.f2524a = abstractC8237k;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "updateWithProductPurchase: trying to switch from invalid state " + this.f2524a;
        }
    }

    public C8239m(PaylibLoggerFactory loggerFactory, InterfaceC8232f paylibLongPollingStateManager) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(paylibLongPollingStateManager, "paylibLongPollingStateManager");
        this.f2519a = paylibLongPollingStateManager;
        this.f2520b = loggerFactory.get("PaylibStateManagerImpl");
        this.f2521c = AbstractC8237k.d.f2483a;
    }

    /* renamed from: a */
    public final AbstractC8237k m2352a(FinishReason finishReason, SourceState sourceState) {
        AbstractC8237k bVar;
        if (sourceState instanceof SourceState.Invoice) {
            return new AbstractC8237k.e.b(finishReason, new AbstractC8237k.e.c(((SourceState.Invoice) sourceState).getInvoiceId()));
        }
        if (sourceState instanceof SourceState.Product) {
            SourceState.Product product = (SourceState.Product) sourceState;
            bVar = new AbstractC8237k.g.b(product.getInvoiceId(), product.getPurchaseId(), finishReason, new AbstractC8237k.g.d(product.getProductId(), product.getOrderId(), product.getQuantity(), product.getDeveloperPayload()));
        } else if (sourceState instanceof SourceState.Application) {
            SourceState.Application application = (SourceState.Application) sourceState;
            bVar = new AbstractC8237k.a.c(application.getInvoiceId(), application.getPurchaseId(), finishReason, new AbstractC8237k.a.C11912a(application.getApplicationId(), application.getDeveloperPayload()));
        } else {
            if (!(sourceState instanceof SourceState.PaymentMethodChangeState)) {
                throw new NoWhenBranchMatchedException();
            }
            SourceState.PaymentMethodChangeState paymentMethodChangeState = (SourceState.PaymentMethodChangeState) sourceState;
            bVar = new AbstractC8237k.f.b(paymentMethodChangeState.getInvoiceId(), paymentMethodChangeState.getPurchaseId(), finishReason, new AbstractC8237k.f.d(paymentMethodChangeState.getOldPurchaseId()));
        }
        return bVar;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: b */
    public String mo2350b() {
        AbstractC8237k abstractC8237kMo2351c = mo2351c();
        if (!(abstractC8237kMo2351c instanceof AbstractC8237k.a.e)) {
            if (abstractC8237kMo2351c instanceof AbstractC8237k.a.d) {
                return ((AbstractC8237k.a.d) abstractC8237kMo2351c).m2308c();
            }
            if (abstractC8237kMo2351c instanceof AbstractC8237k.a.c) {
                return ((AbstractC8237k.a.c) abstractC8237kMo2351c).m2306d();
            }
            if (abstractC8237kMo2351c instanceof AbstractC8237k.a.b) {
                String strM2303d = ((AbstractC8237k.a.b) abstractC8237kMo2351c).m2303d();
                if (strM2303d != null) {
                    return strM2303d;
                }
            } else {
                if (abstractC8237kMo2351c instanceof AbstractC8237k.f) {
                    return ((AbstractC8237k.f) abstractC8237kMo2351c).mo2312a().m2321a();
                }
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.g.e)) {
                    if (abstractC8237kMo2351c instanceof AbstractC8237k.g.c) {
                        return ((AbstractC8237k.g.c) abstractC8237kMo2351c).m2336c();
                    }
                    if (abstractC8237kMo2351c instanceof AbstractC8237k.g.b) {
                        return ((AbstractC8237k.g.b) abstractC8237kMo2351c).m2332d();
                    }
                    if (abstractC8237kMo2351c instanceof AbstractC8237k.g.a) {
                        String strM2327d = ((AbstractC8237k.g.a) abstractC8237kMo2351c).m2327d();
                        if (strM2327d != null) {
                            return strM2327d;
                        }
                    } else if (!(abstractC8237kMo2351c instanceof AbstractC8237k.c) && !(abstractC8237kMo2351c instanceof AbstractC8237k.d) && !(abstractC8237kMo2351c instanceof AbstractC8237k.e.a) && !(abstractC8237kMo2351c instanceof AbstractC8237k.e.b) && !(abstractC8237kMo2351c instanceof AbstractC8237k.e.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return "";
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: c */
    public AbstractC8237k mo2351c() {
        return this.f2521c;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: a */
    public void mo2344a() {
        m2353a(AbstractC8237k.d.f2483a);
        this.f2519a.mo2281a();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: a */
    public void mo2345a(FinishReason reason) {
        AbstractC8237k abstractC8237kM2352a;
        SourceState sourceState;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason instanceof FinishReason.SbolPayCompletedWithState) {
            sourceState = ((FinishReason.SbolPayCompletedWithState) reason).getSourceState();
        } else if (reason instanceof FinishReason.SbpPayCompletedWithState) {
            sourceState = ((FinishReason.SbpPayCompletedWithState) reason).getSourceState();
        } else {
            if (!(reason instanceof FinishReason.TPayCompletedWithState)) {
                if (!(reason instanceof FinishReason.SbolPayCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC8237kM2352a = AbstractC8237k.c.f2482a;
                m2353a((AbstractC8237k) AbstractC8375j.m3481a(abstractC8237kM2352a));
            }
            sourceState = ((FinishReason.TPayCompletedWithState) reason).getSourceState();
        }
        abstractC8237kM2352a = m2352a(reason, sourceState);
        m2353a((AbstractC8237k) AbstractC8375j.m3481a(abstractC8237kM2352a));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: a */
    public void mo2346a(AbstractC8237k.b flowArgs) {
        Object eVar;
        Intrinsics.checkNotNullParameter(flowArgs, "flowArgs");
        if (flowArgs instanceof AbstractC8237k.e.c) {
            eVar = new AbstractC8237k.e.d((AbstractC8237k.e.c) flowArgs);
        } else if (flowArgs instanceof AbstractC8237k.a.C11912a) {
            eVar = new AbstractC8237k.a.e((AbstractC8237k.a.C11912a) flowArgs);
        } else if (flowArgs instanceof AbstractC8237k.g.d) {
            eVar = new AbstractC8237k.g.e((AbstractC8237k.g.d) flowArgs);
        } else {
            if (!(flowArgs instanceof AbstractC8237k.f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new AbstractC8237k.f.e((AbstractC8237k.f.d) flowArgs);
        }
        m2353a((AbstractC8237k) AbstractC8375j.m3481a(eVar));
        this.f2519a.mo2281a();
    }

    /* renamed from: a */
    public void m2353a(AbstractC8237k abstractC8237k) {
        Intrinsics.checkNotNullParameter(abstractC8237k, "<set-?>");
        this.f2521c = abstractC8237k;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: a */
    public void mo2347a(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        AbstractC8237k abstractC8237kMo2351c = mo2351c();
        if (!(abstractC8237kMo2351c instanceof AbstractC8237k.a) && !(abstractC8237kMo2351c instanceof AbstractC8237k.f)) {
            if (abstractC8237kMo2351c instanceof AbstractC8237k.g.e) {
                AbstractC8237k.g.e eVar = (AbstractC8237k.g.e) abstractC8237kMo2351c;
                abstractC8237kMo2351c = eVar.m2343a(AbstractC8237k.g.d.m2337a(eVar.mo2322a(), null, orderId, null, null, 13, null));
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.c) {
                AbstractC8237k.g.c cVar = (AbstractC8237k.g.c) abstractC8237kMo2351c;
                abstractC8237kMo2351c = AbstractC8237k.g.c.m2333a(cVar, null, null, AbstractC8237k.g.d.m2337a(cVar.mo2322a(), null, orderId, null, null, 13, null), 3, null);
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.a) {
                AbstractC8237k.g.a aVar = (AbstractC8237k.g.a) abstractC8237kMo2351c;
                abstractC8237kMo2351c = AbstractC8237k.g.a.m2323a(aVar, null, null, null, AbstractC8237k.g.d.m2337a(aVar.mo2322a(), null, orderId, null, null, 13, null), 7, null);
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g.b) {
                AbstractC8237k.g.b bVar = (AbstractC8237k.g.b) abstractC8237kMo2351c;
                abstractC8237kMo2351c = AbstractC8237k.g.b.m2328a(bVar, null, null, null, AbstractC8237k.g.d.m2337a(bVar.mo2322a(), null, orderId, null, null, 13, null), 7, null);
            } else if (!(abstractC8237kMo2351c instanceof AbstractC8237k.e)) {
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaylibLogger.DefaultImpls.e$default(this.f2520b, null, new b(abstractC8237kMo2351c), 1, null);
            }
        }
        m2353a(abstractC8237kMo2351c);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: a */
    public void mo2348a(String invoiceId, String purchaseId) {
        AbstractC8237k cVar;
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        AbstractC8237k abstractC8237kMo2351c = mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.a) {
            cVar = new AbstractC8237k.a.d(invoiceId, purchaseId, ((AbstractC8237k.a) abstractC8237kMo2351c).mo2298a());
        } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g) {
            cVar = new AbstractC8237k.g.c(invoiceId, purchaseId, ((AbstractC8237k.g) abstractC8237kMo2351c).mo2322a());
        } else {
            if (!(abstractC8237kMo2351c instanceof AbstractC8237k.f)) {
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.e ? true : abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaylibLogger.DefaultImpls.e$default(this.f2520b, null, new c(abstractC8237kMo2351c), 1, null);
                m2353a(abstractC8237kMo2351c);
            }
            cVar = new AbstractC8237k.f.c(invoiceId, purchaseId, ((AbstractC8237k.f) abstractC8237kMo2351c).mo2312a());
        }
        abstractC8237kMo2351c = cVar;
        m2353a(abstractC8237kMo2351c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l
    /* renamed from: a */
    public void mo2349a(Throwable th) {
        AbstractC8237k aVar;
        PurchasePayloadHolder purchasePayloadHolder = th instanceof PurchasePayloadHolder ? (PurchasePayloadHolder) th : null;
        PurchasePayload purchasePayload = purchasePayloadHolder != null ? purchasePayloadHolder.getPurchasePayload() : null;
        Integer code = th instanceof PayLibBackendFailure.ServerError ? ((PayLibBackendFailure.ServerError) th).getCode() : th instanceof PayLibBackendFailure.ClientError ? ((PayLibBackendFailure.ClientError) th).getCode() : null;
        AbstractC8237k abstractC8237kMo2351c = mo2351c();
        if (abstractC8237kMo2351c instanceof AbstractC8237k.e) {
            abstractC8237kMo2351c = new AbstractC8237k.e.a(code, ((AbstractC8237k.e) abstractC8237kMo2351c).mo2309a());
        } else {
            if (abstractC8237kMo2351c instanceof AbstractC8237k.a) {
                aVar = new AbstractC8237k.a.b(purchasePayload != null ? purchasePayload.getInvoiceId() : null, purchasePayload != null ? purchasePayload.getPurchaseId() : null, code, ((AbstractC8237k.a) abstractC8237kMo2351c).mo2298a());
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.g) {
                aVar = new AbstractC8237k.g.a(purchasePayload != null ? purchasePayload.getInvoiceId() : null, purchasePayload != null ? purchasePayload.getPurchaseId() : null, code, ((AbstractC8237k.g) abstractC8237kMo2351c).mo2322a());
            } else if (abstractC8237kMo2351c instanceof AbstractC8237k.f) {
                aVar = new AbstractC8237k.f.a(purchasePayload != null ? purchasePayload.getInvoiceId() : null, purchasePayload != null ? purchasePayload.getPurchaseId() : null, code, ((AbstractC8237k.f) abstractC8237kMo2351c).mo2312a());
            } else {
                if (!(abstractC8237kMo2351c instanceof AbstractC8237k.c ? true : abstractC8237kMo2351c instanceof AbstractC8237k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaylibLogger.DefaultImpls.e$default(this.f2520b, null, new a(abstractC8237kMo2351c), 1, null);
            }
            abstractC8237kMo2351c = aVar;
        }
        m2353a(abstractC8237kMo2351c);
    }
}
