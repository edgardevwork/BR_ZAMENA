package com.blackhub.bronline.game.p019ui.cases;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseRewardTriangleDecoration.kt */
@SourceDebugExtension({"SMAP\nCaseRewardTriangleDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseRewardTriangleDecoration.kt\ncom/blackhub/bronline/game/ui/cases/CaseRewardTriangleDecorationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,75:1\n154#2:76\n154#2:117\n74#3:77\n69#4,5:78\n74#4:111\n78#4:116\n79#5,11:83\n92#5:115\n456#6,8:94\n464#6,3:108\n467#6,3:112\n3737#7,6:102\n*S KotlinDebug\n*F\n+ 1 CaseRewardTriangleDecoration.kt\ncom/blackhub/bronline/game/ui/cases/CaseRewardTriangleDecorationKt\n*L\n32#1:76\n74#1:117\n36#1:77\n42#1:78,5\n42#1:111\n42#1:116\n42#1:83,11\n42#1:115\n42#1:94,8\n42#1:108,3\n42#1:112,3\n42#1:102,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CaseRewardTriangleDecorationKt {
    public static final float ANGLE = 45.0f;
    public static final float SCALE = 1.5f;

    /* compiled from: CaseRewardTriangleDecoration.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.CaseRewardTriangleDecorationKt$CaseRewardTriangleDecorationPreview$1 */
    public static final class C51111 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51111(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CaseRewardTriangleDecorationKt.CaseRewardTriangleDecorationPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01c2 A[LOOP:0: B:209:0x01c0->B:210:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CaseRewardTriangleDecoration-EGPIBPM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14926CaseRewardTriangleDecorationEGPIBPM(final float f, final float f2, int i, float f3, @DimenRes int i2, @DimenRes int i3, @Nullable Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        final float fM13666constructorimpl;
        int i9;
        final int i10;
        int i11;
        int i12;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final int i13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1865776590);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i14 = i5 & 4;
        if (i14 != 0) {
            i6 |= 384;
        } else {
            if ((i4 & 896) == 0) {
                i7 = i;
                i6 |= composerStartRestartGroup.changed(i7) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else {
                if ((i4 & 7168) == 0) {
                    fM13666constructorimpl = f3;
                    i6 |= composerStartRestartGroup.changed(fM13666constructorimpl) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i6 |= CpioConstants.C_ISBLK;
                } else {
                    if ((57344 & i4) == 0) {
                        i10 = i2;
                        i6 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        if ((458752 & i4) == 0) {
                            i12 = i3;
                            i6 |= composerStartRestartGroup.changed(i12) ? 131072 : 65536;
                        }
                        if ((374491 & i6) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i14 != 0) {
                                i7 = 0;
                            }
                            if (i8 != 0) {
                                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                            }
                            if (i9 != 0) {
                                i10 = R.dimen._25wdp;
                            }
                            if (i11 != 0) {
                                i12 = R.dimen._38wdp;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1865776590, i6, -1, "com.blackhub.bronline.game.ui.cases.CaseRewardTriangleDecoration (CaseRewardTriangleDecoration.kt:34)");
                            }
                            final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._500wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._500wdp, composerStartRestartGroup, 6));
                            Modifier modifierM8083offsetVpY3zN4 = OffsetKt.m8083offsetVpY3zN4(ScaleKt.scale(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, f), f2), 1.5f, 1.5f), fM13666constructorimpl, PrimitiveResources_androidKt.dimensionResource(i12, composerStartRestartGroup, (i6 >> 15) & 14));
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8083offsetVpY3zN4);
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
                            composerStartRestartGroup.startReplaceableGroup(-1872787119);
                            for (i13 = 0; i13 < i7; i13++) {
                                BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(RotateKt.rotate(OffsetKt.offset(modifierM8158height3ABfNKs, new Function1<Density, IntOffset>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardTriangleDecorationKt$CaseRewardTriangleDecoration$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m13785boximpl(m14927invokeBjo55l4(density));
                                    }

                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m14927invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset((int) offset.mo7874toPx0680j_4(fM13666constructorimpl), (int) (resources.getDimension(i10) * i13));
                                    }
                                }), 45.0f), ColorResources_androidKt.colorResource(R.color.white_15, composerStartRestartGroup, 6), null, 2, null), composerStartRestartGroup, 0);
                            }
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
                        }
                        final float f4 = fM13666constructorimpl;
                        final int i15 = i10;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final int i16 = i7;
                            final int i17 = i12;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardTriangleDecorationKt$CaseRewardTriangleDecoration$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i18) {
                                    CaseRewardTriangleDecorationKt.m14926CaseRewardTriangleDecorationEGPIBPM(f, f2, i16, f4, i15, i17, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    i12 = i3;
                    if ((374491 & i6) != 74898) {
                        if (i14 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._500wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._500wdp, composerStartRestartGroup, 6));
                        Modifier modifierM8083offsetVpY3zN42 = OffsetKt.m8083offsetVpY3zN4(ScaleKt.scale(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion3, f), f2), 1.5f, 1.5f), fM13666constructorimpl, PrimitiveResources_androidKt.dimensionResource(i12, composerStartRestartGroup, (i6 >> 15) & 14));
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8083offsetVpY3zN42);
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
                            composerStartRestartGroup.startReplaceableGroup(-1872787119);
                            while (i13 < i7) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                    final float f42 = fM13666constructorimpl;
                    final int i152 = i10;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i2;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i3;
                if ((374491 & i6) != 74898) {
                }
                final float f422 = fM13666constructorimpl;
                final int i1522 = i10;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM13666constructorimpl = f3;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            i10 = i2;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i3;
            if ((374491 & i6) != 74898) {
            }
            final float f4222 = fM13666constructorimpl;
            final int i15222 = i10;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        fM13666constructorimpl = f3;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        i10 = i2;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i3;
        if ((374491 & i6) != 74898) {
        }
        final float f42222 = fM13666constructorimpl;
        final int i152222 = i10;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CaseRewardTriangleDecorationPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1364265055);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364265055, i, -1, "com.blackhub.bronline.game.ui.cases.CaseRewardTriangleDecorationPreview (CaseRewardTriangleDecoration.kt:72)");
            }
            m14926CaseRewardTriangleDecorationEGPIBPM(C2046Dp.m13666constructorimpl(100), C2046Dp.m13666constructorimpl(110), 3, 0.0f, 0, 0, composerStartRestartGroup, 438, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardTriangleDecorationKt.CaseRewardTriangleDecorationPreview.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C51111(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CaseRewardTriangleDecorationKt.CaseRewardTriangleDecorationPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

