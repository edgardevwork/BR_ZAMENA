package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClient;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequest;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse;
import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibToken;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PurchasePayloadHolder;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PayLibBackendFailure;
import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8543n;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.C8537a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.C8545a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8584a;
import com.sdkit.paylib.paylibutils.lib.AbstractC8611c;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SerializationException;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f */
/* loaded from: classes8.dex */
public final class C8533f {

    /* renamed from: a */
    public final C8543n f4884a;

    /* renamed from: b */
    public final BackendUrlProvider f4885b;

    /* renamed from: c */
    public final C8530c f4886c;

    /* renamed from: d */
    public final C8537a f4887d;

    /* renamed from: e */
    public final InterfaceC8540k f4888e;

    /* renamed from: f */
    public final PaylibLogger f4889f;

    /* renamed from: g */
    public final WebClient f4890g;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$a */
    public interface a {
        /* renamed from: a */
        Object mo3960a(C8535h c8535h);
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$b */
    /* loaded from: classes7.dex */
    public static final class b extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public Object f4891a;

        /* renamed from: b */
        public Object f4892b;

        /* renamed from: c */
        public int f4893c;

        /* renamed from: d */
        public final /* synthetic */ Function1 f4894d;

        /* renamed from: e */
        public final /* synthetic */ C8533f f4895e;

        /* renamed from: f */
        public final /* synthetic */ String f4896f;

        /* renamed from: g */
        public final /* synthetic */ PaylibContext f4897g;

        /* renamed from: h */
        public final /* synthetic */ Long f4898h;

