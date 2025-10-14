package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    public static final long serialVersionUID = 1;
    public final Constructor<?> _constructor;
    public Serialization _serialization;

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this._constructor = constructor;
    }

    public AnnotatedConstructor(Serialization serialization) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = serialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, annotationMap, this._paramAnnotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this._constructor.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._constructor.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return this._constructor.getParameterCount();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._constructor.newInstance(null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        int parameterCount = this._constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", ClassUtil.nameOf(this._constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : "s", this._annotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, AnnotatedConstructor.class)) {
            return false;
        }
        Constructor<?> constructor = ((AnnotatedConstructor) obj)._constructor;
        if (constructor == null) {
            return this._constructor == null;
        }
        return constructor.equals(this._constructor);
    }

    public Object writeReplace() {
        return new AnnotatedConstructor(new Serialization(this._constructor));
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(serialization.args);
            if (!declaredConstructor.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this._serialization.args.length + " args from Class '" + cls.getName());
        }
    }

    /* loaded from: classes3.dex */
    public static final class Serialization implements Serializable {
        public static final long serialVersionUID = 1;
        public Class<?>[] args;
        public Class<?> clazz;

        public Serialization(Constructor<?> constructor) {
            this.clazz = constructor.getDeclaringClass();
            this.args = constructor.getParameterTypes();
        }
    }
}
