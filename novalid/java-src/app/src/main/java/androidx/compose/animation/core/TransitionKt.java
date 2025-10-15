package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Metadata(m7104d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u000b\u001a\u0002H\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001a3\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0082\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001f0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\"0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020$0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020&0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020(0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a\u0082\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00032*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020*0\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u0010\u001d\u001a¦\u0001\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0010\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010,*\u00020-*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0/2*\b\n\u0010\u0013\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u0010\u0019\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\u00040\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u00100\u001a\\\u00101\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00120\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2&\u00102\u001a\"\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002H\u00040\u0014¢\u0006\u0002\b\u0017H\u0087\b¢\u0006\u0002\u00104\u001aA\u00105\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0006\u00106\u001a\u0002H\u00042\u0006\u0010\u000b\u001a\u0002H\u00042\u0006\u00107\u001a\u00020\bH\u0001¢\u0006\u0002\u00108\u001aa\u00109\u001a\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0:R\b\u0012\u0004\u0012\u0002H\u00120\u0003\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010,*\u00020-*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0/2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010;\u001am\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0010\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010,*\u00020-*\b\u0012\u0004\u0012\u0002H\u00120\u00032\u0006\u0010=\u001a\u0002H\u00042\u0006\u0010>\u001a\u0002H\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00162\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H,0/2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010@\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006A"}, m7105d2 = {"AnimationDebugDurationScale", "", "rememberTransition", "Landroidx/compose/animation/core/Transition;", ExifInterface.GPS_DIRECTION_TRUE, "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "updateTransition", "targetState", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "S", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "initialValue", "targetValue", "animationSpec", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1382:1\n1083#1,5:1449\n1083#1,5:1454\n1083#1,5:1459\n1083#1,5:1464\n1083#1,5:1469\n1083#1,5:1474\n1083#1,5:1479\n1083#1,5:1484\n25#2:1383\n36#2:1396\n36#2:1409\n36#2:1416\n36#2:1423\n36#2:1436\n1116#3,6:1384\n1116#3,6:1390\n1116#3,6:1397\n1116#3,6:1403\n1116#3,6:1410\n1116#3,6:1417\n1116#3,6:1424\n1116#3,6:1430\n1116#3,6:1437\n1116#3,6:1443\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1166#1:1449,5\n1197#1:1454,5\n1228#1:1459,5\n1259#1:1464,5\n1290#1:1469,5\n1321#1:1474,5\n1351#1:1479,5\n1381#1:1484,5\n75#1:1383\n318#1:1396\n978#1:1409\n1011#1:1416\n1024#1:1423\n1099#1:1436\n75#1:1384,6\n77#1:1390,6\n318#1:1397,6\n322#1:1403,6\n978#1:1410,6\n1011#1:1417,6\n1024#1:1424,6\n1028#1:1430,6\n1099#1:1437,6\n1122#1:1443,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(T t, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Transition(t, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(t, composer, (i & 8) | 48 | (i & 14));
        composer.startReplaceableGroup(-561051652);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @ExperimentalTransitionApi
    @Composable
    @NotNull
    public static final <T> Transition<T> rememberTransition(@NotNull TransitionState<T> transitionState, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1643203617);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:316)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transitionState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition((TransitionState) transitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(-561041970);
        boolean zChanged2 = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @Composable
    @NotNull
    public static final <T> Transition<T> updateTransition(@NotNull MutableTransitionState<T> mutableTransitionState, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:355)");
        }
        Transition<T> transitionRememberTransition = rememberTransition(mutableTransitionState, str, composer, i & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionRememberTransition;
    }

    @Composable
    @InternalAnimationApi
    @NotNull
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@NotNull Transition<S> transition, @NotNull TwoWayConverter<T, V> twoWayConverter, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:976)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt.createDeferredAnimation.1
            public final /* synthetic */ Transition<S>.DeferredAnimation<T, V> $lazyAnim;
            public final /* synthetic */ Transition<S> $this_createDeferredAnimation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03561(Transition<S> transition2, Transition<S>.DeferredAnimation<T, V> deferredAnimation2) {
                super(1);
                transition = transition2;
                deferredAnimation = deferredAnimation2;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                final Transition<S> transition2 = transition;
                final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        transition2.removeAnimation$animation_core_release(deferredAnimation2);
                    }
                };
            }
        }, composer, 0);
        if (transition2.isSeeking()) {
            deferredAnimation2.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation2;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m7105d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n980#1:1383,5\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1 */
    /* loaded from: classes2.dex */
    public static final class C03561 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ Transition<S>.DeferredAnimation<T, V> $lazyAnim;
        public final /* synthetic */ Transition<S> $this_createDeferredAnimation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03561(Transition<S> transition2, Transition<S>.DeferredAnimation<T, V> deferredAnimation2) {
            super(1);
            transition = transition2;
            deferredAnimation = deferredAnimation2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
            final Transition transition2 = transition;
            final Transition.DeferredAnimation deferredAnimation2 = deferredAnimation;
            return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    transition2.removeAnimation$animation_core_release(deferredAnimation2);
                }
            };
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    @ExperimentalTransitionApi
    @Composable
    public static final <S, T> Transition<T> createChildTransition(@NotNull Transition<S> transition, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, ? extends T> function3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1215497572);
        if ((i2 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i3 = i & 14;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i4 = (i >> 3) & 112;
        Transition<T> transitionCreateChildTransitionInternal = createChildTransitionInternal(transition, function3.invoke(objRememberedValue, composer, Integer.valueOf(i4)), function3.invoke(transition.getTargetState(), composer, Integer.valueOf(i4)), str2, composer, i3 | ((i << 6) & 7168));
        composer.endReplaceableGroup();
        return transitionCreateChildTransitionInternal;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final <S, T> Transition<T> createChildTransitionInternal(@NotNull final Transition<S> transition, T t, T t2, @NotNull String str, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-198307638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1022)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t), transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition2 = (Transition) objRememberedValue;
        composer.startReplaceableGroup(-561014285);
        boolean zChanged2 = composer.changed(transition) | composer.changed(transition2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition3.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t2, composer, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateValue$1 */
    /* loaded from: classes2.dex */
    public static final class C03551<S, T> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>> {
        public static final C03551 INSTANCE = ;

        @Composable
        @NotNull
        public final SpringSpec<T> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-895531546);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895531546, i, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1077)");
            }
            SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> animateValue(@NotNull Transition<S> transition, @NotNull TwoWayConverter<T, V> twoWayConverter, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, ? extends T> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-142660079);
        if ((i2 & 2) != 0) {
            function3 = C03551.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i3 = (i >> 9) & 112;
        State<T> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i3)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i3)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i >> 3) & 112)), twoWayConverter, str, composer, (i & 14) | (57344 & (i << 9)) | ((i << 6) & 458752));
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(@NotNull final Transition<S> transition, T t, T t2, @NotNull FiniteAnimationSpec<T> finiteAnimationSpec, @NotNull TwoWayConverter<T, V> twoWayConverter, @NotNull String str, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-304821198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1097)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.new TransitionAnimationState(t, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) objRememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t, t2, finiteAnimationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t2, finiteAnimationSpec);
        }
        composer.startReplaceableGroup(-561010487);
        boolean zChanged2 = composer.changed(transition) | composer.changed(transitionAnimationState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    transition.addAnimation$animation_core_release(transitionAnimationState);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState2 = transitionAnimationState;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(transitionAnimationState2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transitionAnimationState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateFloat$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateFloat$1 */
    /* loaded from: classes2.dex */
    public static final class C03481<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>> {
        public static final C03481 INSTANCE = ;

        @Composable
        @NotNull
        public final SpringSpec<Float> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-522164544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-522164544, i, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1161)");
            }
            SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Float> animateFloat(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Float> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1338768149);
        if ((i2 & 1) != 0) {
            function3 = C03481.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Float> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateDp$1 */
    /* loaded from: classes2.dex */
    public static final class C03471<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<C2046Dp>> {
        public static final C03471 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<C2046Dp> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final SpringSpec<C2046Dp> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-575880366);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-575880366, i, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1191)");
            }
            SpringSpec<C2046Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2046Dp.m13664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C2046Dp.INSTANCE)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<C2046Dp> animateDp(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<C2046Dp>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, C2046Dp> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(184732935);
        if ((i2 & 1) != 0) {
            function3 = C03471.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C2046Dp.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<C2046Dp> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateOffset$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateOffset$1 */
    /* loaded from: classes2.dex */
    public static final class C03521<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>> {
        public static final C03521 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final SpringSpec<Offset> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(1623385561);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623385561, i, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:1222)");
            }
            SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m11088boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Offset> animateOffset(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Offset> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2078477582);
        if ((i2 & 1) != 0) {
            function3 = C03521.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Offset> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateSize$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateSize$1 */
    /* loaded from: classes2.dex */
    public static final class C03541<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>> {
        public static final C03541 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final SpringSpec<Size> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-1607152761);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1607152761, i, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1253)");
            }
            SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m11156boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Size> animateSize(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Size> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-802210820);
        if ((i2 & 1) != 0) {
            function3 = C03541.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Size> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateIntOffset$1 */
    /* loaded from: classes2.dex */
    public static final class C03501<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>> {
        public static final C03501 INSTANCE = ;

        @Composable
        @NotNull
        public final SpringSpec<IntOffset> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-1953479610);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953479610, i, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1285)");
            }
            SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m13785boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<IntOffset> animateIntOffset(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, IntOffset> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(776131825);
        if ((i2 & 1) != 0) {
            function3 = C03501.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<IntOffset> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateInt$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateInt$1 */
    /* loaded from: classes2.dex */
    public static final class C03491<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>> {
        public static final C03491 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final SpringSpec<Integer> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-785273069);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-785273069, i, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1315)");
            }
            SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Integer> animateInt(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Integer> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1318902782);
        if ((i2 & 1) != 0) {
            function3 = C03491.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Integer> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateIntSize$1 */
    /* loaded from: classes2.dex */
    public static final class C03511<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>> {
        public static final C03511 INSTANCE = ;

        @Composable
        @NotNull
        public final SpringSpec<IntSize> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(967893300);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(967893300, i, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1346)");
            }
            SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m13828boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<IntSize> animateIntSize(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, IntSize> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2104123233);
        if ((i2 & 1) != 0) {
            function3 = C03511.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<IntSize> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,1382:1\n*E\n"})
    /* renamed from: androidx.compose.animation.core.TransitionKt$animateRect$1 */
    /* loaded from: classes2.dex */
    public static final class C03531<S> extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>> {
        public static final C03531 INSTANCE = ;

        @Composable
        @NotNull
        public final SpringSpec<Rect> invoke(@NotNull Transition.Segment<S> segment, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(691336298);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(691336298, i, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1376)");
            }
            SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return springSpecSpring$default;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer, Integer num) {
            return invoke((Transition.Segment) obj, composer, num.intValue());
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> State<Rect> animateRect(@NotNull Transition<S> transition, @Nullable Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> function3, @Nullable String str, @NotNull Function3<? super S, ? super Composer, ? super Integer, Rect> function32, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1496278239);
        if ((i2 & 1) != 0) {
            function3 = C03531.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.INSTANCE);
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i6 = (i5 >> 9) & 112;
        State<Rect> stateCreateTransitionAnimation = createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i6)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i6)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, (i5 & 14) | ((i5 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }
}
