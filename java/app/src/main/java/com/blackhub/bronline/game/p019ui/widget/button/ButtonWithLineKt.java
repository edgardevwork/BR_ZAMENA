package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonWithLine.kt */
@SourceDebugExtension({"SMAP\nButtonWithLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonWithLine.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonWithLineKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,84:1\n1116#2,6:85\n68#3,6:91\n74#3:125\n78#3:130\n79#4,11:97\n92#4:129\n456#5,8:108\n464#5,3:122\n467#5,3:126\n3737#6,6:116\n*S KotlinDebug\n*F\n+ 1 ButtonWithLine.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonWithLineKt\n*L\n44#1:85,6\n37#1:91,6\n37#1:125\n37#1:130\n37#1:97,11\n37#1:129\n37#1:108,8\n37#1:122,3\n37#1:126,3\n37#1:116,6\n*E\n"})
/* loaded from: classes3.dex */
public final class ButtonWithLineKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonWithLine(@Nullable Modifier modifier, @ColorRes int i, @DimenRes int i2, @DimenRes int i3, @NotNull final String textButton, boolean z, @DimenRes int i4, float f, @NotNull final Function0<Unit> onButtonClick, @Nullable Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier2;
        final int i16;
        final int i17;
        final int i18;
        final int i19;
        final boolean z3;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(textButton, "textButton");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1626694584);
        int i21 = i6 & 1;
        if (i21 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i22 = i6 & 2;
        if (i22 != 0) {
            i7 |= 48;
        } else {
            if ((i5 & 112) == 0) {
                i8 = i;
                i7 |= composerStartRestartGroup.changed(i8) ? 32 : 16;
            }
            i9 = i6 & 4;
            if (i9 == 0) {
                i7 |= 384;
            } else {
                if ((i5 & 896) == 0) {
                    i10 = i2;
                    i7 |= composerStartRestartGroup.changed(i10) ? 256 : 128;
                }
                i11 = i6 & 8;
                if (i11 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i5 & 7168) == 0) {
                        i12 = i3;
                        i7 |= composerStartRestartGroup.changed(i12) ? 2048 : 1024;
                    }
                    if ((i6 & 16) == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else if ((57344 & i5) == 0) {
                        i7 |= composerStartRestartGroup.changed(textButton) ? 16384 : 8192;
                    }
                    i13 = i6 & 32;
                    if (i13 == 0) {
                        i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i5 & 458752) == 0) {
                        i7 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                    }
                    i14 = i6 & 64;
                    if (i14 == 0) {
                        i7 |= 1572864;
                    } else if ((i5 & 3670016) == 0) {
                        i7 |= composerStartRestartGroup.changed(i4) ? 1048576 : 524288;
                    }
                    i15 = i6 & 128;
                    if (i15 == 0) {
                        i7 |= 12582912;
                    } else if ((i5 & 29360128) == 0) {
                        i7 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    if ((i6 & 256) != 0) {
                        i20 = (i5 & 234881024) == 0 ? composerStartRestartGroup.changedInstance(onButtonClick) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                        if ((191739611 & i7) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i21 == 0 ? Modifier.INSTANCE : modifier;
                            if (i22 != 0) {
                                i8 = R.color.dark_medium_green;
                            }
                            if (i9 != 0) {
                                i10 = R.dimen._5wdp;
                            }
                            int i23 = i11 == 0 ? R.dimen._13wsp : i12;
                            boolean z4 = i13 == 0 ? true : z;
                            int i24 = i14 == 0 ? R.dimen._1wdp : i4;
                            float f3 = i15 == 0 ? 1.0f : f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1626694584, i7, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonWithLine (ButtonWithLine.kt:35)");
                            }
                            int i25 = (i7 >> 18) & 14;
                            Modifier modifierAlpha = AlphaKt.alpha(BackgroundKt.m7770backgroundbw27NRU(modifier3, ColorResources_androidKt.colorResource(i8, composerStartRestartGroup, (i7 >> 3) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i24, composerStartRestartGroup, i25))), f3);
                            composerStartRestartGroup.startReplaceableGroup(1616972179);
                            z2 = (i7 & 234881024) != 67108864;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineKt$ButtonWithLine$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        onButtonClick.invoke();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha, z4, null, null, (Function0) objRememberedValue, 6, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            float f4 = f3;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
                            Modifier modifier4 = modifier3;
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            int i26 = i8;
                            BoxKt.Box(boxScopeInstance.align(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(i10, composerStartRestartGroup, (i7 >> 6) & 14)), Color.INSTANCE.m11377getWhite0d7_KjU(), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(i24, composerStartRestartGroup, i25), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i24, composerStartRestartGroup, i25), 6, null)), companion.getCenterStart()), composerStartRestartGroup, 0);
                            int i27 = i10;
                            int i28 = i24;
                            composer2 = composerStartRestartGroup;
                            TextKt.m10024Text4IGK_g(textButton, boxScopeInstance.align(companion3, companion.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(i23, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, null, composerStartRestartGroup, ((i7 >> 9) & 14) | 12582912, 124), composer2, (i7 >> 12) & 14, 0, 65532);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            i16 = i26;
                            i17 = i27;
                            i18 = i28;
                            i19 = i23;
                            z3 = z4;
                            f2 = f4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            i18 = i4;
                            i16 = i8;
                            i17 = i10;
                            i19 = i12;
                            composer2 = composerStartRestartGroup;
                            z3 = z;
                            f2 = f;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineKt.ButtonWithLine.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i29) {
                                    ButtonWithLineKt.ButtonWithLine(modifier2, i16, i17, i19, textButton, z3, i18, f2, onButtonClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= i20;
                    if ((191739611 & i7) != 38347922) {
                        if (i21 == 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i252 = (i7 >> 18) & 14;
                        Modifier modifierAlpha2 = AlphaKt.alpha(BackgroundKt.m7770backgroundbw27NRU(modifier3, ColorResources_androidKt.colorResource(i8, composerStartRestartGroup, (i7 >> 3) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i24, composerStartRestartGroup, i252))), f3);
                        composerStartRestartGroup.startReplaceableGroup(1616972179);
                        if ((i7 & 234881024) != 67108864) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineKt$ButtonWithLine$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    onButtonClick.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierM7805clickableXHw0xAI$default2 = ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha2, z4, null, null, (Function0) objRememberedValue, 6, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            float f42 = f3;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default2);
                            Modifier modifier42 = modifier3;
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting()) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                int i262 = i8;
                                BoxKt.Box(boxScopeInstance2.align(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion32, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(i10, composerStartRestartGroup, (i7 >> 6) & 14)), Color.INSTANCE.m11377getWhite0d7_KjU(), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(i24, composerStartRestartGroup, i252), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i24, composerStartRestartGroup, i252), 6, null)), companion4.getCenterStart()), composerStartRestartGroup, 0);
                                int i272 = i10;
                                int i282 = i24;
                                composer2 = composerStartRestartGroup;
                                TextKt.m10024Text4IGK_g(textButton, boxScopeInstance2.align(companion32, companion4.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(i23, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, null, composerStartRestartGroup, ((i7 >> 9) & 14) | 12582912, 124), composer2, (i7 >> 12) & 14, 0, 65532);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier42;
                                i16 = i262;
                                i17 = i272;
                                i18 = i282;
                                i19 = i23;
                                z3 = z4;
                                f2 = f42;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i12 = i3;
                if ((i6 & 16) == 0) {
                }
                i13 = i6 & 32;
                if (i13 == 0) {
                }
                i14 = i6 & 64;
                if (i14 == 0) {
                }
                i15 = i6 & 128;
                if (i15 == 0) {
                }
                if ((i6 & 256) != 0) {
                }
                i7 |= i20;
                if ((191739611 & i7) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i10 = i2;
            i11 = i6 & 8;
            if (i11 != 0) {
            }
            i12 = i3;
            if ((i6 & 16) == 0) {
            }
            i13 = i6 & 32;
            if (i13 == 0) {
            }
            i14 = i6 & 64;
            if (i14 == 0) {
            }
            i15 = i6 & 128;
            if (i15 == 0) {
            }
            if ((i6 & 256) != 0) {
            }
            i7 |= i20;
            if ((191739611 & i7) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i;
        i9 = i6 & 4;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i6 & 8;
        if (i11 != 0) {
        }
        i12 = i3;
        if ((i6 & 16) == 0) {
        }
        i13 = i6 & 32;
        if (i13 == 0) {
        }
        i14 = i6 & 64;
        if (i14 == 0) {
        }
        i15 = i6 & 128;
        if (i15 == 0) {
        }
        if ((i6 & 256) != 0) {
        }
        i7 |= i20;
        if ((191739611 & i7) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ButtonWithLine")
    public static final void PreviewButtonWithLine(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-7582416);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-7582416, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewButtonWithLine (ButtonWithLine.kt:74)");
            }
            ButtonWithLine(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._157wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), R.color.dark_medium_green, 0, 0, "Создать", false, 0, 0.0f, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineKt.PreviewButtonWithLine.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 100687920, 236);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineKt.PreviewButtonWithLine.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ButtonWithLineKt.PreviewButtonWithLine(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

