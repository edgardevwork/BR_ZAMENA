package com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequest;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8539j;
import com.sdkit.paylib.paylibpayment.impl.utls.AbstractC8588b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a */
/* loaded from: classes8.dex */
public final class C8537a {

    /* renamed from: a */
    public final PaylibLogger f4936a;

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Function0 f4937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f4937a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return (String) this.f4937a.invoke();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ WebRequest f4938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebRequest webRequest) {
            super(0);
            this.f4938a = webRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "--> [" + AbstractC8588b.m4655a(this.f4938a) + "] " + this.f4938a.getMethod() + ' ' + this.f4938a.getUrl();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ WebRequest f4939a;

        /* renamed from: b */
        public final /* synthetic */ String f4940b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WebRequest webRequest, String str) {
            super(0);
            this.f4939a = webRequest;
            this.f4940b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "--> [" + AbstractC8588b.m4655a(this.f4939a) + "] " + this.f4940b;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ C8539j f4941a;

        /* renamed from: b */
        public final /* synthetic */ Exception f4942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C8539j c8539j, Exception exc) {
            super(0);
            this.f4941a = c8539j;
            this.f4942b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "<-- [" + this.f4941a.m4081e() + "] " + this.f4941a.m4076c() + ' ' + this.f4941a.m4079d() + " FAILED: " + this.f4942b;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ WebRequest f4943a;

        /* renamed from: b */
        public final /* synthetic */ WebResponse f4944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebRequest webRequest, WebResponse webResponse) {
            super(0);
            this.f4943a = webRequest;
            this.f4944b = webResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "<-- [" + AbstractC8588b.m4655a(this.f4943a) + "] " + this.f4943a.getMethod() + ' ' + this.f4943a.getUrl() + ' ' + this.f4944b.getCode() + ' ' + this.f4944b.getMessage();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.a$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ WebRequest f4945a;

        /* renamed from: b */
        public final /* synthetic */ String f4946b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(WebRequest webRequest, String str) {
            super(0);
            this.f4945a = webRequest;
            this.f4946b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "<-- [" + AbstractC8588b.m4655a(this.f4945a) + "] " + this.f4946b;
        }
    }

    public C8537a(PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4936a = loggerFactory.get("LoggingInterceptor");
    }

    /* renamed from: a */
    public final void m4057a(WebRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        m4060a(new b(request));
        String bodyString = request.getBodyString();
        if (bodyString != null) {
            m4060a(new c(request, bodyString));
        }
    }

    /* renamed from: a */
    public final void m4058a(WebResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        WebRequest request = response.getRequest();
        m4060a(new e(request, response));
        String contentString = response.getContentString();
        if (contentString != null) {
            m4060a(new f(request, contentString));
        }
    }

    /* renamed from: a */
    public final void m4059a(C8539j request, Exception exception) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(exception, "exception");
        m4060a(new d(request, exception));
    }

    /* renamed from: a */
    public final void m4060a(Function0 function0) {
        PaylibLogger.DefaultImpls.d$default(this.f4936a, null, new a(function0), 1, null);
    }
}
