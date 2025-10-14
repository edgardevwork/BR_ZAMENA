package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes7.dex */
public abstract class SerializerProvider extends DatabindContext {
    public static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final JsonSerializer<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final JsonSerializer<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    public transient ContextAttributes _attributes;
    public final SerializationConfig _config;
    public DateFormat _dateFormat;
    public JsonSerializer<Object> _keySerializer;
    public final ReadOnlyClassToSerializerMap _knownSerializers;
    public JsonSerializer<Object> _nullKeySerializer;
    public JsonSerializer<Object> _nullValueSerializer;
    public final Class<?> _serializationView;
    public final SerializerCache _serializerCache;
    public final SerializerFactory _serializerFactory;
    public final boolean _stdNullValueSerializer;
    public JsonSerializer<Object> _unknownTypeSerializer;

    public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public JsonGenerator getGenerator() {
        return null;
    }

    public abstract Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) throws JsonMappingException;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException;

    public abstract JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj) throws JsonMappingException;

    public SerializerProvider() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new SerializerCache();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public SerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        JsonSerializer<Object> jsonSerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = jsonSerializer;
        this._serializerFactory = serializerFactory;
        this._config = serializationConfig;
        SerializerCache serializerCache = serializerProvider._serializerCache;
        this._serializerCache = serializerCache;
        this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
        this._keySerializer = serializerProvider._keySerializer;
        JsonSerializer<Object> jsonSerializer2 = serializerProvider._nullValueSerializer;
        this._nullValueSerializer = jsonSerializer2;
        this._nullKeySerializer = serializerProvider._nullKeySerializer;
        this._stdNullValueSerializer = jsonSerializer2 == jsonSerializer;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = serializerCache.getReadOnlyLookupMap();
    }

    public SerializerProvider(SerializerProvider serializerProvider) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new SerializerCache();
        this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
        this._keySerializer = serializerProvider._keySerializer;
        this._nullValueSerializer = serializerProvider._nullValueSerializer;
        this._nullKeySerializer = serializerProvider._nullKeySerializer;
        this._stdNullValueSerializer = serializerProvider._stdNullValueSerializer;
    }

    public void setDefaultKeySerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._keySerializer = jsonSerializer;
    }

    public void setNullValueSerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullValueSerializer = jsonSerializer;
    }

    public void setNullKeySerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullKeySerializer = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final SerializationConfig getConfig() {
        return this._config;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._config.isEnabled(datatypeFeature);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion(cls);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public Locale getLocale() {
        return this._config.getLocale();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public SerializerProvider setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public final boolean hasSerializationFeatures(int i) {
        return this._config.hasSerializationFeatures(i);
    }

    public final FilterProvider getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public TokenBuffer bufferForValueConversion(ObjectCodec objectCodec) {
        return new TokenBuffer(objectCodec, false);
    }

    public final TokenBuffer bufferForValueConversion() {
        return bufferForValueConversion(null);
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(cls)) == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls))) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType)) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer != null) {
            return jsonSerializerUntypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer2 = this._serializerCache.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer2 != null) {
            return jsonSerializerUntypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer3 = this._serializerCache.untypedValueSerializer(this._config.constructType(cls));
        if (jsonSerializerUntypedValueSerializer3 != null) {
            return jsonSerializerUntypedValueSerializer3;
        }
        JsonSerializer<Object> jsonSerializer_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return jsonSerializer_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : jsonSerializer_createAndCacheUntypedSerializer;
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer != null) {
            return jsonSerializerUntypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer2 = this._serializerCache.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer2 != null) {
            return jsonSerializerUntypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializer_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return jsonSerializer_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : jsonSerializer_createAndCacheUntypedSerializer;
    }

    public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType)) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handlePrimaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(cls)) == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls))) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findContentValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType)) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findContentValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(cls)) == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls))) == null && (jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(jsonSerializerUntypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerTypedValueSerializer = this._knownSerializers.typedValueSerializer(cls);
        if (jsonSerializerTypedValueSerializer != null) {
            return jsonSerializerTypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerTypedValueSerializer2 = this._serializerCache.typedValueSerializer(cls);
        if (jsonSerializerTypedValueSerializer2 != null) {
            return jsonSerializerTypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = findValueSerializer(cls, beanProperty);
        SerializerFactory serializerFactory = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        TypeSerializer typeSerializerCreateTypeSerializer = serializerFactory.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (typeSerializerCreateTypeSerializer != null) {
            jsonSerializerFindValueSerializer = new TypeWrappedSerializer(typeSerializerCreateTypeSerializer.forProperty(beanProperty), jsonSerializerFindValueSerializer);
        }
        if (z) {
            this._serializerCache.addTypedSerializer(cls, jsonSerializerFindValueSerializer);
        }
        return jsonSerializerFindValueSerializer;
    }

    public JsonSerializer<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerTypedValueSerializer = this._knownSerializers.typedValueSerializer(javaType);
        if (jsonSerializerTypedValueSerializer != null) {
            return jsonSerializerTypedValueSerializer;
        }
        JsonSerializer<Object> jsonSerializerTypedValueSerializer2 = this._serializerCache.typedValueSerializer(javaType);
        if (jsonSerializerTypedValueSerializer2 != null) {
            return jsonSerializerTypedValueSerializer2;
        }
        JsonSerializer<Object> jsonSerializerFindValueSerializer = findValueSerializer(javaType, beanProperty);
        TypeSerializer typeSerializerCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (typeSerializerCreateTypeSerializer != null) {
            jsonSerializerFindValueSerializer = new TypeWrappedSerializer(typeSerializerCreateTypeSerializer.forProperty(beanProperty), jsonSerializerFindValueSerializer);
        }
        if (z) {
            this._serializerCache.addTypedSerializer(javaType, jsonSerializerFindValueSerializer);
        }
        return jsonSerializerFindValueSerializer;
    }

    public TypeSerializer findTypeSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    public JsonSerializer<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this, javaType, this._keySerializer), beanProperty);
    }

    public JsonSerializer<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public JsonSerializer<Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public JsonSerializer<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public JsonSerializer<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    public JsonSerializer<Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> cls) {
        if (cls == Object.class) {
            return this._unknownTypeSerializer;
        }
        return new UnknownSerializer(cls);
    }

    public boolean isUnknownTypeSerializer(JsonSerializer<?> jsonSerializer) {
        if (jsonSerializer == this._unknownTypeSerializer || jsonSerializer == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && jsonSerializer.getClass() == UnknownSerializer.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> handlePrimaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws JsonMappingException {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> handleSecondaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws JsonMappingException {
        return (jsonSerializer == 0 || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (obj == null) {
            if (this._stdNullValueSerializer) {
                jsonGenerator.writeNull();
                return;
            } else {
                this._nullValueSerializer.serialize(null, jsonGenerator, this);
                return;
            }
        }
        findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeFieldName(str);
        if (obj == null) {
            if (this._stdNullValueSerializer) {
                jsonGenerator.writeNull();
                return;
            } else {
                this._nullValueSerializer.serialize(null, jsonGenerator, this);
                return;
            }
        }
        findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
    }

    public final void defaultSerializeDateValue(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(j);
        } else {
            jsonGenerator.writeString(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(date.getTime());
        } else {
            jsonGenerator.writeString(_dateFormat().format(date));
        }
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(j));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(new Date(j)));
        }
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.writeNull();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public void reportMappingProblem(String str, Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) throws JsonMappingException {
        String strNameOf;
        if (beanDescription == null) {
            strNameOf = "N/A";
        } else {
            strNameOf = ClassUtil.nameOf(beanDescription.getBeanClass());
        }
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid type definition for type %s: %s", strNameOf, _format(str, objArr)), beanDescription, (BeanPropertyDefinition) null);
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) throws JsonMappingException {
        String str_quotedString;
        String str_format = _format(str, objArr);
        String strNameOf = "N/A";
        if (beanPropertyDefinition == null) {
            str_quotedString = "N/A";
        } else {
            str_quotedString = _quotedString(beanPropertyDefinition.getName());
        }
        if (beanDescription != null) {
            strNameOf = ClassUtil.nameOf(beanDescription.getBeanClass());
        }
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", str_quotedString, strNameOf, str_format), beanDescription, beanPropertyDefinition);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType).withCause(th);
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, constructType(cls)).withCause(th);
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    @Override // com.fasterxml.jackson.databind.DatabindContext
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, ClassUtil.getTypeDescription(javaType)), str2), javaType, str);
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException mappingException(Throwable th, String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (javaType.isPrimitive() && ClassUtil.wrapperType(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, ClassUtil.classNameOf(obj)));
    }

    public JsonSerializer<Object> _findExplicitUntypedSerializer(Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerUntypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (jsonSerializerUntypedValueSerializer == null && (jsonSerializerUntypedValueSerializer = this._serializerCache.untypedValueSerializer(cls)) == null) {
            jsonSerializerUntypedValueSerializer = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(jsonSerializerUntypedValueSerializer)) {
            return null;
        }
        return jsonSerializerUntypedValueSerializer;
    }

    public JsonSerializer<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer_createUntypedSerializer;
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            jsonSerializer_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
        } catch (IllegalArgumentException e) {
            reportBadDefinition(javaTypeConstructType, ClassUtil.exceptionMessage(e));
            jsonSerializer_createUntypedSerializer = null;
        }
        if (jsonSerializer_createUntypedSerializer != null) {
            this._serializerCache.addAndResolveNonTypedSerializer(cls, javaTypeConstructType, jsonSerializer_createUntypedSerializer, this);
        }
        return jsonSerializer_createUntypedSerializer;
    }

    public JsonSerializer<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer_createUntypedSerializer;
        try {
            jsonSerializer_createUntypedSerializer = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, ClassUtil.exceptionMessage(e), new Object[0]);
            jsonSerializer_createUntypedSerializer = null;
        }
        if (jsonSerializer_createUntypedSerializer != null) {
            this._serializerCache.addAndResolveNonTypedSerializer(javaType, jsonSerializer_createUntypedSerializer, this);
        }
        return jsonSerializer_createUntypedSerializer;
    }

    public JsonSerializer<Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<Object> _handleContextualResolvable(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) throws JsonMappingException {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return handleSecondaryContextualization(jsonSerializer, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<Object> _handleResolvable(JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return jsonSerializer;
    }

    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }
}
