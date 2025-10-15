package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class PreloadInfo {

    /* renamed from: a */
    private final String f5980a;

    /* renamed from: b */
    private final Map f5981b;

    public static class Builder {

        /* renamed from: a */
        private final String f5982a;

        /* renamed from: b */
        private final HashMap f5983b;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f5983b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f5982a = str;
            this.f5983b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f5981b;
    }

    public String getTrackingId() {
        return this.f5980a;
    }

    private PreloadInfo(Builder builder) {
        this.f5980a = builder.f5982a;
        this.f5981b = CollectionUtils.unmodifiableMapCopy(builder.f5983b);
    }
}
