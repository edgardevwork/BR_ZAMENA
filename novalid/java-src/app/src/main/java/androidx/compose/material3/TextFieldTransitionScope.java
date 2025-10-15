package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldImpl.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÇ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2z\u0010\u000f\u001av\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u0084\u0002"}, m7105d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "()V", MotionScene.TRANSITION_TAG, "", "inputState", "Landroidx/compose/material3/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material3/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,433:1\n1166#2:434\n1083#2,5:435\n1166#2:440\n1083#2,5:441\n1166#2:446\n1083#2,5:447\n1083#2,5:463\n1083#2,5:479\n69#3,2:452\n71#3:458\n74#3:462\n69#3,2:468\n71#3:474\n74#3:478\n36#4:454\n36#4:470\n1116#5,3:455\n1119#5,3:459\n1116#5,3:471\n1119#5,3:475\n81#6:484\n81#6:485\n81#6:486\n81#6:487\n81#6:488\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldTransitionScope\n*L\n316#1:434\n316#1:435,5\n327#1:440\n327#1:441,5\n355#1:446\n355#1:447,5\n366#1:463,5\n376#1:479,5\n366#1:452,2\n366#1:458\n366#1:462\n376#1:468,2\n376#1:474\n376#1:478\n366#1:454\n376#1:470\n366#1:455,3\n366#1:459,3\n376#1:471,3\n376#1:475,3\n316#1:484\n327#1:485\n355#1:486\n366#1:487\n376#1:488\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldTransitionScope {

    @NotNull
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a6  */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10022TransitionDTcfvLk(@NotNull final InputPhase inputPhase, final long j, final long j2, @NotNull final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> function3, final boolean z, @NotNull final Function7<? super Float, ? super Color, ? super Color, ? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function7, @Nullable Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        float f3;
        int i6;
        float f4;
        int i7;
        int i8;
        float f5;
        int i9;
        ColorSpace colorSpaceM11344getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        ColorSpace colorSpaceM11344getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-995111872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(inputPhase) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function7) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995111872, i2, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:309)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", composerStartRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i10) {
                    composer2.startReplaceableGroup(-4765522);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-4765522, i10, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:317)");
                    }
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tweenSpecTween$default;
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            InputPhase inputPhase2 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(240378898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:319)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i10 = iArr[inputPhase2.ordinal()];
            float f6 = 0.0f;
            if (i10 == 1) {
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf = Float.valueOf(f);
                InputPhase inputPhase3 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(240378898);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:319)");
                }
                i3 = iArr[inputPhase3.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        f2 = 0.0f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            @Composable
                            @NotNull
                            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i11) {
                                FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                                composer2.startReplaceableGroup(-1635067817);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1635067817, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                                }
                                InputPhase inputPhase4 = InputPhase.Focused;
                                InputPhase inputPhase5 = InputPhase.UnfocusedEmpty;
                                if (segment.isTransitioningTo(inputPhase4, inputPhase5)) {
                                    finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                                } else if (segment.isTransitioningTo(inputPhase5, inputPhase4) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase5)) {
                                    finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                                } else {
                                    finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2.endReplaceableGroup();
                                return finiteAnimationSpecTween;
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-1338768149);
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                        InputPhase inputPhase4 = (InputPhase) transitionUpdateTransition.getCurrentState();
                        composerStartRestartGroup.startReplaceableGroup(2067512179);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:347)");
                        }
                        i4 = iArr[inputPhase4.ordinal()];
                        if (i4 == 1) {
                            if (i4 != 2) {
                                i5 = 3;
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i5 = 3;
                                if (z) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Float fValueOf2 = Float.valueOf(f3);
                                InputPhase inputPhase5 = (InputPhase) transitionUpdateTransition.getTargetState();
                                composerStartRestartGroup.startReplaceableGroup(2067512179);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:347)");
                                }
                                i6 = iArr[inputPhase5.ordinal()];
                                if (i6 == 1) {
                                    f4 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i11) {
                                            composer2.startReplaceableGroup(1189967029);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1189967029, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                                            }
                                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceableGroup();
                                            return tweenSpecTween$default;
                                        }
                                    };
                                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                                    InputPhase inputPhase6 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                    composerStartRestartGroup.startReplaceableGroup(5829913);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:358)");
                                    }
                                    i7 = iArr[inputPhase6.ordinal()];
                                    if (i7 == 1) {
                                        i8 = 3;
                                    } else if (i7 != 2) {
                                        i8 = 3;
                                        if (i7 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        i8 = 3;
                                        if (z) {
                                            f5 = 0.0f;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Float fValueOf3 = Float.valueOf(f5);
                                        InputPhase inputPhase7 = (InputPhase) transitionUpdateTransition.getTargetState();
                                        composerStartRestartGroup.startReplaceableGroup(5829913);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:358)");
                                        }
                                        i9 = iArr[inputPhase7.ordinal()];
                                        if (i9 == 1) {
                                            f6 = 1.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                    return invoke(segment, composer2, num.intValue());
                                                }

                                                @Composable
                                                @NotNull
                                                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i11) {
                                                    composer2.startReplaceableGroup(2041936647);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2041936647, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                                    }
                                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    return tweenSpecTween$default;
                                                }
                                            };
                                            composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                            InputPhase inputPhase8 = (InputPhase) transitionUpdateTransition.getTargetState();
                                            composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:369)");
                                            }
                                            long j3 = iArr[inputPhase8.ordinal()] == 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(j3);
                                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                                            zChanged = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                                            composerStartRestartGroup.startReplaceableGroup(-142660079);
                                            InputPhase inputPhase9 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                            composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:369)");
                                            }
                                            long j4 = iArr[inputPhase9.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            Color colorM11330boximpl = Color.m11330boximpl(j4);
                                            InputPhase inputPhase10 = (InputPhase) transitionUpdateTransition.getTargetState();
                                            composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:369)");
                                            }
                                            long j5 = iArr[inputPhase10.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM11330boximpl, Color.m11330boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                    return invoke(segment, composer2, num.intValue());
                                                }

                                                @Composable
                                                @NotNull
                                                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i11) {
                                                    composer2.startReplaceableGroup(766065458);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(766065458, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                                                    }
                                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    return tweenSpecTween$default;
                                                }
                                            };
                                            int i11 = (i2 & 7168) | 384;
                                            composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                            colorSpaceM11344getColorSpaceimpl2 = Color.m11344getColorSpaceimpl(function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 112)).m11350unboximpl());
                                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                                            zChanged2 = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl2);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl2);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.startReplaceableGroup(-142660079);
                                            int i12 = ((((i11 << 3) & 57344) | 3136) >> 9) & 112;
                                            State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, function3.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i12)), function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i12)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, 229376);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m11330boximpl(Transition_DTcfvLk$lambda$7(stateCreateTransitionAnimation4)), Color.m11330boximpl(Transition_DTcfvLk$lambda$8(stateCreateTransitionAnimation5)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation2)), Float.valueOf(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation3)), composerStartRestartGroup, Integer.valueOf(458752 & i2));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            if (i9 == 2) {
                                                if (!z) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                State stateCreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                        return invoke(segment, composer2, num.intValue());
                                                    }

                                                    @Composable
                                                    @NotNull
                                                    public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i112) {
                                                        composer2.startReplaceableGroup(2041936647);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2041936647, i112, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                                        }
                                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        composer2.endReplaceableGroup();
                                                        return tweenSpecTween$default;
                                                    }
                                                };
                                                composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                                InputPhase inputPhase82 = (InputPhase) transitionUpdateTransition.getTargetState();
                                                composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (iArr[inputPhase82.ordinal()] == 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(j3);
                                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                                zChanged = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl);
                                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (zChanged) {
                                                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                                                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                                                    InputPhase inputPhase92 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    if (iArr[inputPhase92.ordinal()] != 1) {
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    Color colorM11330boximpl2 = Color.m11330boximpl(j4);
                                                    InputPhase inputPhase102 = (InputPhase) transitionUpdateTransition.getTargetState();
                                                    composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    if (iArr[inputPhase102.ordinal()] != 1) {
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    State stateCreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM11330boximpl2, Color.m11330boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                            return invoke(segment, composer2, num.intValue());
                                                        }

                                                        @Composable
                                                        @NotNull
                                                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i112) {
                                                            composer2.startReplaceableGroup(766065458);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(766065458, i112, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                                                            }
                                                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            composer2.endReplaceableGroup();
                                                            return tweenSpecTween$default;
                                                        }
                                                    };
                                                    int i112 = (i2 & 7168) | 384;
                                                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                                    colorSpaceM11344getColorSpaceimpl2 = Color.m11344getColorSpaceimpl(function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i112 >> 6) & 112)).m11350unboximpl());
                                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                                    zChanged2 = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl2);
                                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                    if (!zChanged2) {
                                                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl2);
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                                                        int i122 = ((((i112 << 3) & 57344) | 3136) >> 9) & 112;
                                                        State stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, function3.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i122)), function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i122)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, 229376);
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m11330boximpl(Transition_DTcfvLk$lambda$7(stateCreateTransitionAnimation42)), Color.m11330boximpl(Transition_DTcfvLk$lambda$8(stateCreateTransitionAnimation52)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation2)), Float.valueOf(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation32)), composerStartRestartGroup, Integer.valueOf(458752 & i2));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                    }
                                                }
                                            } else if (i9 != i8) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            f6 = 1.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            State stateCreateTransitionAnimation322 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                    return invoke(segment, composer2, num.intValue());
                                                }

                                                @Composable
                                                @NotNull
                                                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i1122) {
                                                    composer2.startReplaceableGroup(2041936647);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2041936647, i1122, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                                    }
                                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    return tweenSpecTween$default;
                                                }
                                            };
                                            composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                            InputPhase inputPhase822 = (InputPhase) transitionUpdateTransition.getTargetState();
                                            composerStartRestartGroup.startReplaceableGroup(-1468066062);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            if (iArr[inputPhase822.ordinal()] == 1) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(j3);
                                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                                            zChanged = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (zChanged) {
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Float fValueOf32 = Float.valueOf(f5);
                                    InputPhase inputPhase72 = (InputPhase) transitionUpdateTransition.getTargetState();
                                    composerStartRestartGroup.startReplaceableGroup(5829913);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i9 = iArr[inputPhase72.ordinal()];
                                    if (i9 == 1) {
                                    }
                                } else {
                                    if (i6 == 2) {
                                        if (z) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        State stateCreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                return invoke(segment, composer2, num.intValue());
                                            }

                                            @Composable
                                            @NotNull
                                            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i113) {
                                                composer2.startReplaceableGroup(1189967029);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1189967029, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                                                }
                                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composer2.endReplaceableGroup();
                                                return tweenSpecTween$default;
                                            }
                                        };
                                        composerStartRestartGroup.startReplaceableGroup(-1338768149);
                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                                        InputPhase inputPhase62 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                        composerStartRestartGroup.startReplaceableGroup(5829913);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i7 = iArr[inputPhase62.ordinal()];
                                        if (i7 == 1) {
                                        }
                                        f5 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Float fValueOf322 = Float.valueOf(f5);
                                        InputPhase inputPhase722 = (InputPhase) transitionUpdateTransition.getTargetState();
                                        composerStartRestartGroup.startReplaceableGroup(5829913);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i9 = iArr[inputPhase722.ordinal()];
                                        if (i9 == 1) {
                                        }
                                    } else if (i6 != i5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    f4 = 0.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    State stateCreateTransitionAnimation222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i113) {
                                            composer2.startReplaceableGroup(1189967029);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1189967029, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                                            }
                                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceableGroup();
                                            return tweenSpecTween$default;
                                        }
                                    };
                                    composerStartRestartGroup.startReplaceableGroup(-1338768149);
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                                    InputPhase inputPhase622 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                    composerStartRestartGroup.startReplaceableGroup(5829913);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i7 = iArr[inputPhase622.ordinal()];
                                    if (i7 == 1) {
                                    }
                                    f5 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Float fValueOf3222 = Float.valueOf(f5);
                                    InputPhase inputPhase7222 = (InputPhase) transitionUpdateTransition.getTargetState();
                                    composerStartRestartGroup.startReplaceableGroup(5829913);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i9 = iArr[inputPhase7222.ordinal()];
                                    if (i9 == 1) {
                                    }
                                }
                            }
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Float fValueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase52 = (InputPhase) transitionUpdateTransition.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(2067512179);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = iArr[inputPhase52.ordinal()];
                            if (i6 == 1) {
                            }
                        } else {
                            i5 = 3;
                        }
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Float fValueOf222 = Float.valueOf(f3);
                        InputPhase inputPhase522 = (InputPhase) transitionUpdateTransition.getTargetState();
                        composerStartRestartGroup.startReplaceableGroup(2067512179);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i6 = iArr[inputPhase522.ordinal()];
                        if (i6 == 1) {
                        }
                    } else if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation6 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i113) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        composer2.startReplaceableGroup(-1635067817);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1635067817, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                        }
                        InputPhase inputPhase42 = InputPhase.Focused;
                        InputPhase inputPhase53 = InputPhase.UnfocusedEmpty;
                        if (segment.isTransitioningTo(inputPhase42, inputPhase53)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                        } else if (segment.isTransitioningTo(inputPhase53, inputPhase42) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase53)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                        } else {
                            finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpecTween;
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                InputPhase inputPhase42 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = iArr[inputPhase42.ordinal()];
                if (i4 == 1) {
                }
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf2222 = Float.valueOf(f3);
                InputPhase inputPhase5222 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[inputPhase5222.ordinal()];
                if (i6 == 1) {
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf4 = Float.valueOf(f);
                InputPhase inputPhase32 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(240378898);
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = iArr[inputPhase32.ordinal()];
                if (i3 != 1) {
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation62 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf4, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i113) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        composer2.startReplaceableGroup(-1635067817);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1635067817, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                        }
                        InputPhase inputPhase422 = InputPhase.Focused;
                        InputPhase inputPhase53 = InputPhase.UnfocusedEmpty;
                        if (segment.isTransitioningTo(inputPhase422, inputPhase53)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                        } else if (segment.isTransitioningTo(inputPhase53, inputPhase422) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase53)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                        } else {
                            finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpecTween;
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                InputPhase inputPhase422 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = iArr[inputPhase422.ordinal()];
                if (i4 == 1) {
                }
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf22222 = Float.valueOf(f3);
                InputPhase inputPhase52222 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[inputPhase52222.ordinal()];
                if (i6 == 1) {
                }
            } else {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf42 = Float.valueOf(f);
                InputPhase inputPhase322 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(240378898);
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = iArr[inputPhase322.ordinal()];
                if (i3 != 1) {
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation622 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf42, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i113) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        composer2.startReplaceableGroup(-1635067817);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1635067817, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                        }
                        InputPhase inputPhase4222 = InputPhase.Focused;
                        InputPhase inputPhase53 = InputPhase.UnfocusedEmpty;
                        if (segment.isTransitioningTo(inputPhase4222, inputPhase53)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                        } else if (segment.isTransitioningTo(inputPhase53, inputPhase4222) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase53)) {
                            finiteAnimationSpecTween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                        } else {
                            finiteAnimationSpecTween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceableGroup();
                        return finiteAnimationSpecTween;
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2222 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                InputPhase inputPhase4222 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = iArr[inputPhase4222.ordinal()];
                if (i4 == 1) {
                }
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf222222 = Float.valueOf(f3);
                InputPhase inputPhase522222 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(2067512179);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[inputPhase522222.ordinal()];
                if (i6 == 1) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    this.$tmp0_rcvr.m10022TransitionDTcfvLk(inputPhase, j, j2, function3, z, function7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float Transition_DTcfvLk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final long Transition_DTcfvLk$lambda$7(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    public static final long Transition_DTcfvLk$lambda$8(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }
}
