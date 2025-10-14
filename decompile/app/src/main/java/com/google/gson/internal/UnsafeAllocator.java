package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = create();

    public abstract <T> T newInstance(Class<T> cls) throws Exception;

    public static void assertInstantiable(Class<?> cls) {
        String strCheckInstantiable = ConstructorConstructor.checkInstantiable(cls);
        if (strCheckInstantiable == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strCheckInstantiable);
    }

    public static UnsafeAllocator create() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        public final /* synthetic */ Method val$allocateInstance;
                        public final /* synthetic */ Object val$unsafe;

                        public C78311(Method method, Object obj) {
                            method = method;
                            obj = obj;
                        }

                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return (T) method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                        public final /* synthetic */ int val$constructorId;
                        public final /* synthetic */ Method val$newInstance;

                        public C78322(Method declaredMethod22, int iIntValue2) {
                            method = declaredMethod22;
                            i = iIntValue2;
                        }

                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            UnsafeAllocator.assertInstantiable(cls2);
                            return (T) method.invoke(null, cls2, Integer.valueOf(i));
                        }
                    };
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                    public final /* synthetic */ Method val$newInstance;

                    public C78333(Method declaredMethod32) {
                        method = declaredMethod32;
                    }

                    @Override // com.google.gson.internal.UnsafeAllocator
                    public <T> T newInstance(Class<T> cls2) throws Exception {
                        UnsafeAllocator.assertInstantiable(cls2);
                        return (T) method.invoke(null, cls2, Object.class);
                    }
                };
            }
        } catch (Exception unused3) {
            return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                @Override // com.google.gson.internal.UnsafeAllocator
                public <T> T newInstance(Class<T> cls2) {
                    throw new UnsupportedOperationException("Cannot allocate " + cls2 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                }
            };
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$1 */
    /* loaded from: classes6.dex */
    public class C78311 extends UnsafeAllocator {
        public final /* synthetic */ Method val$allocateInstance;
        public final /* synthetic */ Object val$unsafe;

        public C78311(Method method, Object obj) {
            method = method;
            obj = obj;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls2) throws Exception {
            UnsafeAllocator.assertInstantiable(cls2);
            return (T) method.invoke(obj, cls2);
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$2 */
    /* loaded from: classes6.dex */
    public class C78322 extends UnsafeAllocator {
        public final /* synthetic */ int val$constructorId;
        public final /* synthetic */ Method val$newInstance;

        public C78322(Method declaredMethod22, int iIntValue2) {
            method = declaredMethod22;
            i = iIntValue2;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls2) throws Exception {
            UnsafeAllocator.assertInstantiable(cls2);
            return (T) method.invoke(null, cls2, Integer.valueOf(i));
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$3 */
    /* loaded from: classes6.dex */
    public class C78333 extends UnsafeAllocator {
        public final /* synthetic */ Method val$newInstance;

        public C78333(Method declaredMethod32) {
            method = declaredMethod32;
        }

        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls2) throws Exception {
            UnsafeAllocator.assertInstantiable(cls2);
            return (T) method.invoke(null, cls2, Object.class);
        }
    }

    /* renamed from: com.google.gson.internal.UnsafeAllocator$4 */
    /* loaded from: classes6.dex */
    public class C78344 extends UnsafeAllocator {
        @Override // com.google.gson.internal.UnsafeAllocator
        public <T> T newInstance(Class<T> cls2) {
            throw new UnsupportedOperationException("Cannot allocate " + cls2 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }
}
