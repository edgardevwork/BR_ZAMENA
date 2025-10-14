package com.blackhub.bronline.game.p019ui.cases.p020ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.p019ui.cases.CaseRewardCardKt;
import com.blackhub.bronline.game.p019ui.cases.CasesBlueUiContainerKt;
import com.blackhub.bronline.game.p019ui.cases.CasesUiContainerKt;
import com.blackhub.bronline.game.p019ui.cases.button.OpenButtonKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesSprayScaleBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.SkipButtonKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.io.FileNotFoundException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesOpenOneCaseUi.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a£\u0001\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0007¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0002\u0010#\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006$²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\u0016\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002²\u0006\u0016\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050-X\u008a\u0084\u0002"}, m7105d2 = {"ANGLE", "", "CONTAINER_OFFSET", "CROSS_SCALE_MIN", "DEFAULT_DELAY_300", "", "DEFAULT_DELAY_500", "IMAGE_REWARD_SIZE_MAX", "IMAGE_REWARD_SIZE_MIN", "SCALE_BEAR", "START_TRANSPARENT_GRADIENT", "TITLE_OFFSET", "CasesOpenOneCaseUi", "", "legendaryCaseBitmap", "Landroid/graphics/Bitmap;", "reward", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "valueOfProgress", "maxProgress", "isAnimationNeed", "", "rewardName", "", "isSprayAndGetBtnsVisible", "currentRewardNumberForUi", "imageSize", "prizesBgPattern", "onClickToTakeReward", "Lkotlin/Function0;", "onClickToSprayReward", "onClickNextReward", "onClickSkipAnim", "(Landroid/graphics/Bitmap;Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;IIZLjava/lang/String;ZIILandroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "CasesOpenOneCaseUiPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "titleOffset", "containerOffset", "imageOffset", "previewProgress", "rewardImage", "valueForRewardImageFinal", "Lkotlin/Pair;", "valueForNormalSize", "valueForRewardImageAngle", "valueForRewardImageAngleReverse", "valueForRewardImageOffset", "valueForIncrease", "valueForDecrease", "valueForAppearCard", "valueForAppear", "valueForAppearOffset"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCasesOpenOneCaseUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesOpenOneCaseUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenOneCaseUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,778:1\n1116#2,6:779\n1116#2,6:786\n1116#2,6:792\n1116#2,6:798\n1116#2,6:804\n1116#2,6:810\n1116#2,6:816\n1116#2,6:822\n1116#2,6:828\n1116#2,6:834\n1116#2,6:840\n1116#2,6:846\n1116#2,6:852\n1116#2,6:858\n1116#2,6:864\n1116#2,6:871\n1116#2,6:877\n1116#2,6:883\n1116#2,6:889\n1116#2,6:895\n1116#2,6:901\n1116#2,6:907\n1116#2,6:913\n1116#2,6:919\n1116#2,6:925\n1116#2,6:931\n74#3:785\n74#3:870\n81#4:937\n107#4,2:938\n81#4:940\n81#4:941\n81#4:942\n81#4:943\n81#4:944\n107#4,2:945\n81#4:947\n81#4:948\n81#4:949\n81#4:950\n81#4:951\n81#4:952\n81#4:953\n81#4:954\n81#4:955\n81#4:956\n*S KotlinDebug\n*F\n+ 1 CasesOpenOneCaseUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesOpenOneCaseUiKt\n*L\n122#1:779,6\n145#1:786,6\n146#1:792,6\n147#1:798,6\n148#1:804,6\n159#1:810,6\n160#1:816,6\n161#1:822,6\n162#1:828,6\n163#1:834,6\n164#1:840,6\n165#1:846,6\n166#1:852,6\n167#1:858,6\n168#1:864,6\n171#1:871,6\n173#1:877,6\n181#1:883,6\n189#1:889,6\n197#1:895,6\n205#1:901,6\n213#1:907,6\n221#1:913,6\n229#1:919,6\n237#1:925,6\n245#1:931,6\n144#1:785\n170#1:870\n122#1:937\n122#1:938,2\n145#1:940\n146#1:941\n147#1:942\n148#1:943\n171#1:944\n171#1:945,2\n173#1:947\n181#1:948\n189#1:949\n197#1:950\n205#1:951\n213#1:952\n221#1:953\n229#1:954\n237#1:955\n245#1:956\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesOpenOneCaseUiKt {
    public static final float ANGLE = -30.0f;
    public static final float CONTAINER_OFFSET = -1000.0f;
    public static final float CROSS_SCALE_MIN = 0.2f;
    public static final int DEFAULT_DELAY_300 = 300;
    public static final int DEFAULT_DELAY_500 = 500;
    public static final float IMAGE_REWARD_SIZE_MAX = 1.2f;
    public static final float IMAGE_REWARD_SIZE_MIN = 0.8f;
    public static final float SCALE_BEAR = 1.6f;
    public static final float START_TRANSPARENT_GRADIENT = 0.85f;
    public static final float TITLE_OFFSET = -300.0f;

    public static final /* synthetic */ void access$CasesOpenOneCaseUi$lambda$23(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesOpenOneCaseUi(@Nullable final Bitmap bitmap, @NotNull final CaseReward reward, final int i, final int i2, final boolean z, @Nullable String str, final boolean z2, final int i3, final int i4, @Nullable final Bitmap bitmap2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable Composer composer, final int i5, final int i6, final int i7) throws FileNotFoundException {
        String str2;
        int i8;
        Object objDerivedStateOf;
        Object obj;
        int i9;
        Object objAnimatable$default;
        int i10;
        Object obj2;
        Intrinsics.checkNotNullParameter(reward, "reward");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1237682293);
        if ((i7 & 32) != 0) {
            String str3 = (String) UtilsKt.buildTypeMerge(reward.getRewardName(), reward.getRewardNameStore());
            if (str3 == null) {
                str3 = "";
            }
            i8 = i5 & (-458753);
            str2 = str3;
        } else {
            str2 = str;
            i8 = i5;
        }
        Function0<Unit> function05 = (i7 & 1024) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function0<Unit> function06 = (i7 & 2048) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        Function0<Unit> function07 = (i7 & 4096) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function03;
        Function0<Unit> function08 = (i7 & 8192) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function04;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237682293, i8, i6, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUi (CasesOpenOneCaseUi.kt:117)");
        }
        LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m14337boximpl(LottieCompositionSpec.RawRes.m14338constructorimpl(R.raw.anim_gradient_circle)), null, null, null, null, null, composerStartRestartGroup, 6, 62);
        composerStartRestartGroup.startReplaceableGroup(-1702834456);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final int bgColorBottom = reward.getBgColorBottom();
        final int shadowColor = reward.getShadowColor();
        final int textColor = reward.getTextColor();
        final int borderColor = reward.getBorderColor();
        final int crossColor = reward.getCrossColor();
        final int shadowWeightAnim = reward.getShadowWeightAnim();
        final LottieClipSpec.Progress spec = reward.getSpec(z);
        long delay = reward.getDelay(z);
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._70wdp, composerStartRestartGroup, 6);
        final float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
        final float fDimensionResource2 = ((((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp / 2) - fDimensionResource) - PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1702833464);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$titleOffset$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(fM14409dpToPx8Feqmps * (-300.0f));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702833384);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$containerOffset$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(fM14409dpToPx8Feqmps * (-1000.0f));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state2 = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702833304);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$imageOffset$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(fDimensionResource2);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        State state3 = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702833232);
        boolean zChanged = composerStartRestartGroup.changed(reward);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue5 == companion.getEmpty()) {
            objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$previewProgress$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    int i11;
                    int dustValue = i;
                    if (z2 && reward.getSprayed() && (dustValue = i + reward.getDustValue()) > (i11 = i2)) {
                        dustValue = i11;
                    }
                    return Integer.valueOf(dustValue);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
        } else {
            objDerivedStateOf = objRememberedValue5;
        }
        final State state4 = (State) objDerivedStateOf;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832808);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            obj = null;
            i9 = 2;
            objAnimatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objAnimatable$default);
        } else {
            obj = null;
            i9 = 2;
            objAnimatable$default = objRememberedValue6;
        }
        final Animatable animatable = (Animatable) objAnimatable$default;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832732);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = AnimatableKt.Animatable$default(0.0f, 0.0f, i9, obj);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        final Animatable animatable2 = (Animatable) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832655);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(CasesOpenOneCaseUi$lambda$8(state3), 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
            objRememberedValue8 = animatableAnimatable$default;
        }
        final Animatable animatable3 = (Animatable) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832588);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        final Animatable animatable4 = (Animatable) objRememberedValue9;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832520);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            objRememberedValue10 = AnimatableKt.Animatable$default(CasesOpenOneCaseUi$lambda$6(state2), 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
        }
        final Animatable animatable5 = (Animatable) objRememberedValue10;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832450);
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            i10 = 2;
            obj2 = null;
            objRememberedValue11 = AnimatableKt.Animatable$default(CasesOpenOneCaseUi$lambda$4(state), 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        } else {
            i10 = 2;
            obj2 = null;
        }
        final Animatable animatable6 = (Animatable) objRememberedValue11;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832382);
        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue12 == companion.getEmpty()) {
            objRememberedValue12 = AnimatableKt.Animatable$default(0.0f, 0.0f, i10, obj2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
        }
        final Animatable animatable7 = (Animatable) objRememberedValue12;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832318);
        Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue13 == companion.getEmpty()) {
            objRememberedValue13 = AnimatableKt.Animatable$default(0.0f, 0.0f, i10, obj2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
        }
        final Animatable animatable8 = (Animatable) objRememberedValue13;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832253);
        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue14 == companion.getEmpty()) {
            objRememberedValue14 = AnimatableKt.Animatable$default(0.0f, 0.0f, i10, obj2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
        }
        final Animatable animatable9 = (Animatable) objRememberedValue14;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832190);
        Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue15 == companion.getEmpty()) {
            objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue15;
        composerStartRestartGroup.endReplaceableGroup();
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-1702832092);
        Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue16 == companion.getEmpty()) {
            objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue16;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702832012);
        Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue17 == companion.getEmpty()) {
            objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.8f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue17;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702831826);
        Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue18 == companion.getEmpty()) {
            objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
        }
        MutableState mutableState5 = (MutableState) objRememberedValue18;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702831646);
        Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue19 == companion.getEmpty()) {
            objRememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(-30.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
        }
        MutableState mutableState6 = (MutableState) objRememberedValue19;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702831463);
        Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue20 == companion.getEmpty()) {
            objRememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
        }
        MutableState mutableState7 = (MutableState) objRememberedValue20;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702831281);
        Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue21 == companion.getEmpty()) {
            objRememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.0f), 500), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
        }
        MutableState mutableState8 = (MutableState) objRememberedValue21;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702831108);
        Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue22 == companion.getEmpty()) {
            objRememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.2f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
        }
        MutableState mutableState9 = (MutableState) objRememberedValue22;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702830924);
        Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue23 == companion.getEmpty()) {
            objRememberedValue23 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
        }
        MutableState mutableState10 = (MutableState) objRememberedValue23;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702830749);
        Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue24 == companion.getEmpty()) {
            objRememberedValue24 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 500), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
        }
        MutableState mutableState11 = (MutableState) objRememberedValue24;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702830579);
        Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue25 == companion.getEmpty()) {
            objRememberedValue25 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
        }
        MutableState mutableState12 = (MutableState) objRememberedValue25;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1702830403);
        Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue26 == companion.getEmpty()) {
            objRememberedValue26 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.0f), 300), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
        }
        MutableState mutableState13 = (MutableState) objRememberedValue26;
        composerStartRestartGroup.endReplaceableGroup();
        Brush.Companion companion2 = Brush.INSTANCE;
        final Brush brushM11290horizontalGradient8A3gB4$default = Brush.Companion.m11290horizontalGradient8A3gB4$default(companion2, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))), TuplesKt.m7112to(Float.valueOf(0.85f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(borderColor, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        EffectsKt.LaunchedEffect(reward, new C51705(reward, context, i4, mutableState3, lottieCompositionResultRememberLottieComposition, delay, animatable, z, animatable2, animatable3, animatable8, animatable6, animatable5, animatable7, mutableState2, mutableState, animatable9, mutableState9, mutableState4, mutableState5, mutableState6, mutableState7, mutableState10, animatable4, mutableState8, mutableState11, mutableState13, mutableState12, null), composerStartRestartGroup, 72);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        final int i11 = R.string.cases_you_receive;
        final int i12 = R.color.white_15;
        final int i13 = R.color.gray_blue;
        final int i14 = R.string.common_take;
        final int i15 = R.string.common_spray;
        final int i16 = R.drawable.ic_dust;
        final Function0<Unit> function09 = function08;
        final Function0<Unit> function010 = function07;
        final String str4 = str2;
        final Function0<Unit> function011 = function05;
        final Function0<Unit> function012 = function06;
        SurfaceKt.m9876SurfaceT9BRK9s(companion3, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 205072038, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.6
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
            public final void invoke(@Nullable Composer composer2, int i17) {
                if ((i17 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(205072038, i17, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUi.<anonymous> (CasesOpenOneCaseUi.kt:439)");
                    }
                    Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6), null, 2, null);
                    final Animatable<Float, AnimationVector1D> animatable10 = animatable9;
                    final int i18 = crossColor;
                    final MutableState<LottieComposition> mutableState14 = mutableState;
                    final Animatable<Float, AnimationVector1D> animatable11 = animatable4;
                    final LottieClipSpec.Progress progress = spec;
                    final int i19 = i11;
                    final Animatable<Float, AnimationVector1D> animatable12 = animatable6;
                    final Brush brush = brushM11290horizontalGradient8A3gB4$default;
                    final boolean z3 = z2;
                    final Animatable<Float, AnimationVector1D> animatable13 = animatable7;
                    final Bitmap bitmap3 = bitmap;
                    final int i20 = i;
                    final int i21 = i2;
                    final Animatable<Float, AnimationVector1D> animatable14 = animatable8;
                    final Function0<Unit> function013 = function09;
                    final State<Integer> state5 = state4;
                    final float f = fDimensionResource;
                    final MutableState<Boolean> mutableState15 = mutableState2;
                    final Function0<Unit> function014 = function010;
                    final Animatable<Float, AnimationVector1D> animatable15 = animatable5;
                    final int i22 = borderColor;
                    final int i23 = shadowColor;
                    final int i24 = bgColorBottom;
                    final int i25 = shadowWeightAnim;
                    final Bitmap bitmap4 = bitmap2;
                    final CaseReward caseReward = reward;
                    final Brush brush2 = brushM11289horizontalGradient8A3gB4$default;
                    final Animatable<Float, AnimationVector1D> animatable16 = animatable3;
                    final Animatable<Float, AnimationVector1D> animatable17 = animatable2;
                    final Animatable<Float, AnimationVector1D> animatable18 = animatable;
                    final MutableState<Bitmap> mutableState16 = mutableState3;
                    final int i26 = i12;
                    final int i27 = textColor;
                    final String str5 = str4;
                    final int i28 = i3;
                    final int i29 = i13;
                    final int i30 = i14;
                    final Function0<Unit> function015 = function011;
                    final int i31 = i15;
                    final Function0<Unit> function016 = function012;
                    final int i32 = i16;
                    CasesUiContainerKt.CasesUiContainer(modifierM7771backgroundbw27NRU$default, ComposableLambdaKt.composableLambda(composer2, -927390258, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.6.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i33) {
                            Modifier.Companion companion4;
                            int i34;
                            Modifier.Companion companion5;
                            Composer composer4;
                            if ((i33 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-927390258, i33, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUi.<anonymous>.<anonymous> (CasesOpenOneCaseUi.kt:445)");
                                }
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                Modifier modifierScale = ScaleKt.scale(companion6, animatable10.getValue().floatValue(), animatable10.getValue().floatValue());
                                int i35 = i18;
                                composer3.startReplaceableGroup(733328855);
                                Alignment.Companion companion7 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierScale);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(ScaleKt.scale(SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._400wdp, composer3, 6)), 0.2f, 1.0f), ColorResources_androidKt.colorResource(i35, composer3, 0), composer3, 0, 0);
                                NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(ScaleKt.scale(SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._400wdp, composer3, 6)), 1.0f, 0.2f), ColorResources_androidKt.colorResource(i35, composer3, 0), composer3, 0, 0);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                LottieComposition lottieCompositionCasesOpenOneCaseUi$lambda$1 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$1(mutableState14);
                                composer3.startReplaceableGroup(1341383417);
                                if (lottieCompositionCasesOpenOneCaseUi$lambda$1 == null) {
                                    companion4 = companion6;
                                } else {
                                    Animatable<Float, AnimationVector1D> animatable19 = animatable11;
                                    companion4 = companion6;
                                    LottieAnimationKt.LottieAnimation(CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$1(mutableState14), SizeKt.fillMaxSize$default(ScaleKt.scale(companion6, animatable19.getValue().floatValue(), animatable19.getValue().floatValue()), 0.0f, 1, null), false, false, progress, 0.0f, 1, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer3, (LottieClipSpec.Progress.$stable << 12) | 1572872, 0, 0, 2097068);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                Modifier.Companion companion9 = companion4;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = companion7.getCenterHorizontally();
                                int i36 = i19;
                                Animatable<Float, AnimationVector1D> animatable20 = animatable12;
                                Brush brush3 = brush;
                                final boolean z4 = z3;
                                Animatable<Float, AnimationVector1D> animatable21 = animatable13;
                                Bitmap bitmap5 = bitmap3;
                                int i37 = i20;
                                int i38 = i21;
                                final Animatable<Float, AnimationVector1D> animatable22 = animatable14;
                                final Function0<Unit> function017 = function013;
                                State<Integer> state6 = state5;
                                float f2 = f;
                                final MutableState<Boolean> mutableState17 = mutableState15;
                                final Function0<Unit> function018 = function014;
                                Animatable<Float, AnimationVector1D> animatable23 = animatable15;
                                int i39 = i22;
                                int i40 = i23;
                                int i41 = i24;
                                int i42 = i25;
                                Bitmap bitmap6 = bitmap4;
                                final CaseReward caseReward2 = caseReward;
                                Brush brush4 = brush2;
                                Animatable<Float, AnimationVector1D> animatable24 = animatable16;
                                Animatable<Float, AnimationVector1D> animatable25 = animatable17;
                                Animatable<Float, AnimationVector1D> animatable26 = animatable18;
                                MutableState<Bitmap> mutableState18 = mutableState16;
                                final int i43 = i26;
                                final int i44 = i27;
                                final String str6 = str5;
                                final int i45 = i28;
                                final int i46 = i29;
                                int i47 = i30;
                                final Function0<Unit> function019 = function015;
                                final int i48 = i31;
                                final Function0<Unit> function020 = function016;
                                final int i49 = i32;
                                composer3.startReplaceableGroup(-483455358);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer3, 6), 5, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6)), 0.0f, 2, null);
                                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                Alignment.Vertical centerVertically = companion7.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                String strStringResource = StringResources_androidKt.stringResource(i36, composer3, 6);
                                Locale locale = Locale.ROOT;
                                String upperCase = strStringResource.toUpperCase(locale);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                TextKt.m10024Text4IGK_g(upperCase, SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(OffsetKt.m8084offsetVpY3zN4$default(companion9, C2046Dp.m13666constructorimpl(animatable20.getValue().floatValue()), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._371wdp, composer3, 6)), brush3, null, 0.0f, 6, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582966, 120), composer3, 0, 0, 65532);
                                if (z4) {
                                    composer3.startReplaceableGroup(-2137708264);
                                    Modifier modifierAlpha = AlphaKt.alpha(companion9, animatable21.getValue().floatValue());
                                    int iCasesOpenOneCaseUi$lambda$10 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$10(state6);
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6), 0.0f, 11, null);
                                    i34 = 6;
                                    companion5 = companion9;
                                    composer4 = composer3;
                                    CasesSprayScaleBlockKt.CasesSprayScaleBlock(modifierAlpha, bitmap5, modifierM8127paddingqDBjuR0$default, R.dimen._17wdp, i37, iCasesOpenOneCaseUi$lambda$10, i38, false, false, null, composer3, 12586048, 768);
                                    composer3.endReplaceableGroup();
                                } else {
                                    i34 = 6;
                                    companion5 = companion9;
                                    composer4 = composer3;
                                    composer4.startReplaceableGroup(-2137707379);
                                    Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(AlphaKt.alpha(companion5, animatable22.getValue().floatValue()), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6));
                                    composer4.startReplaceableGroup(-2137707052);
                                    boolean zChanged2 = composer4.changed(function017);
                                    Object objRememberedValue27 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue27 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$1$1$1
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
                                                function017.invoke();
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue27);
                                    }
                                    composer3.endReplaceableGroup();
                                    SkipButtonKt.SkipButton(modifierM8124paddingVpY3zN4, 0, 0.0f, (Function0) objRememberedValue27, composer3, 0, 6);
                                    composer3.endReplaceableGroup();
                                }
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                Alignment.Horizontal centerHorizontally2 = companion7.getCenterHorizontally();
                                composer4.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, centerHorizontally2, composer4, 54);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion5, f2, 0.0f, 2, null);
                                Alignment.Vertical centerVertically2 = companion7.getCenterVertically();
                                composer4.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer4, 48);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy2, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                Modifier modifierZIndex = ZIndexModifierKt.zIndex(OffsetKt.m8084offsetVpY3zN4$default(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer4, i34), 0.0f, 2, null), 1.0f);
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierZIndex);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                }
                                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(AlphaKt.alpha(companion5, animatable22.getValue().floatValue()), caseReward2, 0, 0, null, null, PrimitiveResources_androidKt.dimensionResource(R.dimen._230wdp, composer4, i34), PrimitiveResources_androidKt.dimensionResource(R.dimen._220wdp, composer4, i34), C2046Dp.m13666constructorimpl(2), i42, R.dimen._12wdp, brush4, false, false, false, false, R.dimen._50wdp, R.dimen._88wdp, null, composer3, 100663360, 14355846, 278588);
                                Modifier modifierScale2 = ScaleKt.scale(RotateKt.rotate(OffsetKt.m8084offsetVpY3zN4$default(companion5, C2046Dp.m13666constructorimpl(animatable24.getValue().floatValue()), 0.0f, 2, null), animatable25.getValue().floatValue()), animatable26.getValue().floatValue(), animatable26.getValue().floatValue());
                                Alignment center2 = companion7.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierScale2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion8.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                }
                                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$22(mutableState18), SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._210wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._230wdp, composer3, 6)), null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composer3, 3080, 116);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier.Companion companion10 = companion5;
                                CasesBlueUiContainerKt.CasesBlueUiContainer(OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8158height3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composer3, 6)), C2046Dp.m13666constructorimpl(animatable23.getValue().floatValue()), 0.0f, 2, null), i39, i40, R.dimen._200wdp, 0, i41, i42, bitmap6, 1.6f, true, ComposableLambdaKt.composableLambda(composer3, -1055976950, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$2$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i50) {
                                        if ((i50 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1055976950, i50, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenOneCaseUi.kt:592)");
                                            }
                                            Alignment.Companion companion11 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally3 = companion11.getCenterHorizontally();
                                            final int i51 = i43;
                                            boolean z5 = z4;
                                            int i52 = i44;
                                            String str7 = str6;
                                            final Animatable<Float, AnimationVector1D> animatable27 = animatable22;
                                            final int i53 = i45;
                                            composer5.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion12 = Modifier.INSTANCE;
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composer5, 48);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor8 = companion13.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(companion12);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor8);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyColumnMeasurePolicy3, companion13.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion13.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion13.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                                composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                                composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                            }
                                            function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._320wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._85wdp, composer5, 6)), ColorResources_androidKt.colorResource(i51, composer5, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6)));
                                            Alignment.Vertical centerVertically3 = companion11.getCenterVertically();
                                            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
                                            composer5.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer5, 54);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor9 = companion13.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor9);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRowMeasurePolicy3, companion13.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion13.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion13.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                            }
                                            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._85wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer5, 6)), ColorResources_androidKt.colorResource(R.color.white, composer5, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 6, null)), composer5, 0);
                                            TextKt.m10024Text4IGK_g(str7, PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8177width3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._300wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._28wsp, ColorResources_androidKt.colorResource(i52, composer5, 0), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer5, 12582918, 120), composer5, 0, 0, 65532);
                                            BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._85wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer5, 6)), ColorResources_androidKt.colorResource(R.color.white, composer5, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 0.0f, 9, null)), composer5, 0);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            ComposeExtensionKt.IfFalse(Boolean.valueOf(z5), ComposableLambdaKt.composableLambda(composer5, -559259621, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$2$1$2$1$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                    invoke(composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer6, int i54) {
                                                    if ((i54 & 11) != 2 || !composer6.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-559259621, i54, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenOneCaseUi.kt:643)");
                                                        }
                                                        Modifier.Companion companion14 = Modifier.INSTANCE;
                                                        Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(AlphaKt.alpha(PaddingKt.m8127paddingqDBjuR0$default(companion14, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer6, 6), 0.0f, 0.0f, 13, null), animatable27.getValue().floatValue()), ColorResources_androidKt.colorResource(i51, composer6, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer6, 6)));
                                                        Alignment center3 = Alignment.INSTANCE.getCenter();
                                                        int i55 = i53;
                                                        composer6.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer6, 6);
                                                        composer6.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                        CompositionLocalMap currentCompositionLocalMap10 = composer6.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor10 = companion15.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
                                                        if (!(composer6.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor10);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composer6);
                                                        Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRememberBoxMeasurePolicy4, companion15.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion15.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion15.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                            composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                                                            composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                                        }
                                                        function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                                        composer6.startReplaceableGroup(2058660585);
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_digit_from_ten, new Object[]{Integer.valueOf(i55)}, composer6, 70), PaddingKt.m8124paddingVpY3zN4(companion14, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer6, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._17wsp, ColorResources_androidKt.colorResource(R.color.white, composer6, 6), 0, 0L, 0.0f, null, null, composer6, 12582918, 124), composer6, 0, 0, 65532);
                                                        composer6.endReplaceableGroup();
                                                        composer6.endNode();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer6.skipToGroupEnd();
                                                }
                                            }), composer5, 48);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer3, 922749952, 6, 16);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (z4) {
                                    composer3.startReplaceableGroup(-2137698162);
                                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(AlphaKt.alpha(companion10, animatable21.getValue().floatValue()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                                    Alignment.Vertical centerVertically3 = companion7.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor8 = companion8.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor8);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy3, companion8.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion8.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion8.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                        composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                    }
                                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    String upperCase2 = StringResources_androidKt.stringResource(i47, composer3, 6).toUpperCase(locale);
                                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                    boolean zBooleanValue = mutableState17.getValue().booleanValue();
                                    composer3.startReplaceableGroup(642315593);
                                    boolean zChanged3 = composer3.changed(function019);
                                    Object objRememberedValue28 = composer3.rememberedValue();
                                    if (zChanged3 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue28 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$2$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                                                invoke(f3.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(float f3) {
                                                function019.invoke();
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue28);
                                    }
                                    composer3.endReplaceableGroup();
                                    OpenButtonKt.OpenButton(i46, 0, null, null, null, upperCase2, 1.0f, zBooleanValue, 0.0f, false, (Function1) objRememberedValue28, composer3, 1600950, 0, 768);
                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(caseReward2.getSprayed()), ComposableLambdaKt.composableLambda(composer3, 1506510315, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$2$2$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i50) {
                                            if ((i50 & 11) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1506510315, i50, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesOpenOneCaseUi.kt:693)");
                                                }
                                                Modifier.Companion companion11 = Modifier.INSTANCE;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer5, 6)), composer5, 0);
                                                int i51 = i46;
                                                String upperCase3 = StringResources_androidKt.stringResource(i48, composer5, 6).toUpperCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                                                boolean zBooleanValue2 = mutableState17.getValue().booleanValue();
                                                composer5.startReplaceableGroup(-42536851);
                                                boolean zChanged4 = composer5.changed(function020);
                                                final Function0<Unit> function021 = function020;
                                                Object objRememberedValue29 = composer5.rememberedValue();
                                                if (zChanged4 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue29 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$2$2$2$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                                                            invoke(f3.floatValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(float f3) {
                                                            function021.invoke();
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(objRememberedValue29);
                                                }
                                                composer5.endReplaceableGroup();
                                                OpenButtonKt.OpenButton(i51, 0, null, null, null, upperCase3, 1.0f, zBooleanValue2, 0.0f, false, (Function1) objRememberedValue29, composer5, 1600950, 0, 768);
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer5, 6)), composer5, 0);
                                                TextKt.m10024Text4IGK_g(caseReward2.getDustCountText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer5, 12582966, 120), composer5, 0, 0, 65534);
                                                ImageKt.Image(PainterResources_androidKt.painterResource(i49, composer5, 6), (String) null, SizeKt.m8158height3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer5, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer5, 24632, 104);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer3, 48);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-2137695195);
                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.cases_press_for_next, composer3, 6);
                                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._24wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer3, 6), 0, 0L, 0.0f, null, null, composer3, 12582918, 124);
                                    Modifier modifierM8124paddingVpY3zN42 = PaddingKt.m8124paddingVpY3zN4(AlphaKt.alpha(companion10, animatable22.getValue().floatValue()), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6));
                                    boolean zBooleanValue2 = mutableState17.getValue().booleanValue();
                                    composer3.startReplaceableGroup(-2137694287);
                                    Object objRememberedValue29 = composer3.rememberedValue();
                                    Composer.Companion companion11 = Composer.INSTANCE;
                                    if (objRememberedValue29 == companion11.getEmpty()) {
                                        objRememberedValue29 = InteractionSourceKt.MutableInteractionSource();
                                        composer3.updateRememberedValue(objRememberedValue29);
                                    }
                                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue29;
                                    composer3.endReplaceableGroup();
                                    composer3.startReplaceableGroup(-2137694213);
                                    boolean zChanged4 = composer3.changed(function018);
                                    Object objRememberedValue30 = composer3.rememberedValue();
                                    if (zChanged4 || objRememberedValue30 == companion11.getEmpty()) {
                                        objRememberedValue30 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$6$1$3$2$4$1
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
                                                function018.invoke();
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue30);
                                    }
                                    composer3.endReplaceableGroup();
                                    TextKt.m10024Text4IGK_g(strStringResource2, ClickableKt.m7803clickableO2vRcR0$default(modifierM8124paddingVpY3zN42, mutableInteractionSource, null, zBooleanValue2, null, null, (Function0) objRememberedValue30, 24, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer3, 0, 0, 65532);
                                    composer3.endReplaceableGroup();
                                }
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
        }), composerStartRestartGroup, 12582918, 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str5 = str2;
            final Function0<Unit> function013 = function05;
            final Function0<Unit> function014 = function06;
            final Function0<Unit> function015 = function07;
            final Function0<Unit> function016 = function08;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUi.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws FileNotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i17) throws FileNotFoundException {
                    CasesOpenOneCaseUiKt.CasesOpenOneCaseUi(bitmap, reward, i, i2, z, str5, z2, i3, i4, bitmap2, function013, function014, function015, function016, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }

    /* compiled from: CasesOpenOneCaseUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5 */
    public static final class C51705 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $buttonsAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $cardAnimatedFloat;
        public final /* synthetic */ LottieCompositionResult $composition;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $containerAnimatedFloat;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $crossAnimatedFloat;
        public final /* synthetic */ long $delay;
        public final /* synthetic */ int $imageSize;
        public final /* synthetic */ boolean $isAnimationNeed;
        public final /* synthetic */ MutableState<Boolean> $isButtonsEnabled;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $lottieAnimatedFloat;
        public final /* synthetic */ MutableState<LottieComposition> $lottieComposition$delegate;
        public final /* synthetic */ CaseReward $reward;
        public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageAngleAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageOffsetAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageSizeAnimatedFloat;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $titleAnimatedFloat;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppear$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppearCard$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppearOffset$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForDecrease$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForIncrease$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForNormalSize$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageAngle$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageAngleReverse$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageFinal$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageOffset$delegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51705(CaseReward caseReward, Context context, int i, MutableState<Bitmap> mutableState, LottieCompositionResult lottieCompositionResult, long j, Animatable<Float, AnimationVector1D> animatable, boolean z, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, Animatable<Float, AnimationVector1D> animatable4, Animatable<Float, AnimationVector1D> animatable5, Animatable<Float, AnimationVector1D> animatable6, Animatable<Float, AnimationVector1D> animatable7, MutableState<Boolean> mutableState2, MutableState<LottieComposition> mutableState3, Animatable<Float, AnimationVector1D> animatable8, MutableState<Pair<Float, Integer>> mutableState4, MutableState<Pair<Float, Integer>> mutableState5, MutableState<Pair<Float, Integer>> mutableState6, MutableState<Pair<Float, Integer>> mutableState7, MutableState<Pair<Float, Integer>> mutableState8, MutableState<Pair<Float, Integer>> mutableState9, Animatable<Float, AnimationVector1D> animatable9, MutableState<Pair<Float, Integer>> mutableState10, MutableState<Pair<Float, Integer>> mutableState11, MutableState<Pair<Float, Integer>> mutableState12, MutableState<Pair<Float, Integer>> mutableState13, Continuation<? super C51705> continuation) {
            super(2, continuation);
            this.$reward = caseReward;
            this.$context = context;
            this.$imageSize = i;
            this.$rewardImage$delegate = mutableState;
            this.$composition = lottieCompositionResult;
            this.$delay = j;
            this.$rewardImageSizeAnimatedFloat = animatable;
            this.$isAnimationNeed = z;
            this.$rewardImageAngleAnimatedFloat = animatable2;
            this.$rewardImageOffsetAnimatedFloat = animatable3;
            this.$cardAnimatedFloat = animatable4;
            this.$titleAnimatedFloat = animatable5;
            this.$containerAnimatedFloat = animatable6;
            this.$buttonsAnimatedFloat = animatable7;
            this.$isButtonsEnabled = mutableState2;
            this.$lottieComposition$delegate = mutableState3;
            this.$crossAnimatedFloat = animatable8;
            this.$valueForIncrease$delegate = mutableState4;
            this.$valueForRewardImageFinal$delegate = mutableState5;
            this.$valueForNormalSize$delegate = mutableState6;
            this.$valueForRewardImageAngle$delegate = mutableState7;
            this.$valueForRewardImageAngleReverse$delegate = mutableState8;
            this.$valueForDecrease$delegate = mutableState9;
            this.$lottieAnimatedFloat = animatable9;
            this.$valueForRewardImageOffset$delegate = mutableState10;
            this.$valueForAppearCard$delegate = mutableState11;
            this.$valueForAppearOffset$delegate = mutableState12;
            this.$valueForAppear$delegate = mutableState13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C51705 c51705 = new C51705(this.$reward, this.$context, this.$imageSize, this.$rewardImage$delegate, this.$composition, this.$delay, this.$rewardImageSizeAnimatedFloat, this.$isAnimationNeed, this.$rewardImageAngleAnimatedFloat, this.$rewardImageOffsetAnimatedFloat, this.$cardAnimatedFloat, this.$titleAnimatedFloat, this.$containerAnimatedFloat, this.$buttonsAnimatedFloat, this.$isButtonsEnabled, this.$lottieComposition$delegate, this.$crossAnimatedFloat, this.$valueForIncrease$delegate, this.$valueForRewardImageFinal$delegate, this.$valueForNormalSize$delegate, this.$valueForRewardImageAngle$delegate, this.$valueForRewardImageAngleReverse$delegate, this.$valueForDecrease$delegate, this.$lottieAnimatedFloat, this.$valueForRewardImageOffset$delegate, this.$valueForAppearCard$delegate, this.$valueForAppearOffset$delegate, this.$valueForAppear$delegate, continuation);
            c51705.L$0 = obj;
            return c51705;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C51705) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CasesOpenOneCaseUi.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$1", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ int $imageSize;
            public final /* synthetic */ CaseReward $reward;
            public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CaseReward caseReward, Context context, int i, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$reward = caseReward;
                this.$context = context;
                this.$imageSize = i;
                this.$rewardImage$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$reward, this.$context, this.$imageSize, this.$rewardImage$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (AnyExtensionKt.isNotNull(CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$22(this.$rewardImage$delegate))) {
                        CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$23(this.$rewardImage$delegate, null);
                    }
                    if (this.$reward.isRender()) {
                        GameRender gameRender = GameRender.getInstance();
                        int type = this.$reward.getRenderAttachment().getType();
                        int modelId = this.$reward.getRenderAttachment().getModelId();
                        int modelId2 = this.$reward.getRenderAttachment().getModelId();
                        int color = this.$reward.getRenderAttachment().getColor();
                        int color2 = this.$reward.getRenderAttachment().getColor();
                        float zoom = this.$reward.getRenderAttachment().getZoom();
                        final MutableState<Bitmap> mutableState = this.$rewardImage$delegate;
                        gameRender.RequestRender(type, modelId, modelId2, color, color2, 20.0f, 180.0f, 45.0f, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$1$$ExternalSyntheticLambda0
                            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                            public final void OnRenderComplete(int i, Bitmap bitmap) {
                                CasesOpenOneCaseUiKt.access$CasesOpenOneCaseUi$lambda$23(mutableState, bitmap);
                            }
                        });
                    } else {
                        MutableState<Bitmap> mutableState2 = this.$rewardImage$delegate;
                        Context context = this.$context;
                        String imageName = this.$reward.getImageName();
                        ImageTypePathInCDNEnum imageTypePathInCDN = StringExtensionKt.getImageTypePathInCDN(this.$reward.getImageName(), this.$reward.getRewardType(), this.$reward.getInternalId());
                        int i = this.$imageSize;
                        CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$23(mutableState2, BitmapUtilsKt.getBitmapFromZip(context, imageName, imageTypePathInCDN, i, i));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$reward, this.$context, this.$imageSize, this.$rewardImage$delegate, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$composition, this.$delay, this.$rewardImageSizeAnimatedFloat, this.$isAnimationNeed, this.$reward, this.$rewardImageAngleAnimatedFloat, this.$rewardImageOffsetAnimatedFloat, this.$cardAnimatedFloat, this.$titleAnimatedFloat, this.$containerAnimatedFloat, this.$buttonsAnimatedFloat, this.$isButtonsEnabled, this.$lottieComposition$delegate, this.$crossAnimatedFloat, this.$valueForIncrease$delegate, this.$valueForRewardImageFinal$delegate, this.$valueForNormalSize$delegate, this.$valueForRewardImageAngle$delegate, this.$valueForRewardImageAngleReverse$delegate, this.$valueForDecrease$delegate, this.$lottieAnimatedFloat, this.$valueForRewardImageOffset$delegate, this.$valueForAppearCard$delegate, this.$valueForAppearOffset$delegate, this.$valueForAppear$delegate, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CasesOpenOneCaseUi.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {0, 1, 2, 3, 4}, m7122l = {302, 303, TypedValues.AttributesType.TYPE_PATH_ROTATE, TarConstants.XSTAR_PREFIX_OFFSET, 365, 394, 402, HttpStatus.SC_GONE, 418, 426}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "$this$launch", "$this$launch", "$this$launch", "$this$launch"}, m7125s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
        /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $buttonsAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $cardAnimatedFloat;
            public final /* synthetic */ LottieCompositionResult $composition;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $containerAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $crossAnimatedFloat;
            public final /* synthetic */ long $delay;
            public final /* synthetic */ boolean $isAnimationNeed;
            public final /* synthetic */ MutableState<Boolean> $isButtonsEnabled;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $lottieAnimatedFloat;
            public final /* synthetic */ MutableState<LottieComposition> $lottieComposition$delegate;
            public final /* synthetic */ CaseReward $reward;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageAngleAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageOffsetAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageSizeAnimatedFloat;
            public final /* synthetic */ Animatable<Float, AnimationVector1D> $titleAnimatedFloat;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppear$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppearCard$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppearOffset$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForDecrease$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForIncrease$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForNormalSize$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageAngle$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageAngleReverse$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageFinal$delegate;
            public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageOffset$delegate;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LottieCompositionResult lottieCompositionResult, long j, Animatable<Float, AnimationVector1D> animatable, boolean z, CaseReward caseReward, Animatable<Float, AnimationVector1D> animatable2, Animatable<Float, AnimationVector1D> animatable3, Animatable<Float, AnimationVector1D> animatable4, Animatable<Float, AnimationVector1D> animatable5, Animatable<Float, AnimationVector1D> animatable6, Animatable<Float, AnimationVector1D> animatable7, MutableState<Boolean> mutableState, MutableState<LottieComposition> mutableState2, Animatable<Float, AnimationVector1D> animatable8, MutableState<Pair<Float, Integer>> mutableState3, MutableState<Pair<Float, Integer>> mutableState4, MutableState<Pair<Float, Integer>> mutableState5, MutableState<Pair<Float, Integer>> mutableState6, MutableState<Pair<Float, Integer>> mutableState7, MutableState<Pair<Float, Integer>> mutableState8, Animatable<Float, AnimationVector1D> animatable9, MutableState<Pair<Float, Integer>> mutableState9, MutableState<Pair<Float, Integer>> mutableState10, MutableState<Pair<Float, Integer>> mutableState11, MutableState<Pair<Float, Integer>> mutableState12, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$composition = lottieCompositionResult;
                this.$delay = j;
                this.$rewardImageSizeAnimatedFloat = animatable;
                this.$isAnimationNeed = z;
                this.$reward = caseReward;
                this.$rewardImageAngleAnimatedFloat = animatable2;
                this.$rewardImageOffsetAnimatedFloat = animatable3;
                this.$cardAnimatedFloat = animatable4;
                this.$titleAnimatedFloat = animatable5;
                this.$containerAnimatedFloat = animatable6;
                this.$buttonsAnimatedFloat = animatable7;
                this.$isButtonsEnabled = mutableState;
                this.$lottieComposition$delegate = mutableState2;
                this.$crossAnimatedFloat = animatable8;
                this.$valueForIncrease$delegate = mutableState3;
                this.$valueForRewardImageFinal$delegate = mutableState4;
                this.$valueForNormalSize$delegate = mutableState5;
                this.$valueForRewardImageAngle$delegate = mutableState6;
                this.$valueForRewardImageAngleReverse$delegate = mutableState7;
                this.$valueForDecrease$delegate = mutableState8;
                this.$lottieAnimatedFloat = animatable9;
                this.$valueForRewardImageOffset$delegate = mutableState9;
                this.$valueForAppearCard$delegate = mutableState10;
                this.$valueForAppearOffset$delegate = mutableState11;
                this.$valueForAppear$delegate = mutableState12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$composition, this.$delay, this.$rewardImageSizeAnimatedFloat, this.$isAnimationNeed, this.$reward, this.$rewardImageAngleAnimatedFloat, this.$rewardImageOffsetAnimatedFloat, this.$cardAnimatedFloat, this.$titleAnimatedFloat, this.$containerAnimatedFloat, this.$buttonsAnimatedFloat, this.$isButtonsEnabled, this.$lottieComposition$delegate, this.$crossAnimatedFloat, this.$valueForIncrease$delegate, this.$valueForRewardImageFinal$delegate, this.$valueForNormalSize$delegate, this.$valueForRewardImageAngle$delegate, this.$valueForRewardImageAngleReverse$delegate, this.$valueForDecrease$delegate, this.$lottieAnimatedFloat, this.$valueForRewardImageOffset$delegate, this.$valueForAppearCard$delegate, this.$valueForAppearOffset$delegate, this.$valueForAppear$delegate, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00d8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0139 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x018f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01e6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x021b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0251 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0287 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x02bd A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objAwait;
                CoroutineScope coroutineScope;
                MutableState<LottieComposition> mutableState;
                long j;
                CoroutineScope coroutineScope2;
                Animatable<Float, AnimationVector1D> animatable;
                Object first;
                TweenSpec tweenSpecTween$default;
                Animatable<Float, AnimationVector1D> animatable2;
                Object first2;
                TweenSpec tweenSpecTween$default2;
                CoroutineScope coroutineScope3;
                Animatable<Float, AnimationVector1D> animatable3;
                Object first3;
                TweenSpec tweenSpecTween$default3;
                CoroutineScope coroutineScope4;
                Animatable<Float, AnimationVector1D> animatable4;
                Object first4;
                TweenSpec tweenSpecTween$default4;
                Animatable<Float, AnimationVector1D> animatable5;
                Object first5;
                TweenSpec tweenSpecTween$default5;
                Animatable<Float, AnimationVector1D> animatable6;
                Object first6;
                TweenSpec tweenSpecTween$default6;
                Animatable<Float, AnimationVector1D> animatable7;
                Object first7;
                TweenSpec tweenSpecTween$default7;
                Animatable<Float, AnimationVector1D> animatable8;
                Object first8;
                TweenSpec tweenSpecTween$default8;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                        MutableState<LottieComposition> mutableState2 = this.$lottieComposition$delegate;
                        LottieCompositionResult lottieCompositionResult = this.$composition;
                        this.L$0 = coroutineScope5;
                        this.L$1 = mutableState2;
                        this.label = 1;
                        objAwait = lottieCompositionResult.await(this);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope5;
                        mutableState = mutableState2;
                        CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$2(mutableState, (LottieComposition) objAwait);
                        j = this.$delay;
                        this.L$0 = coroutineScope;
                        this.L$1 = null;
                        this.label = 2;
                        if (DelayKt.delay(j, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope2 = coroutineScope;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(this.$crossAnimatedFloat, this.$valueForIncrease$delegate, null), 3, null);
                        animatable = this.$rewardImageSizeAnimatedFloat;
                        first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$35(this.$valueForIncrease$delegate).getFirst();
                        tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$35(this.$valueForIncrease$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.L$0 = coroutineScope2;
                        this.label = 3;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C118932(this.$rewardImageSizeAnimatedFloat, this.$valueForRewardImageFinal$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(this.$crossAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed && this.$reward.isLegendaryReward()) {
                            animatable2 = this.$rewardImageAngleAnimatedFloat;
                            first2 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$29(this.$valueForRewardImageAngle$delegate).getFirst();
                            tweenSpecTween$default2 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$29(this.$valueForRewardImageAngle$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                            this.L$0 = coroutineScope2;
                            this.label = 4;
                            if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope3 = coroutineScope2;
                            coroutineScope2 = coroutineScope3;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass4(this.$rewardImageSizeAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed && this.$reward.isLegendaryReward()) {
                            animatable3 = this.$rewardImageAngleAnimatedFloat;
                            first3 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$31(this.$valueForRewardImageAngleReverse$delegate).getFirst();
                            tweenSpecTween$default3 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$31(this.$valueForRewardImageAngleReverse$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                            this.L$0 = coroutineScope2;
                            this.label = 5;
                            if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope4 = coroutineScope2;
                            coroutineScope2 = coroutineScope4;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass5(this.$crossAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass6(this.$lottieAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        animatable4 = this.$rewardImageOffsetAnimatedFloat;
                        first4 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getFirst();
                        tweenSpecTween$default4 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.L$0 = null;
                        this.label = 6;
                        if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default4, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        animatable5 = this.$cardAnimatedFloat;
                        first5 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getFirst();
                        tweenSpecTween$default5 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 1:
                        mutableState = (MutableState) this.L$1;
                        coroutineScope = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwait = obj;
                        CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$2(mutableState, (LottieComposition) objAwait);
                        j = this.$delay;
                        this.L$0 = coroutineScope;
                        this.L$1 = null;
                        this.label = 2;
                        if (DelayKt.delay(j, this) != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = coroutineScope6;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(this.$crossAnimatedFloat, this.$valueForIncrease$delegate, null), 3, null);
                        animatable = this.$rewardImageSizeAnimatedFloat;
                        first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$35(this.$valueForIncrease$delegate).getFirst();
                        tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$35(this.$valueForIncrease$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.L$0 = coroutineScope2;
                        this.label = 3;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C118932(this.$rewardImageSizeAnimatedFloat, this.$valueForRewardImageFinal$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(this.$crossAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed) {
                            animatable2 = this.$rewardImageAngleAnimatedFloat;
                            first2 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$29(this.$valueForRewardImageAngle$delegate).getFirst();
                            tweenSpecTween$default2 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$29(this.$valueForRewardImageAngle$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                            this.L$0 = coroutineScope2;
                            this.label = 4;
                            if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) != coroutine_suspended) {
                            }
                            break;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass4(this.$rewardImageSizeAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed) {
                            animatable3 = this.$rewardImageAngleAnimatedFloat;
                            first3 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$31(this.$valueForRewardImageAngleReverse$delegate).getFirst();
                            tweenSpecTween$default3 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$31(this.$valueForRewardImageAngleReverse$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                            this.L$0 = coroutineScope2;
                            this.label = 5;
                            if (Animatable.animateTo$default(animatable3, first3, tweenSpecTween$default3, null, null, this, 12, null) != coroutine_suspended) {
                            }
                            break;
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass5(this.$crossAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass6(this.$lottieAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        animatable4 = this.$rewardImageOffsetAnimatedFloat;
                        first4 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getFirst();
                        tweenSpecTween$default4 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.L$0 = null;
                        this.label = 6;
                        if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default4, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable5 = this.$cardAnimatedFloat;
                        first5 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getFirst();
                        tweenSpecTween$default5 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 3:
                        CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = coroutineScope7;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C118932(this.$rewardImageSizeAnimatedFloat, this.$valueForRewardImageFinal$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(this.$crossAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed) {
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass4(this.$rewardImageSizeAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed) {
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass5(this.$crossAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass6(this.$lottieAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        animatable4 = this.$rewardImageOffsetAnimatedFloat;
                        first4 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getFirst();
                        tweenSpecTween$default4 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.L$0 = null;
                        this.label = 6;
                        if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default4, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable5 = this.$cardAnimatedFloat;
                        first5 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getFirst();
                        tweenSpecTween$default5 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 4:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = coroutineScope3;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass4(this.$rewardImageSizeAnimatedFloat, this.$valueForNormalSize$delegate, null), 3, null);
                        if (this.$isAnimationNeed) {
                        }
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass5(this.$crossAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass6(this.$lottieAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        animatable4 = this.$rewardImageOffsetAnimatedFloat;
                        first4 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getFirst();
                        tweenSpecTween$default4 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.L$0 = null;
                        this.label = 6;
                        if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default4, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable5 = this.$cardAnimatedFloat;
                        first5 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getFirst();
                        tweenSpecTween$default5 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 5:
                        coroutineScope4 = (CoroutineScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        coroutineScope2 = coroutineScope4;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass5(this.$crossAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass6(this.$lottieAnimatedFloat, this.$valueForDecrease$delegate, null), 3, null);
                        animatable4 = this.$rewardImageOffsetAnimatedFloat;
                        first4 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getFirst();
                        tweenSpecTween$default4 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$33(this.$valueForRewardImageOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.L$0 = null;
                        this.label = 6;
                        if (Animatable.animateTo$default(animatable4, first4, tweenSpecTween$default4, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable5 = this.$cardAnimatedFloat;
                        first5 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getFirst();
                        tweenSpecTween$default5 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        animatable5 = this.$cardAnimatedFloat;
                        first5 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getFirst();
                        tweenSpecTween$default5 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$39(this.$valueForAppearCard$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 7;
                        if (Animatable.animateTo$default(animatable5, first5, tweenSpecTween$default5, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        animatable6 = this.$titleAnimatedFloat;
                        first6 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default6 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 8;
                        if (Animatable.animateTo$default(animatable6, first6, tweenSpecTween$default6, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        animatable7 = this.$containerAnimatedFloat;
                        first7 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getFirst();
                        tweenSpecTween$default7 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$43(this.$valueForAppearOffset$delegate).getSecond()).intValue(), 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        this.label = 9;
                        if (Animatable.animateTo$default(animatable7, first7, tweenSpecTween$default7, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        animatable8 = this.$buttonsAnimatedFloat;
                        first8 = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getFirst();
                        tweenSpecTween$default8 = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$41(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 10;
                        if (Animatable.animateTo$default(animatable8, first8, tweenSpecTween$default8, null, null, this, 12, null) == coroutine_suspended) {
                        }
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    case 10:
                        ResultKt.throwOnFailure(obj);
                        this.$isButtonsEnabled.setValue(Boxing.boxBoolean(true));
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: CasesOpenOneCaseUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$1", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {307}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $crossAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForIncrease$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$crossAnimatedFloat = animatable;
                    this.$valueForIncrease$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.$crossAnimatedFloat, this.$valueForIncrease$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$crossAnimatedFloat;
                        Object first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$35(this.$valueForIncrease$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$35(this.$valueForIncrease$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CasesOpenOneCaseUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$2", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {325}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C118932 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageSizeAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForRewardImageFinal$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118932(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super C118932> continuation) {
                    super(2, continuation);
                    this.$rewardImageSizeAnimatedFloat = animatable;
                    this.$valueForRewardImageFinal$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C118932(this.$rewardImageSizeAnimatedFloat, this.$valueForRewardImageFinal$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$rewardImageSizeAnimatedFloat;
                        Object first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$25(this.$valueForRewardImageFinal$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$25(this.$valueForRewardImageFinal$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CasesOpenOneCaseUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$3", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {335}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $crossAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForNormalSize$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$crossAnimatedFloat = animatable;
                    this.$valueForNormalSize$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass3(this.$crossAnimatedFloat, this.$valueForNormalSize$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$crossAnimatedFloat;
                        Object first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$27(this.$valueForNormalSize$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$27(this.$valueForNormalSize$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CasesOpenOneCaseUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$4", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {355}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $rewardImageSizeAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForNormalSize$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$rewardImageSizeAnimatedFloat = animatable;
                    this.$valueForNormalSize$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass4(this.$rewardImageSizeAnimatedFloat, this.$valueForNormalSize$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$rewardImageSizeAnimatedFloat;
                        Object first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$27(this.$valueForNormalSize$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$27(this.$valueForNormalSize$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CasesOpenOneCaseUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$5", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {375}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$5, reason: invalid class name */
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $crossAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForDecrease$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.$crossAnimatedFloat = animatable;
                    this.$valueForDecrease$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass5(this.$crossAnimatedFloat, this.$valueForDecrease$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$crossAnimatedFloat;
                        Object first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$37(this.$valueForDecrease$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$37(this.$valueForDecrease$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CasesOpenOneCaseUi.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$6", m7120f = "CasesOpenOneCaseUi.kt", m7121i = {}, m7122l = {385}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt$CasesOpenOneCaseUi$5$2$6, reason: invalid class name */
            public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Animatable<Float, AnimationVector1D> $lottieAnimatedFloat;
                public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForDecrease$delegate;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super AnonymousClass6> continuation) {
                    super(2, continuation);
                    this.$lottieAnimatedFloat = animatable;
                    this.$valueForDecrease$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass6(this.$lottieAnimatedFloat, this.$valueForDecrease$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Animatable<Float, AnimationVector1D> animatable = this.$lottieAnimatedFloat;
                        Object first = CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$37(this.$valueForDecrease$delegate).getFirst();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CasesOpenOneCaseUiKt.CasesOpenOneCaseUi$lambda$37(this.$valueForDecrease$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                        this.label = 1;
                        if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CasesOpenOneCaseUiPreview(@Nullable Composer composer, final int i) throws FileNotFoundException {
        Composer composerStartRestartGroup = composer.startRestartGroup(-292003027);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-292003027, i, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiPreview (CasesOpenOneCaseUi.kt:754)");
            }
            CasesOpenOneCaseUi(null, new CaseReward(0, 0, "FLANKER FLANKERdfsdfsdf", null, "+100", "100", 0, null, CommonRarityEnum.COMMON, true, false, false, 0, false, null, null, 0, 127179, null), 10, 1000, true, null, true, 1, 0, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUiPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUiPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, null, null, composerStartRestartGroup, 920153542, 54, 12320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesOpenOneCaseUiKt.CasesOpenOneCaseUiPreview.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws FileNotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) throws FileNotFoundException {
                    CasesOpenOneCaseUiKt.CasesOpenOneCaseUiPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final LottieComposition CasesOpenOneCaseUi$lambda$1(MutableState<LottieComposition> mutableState) {
        return mutableState.getValue();
    }

    public static final void CasesOpenOneCaseUi$lambda$2(MutableState<LottieComposition> mutableState, LottieComposition lottieComposition) {
        mutableState.setValue(lottieComposition);
    }

    public static final float CasesOpenOneCaseUi$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CasesOpenOneCaseUi$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CasesOpenOneCaseUi$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final int CasesOpenOneCaseUi$lambda$10(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final Bitmap CasesOpenOneCaseUi$lambda$22(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void CasesOpenOneCaseUi$lambda$23(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$25(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$27(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$29(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$31(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$33(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$35(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$37(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$39(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$41(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> CasesOpenOneCaseUi$lambda$43(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }
}
