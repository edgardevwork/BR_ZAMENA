package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ModuleEvent {

    /* renamed from: a */
    private final int f5964a;

    /* renamed from: b */
    private final String f5965b;

    /* renamed from: c */
    private final String f5966c;

    /* renamed from: d */
    private final int f5967d;

    /* renamed from: e */
    private final List f5968e;

    /* renamed from: f */
    private final List f5969f;

    /* renamed from: g */
    private final List f5970g;

    public static class Builder {

        /* renamed from: a */
        private final int f5971a;

        /* renamed from: b */
        private String f5972b;

        /* renamed from: c */
        private String f5973c;

        /* renamed from: d */
        private int f5974d;

        /* renamed from: e */
        private HashMap f5975e;

        /* renamed from: f */
        private HashMap f5976f;

        /* renamed from: g */
        private HashMap f5977g;

        public /* synthetic */ Builder(int i, int i2) {
            this(i);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f5977g = new HashMap(map);
            }
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f5975e = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f5976f = new HashMap(map);
            }
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.f5972b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i) {
            this.f5974d = i;
            return this;
        }

        public Builder withValue(@Nullable String str) {
            this.f5973c = str;
            return this;
        }

        private Builder(int i) {
            this.f5974d = 1;
            this.f5971a = i;
        }
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(int i) {
        return new Builder(i, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f5970g);
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f5968e);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f5969f);
    }

    @Nullable
    public String getName() {
        return this.f5965b;
    }

    public int getServiceDataReporterType() {
        return this.f5967d;
    }

    public int getType() {
        return this.f5964a;
    }

    @Nullable
    public String getValue() {
        return this.f5966c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f5964a + ", name='" + this.f5965b + "', value='" + this.f5966c + "', serviceDataReporterType=" + this.f5967d + ", environment=" + this.f5968e + ", extras=" + this.f5969f + ", attributes=" + this.f5970g + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f5964a = builder.f5971a;
        this.f5965b = builder.f5972b;
        this.f5966c = builder.f5973c;
        this.f5967d = builder.f5974d;
        this.f5968e = CollectionUtils.getListFromMap(builder.f5975e);
        this.f5969f = CollectionUtils.getListFromMap(builder.f5976f);
        this.f5970g = CollectionUtils.getListFromMap(builder.f5977g);
    }
}
