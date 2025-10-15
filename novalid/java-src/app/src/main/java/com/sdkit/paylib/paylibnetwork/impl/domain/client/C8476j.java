package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequest;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.j */
/* loaded from: classes6.dex */
public final class C8476j implements WebResponse {

    /* renamed from: a */
    public final WebRequest f4167a;

    /* renamed from: b */
    public final Response f4168b;

    /* renamed from: c */
    public final Lazy f4169c;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.j$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            ResponseBody responseBodyBody = C8476j.this.f4168b.body();
            if (responseBodyBody != null) {
                return responseBodyBody.string();
            }
            return null;
        }
    }

    public C8476j(WebRequest request, Response response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f4167a = request;
        this.f4168b = response;
        this.f4169c = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse
    public int getCode() {
        return this.f4168b.code();
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse
    public String getContentString() {
        return (String) this.f4169c.getValue();
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse
    public String getMessage() {
        return this.f4168b.message();
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse
    public WebRequest getRequest() {
        return this.f4167a;
    }

    @Override // com.sdkit.paylib.paylibnetwork.api.domain.client.WebResponse
    public String header(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Response.header$default(this.f4168b, name, null, 2, null);
    }
}
