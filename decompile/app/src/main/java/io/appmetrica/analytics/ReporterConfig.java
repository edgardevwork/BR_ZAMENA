package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C8858Dm;
import io.appmetrica.analytics.impl.C9441c0;
import io.appmetrica.analytics.impl.C9896u5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* renamed from: l */
        private static final C8858Dm f5984l = new C8858Dm(new C9441c0());

        /* renamed from: a */
        private final C9896u5 f5985a;

        /* renamed from: b */
        private final String f5986b;

        /* renamed from: c */
        private Integer f5987c;

        /* renamed from: d */
        private Boolean f5988d;

        /* renamed from: e */
        private Boolean f5989e;

        /* renamed from: f */
        private Integer f5990f;

        /* renamed from: g */
        private String f5991g;

        /* renamed from: h */
        private Integer f5992h;

        /* renamed from: i */
        private Integer f5993i;

        /* renamed from: j */
        private final HashMap f5994j;

        /* renamed from: k */
        private final HashMap f5995k;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f5995k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f5994j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z) {
            this.f5989e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i) {
            this.f5992h = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f5988d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i) {
            this.f5993i = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f5990f = Integer.valueOf(this.f5985a.m6851a(i));
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i) {
            this.f5987c = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f5991g = str;
            return this;
        }

        private Builder(String str) {
            this.f5994j = new HashMap();
            this.f5995k = new HashMap();
            f5984l.mo5086a(str);
            this.f5985a = new C9896u5(str);
            this.f5986b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f5986b;
        this.sessionTimeout = builder.f5987c;
        this.logs = builder.f5988d;
        this.dataSendingEnabled = builder.f5989e;
        this.maxReportsInDatabaseCount = builder.f5990f;
        this.userProfileID = builder.f5991g;
        this.dispatchPeriodSeconds = builder.f5992h;
        this.maxReportsCount = builder.f5993i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5994j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5995k);
    }
}
