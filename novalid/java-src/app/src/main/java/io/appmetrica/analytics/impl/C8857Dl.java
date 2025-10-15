package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.Dl */
/* loaded from: classes7.dex */
public final class C8857Dl implements UnderlyingNetworkTask {

    /* renamed from: a */
    public final C8907Fl f6495a;

    /* renamed from: b */
    public C9587hl f6496b;

    /* renamed from: c */
    public EnumC9100Nk f6497c;

    /* renamed from: d */
    public final RequestDataHolder f6498d;

    /* renamed from: e */
    public final ConfigProvider f6499e;

    /* renamed from: f */
    public final ResponseDataHolder f6500f;

    /* renamed from: g */
    public final FullUrlFormer f6501g;

    /* renamed from: h */
    public final C9291Vk f6502h;

    public C8857Dl(@NonNull C8907Fl c8907Fl, @NonNull FullUrlFormer<C9537fl> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C9537fl> configProvider) {
        this(c8907Fl, new C9291Vk(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.f6495a.f6626a.f6687f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f6501g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f6498d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f6500f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C9537fl) this.f6499e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((C8881Ek) C9676la.f8552C.m6387x()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f6498d.setHeader("Accept-Encoding", "encrypted");
        return this.f6495a.m5203g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z) {
            return;
        }
        this.f6497c = EnumC9100Nk.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C9587hl c9587hlHandle = this.f6502h.handle(this.f6500f);
        this.f6496b = c9587hlHandle;
        return c9587hlHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th) {
        this.f6497c = EnumC9100Nk.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f6497c = EnumC9100Nk.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f6496b == null || this.f6500f.getResponseHeaders() == null) {
            return;
        }
        this.f6495a.m5194a(this.f6496b, (C9537fl) this.f6499e.getConfig(), this.f6500f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f6497c == null) {
            this.f6497c = EnumC9100Nk.UNKNOWN;
        }
        this.f6495a.m5192a(this.f6497c);
    }

    public C8857Dl(C8907Fl c8907Fl, C9291Vk c9291Vk, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f6495a = c8907Fl;
        this.f6502h = c9291Vk;
        this.f6498d = requestDataHolder;
        this.f6500f = responseDataHolder;
        this.f6499e = configProvider;
        this.f6501g = fullUrlFormer;
        fullUrlFormer.setHosts(((C9537fl) configProvider.getConfig()).m6142k());
    }
}
