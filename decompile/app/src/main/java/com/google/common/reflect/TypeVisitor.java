package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public abstract class TypeVisitor {
    public final Set<Type> visited = Sets.newHashSet();

    public void visitClass(Class<?> t) {
    }

    public void visitGenericArrayType(GenericArrayType t) {
    }

    public void visitParameterizedType(ParameterizedType t) {
    }

    public void visitTypeVariable(TypeVariable<?> t) {
    }

    public void visitWildcardType(WildcardType t) {
    }

    public final void visit(Type... types) {
        for (Type type : types) {
            if (type != null && this.visited.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        visitTypeVariable((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        visitWildcardType((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        visitParameterizedType((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        visitClass((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        visitGenericArrayType((GenericArrayType) type);
                    } else {
                        throw new AssertionError("Unknown type: " + type);
                    }
                } catch (Throwable th) {
                    this.visited.remove(type);
                    throw th;
                }
            }
        }
    }
}
