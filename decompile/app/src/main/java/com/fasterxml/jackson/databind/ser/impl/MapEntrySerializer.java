package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.io.IOException;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    public PropertySerializerMap _dynamicValueSerializers;
    public final JavaType _entryType;
    public JsonSerializer<Object> _keySerializer;
    public final JavaType _keyType;
    public final BeanProperty _property;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public JsonSerializer<Object> _valueSerializer;
    public final JavaType _valueType;
    public final boolean _valueTypeIsStatic;
    public final TypeSerializer _valueTypeSerializer;

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    @Deprecated
    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        this(mapEntrySerializer, beanProperty, typeSerializer, jsonSerializer, jsonSerializer2, mapEntrySerializer._suppressableValue, mapEntrySerializer._suppressNulls);
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new MapEntrySerializer(this, this._property, typeSerializer, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, jsonSerializer, jsonSerializer2, obj, z);
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z) {
        return (this._suppressableValue == obj && this._suppressNulls == z) ? this : new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerSerializerInstance;
        JsonSerializer<?> jsonSerializerSerializerInstance2;
        JsonSerializer<?> jsonSerializerHandleSecondaryContextualization;
        Object obj;
        boolean z;
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        boolean zIncludeFilterSuppressNulls;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Object defaultValue = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (member == null || annotationIntrospector == null) {
            jsonSerializerSerializerInstance = null;
            jsonSerializerSerializerInstance2 = null;
        } else {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            jsonSerializerSerializerInstance2 = objFindKeySerializer != null ? serializerProvider.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            jsonSerializerSerializerInstance = objFindContentSerializer != null ? serializerProvider.serializerInstance(member, objFindContentSerializer) : null;
        }
        if (jsonSerializerSerializerInstance == null) {
            jsonSerializerSerializerInstance = this._valueSerializer;
        }
        JsonSerializer<?> jsonSerializerFindContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializerSerializerInstance);
        if (jsonSerializerFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            jsonSerializerFindContextualConvertingSerializer = serializerProvider.findContentValueSerializer(this._valueType, beanProperty);
        }
        JsonSerializer<?> jsonSerializer = jsonSerializerFindContextualConvertingSerializer;
        if (jsonSerializerSerializerInstance2 == null) {
            jsonSerializerSerializerInstance2 = this._keySerializer;
        }
        if (jsonSerializerSerializerInstance2 == null) {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.findKeySerializer(this._keyType, beanProperty);
        } else {
            jsonSerializerHandleSecondaryContextualization = serializerProvider.handleSecondaryContextualization(jsonSerializerSerializerInstance2, beanProperty);
        }
        JsonSerializer<?> jsonSerializer2 = jsonSerializerHandleSecondaryContextualization;
        Object obj2 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), null)) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            obj = obj2;
        } else {
            int i = C67061.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            z2 = true;
            if (i == 1) {
                defaultValue = BeanUtil.getDefaultValue(this._valueType);
                if (defaultValue != null && defaultValue.getClass().isArray()) {
                    defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
                }
            } else if (i != 2) {
                if (i == 3) {
                    defaultValue = MARKER_FOR_EMPTY;
                } else {
                    if (i == 4) {
                        defaultValue = serializerProvider.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                        if (defaultValue != null) {
                            zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(defaultValue);
                            z = zIncludeFilterSuppressNulls;
                            obj = defaultValue;
                        }
                    } else if (i != 5) {
                        zIncludeFilterSuppressNulls = false;
                        z = zIncludeFilterSuppressNulls;
                        obj = defaultValue;
                    }
                    return withResolved(beanProperty, jsonSerializer2, jsonSerializer, obj, z);
                }
            } else if (this._valueType.isReferenceType()) {
                defaultValue = MARKER_FOR_EMPTY;
            }
            obj = defaultValue;
        }
        z = z2;
        return withResolved(beanProperty, jsonSerializer2, jsonSerializer, obj, z);
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C67061 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JsonSerializer<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer_findAndAddDynamic = this._valueSerializer;
        if (jsonSerializer_findAndAddDynamic == null) {
            Class<?> cls = value.getClass();
            JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicValueSerializers.serializerFor(cls);
            if (jsonSerializerSerializerFor == null) {
                try {
                    jsonSerializer_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor;
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return jsonSerializer_findAndAddDynamic.isEmpty(serializerProvider, value);
        }
        return obj.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject(entry);
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.setCurrentValue(entry);
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializerFindNullKeySerializer;
        JsonSerializer<Object> jsonSerializer_findAndAddDynamic;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        Object key = entry.getKey();
        if (key == null) {
            jsonSerializerFindNullKeySerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
        } else {
            jsonSerializerFindNullKeySerializer = this._keySerializer;
        }
        Object value = entry.getValue();
        if (value == null) {
            if (this._suppressNulls) {
                return;
            } else {
                jsonSerializer_findAndAddDynamic = serializerProvider.getDefaultNullValueSerializer();
            }
        } else {
            jsonSerializer_findAndAddDynamic = this._valueSerializer;
            if (jsonSerializer_findAndAddDynamic == null) {
                Class<?> cls = value.getClass();
                JsonSerializer<Object> jsonSerializerSerializerFor = this._dynamicValueSerializers.serializerFor(cls);
                if (jsonSerializerSerializerFor != null) {
                    jsonSerializer_findAndAddDynamic = jsonSerializerSerializerFor;
                } else if (this._valueType.hasGenericTypes()) {
                    jsonSerializer_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider);
                } else {
                    jsonSerializer_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && jsonSerializer_findAndAddDynamic.isEmpty(serializerProvider, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        }
        jsonSerializerFindNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
        try {
            if (typeSerializer == null) {
                jsonSerializer_findAndAddDynamic.serialize(value, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer_findAndAddDynamic.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, entry, "" + key);
        }
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return serializerAndMapResultFindAndAddSecondarySerializer.serializer;
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return serializerAndMapResultFindAndAddSecondarySerializer.serializer;
    }
}
