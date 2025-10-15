package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;
import okhttp3.HttpUrl;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Types {
    public static final Joiner COMMA_JOINER = Joiner.m1144on(", ").useForNull("null");

    public static final class NativeTypeVariableEquals<X> {
        public static final boolean NATIVE_TYPE_VARIABLE_ONLY = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.newArtificialTypeVariable(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    public static Type newArrayType(Type componentType) {
        if (componentType instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) componentType;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
            if (lowerBounds.length == 1) {
                return supertypeOf(newArrayType(lowerBounds[0]));
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
            return subtypeOf(newArrayType(upperBounds[0]));
        }
        return JavaVersion.CURRENT.newArrayType(componentType);
    }

    public static ParameterizedType newParameterizedTypeWithOwner(@CheckForNull Type ownerType, Class<?> rawType, Type... arguments) {
        if (ownerType == null) {
            return newParameterizedType(rawType, arguments);
        }
        Preconditions.checkNotNull(arguments);
        Preconditions.checkArgument(rawType.getEnclosingClass() != null, "Owner type for unenclosed %s", rawType);
        return new ParameterizedTypeImpl(ownerType, rawType, arguments);
    }

    public static ParameterizedType newParameterizedType(Class<?> rawType, Type... arguments) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(rawType), rawType, arguments);
    }

    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> rawType) {
                return rawType.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> rawType) {
                if (rawType.isLocalClass()) {
                    return null;
                }
                return rawType.getEnclosingClass();
            }
        };

        public static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1LocalClass */
        public class C1LocalClass<T> {
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$3 */
        /* loaded from: classes6.dex */
        public class C75363 extends C1LocalClass<String> {
        }

        @CheckForNull
        public abstract Class<?> getOwnerType(Class<?> rawType);

        /* synthetic */ ClassOwnership(C75331 c75331) {
            this();
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$1 */
        /* loaded from: classes6.dex */
        public enum C75341 extends ClassOwnership {
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> rawType) {
                return rawType.getEnclosingClass();
            }
        }

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$2 */
        /* loaded from: classes6.dex */
        public enum C75352 extends ClassOwnership {
            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> rawType) {
                if (rawType.isLocalClass()) {
                    return null;
                }
                return rawType.getEnclosingClass();
            }
        }

        public static ClassOwnership detectJvmBehavior() {
            new C1LocalClass<String>() { // from class: com.google.common.reflect.Types.ClassOwnership.3
            };
            ParameterizedType parameterizedType = (ParameterizedType) C75363.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(C1LocalClass.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }
    }

    public static <D extends GenericDeclaration> TypeVariable<D> newArtificialTypeVariable(D declaration, String name, Type... bounds) {
        if (bounds.length == 0) {
            bounds = new Type[]{Object.class};
        }
        return newTypeVariableImpl(declaration, name, bounds);
    }

    @VisibleForTesting
    public static WildcardType subtypeOf(Type upperBound) {
        return new WildcardTypeImpl(new Type[0], new Type[]{upperBound});
    }

    @VisibleForTesting
    public static WildcardType supertypeOf(Type lowerBound) {
        return new WildcardTypeImpl(new Type[]{lowerBound}, new Type[]{Object.class});
    }

    public static String toString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    @CheckForNull
    public static Type getComponentType(Type type) {
        Preconditions.checkNotNull(type);
        AtomicReference atomicReference = new AtomicReference();
        new TypeVisitor() { // from class: com.google.common.reflect.Types.1
            public final /* synthetic */ AtomicReference val$result;

            public C75331(AtomicReference atomicReference2) {
                val$result = atomicReference2;
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitTypeVariable(TypeVariable<?> t) {
                val$result.set(Types.subtypeOfComponentType(t.getBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitWildcardType(WildcardType t) {
                val$result.set(Types.subtypeOfComponentType(t.getUpperBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitGenericArrayType(GenericArrayType t) {
                val$result.set(t.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public void visitClass(Class<?> t) {
                val$result.set(t.getComponentType());
            }
        }.visit(type);
        return (Type) atomicReference2.get();
    }

    /* renamed from: com.google.common.reflect.Types$1 */
    /* loaded from: classes6.dex */
    public class C75331 extends TypeVisitor {
        public final /* synthetic */ AtomicReference val$result;

        public C75331(AtomicReference atomicReference2) {
            val$result = atomicReference2;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> t) {
            val$result.set(Types.subtypeOfComponentType(t.getBounds()));
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType t) {
            val$result.set(Types.subtypeOfComponentType(t.getUpperBounds()));
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitGenericArrayType(GenericArrayType t) {
            val$result.set(t.getGenericComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> t) {
            val$result.set(t.getComponentType());
        }
    }

    @CheckForNull
    public static Type subtypeOfComponentType(Type[] bounds) {
        for (Type type : bounds) {
            Type componentType = getComponentType(type);
            if (componentType != null) {
                if (componentType instanceof Class) {
                    Class cls = (Class) componentType;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return subtypeOf(componentType);
            }
        }
        return null;
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type componentType;

        public GenericArrayTypeImpl(Type componentType) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(componentType);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public String toString() {
            return Types.toString(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableList<Type> argumentsList;

        @CheckForNull
        public final Type ownerType;
        public final Class<?> rawType;

        public ParameterizedTypeImpl(@CheckForNull Type ownerType, Class<?> rawType, Type[] typeArguments) {
            Preconditions.checkNotNull(rawType);
            Preconditions.checkArgument(typeArguments.length == rawType.getTypeParameters().length);
            Types.disallowPrimitiveType(typeArguments, "type parameter");
            this.ownerType = ownerType;
            this.rawType = rawType;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArguments);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.toArray(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public Type getOwnerType() {
            return this.ownerType;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                if (javaVersion.jdkTypeDuplicatesOwnerName()) {
                    sb.append(javaVersion.typeName(this.ownerType));
                    sb.append('.');
                }
            }
            sb.append(this.rawType.getName());
            sb.append('<');
            Joiner joiner = Types.COMMA_JOINER;
            ImmutableList<Type> immutableList = this.argumentsList;
            final JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb.append(joiner.join(Iterables.transform(immutableList, new Function() { // from class: com.google.common.reflect.Types$ParameterizedTypeImpl$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return javaVersion2.typeName((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public boolean equals(@CheckForNull Object other) {
            if (!(other instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) other;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    public static <D extends GenericDeclaration> TypeVariable<D> newTypeVariableImpl(D genericDeclaration, String name, Type[] bounds) {
        return (TypeVariable) Reflection.newProxy(TypeVariable.class, new TypeVariableInvocationHandler(new TypeVariableImpl(genericDeclaration, name, bounds)));
    }

    public static final class TypeVariableInvocationHandler implements InvocationHandler {
        public static final ImmutableMap<String, Method> typeVariableMethods;
        public final TypeVariableImpl<?> typeVariableImpl;

        static {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            typeVariableMethods = builder.buildKeepingLast();
        }

        public TypeVariableInvocationHandler(TypeVariableImpl<?> typeVariableImpl) {
            this.typeVariableImpl = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object proxy, Method method, @CheckForNull Object[] args) throws Throwable {
            String name = method.getName();
            Method method2 = typeVariableMethods.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.typeVariableImpl, args);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    public static final class TypeVariableImpl<D extends GenericDeclaration> {
        public final ImmutableList<Type> bounds;
        public final D genericDeclaration;
        public final String name;

        public TypeVariableImpl(D genericDeclaration, String name, Type[] bounds) {
            Types.disallowPrimitiveType(bounds, "bound for type variable");
            this.genericDeclaration = (D) Preconditions.checkNotNull(genericDeclaration);
            this.name = (String) Preconditions.checkNotNull(name);
            this.bounds = ImmutableList.copyOf(bounds);
        }

        public Type[] getBounds() {
            return Types.toArray(this.bounds);
        }

        public D getGenericDeclaration() {
            return this.genericDeclaration;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }

        public int hashCode() {
            return this.genericDeclaration.hashCode() ^ this.name.hashCode();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY) {
                if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                    return false;
                }
                TypeVariableImpl typeVariableImpl = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).typeVariableImpl;
                return this.name.equals(typeVariableImpl.getName()) && this.genericDeclaration.equals(typeVariableImpl.getGenericDeclaration()) && this.bounds.equals(typeVariableImpl.bounds);
            }
            if (!(obj instanceof TypeVariable)) {
                return false;
            }
            TypeVariable typeVariable = (TypeVariable) obj;
            return this.name.equals(typeVariable.getName()) && this.genericDeclaration.equals(typeVariable.getGenericDeclaration());
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        public static final long serialVersionUID = 0;
        public final ImmutableList<Type> lowerBounds;
        public final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] lowerBounds, Type[] upperBounds) {
            Types.disallowPrimitiveType(lowerBounds, "lower bound for wildcard");
            Types.disallowPrimitiveType(upperBounds, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.lowerBounds = javaVersion.usedInGenericType(lowerBounds);
            this.upperBounds = javaVersion.usedInGenericType(upperBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.toArray(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.toArray(this.upperBounds);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableIterator<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(next));
            }
            for (Type type : Types.filterUpperBounds(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    public static Type[] toArray(Collection<Type> types) {
        return (Type[]) types.toArray(new Type[0]);
    }

    public static Iterable<Type> filterUpperBounds(Iterable<Type> bounds) {
        return Iterables.filter(bounds, Predicates.not(Predicates.equalTo(Object.class)));
    }

    public static void disallowPrimitiveType(Type[] types, String usedAs) {
        for (Type type : types) {
            if (type instanceof Class) {
                Preconditions.checkArgument(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, usedAs);
            }
        }
    }

    public static Class<?> getArrayClass(Class<?> componentType) {
        return Array.newInstance(componentType, 0).getClass();
    }

    public static abstract class JavaVersion extends Enum<JavaVersion> {
        public static final /* synthetic */ JavaVersion[] $VALUES = $values();
        public static final JavaVersion CURRENT;
        public static final JavaVersion JAVA6;
        public static final JavaVersion JAVA7;
        public static final JavaVersion JAVA8;
        public static final JavaVersion JAVA9;

        /* renamed from: com.google.common.reflect.Types$JavaVersion$5 */
        /* loaded from: classes6.dex */
        public class C75415 extends TypeCapture<Map.Entry<String, int[][]>> {
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$6 */
        /* loaded from: classes6.dex */
        public class C75426 extends TypeCapture<int[]> {
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type componentType);

        public abstract Type usedInGenericType(Type type);

        /* renamed from: com.google.common.reflect.Types$JavaVersion$1 */
        /* loaded from: classes6.dex */
        public enum C75371 extends JavaVersion {
            public C75371(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type componentType) {
                return new GenericArrayTypeImpl(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                Preconditions.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        }

        public static /* synthetic */ JavaVersion[] $values() {
            return new JavaVersion[]{JAVA6, JAVA7, JAVA8, JAVA9};
        }

        public JavaVersion(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public /* synthetic */ JavaVersion(String str, int i, C75331 c75331) {
            this(str, i);
        }

        public static JavaVersion valueOf(String name) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, name);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) $VALUES.clone();
        }

        static {
            C75371 c75371 = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.1
                public C75371(String $enum$name, int $enum$ordinal) {
                    super($enum$name, $enum$ordinal);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public GenericArrayType newArrayType(Type componentType) {
                    return new GenericArrayTypeImpl(componentType);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type usedInGenericType(Type type) {
                    Preconditions.checkNotNull(type);
                    if (!(type instanceof Class)) {
                        return type;
                    }
                    Class cls = (Class) type;
                    return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
                }
            };
            JAVA6 = c75371;
            C75382 c75382 = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.2
                public C75382(String $enum$name, int $enum$ordinal) {
                    super($enum$name, $enum$ordinal);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type newArrayType(Type componentType) {
                    if (componentType instanceof Class) {
                        return Types.getArrayClass((Class) componentType);
                    }
                    return new GenericArrayTypeImpl(componentType);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type usedInGenericType(Type type) {
                    return (Type) Preconditions.checkNotNull(type);
                }
            };
            JAVA7 = c75382;
            C75393 c75393 = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.3
                public C75393(String $enum$name, int $enum$ordinal) {
                    super($enum$name, $enum$ordinal);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type newArrayType(Type componentType) {
                    return JavaVersion.JAVA7.newArrayType(componentType);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type usedInGenericType(Type type) {
                    return JavaVersion.JAVA7.usedInGenericType(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public String typeName(Type type) {
                    try {
                        return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (NoSuchMethodException unused) {
                        throw new AssertionError("Type.getTypeName should be available in Java 8");
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            };
            JAVA8 = c75393;
            C75404 c75404 = new JavaVersion() { // from class: com.google.common.reflect.Types.JavaVersion.4
                @Override // com.google.common.reflect.Types.JavaVersion
                public boolean jdkTypeDuplicatesOwnerName() {
                    return false;
                }

                public C75404(String $enum$name, int $enum$ordinal) {
                    super($enum$name, $enum$ordinal);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type newArrayType(Type componentType) {
                    return JavaVersion.JAVA8.newArrayType(componentType);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public Type usedInGenericType(Type type) {
                    return JavaVersion.JAVA8.usedInGenericType(type);
                }

                @Override // com.google.common.reflect.Types.JavaVersion
                public String typeName(Type type) {
                    return JavaVersion.JAVA8.typeName(type);
                }
            };
            JAVA9 = c75404;
            $VALUES = $values();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new TypeCapture<Map.Entry<String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = c75393;
                    return;
                } else {
                    CURRENT = c75404;
                    return;
                }
            }
            if (new TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.6
            }.capture() instanceof Class) {
                CURRENT = c75382;
            } else {
                CURRENT = c75371;
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$2 */
        /* loaded from: classes6.dex */
        public enum C75382 extends JavaVersion {
            public C75382(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type componentType) {
                if (componentType instanceof Class) {
                    return Types.getArrayClass((Class) componentType);
                }
                return new GenericArrayTypeImpl(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$3 */
        /* loaded from: classes6.dex */
        public enum C75393 extends JavaVersion {
            public C75393(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type componentType) {
                return JavaVersion.JAVA7.newArrayType(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA7.usedInGenericType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        /* renamed from: com.google.common.reflect.Types$JavaVersion$4 */
        /* loaded from: classes6.dex */
        public enum C75404 extends JavaVersion {
            @Override // com.google.common.reflect.Types.JavaVersion
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            public C75404(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type componentType) {
                return JavaVersion.JAVA8.newArrayType(componentType);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA8.usedInGenericType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                return JavaVersion.JAVA8.typeName(type);
            }
        }

        public final ImmutableList<Type> usedInGenericType(Type[] types) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Type type : types) {
                builder.add((ImmutableList.Builder) usedInGenericType(type));
            }
            return builder.build();
        }

        public String typeName(Type type) {
            return Types.toString(type);
        }
    }
}
