package androidx.compose.material;

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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldImpl.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J²\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u0084\u0002"}, m7105d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", MotionScene.TRANSITION_TAG, "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n1166#2:370\n1083#2,5:371\n1166#2:376\n1083#2,5:377\n1083#2,5:393\n1083#2,5:409\n69#3,2:382\n71#3:388\n74#3:392\n69#3,2:398\n71#3:404\n74#3:408\n36#4:384\n36#4:400\n1116#5,3:385\n1119#5,3:389\n1116#5,3:401\n1119#5,3:405\n81#6:414\n81#6:415\n81#6:416\n81#6:417\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n273#1:370\n273#1:371,5\n284#1:376\n284#1:377,5\n312#1:393,5\n322#1:409,5\n312#1:382,2\n312#1:388\n312#1:392\n322#1:398,2\n322#1:404\n322#1:408\n312#1:384\n322#1:400\n312#1:385,3\n312#1:389,3\n322#1:401,3\n322#1:405,3\n273#1:414\n284#1:415\n312#1:416\n322#1:417\n*E\n"})
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9083TransitionDTcfvLk(@NotNull final InputPhase inputPhase, final long j, final long j2, @NotNull final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> function3, final boolean z, @NotNull final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> function6, @Nullable Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        float f3;
        int i6;
        ColorSpace colorSpaceM11344getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        ColorSpace colorSpaceM11344getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1988729962);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(inputPhase) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function6) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1988729962, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:266)");
            }
            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", composerStartRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i7) {
                    composer2.startReplaceableGroup(-611722692);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-611722692, i7, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:274)");
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
            composerStartRestartGroup.startReplaceableGroup(-1158004136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i7 = iArr[inputPhase2.ordinal()];
            float f4 = 0.0f;
            if (i7 == 1) {
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf = Float.valueOf(f);
                InputPhase inputPhase3 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1158004136);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
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
                        TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                return invoke(segment, composer2, num.intValue());
                            }

                            @Composable
                            @NotNull
                            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                                FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                                composer2.startReplaceableGroup(-1079955085);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1079955085, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
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
                        composerStartRestartGroup.startReplaceableGroup(-1376159017);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
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
                                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1376159017, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
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
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                                            composer2.startReplaceableGroup(-130058045);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-130058045, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:312)");
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
                                    InputPhase inputPhase6 = (InputPhase) transitionUpdateTransition.getTargetState();
                                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                                    }
                                    long j3 = iArr[inputPhase6.ordinal()] != 1 ? j : j2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(j3);
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                                    InputPhase inputPhase7 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                                    }
                                    long j4 = iArr[inputPhase7.ordinal()] != 1 ? j : j2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Color colorM11330boximpl = Color.m11330boximpl(j4);
                                    InputPhase inputPhase8 = (InputPhase) transitionUpdateTransition.getTargetState();
                                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                                    }
                                    long j5 = iArr[inputPhase8.ordinal()] != 1 ? j : j2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM11330boximpl, Color.m11330boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i8) {
                                            composer2.startReplaceableGroup(-32667848);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-32667848, i8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                                            }
                                            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceableGroup();
                                            return tweenSpecTween$default;
                                        }
                                    };
                                    int i8 = (i2 & 7168) | 384;
                                    composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                    colorSpaceM11344getColorSpaceimpl2 = Color.m11344getColorSpaceimpl(function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i8 >> 6) & 112)).m11350unboximpl());
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged2 = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl2);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl2);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(-142660079);
                                    int i9 = ((3136 | ((i8 << 3) & 57344)) >> 9) & 112;
                                    State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, function3.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i9)), function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i9)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, 229376);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function6.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m11330boximpl(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation3)), Color.m11330boximpl(Transition_DTcfvLk$lambda$6(stateCreateTransitionAnimation4)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation2)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    if (i6 != 2) {
                                        if (i6 != i5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else if (!z) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    State stateCreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        @Composable
                                        @NotNull
                                        public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i82) {
                                            composer2.startReplaceableGroup(-130058045);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-130058045, i82, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:312)");
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
                                    InputPhase inputPhase62 = (InputPhase) transitionUpdateTransition.getTargetState();
                                    composerStartRestartGroup.startReplaceableGroup(-1490209928);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (iArr[inputPhase62.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    colorSpaceM11344getColorSpaceimpl = Color.m11344getColorSpaceimpl(j3);
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
                                        composerStartRestartGroup.startReplaceableGroup(-142660079);
                                        InputPhase inputPhase72 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                        composerStartRestartGroup.startReplaceableGroup(-1490209928);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (iArr[inputPhase72.ordinal()] != 1) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Color colorM11330boximpl2 = Color.m11330boximpl(j4);
                                        InputPhase inputPhase82 = (InputPhase) transitionUpdateTransition.getTargetState();
                                        composerStartRestartGroup.startReplaceableGroup(-1490209928);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (iArr[inputPhase82.ordinal()] != 1) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        State stateCreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM11330boximpl2, Color.m11330boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", composerStartRestartGroup, 229376);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                return invoke(segment, composer2, num.intValue());
                                            }

                                            @Composable
                                            @NotNull
                                            public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i82) {
                                                composer2.startReplaceableGroup(-32667848);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-32667848, i82, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                                                }
                                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composer2.endReplaceableGroup();
                                                return tweenSpecTween$default;
                                            }
                                        };
                                        int i82 = (i2 & 7168) | 384;
                                        composerStartRestartGroup.startReplaceableGroup(-1939694975);
                                        colorSpaceM11344getColorSpaceimpl2 = Color.m11344getColorSpaceimpl(function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf((i82 >> 6) & 112)).m11350unboximpl());
                                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                                        zChanged2 = composerStartRestartGroup.changed(colorSpaceM11344getColorSpaceimpl2);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged2) {
                                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM11344getColorSpaceimpl2);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.startReplaceableGroup(-142660079);
                                            int i92 = ((3136 | ((i82 << 3) & 57344)) >> 9) & 112;
                                            State stateCreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, function3.invoke(transitionUpdateTransition.getCurrentState(), composerStartRestartGroup, Integer.valueOf(i92)), function3.invoke(transitionUpdateTransition.getTargetState(), composerStartRestartGroup, Integer.valueOf(i92)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), (TwoWayConverter) objRememberedValue2, "LabelContentColor", composerStartRestartGroup, 229376);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            function6.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(stateCreateTransitionAnimation)), Color.m11330boximpl(Transition_DTcfvLk$lambda$5(stateCreateTransitionAnimation32)), Color.m11330boximpl(Transition_DTcfvLk$lambda$6(stateCreateTransitionAnimation42)), Float.valueOf(Transition_DTcfvLk$lambda$3(stateCreateTransitionAnimation22)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }
                                }
                            }
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Float fValueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase52 = (InputPhase) transitionUpdateTransition.getTargetState();
                            composerStartRestartGroup.startReplaceableGroup(-1376159017);
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
                        composerStartRestartGroup.startReplaceableGroup(-1376159017);
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
                State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i83) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        composer2.startReplaceableGroup(-1079955085);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1079955085, i83, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
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
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
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
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[inputPhase5222.ordinal()];
                if (i6 == 1) {
                }
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf3 = Float.valueOf(f);
                InputPhase inputPhase32 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1158004136);
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = iArr[inputPhase32.ordinal()];
                if (i3 != 1) {
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i83) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        composer2.startReplaceableGroup(-1079955085);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1079955085, i83, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
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
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
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
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
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
                Float fValueOf32 = Float.valueOf(f);
                InputPhase inputPhase322 = (InputPhase) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1158004136);
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = iArr[inputPhase322.ordinal()];
                if (i3 != 1) {
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                State stateCreateTransitionAnimation522 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf32, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                        return invoke(segment, composer2, num.intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<InputPhase> segment, @Nullable Composer composer2, int i83) {
                        FiniteAnimationSpec<Float> finiteAnimationSpecTween;
                        composer2.startReplaceableGroup(-1079955085);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1079955085, i83, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:286)");
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
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
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
                composerStartRestartGroup.startReplaceableGroup(-1376159017);
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = iArr[inputPhase522222.ordinal()];
                if (i6 == 1) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
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

                public final void invoke(@Nullable Composer composer2, int i10) {
                    this.$tmp0_rcvr.m9083TransitionDTcfvLk(inputPhase, j, j2, function3, z, function6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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

    public static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }

    public static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m11350unboximpl();
    }
}
