package com.blackhub.bronline.game.p019ui.widget.progressbar;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
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
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressBarHorizontal.kt */
@SourceDebugExtension({"SMAP\nProgressBarHorizontal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressBarHorizontal.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/ProgressBarHorizontalKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,62:1\n75#2:63\n68#3,6:64\n74#3:98\n78#3:103\n79#4,11:70\n92#4:102\n456#5,8:81\n464#5,3:95\n467#5,3:99\n3737#6,6:89\n*S KotlinDebug\n*F\n+ 1 ProgressBarHorizontal.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/ProgressBarHorizontalKt\n*L\n32#1:63\n34#1:64,6\n34#1:98\n34#1:103\n34#1:70,11\n34#1:102\n34#1:81,8\n34#1:95,3\n34#1:99,3\n34#1:89,6\n*E\n"})
/* loaded from: classes3.dex */
public final class ProgressBarHorizontalKt {
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: ProgressBarHorizontal-2uT47r8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15102ProgressBarHorizontal2uT47r8(@Nullable Modifier modifier, final float f, float f2, float f3, final long j, final long j2, float f4, @Nullable Shape shape, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float fDimensionResource;
        float fDimensionResource2;
        float fDimensionResource3;
        Shape shapeM8392RoundedCornerShape0680j_4;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final float f5;
        final Shape shape2;
        final float f6;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-746947432);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                fDimensionResource = f2;
                int i5 = composerStartRestartGroup.changed(fDimensionResource) ? 256 : 128;
                i3 |= i5;
            } else {
                fDimensionResource = f2;
            }
            i3 |= i5;
        } else {
            fDimensionResource = f2;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                fDimensionResource2 = f3;
                int i6 = composerStartRestartGroup.changed(fDimensionResource2) ? 2048 : 1024;
                i3 |= i6;
            } else {
                fDimensionResource2 = f3;
            }
            i3 |= i6;
        } else {
            fDimensionResource2 = f3;
        }
        if ((i2 & 16) == 0) {
            if ((57344 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((458752 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
            }
            if ((3670016 & i) != 0) {
                if ((i2 & 64) == 0) {
                    fDimensionResource3 = f4;
                    int i7 = composerStartRestartGroup.changed(fDimensionResource3) ? 1048576 : 524288;
                    i3 |= i7;
                } else {
                    fDimensionResource3 = f4;
                }
                i3 |= i7;
            } else {
                fDimensionResource3 = f4;
            }
            if ((i & 29360128) == 0) {
                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
            }
            if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._154sdp, composerStartRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                    }
                    if ((i2 & 64) != 0) {
                        fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) == 0) {
                        i3 &= -29360129;
                        shapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(fDimensionResource2 / 2));
                    }
                    float f8 = fDimensionResource3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-746947432, i3, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontal (ProgressBarHorizontal.kt:32)");
                    }
                    Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, fDimensionResource), fDimensionResource2), shapeM8392RoundedCornerShape0680j_4), j, null, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BoxKt.Box(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, f8), shapeM8392RoundedCornerShape0680j_4), j2, null, 2, null), 0.0f, 1, null), f), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f8;
                    shape2 = shapeM8392RoundedCornerShape0680j_4;
                    f6 = fDimensionResource;
                    f7 = fDimensionResource2;
                }
                shapeM8392RoundedCornerShape0680j_4 = shape;
                float f82 = fDimensionResource3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM7771backgroundbw27NRU$default2 = BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, fDimensionResource), fDimensionResource2), shapeM8392RoundedCornerShape0680j_4), j, null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    BoxKt.Box(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, f82), shapeM8392RoundedCornerShape0680j_4), j2, null, 2, null), 0.0f, 1, null), f), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f5 = f82;
                    shape2 = shapeM8392RoundedCornerShape0680j_4;
                    f6 = fDimensionResource;
                    f7 = fDimensionResource2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                shape2 = shape;
                f6 = fDimensionResource;
                f7 = fDimensionResource2;
                f5 = fDimensionResource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalKt$ProgressBarHorizontal$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i8) {
                        ProgressBarHorizontalKt.m15102ProgressBarHorizontal2uT47r8(modifier3, f, f6, f7, j, j2, f5, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= CpioConstants.C_ISBLK;
        if ((i2 & 32) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i4 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                    shapeM8392RoundedCornerShape0680j_4 = shape;
                }
                float f822 = fDimensionResource3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM7771backgroundbw27NRU$default22 = BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, fDimensionResource), fDimensionResource2), shapeM8392RoundedCornerShape0680j_4), j, null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default22);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ProgressBarHorizontal")
    public static final void PreviewProgressBarHorizontal(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1413027684);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1413027684, i, -1, "com.blackhub.bronline.game.ui.widget.progressbar.PreviewProgressBarHorizontal (ProgressBarHorizontal.kt:54)");
            }
            m15102ProgressBarHorizontal2uT47r8(Modifier.INSTANCE, 0.5f, 0.0f, 0.0f, ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.light_green, composerStartRestartGroup, 6), 0.0f, null, composerStartRestartGroup, 54, 204);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalKt.PreviewProgressBarHorizontal.1
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
                    ProgressBarHorizontalKt.PreviewProgressBarHorizontal(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

