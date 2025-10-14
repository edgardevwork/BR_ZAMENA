package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieDynamicProperties.kt */
@Metadata(m7104d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0015\u001a)\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0003\"\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a^\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0003\"\u00020\u000b2'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0013\u001a>\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0015\"\u0004\b\u0000\u0010\u0007*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000eH\u0002¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u00061\u0010\u0018\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000e\"\u0004\b\u0000\u0010\u0007X\u008a\u0084\u0002"}, m7105d2 = {"rememberLottieDynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperty", ExifInterface.GPS_DIRECTION_TRUE, "property", "value", "keyPath", "", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "callback", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "toValueCallback", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "lottie-compose_release", "callbackState"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLottieDynamicProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieDynamicProperties.kt\ncom/airbnb/lottie/compose/LottieDynamicPropertiesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,194:1\n1116#2,6:195\n1116#2,6:201\n1116#2,6:207\n1116#2,6:213\n1116#2,6:219\n81#3:225\n*S KotlinDebug\n*F\n+ 1 LottieDynamicProperties.kt\ncom/airbnb/lottie/compose/LottieDynamicPropertiesKt\n*L\n29#1:195,6\n48#1:201,6\n49#1:207,6\n71#1:213,6\n73#1:219,6\n72#1:225\n*E\n"})
/* loaded from: classes.dex */
public final class LottieDynamicPropertiesKt {
    @Composable
    @NotNull
    public static final LottieDynamicProperties rememberLottieDynamicProperties(@NotNull LottieDynamicProperty<?>[] properties, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        composer.startReplaceableGroup(-395574495);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-395574495, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperties (LottieDynamicProperties.kt:27)");
        }
        int iHashCode = Arrays.hashCode(properties);
        composer.startReplaceableGroup(34468001);
        boolean zChanged = composer.changed(iHashCode);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LottieDynamicProperties(ArraysKt___ArraysKt.toList(properties));
            composer.updateRememberedValue(objRememberedValue);
        }
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperties;
    }

    @Composable
    @NotNull
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, T t2, @NotNull String[] keyPath, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        composer.startReplaceableGroup(-1788530187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1788530187, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        composer.startReplaceableGroup(1613443961);
        boolean zChanged = composer.changed(keyPath);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(objRememberedValue);
        }
        KeyPath keyPath2 = (KeyPath) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1613444012);
        boolean zChanged2 = composer.changed(keyPath2) | ((((i & 14) ^ 6) > 4 && composer.changed(t)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(t2)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LottieDynamicProperty(t, keyPath2, t2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) objRememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperty;
    }

    @Composable
    @NotNull
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, @NotNull String[] keyPath, @NotNull Function1<? super LottieFrameInfo<T>, ? extends T> callback, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceableGroup(1331897370);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331897370, i, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:69)");
        }
        int iHashCode = Arrays.hashCode(keyPath);
        composer.startReplaceableGroup(1613445061);
        boolean zChanged = composer.changed(iHashCode);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(objRememberedValue);
        }
        KeyPath keyPath2 = (KeyPath) objRememberedValue;
        composer.endReplaceableGroup();
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(callback, composer, (i >> 6) & 14);
        composer.startReplaceableGroup(1613445186);
        boolean zChanged2 = composer.changed(keyPath2) | ((((i & 14) ^ 6) > 4 && composer.changed(t)) || (i & 6) == 4);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LottieDynamicProperty((Object) t, keyPath2, (Function1) new Function1<LottieFrameInfo<T>, T>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(@NotNull LottieFrameInfo<T> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (T) LottieDynamicPropertiesKt.rememberLottieDynamicProperty$lambda$4(stateRememberUpdatedState).invoke(it);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) objRememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieDynamicProperty;
    }

    public static final <T> C34571 toValueCallback(final Function1<? super LottieFrameInfo<T>, ? extends T> function1) {
        return new LottieValueCallback<T>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt.toValueCallback.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public T getValue(@NotNull LottieFrameInfo<T> frameInfo) {
                Intrinsics.checkNotNullParameter(frameInfo, "frameInfo");
                return function1.invoke(frameInfo);
            }
        };
    }

    public static final <T> Function1<LottieFrameInfo<T>, T> rememberLottieDynamicProperty$lambda$4(State<? extends Function1<? super LottieFrameInfo<T>, ? extends T>> state) {
        return state.getValue();
    }
}
