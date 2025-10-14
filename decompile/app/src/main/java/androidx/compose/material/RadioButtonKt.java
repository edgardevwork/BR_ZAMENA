package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RadioButton.kt */
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0018"}, m7105d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n1116#3,6:235\n1116#3,6:243\n75#4:241\n75#4:252\n154#5:242\n154#5:249\n154#5:250\n154#5:251\n154#5:253\n154#5:254\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n79#1:235,6\n116#1:243,6\n83#1:241\n230#1:252\n83#1:242\n227#1:249\n228#1:250\n229#1:251\n231#1:253\n232#1:254\n*E\n"})
/* loaded from: classes2.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = C2046Dp.m13666constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, @Nullable final Function0<Unit> function0, @Nullable Modifier modifier, boolean z2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable RadioButtonColors radioButtonColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        RadioButtonColors radioButtonColors2;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier3;
        RadioButtonColors radioButtonColorsM8989colorsRGew2ao;
        float fM13666constructorimpl;
        ?? r12;
        final State<Color> state;
        RadioButtonColors radioButtonColors3;
        Modifier modifier4;
        int i6;
        Composer composer2;
        State<C2046Dp> state2;
        boolean z5;
        Modifier modifierM8363selectableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        final State<C2046Dp> state3;
        boolean zChanged;
        Object objRememberedValue;
        final RadioButtonColors radioButtonColors4;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1314435585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            int i8 = composerStartRestartGroup.changed(radioButtonColors2) ? 131072 : 65536;
                            i3 |= i8;
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i3 |= i8;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            z4 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = modifier5;
                                radioButtonColorsM8989colorsRGew2ao = RadioButtonDefaults.INSTANCE.m8989colorsRGew2ao(0L, 0L, 0L, composerStartRestartGroup, 3072, 7);
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1314435585, i3, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                                }
                                if (!z) {
                                    fM13666constructorimpl = C2046Dp.m13666constructorimpl(RadioButtonDotSize / 2);
                                } else {
                                    fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                }
                                State<C2046Dp> stateM7677animateDpAsStateAjpBEmI = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(fM13666constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                                int i9 = i3 >> 9;
                                State<Color> stateRadioColor = radioButtonColorsM8989colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i9 & 14) | (i9 & 896));
                                composerStartRestartGroup.startReplaceableGroup(1941632354);
                                if (function0 == null) {
                                    state2 = stateM7677animateDpAsStateAjpBEmI;
                                    r12 = 0;
                                    state = stateRadioColor;
                                    radioButtonColors3 = radioButtonColorsM8989colorsRGew2ao;
                                    z5 = z4;
                                    modifier4 = modifier3;
                                    i6 = 2;
                                    composer2 = composerStartRestartGroup;
                                    modifierM8363selectableO2vRcR0 = SelectableKt.m8363selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, RippleKt.m9113rememberRipple9IZ8Weo(false, RadioButtonRippleRadius, 0L, composerStartRestartGroup, 54, 4), z5, Role.m12986boximpl(Role.INSTANCE.m12997getRadioButtono7Vup1c()), function0);
                                } else {
                                    r12 = 0;
                                    state = stateRadioColor;
                                    radioButtonColors3 = radioButtonColorsM8989colorsRGew2ao;
                                    modifier4 = modifier3;
                                    i6 = 2;
                                    composer2 = composerStartRestartGroup;
                                    state2 = stateM7677animateDpAsStateAjpBEmI;
                                    z5 = z4;
                                    modifierM8363selectableO2vRcR0 = Modifier.INSTANCE;
                                }
                                composer2.endReplaceableGroup();
                                if (function0 == null) {
                                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                                } else {
                                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                                }
                                Modifier modifierM8164requiredSize3ABfNKs = SizeKt.m8164requiredSize3ABfNKs(PaddingKt.m8123padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM8363selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, i6, null), RadioButtonPadding), RadioButtonSize);
                                composer2.startReplaceableGroup(1967674979);
                                state3 = state2;
                                zChanged = composer2.changed(state) | composer2.changed(state3);
                                objRememberedValue = composer2.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DrawScope drawScope) {
                                            float fMo7874toPx0680j_4 = drawScope.mo7874toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                            float f = fMo7874toPx0680j_4 / 2;
                                            DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo7874toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                            if (C2046Dp.m13665compareTo0680j_4(state3.getValue().m13680unboximpl(), C2046Dp.m13666constructorimpl(0)) > 0) {
                                                DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(state3.getValue().m13680unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                CanvasKt.Canvas(modifierM8164requiredSize3ABfNKs, (Function1) objRememberedValue, composer2, r12);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier4;
                                radioButtonColors4 = radioButtonColors3;
                                z6 = z5;
                                mutableInteractionSource5 = mutableInteractionSource4;
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier3 = modifier5;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        radioButtonColorsM8989colorsRGew2ao = radioButtonColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        State<C2046Dp> stateM7677animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(fM13666constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        int i92 = i3 >> 9;
                        State<Color> stateRadioColor2 = radioButtonColorsM8989colorsRGew2ao.radioColor(z4, z, composerStartRestartGroup, ((i3 << 3) & 112) | (i92 & 14) | (i92 & 896));
                        composerStartRestartGroup.startReplaceableGroup(1941632354);
                        if (function0 == null) {
                        }
                        composer2.endReplaceableGroup();
                        if (function0 == null) {
                        }
                        Modifier modifierM8164requiredSize3ABfNKs2 = SizeKt.m8164requiredSize3ABfNKs(PaddingKt.m8123padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM8363selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, i6, null), RadioButtonPadding), RadioButtonSize);
                        composer2.startReplaceableGroup(1967674979);
                        state3 = state2;
                        zChanged = composer2.changed(state) | composer2.changed(state3);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope drawScope) {
                                    float fMo7874toPx0680j_4 = drawScope.mo7874toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f = fMo7874toPx0680j_4 / 2;
                                    DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo7874toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (C2046Dp.m13665compareTo0680j_4(state3.getValue().m13680unboximpl(), C2046Dp.m13666constructorimpl(0)) > 0) {
                                        DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(state3.getValue().m13680unboximpl()) - f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM8164requiredSize3ABfNKs2, (Function1) objRememberedValue, composer2, r12);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier4;
                            radioButtonColors4 = radioButtonColors3;
                            z6 = z5;
                            mutableInteractionSource5 = mutableInteractionSource4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        z6 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        radioButtonColors4 = radioButtonColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i10) {
                                RadioButtonKt.RadioButton(z, function0, modifier2, z6, mutableInteractionSource5, radioButtonColors4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= CpioConstants.C_ISBLK;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = C2046Dp.m13666constructorimpl(f);
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(20);
        RadioButtonSize = fM13666constructorimpl;
        RadioRadius = C2046Dp.m13666constructorimpl(fM13666constructorimpl / f);
        RadioButtonDotSize = C2046Dp.m13666constructorimpl(12);
        RadioStrokeWidth = C2046Dp.m13666constructorimpl(f);
    }
}
