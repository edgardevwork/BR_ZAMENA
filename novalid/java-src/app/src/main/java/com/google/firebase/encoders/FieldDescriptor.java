package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FieldDescriptor {
    private final String name;
    private final Map<Class<?>, Object> properties;

    public /* synthetic */ FieldDescriptor(String str, Map map, C76831 c76831) {
        this(str, map);
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.name = str;
        this.properties = map;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.properties.get(cls);
    }

    @NonNull
    /* renamed from: of */
    public static FieldDescriptor m1375of(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.name.equals(fieldDescriptor.name) && this.properties.equals(fieldDescriptor.properties);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.properties.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.name + ", properties=" + this.properties.values() + WebvttCssParser.RULE_END;
    }

    public static final class Builder {
        private final String name;
        private Map<Class<?>, Object> properties = null;

        public Builder(String str) {
            this.name = str;
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t) {
            if (this.properties == null) {
                this.properties = new HashMap();
            }
            this.properties.put(t.annotationType(), t);
            return this;
        }

        @NonNull
        public FieldDescriptor build() {
            Map mapUnmodifiableMap;
            String str = this.name;
            if (this.properties == null) {
                mapUnmodifiableMap = Collections.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(this.properties));
            }
            return new FieldDescriptor(str, mapUnmodifiableMap);
        }
    }
}
