package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibToken;
import com.sdkit.paylib.paylibpayment.impl.utls.AbstractC8587a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.n */
/* loaded from: classes8.dex */
public final class C8543n {

    /* renamed from: a */
    public final PaylibTokenProvider f4962a;

    /* renamed from: b */
    public final PaylibLoggerFactory f4963b;

    /* renamed from: c */
    public final PaylibLogger f4964c;

    /* renamed from: d */
    public volatile a f4965d;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.n$a */
    public enum a {
        EXPIRED,
        AUTHORIZATION_ERROR
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.n$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4969a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AUTHORIZATION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4969a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.n$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ a f4970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(0);
            this.f4970a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "invalidate token: cause=" + this.f4970a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.n$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: a */
        public Object f4971a;

        /* renamed from: b */
        public /* synthetic */ Object f4972b;

        /* renamed from: d */
        public int f4974d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4972b = obj;
            this.f4974d |= Integer.MIN_VALUE;
            return C8543n.this.m4091a(null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.n$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ PaylibToken f4975a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PaylibToken paylibToken) {
            super(0);
            this.f4975a = paylibToken;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Validate token = " + AbstractC8587a.m4654a(this.f4975a);
        }
    }

    public C8543n(PaylibTokenProvider tokenProvider, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4962a = tokenProvider;
        this.f4963b = loggerFactory;
        this.f4964c = loggerFactory.get("PaylibTokenWatcher");
        this.f4965d = a.EXPIRED;
    }

    /* renamed from: a */
    public final PaylibTokenProvider.RequestCause m4090a() {
        int i = b.f4969a[this.f4965d.ordinal()];
        if (i == 1) {
            return PaylibTokenProvider.RequestCause.REFRESH;
        }
        if (i == 2) {
            return PaylibTokenProvider.RequestCause.AUTHORIZATION_ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4091a(PaylibContext paylibContext, Continuation continuation) throws Throwable {
        d dVar;
        C8543n c8543n;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.f4974d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.f4974d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        }
        Object objRequestToken = dVar.f4972b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.f4974d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRequestToken);
            PaylibTokenProvider paylibTokenProvider = this.f4962a;
            PaylibTokenProvider.RequestCause requestCauseM4090a = m4090a();
            dVar.f4971a = this;
            dVar.f4974d = 1;
            objRequestToken = paylibTokenProvider.requestToken(requestCauseM4090a, paylibContext, dVar);
            if (objRequestToken == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8543n = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8543n = (C8543n) dVar.f4971a;
            ResultKt.throwOnFailure(objRequestToken);
        }
        PaylibToken paylibToken = (PaylibToken) objRequestToken;
        PaylibLogger.DefaultImpls.d$default(c8543n.f4964c, null, new e(paylibToken), 1, null);
        c8543n.f4965d = a.EXPIRED;
        if (paylibToken == null || !paylibToken.isNotEmpty()) {
            return null;
        }
        return paylibToken;
    }

    /* renamed from: a */
    public final void m4092a(a cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        PaylibLogger.DefaultImpls.d$default(this.f4964c, null, new c(cause), 1, null);
        this.f4965d = cause;
    }
}
