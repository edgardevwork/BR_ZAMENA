package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
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
@Metadata(m7104d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0015"}, m7105d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n1116#2,6:269\n1116#2,6:278\n75#3:275\n75#3:277\n154#4:276\n154#4:284\n154#4:285\n154#4:286\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n79#1:269,6\n116#1:278,6\n82#1:275\n97#1:277\n82#1:276\n265#1:284\n266#1:285\n267#1:286\n*E\n"})
/* loaded from: classes2.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = C2046Dp.m13666constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, @Nullable final Function0<Unit> function0, @Nullable Modifier modifier, boolean z2, @Nullable RadioButtonColors radioButtonColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        RadioButtonColors radioButtonColorsColors;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        ?? r12;
        final State<Color> state;
        RadioButtonColors radioButtonColors2;
        Modifier modifier4;
        int i6;
        Composer composer2;
        State<C2046Dp> state2;
        boolean z4;
        Modifier modifierM8363selectableO2vRcR0;
        final State<C2046Dp> state3;
        boolean zChanged;
        Object objRememberedValue;
        final RadioButtonColors radioButtonColors3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColorsColors = radioButtonColors;
                        int i8 = composerStartRestartGroup.changed(radioButtonColorsColors) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        radioButtonColorsColors = radioButtonColors;
                    }
                    i3 |= i8;
                } else {
                    radioButtonColorsColors = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(735546075);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifier3 = modifier5;
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier3 = modifier5;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier3 = modifier2;
                        }
                        boolean z6 = z3;
                        RadioButtonColors radioButtonColors4 = radioButtonColorsColors;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(408580840, i3, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:79)");
                        }
                        State<C2046Dp> stateM7677animateDpAsStateAjpBEmI = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(!z ? C2046Dp.m13666constructorimpl(RadioButtonDotSize / 2) : C2046Dp.m13666constructorimpl(0), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        State<Color> stateRadioColor$material3_release = radioButtonColors4.radioColor$material3_release(z6, z, composerStartRestartGroup, ((i3 >> 6) & 896) | ((i3 >> 9) & 14) | ((i3 << 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(735546399);
                        if (function0 == null) {
                            state2 = stateM7677animateDpAsStateAjpBEmI;
                            r12 = 0;
                            state = stateRadioColor$material3_release;
                            radioButtonColors2 = radioButtonColors4;
                            z4 = z6;
                            modifier4 = modifier3;
                            i6 = 2;
                            composer2 = composerStartRestartGroup;
                            modifierM8363selectableO2vRcR0 = SelectableKt.m8363selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(RadioButtonTokens.INSTANCE.m10668getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z4, Role.m12986boximpl(Role.INSTANCE.m12997getRadioButtono7Vup1c()), function0);
                        } else {
                            r12 = 0;
                            state = stateRadioColor$material3_release;
                            radioButtonColors2 = radioButtonColors4;
                            modifier4 = modifier3;
                            i6 = 2;
                            composer2 = composerStartRestartGroup;
                            state2 = stateM7677animateDpAsStateAjpBEmI;
                            z4 = z6;
                            modifierM8363selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierM8164requiredSize3ABfNKs = SizeKt.m8164requiredSize3ABfNKs(PaddingKt.m8123padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(function0 == null ? InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE) : Modifier.INSTANCE).then(modifierM8363selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, i6, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m10667getIconSizeD9Ej5fM());
                        composer2.startReplaceableGroup(735547384);
                        state3 = state2;
                        zChanged = composer2.changed(state) | composer2.changed(state3);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
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
                                    float f = 2;
                                    float f2 = fMo7874toPx0680j_4 / f;
                                    DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(C2046Dp.m13666constructorimpl(RadioButtonTokens.INSTANCE.m10667getIconSizeD9Ej5fM() / f)) - f2, 0L, 0.0f, new Stroke(fMo7874toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (C2046Dp.m13665compareTo0680j_4(state3.getValue().m13680unboximpl(), C2046Dp.m13666constructorimpl(0)) > 0) {
                                        DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(state3.getValue().m13680unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
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
                        radioButtonColors3 = radioButtonColors2;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z5 = z3;
                        radioButtonColors3 = radioButtonColorsColors;
                        composer2 = composerStartRestartGroup;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i9) {
                                RadioButtonKt.RadioButton(z, function0, modifier2, z5, radioButtonColors3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        boolean z62 = z3;
                        RadioButtonColors radioButtonColors42 = radioButtonColorsColors;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        State<C2046Dp> stateM7677animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(!z ? C2046Dp.m13666constructorimpl(RadioButtonDotSize / 2) : C2046Dp.m13666constructorimpl(0), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        State<Color> stateRadioColor$material3_release2 = radioButtonColors42.radioColor$material3_release(z62, z, composerStartRestartGroup, ((i3 >> 6) & 896) | ((i3 >> 9) & 14) | ((i3 << 3) & 112));
                        composerStartRestartGroup.startReplaceableGroup(735546399);
                        if (function0 == null) {
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierM8164requiredSize3ABfNKs2 = SizeKt.m8164requiredSize3ABfNKs(PaddingKt.m8123padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(function0 == null ? InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE) : Modifier.INSTANCE).then(modifierM8363selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r12, i6, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m10667getIconSizeD9Ej5fM());
                        composer2.startReplaceableGroup(735547384);
                        state3 = state2;
                        zChanged = composer2.changed(state) | composer2.changed(state3);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2$1
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
                                    float f = 2;
                                    float f2 = fMo7874toPx0680j_4 / f;
                                    DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(C2046Dp.m13666constructorimpl(RadioButtonTokens.INSTANCE.m10667getIconSizeD9Ej5fM() / f)) - f2, 0L, 0.0f, new Stroke(fMo7874toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (C2046Dp.m13665compareTo0680j_4(state3.getValue().m13680unboximpl(), C2046Dp.m13666constructorimpl(0)) > 0) {
                                        DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, state.getValue().m11350unboximpl(), drawScope.mo7874toPx0680j_4(state3.getValue().m13680unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            composer2.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM8164requiredSize3ABfNKs2, (Function1) objRememberedValue, composer2, r12);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier4;
                            radioButtonColors3 = radioButtonColors2;
                            z5 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((74899 & i3) == 74898) {
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
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = C2046Dp.m13666constructorimpl(f);
        RadioStrokeWidth = C2046Dp.m13666constructorimpl(f);
    }
}