        /* renamed from: i */
        public final /* synthetic */ a f4899i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, C8533f c8533f, String str, PaylibContext paylibContext, Long l, a aVar, Continuation continuation) {
            super(1, continuation);
            this.f4894d = function1;
            this.f4895e = c8533f;
            this.f4896f = str;
            this.f4897g = paylibContext;
            this.f4898h = l;
            this.f4899i = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new b(this.f4894d, this.f4895e, this.f4896f, this.f4897g, this.f4898h, this.f4899i, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x00a8, code lost:
        
            if (com.sdkit.paylib.paylibpayment.impl.domain.network.data.AbstractC8528a.m3999a(r6 != null ? kotlin.coroutines.jvm.internal.Boxing.boxInt(r6.getCode()) : null) != false) goto L84;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0116 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00db  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C8539j c8539jM4072a;
            C8584a c8584a;
            WebResponse webResponse;
            BaseResponse baseResponse;
            C8539j c8539j;
            C8584a c8584a2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4893c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8584a c8584aM4646a = C8584a.f5782c.m4646a();
                c8539jM4072a = ((C8539j) this.f4894d.invoke(this.f4895e.f4888e.mo4085a().m4082f(this.f4895e.m4033a(this.f4896f, this.f4897g)))).m4071a(c8584aM4646a).m4072a(this.f4898h);
                C8533f c8533f = this.f4895e;
                PaylibContext paylibContext = this.f4897g;
                this.f4891a = c8584aM4646a;
                this.f4892b = c8539jM4072a;
                this.f4893c = 1;
                Object objM4027a = c8533f.m4027a(c8584aM4646a, c8539jM4072a, paylibContext, this);
                if (objM4027a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8584a = c8584aM4646a;
                obj = objM4027a;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8539j = (C8539j) this.f4892b;
                    c8584a2 = (C8584a) this.f4891a;
                    ResultKt.throwOnFailure(obj);
                    webResponse = (WebResponse) obj;
                    baseResponse = (BaseResponse) this.f4895e.m4026a(c8584a2, webResponse, this.f4899i);
                    c8584a = c8584a2;
                    c8539jM4072a = c8539j;
                    if (baseResponse instanceof ResponseWithError) {
                        ErrorModel error = ((ResponseWithError) baseResponse).getError();
                        if (AbstractC8528a.m3999a(error != null ? Boxing.boxInt(error.getCode()) : null)) {
                            throw new PayLibBackendFailure.AuthError(null, null, String.valueOf(c8539jM4072a.m4079d()), c8584a.m4644a(), "Auth error from PayLib api", 3, null);
                        }
                    }
                    if (AbstractC8532e.m4008c(webResponse.getCode())) {
                        return baseResponse;
                    }
                    if (AbstractC8532e.m4006a(webResponse.getCode())) {
                        this.f4895e.m4034a(c8584a, webResponse);
                        throw new KotlinNothingValueException();
                    }
                    if (AbstractC8532e.m4010e(webResponse.getCode())) {
                        this.f4895e.m4038b(c8584a, webResponse);
                        throw new KotlinNothingValueException();
                    }
                    if (AbstractC8532e.m4009d(webResponse.getCode())) {
                        this.f4895e.m4039b(c8584a, webResponse, baseResponse);
                        throw new KotlinNothingValueException();
                    }
                    if (AbstractC8532e.m4007b(webResponse.getCode())) {
                        this.f4895e.m4035a(c8584a, webResponse, baseResponse);
                        throw new KotlinNothingValueException();
                    }
                    this.f4895e.m4041c(c8584a, webResponse);
                    throw new KotlinNothingValueException();
                }
                c8539jM4072a = (C8539j) this.f4892b;
                c8584a = (C8584a) this.f4891a;
                ResultKt.throwOnFailure(obj);
            }
            webResponse = (WebResponse) obj;
            baseResponse = (BaseResponse) this.f4895e.m4026a(c8584a, webResponse, this.f4899i);
            if (!AbstractC8532e.m4006a(webResponse.getCode())) {
                if (baseResponse instanceof ResponseWithError) {
                    ErrorModel error2 = ((ResponseWithError) baseResponse).getError();
                }
                if (baseResponse instanceof ResponseWithError) {
                }
                if (AbstractC8532e.m4008c(webResponse.getCode())) {
                }
            }
            this.f4895e.f4884a.m4092a(C8543n.a.AUTHORIZATION_ERROR);
            C8533f c8533f2 = this.f4895e;
            PaylibContext paylibContext2 = this.f4897g;
            this.f4891a = c8584a;
            this.f4892b = c8539jM4072a;
            this.f4893c = 2;
            obj = c8533f2.m4027a(c8584a, c8539jM4072a, paylibContext2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8539j = c8539jM4072a;
            c8584a2 = c8584a;
            webResponse = (WebResponse) obj;
            baseResponse = (BaseResponse) this.f4895e.m4026a(c8584a2, webResponse, this.f4899i);
            c8584a = c8584a2;
            c8539jM4072a = c8539j;
            if (baseResponse instanceof ResponseWithError) {
            }
            if (AbstractC8532e.m4008c(webResponse.getCode())) {
            }
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$c */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f4900a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f4900a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8539j invoke(C8539j call) {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            return call.m4075b(this.f4900a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$d */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: a */
        public static final d f4901a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8539j invoke(C8539j call) {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            return call.m4074b();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function1 {

        /* renamed from: a */
        public Object f4902a;

        /* renamed from: b */
        public Object f4903b;

        /* renamed from: c */
        public int f4904c;

        /* renamed from: e */
        public final /* synthetic */ String f4906e;

        /* renamed from: f */
        public final /* synthetic */ a f4907f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, a aVar, Continuation continuation) {
            super(1, continuation);
            this.f4906e = str;
            this.f4907f = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Continuation continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C8533f.this.new e(this.f4906e, this.f4907f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C8584a c8584aM4646a;
            C8539j c8539jM4071a;
            C8539j c8539j;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f4904c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                c8584aM4646a = C8584a.f5782c.m4646a();
                c8539jM4071a = C8533f.this.f4888e.mo4085a().m4082f(this.f4906e).m4074b().m4071a(c8584aM4646a);
                try {
                    C8533f c8533f = C8533f.this;
                    this.f4902a = c8584aM4646a;
                    this.f4903b = c8539jM4071a;
                    this.f4904c = 1;
                    Object objM4025a = c8533f.m4025a(c8539jM4071a, this);
                    if (objM4025a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c8539j = c8539jM4071a;
                    obj = objM4025a;
                } catch (Exception e) {
                    e = e;
                    C8533f.this.f4887d.m4059a(c8539jM4071a, e);
                    throw new PaylibException(e.getMessage(), c8584aM4646a.m4644a(), e);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8539j = (C8539j) this.f4903b;
                c8584aM4646a = (C8584a) this.f4902a;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e2) {
                    C8539j c8539j2 = c8539j;
                    e = e2;
                    c8539jM4071a = c8539j2;
                    C8533f.this.f4887d.m4059a(c8539jM4071a, e);
                    throw new PaylibException(e.getMessage(), c8584aM4646a.m4644a(), e);
                }
            }
            return (BaseResponse) C8533f.this.m4026a(c8584aM4646a, (WebResponse) obj, this.f4907f);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$f */
    public static final class f extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f4908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.f4908a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8539j invoke(C8539j call) {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            return call.m4077c(this.f4908a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$g */
    public static final class g extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f4909a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.f4909a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8539j invoke(C8539j call) {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            return call.m4078d(this.f4909a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$h */
    public static final class h extends Lambda implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ String f4910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.f4910a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C8539j invoke(C8539j call) {
            Intrinsics.checkNotNullParameter(call, "$this$call");
            return call.m4080e(this.f4910a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$i */
    public static final class i extends ContinuationImpl {

        /* renamed from: a */
        public Object f4911a;

        /* renamed from: b */
        public /* synthetic */ Object f4912b;

        /* renamed from: d */
        public int f4914d;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4912b = obj;
            this.f4914d |= Integer.MIN_VALUE;
            return C8533f.this.m4032a((Function1) null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$j */
    public static final class j extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f4915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Throwable th) {
            super(0);
            this.f4915a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Throwable: " + AbstractC8611c.m4716a(this.f4915a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$k */
    public static final class k extends ContinuationImpl {

        /* renamed from: a */
        public Object f4916a;

        /* renamed from: b */
        public Object f4917b;

        /* renamed from: c */
        public Object f4918c;

        /* renamed from: d */
        public /* synthetic */ Object f4919d;

        /* renamed from: f */
        public int f4921f;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4919d = obj;
            this.f4921f |= Integer.MIN_VALUE;
            return C8533f.this.m4027a((C8584a) null, (C8539j) null, (PaylibContext) null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.f$l */
    public static final class l extends ContinuationImpl {

        /* renamed from: a */
        public Object f4922a;

        /* renamed from: b */
        public /* synthetic */ Object f4923b;

        /* renamed from: d */
        public int f4925d;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4923b = obj;
            this.f4925d |= Integer.MIN_VALUE;
            return C8533f.this.m4025a((C8539j) null, this);
        }
    }

    public C8533f(C8545a clientProvider, C8543n tokenWatcher, BackendUrlProvider backendUrlProvider, C8530c connectivityChecker, C8537a loggingInterceptor, InterfaceC8540k requestBuilderFactory, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(clientProvider, "clientProvider");
        Intrinsics.checkNotNullParameter(tokenWatcher, "tokenWatcher");
        Intrinsics.checkNotNullParameter(connectivityChecker, "connectivityChecker");
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(requestBuilderFactory, "requestBuilderFactory");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4884a = tokenWatcher;
        this.f4885b = backendUrlProvider;
        this.f4886c = connectivityChecker;
        this.f4887d = loggingInterceptor;
        this.f4888e = requestBuilderFactory;
        this.f4889f = loggerFactory.get("NetworkClient");
        this.f4890g = clientProvider.m4097a();
    }

    /* renamed from: d */
    public final Object m4042d(String str, PaylibContext paylibContext, String str2, a aVar, Continuation continuation) {
        return m4031a(str, new h(str2), paylibContext, null, aVar, continuation);
    }

    /* renamed from: b */
    public final Object m4037b(String str, PaylibContext paylibContext, String str2, a aVar, Continuation continuation) {
        return m4031a(str, new f(str2), paylibContext, null, aVar, continuation);
    }

    /* renamed from: c */
    public final Object m4040c(String str, PaylibContext paylibContext, String str2, a aVar, Continuation continuation) {
        return m4031a(str, new g(str2), paylibContext, null, aVar, continuation);
    }

    /* renamed from: c */
    public final Void m4041c(C8584a c8584a, WebResponse webResponse) throws PayLibBackendFailure.UnspecifiedError {
        throw new PayLibBackendFailure.UnspecifiedError(Integer.valueOf(webResponse.getCode()), webResponse.getMessage(), webResponse.getRequest().getUrl(), c8584a.m4644a(), null, 16, null);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4015a(C8533f c8533f, String str, PaylibContext paylibContext, a aVar, Long l2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            l2 = null;
        }
        return c8533f.m4028a(str, paylibContext, aVar, l2, continuation);
    }

    /* renamed from: b */
    public final Void m4038b(C8584a c8584a, WebResponse webResponse) throws PayLibBackendFailure.TimeoutError {
        webResponse.getRequest();
        throw new PayLibBackendFailure.TimeoutError(null, null, null);
    }

    /* renamed from: b */
    public final Void m4039b(C8584a c8584a, WebResponse webResponse, Object obj) throws PayLibBackendFailure.ServerError {
        WebRequest request = webResponse.getRequest();
        int code = webResponse.getCode();
        String message = webResponse.getMessage();
        boolean z = obj instanceof ResponseWithCode;
        ResponseWithCode responseWithCode = z ? (ResponseWithCode) obj : null;
        String errorMessage = responseWithCode != null ? responseWithCode.getErrorMessage() : null;
        ResponseWithCode responseWithCode2 = z ? (ResponseWithCode) obj : null;
        Integer numValueOf = responseWithCode2 != null ? Integer.valueOf(responseWithCode2.getCode()) : null;
        String url = request.getUrl();
        PurchasePayloadHolder purchasePayloadHolder = obj instanceof PurchasePayloadHolder ? (PurchasePayloadHolder) obj : null;
        throw new PayLibBackendFailure.ServerError(code, message, url, errorMessage, numValueOf, c8584a.m4644a(), purchasePayloadHolder != null ? purchasePayloadHolder.getPurchasePayload() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4025a(C8539j c8539j, Continuation continuation) throws Throwable {
        l lVar;
        C8533f c8533f;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.f4925d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.f4925d = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        }
        Object objSend = lVar.f4923b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.f4925d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSend);
            m4036a(c8539j);
            WebRequest webRequestM4070a = c8539j.m4070a();
            this.f4887d.m4057a(webRequestM4070a);
            WebClient webClient = this.f4890g;
            lVar.f4922a = this;
            lVar.f4925d = 1;
            objSend = webClient.send(webRequestM4070a, lVar);
            if (objSend == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8533f = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8533f = (C8533f) lVar.f4922a;
            ResultKt.throwOnFailure(objSend);
        }
        WebResponse webResponse = (WebResponse) objSend;
        c8533f.f4887d.m4058a(webResponse);
        return webResponse;
    }

    /* renamed from: a */
    public final Object m4026a(C8584a c8584a, WebResponse webResponse, a aVar) throws PayLibBackendFailure.ParseError {
        WebRequest request = webResponse.getRequest();
        String contentString = webResponse.getContentString();
        if (contentString == null) {
            throw new PayLibBackendFailure.ParseError("Empty response for " + request.getUrl(), c8584a.m4644a(), null, 4, null);
        }
        try {
            return aVar.mo3960a(new C8535h(new C8534g(c8584a), contentString));
        } catch (SerializationException e2) {
            throw new PayLibBackendFailure.ParseError("Can't parse response of " + request.getUrl(), c8584a.m4644a(), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00ad A[Catch: Exception -> 0x00c6, IOException -> 0x00c8, TryCatch #11 {IOException -> 0x00c8, Exception -> 0x00c6, blocks: (B:135:0x00c3, B:130:0x00a9, B:132:0x00ad, B:141:0x00ca, B:142:0x00e3), top: B:173:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ca A[Catch: Exception -> 0x00c6, IOException -> 0x00c8, TryCatch #11 {IOException -> 0x00c8, Exception -> 0x00c6, blocks: (B:135:0x00c3, B:130:0x00a9, B:132:0x00ad, B:141:0x00ca, B:142:0x00e3), top: B:173:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0017  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4027a(C8584a c8584a, C8539j c8539j, PaylibContext paylibContext, Continuation continuation) throws Throwable {
        k kVar;
        C8584a c8584a2;
        C8539j c8539j2;
        C8533f c8533f;
        C8543n c8543n;
        PaylibToken paylibToken;
        Object objM4001a;
        IOException iOException;
        C8584a c8584a3;
        C8539j c8539j3;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.f4921f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.f4921f = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        }
        Object objM4091a = kVar.f4919d;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = kVar.f4921f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objM4091a);
            try {
                c8543n = this.f4884a;
                kVar.f4916a = this;
                c8584a2 = c8584a;
                try {
                    kVar.f4917b = c8584a2;
                    c8539j2 = c8539j;
                } catch (IOException e2) {
                    e = e2;
                    c8539j2 = c8539j;
                    c8533f = this;
                    c8533f.f4887d.m4059a(c8539j2, e);
                    C8530c c8530c = c8533f.f4886c;
                    kVar.f4916a = c8584a2;
                    kVar.f4917b = c8539j2;
                    kVar.f4918c = e;
                    kVar.f4921f = 3;
                    objM4001a = c8530c.m4001a(kVar);
                    if (objM4001a == coroutine_suspended) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    c8539j2 = c8539j;
                    c8533f = this;
                    c8533f.f4887d.m4059a(c8539j2, e);
                    throw new PaylibException(e.getMessage(), c8584a2.m4644a(), e);
                }
            } catch (IOException e4) {
                e = e4;
                c8584a2 = c8584a;
            } catch (Exception e5) {
                e = e5;
                c8584a2 = c8584a;
            }
            try {
                kVar.f4918c = c8539j2;
                kVar.f4921f = 1;
                objM4091a = c8543n.m4091a(paylibContext, kVar);
                if (objM4091a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8533f = this;
                paylibToken = (PaylibToken) objM4091a;
                if (paylibToken != null) {
                }
            } catch (IOException e6) {
                e = e6;
                c8533f = this;
                c8533f.f4887d.m4059a(c8539j2, e);
                C8530c c8530c2 = c8533f.f4886c;
                kVar.f4916a = c8584a2;
                kVar.f4917b = c8539j2;
                kVar.f4918c = e;
                kVar.f4921f = 3;
                objM4001a = c8530c2.m4001a(kVar);
                if (objM4001a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                C8539j c8539j4 = c8539j2;
                iOException = e;
                objM4091a = objM4001a;
                c8584a3 = c8584a2;
                c8539j3 = c8539j4;
                if (((Boolean) objM4091a).booleanValue()) {
                }
            } catch (Exception e7) {
                e = e7;
                c8533f = this;
                c8533f.f4887d.m4059a(c8539j2, e);
                throw new PaylibException(e.getMessage(), c8584a2.m4644a(), e);
            }
        } else if (i3 == 1) {
            C8539j c8539j5 = (C8539j) kVar.f4918c;
            C8584a c8584a4 = (C8584a) kVar.f4917b;
            C8533f c8533f2 = (C8533f) kVar.f4916a;
            try {
                ResultKt.throwOnFailure(objM4091a);
                c8539j2 = c8539j5;
                c8584a2 = c8584a4;
                c8533f = c8533f2;
            } catch (IOException e8) {
                e = e8;
                c8539j2 = c8539j5;
                c8584a2 = c8584a4;
                c8533f = c8533f2;
                c8533f.f4887d.m4059a(c8539j2, e);
                C8530c c8530c22 = c8533f.f4886c;
                kVar.f4916a = c8584a2;
                kVar.f4917b = c8539j2;
                kVar.f4918c = e;
                kVar.f4921f = 3;
                objM4001a = c8530c22.m4001a(kVar);
                if (objM4001a == coroutine_suspended) {
                }
            } catch (Exception e9) {
                e = e9;
                c8539j2 = c8539j5;
                c8584a2 = c8584a4;
                c8533f = c8533f2;
                c8533f.f4887d.m4059a(c8539j2, e);
                throw new PaylibException(e.getMessage(), c8584a2.m4644a(), e);
            }
            try {
                paylibToken = (PaylibToken) objM4091a;
                if (paylibToken != null) {
                    throw new PayLibBackendFailure.AuthError(null, null, String.valueOf(c8539j2.m4079d()), c8539j2.m4081e(), "No authorization token", 3, null);
                }
                c8539j2.m4073a(paylibToken.getRawToken());
                kVar.f4916a = c8533f;
                kVar.f4917b = c8584a2;
                kVar.f4918c = c8539j2;
                kVar.f4921f = 2;
                objM4091a = c8533f.m4025a(c8539j2, kVar);
                if (objM4091a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (WebResponse) objM4091a;
            } catch (IOException e10) {
                e = e10;
                c8533f.f4887d.m4059a(c8539j2, e);
                C8530c c8530c222 = c8533f.f4886c;
                kVar.f4916a = c8584a2;
                kVar.f4917b = c8539j2;
                kVar.f4918c = e;
                kVar.f4921f = 3;
                objM4001a = c8530c222.m4001a(kVar);
                if (objM4001a == coroutine_suspended) {
                }
            } catch (Exception e11) {
                e = e11;
                c8533f.f4887d.m4059a(c8539j2, e);
                throw new PaylibException(e.getMessage(), c8584a2.m4644a(), e);
            }
        } else if (i3 == 2) {
            C8539j c8539j6 = (C8539j) kVar.f4918c;
            C8584a c8584a5 = (C8584a) kVar.f4917b;
            c8533f = (C8533f) kVar.f4916a;
            try {
                ResultKt.throwOnFailure(objM4091a);
                return (WebResponse) objM4091a;
            } catch (IOException e12) {
                e = e12;
                c8539j2 = c8539j6;
                c8584a2 = c8584a5;
                c8533f.f4887d.m4059a(c8539j2, e);
                C8530c c8530c2222 = c8533f.f4886c;
                kVar.f4916a = c8584a2;
                kVar.f4917b = c8539j2;
                kVar.f4918c = e;
                kVar.f4921f = 3;
                objM4001a = c8530c2222.m4001a(kVar);
                if (objM4001a == coroutine_suspended) {
                }
            } catch (Exception e13) {
                e = e13;
                c8539j2 = c8539j6;
                c8584a2 = c8584a5;
                c8533f.f4887d.m4059a(c8539j2, e);
                throw new PaylibException(e.getMessage(), c8584a2.m4644a(), e);
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            IOException iOException2 = (IOException) kVar.f4918c;
            c8539j3 = (C8539j) kVar.f4917b;
            c8584a3 = (C8584a) kVar.f4916a;
            ResultKt.throwOnFailure(objM4091a);
            iOException = iOException2;
        }
        if (((Boolean) objM4091a).booleanValue()) {
            throw new PayLibBackendFailure.NoInternetError(c8584a3.m4644a(), iOException);
        }
        if (iOException instanceof SocketTimeoutException) {
            throw new PayLibBackendFailure.TimeoutError(null, c8584a3.m4644a(), iOException);
        }
        throw new PayLibBackendFailure.UnspecifiedError(null, null, String.valueOf(c8539j3.m4079d()), c8584a3.m4644a(), iOException, 3, null);
    }

    /* renamed from: a */
    public final Object m4028a(String str, PaylibContext paylibContext, a aVar, Long l2, Continuation continuation) {
        return m4031a(str, d.f4901a, paylibContext, l2, aVar, continuation);
    }

    /* renamed from: a */
    public final Object m4029a(String str, PaylibContext paylibContext, String str2, a aVar, Continuation continuation) {
        return m4031a(str, new c(str2), paylibContext, null, aVar, continuation);
    }

    /* renamed from: a */
    public final Object m4030a(String str, a aVar, Continuation continuation) {
        return m4032a(new e(str, aVar, null), continuation);
    }

    /* renamed from: a */
    public final Object m4031a(String str, Function1 function1, PaylibContext paylibContext, Long l2, a aVar, Continuation continuation) {
        return m4032a(new b(function1, this, str, paylibContext, l2, aVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4032a(Function1 function1, Continuation continuation) throws Throwable {
        i iVar;
        C8533f c8533f;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f4914d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f4914d = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        }
        Object objInvoke = iVar.f4912b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f4914d;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8533f = (C8533f) iVar.f4911a;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th) {
                th = th;
                PaylibLogger.DefaultImpls.e$default(c8533f.f4889f, null, new j(th), 1, null);
                throw th;
            }
        }
        ResultKt.throwOnFailure(objInvoke);
        try {
            iVar.f4911a = this;
            iVar.f4914d = 1;
            objInvoke = function1.invoke(iVar);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        } catch (Throwable th2) {
            th = th2;
            c8533f = this;
            PaylibLogger.DefaultImpls.e$default(c8533f.f4889f, null, new j(th), 1, null);
            throw th;
        }
    }

    /* renamed from: a */
    public final String m4033a(String str, PaylibContext paylibContext) {
        return AbstractC8529b.m4000a(this.f4885b, paylibContext) + str;
    }

    /* renamed from: a */
    public final Void m4034a(C8584a c8584a, WebResponse webResponse) throws PayLibBackendFailure.AuthError {
        throw new PayLibBackendFailure.AuthError(Integer.valueOf(webResponse.getCode()), webResponse.getMessage(), webResponse.getRequest().getUrl(), c8584a.m4644a(), null, 16, null);
    }

    /* renamed from: a */
    public final Void m4035a(C8584a c8584a, WebResponse webResponse, Object obj) throws PayLibBackendFailure.ClientError {
        WebRequest request = webResponse.getRequest();
        int code = webResponse.getCode();
        String message = webResponse.getMessage();
        boolean z = obj instanceof ResponseWithCode;
        ResponseWithCode responseWithCode = z ? (ResponseWithCode) obj : null;
        String errorMessage = responseWithCode != null ? responseWithCode.getErrorMessage() : null;
        ResponseWithCode responseWithCode2 = z ? (ResponseWithCode) obj : null;
        Integer numValueOf = responseWithCode2 != null ? Integer.valueOf(responseWithCode2.getCode()) : null;
        String url = request.getUrl();
        PurchasePayloadHolder purchasePayloadHolder = obj instanceof PurchasePayloadHolder ? (PurchasePayloadHolder) obj : null;
        throw new PayLibBackendFailure.ClientError(code, message, url, errorMessage, numValueOf, c8584a.m4644a(), purchasePayloadHolder != null ? purchasePayloadHolder.getPurchasePayload() : null);
    }

    /* renamed from: a */
    public final void m4036a(C8539j c8539j) throws PayLibBackendFailure.NoInternetError {
        if (!this.f4886c.m4002a()) {
            throw new PayLibBackendFailure.NoInternetError(c8539j.m4081e(), null);
        }
    }
}
