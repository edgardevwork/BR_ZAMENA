package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class TypeResolver {
    public final TypeTable typeTable;

    public /* synthetic */ TypeResolver(TypeTable typeTable, C75201 c75201) {
        this(typeTable);
    }

    public TypeResolver() {
        this.typeTable = new TypeTable();
    }

    public TypeResolver(TypeTable typeTable) {
        this.typeTable = typeTable;
    }

    public static TypeResolver covariantly(Type contextType) {
        return new TypeResolver().where(TypeMappingIntrospector.getTypeMappings(contextType));
    }

    public static TypeResolver invariantly(Type contextType) {
        return new TypeResolver().where(TypeMappingIntrospector.getTypeMappings(WildcardCapturer.INSTANCE.capture(contextType)));
    }

    public TypeResolver where(Type formal, Type actual) {
        HashMap mapNewHashMap = Maps.newHashMap();
        populateTypeMappings(mapNewHashMap, (Type) Preconditions.checkNotNull(formal), (Type) Preconditions.checkNotNull(actual));
        return where(mapNewHashMap);
    }

    public TypeResolver where(Map<TypeVariableKey, ? extends Type> mappings) {
        return new TypeResolver(this.typeTable.where(mappings));
    }

    public static void populateTypeMappings(Map<TypeVariableKey, Type> mappings, Type from, Type to) {
        if (from.equals(to)) {
            return;
        }
        new TypeVisitor() { // from class: com.google.common.reflect.TypeResolver.1
            public final /* synthetic */ Map val$mappings;
            public final /* synthetic */ Type val$to;

            public C75201(Map mappings2, Type to2) {
                val$mappings = mappings2;
                val$to = to2;
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitTypeVariable(TypeVariable<?> typeVariable) {
                val$mappings.put(new TypeVariableKey(typeVariable), val$to);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitWildcardType(WildcardType fromWildcardType) {
                Type type = val$to;
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] upperBounds = fromWildcardType.getUpperBounds();
                    Type[] upperBounds2 = wildcardType.getUpperBounds();
                    Type[] lowerBounds = fromWildcardType.getLowerBounds();
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, val$to);
                    for (int i = 0; i < upperBounds.length; i++) {
                        TypeResolver.populateTypeMappings(val$mappings, upperBounds[i], upperBounds2[i]);
                    }
                    for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                        TypeResolver.populateTypeMappings(val$mappings, lowerBounds[i2], lowerBounds2[i2]);
                    }
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitParameterizedType(ParameterizedType fromParameterizedType) {
                Type type = val$to;
                if (type instanceof WildcardType) {
                    return;
                }
                ParameterizedType parameterizedType = (ParameterizedType) TypeResolver.expectArgument(ParameterizedType.class, type);
                if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                    TypeResolver.populateTypeMappings(val$mappings, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
                }
                Preconditions.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, val$to);
                Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    TypeResolver.populateTypeMappings(val$mappings, actualTypeArguments[i], actualTypeArguments2[i]);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitGenericArrayType(GenericArrayType fromArrayType) {
                Type type = val$to;
                if (type instanceof WildcardType) {
                    return;
                }
                Type componentType = Types.getComponentType(type);
                Preconditions.checkArgument(componentType != null, "%s is not an array type.", val$to);
                TypeResolver.populateTypeMappings(val$mappings, fromArrayType.getGenericComponentType(), componentType);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitClass(Class<?> fromClass) {
                if (val$to instanceof WildcardType) {
                    return;
                }
                throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + val$to);
            }
        }.visit(from);
    }

    /* renamed from: com.google.common.reflect.TypeResolver$1 */
    /* loaded from: classes6.dex */
    public class C75201 extends TypeVisitor {
        public final /* synthetic */ Map val$mappings;
        public final /* synthetic */ Type val$to;

        public C75201(Map mappings2, Type to2) {
            val$mappings = mappings2;
            val$to = to2;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> typeVariable) {
            val$mappings.put(new TypeVariableKey(typeVariable), val$to);
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType fromWildcardType) {
            Type type = val$to;
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] upperBounds = fromWildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType.getUpperBounds();
                Type[] lowerBounds = fromWildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType.getLowerBounds();
                Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, val$to);
                for (int i = 0; i < upperBounds.length; i++) {
                    TypeResolver.populateTypeMappings(val$mappings, upperBounds[i], upperBounds2[i]);
                }
                for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                    TypeResolver.populateTypeMappings(val$mappings, lowerBounds[i2], lowerBounds2[i2]);
                }
            }
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitParameterizedType(ParameterizedType fromParameterizedType) {
            Type type = val$to;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType = (ParameterizedType) TypeResolver.expectArgument(ParameterizedType.class, type);
            if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                TypeResolver.populateTypeMappings(val$mappings, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
            }
            Preconditions.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, val$to);
            Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
            Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                TypeResolver.populateTypeMappings(val$mappings, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitGenericArrayType(GenericArrayType fromArrayType) {
            Type type = val$to;
            if (type instanceof WildcardType) {
                return;
            }
            Type componentType = Types.getComponentType(type);
            Preconditions.checkArgument(componentType != null, "%s is not an array type.", val$to);
            TypeResolver.populateTypeMappings(val$mappings, fromArrayType.getGenericComponentType(), componentType);
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> fromClass) {
            if (val$to instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + val$to);
        }
    }

    public Type resolveType(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof TypeVariable) {
            return this.typeTable.resolve((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return resolveParameterizedType((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return resolveGenericArrayType((GenericArrayType) type);
        }
        return type instanceof WildcardType ? resolveWildcardType((WildcardType) type) : type;
    }

    public Type[] resolveTypesInPlace(Type[] types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = resolveType(types[i]);
        }
        return types;
    }

    public final Type[] resolveTypes(Type[] types) {
        Type[] typeArr = new Type[types.length];
        for (int i = 0; i < types.length; i++) {
            typeArr[i] = resolveType(types[i]);
        }
        return typeArr;
    }

    public final WildcardType resolveWildcardType(WildcardType type) {
        return new Types.WildcardTypeImpl(resolveTypes(type.getLowerBounds()), resolveTypes(type.getUpperBounds()));
    }

    public final Type resolveGenericArrayType(GenericArrayType type) {
        return Types.newArrayType(resolveType(type.getGenericComponentType()));
    }

    public final ParameterizedType resolveParameterizedType(ParameterizedType type) {
        Type ownerType = type.getOwnerType();
        return Types.newParameterizedTypeWithOwner(ownerType == null ? null : resolveType(ownerType), (Class) resolveType(type.getRawType()), resolveTypes(type.getActualTypeArguments()));
    }

    public static <T> T expectArgument(Class<T> type, Object arg) {
        try {
            return type.cast(arg);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(arg + " is not a " + type.getSimpleName());
        }
    }

    public static class TypeTable {
        public final ImmutableMap<TypeVariableKey, Type> map;

        public TypeTable() {
            this.map = ImmutableMap.m1190of();
        }

        public TypeTable(ImmutableMap<TypeVariableKey, Type> map) {
            this.map = map;
        }

        public final TypeTable where(Map<TypeVariableKey, ? extends Type> mappings) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.putAll(this.map);
            for (Map.Entry<TypeVariableKey, ? extends Type> entry : mappings.entrySet()) {
                TypeVariableKey key = entry.getKey();
                Type value = entry.getValue();
                Preconditions.checkArgument(!key.equalsType(value), "Type variable %s bound to itself", key);
                builder.put(key, value);
            }
            return new TypeTable(builder.buildOrThrow());
        }

        /* renamed from: com.google.common.reflect.TypeResolver$TypeTable$1 */
        /* loaded from: classes6.dex */
        public class C75211 extends TypeTable {
            public final /* synthetic */ TypeTable val$unguarded;
            public final /* synthetic */ TypeVariable val$var;

            public C75211(final TypeTable this$0, final TypeVariable val$var, final TypeTable val$unguarded) {
                val$var = val$var;
                val$unguarded = val$unguarded;
            }

            @Override // com.google.common.reflect.TypeResolver.TypeTable
            public Type resolveInternal(TypeVariable<?> intermediateVar, TypeTable forDependent) {
                return intermediateVar.getGenericDeclaration().equals(val$var.getGenericDeclaration()) ? intermediateVar : val$unguarded.resolveInternal(intermediateVar, forDependent);
            }
        }

        public final Type resolve(TypeVariable<?> var) {
            return resolveInternal(var, new TypeTable(this) { // from class: com.google.common.reflect.TypeResolver.TypeTable.1
                public final /* synthetic */ TypeTable val$unguarded;
                public final /* synthetic */ TypeVariable val$var;

                public C75211(TypeTable this, TypeVariable var2, TypeTable this) {
                    val$var = var2;
                    val$unguarded = this;
                }

                @Override // com.google.common.reflect.TypeResolver.TypeTable
                public Type resolveInternal(TypeVariable<?> intermediateVar, TypeTable forDependent) {
                    return intermediateVar.getGenericDeclaration().equals(val$var.getGenericDeclaration()) ? intermediateVar : val$unguarded.resolveInternal(intermediateVar, forDependent);
                }
            });
        }

        public Type resolveInternal(TypeVariable<?> var, TypeTable forDependants) {
            Type type = this.map.get(new TypeVariableKey(var));
            if (type == null) {
                Type[] bounds = var.getBounds();
                if (bounds.length == 0) {
                    return var;
                }
                Type[] typeArrResolveTypes = new TypeResolver(forDependants).resolveTypes(bounds);
                return (Types.NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY && Arrays.equals(bounds, typeArrResolveTypes)) ? var : Types.newArtificialTypeVariable(var.getGenericDeclaration(), var.getName(), typeArrResolveTypes);
            }
            return new TypeResolver(forDependants).resolveType(type);
        }
    }

    /* loaded from: classes6.dex */
    public static final class TypeMappingIntrospector extends TypeVisitor {
        public final Map<TypeVariableKey, Type> mappings = Maps.newHashMap();

        public static ImmutableMap<TypeVariableKey, Type> getTypeMappings(Type contextType) {
            Preconditions.checkNotNull(contextType);
            TypeMappingIntrospector typeMappingIntrospector = new TypeMappingIntrospector();
            typeMappingIntrospector.visit(contextType);
            return ImmutableMap.copyOf((Map) typeMappingIntrospector.mappings);
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> clazz) {
            visit(clazz.getGenericSuperclass());
            visit(clazz.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitParameterizedType(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                map(new TypeVariableKey(typeParameters[i]), actualTypeArguments[i]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> t) {
            visit(t.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType t) {
            visit(t.getUpperBounds());
        }

        public final void map(TypeVariableKey var, Type arg) {
            if (this.mappings.containsKey(var)) {
                return;
            }
            Type type = arg;
            while (type != null) {
                if (var.equalsType(type)) {
                    while (arg != null) {
                        arg = this.mappings.remove(TypeVariableKey.forLookup(arg));
                    }
                    return;
                }
                type = this.mappings.get(TypeVariableKey.forLookup(type));
            }
            this.mappings.put(var, arg);
        }
    }

    public static class WildcardCapturer {
        public static final WildcardCapturer INSTANCE = new WildcardCapturer();

        /* renamed from: id */
        public final AtomicInteger f865id;

        public /* synthetic */ WildcardCapturer(AtomicInteger atomicInteger, C75201 c75201) {
            this(atomicInteger);
        }

        public WildcardCapturer() {
            this(new AtomicInteger());
        }

        public WildcardCapturer(AtomicInteger id) {
            this.f865id = id;
        }

        public final Type capture(Type type) {
            Preconditions.checkNotNull(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.newArrayType(notForTypeVariable().capture(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable<?>[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    actualTypeArguments[i] = forTypeVariable(typeParameters[i]).capture(actualTypeArguments[i]);
                }
                return Types.newParameterizedTypeWithOwner(notForTypeVariable().captureNullable(parameterizedType.getOwnerType()), cls, actualTypeArguments);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? captureAsTypeVariable(wildcardType.getUpperBounds()) : type;
            }
            throw new AssertionError("must have been one of the known types");
        }

        public TypeVariable<?> captureAsTypeVariable(Type[] upperBounds) {
            return Types.newArtificialTypeVariable(WildcardCapturer.class, "capture#" + this.f865id.incrementAndGet() + "-of ? extends " + Joiner.m1143on('&').join(upperBounds), upperBounds);
        }

        /* renamed from: com.google.common.reflect.TypeResolver$WildcardCapturer$1 */
        /* loaded from: classes6.dex */
        public class C75221 extends WildcardCapturer {
            public final /* synthetic */ TypeVariable val$typeParam;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C75221(final WildcardCapturer this$0, AtomicInteger id, final TypeVariable val$typeParam) {
                super(id);
                val$typeParam = val$typeParam;
            }

            @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
            public TypeVariable<?> captureAsTypeVariable(Type[] upperBounds) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                linkedHashSet.addAll(Arrays.asList(val$typeParam.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.captureAsTypeVariable((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public final WildcardCapturer forTypeVariable(TypeVariable<?> typeParam) {
            return new WildcardCapturer(this, this.f865id) { // from class: com.google.common.reflect.TypeResolver.WildcardCapturer.1
                public final /* synthetic */ TypeVariable val$typeParam;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C75221(WildcardCapturer this, AtomicInteger id, TypeVariable typeParam2) {
                    super(id);
                    val$typeParam = typeParam2;
                }

                @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
                public TypeVariable<?> captureAsTypeVariable(Type[] upperBounds) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                    linkedHashSet.addAll(Arrays.asList(val$typeParam.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.captureAsTypeVariable((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        public final WildcardCapturer notForTypeVariable() {
            return new WildcardCapturer(this.f865id);
        }

        @CheckForNull
        public final Type captureNullable(@CheckForNull Type type) {
            if (type == null) {
                return null;
            }
            return capture(type);
        }
    }

    public static final class TypeVariableKey {
        public final TypeVariable<?> var;

        public TypeVariableKey(TypeVariable<?> var) {
            this.var = (TypeVariable) Preconditions.checkNotNull(var);
        }

        public int hashCode() {
            return Objects.hashCode(this.var.getGenericDeclaration(), this.var.getName());
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof TypeVariableKey) {
                return equalsTypeVariable(((TypeVariableKey) obj).var);
            }
            return false;
        }

        public String toString() {
            return this.var.toString();
        }

        @CheckForNull
        public static TypeVariableKey forLookup(Type t) {
            if (t instanceof TypeVariable) {
                return new TypeVariableKey((TypeVariable) t);
            }
            return null;
        }

        public boolean equalsType(Type type) {
            if (type instanceof TypeVariable) {
                return equalsTypeVariable((TypeVariable) type);
            }
            return false;
        }

        public final boolean equalsTypeVariable(TypeVariable<?> that) {
            return this.var.getGenericDeclaration().equals(that.getGenericDeclaration()) && this.var.getName().equals(that.getName());
        }
    }
}
