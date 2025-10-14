package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    public static final Creators NO_CREATORS = new Creators(null, Collections.emptyList(), Collections.emptyList());
    public final AnnotationIntrospector _annotationIntrospector;
    public final TypeBindings _bindings;
    public final Class<?> _class;
    public final Annotations _classAnnotations;
    public final boolean _collectAnnotations;
    public Creators _creators;
    public List<AnnotatedField> _fields;
    public AnnotatedMethodMap _memberMethods;
    public final ClassIntrospector.MixInResolver _mixInResolver;
    public transient Boolean _nonStaticInnerClass;
    public final Class<?> _primaryMixIn;
    public final List<JavaType> _superTypes;
    public final JavaType _type;
    public final TypeFactory _typeFactory;

    public AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, boolean z) {
        this._type = javaType;
        this._class = cls;
        this._superTypes = list;
        this._primaryMixIn = cls2;
        this._classAnnotations = annotations;
        this._bindings = typeBindings;
        this._annotationIntrospector = annotationIntrospector;
        this._mixInResolver = mixInResolver;
        this._typeFactory = typeFactory;
        this._collectAnnotations = z;
    }

    @Deprecated
    public AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory) {
        this(javaType, cls, list, cls2, annotations, typeBindings, annotationIntrospector, mixInResolver, typeFactory, true);
    }

    public AnnotatedClass(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._superTypes = Collections.emptyList();
        this._primaryMixIn = null;
        this._classAnnotations = AnnotationCollector.emptyAnnotations();
        this._bindings = TypeBindings.emptyBindings();
        this._annotationIntrospector = null;
        this._mixInResolver = null;
        this._typeFactory = null;
        this._collectAnnotations = false;
    }

    @Deprecated
    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig) {
        return construct(javaType, mapperConfig, mapperConfig);
    }

    @Deprecated
    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolve(mapperConfig, javaType, mixInResolver);
    }

    @Deprecated
    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig) {
        return constructWithoutSuperTypes(cls, mapperConfig, mapperConfig);
    }

    @Deprecated
    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolveWithoutSuperTypes(mapperConfig, cls, mixInResolver);
    }

    @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
    public JavaType resolveType(Type type) {
        return this._typeFactory.resolveMemberType(type, this._bindings);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getAnnotated() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this._class.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._classAnnotations.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasAnnotation(Class<?> cls) {
        return this._classAnnotations.has(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this._classAnnotations.hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Iterable<Annotation> annotations() {
        Annotations annotations = this._classAnnotations;
        if (annotations instanceof AnnotationMap) {
            return ((AnnotationMap) annotations).annotations();
        }
        if ((annotations instanceof AnnotationCollector.OneAnnotation) || (annotations instanceof AnnotationCollector.TwoAnnotations)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.emptyList();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._type;
    }

    public Annotations getAnnotations() {
        return this._classAnnotations;
    }

    public boolean hasAnnotations() {
        return this._classAnnotations.size() > 0;
    }

    public AnnotatedConstructor getDefaultConstructor() {
        return _creators().defaultConstructor;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return _creators().constructors;
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        return _creators().creatorMethods;
    }

    @Deprecated
    public List<AnnotatedMethod> getStaticMethods() {
        return getFactoryMethods();
    }

    public Iterable<AnnotatedMethod> memberMethods() {
        return _methods();
    }

    public int getMemberMethodCount() {
        return _methods().size();
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return _methods().find(str, clsArr);
    }

    public int getFieldCount() {
        return _fields().size();
    }

    public Iterable<AnnotatedField> fields() {
        return _fields();
    }

    public boolean isNonStaticInnerClass() {
        Boolean boolValueOf = this._nonStaticInnerClass;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(this._class));
            this._nonStaticInnerClass = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final List<AnnotatedField> _fields() {
        List<AnnotatedField> listCollectFields = this._fields;
        if (listCollectFields == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                listCollectFields = Collections.emptyList();
            } else {
                listCollectFields = AnnotatedFieldCollector.collectFields(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType, this._collectAnnotations);
            }
            this._fields = listCollectFields;
        }
        return listCollectFields;
    }

    public final AnnotatedMethodMap _methods() {
        AnnotatedMethodMap annotatedMethodMapCollectMethods = this._memberMethods;
        if (annotatedMethodMapCollectMethods == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                annotatedMethodMapCollectMethods = new AnnotatedMethodMap();
            } else {
                annotatedMethodMapCollectMethods = AnnotatedMethodCollector.collectMethods(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType, this._superTypes, this._primaryMixIn, this._collectAnnotations);
            }
            this._memberMethods = annotatedMethodMapCollectMethods;
        }
        return annotatedMethodMapCollectMethods;
    }

    public final Creators _creators() {
        Creators creatorsCollectCreators = this._creators;
        if (creatorsCollectCreators == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                creatorsCollectCreators = NO_CREATORS;
            } else {
                creatorsCollectCreators = AnnotatedCreatorCollector.collectCreators(this._annotationIntrospector, this._typeFactory, this, javaType, this._primaryMixIn, this._collectAnnotations);
            }
            this._creators = creatorsCollectCreators;
        }
        return creatorsCollectCreators;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[AnnotedClass " + this._class.getName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._class.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedClass.class) && ((AnnotatedClass) obj)._class == this._class;
    }

    /* loaded from: classes3.dex */
    public static final class Creators {
        public final List<AnnotatedConstructor> constructors;
        public final List<AnnotatedMethod> creatorMethods;
        public final AnnotatedConstructor defaultConstructor;

        public Creators(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.defaultConstructor = annotatedConstructor;
            this.constructors = list;
            this.creatorMethods = list2;
        }
    }
}
