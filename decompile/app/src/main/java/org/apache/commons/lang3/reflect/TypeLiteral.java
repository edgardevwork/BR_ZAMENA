package org.apache.commons.lang3.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import org.apache.commons.lang3.Validate;

/* loaded from: classes7.dex */
public abstract class TypeLiteral<T> implements Typed<T> {

    /* renamed from: T */
    public static final TypeVariable<Class<TypeLiteral>> f9906T = TypeLiteral.class.getTypeParameters()[0];
    public final String toString;
    public final Type value;

    public TypeLiteral() {
        Map<TypeVariable<?>, Type> typeArguments = TypeUtils.getTypeArguments(getClass(), TypeLiteral.class);
        TypeVariable<Class<TypeLiteral>> typeVariable = f9906T;
        Type type = (Type) Validate.notNull(typeArguments.get(typeVariable), "%s does not assign type parameter %s", getClass(), TypeUtils.toLongString(typeVariable));
        this.value = type;
        this.toString = String.format("%s<%s>", TypeLiteral.class.getSimpleName(), TypeUtils.toString(type));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TypeLiteral) {
            return TypeUtils.equals(this.value, ((TypeLiteral) obj).value);
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() | 592;
    }

    public String toString() {
        return this.toString;
    }

    @Override // org.apache.commons.lang3.reflect.Typed
    public Type getType() {
        return this.value;
    }
}
