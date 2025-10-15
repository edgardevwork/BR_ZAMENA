package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class AnnotatedFieldCollector extends CollectorBase {
    public final boolean _collectAnnotations;
    public final ClassIntrospector.MixInResolver _mixInResolver;
    public final TypeFactory _typeFactory;

    public AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this._typeFactory = typeFactory;
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
        this._collectAnnotations = z;
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, boolean z) {
        return new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver, z).collect(typeResolutionContext, javaType);
    }

    public List<AnnotatedField> collect(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Map<String, FieldBuilder> map_findFields = _findFields(typeResolutionContext, javaType, null);
        if (map_findFields == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map_findFields.size());
        Iterator<FieldBuilder> it = map_findFields.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        return arrayList;
    }

    public final Map<String, FieldBuilder> _findFields(TypeResolutionContext typeResolutionContext, JavaType javaType, Map<String, FieldBuilder> map) {
        ClassIntrospector.MixInResolver mixInResolver;
        Class<?> clsFindMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, FieldBuilder> map_findFields = _findFields(new TypeResolutionContext.Basic(this._typeFactory, superClass.getBindings()), superClass, map);
        for (Field field : rawClass.getDeclaredFields()) {
            if (_isIncludableField(field)) {
                if (map_findFields == null) {
                    map_findFields = new LinkedHashMap<>();
                }
                FieldBuilder fieldBuilder = new FieldBuilder(typeResolutionContext, field);
                if (this._collectAnnotations) {
                    fieldBuilder.annotations = collectAnnotations(fieldBuilder.annotations, field.getDeclaredAnnotations());
                }
                map_findFields.put(field.getName(), fieldBuilder);
            }
        }
        if (map_findFields != null && (mixInResolver = this._mixInResolver) != null && (clsFindMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) != null) {
            _addFieldMixIns(clsFindMixInClassFor, rawClass, map_findFields);
        }
        return map_findFields;
    }

    public final void _addFieldMixIns(Class<?> cls, Class<?> cls2, Map<String, FieldBuilder> map) {
        FieldBuilder fieldBuilder;
        Iterator<Class<?>> it = ClassUtil.findSuperClasses(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : it.next().getDeclaredFields()) {
                if (_isIncludableField(field) && (fieldBuilder = map.get(field.getName())) != null) {
                    fieldBuilder.annotations = collectAnnotations(fieldBuilder.annotations, field.getDeclaredAnnotations());
                }
            }
        }
    }

    public final boolean _isIncludableField(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    /* loaded from: classes3.dex */
    public static final class FieldBuilder {
        public AnnotationCollector annotations = AnnotationCollector.emptyCollector();
        public final Field field;
        public final TypeResolutionContext typeContext;

        public FieldBuilder(TypeResolutionContext typeResolutionContext, Field field) {
            this.typeContext = typeResolutionContext;
            this.field = field;
        }

        public AnnotatedField build() {
            return new AnnotatedField(this.typeContext, this.field, this.annotations.asAnnotationMap());
        }
    }
}
