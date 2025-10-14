package com.blackhub.bronline.game.p019ui.calendar;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarLastRewardItem.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001aC\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002"}, m7105d2 = {"DELAY_BEFORE_RENDER", "", "WEIGHT_FOR_IMAGE", "", "CalendarLastRewardItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "giftName", "gift", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "bottomTextStyle", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "PreviewCalendarLastRewardItem", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "prizeImage", "Landroid/graphics/Bitmap;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCalendarLastRewardItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarLastRewardItem.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarLastRewardItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n1116#2,6:186\n74#3:192\n78#4,2:193\n80#4:223\n84#4:268\n79#5,11:195\n79#5,11:230\n92#5:262\n92#5:267\n456#6,8:206\n464#6,3:220\n456#6,8:241\n464#6,3:255\n467#6,3:259\n467#6,3:264\n3737#7,6:214\n3737#7,6:249\n68#8,6:224\n74#8:258\n78#8:263\n81#9:269\n107#9,2:270\n*S KotlinDebug\n*F\n+ 1 CalendarLastRewardItem.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarLastRewardItemKt\n*L\n65#1:186,6\n66#1:192\n121#1:193,2\n121#1:223\n121#1:268\n121#1:195,11\n142#1:230,11\n142#1:262\n121#1:267\n121#1:206,8\n121#1:220,3\n142#1:241,8\n142#1:255,3\n142#1:259,3\n121#1:264,3\n121#1:214,6\n142#1:249,6\n142#1:224,6\n142#1:258\n142#1:263\n65#1:269\n65#1:270,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CalendarLastRewardItemKt {
    public static final long DELAY_BEFORE_RENDER = 150;
    public static final float WEIGHT_FOR_IMAGE = 0.8f;

    public static final /* synthetic */ void access$CalendarLastRewardItem$lambda$2(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CalendarLastRewardItem(@Nullable Modifier modifier, @NotNull final String text, @NotNull final String giftName, @NotNull final CommonRewardModel gift, @Nullable TextStyle textStyle, @Nullable TextStyle textStyle2, @Nullable Composer composer, final int i, final int i2) {
        TextStyle textStyleM14792montserratBold13spOr10ssp67j0QOw;
        int i3;
        TextStyle textStyleM14849montserratSemiBold10spOr8ssp67j0QOw;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(giftName, "giftName");
        Intrinsics.checkNotNullParameter(gift, "gift");
        Composer composerStartRestartGroup = composer.startRestartGroup(1468391954);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 16) != 0) {
            textStyleM14792montserratBold13spOr10ssp67j0QOw = TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 1);
            i3 = i & (-57345);
        } else {
            textStyleM14792montserratBold13spOr10ssp67j0QOw = textStyle;
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            i3 &= -458753;
            textStyleM14849montserratSemiBold10spOr8ssp67j0QOw = TypographyStyle.INSTANCE.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13);
        } else {
            textStyleM14849montserratSemiBold10spOr8ssp67j0QOw = textStyle2;
        }
        int i4 = i3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1468391954, i4, -1, "com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItem (CalendarLastRewardItem.kt:63)");
        }
        composerStartRestartGroup.startReplaceableGroup(762744391);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red_15, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        EffectsKt.LaunchedEffect(gift, new C50691(gift, context, mutableState, null), composerStartRestartGroup, 72);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.background$default(modifier2, brushM11297verticalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null), 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion4 = Modifier.INSTANCE;
        TextKt.m10024Text4IGK_g(text, ZIndexModifierKt.zIndex(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(BackgroundKt.background$default(companion4, brushM11289horizontalGradient8A3gB4$default, roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default, 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), null, false, 3, null), 2.0f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14792montserratBold13spOr10ssp67j0QOw, composerStartRestartGroup, (i4 >> 3) & 14, (i4 << 6) & 3670016, 65532);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        LottieLoopKt.LottieLoop(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.8f), R.raw.anim_bp_rays, 0, composerStartRestartGroup, 54, 4);
        LottieLoopKt.LottieLoop(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.8f), R.raw.anim_bp_red_gradient, 0, composerStartRestartGroup, 54, 4);
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(CalendarLastRewardItem$lambda$1(mutableState), PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.8f), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6)), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m10024Text4IGK_g(giftName, PaddingKt.m8125paddingVpY3zN4$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14849montserratSemiBold10spOr8ssp67j0QOw, composerStartRestartGroup, (i4 >> 6) & 14, (i4 << 3) & 3670016, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final TextStyle textStyle3 = textStyleM14792montserratBold13spOr10ssp67j0QOw;
            final TextStyle textStyle4 = textStyleM14849montserratSemiBold10spOr8ssp67j0QOw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt.CalendarLastRewardItem.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    CalendarLastRewardItemKt.CalendarLastRewardItem(modifier3, text, giftName, gift, textStyle3, textStyle4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: CalendarLastRewardItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt$CalendarLastRewardItem$1", m7120f = "CalendarLastRewardItem.kt", m7121i = {}, m7122l = {87}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt$CalendarLastRewardItem$1 */
    public static final class C50691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ CommonRewardModel $gift;
        public final /* synthetic */ MutableState<Bitmap> $prizeImage$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50691(CommonRewardModel commonRewardModel, Context context, MutableState<Bitmap> mutableState, Continuation<? super C50691> continuation) {
            super(2, continuation);
            this.$gift = commonRewardModel;
            this.$context = context;
            this.$prizeImage$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50691(this.$gift, this.$context, this.$prizeImage$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CalendarLastRewardItem.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt$CalendarLastRewardItem$1$1", m7120f = "CalendarLastRewardItem.kt", m7121i = {}, m7122l = {90}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt$CalendarLastRewardItem$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ CommonRewardModel $gift;
            public final /* synthetic */ MutableState<Bitmap> $prizeImage$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommonRewardModel commonRewardModel, Context context, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$gift = commonRewardModel;
                this.$context = context;
                this.$prizeImage$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$gift, this.$context, this.$prizeImage$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Bitmap bitmapDrawableToBitmap;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (AnyExtensionKt.isNotNull(CalendarLastRewardItemKt.CalendarLastRewardItem$lambda$1(this.$prizeImage$delegate))) {
                        CalendarLastRewardItemKt.CalendarLastRewardItem$lambda$2(this.$prizeImage$delegate, null);
                        this.label = 1;
                        if (DelayKt.delay(150L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (this.$gift.getImageModel().getRender() != null) {
                    GameRender gameRender = GameRender.getInstance();
                    int type = this.$gift.getImageModel().getRender().getType();
                    int id = this.$gift.getImageModel().getRender().getId();
                    int modelId = this.$gift.getImageModel().getRender().getModelId();
                    int color = this.$gift.getImageModel().getRender().getColor();
                    int color2 = this.$gift.getImageModel().getRender().getColor();
                    float rotationX = this.$gift.getImageModel().getRender().getRotationX();
                    float rotationY = this.$gift.getImageModel().getRender().getRotationY();
                    float rotationZ = this.$gift.getImageModel().getRender().getRotationZ();
                    float zoom = this.$gift.getImageModel().getRender().getZoom();
                    final MutableState<Bitmap> mutableState = this.$prizeImage$delegate;
                    gameRender.RequestRender(type, id, modelId, color, color2, rotationX, rotationY, rotationZ, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt$CalendarLastRewardItem$1$1$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                        public final void OnRenderComplete(int i2, Bitmap bitmap) {
                            CalendarLastRewardItemKt.access$CalendarLastRewardItem$lambda$2(mutableState, bitmap);
                        }
                    });
                } else {
                    MutableState<Bitmap> mutableState2 = this.$prizeImage$delegate;
                    if (this.$gift.getImageModel().getImageName().length() > 0) {
                        bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$gift.getImageModel().getImageName(), this.$gift.getImageModel().getImageType(), 0.0f, 0.0f, 24, null);
                    } else {
                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(this.$context, R.drawable.img_not_found);
                    }
                    CalendarLastRewardItemKt.CalendarLastRewardItem$lambda$2(mutableState2, bitmapDrawableToBitmap);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$gift, this.$context, this.$prizeImage$delegate, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CalendarLastRewardItem")
    public static final void PreviewCalendarLastRewardItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-293215384);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-293215384, i, -1, "com.blackhub.bronline.game.ui.calendar.PreviewCalendarLastRewardItem (CalendarLastRewardItem.kt:178)");
            }
            CalendarLastRewardItem(null, "123", "ПРАВА В + 100 000Р + СТАНДАРТНЫЙ КЕЙС + ЧЕБУРЕК", new CommonRewardModel(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null), null, null, composerStartRestartGroup, 4528, 49);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarLastRewardItemKt.PreviewCalendarLastRewardItem.1
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
                    CalendarLastRewardItemKt.PreviewCalendarLastRewardItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap CalendarLastRewardItem$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void CalendarLastRewardItem$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}
