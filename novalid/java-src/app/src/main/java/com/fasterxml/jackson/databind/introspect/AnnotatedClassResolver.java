package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AnnotatedClassResolver {
    public final TypeBindings _bindings;
    public final Class<?> _class;
    public final boolean _collectAnnotations;
    public final MapperConfig<?> _config;
    public final AnnotationIntrospector _intr;
    public final ClassIntrospector.MixInResolver _mixInResolver;
    public final Class<?> _primaryMixin;
    public final JavaType _type;
    public static final Annotations NO_ANNOTATIONS = AnnotationCollector.emptyAnnotations();
    public static final Class<?> CLS_OBJECT = Object.class;
    public static final Class<?> CLS_ENUM = Enum.class;
    public static final Class<?> CLS_LIST = List.class;
    public static final Class<?> CLS_MAP = Map.class;

    public AnnotatedClassResolver(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        this._config = mapperConfig;
        this._type = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this._class = rawClass;
        this._mixInResolver = mixInResolver;
        this._bindings = javaType.getBindings();
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this._intr = annotationIntrospector;
        this._primaryMixin = mixInResolver != null ? mixInResolver.findMixInClassFor(rawClass) : null;
        this._collectAnnotations = (annotationIntrospector == null || (ClassUtil.isJDKClass(rawClass) && javaType.isContainerType())) ? false : true;
    }

    public AnnotatedClassResolver(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        this._config = mapperConfig;
        this._type = null;
        this._class = cls;
        this._mixInResolver = mixInResolver;
        this._bindings = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this._intr = null;
            this._primaryMixin = null;
        } else {
            this._intr = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this._primaryMixin = mixInResolver != null ? mixInResolver.findMixInClassFor(cls) : null;
        }
        this._collectAnnotations = this._intr != null;
    }

    public static AnnotatedClass resolve(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && skippableArray(mapperConfig, javaType.getRawClass())) {
            return createArrayType(mapperConfig, javaType.getRawClass());
        }
        return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).resolveFully();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls) {
        return resolveWithoutSuperTypes(mapperConfig, cls, mapperConfig);
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType() && skippableArray(mapperConfig, javaType.getRawClass())) {
            return createArrayType(mapperConfig, javaType.getRawClass());
        }
        return new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver).resolveWithoutSuperTypes();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        if (cls.isArray() && skippableArray(mapperConfig, cls)) {
            return createArrayType(mapperConfig, cls);
        }
        return new AnnotatedClassResolver(mapperConfig, cls, mixInResolver).resolveWithoutSuperTypes();
    }

    public static boolean skippableArray(MapperConfig<?> mapperConfig, Class<?> cls) {
        return mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null;
    }

    public static AnnotatedClass createPrimordial(Class<?> cls) {
        return new AnnotatedClass(cls);
    }

    public static AnnotatedClass createArrayType(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new AnnotatedClass(cls);
    }

    public AnnotatedClass resolveFully() {
        ArrayList arrayList = new ArrayList(8);
        if (!this._type.hasRawClass(Object.class)) {
            if (this._type.isInterface()) {
                _addSuperInterfaces(this._type, arrayList, false);
            } else {
                _addSuperTypes(this._type, arrayList, false);
            }
        }
        return new AnnotatedClass(this._type, this._class, arrayList, this._primaryMixin, resolveClassAnnotations(arrayList), this._bindings, this._intr, this._mixInResolver, this._config.getTypeFactory(), this._collectAnnotations);
    }

    public AnnotatedClass resolveWithoutSuperTypes() {
        List<JavaType> listEmptyList = Collections.emptyList();
        return new AnnotatedClass(null, this._class, listEmptyList, this._primaryMixin, resolveClassAnnotations(listEmptyList), this._bindings, this._intr, this._mixInResolver, this._config.getTypeFactory(), this._collectAnnotations);
    }

    public static void _addSuperTypes(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLS_OBJECT || rawClass == CLS_ENUM) {
            return;
        }
        if (z) {
            if (_contains(list, rawClass)) {
                return;
            } else {
                list.add(javaType);
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            _addSuperInterfaces(it.next(), list, true);
        }
        JavaType superClass = javaType.getSuperClass();
        if (superClass != null) {
            _addSuperTypes(superClass, list, true);
        }
    }

    public static void _addSuperInterfaces(JavaType javaType, List<JavaType> list, boolean z) {
        Class<?> rawClass = javaType.getRawClass();
        if (z) {
            if (_contains(list, rawClass)) {
                return;
            }
            list.add(javaType);
            if (rawClass == CLS_LIST || rawClass == CLS_MAP) {
                return;
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            _addSuperInterfaces(it.next(), list, true);
        }
    }

    public static boolean _contains(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getRawClass() == cls) {
                return true;
            }
        }
        return false;
    }

    public final Annotations resolveClassAnnotations(List<JavaType> list) {
        if (this._intr == null) {
            return NO_ANNOTATIONS;
        }
        ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
        boolean z = mixInResolver != null && (!(mixInResolver instanceof SimpleMixInResolver) || ((SimpleMixInResolver) mixInResolver).hasMixIns());
        if (!z && !this._collectAnnotations) {
            return NO_ANNOTATIONS;
        }
        AnnotationCollector annotationCollectorEmptyCollector = AnnotationCollector.emptyCollector();
        Class<?> cls = this._primaryMixin;
        if (cls != null) {
            annotationCollectorEmptyCollector = _addClassMixIns(annotationCollectorEmptyCollector, this._class, cls);
        }
        if (this._collectAnnotations) {
            annotationCollectorEmptyCollector = _addAnnotationsIfNotPresent(annotationCollectorEmptyCollector, ClassUtil.findClassAnnotations(this._class));
        }
        for (JavaType javaType : list) {
            if (z) {
                Class<?> rawClass = javaType.getRawClass();
                annotationCollectorEmptyCollector = _addClassMixIns(annotationCollectorEmptyCollector, rawClass, this._mixInResolver.findMixInClassFor(rawClass));
            }
            if (this._collectAnnotations) {
                annotationCollectorEmptyCollector = _addAnnotationsIfNotPresent(annotationCollectorEmptyCollector, ClassUtil.findClassAnnotations(javaType.getRawClass()));
            }
        }
        if (z) {
            annotationCollectorEmptyCollector = _addClassMixIns(annotationCollectorEmptyCollector, Object.class, this._mixInResolver.findMixInClassFor(Object.class));
        }
        return annotationCollectorEmptyCollector.asAnnotations();
    }

    public final AnnotationCollector _addClassMixIns(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(cls2));
            Iterator<Class<?>> it = ClassUtil.findSuperClasses(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = _addAnnotationsIfNotPresent(annotationCollector, ClassUtil.findClassAnnotations(it.next()));
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector _addAnnotationsIfNotPresent(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this._intr.isAnnotationBundle(annotation)) {
                        annotationCollector = _addFromBundleIfNotPresent(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector _addFromBundleIfNotPresent(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = _addFromBundleIfNotPresent(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
