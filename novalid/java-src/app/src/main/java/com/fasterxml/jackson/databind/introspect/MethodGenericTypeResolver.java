package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MethodGenericTypeResolver {
    public static TypeResolutionContext narrowMethodTypeParameters(Method method, JavaType javaType, TypeFactory typeFactory, TypeResolutionContext typeResolutionContext) {
        TypeBindings typeBindingsBindMethodTypeParameters = bindMethodTypeParameters(method, javaType, typeResolutionContext);
        return typeBindingsBindMethodTypeParameters == null ? typeResolutionContext : new TypeResolutionContext.Basic(typeFactory, typeBindingsBindMethodTypeParameters);
    }

    public static TypeBindings bindMethodTypeParameters(Method method, JavaType javaType, TypeResolutionContext typeResolutionContext) {
        JavaType boundType;
        TypeVariable<?> typeVariableFindByName;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || javaType.getBindings().isEmpty()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(javaType.getRawClass(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i = 0; i < actualTypeArguments.length; i++) {
            TypeVariable<?> typeVariableMaybeGetTypeVariable = maybeGetTypeVariable(actualTypeArguments[i]);
            if (typeVariableMaybeGetTypeVariable != null) {
                String name = typeVariableMaybeGetTypeVariable.getName();
                if (name == null || (boundType = javaType.getBindings().getBoundType(i)) == null || (typeVariableFindByName = findByName(typeParameters, name)) == null) {
                    return null;
                }
                if (pessimisticallyValidateBounds(typeResolutionContext, boundType, typeVariableFindByName.getBounds())) {
                    int iIndexOf = arrayList.indexOf(name);
                    if (iIndexOf != -1) {
                        JavaType javaType2 = (JavaType) arrayList2.get(iIndexOf);
                        if (boundType.equals(javaType2)) {
                            continue;
                        } else {
                            boolean zIsTypeOrSubTypeOf = javaType2.isTypeOrSubTypeOf(boundType.getRawClass());
                            boolean zIsTypeOrSubTypeOf2 = boundType.isTypeOrSubTypeOf(javaType2.getRawClass());
                            if (!zIsTypeOrSubTypeOf && !zIsTypeOrSubTypeOf2) {
                                return null;
                            }
                            if ((zIsTypeOrSubTypeOf ^ zIsTypeOrSubTypeOf2) && zIsTypeOrSubTypeOf2) {
                                arrayList2.set(iIndexOf, boundType);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(boundType);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TypeBindings.create(arrayList, arrayList2);
    }

    public static TypeVariable<?> maybeGetTypeVariable(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return maybeGetTypeVariable(upperBounds[0]);
            }
        }
        return null;
    }

    public static ParameterizedType maybeGetParameterizedType(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return maybeGetParameterizedType(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean pessimisticallyValidateBounds(TypeResolutionContext typeResolutionContext, JavaType javaType, Type[] typeArr) {
        for (Type type : typeArr) {
            if (!pessimisticallyValidateBound(typeResolutionContext, javaType, type)) {
                return false;
            }
        }
        return true;
    }

    public static boolean pessimisticallyValidateBound(TypeResolutionContext typeResolutionContext, JavaType javaType, Type type) {
        if (!javaType.isTypeOrSubTypeOf(typeResolutionContext.resolveType(type).getRawClass())) {
            return false;
        }
        ParameterizedType parameterizedTypeMaybeGetParameterizedType = maybeGetParameterizedType(type);
        if (parameterizedTypeMaybeGetParameterizedType == null || !Objects.equals(javaType.getRawClass(), parameterizedTypeMaybeGetParameterizedType.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = parameterizedTypeMaybeGetParameterizedType.getActualTypeArguments();
        TypeBindings bindings = javaType.getBindings();
        if (bindings.size() != actualTypeArguments.length) {
            return false;
        }
        for (int i = 0; i < bindings.size(); i++) {
            if (!pessimisticallyValidateBound(typeResolutionContext, bindings.getBoundType(i), actualTypeArguments[i])) {
                return false;
            }
        }
        return true;
    }

    public static TypeVariable<?> findByName(TypeVariable<?>[] typeVariableArr, String str) {
        if (typeVariableArr != null && str != null) {
            for (TypeVariable<?> typeVariable : typeVariableArr) {
                if (str.equals(typeVariable.getName())) {
                    return typeVariable;
                }
            }
        }
        return null;
    }
}
