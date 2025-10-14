package com.thoughtworks.xstream.converters.reflection;

/* loaded from: classes7.dex */
public class Sun14ReflectionProvider extends SunUnsafeReflectionProvider {
    public Sun14ReflectionProvider() {
    }

    public Sun14ReflectionProvider(FieldDictionary fieldDictionary) {
        super(fieldDictionary);
    }

    public final Object readResolve() {
        init();
        return this;
    }
}
