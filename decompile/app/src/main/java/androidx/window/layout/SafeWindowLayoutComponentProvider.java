package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0002J \u0010\u001a\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u001b\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u001c\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001d\u001a\u00020\n*\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u001d\u001a\u00020\n*\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006 "}, m7105d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "()V", "windowLayoutComponent", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent$delegate", "Lkotlin/Lazy;", "isPublic", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Z", "canUseWindowLayoutComponent", "classLoader", "Ljava/lang/ClassLoader;", "foldingFeatureClass", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "isFoldingFeatureValid", "isWindowExtensionsValid", "isWindowLayoutComponentValid", "isWindowLayoutProviderValid", "validate", "block", "Lkotlin/Function0;", "windowExtensionsClass", "windowExtensionsProviderClass", "windowLayoutComponentClass", "doesReturn", "clazz", "Lkotlin/reflect/KClass;", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider {

    @NotNull
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();

    /* renamed from: windowLayoutComponent$delegate, reason: from kotlin metadata */
    @NotNull
    public static final Lazy windowLayoutComponent = LazyKt__LazyJVMKt.lazy(new Function0<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader != null && SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader)) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
            return null;
        }
    });

    @Nullable
    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent.getValue();
    }

    public final boolean canUseWindowLayoutComponent(ClassLoader classLoader) {
        return isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader);
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 */
    /* loaded from: classes.dex */
    public static final class C32961 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32961(ClassLoader classLoader) {
            super(0);
            classLoader = classLoader;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
            Method getWindowExtensionsMethod = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(classLoader).getDeclaredMethod("getWindowExtensions", null);
            Class windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
            Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
            return Boolean.valueOf(safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, (Class<?>) windowExtensionsClass) && safeWindowLayoutComponentProvider.isPublic(getWindowExtensionsMethod));
        }
    }

    public final boolean isWindowLayoutProviderValid(ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid.1
            public final /* synthetic */ ClassLoader $classLoader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32961(ClassLoader classLoader2) {
                super(0);
                classLoader = classLoader2;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() throws NoSuchMethodException, SecurityException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                Method getWindowExtensionsMethod = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(classLoader).getDeclaredMethod("getWindowExtensions", null);
                Class windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
                Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
                return Boolean.valueOf(safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, (Class<?>) windowExtensionsClass) && safeWindowLayoutComponentProvider.isPublic(getWindowExtensionsMethod));
            }
        });
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 */
    /* loaded from: classes.dex */
    public static final class C32941 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32941(ClassLoader classLoader) {
            super(0);
            classLoader = classLoader;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            boolean z;
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
            Method getWindowLayoutComponentMethod = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader).getMethod("getWindowLayoutComponent", null);
            Class windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
            Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (safeWindowLayoutComponentProvider.isPublic(getWindowLayoutComponentMethod)) {
                Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
                z = safeWindowLayoutComponentProvider.doesReturn(getWindowLayoutComponentMethod, (Class<?>) windowLayoutComponentClass);
            }
            return Boolean.valueOf(z);
        }
    }

    public final boolean isWindowExtensionsValid(ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowExtensionsValid.1
            public final /* synthetic */ ClassLoader $classLoader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32941(ClassLoader classLoader2) {
                super(0);
                classLoader = classLoader2;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke() throws NoSuchMethodException, SecurityException {
                boolean z;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                Method getWindowLayoutComponentMethod = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader).getMethod("getWindowLayoutComponent", null);
                Class windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
                Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (safeWindowLayoutComponentProvider.isPublic(getWindowLayoutComponentMethod)) {
                    Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
                    z = safeWindowLayoutComponentProvider.doesReturn(getWindowLayoutComponentMethod, (Class<?>) windowLayoutComponentClass);
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 */
    /* loaded from: classes.dex */
    public static final class C32931 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32931(ClassLoader classLoader) {
            super(0);
            classLoader = classLoader;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            boolean z;
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
            Class clsFoldingFeatureClass = safeWindowLayoutComponentProvider.foldingFeatureClass(classLoader);
            Method getBoundsMethod = clsFoldingFeatureClass.getMethod("getBounds", null);
            Method getTypeMethod = clsFoldingFeatureClass.getMethod("getType", null);
            Method getStateMethod = clsFoldingFeatureClass.getMethod("getState", null);
            Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
            if (safeWindowLayoutComponentProvider.doesReturn(getBoundsMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(Rect.class)) && safeWindowLayoutComponentProvider.isPublic(getBoundsMethod)) {
                Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (safeWindowLayoutComponentProvider.doesReturn(getTypeMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(cls)) && safeWindowLayoutComponentProvider.isPublic(getTypeMethod)) {
                    Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                    if (safeWindowLayoutComponentProvider.doesReturn(getStateMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(cls)) && safeWindowLayoutComponentProvider.isPublic(getStateMethod)) {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public final boolean isFoldingFeatureValid(ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isFoldingFeatureValid.1
            public final /* synthetic */ ClassLoader $classLoader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32931(ClassLoader classLoader2) {
                super(0);
                classLoader = classLoader2;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke() throws NoSuchMethodException, SecurityException {
                boolean z;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                Class clsFoldingFeatureClass = safeWindowLayoutComponentProvider.foldingFeatureClass(classLoader);
                Method getBoundsMethod = clsFoldingFeatureClass.getMethod("getBounds", null);
                Method getTypeMethod = clsFoldingFeatureClass.getMethod("getType", null);
                Method getStateMethod = clsFoldingFeatureClass.getMethod("getState", null);
                Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
                if (safeWindowLayoutComponentProvider.doesReturn(getBoundsMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(Rect.class)) && safeWindowLayoutComponentProvider.isPublic(getBoundsMethod)) {
                    Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (safeWindowLayoutComponentProvider.doesReturn(getTypeMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(cls)) && safeWindowLayoutComponentProvider.isPublic(getTypeMethod)) {
                        Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                        if (safeWindowLayoutComponentProvider.doesReturn(getStateMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(cls)) && safeWindowLayoutComponentProvider.isPublic(getStateMethod)) {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1 */
    /* loaded from: classes.dex */
    public static final class C32951 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32951(ClassLoader classLoader) {
            super(0);
            classLoader = classLoader;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            boolean z;
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
            Class clsWindowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
            Method addListenerMethod = clsWindowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method removeListenerMethod = clsWindowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
            if (safeWindowLayoutComponentProvider.isPublic(addListenerMethod)) {
                Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                z = safeWindowLayoutComponentProvider.isPublic(removeListenerMethod);
            }
            return Boolean.valueOf(z);
        }
    }

    @RequiresApi(24)
    public final boolean isWindowLayoutComponentValid(ClassLoader classLoader) {
        return validate(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowLayoutComponentValid.1
            public final /* synthetic */ ClassLoader $classLoader;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32951(ClassLoader classLoader2) {
                super(0);
                classLoader = classLoader2;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke() throws NoSuchMethodException, SecurityException {
                boolean z;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                Class clsWindowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(classLoader);
                Method addListenerMethod = clsWindowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method removeListenerMethod = clsWindowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
                if (safeWindowLayoutComponentProvider.isPublic(addListenerMethod)) {
                    Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                    z = safeWindowLayoutComponentProvider.isPublic(removeListenerMethod);
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean validate(Function0<Boolean> block) {
        try {
            return block.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean doesReturn(Method method, KClass<?> kClass) {
        return doesReturn(method, JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    public final Class<?> windowExtensionsProviderClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public final Class<?> windowExtensionsClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public final Class<?> foldingFeatureClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    public final Class<?> windowLayoutComponentClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
