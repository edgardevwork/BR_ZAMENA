package com.blackhub.bronline.launcher.network;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class UserAgentInterceptor implements Interceptor {
    public final String userAgent;

    public UserAgentInterceptor(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.userAgent).build());
    }
}
