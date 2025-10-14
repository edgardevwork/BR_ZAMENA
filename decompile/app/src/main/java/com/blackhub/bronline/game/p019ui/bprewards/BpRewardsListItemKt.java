package com.blackhub.bronline.game.p019ui.bprewards;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.p003ui.text.style.TextOverflow;
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
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsRenderAttachment;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.p019ui.bprewards.BpRewardsListItemKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickNoAnimStopSpamBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientAngle;
import com.blackhub.bronline.game.p019ui.widget.other.GradientOffsetKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsListItem.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a£\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2d\u0010\u000e\u001a`\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\u000fH\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002"}, m7105d2 = {"ALPHA_FOR_EMPTY_CARD", "", "BpRewardsListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsServerItemModel;", "renderSize", "", "emptyIconRes", "isEnabledState", "Landroidx/compose/runtime/MutableState;", "", "onItemClick", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "id", "typeOfClickedButton", "", "itemNameForDialog", "sprayPriceForDialog", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsServerItemModel;IILandroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "PreviewBpRewardsListItem", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "rewardImage", "Landroid/graphics/Bitmap;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBpRewardsListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsListItem.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsListItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,520:1\n74#2:521\n1116#3,6:522\n1116#3,6:528\n1116#3,6:654\n68#4,6:534\n74#4:568\n68#4,6:569\n74#4:603\n78#4:648\n78#4:653\n79#5,11:540\n79#5,11:575\n79#5,11:610\n92#5:642\n92#5:647\n92#5:652\n456#6,8:551\n464#6,3:565\n456#6,8:586\n464#6,3:600\n456#6,8:621\n464#6,3:635\n467#6,3:639\n467#6,3:644\n467#6,3:649\n3737#7,6:559\n3737#7,6:594\n3737#7,6:629\n74#8,6:604\n80#8:638\n84#8:643\n81#9:660\n107#9,2:661\n*S KotlinDebug\n*F\n+ 1 BpRewardsListItem.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsListItemKt\n*L\n102#1:521\n127#1:522,6\n128#1:528,6\n514#1:654,6\n288#1:534,6\n288#1:568\n293#1:569,6\n293#1:603\n293#1:648\n288#1:653\n288#1:540,11\n293#1:575,11\n304#1:610,11\n304#1:642\n293#1:647\n288#1:652\n288#1:551,8\n288#1:565,3\n293#1:586,8\n293#1:600,3\n304#1:621,8\n304#1:635,3\n304#1:639,3\n293#1:644,3\n288#1:649,3\n288#1:559,6\n293#1:594,6\n304#1:629,6\n304#1:604,6\n304#1:638\n304#1:643\n127#1:660\n127#1:661,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BpRewardsListItemKt {
    public static final float ALPHA_FOR_EMPTY_CARD = 0.4f;

    public static final /* synthetic */ void access$BpRewardsListItem$lambda$2(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BpRewardsListItem(@Nullable Modifier modifier, @NotNull final BpRewardsServerItemModel item, final int i, final int i2, @NotNull final MutableState<Boolean> isEnabledState, @NotNull final Function4<? super Integer, ? super Integer, ? super String, ? super Integer, Unit> onItemClick, @Nullable Composer composer, final int i3, final int i4) {
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        int i5;
        Modifier modifier2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(isEnabledState, "isEnabledState");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1818803113);
        Modifier modifier3 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1818803113, i3, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsListItem (BpRewardsListItem.kt:100)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Brush.Companion companion2 = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0L, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0), 0, 10, (Object) null);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6));
        final BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
        composerStartRestartGroup.startReplaceableGroup(1195017110);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1195017174);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_dust.svg", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final Bitmap bitmap = (Bitmap) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(item, new C50011(mutableState, item, context, i, null), composerStartRestartGroup, 72);
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._238wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._92wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion6 = Modifier.INSTANCE;
        Modifier modifierBackground$default = BackgroundKt.background$default(boxScopeInstance2.align(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._82wdp, composerStartRestartGroup, 6)), companion4.getCenter()), brushM11297verticalGradient8A3gB4$default, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), 0.0f, 4, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (item.isEmptyItem()) {
            composerStartRestartGroup.startReplaceableGroup(-621567598);
            Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), 0.4f);
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlpha);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String upperCase = StringResources_androidKt.stringResource(R.string.bp_rewards_empty, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wdp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, 0, 0, 65532);
            companion = companion6;
            boxScopeInstance = boxScopeInstance2;
            IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, (i3 >> 9) & 14), (String) null, SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), composerStartRestartGroup, 56, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            i5 = 6;
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
        } else {
            companion = companion6;
            boxScopeInstance = boxScopeInstance2;
            composerStartRestartGroup.startReplaceableGroup(-621566424);
            i5 = 6;
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
            ClickNoAnimStopSpamBlockKt.ClickNoAnimStopSpamBlock(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, item.isHaveAlarm() > 0, isEnabledState, true, false, false, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$2
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
                    onItemClick.invoke(Integer.valueOf(item.getItemIdOnServer()), 2, null, null);
                }
            }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1075189993, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                public final void invoke(@Nullable Composer composer3, int i6) {
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1075189993, i6, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsListItem.<anonymous>.<anonymous>.<anonymous> (BpRewardsListItem.kt:343)");
                        }
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion7, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6));
                        final BpRewardsServerItemModel bpRewardsServerItemModel = item;
                        final Function4<Integer, Integer, String, Integer, Unit> function4 = onItemClick;
                        final MutableState<Bitmap> mutableState2 = mutableState;
                        Brush brush = brushM11293radialGradientP_VxKs$default;
                        RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                        BorderStroke borderStroke = borderStrokeM7798BorderStrokecXLIe8U;
                        MutableState<Boolean> mutableState3 = isEnabledState;
                        final Bitmap bitmap2 = bitmap;
                        composer3.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Horizontal start = arrangement.getStart();
                        Alignment.Companion companion8 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion8.getTop(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
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
                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion9.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion9.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(companion7, 1.0f, false, 2, null);
                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer3, 6));
                        Brush.Companion companion10 = Brush.INSTANCE;
                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierAspectRatio$default, null, 0L, 0L, 0.0f, Brush.Companion.m11297verticalGradient8A3gB4$default(companion10, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composer3, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray, composer3, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), roundedCornerShapeM8392RoundedCornerShape0680j_42, BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, 6), ColorResources_androidKt.colorResource(bpRewardsServerItemModel.getBorderColor(), composer3, 0)), companion8.getBottomEnd(), false, false, null, true, false, false, false, 0, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$3$1$1
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
                                function4.invoke(Integer.valueOf(bpRewardsServerItemModel.getItemIdOnServer()), 2, null, null);
                            }
                        }, ComposableLambdaKt.composableLambda(composer3, 1489534990, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$3$1$2
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
                            public final void invoke(@Nullable Composer composer4, int i7) {
                                if ((i7 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1489534990, i7, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BpRewardsListItem.kt:373)");
                                    }
                                    Modifier.Companion companion11 = Modifier.INSTANCE;
                                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(BpRewardsListItemKt.BpRewardsListItem$lambda$1(mutableState2), SizeKt.fillMaxSize$default(PaddingKt.m8123padding3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer4, 6)), 0.0f, 1, null), null, null, 0.0f, null, 0, composer4, 8, 124);
                                    if (bpRewardsServerItemModel.getQuantity() > 0) {
                                        TextKt.m10024Text4IGK_g(String.valueOf(bpRewardsServerItemModel.getQuantity()), PaddingKt.m8123padding3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer4, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer4, 196614, 30), composer4, 0, 0, 65532);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 100663302, 805306758, 256542);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m8127paddingqDBjuR0$default(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                        composer3.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween, companion8.getStart(), composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy2, companion9.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        String upperCase2 = bpRewardsServerItemModel.getItemName().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        int iM13608getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m13608getEllipsisgIe3tQ8();
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        TextKt.m10024Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM13608getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 3120, 55294);
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer3, 6), 7, null);
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion8.getTop(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion9.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion9.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.bp_rewards_storage_term, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30), composer3, 0, 0, 65534);
                        TextKt.m10024Text4IGK_g(bpRewardsServerItemModel.getRewardDays(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, composer3, 1572870, 62), composer3, 0, 0, 65534);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, companion8.getTop(), composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor7 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy3, companion9.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion9.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                        }
                        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._82wdp, composer3, 6)), null, StringResources_androidKt.stringResource(R.string.common_take, composer3, 6), typographyStyle.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, composer3, 1572870, 62), 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brush, roundedCornerShape, borderStroke, 0.0f, 0.0f, false, false, mutableState3, false, false, false, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$3$1$3$2$1
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
                                Function4<Integer, Integer, String, Integer, Unit> function42 = function4;
                                Integer numValueOf = Integer.valueOf(bpRewardsServerItemModel.getItemIdOnServer());
                                String itemNameForPreview = bpRewardsServerItemModel.getItemNameForPreview();
                                if (itemNameForPreview == null) {
                                    itemNameForPreview = bpRewardsServerItemModel.getItemName();
                                }
                                function42.invoke(numValueOf, 1, itemNameForPreview, null);
                            }
                        }, composer3, 0, 0, 0, 16224242);
                        composer3.startReplaceableGroup(-547675631);
                        if (bpRewardsServerItemModel.getSprayPrice() > 0) {
                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._52wdp, composer3, 6));
                            long jColorResource = ColorResources_androidKt.colorResource(R.color.purple, composer3, 6);
                            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_50, composer3, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.purple, composer3, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.purple, composer3, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_50, composer3, 6))});
                            GradientAngle gradientAngle = GradientAngle.CW180;
                            ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierM8177width3ABfNKs, null, jColorResource, 0L, 0.0f, Brush.Companion.m11291linearGradientmHitzGk$default(companion10, listListOf, GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null), roundedCornerShape, borderStroke, null, false, false, mutableState3, false, false, false, false, 0, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$3$1$3$2$2
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
                                    function4.invoke(Integer.valueOf(bpRewardsServerItemModel.getItemIdOnServer()), 3, null, Integer.valueOf(bpRewardsServerItemModel.getSprayPrice()));
                                }
                            }, ComposableLambdaKt.composableLambda(composer3, -486948806, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$2$1$3$1$3$2$3
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
                                public final void invoke(@Nullable Composer composer4, int i7) {
                                    if ((i7 & 11) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-486948806, i7, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BpRewardsListItem.kt:471)");
                                        }
                                        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer4, 6)), null, null, 0.0f, null, 0, composer4, 8, 124);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 0, 805306368, 259866);
                        }
                        composer3.endReplaceableGroup();
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
            }), composer2, ((i3 >> 3) & 7168) | 805330944, 226);
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1195034711);
        if (item.isHaveAlarm() > 0) {
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_alarm, composer2, i5), (String) null, SizeKt.m8172size3ABfNKs(boxScopeInstance.align(companion, companion4.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer2, i5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt.BpRewardsListItem.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i6) {
                    BpRewardsListItemKt.BpRewardsListItem(modifier4, item, i, i2, isEnabledState, onItemClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    /* compiled from: BpRewardsListItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1", m7120f = "BpRewardsListItem.kt", m7121i = {}, m7122l = {139}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1 */
    public static final class C50011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ BpRewardsServerItemModel $item;
        public final /* synthetic */ int $renderSize;
        public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50011(MutableState<Bitmap> mutableState, BpRewardsServerItemModel bpRewardsServerItemModel, Context context, int i, Continuation<? super C50011> continuation) {
            super(2, continuation);
            this.$rewardImage$delegate = mutableState;
            this.$item = bpRewardsServerItemModel;
            this.$context = context;
            this.$renderSize = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50011(this.$rewardImage$delegate, this.$item, this.$context, this.$renderSize, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BpRewardsListItemKt.BpRewardsListItem$lambda$2(this.$rewardImage$delegate, null);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.$context, this.$rewardImage$delegate, this.$renderSize, null);
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

        /* compiled from: BpRewardsListItem.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1$1", m7120f = "BpRewardsListItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ BpRewardsServerItemModel $item;
            public final /* synthetic */ int $renderSize;
            public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BpRewardsServerItemModel bpRewardsServerItemModel, Context context, MutableState<Bitmap> mutableState, int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$item = bpRewardsServerItemModel;
                this.$context = context;
                this.$rewardImage$delegate = mutableState;
                this.$renderSize = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$item, this.$context, this.$rewardImage$delegate, this.$renderSize, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                BpRewardsRenderAttachment render;
                BpRewardsRenderAttachment render2;
                BpRewardsRenderAttachment render3;
                int i;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int imageType = this.$item.getImageModel().getImageType();
                if (imageType == 9112) {
                    if (this.$item.getImageModel().getPngSvgName().length() > 0) {
                        BpRewardsListItemKt.BpRewardsListItem$lambda$2(this.$rewardImage$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$item.getImageModel().getPngSvgName(), ImageTypePathInCDNEnum.SKIN, 0.0f, 0.0f, 24, null));
                    }
                    if (AnyExtensionKt.isNull(BpRewardsListItemKt.BpRewardsListItem$lambda$1(this.$rewardImage$delegate)) && (render = this.$item.getImageModel().getRender()) != null) {
                        int i2 = this.$renderSize;
                        final MutableState<Bitmap> mutableState = this.$rewardImage$delegate;
                        GameRender.getInstance().RequestRenderWithSize(render.getType(), render.getModelId(), render.getModelId(), render.getColor(), render.getColor(), render.getRotationX(), render.getRotationY(), render.getRotationZ(), render.getZoom(), render.getShiftX(), render.getShiftY(), render.getShiftZ(), i2, i2, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1$1$$ExternalSyntheticLambda1
                            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                            public final void OnRenderComplete(int i3, Bitmap bitmap) {
                                BpRewardsListItemKt.access$BpRewardsListItem$lambda$2(mutableState, bitmap);
                            }
                        });
                    }
                } else if (imageType == 9212) {
                    if (this.$item.getImageModel().getPngSvgName().length() > 0) {
                        BpRewardsListItemKt.BpRewardsListItem$lambda$2(this.$rewardImage$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$item.getImageModel().getPngSvgName(), ImageTypePathInCDNEnum.VEHICLE, 0.0f, 0.0f, 24, null));
                    }
                    if (AnyExtensionKt.isNull(BpRewardsListItemKt.BpRewardsListItem$lambda$1(this.$rewardImage$delegate)) && (render2 = this.$item.getImageModel().getRender()) != null) {
                        int i3 = this.$renderSize;
                        final MutableState<Bitmap> mutableState2 = this.$rewardImage$delegate;
                        GameRender.getInstance().RequestRenderWithSize(render2.getType(), render2.getModelId(), render2.getModelId(), render2.getColor(), render2.getColor(), render2.getRotationX(), render2.getRotationY(), render2.getRotationZ(), render2.getZoom(), render2.getShiftX(), render2.getShiftY(), render2.getShiftZ(), i3, i3, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1$1$$ExternalSyntheticLambda0
                            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                            public final void OnRenderComplete(int i4, Bitmap bitmap) {
                                BpRewardsListItemKt.access$BpRewardsListItem$lambda$2(mutableState2, bitmap);
                            }
                        });
                    }
                } else if (imageType != 9312) {
                    int i4 = 3;
                    if (imageType == 9412) {
                        BpRewardsRenderAttachment render4 = this.$item.getImageModel().getRender();
                        if (render4 != null) {
                            final MutableState<Bitmap> mutableState3 = this.$rewardImage$delegate;
                            int type = render4.getType();
                            if (type != 59) {
                                switch (type) {
                                    case 81:
                                        i4 = 2;
                                        i = i4;
                                        break;
                                    case 82:
                                        i = i4;
                                        break;
                                    case 83:
                                        i4 = 4;
                                        i = i4;
                                        break;
                                    default:
                                        i = 1;
                                        break;
                                }
                                GameRender gameRender = GameRender.getInstance();
                                int modelId = render4.getModelId();
                                String str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) render4.getPlateText());
                                String str2 = str == null ? "" : str;
                                String str3 = (String) CollectionsKt___CollectionsKt.getOrNull(render4.getPlateText(), 1);
                                gameRender.RequestTexturePlate(i, modelId, str2, str3 == null ? "" : str3, render4.getRotationX(), render4.getRotationY(), render4.getRotationZ(), render4.getZoom(), new GameRender.GameTextureListener() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1$1$$ExternalSyntheticLambda3
                                    @Override // com.blackhub.bronline.game.GameRender.GameTextureListener
                                    public final void OnTextureGet(int i5, Bitmap bitmap) {
                                        BpRewardsListItemKt.C50011.AnonymousClass1.invokeSuspend$lambda$7$lambda$6(mutableState3, i5, bitmap);
                                    }
                                });
                            }
                        }
                    } else if (this.$item.getImageModel().getPngSvgName().length() > 0) {
                        BpRewardsListItemKt.BpRewardsListItem$lambda$2(this.$rewardImage$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$item.getImageModel().getPngSvgName(), StringExtensionKt.getImageTypePathInCDN$default(this.$item.getImageModel().getPngSvgName(), 0, 0, 3, null), 0.0f, 0.0f, 24, null));
                    }
                } else {
                    if (this.$item.getImageModel().getPngSvgName().length() > 0) {
                        BpRewardsListItemKt.BpRewardsListItem$lambda$2(this.$rewardImage$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$item.getImageModel().getPngSvgName(), ImageTypePathInCDNEnum.ACCESSORY, 0.0f, 0.0f, 24, null));
                    }
                    if (AnyExtensionKt.isNull(BpRewardsListItemKt.BpRewardsListItem$lambda$1(this.$rewardImage$delegate)) && (render3 = this.$item.getImageModel().getRender()) != null) {
                        int i5 = this.$renderSize;
                        final MutableState<Bitmap> mutableState4 = this.$rewardImage$delegate;
                        GameRender.getInstance().RequestRenderWithSize(render3.getType(), render3.getModelId(), render3.getModelId(), render3.getColor(), render3.getColor(), render3.getRotationX(), render3.getRotationY(), render3.getRotationZ(), render3.getZoom(), render3.getShiftX(), render3.getShiftY(), render3.getShiftZ(), i5, i5, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt$BpRewardsListItem$1$1$$ExternalSyntheticLambda2
                            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                            public final void OnRenderComplete(int i6, Bitmap bitmap) {
                                BpRewardsListItemKt.access$BpRewardsListItem$lambda$2(mutableState4, bitmap);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }

            public static final void invokeSuspend$lambda$7$lambda$6(MutableState mutableState, int i, Bitmap bitmap) {
                Matrix matrix = new Matrix();
                matrix.preScale(-1.0f, 1.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                bitmapCreateBitmap.setDensity(160);
                BpRewardsListItemKt.BpRewardsListItem$lambda$2(mutableState, bitmapCreateBitmap);
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBpRewardsListItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(606179308);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(606179308, i, -1, "com.blackhub.bronline.game.ui.bprewards.PreviewBpRewardsListItem (BpRewardsListItem.kt:500)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BpRewardsServerItemModel bpRewardsServerItemModel = new BpRewardsServerItemModel(0, "Купон x2 Купон x2 Купон x2", 0, 1, null, null, 0, 1, null, 10, 0, false, "12 Дней", null, null, 25973, null);
            composerStartRestartGroup.startReplaceableGroup(-1473411492);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BpRewardsListItem(companion, bpRewardsServerItemModel, 0, R.drawable.ic_marketplace, (MutableState) objRememberedValue, new Function4<Integer, Integer, String, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt.PreviewBpRewardsListItem.2
                public final void invoke(int i2, int i3, @Nullable String str, @Nullable Integer num) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, String str, Integer num3) {
                    invoke(num.intValue(), num2.intValue(), str, num3);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 224710, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsListItemKt.PreviewBpRewardsListItem.3
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
                    BpRewardsListItemKt.PreviewBpRewardsListItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap BpRewardsListItem$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void BpRewardsListItem$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}
