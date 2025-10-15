package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClient;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequest;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequestMethod;
import com.sdkit.paylib.paylibnetwork.impl.utils.C8490a;
import com.sdkit.paylib.paylibnetwork.impl.utils.C8491b;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.g */
/* loaded from: classes6.dex */
public final class C8473g implements WebClient {

    /* renamed from: b */
    public static final a f4155b = new a(null);

    /* renamed from: a */
    public final Lazy f4156a;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.g$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.g$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4157a;

        static {
            int[] iArr = new int[WebRequestMethod.values().length];
            try {
                iArr[WebRequestMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebRequestMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebRequestMethod.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebRequestMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebRequestMethod.PATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4157a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.g$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8469c f4158a;

        /* renamed from: b */
        public final /* synthetic */ WebClientConfig f4159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C8469c c8469c, WebClientConfig webClientConfig) {
            super(0);
            this.f4158a = c8469c;
            this.f4159b = webClientConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builderNewBuilder = this.f4158a.m3823a(this.f4159b).newBuilder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return builderNewBuilder.connectTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.g$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: a */
        public Object f4160a;

        /* renamed from: b */
        public Object f4161b;

        /* renamed from: c */
        public /* synthetic */ Object f4162c;

        /* renamed from: e */
        public int f4164e;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4162c = obj;
            this.f4164e |= Integer.MIN_VALUE;
            return C8473g.this.send(null, this);
        }
    }

    public C8473g(C8469c okHttpClientFactory, WebClientConfig clientConfig) {
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        Intrinsics.checkNotNullParameter(clientConfig, "clientConfig");
        this.f4156a = LazyKt__LazyJVMKt.lazy(new c(okHttpClientFactory, clientConfig));
    }

    /* renamed from: a */
    public final OkHttpClient m3832a() {
        return (OkHttpClient) this.f4156a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object send(WebRequest webRequest, Continuation continuation) throws Throwable {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.f4164e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.f4164e = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        }
        Object result = dVar.f4162c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.f4164e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            String url = webRequest.getUrl();
            Map<String, String> headers = webRequest.getHeaders();
            String bodyString = webRequest.getBodyString();
            RequestBody requestBodyCreate = bodyString != null ? RequestBody.INSTANCE.create(bodyString, MediaType.INSTANCE.parse("application/json")) : null;
            Request.Builder builder = new Request.Builder();
            if (headers != null) {
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    builder.addHeader(entry.getKey(), entry.getValue());
                }
            }
            int i3 = b.f4157a[webRequest.getMethod().ordinal()];
            if (i3 == 1) {
                builder.get();
            } else if (i3 == 2) {
                if (requestBodyCreate == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                builder.post(requestBodyCreate);
            } else if (i3 == 3) {
                if (requestBodyCreate == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                builder.put(requestBodyCreate);
            } else if (i3 == 4) {
                builder.delete(requestBodyCreate);
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (requestBodyCreate == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                builder.patch(requestBodyCreate);
            }
            Call callNewCall = m3833a(webRequest).newCall(builder.url(url).build());
            dVar.f4160a = webRequest;
            dVar.f4161b = callNewCall;
            dVar.f4164e = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(dVar), 1);
            cancellableContinuationImpl.initCancellability();
            FirebasePerfOkHttpClient.enqueue(callNewCall, new C8490a(cancellableContinuationImpl));
            cancellableContinuationImpl.invokeOnCancellation(new C8491b(callNewCall));
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(dVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webRequest = (WebRequest) dVar.f4160a;
            ResultKt.throwOnFailure(result);
        }
        return new C8476j(webRequest, (Response) result);
    }

    /* renamed from: a */
    public final OkHttpClient m3833a(WebRequest webRequest) {
        Long waitSec = webRequest.getWaitSec();
        if (waitSec == null) {
            return m3832a();
        }
        OkHttpClient.Builder builderNewBuilder = m3832a().newBuilder();
        long jLongValue = waitSec.longValue() + 30;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderNewBuilder.connectTimeout(jLongValue, timeUnit);
        builderNewBuilder.writeTimeout(waitSec.longValue() + 30, timeUnit);
        builderNewBuilder.readTimeout(waitSec.longValue() + 30, timeUnit);
        return builderNewBuilder.build();
    }
}
