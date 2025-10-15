package com.blackhub.bronline.game.p019ui.cases.p020ui;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.p019ui.cases.CaseRewardCardKt;
import com.blackhub.bronline.game.p019ui.cases.CasesBlueUiContainerKt;
import com.blackhub.bronline.game.p019ui.cases.CasesUiContainerKt;
import com.blackhub.bronline.game.p019ui.cases.button.OpenButtonKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesSprayScaleBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesOpenTenCasesUi.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001aû\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u000626\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00040\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fH\u0007¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010%\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020\u0001X\u008a\u0084\u0002"}, m7105d2 = {"SCALE_BEAR", "", "START_TRANSPARENT_GRADIENT", "CasesOpenTenCasesUi", "", "legendaryCaseBitmap", "Landroid/graphics/Bitmap;", "valueOfProgress", "", "valueOfPreviewProgress", "maxProgress", "imageSize", "rewards", "", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "isShowButtonSpray", "", "dustCount", "allRewardsOpened", "isAnimationNeed", "currentReward", "currentRewardNumberForUi", "isSelectedItems", "prizesBgPattern", "onSelectReward", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "reward", "rewardPos", "onClickToTakeRewards", "Lkotlin/Function0;", "onClickToSprayRewards", "onClickNextReward", "onClickSkipAnim", "(Landroid/graphics/Bitmap;IIIILjava/util/List;ZIZZLcom/blackhub/bronline/game/gui/cases/model/CaseReward;IZLandroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "CasesOpenTenCasesUiPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "alphaForSprayButtonAndDust"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCasesOpenTenCasesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesOpenTenCasesUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenTenCasesUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,410:1\n1116#2,6:411\n81#3:417\n*S KotlinDebug\n*F\n+ 1 CasesOpenTenCasesUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenTenCasesUiKt\n*L\n96#1:411,6\n96#1:417\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesOpenTenCasesUiKt {
    public static final float SCALE_BEAR = 1.1f;
    public static final float START_TRANSPARENT_GRADIENT = 0.7f;

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$3 */
    /* loaded from: classes3.dex */
    public static final class C51783 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $allRewardsOpened;
        public final /* synthetic */ CaseReward $currentReward;
        public final /* synthetic */ int $currentRewardNumberForUi;
        public final /* synthetic */ int $dustCount;
        public final /* synthetic */ int $imageSize;
        public final /* synthetic */ boolean $isAnimationNeed;
        public final /* synthetic */ boolean $isSelectedItems;
        public final /* synthetic */ boolean $isShowButtonSpray;
        public final /* synthetic */ Bitmap $legendaryCaseBitmap;
        public final /* synthetic */ int $maxProgress;
        public final /* synthetic */ Function0<Unit> $onClickNextReward;
        public final /* synthetic */ Function0<Unit> $onClickSkipAnim;
        public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
        public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
        public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
        public final /* synthetic */ Bitmap $prizesBgPattern;
        public final /* synthetic */ List<CaseReward> $rewards;
        public final /* synthetic */ int $valueOfPreviewProgress;
        public final /* synthetic */ int $valueOfProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C51783(Bitmap bitmap, int i, int i2, int i3, int i4, List<CaseReward> list, boolean z, int i5, boolean z2, boolean z3, CaseReward caseReward, int i6, boolean z4, Bitmap bitmap2, Function2<? super CaseReward, ? super Integer, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i7, int i8, int i9) {
            super(2);
            bitmap = bitmap;
            i = i;
            i = i2;
            i = i3;
            i = i4;
            list = list;
            z = z;
            i = i5;
            z = z2;
            z = z3;
            caseReward = caseReward;
            i = i6;
            z = z4;
            bitmap = bitmap2;
            function2 = function2;
            function0 = function0;
            function0 = function02;
            function0 = function03;
            function0 = function04;
            i = i7;
            i = i8;
            i = i9;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CasesOpenTenCasesUiKt.CasesOpenTenCasesUi(bitmap, i, i, i, i, list, z, i, z, z, caseReward, i, z, bitmap, function2, function0, function0, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUiPreview$6 */
    /* loaded from: classes3.dex */
    public static final class C51856 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51856(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CasesOpenTenCasesUiKt.CasesOpenTenCasesUiPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesOpenTenCasesUi(@Nullable Bitmap bitmap, int i, int i2, int i3, int i4, @NotNull List<CaseReward> rewards, boolean z, int i5, boolean z2, boolean z3, @Nullable CaseReward caseReward, int i6, final boolean z4, @Nullable Bitmap bitmap2, @NotNull Function2<? super CaseReward, ? super Integer, Unit> onSelectReward, @NotNull Function0<Unit> onClickToTakeRewards, @NotNull Function0<Unit> onClickToSprayRewards, @NotNull Function0<Unit> onClickNextReward, @NotNull Function0<Unit> onClickSkipAnim, @Nullable Composer composer, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(onSelectReward, "onSelectReward");
        Intrinsics.checkNotNullParameter(onClickToTakeRewards, "onClickToTakeRewards");
        Intrinsics.checkNotNullParameter(onClickToSprayRewards, "onClickToSprayRewards");
        Intrinsics.checkNotNullParameter(onClickNextReward, "onClickNextReward");
        Intrinsics.checkNotNullParameter(onClickSkipAnim, "onClickSkipAnim");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127580360);
        int i10 = (i9 & 128) != 0 ? 0 : i5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1127580360, i7, i8, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi (CasesOpenTenCasesUi.kt:80)");
        }
        Brush brushM11290horizontalGradient8A3gB4$default = Brush.Companion.m11290horizontalGradient8A3gB4$default(Brush.INSTANCE, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))), TuplesKt.m7112to(Float.valueOf(0.7f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(1039027247);
        boolean z5 = (((i8 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(z4)) || (i8 & 384) == 256;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$alphaForSprayButtonAndDust$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(z4 ? 1.0f : 0.5f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(1039027412);
            SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1924384238, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt.CasesOpenTenCasesUi.1
                public final /* synthetic */ State<Float> $alphaForSprayButtonAndDust$delegate;
                public final /* synthetic */ int $btnColor;
                public final /* synthetic */ int $btnSprayText;
                public final /* synthetic */ int $btnTakeText;
                public final /* synthetic */ int $dustCount;
                public final /* synthetic */ int $dustImage;
                public final /* synthetic */ boolean $isShowButtonSpray;
                public final /* synthetic */ Bitmap $legendaryCaseBitmap;
                public final /* synthetic */ int $maxProgress;
                public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
                public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
                public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
                public final /* synthetic */ Bitmap $prizesBgPattern;
                public final /* synthetic */ List<CaseReward> $rewards;
                public final /* synthetic */ int $sprayedText;
                public final /* synthetic */ Brush $titleBrush;
                public final /* synthetic */ int $titleText;
                public final /* synthetic */ int $valueOfPreviewProgress;
                public final /* synthetic */ int $valueOfProgress;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C51761(int i11, Brush brushM11290horizontalGradient8A3gB4$default2, Bitmap bitmap3, int i12, int i22, int i32, Bitmap bitmap22, List<CaseReward> rewards2, int i13, Function2<? super CaseReward, ? super Integer, Unit> onSelectReward2, int i14, int i15, Function0<Unit> onClickToTakeRewards2, boolean z6, int i16, Function0<Unit> onClickToSprayRewards2, int i102, int i17, State<Float> state2) {
                    super(2);
                    i = i11;
                    brush = brushM11290horizontalGradient8A3gB4$default2;
                    bitmap = bitmap3;
                    i = i12;
                    i = i22;
                    i = i32;
                    bitmap = bitmap22;
                    list = rewards2;
                    i = i13;
                    function2 = onSelectReward2;
                    i = i14;
                    i = i15;
                    function0 = onClickToTakeRewards2;
                    z = z6;
                    i = i16;
                    function0 = onClickToSprayRewards2;
                    i = i102;
                    i = i17;
                    state = state2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11) {
                    if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1924384238, i11, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous> (CasesOpenTenCasesUi.kt:107)");
                        }
                        CasesUiContainerKt.CasesUiContainer(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6), null, 2, null), ComposableLambdaKt.composableLambda(composer2, -141580010, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt.CasesOpenTenCasesUi.1.1
                            public final /* synthetic */ State<Float> $alphaForSprayButtonAndDust$delegate;
                            public final /* synthetic */ int $btnColor;
                            public final /* synthetic */ int $btnSprayText;
                            public final /* synthetic */ int $btnTakeText;
                            public final /* synthetic */ int $dustCount;
                            public final /* synthetic */ int $dustImage;
                            public final /* synthetic */ boolean $isShowButtonSpray;
                            public final /* synthetic */ Bitmap $legendaryCaseBitmap;
                            public final /* synthetic */ int $maxProgress;
                            public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
                            public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
                            public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
                            public final /* synthetic */ Bitmap $prizesBgPattern;
                            public final /* synthetic */ List<CaseReward> $rewards;
                            public final /* synthetic */ int $sprayedText;
                            public final /* synthetic */ Brush $titleBrush;
                            public final /* synthetic */ int $titleText;
                            public final /* synthetic */ int $valueOfPreviewProgress;
                            public final /* synthetic */ int $valueOfProgress;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(int i12, Brush brush, Bitmap bitmap3, int i13, int i14, int i15, Bitmap bitmap4, List<CaseReward> list, int i16, Function2<? super CaseReward, ? super Integer, Unit> function2, int i17, int i18, Function0<Unit> function0, boolean z6, int i19, Function0<Unit> function02, int i20, int i21, State<Float> state2) {
                                super(2);
                                i = i12;
                                brush = brush;
                                bitmap = bitmap3;
                                i = i13;
                                i = i14;
                                i = i15;
                                bitmap = bitmap4;
                                list = list;
                                i = i16;
                                function2 = function2;
                                i = i17;
                                i = i18;
                                function0 = function0;
                                z = z6;
                                i = i19;
                                function0 = function02;
                                i = i20;
                                i = i21;
                                state = state2;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-141580010, i12, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:112)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                    int i13 = i;
                                    Brush brush = brush;
                                    Bitmap bitmap3 = bitmap;
                                    int i14 = i;
                                    int i15 = i;
                                    int i16 = i;
                                    Bitmap bitmap4 = bitmap;
                                    final List<CaseReward> list = list;
                                    final int i17 = i;
                                    final Function2<CaseReward, Integer, Unit> function2 = function2;
                                    final int i18 = i;
                                    int i19 = i;
                                    final Function0<Unit> function0 = function0;
                                    boolean z6 = z;
                                    final int i20 = i;
                                    final Function0<Unit> function02 = function0;
                                    final int i21 = i;
                                    final int i22 = i;
                                    final State<Float> state2 = state;
                                    composer3.startReplaceableGroup(-483455358);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 5, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6)), 0.0f, 2, null);
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    String strStringResource = StringResources_androidKt.stringResource(i13, composer3, 6);
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strStringResource.toUpperCase(locale);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    TextKt.m10024Text4IGK_g(upperCase, SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._371wdp, composer3, 6)), brush, null, 0.0f, 6, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582966, 120), composer3, 0, 0, 65532);
                                    CasesSprayScaleBlockKt.CasesSprayScaleBlock(null, bitmap3, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6), 0.0f, 11, null), R.dimen._17wdp, i14, i15, i16, false, false, null, composer3, 12586048, 769);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(OffsetKt.m8084offsetVpY3zN4$default(companion, 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer3, 6)), 1, null), 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                    Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, centerHorizontally2, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    CasesBlueUiContainerKt.CasesBlueUiContainer(null, 0, 0, 0, 0, 0, 0, bitmap4, 1.1f, false, ComposableLambdaKt.composableLambda(composer3, 1040217398, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i23) {
                                            int i24;
                                            int i25;
                                            Function2<CaseReward, Integer, Unit> function22;
                                            char c;
                                            Composer composer5 = composer4;
                                            if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1040217398, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:162)");
                                                }
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                int i26 = 6;
                                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._115wdp, composer5, 6));
                                                List<CaseReward> list2 = list;
                                                int i27 = i17;
                                                Function2<CaseReward, Integer, Unit> function23 = function2;
                                                composer5.startReplaceableGroup(1098475987);
                                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(arrangement2.getStart(), arrangement2.getTop(), Integer.MAX_VALUE, composer5, 0);
                                                composer5.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer5.createNode(constructor4);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurementHelper, companion5.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(-372848000);
                                                int i28 = 0;
                                                for (Object obj : list2) {
                                                    int i29 = i28 + 1;
                                                    if (i28 < 0) {
                                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                    }
                                                    CaseReward caseReward2 = (CaseReward) obj;
                                                    if (caseReward2.getAlreadySprayed()) {
                                                        composer5.startReplaceableGroup(-586364715);
                                                        function22 = function23;
                                                        i24 = i27;
                                                        i25 = i26;
                                                        CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, 0, null, StringResources_androidKt.stringResource(i27, composer5, i26), 0.0f, 0.0f, 0.0f, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, null, composer4, 64, 14156160, 323548);
                                                        composer4.endReplaceableGroup();
                                                        c = 2;
                                                    } else {
                                                        final Function2<CaseReward, Integer, Unit> function24 = function23;
                                                        i24 = i27;
                                                        i25 = i26;
                                                        composer4.startReplaceableGroup(-586364127);
                                                        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(2);
                                                        composer4.startReplaceableGroup(-586363558);
                                                        boolean zChanged = composer4.changed(function24);
                                                        Object objRememberedValue2 = composer4.rememberedValue();
                                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue2 = new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1$1$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward3, Integer num) {
                                                                    invoke(caseReward3, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(@NotNull CaseReward reward, int i30) {
                                                                    Intrinsics.checkNotNullParameter(reward, "reward");
                                                                    function24.invoke(reward, Integer.valueOf(i30));
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        function22 = function24;
                                                        c = 2;
                                                        CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, i28, null, null, 0.0f, 0.0f, fM13666constructorimpl, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, (Function2) objRememberedValue2, composer4, 100663360, 14156160, 61172);
                                                        composer4.endReplaceableGroup();
                                                    }
                                                    composer5 = composer4;
                                                    i28 = i29;
                                                    function23 = function22;
                                                    i27 = i24;
                                                    i26 = i25;
                                                }
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 117440512, 6, 639);
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                                    Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    String upperCase2 = StringResources_androidKt.stringResource(i19, composer3, 6).toUpperCase(locale);
                                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                    composer3.startReplaceableGroup(-372845562);
                                    boolean zChanged = composer3.changed(function0);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                                invoke(f.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(float f) {
                                                function0.invoke();
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    OpenButtonKt.OpenButton(i18, 0, null, null, null, upperCase2, 1.0f, true, 0.0f, false, (Function1) objRememberedValue2, composer3, 14183862, 0, 768);
                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), composer3, 0);
                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composer3, -723427090, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i23) {
                                            if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-723427090, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:214)");
                                                }
                                                String upperCase3 = StringResources_androidKt.stringResource(i20, composer4, 6).toUpperCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                                                float fCasesOpenTenCasesUi$lambda$1 = CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2);
                                                int i24 = i18;
                                                composer4.startReplaceableGroup(2133887886);
                                                boolean zChanged2 = composer4.changed(function02);
                                                final Function0<Unit> function03 = function02;
                                                Object objRememberedValue3 = composer4.rememberedValue();
                                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                                            invoke(f.floatValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(float f) {
                                                            function03.invoke();
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer4.endReplaceableGroup();
                                                OpenButtonKt.OpenButton(i24, 0, null, null, null, upperCase3, 1.0f, true, fCasesOpenTenCasesUi$lambda$1, true, (Function1) objRememberedValue3, composer4, 819490230, 0, 0);
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6)), composer4, 0);
                                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_plus_value_with_spacer, new Object[]{Integer.valueOf(i21)}, composer4, 70), AlphaKt.alpha(companion4, CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer4, 12582966, 120), composer4, 0, 0, 65532);
                                                ImageKt.Image(PainterResources_androidKt.painterResource(i22, composer4, 6), (String) null, AlphaKt.alpha(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer4, 6)), CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24632, 104);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 48);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: CasesOpenTenCasesUi.kt */
                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                @SourceDebugExtension({"SMAP\nCasesOpenTenCasesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesOpenTenCasesUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,410:1\n74#2,6:411\n80#2:445\n78#2,2:484\n80#2:514\n84#2:565\n84#2:570\n79#3,11:417\n79#3,11:449\n92#3:481\n79#3,11:486\n79#3,11:521\n92#3:559\n92#3:564\n92#3:569\n456#4,8:428\n464#4,3:442\n456#4,8:460\n464#4,3:474\n467#4,3:478\n456#4,8:497\n464#4,3:511\n456#4,8:532\n464#4,3:546\n467#4,3:556\n467#4,3:561\n467#4,3:566\n3737#5,6:436\n3737#5,6:468\n3737#5,6:505\n3737#5,6:540\n64#6:446\n64#6:483\n91#7,2:447\n93#7:477\n97#7:482\n87#7,6:515\n93#7:549\n97#7:560\n1116#8,6:550\n*S KotlinDebug\n*F\n+ 1 CasesOpenTenCasesUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1\n*L\n113#1:411,6\n113#1:445\n155#1:484,2\n155#1:514\n155#1:565\n113#1:570\n113#1:417,11\n117#1:449,11\n117#1:481\n155#1:486,11\n195#1:521,11\n195#1:559\n155#1:564\n113#1:569\n113#1:428,8\n113#1:442,3\n117#1:460,8\n117#1:474,3\n117#1:478,3\n155#1:497,8\n155#1:511,3\n195#1:532,8\n195#1:546,3\n195#1:556,3\n155#1:561,3\n113#1:566,3\n113#1:436,6\n117#1:468,6\n155#1:505,6\n195#1:540,6\n124#1:446\n157#1:483\n117#1:447,2\n117#1:477\n117#1:482\n195#1:515,6\n195#1:549\n195#1:560\n208#1:550,6\n*E\n"})
                /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1 */
                public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                    public final /* synthetic */ State<Float> $alphaForSprayButtonAndDust$delegate;
                    public final /* synthetic */ int $btnColor;
                    public final /* synthetic */ int $btnSprayText;
                    public final /* synthetic */ int $btnTakeText;
                    public final /* synthetic */ int $dustCount;
                    public final /* synthetic */ int $dustImage;
                    public final /* synthetic */ boolean $isShowButtonSpray;
                    public final /* synthetic */ Bitmap $legendaryCaseBitmap;
                    public final /* synthetic */ int $maxProgress;
                    public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
                    public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
                    public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
                    public final /* synthetic */ Bitmap $prizesBgPattern;
                    public final /* synthetic */ List<CaseReward> $rewards;
                    public final /* synthetic */ int $sprayedText;
                    public final /* synthetic */ Brush $titleBrush;
                    public final /* synthetic */ int $titleText;
                    public final /* synthetic */ int $valueOfPreviewProgress;
                    public final /* synthetic */ int $valueOfProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(int i12, Brush brush, Bitmap bitmap3, int i13, int i14, int i15, Bitmap bitmap4, List<CaseReward> list, int i16, Function2<? super CaseReward, ? super Integer, Unit> function2, int i17, int i18, Function0<Unit> function0, boolean z6, int i19, Function0<Unit> function02, int i20, int i21, State<Float> state2) {
                        super(2);
                        i = i12;
                        brush = brush;
                        bitmap = bitmap3;
                        i = i13;
                        i = i14;
                        i = i15;
                        bitmap = bitmap4;
                        list = list;
                        i = i16;
                        function2 = function2;
                        i = i17;
                        i = i18;
                        function0 = function0;
                        z = z6;
                        i = i19;
                        function0 = function02;
                        i = i20;
                        i = i21;
                        state = state2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-141580010, i12, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:112)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            int i13 = i;
                            Brush brush = brush;
                            Bitmap bitmap3 = bitmap;
                            int i14 = i;
                            int i15 = i;
                            int i16 = i;
                            Bitmap bitmap4 = bitmap;
                            final List<CaseReward> list = list;
                            final int i17 = i;
                            final Function2<? super CaseReward, ? super Integer, Unit> function2 = function2;
                            final int i18 = i;
                            int i19 = i;
                            final Function0<Unit> function0 = function0;
                            boolean z6 = z;
                            final int i20 = i;
                            final Function0<Unit> function02 = function0;
                            final int i21 = i;
                            final int i22 = i;
                            final State<Float> state2 = state;
                            composer3.startReplaceableGroup(-483455358);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 5, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6)), 0.0f, 2, null);
                            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(i13, composer3, 6);
                            Locale locale = Locale.ROOT;
                            String upperCase = strStringResource.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            TextKt.m10024Text4IGK_g(upperCase, SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._371wdp, composer3, 6)), brush, null, 0.0f, 6, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582966, 120), composer3, 0, 0, 65532);
                            CasesSprayScaleBlockKt.CasesSprayScaleBlock(null, bitmap3, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6), 0.0f, 11, null), R.dimen._17wdp, i14, i15, i16, false, false, null, composer3, 12586048, 769);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(OffsetKt.m8084offsetVpY3zN4$default(companion, 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer3, 6)), 1, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                            composer3.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, centerHorizontally2, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            CasesBlueUiContainerKt.CasesBlueUiContainer(null, 0, 0, 0, 0, 0, 0, bitmap4, 1.1f, false, ComposableLambdaKt.composableLambda(composer3, 1040217398, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i23) {
                                    int i24;
                                    int i25;
                                    Function2<CaseReward, Integer, Unit> function22;
                                    char c;
                                    Composer composer5 = composer4;
                                    if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1040217398, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:162)");
                                        }
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        int i26 = 6;
                                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._115wdp, composer5, 6));
                                        List<CaseReward> list2 = list;
                                        int i27 = i17;
                                        Function2<CaseReward, Integer, Unit> function23 = function2;
                                        composer5.startReplaceableGroup(1098475987);
                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(arrangement2.getStart(), arrangement2.getTop(), Integer.MAX_VALUE, composer5, 0);
                                        composer5.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer5.createNode(constructor4);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurementHelper, companion5.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                        composer5.startReplaceableGroup(-372848000);
                                        int i28 = 0;
                                        for (Object obj : list2) {
                                            int i29 = i28 + 1;
                                            if (i28 < 0) {
                                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            }
                                            CaseReward caseReward2 = (CaseReward) obj;
                                            if (caseReward2.getAlreadySprayed()) {
                                                composer5.startReplaceableGroup(-586364715);
                                                function22 = function23;
                                                i24 = i27;
                                                i25 = i26;
                                                CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, 0, null, StringResources_androidKt.stringResource(i27, composer5, i26), 0.0f, 0.0f, 0.0f, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, null, composer4, 64, 14156160, 323548);
                                                composer4.endReplaceableGroup();
                                                c = 2;
                                            } else {
                                                final Function2<? super CaseReward, ? super Integer, Unit> function24 = function23;
                                                i24 = i27;
                                                i25 = i26;
                                                composer4.startReplaceableGroup(-586364127);
                                                float fM13666constructorimpl = C2046Dp.m13666constructorimpl(2);
                                                composer4.startReplaceableGroup(-586363558);
                                                boolean zChanged = composer4.changed(function24);
                                                Object objRememberedValue2 = composer4.rememberedValue();
                                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward3, Integer num) {
                                                            invoke(caseReward3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(@NotNull CaseReward reward, int i30) {
                                                            Intrinsics.checkNotNullParameter(reward, "reward");
                                                            function24.invoke(reward, Integer.valueOf(i30));
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer4.endReplaceableGroup();
                                                function22 = function24;
                                                c = 2;
                                                CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, i28, null, null, 0.0f, 0.0f, fM13666constructorimpl, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, (Function2) objRememberedValue2, composer4, 100663360, 14156160, 61172);
                                                composer4.endReplaceableGroup();
                                            }
                                            composer5 = composer4;
                                            i28 = i29;
                                            function23 = function22;
                                            i27 = i24;
                                            i26 = i25;
                                        }
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 117440512, 6, 639);
                            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            String upperCase2 = StringResources_androidKt.stringResource(i19, composer3, 6).toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                            composer3.startReplaceableGroup(-372845562);
                            boolean zChanged = composer3.changed(function0);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                        invoke(f.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f) {
                                        function0.invoke();
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            OpenButtonKt.OpenButton(i18, 0, null, null, null, upperCase2, 1.0f, true, 0.0f, false, (Function1) objRememberedValue2, composer3, 14183862, 0, 768);
                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), composer3, 0);
                            ComposeExtensionKt.IfTrue(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composer3, -723427090, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i23) {
                                    if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-723427090, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:214)");
                                        }
                                        String upperCase3 = StringResources_androidKt.stringResource(i20, composer4, 6).toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                                        float fCasesOpenTenCasesUi$lambda$1 = CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2);
                                        int i24 = i18;
                                        composer4.startReplaceableGroup(2133887886);
                                        boolean zChanged2 = composer4.changed(function02);
                                        final Function0<Unit> function03 = function02;
                                        Object objRememberedValue3 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                                    invoke(f.floatValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(float f) {
                                                    function03.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer4.endReplaceableGroup();
                                        OpenButtonKt.OpenButton(i24, 0, null, null, null, upperCase3, 1.0f, true, fCasesOpenTenCasesUi$lambda$1, true, (Function1) objRememberedValue3, composer4, 819490230, 0, 0);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6)), composer4, 0);
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_plus_value_with_spacer, new Object[]{Integer.valueOf(i21)}, composer4, 70), AlphaKt.alpha(companion4, CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer4, 12582966, 120), composer4, 0, 0, 65532);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(i22, composer4, 6), (String) null, AlphaKt.alpha(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer4, 6)), CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24632, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 48);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }
            }), composerStartRestartGroup, 12583302, 122);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1039035738);
            SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.INSTANCE.m11371getGreen0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 971607095, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt.CasesOpenTenCasesUi.2
                public final /* synthetic */ int $currentRewardNumberForUi;
                public final /* synthetic */ int $imageSize;
                public final /* synthetic */ boolean $isAnimationNeed;
                public final /* synthetic */ Bitmap $legendaryCaseBitmap;
                public final /* synthetic */ int $maxProgress;
                public final /* synthetic */ Function0<Unit> $onClickNextReward;
                public final /* synthetic */ Function0<Unit> $onClickSkipAnim;
                public final /* synthetic */ Bitmap $prizesBgPattern;
                public final /* synthetic */ int $valueOfProgress;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C51772(int i62, Bitmap bitmap3, int i12, int i32, boolean z32, int i42, Bitmap bitmap22, Function0<Unit> onClickNextReward2, Function0<Unit> onClickSkipAnim2) {
                    super(2);
                    i = i62;
                    bitmap = bitmap3;
                    i = i12;
                    i = i32;
                    z = z32;
                    i = i42;
                    bitmap = bitmap22;
                    function0 = onClickNextReward2;
                    function0 = onClickSkipAnim2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws FileNotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11) throws FileNotFoundException {
                    if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(971607095, i11, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous> (CasesOpenTenCasesUi.kt:262)");
                        }
                        if (caseReward != null) {
                            composer2.startMovableGroup(-905121512, Integer.valueOf(i));
                            CasesOpenOneCaseUiKt.CasesOpenOneCaseUi(bitmap, caseReward, i, i, z, null, false, i, i, bitmap, null, null, function0, function0, composer2, 1075314760, 0, 3104);
                            composer2.endMovableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 12583302, 122);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt.CasesOpenTenCasesUi.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$changed1;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ boolean $allRewardsOpened;
                public final /* synthetic */ CaseReward $currentReward;
                public final /* synthetic */ int $currentRewardNumberForUi;
                public final /* synthetic */ int $dustCount;
                public final /* synthetic */ int $imageSize;
                public final /* synthetic */ boolean $isAnimationNeed;
                public final /* synthetic */ boolean $isSelectedItems;
                public final /* synthetic */ boolean $isShowButtonSpray;
                public final /* synthetic */ Bitmap $legendaryCaseBitmap;
                public final /* synthetic */ int $maxProgress;
                public final /* synthetic */ Function0<Unit> $onClickNextReward;
                public final /* synthetic */ Function0<Unit> $onClickSkipAnim;
                public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
                public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
                public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
                public final /* synthetic */ Bitmap $prizesBgPattern;
                public final /* synthetic */ List<CaseReward> $rewards;
                public final /* synthetic */ int $valueOfPreviewProgress;
                public final /* synthetic */ int $valueOfProgress;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C51783(Bitmap bitmap3, int i12, int i22, int i32, int i42, List<CaseReward> rewards2, boolean z6, int i102, boolean z22, boolean z32, CaseReward caseReward2, int i62, final boolean z42, Bitmap bitmap22, Function2<? super CaseReward, ? super Integer, Unit> onSelectReward2, Function0<Unit> onClickToTakeRewards2, Function0<Unit> onClickToSprayRewards2, Function0<Unit> onClickNextReward2, Function0<Unit> onClickSkipAnim2, int i72, int i82, int i92) {
                    super(2);
                    bitmap = bitmap3;
                    i = i12;
                    i = i22;
                    i = i32;
                    i = i42;
                    list = rewards2;
                    z = z6;
                    i = i102;
                    z = z22;
                    z = z32;
                    caseReward = caseReward2;
                    i = i62;
                    z = z42;
                    bitmap = bitmap22;
                    function2 = onSelectReward2;
                    function0 = onClickToTakeRewards2;
                    function0 = onClickToSprayRewards2;
                    function0 = onClickNextReward2;
                    function0 = onClickSkipAnim2;
                    i = i72;
                    i = i82;
                    i = i92;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    CasesOpenTenCasesUiKt.CasesOpenTenCasesUi(bitmap, i, i, i, i, list, z, i, z, z, caseReward, i, z, bitmap, function2, function0, function0, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1 */
    /* loaded from: classes3.dex */
    public static final class C51761 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ State<Float> $alphaForSprayButtonAndDust$delegate;
        public final /* synthetic */ int $btnColor;
        public final /* synthetic */ int $btnSprayText;
        public final /* synthetic */ int $btnTakeText;
        public final /* synthetic */ int $dustCount;
        public final /* synthetic */ int $dustImage;
        public final /* synthetic */ boolean $isShowButtonSpray;
        public final /* synthetic */ Bitmap $legendaryCaseBitmap;
        public final /* synthetic */ int $maxProgress;
        public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
        public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
        public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
        public final /* synthetic */ Bitmap $prizesBgPattern;
        public final /* synthetic */ List<CaseReward> $rewards;
        public final /* synthetic */ int $sprayedText;
        public final /* synthetic */ Brush $titleBrush;
        public final /* synthetic */ int $titleText;
        public final /* synthetic */ int $valueOfPreviewProgress;
        public final /* synthetic */ int $valueOfProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C51761(int i11, Brush brushM11290horizontalGradient8A3gB4$default2, Bitmap bitmap3, int i12, int i22, int i32, Bitmap bitmap22, List<CaseReward> rewards2, int i13, Function2<? super CaseReward, ? super Integer, Unit> onSelectReward2, int i14, int i15, Function0<Unit> onClickToTakeRewards2, boolean z6, int i16, Function0<Unit> onClickToSprayRewards2, int i102, int i17, State<Float> state2) {
            super(2);
            i = i11;
            brush = brushM11290horizontalGradient8A3gB4$default2;
            bitmap = bitmap3;
            i = i12;
            i = i22;
            i = i32;
            bitmap = bitmap22;
            list = rewards2;
            i = i13;
            function2 = onSelectReward2;
            i = i14;
            i = i15;
            function0 = onClickToTakeRewards2;
            z = z6;
            i = i16;
            function0 = onClickToSprayRewards2;
            i = i102;
            i = i17;
            state = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i11) {
            if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1924384238, i11, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous> (CasesOpenTenCasesUi.kt:107)");
                }
                CasesUiContainerKt.CasesUiContainer(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6), null, 2, null), ComposableLambdaKt.composableLambda(composer2, -141580010, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt.CasesOpenTenCasesUi.1.1
                    public final /* synthetic */ State<Float> $alphaForSprayButtonAndDust$delegate;
                    public final /* synthetic */ int $btnColor;
                    public final /* synthetic */ int $btnSprayText;
                    public final /* synthetic */ int $btnTakeText;
                    public final /* synthetic */ int $dustCount;
                    public final /* synthetic */ int $dustImage;
                    public final /* synthetic */ boolean $isShowButtonSpray;
                    public final /* synthetic */ Bitmap $legendaryCaseBitmap;
                    public final /* synthetic */ int $maxProgress;
                    public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
                    public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
                    public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
                    public final /* synthetic */ Bitmap $prizesBgPattern;
                    public final /* synthetic */ List<CaseReward> $rewards;
                    public final /* synthetic */ int $sprayedText;
                    public final /* synthetic */ Brush $titleBrush;
                    public final /* synthetic */ int $titleText;
                    public final /* synthetic */ int $valueOfPreviewProgress;
                    public final /* synthetic */ int $valueOfProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(int i12, Brush brush, Bitmap bitmap3, int i13, int i14, int i15, Bitmap bitmap4, List<CaseReward> list, int i16, Function2<? super CaseReward, ? super Integer, Unit> function2, int i17, int i18, Function0<Unit> function0, boolean z6, int i19, Function0<Unit> function02, int i20, int i21, State<Float> state2) {
                        super(2);
                        i = i12;
                        brush = brush;
                        bitmap = bitmap3;
                        i = i13;
                        i = i14;
                        i = i15;
                        bitmap = bitmap4;
                        list = list;
                        i = i16;
                        function2 = function2;
                        i = i17;
                        i = i18;
                        function0 = function0;
                        z = z6;
                        i = i19;
                        function0 = function02;
                        i = i20;
                        i = i21;
                        state = state2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-141580010, i12, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:112)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            int i13 = i;
                            Brush brush = brush;
                            Bitmap bitmap3 = bitmap;
                            int i14 = i;
                            int i15 = i;
                            int i16 = i;
                            Bitmap bitmap4 = bitmap;
                            final List<CaseReward> list = list;
                            final int i17 = i;
                            final Function2<? super CaseReward, ? super Integer, Unit> function2 = function2;
                            final int i18 = i;
                            int i19 = i;
                            final Function0<Unit> function0 = function0;
                            boolean z6 = z;
                            final int i20 = i;
                            final Function0<Unit> function02 = function0;
                            final int i21 = i;
                            final int i22 = i;
                            final State<Float> state2 = state;
                            composer3.startReplaceableGroup(-483455358);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 5, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6)), 0.0f, 2, null);
                            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(i13, composer3, 6);
                            Locale locale = Locale.ROOT;
                            String upperCase = strStringResource.toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            TextKt.m10024Text4IGK_g(upperCase, SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._371wdp, composer3, 6)), brush, null, 0.0f, 6, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582966, 120), composer3, 0, 0, 65532);
                            CasesSprayScaleBlockKt.CasesSprayScaleBlock(null, bitmap3, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6), 0.0f, 11, null), R.dimen._17wdp, i14, i15, i16, false, false, null, composer3, 12586048, 769);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(OffsetKt.m8084offsetVpY3zN4$default(companion, 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer3, 6)), 1, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                            composer3.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, centerHorizontally2, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            CasesBlueUiContainerKt.CasesBlueUiContainer(null, 0, 0, 0, 0, 0, 0, bitmap4, 1.1f, false, ComposableLambdaKt.composableLambda(composer3, 1040217398, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i23) {
                                    int i24;
                                    int i25;
                                    Function2<CaseReward, Integer, Unit> function22;
                                    char c;
                                    Composer composer5 = composer4;
                                    if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1040217398, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:162)");
                                        }
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        int i26 = 6;
                                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._115wdp, composer5, 6));
                                        List<CaseReward> list2 = list;
                                        int i27 = i17;
                                        Function2<CaseReward, Integer, Unit> function23 = function2;
                                        composer5.startReplaceableGroup(1098475987);
                                        Arrangement arrangement2 = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(arrangement2.getStart(), arrangement2.getTop(), Integer.MAX_VALUE, composer5, 0);
                                        composer5.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer5.createNode(constructor4);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurementHelper, companion5.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                        composer5.startReplaceableGroup(-372848000);
                                        int i28 = 0;
                                        for (Object obj : list2) {
                                            int i29 = i28 + 1;
                                            if (i28 < 0) {
                                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            }
                                            CaseReward caseReward2 = (CaseReward) obj;
                                            if (caseReward2.getAlreadySprayed()) {
                                                composer5.startReplaceableGroup(-586364715);
                                                function22 = function23;
                                                i24 = i27;
                                                i25 = i26;
                                                CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, 0, null, StringResources_androidKt.stringResource(i27, composer5, i26), 0.0f, 0.0f, 0.0f, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, null, composer4, 64, 14156160, 323548);
                                                composer4.endReplaceableGroup();
                                                c = 2;
                                            } else {
                                                final Function2<? super CaseReward, ? super Integer, Unit> function24 = function23;
                                                i24 = i27;
                                                i25 = i26;
                                                composer4.startReplaceableGroup(-586364127);
                                                float fM13666constructorimpl = C2046Dp.m13666constructorimpl(2);
                                                composer4.startReplaceableGroup(-586363558);
                                                boolean zChanged = composer4.changed(function24);
                                                Object objRememberedValue2 = composer4.rememberedValue();
                                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward3, Integer num) {
                                                            invoke(caseReward3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(@NotNull CaseReward reward, int i30) {
                                                            Intrinsics.checkNotNullParameter(reward, "reward");
                                                            function24.invoke(reward, Integer.valueOf(i30));
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer4.endReplaceableGroup();
                                                function22 = function24;
                                                c = 2;
                                                CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, i28, null, null, 0.0f, 0.0f, fM13666constructorimpl, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, (Function2) objRememberedValue2, composer4, 100663360, 14156160, 61172);
                                                composer4.endReplaceableGroup();
                                            }
                                            composer5 = composer4;
                                            i28 = i29;
                                            function23 = function22;
                                            i27 = i24;
                                            i26 = i25;
                                        }
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 117440512, 6, 639);
                            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            String upperCase2 = StringResources_androidKt.stringResource(i19, composer3, 6).toUpperCase(locale);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                            composer3.startReplaceableGroup(-372845562);
                            boolean zChanged = composer3.changed(function0);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                        invoke(f.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f) {
                                        function0.invoke();
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            OpenButtonKt.OpenButton(i18, 0, null, null, null, upperCase2, 1.0f, true, 0.0f, false, (Function1) objRememberedValue2, composer3, 14183862, 0, 768);
                            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), composer3, 0);
                            ComposeExtensionKt.IfTrue(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composer3, -723427090, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i23) {
                                    if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-723427090, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:214)");
                                        }
                                        String upperCase3 = StringResources_androidKt.stringResource(i20, composer4, 6).toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                                        float fCasesOpenTenCasesUi$lambda$1 = CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2);
                                        int i24 = i18;
                                        composer4.startReplaceableGroup(2133887886);
                                        boolean zChanged2 = composer4.changed(function02);
                                        final Function0<Unit> function03 = function02;
                                        Object objRememberedValue3 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                                    invoke(f.floatValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(float f) {
                                                    function03.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer4.endReplaceableGroup();
                                        OpenButtonKt.OpenButton(i24, 0, null, null, null, upperCase3, 1.0f, true, fCasesOpenTenCasesUi$lambda$1, true, (Function1) objRememberedValue3, composer4, 819490230, 0, 0);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6)), composer4, 0);
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_plus_value_with_spacer, new Object[]{Integer.valueOf(i21)}, composer4, 70), AlphaKt.alpha(companion4, CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer4, 12582966, 120), composer4, 0, 0, 65532);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(i22, composer4, 6), (String) null, AlphaKt.alpha(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer4, 6)), CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24632, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 48);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* compiled from: CasesOpenTenCasesUi.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nCasesOpenTenCasesUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesOpenTenCasesUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,410:1\n74#2,6:411\n80#2:445\n78#2,2:484\n80#2:514\n84#2:565\n84#2:570\n79#3,11:417\n79#3,11:449\n92#3:481\n79#3,11:486\n79#3,11:521\n92#3:559\n92#3:564\n92#3:569\n456#4,8:428\n464#4,3:442\n456#4,8:460\n464#4,3:474\n467#4,3:478\n456#4,8:497\n464#4,3:511\n456#4,8:532\n464#4,3:546\n467#4,3:556\n467#4,3:561\n467#4,3:566\n3737#5,6:436\n3737#5,6:468\n3737#5,6:505\n3737#5,6:540\n64#6:446\n64#6:483\n91#7,2:447\n93#7:477\n97#7:482\n87#7,6:515\n93#7:549\n97#7:560\n1116#8,6:550\n*S KotlinDebug\n*F\n+ 1 CasesOpenTenCasesUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1\n*L\n113#1:411,6\n113#1:445\n155#1:484,2\n155#1:514\n155#1:565\n113#1:570\n113#1:417,11\n117#1:449,11\n117#1:481\n155#1:486,11\n195#1:521,11\n195#1:559\n155#1:564\n113#1:569\n113#1:428,8\n113#1:442,3\n117#1:460,8\n117#1:474,3\n117#1:478,3\n155#1:497,8\n155#1:511,3\n195#1:532,8\n195#1:546,3\n195#1:556,3\n155#1:561,3\n113#1:566,3\n113#1:436,6\n117#1:468,6\n155#1:505,6\n195#1:540,6\n124#1:446\n157#1:483\n117#1:447,2\n117#1:477\n117#1:482\n195#1:515,6\n195#1:549\n195#1:560\n208#1:550,6\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ State<Float> $alphaForSprayButtonAndDust$delegate;
            public final /* synthetic */ int $btnColor;
            public final /* synthetic */ int $btnSprayText;
            public final /* synthetic */ int $btnTakeText;
            public final /* synthetic */ int $dustCount;
            public final /* synthetic */ int $dustImage;
            public final /* synthetic */ boolean $isShowButtonSpray;
            public final /* synthetic */ Bitmap $legendaryCaseBitmap;
            public final /* synthetic */ int $maxProgress;
            public final /* synthetic */ Function0<Unit> $onClickToSprayRewards;
            public final /* synthetic */ Function0<Unit> $onClickToTakeRewards;
            public final /* synthetic */ Function2<CaseReward, Integer, Unit> $onSelectReward;
            public final /* synthetic */ Bitmap $prizesBgPattern;
            public final /* synthetic */ List<CaseReward> $rewards;
            public final /* synthetic */ int $sprayedText;
            public final /* synthetic */ Brush $titleBrush;
            public final /* synthetic */ int $titleText;
            public final /* synthetic */ int $valueOfPreviewProgress;
            public final /* synthetic */ int $valueOfProgress;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(int i12, Brush brush, Bitmap bitmap3, int i13, int i14, int i15, Bitmap bitmap4, List<CaseReward> list, int i16, Function2<? super CaseReward, ? super Integer, Unit> function2, int i17, int i18, Function0<Unit> function0, boolean z6, int i19, Function0<Unit> function02, int i20, int i21, State<Float> state2) {
                super(2);
                i = i12;
                brush = brush;
                bitmap = bitmap3;
                i = i13;
                i = i14;
                i = i15;
                bitmap = bitmap4;
                list = list;
                i = i16;
                function2 = function2;
                i = i17;
                i = i18;
                function0 = function0;
                z = z6;
                i = i19;
                function0 = function02;
                i = i20;
                i = i21;
                state = state2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer3, int i12) {
                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-141580010, i12, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:112)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    int i13 = i;
                    Brush brush = brush;
                    Bitmap bitmap3 = bitmap;
                    int i14 = i;
                    int i15 = i;
                    int i16 = i;
                    Bitmap bitmap4 = bitmap;
                    final List<CaseReward> list = list;
                    final int i17 = i;
                    final Function2<? super CaseReward, ? super Integer, Unit> function2 = function2;
                    final int i18 = i;
                    int i19 = i;
                    final Function0<Unit> function0 = function0;
                    boolean z6 = z;
                    final int i20 = i;
                    final Function0<Unit> function02 = function0;
                    final int i21 = i;
                    final int i22 = i;
                    final State<Float> state2 = state;
                    composer3.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 5, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6)), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composer3.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(i13, composer3, 6);
                    Locale locale = Locale.ROOT;
                    String upperCase = strStringResource.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextKt.m10024Text4IGK_g(upperCase, SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._371wdp, composer3, 6)), brush, null, 0.0f, 6, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582966, 120), composer3, 0, 0, 65532);
                    CasesSprayScaleBlockKt.CasesSprayScaleBlock(null, bitmap3, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6), 0.0f, 11, null), R.dimen._17wdp, i14, i15, i16, false, false, null, composer3, 12586048, 769);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(OffsetKt.m8084offsetVpY3zN4$default(companion, 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer3, 6)), 1, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                    composer3.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, centerHorizontally2, composer3, 54);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    CasesBlueUiContainerKt.CasesBlueUiContainer(null, 0, 0, 0, 0, 0, 0, bitmap4, 1.1f, false, ComposableLambdaKt.composableLambda(composer3, 1040217398, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i23) {
                            int i24;
                            int i25;
                            Function2<CaseReward, Integer, Unit> function22;
                            char c;
                            Composer composer5 = composer4;
                            if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1040217398, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:162)");
                                }
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                int i26 = 6;
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._115wdp, composer5, 6));
                                List<CaseReward> list2 = list;
                                int i27 = i17;
                                Function2<CaseReward, Integer, Unit> function23 = function2;
                                composer5.startReplaceableGroup(1098475987);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(arrangement2.getStart(), arrangement2.getTop(), Integer.MAX_VALUE, composer5, 0);
                                composer5.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer5.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurementHelper, companion5.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                                composer5.startReplaceableGroup(-372848000);
                                int i28 = 0;
                                for (Object obj : list2) {
                                    int i29 = i28 + 1;
                                    if (i28 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    CaseReward caseReward2 = (CaseReward) obj;
                                    if (caseReward2.getAlreadySprayed()) {
                                        composer5.startReplaceableGroup(-586364715);
                                        function22 = function23;
                                        i24 = i27;
                                        i25 = i26;
                                        CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, 0, null, StringResources_androidKt.stringResource(i27, composer5, i26), 0.0f, 0.0f, 0.0f, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, null, composer4, 64, 14156160, 323548);
                                        composer4.endReplaceableGroup();
                                        c = 2;
                                    } else {
                                        final Function2<? super CaseReward, ? super Integer, Unit> function24 = function23;
                                        i24 = i27;
                                        i25 = i26;
                                        composer4.startReplaceableGroup(-586364127);
                                        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(2);
                                        composer4.startReplaceableGroup(-586363558);
                                        boolean zChanged = composer4.changed(function24);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward3, Integer num) {
                                                    invoke(caseReward3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(@NotNull CaseReward reward, int i30) {
                                                    Intrinsics.checkNotNullParameter(reward, "reward");
                                                    function24.invoke(reward, Integer.valueOf(i30));
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer4.endReplaceableGroup();
                                        function22 = function24;
                                        c = 2;
                                        CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs, caseReward2, 0, i28, null, null, 0.0f, 0.0f, fM13666constructorimpl, 0, 0, null, true, false, false, false, R.dimen._25wdp, R.dimen._40wdp, (Function2) objRememberedValue2, composer4, 100663360, 14156160, 61172);
                                        composer4.endReplaceableGroup();
                                    }
                                    composer5 = composer4;
                                    i28 = i29;
                                    function23 = function22;
                                    i27 = i24;
                                    i26 = i25;
                                }
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 117440512, 6, 639);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                    Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                    composer3.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    String upperCase2 = StringResources_androidKt.stringResource(i19, composer3, 6).toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    composer3.startReplaceableGroup(-372845562);
                    boolean zChanged = composer3.changed(function0);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                invoke(f.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(float f) {
                                function0.invoke();
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    OpenButtonKt.OpenButton(i18, 0, null, null, null, upperCase2, 1.0f, true, 0.0f, false, (Function1) objRememberedValue2, composer3, 14183862, 0, 768);
                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), composer3, 0);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composer3, -723427090, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i23) {
                            if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-723427090, i23, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenTenCasesUi.kt:214)");
                                }
                                String upperCase3 = StringResources_androidKt.stringResource(i20, composer4, 6).toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                                float fCasesOpenTenCasesUi$lambda$1 = CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2);
                                int i24 = i18;
                                composer4.startReplaceableGroup(2133887886);
                                boolean zChanged2 = composer4.changed(function02);
                                final Function0<Unit> function03 = function02;
                                Object objRememberedValue3 = composer4.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$1$1$1$2$2$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                            invoke(f.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(float f) {
                                            function03.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue3);
                                }
                                composer4.endReplaceableGroup();
                                OpenButtonKt.OpenButton(i24, 0, null, null, null, upperCase3, 1.0f, true, fCasesOpenTenCasesUi$lambda$1, true, (Function1) objRememberedValue3, composer4, 819490230, 0, 0);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6)), composer4, 0);
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_plus_value_with_spacer, new Object[]{Integer.valueOf(i21)}, composer4, 70), AlphaKt.alpha(companion4, CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer4, 12582966, 120), composer4, 0, 0, 65532);
                                ImageKt.Image(PainterResources_androidKt.painterResource(i22, composer4, 6), (String) null, AlphaKt.alpha(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer4, 6)), CasesOpenTenCasesUiKt.CasesOpenTenCasesUi$lambda$1(state2)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24632, 104);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUi$2 */
    /* loaded from: classes3.dex */
    public static final class C51772 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $currentRewardNumberForUi;
        public final /* synthetic */ int $imageSize;
        public final /* synthetic */ boolean $isAnimationNeed;
        public final /* synthetic */ Bitmap $legendaryCaseBitmap;
        public final /* synthetic */ int $maxProgress;
        public final /* synthetic */ Function0<Unit> $onClickNextReward;
        public final /* synthetic */ Function0<Unit> $onClickSkipAnim;
        public final /* synthetic */ Bitmap $prizesBgPattern;
        public final /* synthetic */ int $valueOfProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51772(int i62, Bitmap bitmap3, int i12, int i32, boolean z32, int i42, Bitmap bitmap22, Function0<Unit> onClickNextReward2, Function0<Unit> onClickSkipAnim2) {
            super(2);
            i = i62;
            bitmap = bitmap3;
            i = i12;
            i = i32;
            z = z32;
            i = i42;
            bitmap = bitmap22;
            function0 = onClickNextReward2;
            function0 = onClickSkipAnim2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws FileNotFoundException {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i11) throws FileNotFoundException {
            if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(971607095, i11, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUi.<anonymous> (CasesOpenTenCasesUi.kt:262)");
                }
                if (caseReward != null) {
                    composer2.startMovableGroup(-905121512, Integer.valueOf(i));
                    CasesOpenOneCaseUiKt.CasesOpenOneCaseUi(bitmap, caseReward, i, i, z, null, false, i, i, bitmap, null, null, function0, function0, composer2, 1075314760, 0, 3104);
                    composer2.endMovableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CasesOpenTenCasesUiPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(154211531);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(154211531, i, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiPreview (CasesOpenTenCasesUi.kt:286)");
            }
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
            CaseReward caseReward = new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum, true, false, false, 0, false, null, null, 0, 127179, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.LEGENDARY;
            CaseReward caseReward2 = new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum2, true, false, true, 0, false, null, null, 0, 127179, null);
            CaseReward caseReward3 = new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum, true, false, false, 0, false, null, null, 0, 127179, null);
            CaseReward caseReward4 = new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum2, true, false, false, 0, false, null, null, 0, 127179, null);
            CommonRarityEnum commonRarityEnum3 = CommonRarityEnum.UNCOMMON;
            CasesOpenTenCasesUi(null, 10, 50, 100, 0, CollectionsKt__CollectionsKt.listOf((Object[]) new CaseReward[]{caseReward, caseReward2, caseReward3, caseReward4, new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum3, true, false, false, 0, false, null, null, 0, 127179, null), new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, CommonRarityEnum.EPIC, false, false, false, 0, false, null, null, 0, 127179, null), new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum2, true, false, false, 0, false, null, null, 0, 127179, null), new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum3, true, false, true, 0, false, null, null, 0, 127179, null), new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum2, true, false, true, 0, false, null, null, 0, 127179, null), new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, CommonRarityEnum.SPRAYED, true, true, false, 0, false, null, null, 0, 127179, null)}), true, 20, true, true, new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, commonRarityEnum2, true, true, false, 0, false, null, null, 0, 127179, null), 1, false, null, C51801.INSTANCE, C51812.INSTANCE, C51823.INSTANCE, C51834.INSTANCE, C51845.INSTANCE, composerStartRestartGroup, 920415670, 115043768, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt.CasesOpenTenCasesUiPreview.6
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C51856(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CasesOpenTenCasesUiKt.CasesOpenTenCasesUiPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "<anonymous parameter 1>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUiPreview$1 */
    /* loaded from: classes3.dex */
    public static final class C51801 extends Lambda implements Function2<CaseReward, Integer, Unit> {
        public static final C51801 INSTANCE = ;

        public final void invoke(@NotNull CaseReward caseReward, int i) {
            Intrinsics.checkNotNullParameter(caseReward, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward, Integer num) {
            invoke(caseReward, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUiPreview$2 */
    /* loaded from: classes3.dex */
    public static final class C51812 extends Lambda implements Function0<Unit> {
        public static final C51812 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUiPreview$3 */
    /* loaded from: classes3.dex */
    public static final class C51823 extends Lambda implements Function0<Unit> {
        public static final C51823 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUiPreview$4 */
    /* loaded from: classes3.dex */
    public static final class C51834 extends Lambda implements Function0<Unit> {
        public static final C51834 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CasesOpenTenCasesUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenTenCasesUiKt$CasesOpenTenCasesUiPreview$5 */
    /* loaded from: classes3.dex */
    public static final class C51845 extends Lambda implements Function0<Unit> {
        public static final C51845 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static final float CasesOpenTenCasesUi$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
