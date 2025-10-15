package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    public static final long serialVersionUID = 1;

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() != BeanSerializerFactory.class) {
            throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
        }
        return new BeanSerializerFactory(serializerFactoryConfig);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public Iterable<Serializers> customSerializers() {
        return this._factoryConfig.serializers();
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory, com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws SecurityException, JsonMappingException {
        JavaType javaTypeRefineSerializationType;
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription beanDescriptionIntrospect = config.introspect(javaType);
        JsonSerializer<?> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, beanDescriptionIntrospect.getClassInfo());
        if (jsonSerializerFindSerializerFromAnnotation != null) {
            return jsonSerializerFindSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaTypeRefineSerializationType = javaType;
        } else {
            try {
                javaTypeRefineSerializationType = annotationIntrospector.refineSerializationType(config, beanDescriptionIntrospect.getClassInfo(), javaType);
            } catch (JsonMappingException e) {
                return (JsonSerializer) serializerProvider.reportBadTypeDefinition(beanDescriptionIntrospect, e.getMessage(), new Object[0]);
            }
        }
        if (javaTypeRefineSerializationType != javaType) {
            if (!javaTypeRefineSerializationType.hasRawClass(javaType.getRawClass())) {
                beanDescriptionIntrospect = config.introspect(javaTypeRefineSerializationType);
            }
            z = true;
        }
        Converter<Object, Object> converterFindSerializationConverter = beanDescriptionIntrospect.findSerializationConverter();
        if (converterFindSerializationConverter == null) {
            return _createSerializer2(serializerProvider, javaTypeRefineSerializationType, beanDescriptionIntrospect, z);
        }
        JavaType outputType = converterFindSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(javaTypeRefineSerializationType.getRawClass())) {
            beanDescriptionIntrospect = config.introspect(outputType);
            jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, beanDescriptionIntrospect.getClassInfo());
        }
        if (jsonSerializerFindSerializerFromAnnotation == null && !outputType.isJavaLangObject()) {
            jsonSerializerFindSerializerFromAnnotation = _createSerializer2(serializerProvider, outputType, beanDescriptionIntrospect, true);
        }
        return new StdDelegatingSerializer(converterFindSerializationConverter, outputType, jsonSerializerFindSerializerFromAnnotation);
    }

    public JsonSerializer<?> _createSerializer2(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws SecurityException, JsonMappingException {
        JsonSerializer<?> jsonSerializerFindSerializerByAnnotations;
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializerFindSerializer = null;
        if (javaType.isContainerType()) {
            if (!z) {
                z = usesStaticTyping(config, beanDescription, null);
            }
            jsonSerializerFindSerializerByAnnotations = buildContainerSerializer(serializerProvider, javaType, beanDescription, z);
            if (jsonSerializerFindSerializerByAnnotations != null) {
                return jsonSerializerFindSerializerByAnnotations;
            }
        } else {
            if (javaType.isReferenceType()) {
                jsonSerializerFindSerializerByAnnotations = findReferenceSerializer(serializerProvider, (ReferenceType) javaType, beanDescription, z);
            } else {
                Iterator<Serializers> it = customSerializers().iterator();
                while (it.hasNext() && (jsonSerializerFindSerializer = it.next().findSerializer(config, javaType, beanDescription)) == null) {
                }
                jsonSerializerFindSerializerByAnnotations = jsonSerializerFindSerializer;
            }
            if (jsonSerializerFindSerializerByAnnotations == null) {
                jsonSerializerFindSerializerByAnnotations = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
        }
        if (jsonSerializerFindSerializerByAnnotations == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByLookup(javaType, config, beanDescription, z)) == null && (jsonSerializerFindSerializerByAnnotations = findSerializerByPrimaryType(serializerProvider, javaType, beanDescription, z)) == null && (jsonSerializerFindSerializerByAnnotations = findBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, z)) == null) {
            jsonSerializerFindSerializerByAnnotations = serializerProvider.getUnknownTypeSerializer(beanDescription.getBeanClass());
        }
        if (jsonSerializerFindSerializerByAnnotations != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonSerializerFindSerializerByAnnotations = it2.next().modifySerializer(config, beanDescription, jsonSerializerFindSerializerByAnnotations);
            }
        }
        return jsonSerializerFindSerializerByAnnotations;
    }

    @Deprecated
    public JsonSerializer<Object> findBeanSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return findBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public JsonSerializer<Object> findBeanOrAddOnSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || ClassUtil.isEnumType(javaType.getRawClass())) {
            return constructBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, z);
        }
        return null;
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        if (typeResolverBuilderFindPropertyTypeResolver == null) {
            return createTypeSerializer(serializationConfig, javaType);
        }
        return typeResolverBuilderFindPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        if (typeResolverBuilderFindPropertyContentTypeResolver == null) {
            return createTypeSerializer(serializationConfig, contentType);
        }
        return typeResolverBuilderFindPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    @Deprecated
    public JsonSerializer<Object> constructBeanSerializer(SerializerProvider serializerProvider, BeanDescription beanDescription) throws JsonMappingException {
        return constructBeanOrAddOnSerializer(serializerProvider, beanDescription.getType(), beanDescription, serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public JsonSerializer<Object> constructBeanOrAddOnSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z) throws JsonMappingException {
        List<BeanPropertyWriter> listRemoveOverlappingTypeIds;
        if (beanDescription.getBeanClass() == Object.class) {
            return serializerProvider.getUnknownTypeSerializer(Object.class);
        }
        JsonSerializer<?> jsonSerializer_findUnsupportedTypeSerializer = _findUnsupportedTypeSerializer(serializerProvider, javaType, beanDescription);
        if (jsonSerializer_findUnsupportedTypeSerializer != null) {
            return jsonSerializer_findUnsupportedTypeSerializer;
        }
        if (_isUnserializableJacksonType(serializerProvider, javaType)) {
            return new ToEmptyObjectSerializer(javaType);
        }
        SerializationConfig config = serializerProvider.getConfig();
        BeanSerializerBuilder beanSerializerBuilderConstructBeanSerializerBuilder = constructBeanSerializerBuilder(beanDescription);
        beanSerializerBuilderConstructBeanSerializerBuilder.setConfig(config);
        List<BeanPropertyWriter> listFindBeanProperties = findBeanProperties(serializerProvider, beanDescription, beanSerializerBuilderConstructBeanSerializerBuilder);
        if (listFindBeanProperties == null) {
            listRemoveOverlappingTypeIds = new ArrayList<>();
        } else {
            listRemoveOverlappingTypeIds = removeOverlappingTypeIds(serializerProvider, beanDescription, beanSerializerBuilderConstructBeanSerializerBuilder, listFindBeanProperties);
        }
        serializerProvider.getAnnotationIntrospector().findAndAddVirtualProperties(config, beanDescription.getClassInfo(), listRemoveOverlappingTypeIds);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                listRemoveOverlappingTypeIds = it.next().changeProperties(config, beanDescription, listRemoveOverlappingTypeIds);
            }
        }
        List<BeanPropertyWriter> listFilterBeanProperties = filterBeanProperties(config, beanDescription, filterUnwantedJDKProperties(config, beanDescription, listRemoveOverlappingTypeIds));
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                listFilterBeanProperties = it2.next().orderProperties(config, beanDescription, listFilterBeanProperties);
            }
        }
        beanSerializerBuilderConstructBeanSerializerBuilder.setObjectIdWriter(constructObjectIdHandler(serializerProvider, beanDescription, listFilterBeanProperties));
        beanSerializerBuilderConstructBeanSerializerBuilder.setProperties(listFilterBeanProperties);
        beanSerializerBuilderConstructBeanSerializerBuilder.setFilterId(findFilterId(config, beanDescription));
        AnnotatedMember annotatedMemberFindAnyGetter = beanDescription.findAnyGetter();
        if (annotatedMemberFindAnyGetter != null) {
            JavaType type = annotatedMemberFindAnyGetter.getType();
            JavaType contentType = type.getContentType();
            TypeSerializer typeSerializerCreateTypeSerializer = createTypeSerializer(config, contentType);
            JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMemberFindAnyGetter);
            if (jsonSerializerFindSerializerFromAnnotation == null) {
                jsonSerializerFindSerializerFromAnnotation = MapSerializer.construct((Set<String>) null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), typeSerializerCreateTypeSerializer, (JsonSerializer<Object>) null, (JsonSerializer<Object>) null, (Object) null);
            }
            beanSerializerBuilderConstructBeanSerializerBuilder.setAnyGetter(new AnyGetterWriter(new BeanProperty.Std(PropertyName.construct(annotatedMemberFindAnyGetter.getName()), contentType, null, annotatedMemberFindAnyGetter, PropertyMetadata.STD_OPTIONAL), annotatedMemberFindAnyGetter, jsonSerializerFindSerializerFromAnnotation));
        }
        processViews(config, beanSerializerBuilderConstructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it3 = this._factoryConfig.serializerModifiers().iterator();
            while (it3.hasNext()) {
                beanSerializerBuilderConstructBeanSerializerBuilder = it3.next().updateBuilder(config, beanDescription, beanSerializerBuilderConstructBeanSerializerBuilder);
            }
        }
        try {
            JsonSerializer<?> jsonSerializerBuild = beanSerializerBuilderConstructBeanSerializerBuilder.build();
            if (jsonSerializerBuild == null) {
                if (javaType.isRecordType() && !NativeImageUtil.needsReflectionConfiguration(javaType.getRawClass())) {
                    return beanSerializerBuilderConstructBeanSerializerBuilder.createDummy();
                }
                jsonSerializerBuild = findSerializerByAddonType(config, javaType, beanDescription, z);
                if (jsonSerializerBuild == null && beanDescription.hasKnownClassAnnotations()) {
                    return beanSerializerBuilderConstructBeanSerializerBuilder.createDummy();
                }
            }
            return jsonSerializerBuild;
        } catch (RuntimeException e) {
            return (JsonSerializer) serializerProvider.reportBadTypeDefinition(beanDescription, "Failed to construct BeanSerializer for %s: (%s) %s", beanDescription.getType(), e.getClass().getName(), e.getMessage());
        }
    }

    public ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerProvider, BeanDescription beanDescription, List<BeanPropertyWriter> list) throws JsonMappingException {
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        if (generatorType == ObjectIdGenerators.PropertyGenerator.class) {
            String simpleName = objectIdInfo.getPropertyName().getSimpleName();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                BeanPropertyWriter beanPropertyWriter = list.get(i);
                if (simpleName.equals(beanPropertyWriter.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, beanPropertyWriter);
                    }
                    return ObjectIdWriter.construct(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(objectIdInfo, beanPropertyWriter), objectIdInfo.getAlwaysAsId());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", ClassUtil.getTypeDescription(beanDescription.getType()), ClassUtil.name(simpleName)));
        }
        return ObjectIdWriter.construct(serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0], objectIdInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo), objectIdInfo.getAlwaysAsId());
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.constructViewBased(beanPropertyWriter, clsArr);
    }

    public PropertyBuilder constructPropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return new PropertyBuilder(serializationConfig, beanDescription);
    }

    public BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beanDescription) {
        return new BeanSerializerBuilder(beanDescription);
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        return ClassUtil.canBeABeanType(cls) == null && !ClassUtil.isProxyType(cls);
    }

    public List<BeanPropertyWriter> findBeanProperties(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder) throws JsonMappingException {
        List<BeanPropertyDefinition> listFindProperties = beanDescription.findProperties();
        SerializationConfig config = serializerProvider.getConfig();
        removeIgnorableTypes(config, beanDescription, listFindProperties);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, beanDescription, listFindProperties);
        }
        if (listFindProperties.isEmpty()) {
            return null;
        }
        boolean zUsesStaticTyping = usesStaticTyping(config, beanDescription, null);
        PropertyBuilder propertyBuilderConstructPropertyBuilder = constructPropertyBuilder(config, beanDescription);
        ArrayList arrayList = new ArrayList(listFindProperties.size());
        for (BeanPropertyDefinition beanPropertyDefinition : listFindProperties) {
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (!beanPropertyDefinition.isTypeId()) {
                AnnotationIntrospector.ReferenceProperty referencePropertyFindReferenceType = beanPropertyDefinition.findReferenceType();
                if (referencePropertyFindReferenceType == null || !referencePropertyFindReferenceType.isBackReference()) {
                    if (accessor instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(serializerProvider, beanPropertyDefinition, propertyBuilderConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedMethod) accessor));
                    } else {
                        arrayList.add(_constructWriter(serializerProvider, beanPropertyDefinition, propertyBuilderConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedField) accessor));
                    }
                }
            } else if (accessor != null) {
                beanSerializerBuilder.setTypeId(accessor);
            }
        }
        return arrayList;
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Set<String> setFindIgnoredForSerialization = defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForSerialization() : null;
        JsonIncludeProperties.Value defaultPropertyInclusions = serializationConfig.getDefaultPropertyInclusions(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Set<String> included = defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null;
        if (included != null || (setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty())) {
            Iterator<BeanPropertyWriter> it = list.iterator();
            while (it.hasNext()) {
                if (IgnorePropertiesUtil.shouldIgnore(it.next().getName(), setFindIgnoredForSerialization, included)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public List<BeanPropertyWriter> filterUnwantedJDKProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyWriter> list) {
        if (beanDescription.getType().isTypeOrSubTypeOf(CharSequence.class) && list.size() == 1) {
            AnnotatedMember member = list.get(0).getMember();
            if ((member instanceof AnnotatedMethod) && "isEmpty".equals(member.getName()) && member.getDeclaringClass() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public void processViews(SerializationConfig serializationConfig, BeanSerializerBuilder beanSerializerBuilder) {
        List<BeanPropertyWriter> properties = beanSerializerBuilder.getProperties();
        boolean zIsEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = properties.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = properties.get(i2);
            Class<?>[] views = beanPropertyWriter.getViews();
            if (views != null && views.length != 0) {
                i++;
                beanPropertyWriterArr[i2] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (zIsEnabled) {
                beanPropertyWriterArr[i2] = beanPropertyWriter;
            }
        }
        if (zIsEnabled && i == 0) {
            return;
        }
        beanSerializerBuilder.setFilteredProperties(beanPropertyWriterArr);
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap map = new HashMap();
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (next.getAccessor() == null) {
                it.remove();
            } else {
                Class<?> rawPrimaryType = next.getRawPrimaryType();
                Boolean isIgnoredType = (Boolean) map.get(rawPrimaryType);
                if (isIgnoredType == null) {
                    isIgnoredType = serializationConfig.getConfigOverride(rawPrimaryType).getIsIgnoredType();
                    if (isIgnoredType == null && (isIgnoredType = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(rawPrimaryType).getClassInfo())) == null) {
                        isIgnoredType = Boolean.FALSE;
                    }
                    map.put(rawPrimaryType, isIgnoredType);
                }
                if (isIgnoredType.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (!next.couldDeserialize() && !next.isExplicitlyIncluded()) {
                it.remove();
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            TypeSerializer typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.getTypeInclusion() == JsonTypeInfo.EnumC6665As.EXTERNAL_PROPERTY) {
                PropertyName propertyNameConstruct = PropertyName.construct(typeSerializer.getPropertyName());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BeanPropertyWriter next = it.next();
                    if (next != beanPropertyWriter && next.wouldConflictWithName(propertyNameConstruct)) {
                        beanPropertyWriter.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeanPropertyWriter _constructWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, PropertyBuilder propertyBuilder, boolean z, AnnotatedMember annotatedMember) throws JsonMappingException {
        PropertyName fullName = beanPropertyDefinition.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, beanPropertyDefinition.getWrapperName(), annotatedMember, beanPropertyDefinition.getMetadata());
        JsonSerializer<Object> jsonSerializerFindSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMember);
        if (jsonSerializerFindSerializerFromAnnotation instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializerFindSerializerFromAnnotation).resolve(serializerProvider);
        }
        return propertyBuilder.buildWriter(serializerProvider, beanPropertyDefinition, type, serializerProvider.handlePrimaryContextualization(jsonSerializerFindSerializerFromAnnotation, std), findPropertyTypeSerializer(type, serializerProvider.getConfig(), annotatedMember), (type.isContainerType() || type.isReferenceType()) ? findPropertyContentTypeSerializer(type, serializerProvider.getConfig(), annotatedMember) : null, annotatedMember, z);
    }

    public JsonSerializer<?> _findUnsupportedTypeSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        String strCheckUnsupportedType = BeanUtil.checkUnsupportedType(javaType);
        if (strCheckUnsupportedType == null || serializerProvider.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeSerializer(javaType, strCheckUnsupportedType);
    }

    public boolean _isUnserializableJacksonType(SerializerProvider serializerProvider, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        return ObjectMapper.class.isAssignableFrom(rawClass) || ObjectReader.class.isAssignableFrom(rawClass) || ObjectWriter.class.isAssignableFrom(rawClass) || DatabindContext.class.isAssignableFrom(rawClass) || TokenStreamFactory.class.isAssignableFrom(rawClass) || JsonParser.class.isAssignableFrom(rawClass) || JsonGenerator.class.isAssignableFrom(rawClass);
    }
}
