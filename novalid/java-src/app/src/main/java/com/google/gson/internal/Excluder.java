package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    public static final double IGNORE_VERSIONS = -1.0d;
    public boolean requireExpose;
    public double version = -1.0d;
    public int modifiers = 136;
    public boolean serializeInnerClasses = true;
    public List<ExclusionStrategy> serializationStrategies = Collections.emptyList();
    public List<ExclusionStrategy> deserializationStrategies = Collections.emptyList();

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m15339clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Excluder withVersion(double d) {
        Excluder excluderM15339clone = m15339clone();
        excluderM15339clone.version = d;
        return excluderM15339clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM15339clone = m15339clone();
        excluderM15339clone.modifiers = 0;
        for (int i : iArr) {
            excluderM15339clone.modifiers = i | excluderM15339clone.modifiers;
        }
        return excluderM15339clone;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM15339clone = m15339clone();
        excluderM15339clone.serializeInnerClasses = false;
        return excluderM15339clone;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM15339clone = m15339clone();
        excluderM15339clone.requireExpose = true;
        return excluderM15339clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder excluderM15339clone = m15339clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM15339clone.serializationStrategies = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM15339clone.deserializationStrategies = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return excluderM15339clone;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean zExcludeClassChecks = excludeClassChecks(rawType);
        final boolean z = zExcludeClassChecks || excludeClassInStrategy(rawType, true);
        final boolean z2 = zExcludeClassChecks || excludeClassInStrategy(rawType, false);
        if (z || z2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                public TypeAdapter<T> delegate;

                @Override // com.google.gson.TypeAdapter
                /* renamed from: read */
                public T read2(JsonReader jsonReader) throws IOException {
                    if (z2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return delegate().read2(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                    } else {
                        delegate().write(jsonWriter, t);
                    }
                }

                public final TypeAdapter<T> delegate() {
                    TypeAdapter<T> typeAdapter = this.delegate;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.delegate = delegateAdapter;
                    return delegateAdapter;
                }
            };
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != -1.0d && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? expose.deserialize() : expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        Iterator<ExclusionStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    public final boolean excludeClassChecks(Class<?> cls) {
        if (this.version != -1.0d && !isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (this.serializeInnerClasses || !isInnerClass(cls)) {
            return isAnonymousOrNonStaticLocal(cls);
        }
        return true;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        return excludeClassChecks(cls) || excludeClassInStrategy(cls, z);
    }

    public final boolean excludeClassInStrategy(Class<?> cls, boolean z) {
        Iterator<ExclusionStrategy> it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || isStatic(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    public final boolean isInnerClass(Class<?> cls) {
        return cls.isMemberClass() && !isStatic(cls);
    }

    public final boolean isStatic(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    public final boolean isValidSince(Since since) {
        if (since != null) {
            return this.version >= since.value();
        }
        return true;
    }

    public final boolean isValidUntil(Until until) {
        if (until != null) {
            return this.version < until.value();
        }
        return true;
    }
}
