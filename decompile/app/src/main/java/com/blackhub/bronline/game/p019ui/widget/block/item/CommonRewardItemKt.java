package com.blackhub.bronline.game.p019ui.widget.block.item;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import com.blackhub.bronline.game.common.resources.ColorResourceCompose;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.utils.FallbackPainterResourceKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRewardItem.kt */
@Metadata(m7104d1 = {"\u0000\\\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aÖ\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00070#H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\"\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\r\u0010*\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,²\u0006\f\u0010-\u001a\u0004\u0018\u00010$X\u008a\u008e\u0002"}, m7105d2 = {"DELAY_BEFORE_RENDER", "", "SIZE_OF_CHECK_IMAGE", "", "SIZE_OF_IC_TIMER", "SIZE_OF_IMAGE", "CommonPrizeItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "widthInnerItem", "Landroidx/compose/ui/unit/Dp;", "prizeItem", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "heightTopText", "heightBottomText", "isFromAllRewards", "", "paddingPrizeCard", "secondsGetRewardText", "", "rewardBottomText", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "alphaForCard", "textStyleLittle", "Landroidx/compose/ui/text/TextStyle;", "textStyleMedium", "textStyleBig", "titleTextStyle", "bottomTextStyle", "isNeedShowingLottieAnim", "colorForCheckImage", "Landroidx/compose/ui/graphics/Color;", "onItemClick", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "CommonPrizeItem-BFw8Y-g", "(Landroidx/compose/ui/Modifier;FLcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;FFZFLjava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "IconIsReceived", "IconIsReceived-RPmYEkk", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V", "PreviewCalendarPrizeItem", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "prizeImage"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCommonRewardItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRewardItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonRewardItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,396:1\n75#2:397\n1#3:398\n1116#4,6:399\n1116#4,6:406\n74#5:405\n74#5:412\n81#6:413\n107#6,2:414\n*S KotlinDebug\n*F\n+ 1 CommonRewardItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonRewardItemKt\n*L\n84#1:397\n141#1:399,6\n180#1:406,6\n143#1:405\n382#1:412\n141#1:413\n141#1:414,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonRewardItemKt {
    public static final long DELAY_BEFORE_RENDER = 150;
    public static final float SIZE_OF_CHECK_IMAGE = 0.6f;
    public static final float SIZE_OF_IC_TIMER = 0.6f;
    public static final float SIZE_OF_IMAGE = 0.9f;

    /* renamed from: access$IconIsReceived-RPmYEkk, reason: not valid java name */
    public static final /* synthetic */ void m15057access$IconIsReceivedRPmYEkk(Modifier modifier, long j, Composer composer, int i) {
        m15056IconIsReceivedRPmYEkk(modifier, j, composer, i);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CommonPrizeItem-BFw8Y-g, reason: not valid java name */
    public static final void m15055CommonPrizeItemBFw8Yg(@Nullable Modifier modifier, final float f, @NotNull final CommonRewardModel prizeItem, final float f2, final float f3, final boolean z, float f4, @Nullable String str, @Nullable String str2, @Nullable BorderStroke borderStroke, float f5, @Nullable TextStyle textStyle, @Nullable TextStyle textStyle2, @Nullable TextStyle textStyle3, @Nullable TextStyle textStyle4, @Nullable TextStyle textStyle5, boolean z2, long j, @Nullable Function1<? super Bitmap, Unit> function1, @Nullable Composer composer, final int i, final int i2, final int i3) {
        float fM13666constructorimpl;
        int i4;
        String strEmpty;
        String str3;
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U;
        float alfaForCard;
        int i5;
        int i6;
        Composer composer2;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo;
        int i7;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo3;
        TextStyle textStyle6;
        TextStyle textStyle7;
        boolean zIsNeedShowingLottieAnim;
        Composer composer3;
        long jColorResource;
        Continuation continuation;
        String upperCase;
        Intrinsics.checkNotNullParameter(prizeItem, "prizeItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(-154079537);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 64) != 0) {
            i4 = i & (-3670017);
            fM13666constructorimpl = C2046Dp.m13666constructorimpl(f2 / 2);
        } else {
            fM13666constructorimpl = f4;
            i4 = i;
        }
        if ((i3 & 128) != 0) {
            i4 &= -29360129;
            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        } else {
            strEmpty = str;
        }
        if ((i3 & 256) != 0) {
            if (strEmpty.length() == 0) {
                upperCase = prizeItem.getBottomText().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } else {
                upperCase = strEmpty;
            }
            i4 &= -234881025;
            str3 = upperCase;
        } else {
            str3 = str2;
        }
        if ((i3 & 512) != 0) {
            Integer borderDim = prizeItem.getBorderDim();
            i4 &= -1879048193;
            borderStrokeM7798BorderStrokecXLIe8U = borderDim == null ? null : BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(borderDim.intValue(), composerStartRestartGroup, 0), ColorResources_androidKt.colorResource(prizeItem.getColorIdForPrizeItemBorder(), composerStartRestartGroup, 0));
        } else {
            borderStrokeM7798BorderStrokecXLIe8U = borderStroke;
        }
        int i8 = i4;
        if ((i3 & 1024) != 0) {
            alfaForCard = prizeItem.getAlfaForCard();
            i5 = i2 & (-15);
        } else {
            alfaForCard = f5;
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i6 = i8;
            composer2 = composerStartRestartGroup;
            i5 &= -113;
            textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, null, composerStartRestartGroup, 12610566, 98);
        } else {
            i6 = i8;
            composer2 = composerStartRestartGroup;
            textStyleM14811montserratBoldCustomSpIzzofJo = textStyle;
        }
        int i9 = i5;
        if ((i3 & 4096) != 0) {
            textStyleM14811montserratBoldCustomSpIzzofJo2 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, null, composer2, 12610566, 98);
            i7 = i9 & (-897);
        } else {
            i7 = i9;
            textStyleM14811montserratBoldCustomSpIzzofJo2 = textStyle2;
        }
        if ((i3 & 8192) != 0) {
            i7 &= -7169;
            textStyleM14811montserratBoldCustomSpIzzofJo3 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, null, composer2, 12610566, 98);
        } else {
            textStyleM14811montserratBoldCustomSpIzzofJo3 = textStyle3;
        }
        if ((i3 & 16384) != 0) {
            i7 &= -57345;
            textStyle6 = prizeItem.isSuperReward() ? z ? textStyleM14811montserratBoldCustomSpIzzofJo2 : textStyleM14811montserratBoldCustomSpIzzofJo3 : textStyleM14811montserratBoldCustomSpIzzofJo;
        } else {
            textStyle6 = textStyle4;
        }
        if ((32768 & i3) != 0) {
            i7 &= -458753;
            textStyle7 = (z || prizeItem.isSuperReward()) ? textStyleM14811montserratBoldCustomSpIzzofJo3 : textStyleM14811montserratBoldCustomSpIzzofJo;
        } else {
            textStyle7 = textStyle5;
        }
        if ((65536 & i3) != 0) {
            i7 &= -3670017;
            zIsNeedShowingLottieAnim = prizeItem.isNeedShowingLottieAnim();
        } else {
            zIsNeedShowingLottieAnim = z2;
        }
        if ((131072 & i3) != 0) {
            composer3 = composer2;
            i7 &= -29360129;
            jColorResource = ColorResources_androidKt.colorResource(R.color.green, composer3, 6);
        } else {
            composer3 = composer2;
            jColorResource = j;
        }
        final Function1<? super Bitmap, Unit> function12 = (262144 & i3) != 0 ? new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Bitmap bitmap) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return Unit.INSTANCE;
            }
        } : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-154079537, i6, i7, "com.blackhub.bronline.game.ui.widget.block.item.CommonPrizeItem (CommonRewardItem.kt:131)");
        }
        final Brush calendarPrizeItemColor = ColorResourceCompose.INSTANCE.getCalendarPrizeItemColor(prizeItem, composer3, 56);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer3, 6));
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6);
        final long jColorResource2 = ColorResources_androidKt.colorResource(prizeItem.getColorIdForBgBottomText(), composer3, 0);
        composer3.startReplaceableGroup(1766490419);
        Object objRememberedValue = composer3.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            continuation = null;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer3.updateRememberedValue(objRememberedValue);
        } else {
            continuation = null;
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composer3.endReplaceableGroup();
        EffectsKt.LaunchedEffect(prizeItem, new CommonRewardItemKt$CommonPrizeItem$4(prizeItem, (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mutableState, continuation), composer3, 72);
        composer3.startReplaceableGroup(1766492057);
        boolean z3 = (((i2 & 234881024) ^ 100663296) > 67108864 && composer3.changed(function12)) || (i2 & 100663296) == 67108864;
        Object objRememberedValue2 = composer3.rememberedValue();
        if (z3 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    function12.invoke(CommonRewardItemKt.CommonPrizeItem_BFw8Y_g$lambda$3(mutableState));
                }
            };
            composer3.updateRememberedValue(objRememberedValue2);
        }
        composer3.endReplaceableGroup();
        final Modifier modifier3 = modifier2;
        final float f6 = alfaForCard;
        final long j2 = jColorResource;
        final boolean z4 = zIsNeedShowingLottieAnim;
        final float f7 = fM13666constructorimpl;
        final BorderStroke borderStroke2 = borderStrokeM7798BorderStrokecXLIe8U;
        final Function1<? super Bitmap, Unit> function13 = function12;
        Composer composer4 = composer3;
        final TextStyle textStyle8 = textStyle6;
        final TextStyle textStyle9 = textStyleM14811montserratBoldCustomSpIzzofJo;
        final String str4 = str3;
        final TextStyle textStyle10 = textStyle7;
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composer4, -1131500322, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$6
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
            public final void invoke(@Nullable Composer composer5, int i10) {
                if ((i10 & 11) != 2 || !composer5.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1131500322, i10, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonPrizeItem.<anonymous> (CommonRewardItem.kt:180)");
                    }
                    Modifier modifier4 = modifier3;
                    float f8 = f6;
                    final CommonRewardModel commonRewardModel = prizeItem;
                    final long j3 = j2;
                    final boolean z5 = z4;
                    final float f9 = f7;
                    final float f10 = f;
                    final Brush brush = calendarPrizeItemColor;
                    final RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    final BorderStroke borderStroke3 = borderStroke2;
                    final float f11 = f2;
                    final TextStyle textStyle11 = textStyle8;
                    final float f12 = fDimensionResource2;
                    final float f13 = f3;
                    final long j4 = jColorResource2;
                    final MutableState<Bitmap> mutableState2 = mutableState;
                    final TextStyle textStyle12 = textStyle9;
                    final String str5 = str4;
                    final TextStyle textStyle13 = textStyle10;
                    final float f14 = fDimensionResource;
                    composer5.startReplaceableGroup(733328855);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer5, 0);
                    composer5.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                    if (!(composer5.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer5);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                    composer5.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlpha = AlphaKt.alpha(modifier4, f8);
                    composer5.startReplaceableGroup(-270267587);
                    composer5.startReplaceableGroup(-3687241);
                    Object objRememberedValue3 = composer5.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion5.getEmpty()) {
                        objRememberedValue3 = new Measurer();
                        composer5.updateRememberedValue(objRememberedValue3);
                    }
                    composer5.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue3;
                    composer5.startReplaceableGroup(-3687241);
                    Object objRememberedValue4 = composer5.rememberedValue();
                    if (objRememberedValue4 == companion5.getEmpty()) {
                        objRememberedValue4 = new ConstraintLayoutScope();
                        composer5.updateRememberedValue(objRememberedValue4);
                    }
                    composer5.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
                    composer5.startReplaceableGroup(-3687241);
                    Object objRememberedValue5 = composer5.rememberedValue();
                    if (objRememberedValue5 == companion5.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer5.updateRememberedValue(objRememberedValue5);
                    }
                    composer5.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue5, measurer, composer5, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAlpha, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$6$invoke$lambda$7$$inlined$ConstraintLayout$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                        }
                    }, 1, null);
                    final int i11 = 0;
                    LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composer5, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$6$invoke$lambda$7$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) throws Resources.NotFoundException {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                            */
                        @androidx.compose.runtime.Composable
                        public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r49, int r50) throws android.content.res.Resources.NotFoundException {
                            /*
                                Method dump skipped, instructions count: 1395
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.p019ui.widget.block.item.C6282x6f5576ce.invoke(androidx.compose.runtime.Composer, int):void");
                        }
                    }), measurePolicyComponent1, composer5, 48, 0);
                    composer5.endReplaceableGroup();
                    composer5.startReplaceableGroup(-183715289);
                    if (commonRewardModel.isReceived() && commonRewardModel.isBpOrEventsReward()) {
                        CommonRewardItemKt.m15056IconIsReceivedRPmYEkk(boxScopeInstance.align(SizeKt.fillMaxSize(companion2, 0.6f), companion3.getCenter()), j3, composer5, 0);
                    }
                    composer5.endReplaceableGroup();
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
        }), composer4, 0, 3072, UnixStat.PERM_MASK);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final float f8 = fM13666constructorimpl;
            final String str5 = strEmpty;
            final String str6 = str3;
            final BorderStroke borderStroke3 = borderStrokeM7798BorderStrokecXLIe8U;
            final float f9 = alfaForCard;
            final TextStyle textStyle11 = textStyleM14811montserratBoldCustomSpIzzofJo;
            final TextStyle textStyle12 = textStyleM14811montserratBoldCustomSpIzzofJo2;
            final TextStyle textStyle13 = textStyleM14811montserratBoldCustomSpIzzofJo3;
            final TextStyle textStyle14 = textStyle6;
            final TextStyle textStyle15 = textStyle7;
            final boolean z5 = zIsNeedShowingLottieAnim;
            final long j3 = jColorResource;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$CommonPrizeItem$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer5, int i10) {
                    CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifier4, f, prizeItem, f2, f3, z, f8, str5, str6, borderStroke3, f9, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, z5, j3, function13, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: IconIsReceived-RPmYEkk, reason: not valid java name */
    public static final void m15056IconIsReceivedRPmYEkk(final Modifier modifier, final long j, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(547149487);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547149487, i2, -1, "com.blackhub.bronline.game.ui.widget.block.item.IconIsReceived (CommonRewardItem.kt:358)");
            }
            int i3 = i2 << 6;
            IconKt.m9496Iconww6aTOc(FallbackPainterResourceKt.fallbackPainterResource(R.drawable.ic_check_correct, composerStartRestartGroup, 6), (String) null, modifier, j, composerStartRestartGroup, (i3 & 896) | 56 | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt$IconIsReceived$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    CommonRewardItemKt.m15056IconIsReceivedRPmYEkk(modifier, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 54, widthDp = 47)
    public static final void PreviewCalendarPrizeItem(Composer composer, final int i) throws Resources.NotFoundException {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-343095610);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-343095610, i, -1, "com.blackhub.bronline.game.ui.widget.block.item.PreviewCalendarPrizeItem (CommonRewardItem.kt:371)");
            }
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._70wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._96wdp, composerStartRestartGroup, 6));
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._63wdp, composerStartRestartGroup, 6);
            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
            float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6);
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            composer2 = composerStartRestartGroup;
            m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs, fDimensionResource, new CommonRewardModel(0, "123", null, "день 10", BitmapUtilsKt.getBitmap(resources, R.drawable.ic_br_logo), 0, 0, null, true, true, 4, CommonRewardState.NORM_RECEIVED, CalendarBonusRewardState.NONE, false, false, CommonRarityEnum.EPIC, 0, null, 213221, null), fDimensionResource2, fDimensionResource3, false, 0.0f, "", null, null, 0.0f, null, null, null, null, null, false, 0L, new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt.PreviewCalendarPrizeItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Bitmap bitmap) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return Unit.INSTANCE;
                }
            }, composer2, 12780032, 100663296, 261952);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonRewardItemKt.PreviewCalendarPrizeItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) throws Resources.NotFoundException {
                    CommonRewardItemKt.PreviewCalendarPrizeItem(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap CommonPrizeItem_BFw8Y_g$lambda$3(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }
}
