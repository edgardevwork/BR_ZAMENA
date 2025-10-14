package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class BeanDeserializerBuilder {
    public SettableAnyProperty _anySetter;
    public HashMap<String, SettableBeanProperty> _backRefProperties;
    public final BeanDescription _beanDesc;
    public AnnotatedMethod _buildMethod;
    public JsonPOJOBuilder.Value _builderConfig;
    public final DeserializationConfig _config;
    public final DeserializationContext _context;
    public HashSet<String> _ignorableProps;
    public boolean _ignoreAllUnknown;
    public HashSet<String> _includableProps;
    public List<ValueInjector> _injectables;
    public ObjectIdReader _objectIdReader;
    public final Map<String, SettableBeanProperty> _properties;
    public ValueInstantiator _valueInstantiator;

    public BeanDeserializerBuilder(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        this._properties = new LinkedHashMap();
        this._beanDesc = beanDescription;
        this._context = deserializationContext;
        this._config = deserializationContext.getConfig();
    }

    public BeanDeserializerBuilder(BeanDeserializerBuilder beanDeserializerBuilder) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this._properties = linkedHashMap;
        this._beanDesc = beanDeserializerBuilder._beanDesc;
        this._context = beanDeserializerBuilder._context;
        this._config = beanDeserializerBuilder._config;
        linkedHashMap.putAll(beanDeserializerBuilder._properties);
        this._injectables = _copy(beanDeserializerBuilder._injectables);
        this._backRefProperties = _copy(beanDeserializerBuilder._backRefProperties);
        this._ignorableProps = beanDeserializerBuilder._ignorableProps;
        this._includableProps = beanDeserializerBuilder._includableProps;
        this._valueInstantiator = beanDeserializerBuilder._valueInstantiator;
        this._objectIdReader = beanDeserializerBuilder._objectIdReader;
        this._anySetter = beanDeserializerBuilder._anySetter;
        this._ignoreAllUnknown = beanDeserializerBuilder._ignoreAllUnknown;
        this._buildMethod = beanDeserializerBuilder._buildMethod;
        this._builderConfig = beanDeserializerBuilder._builderConfig;
    }

    public static HashMap<String, SettableBeanProperty> _copy(HashMap<String, SettableBeanProperty> map) {
        if (map == null) {
            return null;
        }
        return new HashMap<>(map);
    }

    public static <T> List<T> _copy(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public void addOrReplaceProperty(SettableBeanProperty settableBeanProperty, boolean z) {
        this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanPropertyPut = this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanPropertyPut == null || settableBeanPropertyPut == settableBeanProperty) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + settableBeanProperty.getName() + "' for " + this._beanDesc.getType());
    }

    public void addBackReferenceProperty(String str, SettableBeanProperty settableBeanProperty) throws DatabindException {
        if (this._backRefProperties == null) {
            this._backRefProperties = new HashMap<>(4);
        }
        if (this._config.canOverrideAccessModifiers()) {
            try {
                settableBeanProperty.fixAccess(this._config);
            } catch (IllegalArgumentException e) {
                _handleBadAccess(e);
            }
        }
        this._backRefProperties.put(str, settableBeanProperty);
    }

    public void addInjectable(PropertyName propertyName, JavaType javaType, Annotations annotations, AnnotatedMember annotatedMember, Object obj) throws SecurityException, DatabindException {
        if (this._injectables == null) {
            this._injectables = new ArrayList();
        }
        if (this._config.canOverrideAccessModifiers()) {
            try {
                annotatedMember.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e) {
                _handleBadAccess(e);
            }
        }
        this._injectables.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    public void addIgnorable(String str) {
        if (this._ignorableProps == null) {
            this._ignorableProps = new HashSet<>();
        }
        this._ignorableProps.add(str);
    }

    public void addIncludable(String str) {
        if (this._includableProps == null) {
            this._includableProps = new HashSet<>();
        }
        this._includableProps.add(str);
    }

    public void addCreatorProperty(SettableBeanProperty settableBeanProperty) {
        addProperty(settableBeanProperty);
    }

    public void setAnySetter(SettableAnyProperty settableAnyProperty) {
        if (this._anySetter != null && settableAnyProperty != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this._anySetter = settableAnyProperty;
    }

    public void setIgnoreUnknownProperties(boolean z) {
        this._ignoreAllUnknown = z;
    }

    public void setValueInstantiator(ValueInstantiator valueInstantiator) {
        this._valueInstantiator = valueInstantiator;
    }

    public void setObjectIdReader(ObjectIdReader objectIdReader) {
        this._objectIdReader = objectIdReader;
    }

    public void setPOJOBuilder(AnnotatedMethod annotatedMethod, JsonPOJOBuilder.Value value) {
        this._buildMethod = annotatedMethod;
        this._builderConfig = value;
    }

    public Iterator<SettableBeanProperty> getProperties() {
        return this._properties.values().iterator();
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return this._properties.get(propertyName.getSimpleName());
    }

    public boolean hasProperty(PropertyName propertyName) {
        return findProperty(propertyName) != null;
    }

    public SettableBeanProperty removeProperty(PropertyName propertyName) {
        return this._properties.remove(propertyName.getSimpleName());
    }

    public SettableAnyProperty getAnySetter() {
        return this._anySetter;
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public List<ValueInjector> getInjectables() {
        return this._injectables;
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public AnnotatedMethod getBuildMethod() {
        return this._buildMethod;
    }

    public JsonPOJOBuilder.Value getBuilderConfig() {
        return this._builderConfig;
    }

    public boolean hasIgnorable(String str) {
        return IgnorePropertiesUtil.shouldIgnore(str, this._ignorableProps, this._includableProps);
    }

    public JsonDeserializer<?> build() throws SecurityException, DatabindException {
        boolean z;
        Collection<SettableBeanProperty> collectionValues = this._properties.values();
        _fixAccess(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(this._config, collectionValues, _collectAliases(collectionValues), _findCaseInsensitivity());
        beanPropertyMapConstruct.assignIndexes();
        boolean z2 = !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (z2) {
            z = z2;
        } else {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    z = true;
                    break;
                }
            }
            z = z2;
        }
        if (this._objectIdReader != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this._objectIdReader, PropertyMetadata.STD_REQUIRED));
        }
        return new BeanDeserializer(this, this._beanDesc, beanPropertyMapConstruct, this._backRefProperties, this._ignorableProps, this._ignoreAllUnknown, this._includableProps, z);
    }

    public AbstractDeserializer buildAbstract() {
        return new AbstractDeserializer(this, this._beanDesc, this._backRefProperties, this._properties);
    }

    public JsonDeserializer<?> buildBuilderBased(JavaType javaType, String str) throws SecurityException, DatabindException {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod == null) {
            if (!str.isEmpty()) {
                this._context.reportBadDefinition(this._beanDesc.getType(), String.format("Builder class %s does not have build method (name: '%s')", ClassUtil.getTypeDescription(this._beanDesc.getType()), str));
            }
        } else {
            Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            Class<?> rawClass = javaType.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                this._context.reportBadDefinition(this._beanDesc.getType(), String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", this._buildMethod.getFullName(), ClassUtil.getClassDescription(rawReturnType), ClassUtil.getTypeDescription(javaType)));
            }
        }
        Collection<SettableBeanProperty> collectionValues = this._properties.values();
        _fixAccess(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(this._config, collectionValues, _collectAliases(collectionValues), _findCaseInsensitivity());
        beanPropertyMapConstruct.assignIndexes();
        boolean z = true;
        boolean z2 = !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (z2) {
            z = z2;
        } else {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    break;
                }
            }
            z = z2;
        }
        if (this._objectIdReader != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this._objectIdReader, PropertyMetadata.STD_REQUIRED));
        }
        return createBuilderBasedDeserializer(javaType, beanPropertyMapConstruct, z);
    }

    public JsonDeserializer<?> createBuilderBasedDeserializer(JavaType javaType, BeanPropertyMap beanPropertyMap, boolean z) {
        return new BuilderBasedDeserializer(this, this._beanDesc, javaType, beanPropertyMap, this._backRefProperties, this._ignorableProps, this._ignoreAllUnknown, this._includableProps, z);
    }

    public void _fixAccess(Collection<SettableBeanProperty> collection) throws SecurityException, DatabindException {
        if (this._config.canOverrideAccessModifiers()) {
            Iterator<SettableBeanProperty> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().fixAccess(this._config);
                } catch (IllegalArgumentException e) {
                    _handleBadAccess(e);
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.fixAccess(this._config);
            } catch (IllegalArgumentException e2) {
                _handleBadAccess(e2);
            }
        }
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod != null) {
            try {
                annotatedMethod.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e3) {
                _handleBadAccess(e3);
            }
        }
    }

    public Map<String, List<PropertyName>> _collectAliases(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this._config.getAnnotationIntrospector();
        HashMap map = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List<PropertyName> listFindPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (listFindPropertyAliases != null && !listFindPropertyAliases.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(settableBeanProperty.getName(), listFindPropertyAliases);
                }
            }
        }
        return map == null ? Collections.emptyMap() : map;
    }

    public boolean _findCaseInsensitivity() {
        Boolean feature = this._beanDesc.findExpectedFormat(null).getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (feature == null) {
            return this._config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        }
        return feature.booleanValue();
    }

    public void _handleBadAccess(IllegalArgumentException illegalArgumentException) throws DatabindException {
        try {
            this._context.reportBadTypeDefinition(this._beanDesc, illegalArgumentException.getMessage(), new Object[0]);
        } catch (DatabindException e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }
}
