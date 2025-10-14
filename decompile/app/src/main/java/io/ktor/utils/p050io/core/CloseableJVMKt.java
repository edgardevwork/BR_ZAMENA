package io.ktor.utils.p050io.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CloseableJVM.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001\"\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003*\n\u0010\n\"\u00020\u000b2\u00020\u000b¨\u0006\f"}, m7105d2 = {"AddSuppressedMethod", "Ljava/lang/reflect/Method;", "getAddSuppressedMethod", "()Ljava/lang/reflect/Method;", "AddSuppressedMethod$delegate", "Lkotlin/Lazy;", "addSuppressedInternal", "", "", "other", "Closeable", "Ljava/io/Closeable;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class CloseableJVMKt {

    @NotNull
    public static final Lazy AddSuppressedMethod$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Method>() { // from class: io.ktor.utils.io.core.CloseableJVMKt$AddSuppressedMethod$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    });

    @PublishedApi
    public static final void addSuppressedInternal(@NotNull Throwable th, @NotNull Throwable other) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Method addSuppressedMethod = getAddSuppressedMethod();
        if (addSuppressedMethod != null) {
            addSuppressedMethod.invoke(th, other);
        }
    }

    public static final Method getAddSuppressedMethod() {
        return (Method) AddSuppressedMethod$delegate.getValue();
    }
}
