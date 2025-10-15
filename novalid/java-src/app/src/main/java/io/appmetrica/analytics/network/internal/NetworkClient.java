package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.C10079c;
import io.appmetrica.analytics.network.impl.C10080d;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class NetworkClient {

    /* renamed from: a */
    private final Integer f9532a;

    /* renamed from: b */
    private final Integer f9533b;

    /* renamed from: c */
    private final SSLSocketFactory f9534c;

    /* renamed from: d */
    private final Boolean f9535d;

    /* renamed from: e */
    private final Boolean f9536e;

    /* renamed from: f */
    private final int f9537f;

    public static class Builder {

        /* renamed from: a */
        private Integer f9538a;

        /* renamed from: b */
        private Integer f9539b;

        /* renamed from: c */
        private SSLSocketFactory f9540c;

        /* renamed from: d */
        private Boolean f9541d;

        /* renamed from: e */
        private Boolean f9542e;

        /* renamed from: f */
        private Integer f9543f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f9538a, this.f9539b, this.f9540c, this.f9541d, this.f9542e, this.f9543f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i) {
            this.f9538a = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z) {
            this.f9542e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i) {
            this.f9543f = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i) {
            this.f9539b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f9540c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z) {
            this.f9541d = Boolean.valueOf(z);
            return this;
        }
    }

    public /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.f9532a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.f9536e;
    }

    public int getMaxResponseSize() {
        return this.f9537f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.f9533b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f9534c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.f9535d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new C10079c(this, request, new C10080d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f9532a + ", readTimeout=" + this.f9533b + ", sslSocketFactory=" + this.f9534c + ", useCaches=" + this.f9535d + ", instanceFollowRedirects=" + this.f9536e + ", maxResponseSize=" + this.f9537f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f9532a = num;
        this.f9533b = num2;
        this.f9534c = sSLSocketFactory;
        this.f9535d = bool;
        this.f9536e = bool2;
        this.f9537f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
