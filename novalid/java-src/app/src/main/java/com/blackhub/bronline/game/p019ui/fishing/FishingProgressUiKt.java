package com.blackhub.bronline.game.p019ui.fishing;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingProgressUi.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a!\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u0005X\u008a\u0084\u0002"}, m7105d2 = {"FishingProgressContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "progressRotate", "", "currentProgress", "", "(Landroidx/compose/ui/Modifier;FILandroidx/compose/runtime/Composer;II)V", "FishingProgressUi", "(FILandroidx/compose/runtime/Composer;II)V", "PreviewFishingProgressUi", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "animatedProgress"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFishingProgressUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingProgressUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingProgressUiKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,207:1\n69#2,5:208\n74#2:241\n68#2,6:259\n74#2:293\n78#2:299\n78#2:304\n79#3,11:213\n79#3,11:265\n92#3:298\n92#3:303\n456#4,8:224\n464#4,3:238\n456#4,8:276\n464#4,3:290\n467#4,3:295\n467#4,3:300\n3737#5,6:232\n3737#5,6:284\n75#6:242\n58#6:243\n58#6:244\n75#6:245\n75#6:246\n58#6:247\n75#6:248\n92#6:249\n51#6:250\n51#6:251\n64#6:294\n154#7:252\n1116#8,6:253\n81#9:305\n*S KotlinDebug\n*F\n+ 1 FishingProgressUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingProgressUiKt\n*L\n58#1:208,5\n58#1:241\n171#1:259,6\n171#1:293\n171#1:299\n58#1:304\n58#1:213,11\n171#1:265,11\n171#1:298\n58#1:303\n58#1:224,8\n58#1:238,3\n171#1:276,8\n171#1:290,3\n171#1:295,3\n58#1:300,3\n58#1:232,6\n171#1:284,6\n72#1:242\n72#1:243\n78#1:244\n78#1:245\n80#1:246\n80#1:247\n84#1:248\n85#1:249\n88#1:250\n90#1:251\n179#1:294\n93#1:252\n111#1:253,6\n101#1:305\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingProgressUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FishingProgressUi(final float f, final int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1837271395);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                f = 0.0f;
            }
            if (i6 != 0) {
                i = 0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1837271395, i4, -1, "com.blackhub.bronline.game.ui.fishing.FishingProgressUi (FishingProgressUi.kt:44)");
            }
            FishingProgressContent(null, f, i, composerStartRestartGroup, (i4 << 3) & 1008, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingProgressUiKt.FishingProgressUi.1
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
                    FishingProgressUiKt.FishingProgressUi(f, i, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FishingProgressContent(Modifier modifier, float f, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final long jColorResource;
        final long jColorResource2;
        final long jColorResource3;
        final long jColorResource4;
        final long jColorResource5;
        final float fDimensionResource;
        final float fDimensionResource2;
        final float fDimensionResource3;
        final float fM13666constructorimpl;
        final float fM13666constructorimpl2;
        final float fDimensionResource4;
        final float fM13666constructorimpl3;
        final float fM13666constructorimpl4;
        final float fM13666constructorimpl5;
        final float fM13666constructorimpl6;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final int i7;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1811925323);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                f2 = f;
                i4 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
                }
                if ((i4 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    float f4 = i9 == 0 ? 0.0f : f2;
                    int i10 = i5 == 0 ? 0 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1811925323, i4, -1, "com.blackhub.bronline.game.ui.fishing.FishingProgressContent (FishingProgressUi.kt:56)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment bottomCenter = companion.getBottomCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
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
                    jColorResource = ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6);
                    jColorResource2 = ColorResources_androidKt.colorResource(R.color.light_green, composerStartRestartGroup, 6);
                    long jColorResource6 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                    long jColorResource7 = ColorResources_androidKt.colorResource(R.color.black_70, composerStartRestartGroup, 6);
                    jColorResource3 = ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6);
                    jColorResource4 = ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6);
                    jColorResource5 = ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6);
                    float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composerStartRestartGroup, 6);
                    fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composerStartRestartGroup, 6);
                    float f5 = 2;
                    float fM13666constructorimpl7 = C2046Dp.m13666constructorimpl(fDimensionResource5 - C2046Dp.m13666constructorimpl(fDimensionResource / f5));
                    float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._140sdp, composerStartRestartGroup, 6);
                    float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composerStartRestartGroup, 6);
                    fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6);
                    Modifier modifier4 = modifier3;
                    fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._102sdp, composerStartRestartGroup, 6);
                    fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fDimensionResource6 - fDimensionResource3) / f5);
                    fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(fDimensionResource7 - C2046Dp.m13666constructorimpl(fDimensionResource2 / f5));
                    fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                    fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._100sdp, composerStartRestartGroup, 6) / 100) * i10);
                    fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(fM13666constructorimpl + PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6));
                    fM13666constructorimpl5 = C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6) + fM13666constructorimpl2);
                    float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._minus28sdp, composerStartRestartGroup, 6);
                    fM13666constructorimpl6 = C2046Dp.m13666constructorimpl(10);
                    int i11 = i10;
                    State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f4, AnimationSpecKt.tween$default(60, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, (i4 >> 3) & 14, 20);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, fDimensionResource5, 7, null), fDimensionResource6, fDimensionResource7);
                    composerStartRestartGroup.startReplaceableGroup(834260562);
                    zChanged = composerStartRestartGroup.changed(jColorResource) | composerStartRestartGroup.changed(fDimensionResource) | composerStartRestartGroup.changed(jColorResource2) | composerStartRestartGroup.changed(fDimensionResource3) | composerStartRestartGroup.changed(fDimensionResource2) | composerStartRestartGroup.changed(fM13666constructorimpl) | composerStartRestartGroup.changed(fM13666constructorimpl2) | composerStartRestartGroup.changed(jColorResource3) | composerStartRestartGroup.changed(jColorResource4) | composerStartRestartGroup.changed(jColorResource5) | composerStartRestartGroup.changed(fM13666constructorimpl3) | composerStartRestartGroup.changed(fDimensionResource4) | composerStartRestartGroup.changed(fM13666constructorimpl4) | composerStartRestartGroup.changed(fM13666constructorimpl5);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final float f6 = 180.0f;
                        final float f7 = 180.0f;
                        final float f8 = 225.0f;
                        final float f9 = 90.0f;
                        objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingProgressUiKt$FishingProgressContent$1$1$1
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
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                long j = jColorResource;
                                float f10 = f6;
                                float f11 = f7;
                                long jSize = androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 2.0f);
                                float fMo7874toPx0680j_4 = Canvas.mo7874toPx0680j_4(fDimensionResource);
                                StrokeCap.Companion companion4 = StrokeCap.INSTANCE;
                                DrawScope.m11869drawArcyD3GUKo$default(Canvas, j, f10, f11, false, 0L, jSize, 0.0f, new Stroke(fMo7874toPx0680j_4, 0.0f, companion4.m11694getSquareKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
                                DrawScope.m11869drawArcyD3GUKo$default(Canvas, jColorResource2, f8, f9, false, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 2.0f), 0.0f, new Stroke(Canvas.mo7874toPx0680j_4(fDimensionResource), 0.0f, companion4.m11694getSquareKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
                                long jSize2 = androidx.compose.p003ui.geometry.SizeKt.Size(Canvas.mo7874toPx0680j_4(fDimensionResource3), Canvas.mo7874toPx0680j_4(fDimensionResource2));
                                long jCornerRadius = CornerRadiusKt.CornerRadius(Canvas.mo7874toPx0680j_4(fM13666constructorimpl6), Canvas.mo7874toPx0680j_4(fM13666constructorimpl6));
                                DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, jColorResource3, OffsetKt.Offset(Canvas.mo7874toPx0680j_4(fM13666constructorimpl), Canvas.mo7874toPx0680j_4(fM13666constructorimpl2)), jSize2, jCornerRadius, null, 0.0f, null, 0, 240, null);
                                DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource4), Color.m11330boximpl(jColorResource5)}), 0.0f, 0.0f, 0, 14, (Object) null), OffsetKt.Offset(Canvas.mo7874toPx0680j_4(fM13666constructorimpl4), Canvas.mo7874toPx0680j_4(fM13666constructorimpl5)), androidx.compose.p003ui.geometry.SizeKt.Size(Canvas.mo7874toPx0680j_4(fM13666constructorimpl3), Canvas.mo7874toPx0680j_4(fDimensionResource4)), CornerRadiusKt.CornerRadius(Canvas.mo7874toPx0680j_4(fM13666constructorimpl6), Canvas.mo7874toPx0680j_4(fM13666constructorimpl6)), 0.0f, null, null, 0, 240, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM8174sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_value_and_percent, new Object[]{Integer.valueOf(i11)}, composerStartRestartGroup, 70), androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(companion3, 0.0f, fDimensionResource8, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(0L, TextAlign.INSTANCE.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, fM13666constructorimpl7, 7, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxKt.Box(BackgroundKt.background$default(androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(RotateKt.rotate(SizeKt.m8172size3ABfNKs(companion3, fDimensionResource), FishingProgressContent$lambda$3$lambda$0(stateAnimateFloatAsState)), C2046Dp.m13666constructorimpl(-fDimensionResource7), 0.0f, 2, null), Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource6), Color.m11330boximpl(jColorResource7)}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), composerStartRestartGroup, 0);
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
                    i7 = i11;
                    f3 = f4;
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    i7 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingProgressUiKt.FishingProgressContent.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            FishingProgressUiKt.FishingProgressContent(modifier5, f3, i7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 384;
            i6 = i;
            if ((i4 & 731) != 146) {
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment bottomCenter2 = companion4.getBottomCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(bottomCenter2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    jColorResource = ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6);
                    jColorResource2 = ColorResources_androidKt.colorResource(R.color.light_green, composerStartRestartGroup, 6);
                    long jColorResource62 = ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6);
                    long jColorResource72 = ColorResources_androidKt.colorResource(R.color.black_70, composerStartRestartGroup, 6);
                    jColorResource3 = ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6);
                    jColorResource4 = ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6);
                    jColorResource5 = ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6);
                    float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composerStartRestartGroup, 6);
                    fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composerStartRestartGroup, 6);
                    float f52 = 2;
                    float fM13666constructorimpl72 = C2046Dp.m13666constructorimpl(fDimensionResource52 - C2046Dp.m13666constructorimpl(fDimensionResource / f52));
                    float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._140sdp, composerStartRestartGroup, 6);
                    float fDimensionResource72 = PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composerStartRestartGroup, 6);
                    fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6);
                    Modifier modifier42 = modifier3;
                    fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._102sdp, composerStartRestartGroup, 6);
                    fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fDimensionResource62 - fDimensionResource3) / f52);
                    fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(fDimensionResource72 - C2046Dp.m13666constructorimpl(fDimensionResource2 / f52));
                    fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                    fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._100sdp, composerStartRestartGroup, 6) / 100) * i10);
                    fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(fM13666constructorimpl + PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6));
                    fM13666constructorimpl5 = C2046Dp.m13666constructorimpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6) + fM13666constructorimpl2);
                    float fDimensionResource82 = PrimitiveResources_androidKt.dimensionResource(R.dimen._minus28sdp, composerStartRestartGroup, 6);
                    fM13666constructorimpl6 = C2046Dp.m13666constructorimpl(10);
                    int i112 = i10;
                    State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f4, AnimationSpecKt.tween$default(60, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, (i4 >> 3) & 14, 20);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, fDimensionResource52, 7, null), fDimensionResource62, fDimensionResource72);
                    composerStartRestartGroup.startReplaceableGroup(834260562);
                    zChanged = composerStartRestartGroup.changed(jColorResource) | composerStartRestartGroup.changed(fDimensionResource) | composerStartRestartGroup.changed(jColorResource2) | composerStartRestartGroup.changed(fDimensionResource3) | composerStartRestartGroup.changed(fDimensionResource2) | composerStartRestartGroup.changed(fM13666constructorimpl) | composerStartRestartGroup.changed(fM13666constructorimpl2) | composerStartRestartGroup.changed(jColorResource3) | composerStartRestartGroup.changed(jColorResource4) | composerStartRestartGroup.changed(jColorResource5) | composerStartRestartGroup.changed(fM13666constructorimpl3) | composerStartRestartGroup.changed(fDimensionResource4) | composerStartRestartGroup.changed(fM13666constructorimpl4) | composerStartRestartGroup.changed(fM13666constructorimpl5);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        final float f62 = 180.0f;
                        final float f72 = 180.0f;
                        final float f82 = 225.0f;
                        final float f92 = 90.0f;
                        objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingProgressUiKt$FishingProgressContent$1$1$1
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
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                long j = jColorResource;
                                float f10 = f62;
                                float f11 = f72;
                                long jSize = androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 2.0f);
                                float fMo7874toPx0680j_4 = Canvas.mo7874toPx0680j_4(fDimensionResource);
                                StrokeCap.Companion companion42 = StrokeCap.INSTANCE;
                                DrawScope.m11869drawArcyD3GUKo$default(Canvas, j, f10, f11, false, 0L, jSize, 0.0f, new Stroke(fMo7874toPx0680j_4, 0.0f, companion42.m11694getSquareKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
                                DrawScope.m11869drawArcyD3GUKo$default(Canvas, jColorResource2, f82, f92, false, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 2.0f), 0.0f, new Stroke(Canvas.mo7874toPx0680j_4(fDimensionResource), 0.0f, companion42.m11694getSquareKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
                                long jSize2 = androidx.compose.p003ui.geometry.SizeKt.Size(Canvas.mo7874toPx0680j_4(fDimensionResource3), Canvas.mo7874toPx0680j_4(fDimensionResource2));
                                long jCornerRadius = CornerRadiusKt.CornerRadius(Canvas.mo7874toPx0680j_4(fM13666constructorimpl6), Canvas.mo7874toPx0680j_4(fM13666constructorimpl6));
                                DrawScope.m11886drawRoundRectuAw5IA$default(Canvas, jColorResource3, OffsetKt.Offset(Canvas.mo7874toPx0680j_4(fM13666constructorimpl), Canvas.mo7874toPx0680j_4(fM13666constructorimpl2)), jSize2, jCornerRadius, null, 0.0f, null, 0, 240, null);
                                DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource4), Color.m11330boximpl(jColorResource5)}), 0.0f, 0.0f, 0, 14, (Object) null), OffsetKt.Offset(Canvas.mo7874toPx0680j_4(fM13666constructorimpl4), Canvas.mo7874toPx0680j_4(fM13666constructorimpl5)), androidx.compose.p003ui.geometry.SizeKt.Size(Canvas.mo7874toPx0680j_4(fM13666constructorimpl3), Canvas.mo7874toPx0680j_4(fDimensionResource4)), CornerRadiusKt.CornerRadius(Canvas.mo7874toPx0680j_4(fM13666constructorimpl6), Canvas.mo7874toPx0680j_4(fM13666constructorimpl6)), 0.0f, null, null, 0, 240, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8174sizeVpY3zN42, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_value_and_percent, new Object[]{Integer.valueOf(i112)}, composerStartRestartGroup, 70), androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(companion32, 0.0f, fDimensionResource82, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(0L, TextAlign.INSTANCE.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
                        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, fM13666constructorimpl72, 7, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting()) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxKt.Box(BackgroundKt.background$default(androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(RotateKt.rotate(SizeKt.m8172size3ABfNKs(companion32, fDimensionResource), FishingProgressContent$lambda$3$lambda$0(stateAnimateFloatAsState2)), C2046Dp.m13666constructorimpl(-fDimensionResource72), 0.0f, 2, null), Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource62), Color.m11330boximpl(jColorResource72)}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), composerStartRestartGroup, 0);
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
                            i7 = i112;
                            f3 = f4;
                            modifier2 = modifier42;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f2 = f;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 731) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 31, heightDp = 390, name = "FishingProgressUi", widthDp = 844)
    public static final void PreviewFishingProgressUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-245081120);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-245081120, i, -1, "com.blackhub.bronline.game.ui.fishing.PreviewFishingProgressUi (FishingProgressUi.kt:200)");
            }
            FishingProgressContent(BackgroundKt.m7771backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m11374getRed0d7_KjU(), null, 2, null), 140.0f, 25, composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingProgressUiKt.PreviewFishingProgressUi.1
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
                    FishingProgressUiKt.PreviewFishingProgressUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float FishingProgressContent$lambda$3$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
