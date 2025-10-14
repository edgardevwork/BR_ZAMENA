package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonWithLineWithContent.kt */
@SourceDebugExtension({"SMAP\nButtonWithLineWithContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonWithLineWithContent.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonWithLineWithContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,92:1\n1116#2,6:93\n68#3,6:99\n74#3:133\n69#3,5:170\n74#3:203\n78#3:208\n78#3:218\n79#4,11:105\n79#4,11:141\n79#4,11:175\n92#4:207\n92#4:212\n92#4:217\n456#5,8:116\n464#5,3:130\n456#5,8:152\n464#5,3:166\n456#5,8:186\n464#5,3:200\n467#5,3:204\n467#5,3:209\n467#5,3:214\n3737#6,6:124\n3737#6,6:160\n3737#6,6:194\n86#7,7:134\n93#7:169\n97#7:213\n*S KotlinDebug\n*F\n+ 1 ButtonWithLineWithContent.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonWithLineWithContentKt\n*L\n45#1:93,6\n38#1:99,6\n38#1:133\n63#1:170,5\n63#1:203\n63#1:208\n38#1:218\n38#1:105,11\n49#1:141,11\n63#1:175,11\n63#1:207\n49#1:212\n38#1:217\n38#1:116,8\n38#1:130,3\n49#1:152,8\n49#1:166,3\n63#1:186,8\n63#1:200,3\n63#1:204,3\n49#1:209,3\n38#1:214,3\n38#1:124,6\n49#1:160,6\n63#1:194,6\n49#1:134,7\n49#1:169\n49#1:213\n*E\n"})
/* loaded from: classes3.dex */
public final class ButtonWithLineWithContentKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonWithLineWithContent(@Nullable Modifier modifier, @ColorRes final int i, boolean z, @DimenRes int i2, float f, @NotNull final Function0<Unit> onButtonClick, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Modifier modifier3;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1318814755);
        int i11 = i4 & 1;
        if (i11 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 14) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i12 = i4 & 4;
        if (i12 != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 896) == 0) {
                z2 = z;
                i5 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 7168) == 0) {
                    i7 = i2;
                    i5 |= composerStartRestartGroup.changed(i7) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= CpioConstants.C_ISBLK;
                } else {
                    if ((57344 & i3) == 0) {
                        f2 = f;
                        i5 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                    }
                    if ((i4 & 32) == 0) {
                        i9 = ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else {
                        if ((i3 & 458752) == 0) {
                            i9 = composerStartRestartGroup.changedInstance(onButtonClick) ? 131072 : 65536;
                        }
                        if ((i4 & 64) == 0) {
                            i10 = (3670016 & i3) == 0 ? composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288 : 1572864;
                            if ((2995931 & i5) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    i7 = R.dimen._1wdp;
                                }
                                if (i8 != 0) {
                                    f2 = 1.0f;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1318814755, i5, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContent (ButtonWithLineWithContent.kt:36)");
                                }
                                int i13 = (i5 >> 9) & 14;
                                Modifier modifierAlpha = AlphaKt.alpha(BackgroundKt.m7770backgroundbw27NRU(modifier4, ColorResources_androidKt.colorResource(i, composerStartRestartGroup, (i5 >> 3) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i7, composerStartRestartGroup, i13))), f2);
                                composerStartRestartGroup.startReplaceableGroup(80456464);
                                z3 = (i5 & 458752) != 131072;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContentKt$ButtonWithLineWithContent$1$1
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
                                Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha, z2, null, null, (Function0) objRememberedValue, 6, null);
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
                                modifier3 = modifier4;
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
                                composerStartRestartGroup.startReplaceableGroup(693286680);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor2);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(i7, composerStartRestartGroup, i13), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i7, composerStartRestartGroup, i13), 6, null)), composerStartRestartGroup, 0);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                                Alignment center = companion.getCenter();
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor3);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                content.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 18) & 14));
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                            }
                            final boolean z4 = z2;
                            final int i14 = i7;
                            final float f3 = f2;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier5 = modifier3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContentKt.ButtonWithLineWithContent.3
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

                                    public final void invoke(@Nullable Composer composer2, int i15) {
                                        ButtonWithLineWithContentKt.ButtonWithLineWithContent(modifier5, i, z4, i14, f3, onButtonClick, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= i10;
                        if ((2995931 & i5) == 599186) {
                            if (i11 == 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i132 = (i5 >> 9) & 14;
                            Modifier modifierAlpha2 = AlphaKt.alpha(BackgroundKt.m7770backgroundbw27NRU(modifier4, ColorResources_androidKt.colorResource(i, composerStartRestartGroup, (i5 >> 3) & 14), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i7, composerStartRestartGroup, i132))), f2);
                            composerStartRestartGroup.startReplaceableGroup(80456464);
                            if ((i5 & 458752) != 131072) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z3) {
                                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContentKt$ButtonWithLineWithContent$1$1
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
                                Modifier modifierM7805clickableXHw0xAI$default2 = ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha2, z2, null, null, (Function0) objRememberedValue, 6, null);
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default2);
                                modifier3 = modifier4;
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl.getInserting()) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composerStartRestartGroup.startReplaceableGroup(693286680);
                                    Modifier.Companion companion32 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion32);
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl2.getInserting()) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion32, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(i7, composerStartRestartGroup, i132), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i7, composerStartRestartGroup, i132), 6, null)), composerStartRestartGroup, 0);
                                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null);
                                        Alignment center2 = companion4.getCenter();
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl3.getInserting()) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            content.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 18) & 14));
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final boolean z42 = z2;
                        final int i142 = i7;
                        final float f32 = f2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i5 |= i9;
                    if ((i4 & 64) == 0) {
                    }
                    i5 |= i10;
                    if ((2995931 & i5) == 599186) {
                    }
                    final boolean z422 = z2;
                    final int i1422 = i7;
                    final float f322 = f2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                f2 = f;
                if ((i4 & 32) == 0) {
                }
                i5 |= i9;
                if ((i4 & 64) == 0) {
                }
                i5 |= i10;
                if ((2995931 & i5) == 599186) {
                }
                final boolean z4222 = z2;
                final int i14222 = i7;
                final float f3222 = f2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i2;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            f2 = f;
            if ((i4 & 32) == 0) {
            }
            i5 |= i9;
            if ((i4 & 64) == 0) {
            }
            i5 |= i10;
            if ((2995931 & i5) == 599186) {
            }
            final boolean z42222 = z2;
            final int i142222 = i7;
            final float f32222 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i2;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        f2 = f;
        if ((i4 & 32) == 0) {
        }
        i5 |= i9;
        if ((i4 & 64) == 0) {
        }
        i5 |= i10;
        if ((2995931 & i5) == 599186) {
        }
        final boolean z422222 = z2;
        final int i1422222 = i7;
        final float f322222 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void ButtonWithLineWithContentPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-359269356);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359269356, i, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContentPreview (ButtonWithLineWithContent.kt:75)");
            }
            ButtonWithLineWithContent(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._157wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), R.color.dark_medium_green, false, 0, 0.0f, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContentKt.ButtonWithLineWithContentPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$ButtonWithLineWithContentKt.INSTANCE.m15074getLambda1$app_siteRelease(), composerStartRestartGroup, 1769520, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonWithLineWithContentKt.ButtonWithLineWithContentPreview.2
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
                    ButtonWithLineWithContentKt.ButtonWithLineWithContentPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

