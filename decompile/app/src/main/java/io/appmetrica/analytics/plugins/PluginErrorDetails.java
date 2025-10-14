package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PluginErrorDetails {

    /* renamed from: a */
    private final String f9621a;

    /* renamed from: b */
    private final String f9622b;

    /* renamed from: c */
    private final ArrayList f9623c;

    /* renamed from: d */
    private final String f9624d;

    /* renamed from: e */
    private final String f9625e;

    /* renamed from: f */
    private final Map f9626f;

    public static class Builder {

        /* renamed from: a */
        private String f9627a;

        /* renamed from: b */
        private String f9628b;

        /* renamed from: c */
        private List f9629c;

        /* renamed from: d */
        private String f9630d;

        /* renamed from: e */
        private String f9631e;

        /* renamed from: f */
        private Map f9632f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f9627a, this.f9628b, (List) WrapUtils.getOrDefault(this.f9629c, new ArrayList()), this.f9630d, this.f9631e, (Map) WrapUtils.getOrDefault(this.f9632f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f9627a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f9628b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f9630d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f9632f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f9629c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f9631e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i) {
        this(str, str2, list, str3, str4, map);
    }

    @Nullable
    public String getExceptionClass() {
        return this.f9621a;
    }

    @Nullable
    public String getMessage() {
        return this.f9622b;
    }

    @Nullable
    public String getPlatform() {
        return this.f9624d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f9626f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f9623c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f9625e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f9621a = str;
        this.f9622b = str2;
        this.f9623c = new ArrayList(list);
        this.f9624d = str3;
        this.f9625e = str4;
        this.f9626f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
