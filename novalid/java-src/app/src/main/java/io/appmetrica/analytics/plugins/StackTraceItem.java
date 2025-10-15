package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public class StackTraceItem {

    /* renamed from: a */
    private final String f9633a;

    /* renamed from: b */
    private final String f9634b;

    /* renamed from: c */
    private final Integer f9635c;

    /* renamed from: d */
    private final Integer f9636d;

    /* renamed from: e */
    private final String f9637e;

    public static class Builder {

        /* renamed from: a */
        private String f9638a;

        /* renamed from: b */
        private String f9639b;

        /* renamed from: c */
        private Integer f9640c;

        /* renamed from: d */
        private Integer f9641d;

        /* renamed from: e */
        private String f9642e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f9638a, this.f9639b, this.f9640c, this.f9641d, this.f9642e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f9638a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f9641d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f9639b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f9640c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f9642e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i) {
        this(str, str2, num, num2, str3);
    }

    @Nullable
    public String getClassName() {
        return this.f9633a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f9636d;
    }

    @Nullable
    public String getFileName() {
        return this.f9634b;
    }

    @Nullable
    public Integer getLine() {
        return this.f9635c;
    }

    @Nullable
    public String getMethodName() {
        return this.f9637e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f9633a = str;
        this.f9634b = str2;
        this.f9635c = num;
        this.f9636d = num2;
        this.f9637e = str3;
    }
}
