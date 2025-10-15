package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SerializerCache {
    public static final int DEFAULT_MAX_CACHED = 4000;
    public final AtomicReference<ReadOnlyClassToSerializerMap> _readOnlyMap;
    public final LRUMap<TypeKey, JsonSerializer<Object>> _sharedMap;

    public SerializerCache() {
        this(4000);
    }

    public SerializerCache(int i) {
        this._sharedMap = new LRUMap<>(Math.min(64, i >> 2), i);
        this._readOnlyMap = new AtomicReference<>();
    }

    public ReadOnlyClassToSerializerMap getReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap = this._readOnlyMap.get();
        return readOnlyClassToSerializerMap != null ? readOnlyClassToSerializerMap : _makeReadOnlyLookupMap();
    }

    public final synchronized ReadOnlyClassToSerializerMap _makeReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMapFrom;
        readOnlyClassToSerializerMapFrom = this._readOnlyMap.get();
        if (readOnlyClassToSerializerMapFrom == null) {
            readOnlyClassToSerializerMapFrom = ReadOnlyClassToSerializerMap.from(this._sharedMap);
            this._readOnlyMap.set(readOnlyClassToSerializerMapFrom);
        }
        return readOnlyClassToSerializerMapFrom;
    }

    public synchronized int size() {
        return this._sharedMap.size();
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(cls, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(javaType, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(javaType, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this._sharedMap.get(new TypeKey(cls, true));
        }
        return jsonSerializer;
    }

    public void addTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(javaType, true), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(cls, true), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(cls, false), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this._sharedMap.put(new TypeKey(javaType, false), jsonSerializer) == null) {
                    this._readOnlyMap.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                JsonSerializer<Object> jsonSerializerPut = this._sharedMap.put(new TypeKey(cls, false), jsonSerializer);
                JsonSerializer<Object> jsonSerializerPut2 = this._sharedMap.put(new TypeKey(javaType, false), jsonSerializer);
                if (jsonSerializerPut == null || jsonSerializerPut2 == null) {
                    this._readOnlyMap.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void flush() {
        this._sharedMap.clear();
    }
}
