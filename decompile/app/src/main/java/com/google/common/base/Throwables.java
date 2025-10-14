package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Throwables {

    @J2ktIncompatible
    @GwtIncompatible
    public static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";

    @VisibleForTesting
    @J2ktIncompatible
    @GwtIncompatible
    public static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    public static final Method getStackTraceDepthMethod;

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    public static final Method getStackTraceElementMethod;

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    public static final Object jla;

    @GwtIncompatible
    @J2ktIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable throwable, Class<X> declaredType) throws Throwable {
        Preconditions.checkNotNull(throwable);
        if (declaredType.isInstance(throwable)) {
            throw declaredType.cast(throwable);
        }
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfInstanceOf(@CheckForNull Throwable throwable, Class<X> declaredType) throws Throwable {
        if (throwable != null) {
            throwIfInstanceOf(throwable, declaredType);
        }
    }

    public static void throwIfUnchecked(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        if (throwable instanceof RuntimeException) {
            throw ((RuntimeException) throwable);
        }
        if (throwable instanceof Error) {
            throw ((Error) throwable);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(@CheckForNull Throwable throwable) {
        if (throwable != null) {
            throwIfUnchecked(throwable);
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfPossible(@CheckForNull Throwable throwable, Class<X> declaredType) throws Throwable {
        propagateIfInstanceOf(throwable, declaredType);
        propagateIfPossible(throwable);
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(@CheckForNull Throwable throwable, Class<X1> declaredType1, Class<X2> declaredType2) throws Throwable {
        Preconditions.checkNotNull(declaredType2);
        propagateIfInstanceOf(throwable, declaredType1);
        propagateIfPossible(throwable, declaredType2);
    }

    @GwtIncompatible
    @Deprecated
    @CanIgnoreReturnValue
    @J2ktIncompatible
    public static RuntimeException propagate(Throwable throwable) {
        throwIfUnchecked(throwable);
        throw new RuntimeException(throwable);
    }

    public static Throwable getRootCause(Throwable throwable) {
        boolean z = false;
        Throwable cause = throwable;
        while (true) {
            Throwable cause2 = throwable.getCause();
            if (cause2 == null) {
                return throwable;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            throwable = cause2;
        }
    }

    public static List<Throwable> getCausalChain(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(throwable);
        boolean z = false;
        Throwable cause = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable != null) {
                arrayList.add(throwable);
                if (throwable == cause) {
                    throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
                }
                if (z) {
                    cause = cause.getCause();
                }
                z = !z;
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @CheckForNull
    @GwtIncompatible
    @J2ktIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable throwable, Class<X> expectedCauseType) {
        try {
            return expectedCauseType.cast(throwable.getCause());
        } catch (ClassCastException e) {
            e.initCause(throwable);
            throw e;
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static List<StackTraceElement> lazyStackTrace(Throwable throwable) {
        if (lazyStackTraceIsLazy()) {
            return jlaStackTrace(throwable);
        }
        return Collections.unmodifiableList(Arrays.asList(throwable.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static List<StackTraceElement> jlaStackTrace(Throwable t) {
        Preconditions.checkNotNull(t);
        return new AbstractList<StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            public final /* synthetic */ Throwable val$t;

            public C71801(Throwable t2) {
                val$t = t2;
            }

            @Override // java.util.AbstractList, java.util.List
            public StackTraceElement get(int n) {
                Method method = Throwables.getStackTraceElementMethod;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.jla;
                java.util.Objects.requireNonNull(obj);
                return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(method, obj, val$t, Integer.valueOf(n));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                Method method = Throwables.getStackTraceDepthMethod;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.jla;
                java.util.Objects.requireNonNull(obj);
                return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(method, obj, val$t)).intValue();
            }
        };
    }

    /* renamed from: com.google.common.base.Throwables$1 */
    public class C71801 extends AbstractList<StackTraceElement> {
        public final /* synthetic */ Throwable val$t;

        public C71801(Throwable t2) {
            val$t = t2;
        }

        @Override // java.util.AbstractList, java.util.List
        public StackTraceElement get(int n) {
            Method method = Throwables.getStackTraceElementMethod;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.jla;
            java.util.Objects.requireNonNull(obj);
            return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(method, obj, val$t, Integer.valueOf(n));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = Throwables.getStackTraceDepthMethod;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.jla;
            java.util.Objects.requireNonNull(obj);
            return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(method, obj, val$t)).intValue();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object receiver, Object... params) {
        try {
            return method.invoke(receiver, params);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    static {
        Object jla2 = getJLA();
        jla = jla2;
        getStackTraceElementMethod = jla2 == null ? null : getGetMethod();
        getStackTraceDepthMethod = jla2 != null ? getSizeMethod(jla2) : null;
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    public static Object getJLA() {
        try {
            return Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    public static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @J2ktIncompatible
    @CheckForNull
    @GwtIncompatible
    public static Method getSizeMethod(Object jla2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(jla2, new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @CheckForNull
    @GwtIncompatible
    @J2ktIncompatible
    public static Method getJlaMethod(String name, Class<?>... parameterTypes) throws ThreadDeath {
        try {
            return Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(name, parameterTypes);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
