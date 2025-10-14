package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.p022io.CharacterEscapes;
import com.fasterxml.jackson.core.p022io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MutableCoercionConfig;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes6.dex */
public class ObjectMapper extends ObjectCodec implements Versioned, Serializable {
    public static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    public static final BaseSettings DEFAULT_BASE;
    public static final long serialVersionUID = 2;
    public final CoercionConfigs _coercionConfigs;
    public final ConfigOverrides _configOverrides;
    public DeserializationConfig _deserializationConfig;
    public DefaultDeserializationContext _deserializationContext;
    public InjectableValues _injectableValues;
    public final JsonFactory _jsonFactory;
    public SimpleMixInResolver _mixIns;
    public Set<Object> _registeredModuleTypes;
    public final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    public SerializationConfig _serializationConfig;
    public SerializerFactory _serializerFactory;
    public DefaultSerializerProvider _serializerProvider;
    public SubtypeResolver _subtypeResolver;
    public TypeFactory _typeFactory;

    /* loaded from: classes4.dex */
    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder implements Serializable {
        public static final long serialVersionUID = 1;
        public final DefaultTyping _appliesFor;
        public final PolymorphicTypeValidator _subtypeValidator;

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public /* bridge */ /* synthetic */ TypeResolverBuilder withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public /* bridge */ /* synthetic */ StdTypeResolverBuilder withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        @Deprecated
        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this(defaultTyping, LaissezFaireSubTypeValidator.instance);
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this._appliesFor = (DefaultTyping) _requireNonNull(defaultTyping, "Can not pass `null` DefaultTyping");
            this._subtypeValidator = (PolymorphicTypeValidator) _requireNonNull(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }

        public DefaultTypeResolverBuilder(DefaultTypeResolverBuilder defaultTypeResolverBuilder, Class<?> cls) {
            super(defaultTypeResolverBuilder, cls);
            this._appliesFor = defaultTypeResolverBuilder._appliesFor;
            this._subtypeValidator = defaultTypeResolverBuilder._subtypeValidator;
        }

        public static <T> T _requireNonNull(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(str);
        }

        public static DefaultTypeResolverBuilder construct(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public DefaultTypeResolverBuilder withDefaultImpl(Class<?> cls) {
            if (this._defaultImpl == cls) {
                return this;
            }
            ClassUtil.verifyMustOverride(DefaultTypeResolverBuilder.class, this, "withDefaultImpl");
            return new DefaultTypeResolverBuilder(this, cls);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
        public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
            return this._subtypeValidator;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
        public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public boolean useForType(JavaType javaType) {
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = C66733.f645x3ef634e7[this._appliesFor.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return javaType.isJavaLangObject();
                    }
                    return true;
                }
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
                while (javaType.isReferenceType()) {
                    javaType = javaType.getReferencedType();
                }
                return (javaType.isFinal() || TreeNode.class.isAssignableFrom(javaType.getRawClass())) ? false : true;
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            return javaType.isJavaLangObject() || !(javaType.isConcrete() || TreeNode.class.isAssignableFrom(javaType.getRawClass()));
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$3 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C66733 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping */
        public static final /* synthetic */ int[] f645x3ef634e7;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            f645x3ef634e7 = iArr;
            try {
                iArr[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f645x3ef634e7[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f645x3ef634e7[DefaultTyping.NON_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f645x3ef634e7[DefaultTyping.EVERYTHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f645x3ef634e7[DefaultTyping.JAVA_LANG_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, Base64Variants.getDefaultVariant(), LaissezFaireSubTypeValidator.instance, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this(objectMapper, null);
    }

    public ObjectMapper(ObjectMapper objectMapper, JsonFactory jsonFactory) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        jsonFactory = jsonFactory == null ? objectMapper._jsonFactory.copy() : jsonFactory;
        this._jsonFactory = jsonFactory;
        jsonFactory.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver.copy();
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        ConfigOverrides configOverridesCopy = objectMapper._configOverrides.copy();
        this._configOverrides = configOverridesCopy;
        CoercionConfigs coercionConfigsCopy = objectMapper._coercionConfigs.copy();
        this._coercionConfigs = coercionConfigsCopy;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverridesCopy);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverridesCopy, coercionConfigsCopy);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings baseSettingsWithClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this._coercionConfigs = coercionConfigs;
        this._serializationConfig = new SerializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, DatatypeFeatures.defaultFeatures());
        this._deserializationConfig = new DeserializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, coercionConfigs, DatatypeFeatures.defaultFeatures());
        boolean zRequiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ zRequiresPropertyOrdering) {
            configure(mapperFeature, zRequiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public ClassIntrospector defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public ObjectMapper copyWith(JsonFactory jsonFactory) {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this, jsonFactory);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy()/copyWith(): " + getClass().getName() + " (version: " + version() + ") does not override copy()/copyWith(); it has to");
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, formatSchema, injectableValues);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, FormatSchema formatSchema) {
        return new ObjectWriter(this, serializationConfig, formatSchema);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        return new ObjectWriter(this, serializationConfig, javaType, prettyPrinter);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectMapper registerModule(Module module) {
        Object typeId;
        _assertNotNull("module", module);
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (module.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator<? extends Module> it = module.getDependencies().iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = module.getTypeId()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(typeId)) {
                return this;
            }
        }
        module.setupModule(new Module.SetupContext() { // from class: com.fasterxml.jackson.databind.ObjectMapper.1
            public C66711() {
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public Version getMapperVersion() {
                return ObjectMapper.this.version();
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public <C extends ObjectCodec> C getOwner() {
                return ObjectMapper.this;
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public TypeFactory getTypeFactory() {
                return ObjectMapper.this._typeFactory;
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(MapperFeature mapperFeature) {
                return ObjectMapper.this.isEnabled(mapperFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(DeserializationFeature deserializationFeature) {
                return ObjectMapper.this.isEnabled(deserializationFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(SerializationFeature serializationFeature) {
                return ObjectMapper.this.isEnabled(serializationFeature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(JsonFactory.Feature feature) {
                return ObjectMapper.this.isEnabled(feature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(JsonParser.Feature feature) {
                return ObjectMapper.this.isEnabled(feature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public boolean isEnabled(JsonGenerator.Feature feature) {
                return ObjectMapper.this.isEnabled(feature);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public MutableConfigOverride configOverride(Class<?> cls) {
                return ObjectMapper.this.configOverride(cls);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addDeserializers(Deserializers deserializers) {
                DeserializerFactory deserializerFactoryWithAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAdditionalDeserializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
                DeserializerFactory deserializerFactoryWithAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAdditionalKeyDeserializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
                DeserializerFactory deserializerFactoryWithDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithDeserializerModifier);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addSerializers(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addKeySerializers(Serializers serializers) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
                DeserializerFactory deserializerFactoryWithAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAbstractTypeResolver);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addTypeModifier(TypeModifier typeModifier) {
                ObjectMapper.this.setTypeFactory(ObjectMapper.this._typeFactory.withModifier(typeModifier));
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addValueInstantiators(ValueInstantiators valueInstantiators) {
                DeserializerFactory deserializerFactoryWithValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(valueInstantiators);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithValueInstantiators);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setClassIntrospector(ClassIntrospector classIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationConfig = objectMapper._deserializationConfig.with(classIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2._serializationConfig = objectMapper2._serializationConfig.with(classIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationConfig = objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2._serializationConfig = objectMapper2._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationConfig = objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
                ObjectMapper objectMapper2 = ObjectMapper.this;
                objectMapper2._serializationConfig = objectMapper2._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(Class<?>... clsArr) {
                ObjectMapper.this.registerSubtypes(clsArr);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(NamedType... namedTypeArr) {
                ObjectMapper.this.registerSubtypes(namedTypeArr);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void registerSubtypes(Collection<Class<?>> collection) {
                ObjectMapper.this.registerSubtypes(collection);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
                ObjectMapper.this.addMixIn(cls, cls2);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
                ObjectMapper.this.addHandler(deserializationProblemHandler);
            }

            @Override // com.fasterxml.jackson.databind.Module.SetupContext
            public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
                ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
            }
        });
        return this;
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$1 */
    /* loaded from: classes7.dex */
    public class C66711 implements Module.SetupContext {
        public C66711() {
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public Version getMapperVersion() {
            return ObjectMapper.this.version();
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public <C extends ObjectCodec> C getOwner() {
            return ObjectMapper.this;
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public TypeFactory getTypeFactory() {
            return ObjectMapper.this._typeFactory;
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public boolean isEnabled(MapperFeature mapperFeature) {
            return ObjectMapper.this.isEnabled(mapperFeature);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public boolean isEnabled(DeserializationFeature deserializationFeature) {
            return ObjectMapper.this.isEnabled(deserializationFeature);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public boolean isEnabled(SerializationFeature serializationFeature) {
            return ObjectMapper.this.isEnabled(serializationFeature);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public boolean isEnabled(JsonFactory.Feature feature) {
            return ObjectMapper.this.isEnabled(feature);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public boolean isEnabled(JsonParser.Feature feature) {
            return ObjectMapper.this.isEnabled(feature);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public boolean isEnabled(JsonGenerator.Feature feature) {
            return ObjectMapper.this.isEnabled(feature);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public MutableConfigOverride configOverride(Class<?> cls) {
            return ObjectMapper.this.configOverride(cls);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addDeserializers(Deserializers deserializers) {
            DeserializerFactory deserializerFactoryWithAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAdditionalDeserializers);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addKeyDeserializers(KeyDeserializers keyDeserializers) {
            DeserializerFactory deserializerFactoryWithAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(keyDeserializers);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAdditionalKeyDeserializers);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addBeanDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
            DeserializerFactory deserializerFactoryWithDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(beanDeserializerModifier);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithDeserializerModifier);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addSerializers(Serializers serializers) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addKeySerializers(Serializers serializers) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(serializers);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
            DeserializerFactory deserializerFactoryWithAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(abstractTypeResolver);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithAbstractTypeResolver);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addTypeModifier(TypeModifier typeModifier) {
            ObjectMapper.this.setTypeFactory(ObjectMapper.this._typeFactory.withModifier(typeModifier));
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addValueInstantiators(ValueInstantiators valueInstantiators) {
            DeserializerFactory deserializerFactoryWithValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(valueInstantiators);
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationContext = objectMapper._deserializationContext.with(deserializerFactoryWithValueInstantiators);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void setClassIntrospector(ClassIntrospector classIntrospector) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationConfig = objectMapper._deserializationConfig.with(classIntrospector);
            ObjectMapper objectMapper2 = ObjectMapper.this;
            objectMapper2._serializationConfig = objectMapper2._serializationConfig.with(classIntrospector);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void insertAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationConfig = objectMapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
            ObjectMapper objectMapper2 = ObjectMapper.this;
            objectMapper2._serializationConfig = objectMapper2._serializationConfig.withInsertedAnnotationIntrospector(annotationIntrospector);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void appendAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
            ObjectMapper objectMapper = ObjectMapper.this;
            objectMapper._deserializationConfig = objectMapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
            ObjectMapper objectMapper2 = ObjectMapper.this;
            objectMapper2._serializationConfig = objectMapper2._serializationConfig.withAppendedAnnotationIntrospector(annotationIntrospector);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void registerSubtypes(Class<?>... clsArr) {
            ObjectMapper.this.registerSubtypes(clsArr);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void registerSubtypes(NamedType... namedTypeArr) {
            ObjectMapper.this.registerSubtypes(namedTypeArr);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void registerSubtypes(Collection<Class<?>> collection) {
            ObjectMapper.this.registerSubtypes(collection);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
            ObjectMapper.this.addMixIn(cls, cls2);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationProblemHandler) {
            ObjectMapper.this.addHandler(deserializationProblemHandler);
        }

        @Override // com.fasterxml.jackson.databind.Module.SetupContext
        public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
            ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
        }
    }

    public ObjectMapper registerModules(Module... moduleArr) {
        for (Module module : moduleArr) {
            registerModule(module);
        }
        return this;
    }

    public ObjectMapper registerModules(Iterable<? extends Module> iterable) {
        _assertNotNull("modules", iterable);
        Iterator<? extends Module> it = iterable.iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        return this;
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public static List<Module> findModules() {
        return findModules(null);
    }

    public static List<Module> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(Module.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((Module) it.next());
        }
        return arrayList;
    }

    public static <T> ServiceLoader<T> secureGetServiceLoader(Class<T> cls, ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() { // from class: com.fasterxml.jackson.databind.ObjectMapper.2
            public final /* synthetic */ ClassLoader val$classLoader;
            public final /* synthetic */ Class val$clazz;

            public C66722(ClassLoader classLoader2, Class cls2) {
                classLoader = classLoader2;
                cls = cls2;
            }

            @Override // java.security.PrivilegedAction
            public ServiceLoader<T> run() {
                ClassLoader classLoader2 = classLoader;
                return classLoader2 == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader2);
            }
        });
    }

    /* renamed from: com.fasterxml.jackson.databind.ObjectMapper$2 */
    /* loaded from: classes4.dex */
    public static class C66722<T> implements PrivilegedAction<ServiceLoader<T>> {
        public final /* synthetic */ ClassLoader val$classLoader;
        public final /* synthetic */ Class val$clazz;

        public C66722(ClassLoader classLoader2, Class cls2) {
            classLoader = classLoader2;
            cls = cls2;
        }

        @Override // java.security.PrivilegedAction
        public ServiceLoader<T> run() {
            ClassLoader classLoader2 = classLoader;
            return classLoader2 == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader2);
        }
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules(findModules());
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(file, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(dataOutput);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(file));
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(url));
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(inputStream));
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(reader));
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr));
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr, i, i2));
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(str));
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr));
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull("content", cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr, i, i2));
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(dataInput));
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._deserializationConfig.initialize(this._jsonFactory.createNonBlockingByteArrayParser());
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerFactory) {
        this._serializerFactory = serializerFactory;
        return this;
    }

    public SerializerFactory getSerializerFactory() {
        return this._serializerFactory;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    public SerializerProvider getSerializerProvider() {
        return this._serializerProvider;
    }

    public SerializerProvider getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    public ObjectMapper setMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        SimpleMixInResolver simpleMixInResolverWithOverrides = this._mixIns.withOverrides(mixInResolver);
        if (simpleMixInResolverWithOverrides != this._mixIns) {
            this._mixIns = simpleMixInResolverWithOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, simpleMixInResolverWithOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, simpleMixInResolverWithOverrides);
        }
        return this;
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public SubtypeResolver getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public ObjectMapper setSubtypeResolver(SubtypeResolver subtypeResolver) {
        this._subtypeResolver = subtypeResolver;
        this._deserializationConfig = this._deserializationConfig.with(subtypeResolver);
        this._serializationConfig = this._serializationConfig.with(subtypeResolver);
        return this;
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public ObjectMapper setAccessorNaming(AccessorNamingStrategy.Provider provider) {
        this._serializationConfig = this._serializationConfig.with(provider);
        this._deserializationConfig = this._deserializationConfig.with(provider);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(prettyPrinter);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig._withBase(this._deserializationConfig.getBaseSettings().with(polymorphicTypeValidator));
        return this;
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.getBaseSettings().getPolymorphicTypeValidator();
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(VisibilityChecker.Std.construct(value));
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.setDefaultLeniency(bool);
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.EnumC6665As.WRAPPER_ARRAY);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.EnumC6665As enumC6665As) {
        if (enumC6665As == JsonTypeInfo.EnumC6665As.EXTERNAL_PROPERTY) {
            throw new IllegalArgumentException("Cannot use includeAs of " + enumC6665As);
        }
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.EnumC6666Id.CLASS, null).inclusion(enumC6665As));
    }

    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.EnumC6666Id.CLASS, null).inclusion(JsonTypeInfo.EnumC6665As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping(null);
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder<?> typeResolverBuilder) {
        this._deserializationConfig = this._deserializationConfig.with(typeResolverBuilder);
        this._serializationConfig = this._serializationConfig.with(typeResolverBuilder);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.EnumC6665As.WRAPPER_ARRAY);
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.EnumC6665As enumC6665As) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, enumC6665As);
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    public MutableCoercionConfig coercionConfigDefaults() {
        return this._coercionConfigs.defaultCoercions();
    }

    public MutableCoercionConfig coercionConfigFor(LogicalType logicalType) {
        return this._coercionConfigs.findOrCreateCoercion(logicalType);
    }

    public MutableCoercionConfig coercionConfigFor(Class<?> cls) {
        return this._coercionConfigs.findOrCreateCoercion(cls);
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.with(typeFactory);
        this._serializationConfig = this._serializationConfig.with(typeFactory);
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull("t", type);
        return this._typeFactory.constructType(type);
    }

    public JavaType constructType(TypeReference<?> typeReference) {
        _assertNotNull("typeRef", typeReference);
        return this._typeFactory.constructType(typeReference);
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setConstructorDetector(ConstructorDetector constructorDetector) {
        this._deserializationConfig = this._deserializationConfig.with(constructorDetector);
        return this;
    }

    public ObjectMapper addHandler(DeserializationProblemHandler deserializationProblemHandler) {
        this._deserializationConfig = this._deserializationConfig.withHandler(deserializationProblemHandler);
        return this;
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    @Deprecated
    public void setFilters(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
    }

    public ObjectMapper setFilterProvider(FilterProvider filterProvider) {
        this._serializationConfig = this._serializationConfig.withFilters(filterProvider);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.with(base64Variant);
        this._deserializationConfig = this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public Object setHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        this._deserializationConfig = this._deserializationConfig.with(handlerInstantiator);
        this._serializationConfig = this._serializationConfig.with(handlerInstantiator);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.with(locale);
        this._serializationConfig = this._serializationConfig.with(locale);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.with(timeZone);
        this._serializationConfig = this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setDefaultAttributes(ContextAttributes contextAttributes) {
        this._deserializationConfig = this._deserializationConfig.with(contextAttributes);
        this._serializationConfig = this._serializationConfig.with(contextAttributes);
        return this;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    @Deprecated
    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(mapperFeature) : this._serializationConfig.without(mapperFeature);
        this._deserializationConfig = z ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature);
        return this;
    }

    @Deprecated
    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper configure(DatatypeFeature datatypeFeature, boolean z) {
        if (z) {
            this._deserializationConfig = this._deserializationConfig.with(datatypeFeature);
            this._serializationConfig = this._serializationConfig.with(datatypeFeature);
        } else {
            this._deserializationConfig = this._deserializationConfig.without(datatypeFeature);
            this._serializationConfig = this._serializationConfig.without(datatypeFeature);
        }
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.mappedFeature());
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(cls));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, (JavaType) resolvedType);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.currentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        JsonNode jsonNode = (JsonNode) _readValue(deserializationConfig, jsonParser, constructType(JsonNode.class));
        return jsonNode == null ? getNodeFactory().nullNode() : jsonNode;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> MappingIterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new MappingIterator<>(javaType, jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), false, null);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> MappingIterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType(cls));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> MappingIterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public JsonNode readTree(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public JsonNode readTree(String str) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i, i2));
    }

    public JsonNode readTree(File file) throws IOException {
        _assertNotNull(PomReader.PomProfileElement.FILE, file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public JsonNode readTree(URL url) throws IOException {
        _assertNotNull("source", url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, treeNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeTree(JsonGenerator jsonGenerator, JsonNode jsonNode) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, jsonNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public JsonNode missingNode() {
        return this._deserializationConfig.getNodeFactory().missingNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public JsonNode nullNode() {
        return this._deserializationConfig.getNodeFactory().nullNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonParser treeAsTokens(TreeNode treeNode) {
        _assertNotNull("n", treeNode);
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws JsonProcessingException, IllegalArgumentException {
        T t;
        if (treeNode == 0) {
            return null;
        }
        try {
            return (TreeNode.class.isAssignableFrom(cls) && cls.isAssignableFrom(treeNode.getClass())) ? treeNode : (treeNode.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (treeNode instanceof POJONode) && ((t = (T) ((POJONode) treeNode).getPojo()) == null || cls.isInstance(t))) ? t : (T) readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T treeToValue(TreeNode treeNode, JavaType javaType) throws JsonProcessingException, IllegalArgumentException {
        T t;
        if (treeNode == 0) {
            return null;
        }
        try {
            return (javaType.isTypeOrSubTypeOf(TreeNode.class) && javaType.isTypeOrSuperTypeOf(treeNode.getClass())) ? treeNode : (treeNode.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (treeNode instanceof POJONode) && ((t = (T) ((POJONode) treeNode).getPojo()) == null || javaType.isTypeOrSuperTypeOf(t.getClass()))) ? t : (T) readValue(treeAsTokens(treeNode), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    public <T extends JsonNode> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return getNodeFactory().nullNode();
        }
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        TokenBuffer tokenBufferBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBufferBufferForValueConversion = tokenBufferBufferForValueConversion.forceUseOfBigDecimal(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(tokenBufferBufferForValueConversion, obj);
            JsonParser jsonParserAsParser = tokenBufferBufferForValueConversion.asParser();
            try {
                T t = (T) readTree(jsonParserAsParser);
                if (jsonParserAsParser != null) {
                    jsonParserAsParser.close();
                }
                return t;
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, null);
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(File file, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(URL url, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType(cls));
    }

    public <T> T readValue(String str, TypeReference<T> typeReference) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(Reader reader, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(InputStream inputStream, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        _assertNotNull("src", dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        _assertNotNull("src", dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }

    public void writeValue(File file, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator(segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        try {
            ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
            try {
                _writeValueAndClose(createGenerator(byteArrayBuilder, JsonEncoding.UTF8), obj);
                byte[] byteArray = byteArrayBuilder.toByteArray();
                byteArrayBuilder.release();
                byteArrayBuilder.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayBuilder.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectWriter writerFor(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    public ObjectWriter writerFor(TypeReference<?> typeReference) {
        return _newWriter(getSerializationConfig(), typeReference == null ? null : this._typeFactory.constructType(typeReference), null);
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectWriter writer(PrettyPrinter prettyPrinter) {
        if (prettyPrinter == null) {
            prettyPrinter = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), null, prettyPrinter);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, null, serializationConfig.getDefaultPrettyPrinter());
    }

    public ObjectWriter writer(FilterProvider filterProvider) {
        return _newWriter(getSerializationConfig().withFilters(filterProvider));
    }

    public ObjectWriter writer(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newWriter(getSerializationConfig(), formatSchema);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter(getSerializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(TypeReference<?> typeReference) {
        return _newWriter(getSerializationConfig(), typeReference == null ? null : this._typeFactory.constructType(typeReference), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), obj == null ? null : this._typeFactory.constructType(obj.getClass()), obj, null, this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    public ObjectReader readerFor(TypeReference<?> typeReference) {
        _assertNotNull("type", typeReference);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), null, null, this._injectableValues);
    }

    public ObjectReader readerForArrayOf(Class<?> cls) {
        _assertNotNull("type", cls);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructArrayType(cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForListOf(Class<?> cls) {
        _assertNotNull("type", cls);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructCollectionType(List.class, cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForMapOf(Class<?> cls) {
        _assertNotNull("type", cls);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructMapType(Map.class, String.class, cls), null, null, this._injectableValues);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        _assertNotNull("nodeFactory", jsonNodeFactory);
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectReader reader(FormatSchema formatSchema) {
        _verifySchemaType(formatSchema);
        return _newReader(getDeserializationConfig(), null, null, formatSchema, this._injectableValues);
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return _newReader(getDeserializationConfig(), null, null, null, injectableValues);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader(getDeserializationConfig().with(base64Variant));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    @Deprecated
    public ObjectReader reader(TypeReference<?> typeReference) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(typeReference), null, null, this._injectableValues);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType(cls));
    }

    public <T> T convertValue(Object obj, TypeReference<T> typeReference) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType((TypeReference<?>) typeReference));
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return (T) _convert(obj, javaType);
    }

    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object objDeserialize;
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        TokenBuffer tokenBufferBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBufferBufferForValueConversion = tokenBufferBufferForValueConversion.forceUseOfBigDecimal(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(tokenBufferBufferForValueConversion, obj);
            JsonParser jsonParserAsParser = tokenBufferBufferForValueConversion.asParser();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken jsonToken_initForReading = _initForReading(jsonParserAsParser, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParserAsParser, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                objDeserialize = null;
            } else {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext2 = createDeserializationContext(jsonParserAsParser, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext2, javaType).deserialize(jsonParserAsParser, defaultDeserializationContextCreateDeserializationContext2);
            }
            jsonParserAsParser.close();
            return objDeserialize;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public <T> T updateValue(T t, Object obj) throws JsonMappingException {
        if (t == null || obj == null) {
            return t;
        }
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        TokenBuffer tokenBufferBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBufferBufferForValueConversion = tokenBufferBufferForValueConversion.forceUseOfBigDecimal(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(tokenBufferBufferForValueConversion, obj);
            JsonParser jsonParserAsParser = tokenBufferBufferForValueConversion.asParser();
            T t2 = (T) readerForUpdating(t).readValue(jsonParserAsParser);
            jsonParserAsParser.close();
            return t2;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.fromUnexpectedIOE(e);
        }
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType(cls), jsonFormatVisitorWrapper);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, jsonFormatVisitorWrapper);
    }

    public TypeResolverBuilder<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.construct(defaultTyping, polymorphicTypeValidator);
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseable(jsonGenerator, obj, serializationConfig);
            return;
        }
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e);
        }
    }

    public final void _writeCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(null, closeable, e);
        }
    }

    @Deprecated
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        getSerializationConfig().initialize(jsonGenerator);
        _writeValueAndClose(jsonGenerator, obj);
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
        } else {
            rootValue = (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) ? null : defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
        }
        jsonParser.clearCurrentToken();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
        }
        return rootValue;
    }

    public Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        try {
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                rootValue = null;
            } else {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
                defaultDeserializationContextCreateDeserializationContext.checkUnresolvedObjectId();
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public JsonNode _readTreeAndClose(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        try {
            JavaType javaTypeConstructType = constructType(JsonNode.class);
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            deserializationConfig.initialize(jsonParser);
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
                JsonNode jsonNodeMissingNode = deserializationConfig.getNodeFactory().missingNode();
                jsonParser.close();
                return jsonNodeMissingNode;
            }
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                jsonNodeNullNode = deserializationConfig.getNodeFactory().nullNode();
            } else {
                jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaTypeConstructType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaTypeConstructType), null);
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaTypeConstructType);
            }
            jsonParser.close();
            return jsonNodeNullNode;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
        }
        return jsonTokenCurrentToken;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            deserializationContext.reportTrailingTokens(ClassUtil.rawClass(javaType), jsonParser, jsonTokenNextToken);
        }
    }

    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws DatabindException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema == null || this._jsonFactory.canUseSchema(formatSchema)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + formatSchema.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
