package com.blackhub.bronline.game.p019ui.fishing;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingResultPrizeObjUi.kt */
@SourceDebugExtension({"SMAP\nFishingResultPrizeObjUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingResultPrizeObjUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingResultPrizeObjUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,104:1\n154#2:105\n154#2:106\n154#2:108\n154#2:109\n74#3:107\n*S KotlinDebug\n*F\n+ 1 FishingResultPrizeObjUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingResultPrizeObjUiKt\n*L\n34#1:105\n47#1:106\n56#1:108\n97#1:109\n52#1:107\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingResultPrizeObjUiKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: FishingResultPrizeObjUi-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14975FishingResultPrizeObjUiuFdPcIQ(@Nullable Modifier modifier, float f, @Nullable FishingBaitObj fishingBaitObj, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        FishingBaitObj fishingBaitObj2;
        Modifier modifier3;
        float f3;
        final Modifier modifier4;
        final float f4;
        final FishingBaitObj fishingBaitObj3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(522079646);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            if (i4 == 4 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    float fM13666constructorimpl = i6 == 0 ? C2046Dp.m13666constructorimpl(10) : f2;
                    if (i4 == 0) {
                        i3 &= -897;
                        modifier3 = modifier5;
                        f3 = fM13666constructorimpl;
                        fishingBaitObj2 = new FishingBaitObj(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null);
                    } else {
                        fishingBaitObj2 = fishingBaitObj;
                        modifier3 = modifier5;
                        f3 = fM13666constructorimpl;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    fishingBaitObj2 = fishingBaitObj;
                    modifier3 = modifier2;
                    f3 = f2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(522079646, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjUi (FishingResultPrizeObjUi.kt:35)");
                }
                m14974FishingResultPrizeObjContentuFdPcIQ(modifier3, f3, fishingBaitObj2, composerStartRestartGroup, (i3 & 14) | 512 | (i3 & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                f4 = f3;
                fishingBaitObj3 = fishingBaitObj2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                f4 = f2;
                fishingBaitObj3 = fishingBaitObj;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjUiKt$FishingResultPrizeObjUi$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i7) {
                        FishingResultPrizeObjUiKt.m14975FishingResultPrizeObjUiuFdPcIQ(modifier4, f4, fishingBaitObj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        f2 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        if (i4 == 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m14974FishingResultPrizeObjContentuFdPcIQ(modifier3, f3, fishingBaitObj2, composerStartRestartGroup, (i3 & 14) | 512 | (i3 & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                f4 = f3;
                fishingBaitObj3 = fishingBaitObj2;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: FishingResultPrizeObjContent-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14974FishingResultPrizeObjContentuFdPcIQ(Modifier modifier, float f, FishingBaitObj fishingBaitObj, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        FishingBaitObj fishingBaitObj2;
        Modifier modifier3;
        final float f3;
        final ImageBitmap bitmapRender;
        final Modifier modifier4;
        final FishingBaitObj fishingBaitObj3;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1483519431);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            if (i4 == 4 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    float fM13666constructorimpl = i6 == 0 ? C2046Dp.m13666constructorimpl(10) : f2;
                    if (i4 == 0) {
                        i3 &= -897;
                        modifier3 = modifier5;
                        f3 = fM13666constructorimpl;
                        fishingBaitObj2 = new FishingBaitObj(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null);
                    } else {
                        fishingBaitObj2 = fishingBaitObj;
                        modifier3 = modifier5;
                        f3 = fM13666constructorimpl;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    fishingBaitObj2 = fishingBaitObj;
                    modifier3 = modifier2;
                    f3 = f2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1483519431, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjContent (FishingResultPrizeObjUi.kt:48)");
                }
                bitmapRender = fishingBaitObj2.getBitmapRender();
                composerStartRestartGroup.startReplaceableGroup(-565554195);
                if (bitmapRender == null) {
                    Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    bitmapRender = AndroidImageBitmap_androidKt.asImageBitmap(BitmapUtilsKt.getBitmap(resources, R.drawable.img_logo_br_big));
                }
                composerStartRestartGroup.endReplaceableGroup();
                final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(5);
                final float f5 = 500.0f;
                float f6 = f3;
                SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3), Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702325748, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjUiKt$FishingResultPrizeObjContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1702325748, i7, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjContent.<anonymous> (FishingResultPrizeObjUi.kt:64)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(BorderKt.border(companion, BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), Color.INSTANCE.m11377getWhite0d7_KjU()), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3)), ColorResources_androidKt.colorResource(R.color.black_60, composer2, 6), null, 2, null), fM13666constructorimpl2);
                            float f7 = f5;
                            ImageBitmap imageBitmap = bitmapRender;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            GradientSphereKt.GradientSphere(SizeKt.m8172size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6)), null, null, new Pair[0], 0.0f, f7, composer2, 200704, 22);
                            ImageKt.m7827Image5hnEew(imageBitmap, null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 440, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 12583296, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                fishingBaitObj3 = fishingBaitObj2;
                f4 = f6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                f4 = f2;
                fishingBaitObj3 = fishingBaitObj;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjUiKt$FishingResultPrizeObjContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i7) {
                        FishingResultPrizeObjUiKt.m14974FishingResultPrizeObjContentuFdPcIQ(modifier4, f4, fishingBaitObj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        f2 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        if (i4 == 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                bitmapRender = fishingBaitObj2.getBitmapRender();
                composerStartRestartGroup.startReplaceableGroup(-565554195);
                if (bitmapRender == null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(5);
                final float f52 = 500.0f;
                float f62 = f3;
                SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3), Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702325748, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjUiKt$FishingResultPrizeObjContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1702325748, i7, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjContent.<anonymous> (FishingResultPrizeObjUi.kt:64)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(BorderKt.border(companion, BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), Color.INSTANCE.m11377getWhite0d7_KjU()), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f3)), ColorResources_androidKt.colorResource(R.color.black_60, composer2, 6), null, 2, null), fM13666constructorimpl22);
                            float f7 = f52;
                            ImageBitmap imageBitmap = bitmapRender;
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            GradientSphereKt.GradientSphere(SizeKt.m8172size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6)), null, null, new Pair[0], 0.0f, f7, composer2, 200704, 22);
                            ImageKt.m7827Image5hnEew(imageBitmap, null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 440, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 12583296, 120);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                fishingBaitObj3 = fishingBaitObj2;
                f4 = f62;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "FishingResultPrizeObjUi")
    public static final void PreviewFishingResultPrizeObjUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(884542016);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(884542016, i, -1, "com.blackhub.bronline.game.ui.fishing.PreviewFishingResultPrizeObjUi (FishingResultPrizeObjUi.kt:94)");
            }
            float f = 100;
            m14974FishingResultPrizeObjContentuFdPcIQ(SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(f), C2046Dp.m13666constructorimpl(f)), 0.0f, new FishingBaitObj(null, 0, null, null, "Нерка", 0.0f, "ic_fish_tackle", 0, 2, null, 687, null), composerStartRestartGroup, 518, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultPrizeObjUiKt.PreviewFishingResultPrizeObjUi.1
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
                    FishingResultPrizeObjUiKt.PreviewFishingResultPrizeObjUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

