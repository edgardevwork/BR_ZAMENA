package com.blackhub.bronline.game.p019ui.cases.uiblock;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesBottomRewardItemKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBottomRewardItem.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a×\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00060\u00152!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00060\u00152:\u0010\u001b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00060\u001cH\u0007¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0003X\u008a\u0084\u0002"}, m7105d2 = {"DELAY_BEFORE_RENDER", "", "ITEM_SCALE", "", "WEIGHT_FILL_IMAGE", "CasesBottomRewardItem", "", "currentAward", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "bgColor", "", "state", "Landroidx/compose/foundation/lazy/LazyListState;", FirebaseAnalytics.Param.INDEX, "selectedItemIndex", "Landroidx/compose/runtime/MutableState;", "isAllowedTouch", "", "widthOfImage", "heightOfImage", "selectItem", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rewardIndex", "onClickItem", "rewardPos", "getSelectedImage", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "rewardImage", "rewardImageType", "(Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;ILandroidx/compose/foundation/lazy/LazyListState;ILandroidx/compose/runtime/MutableState;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "PreviewCasesBottomRewardItem", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "scaleOfItem"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCasesBottomRewardItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesBottomRewardItem.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesBottomRewardItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n74#2:193\n1116#3,6:194\n1116#3,6:200\n1116#3,6:206\n1116#3,6:212\n1116#3,6:218\n1116#3,6:224\n69#4,5:230\n74#4:263\n78#4:268\n79#5,11:235\n92#5:267\n456#6,8:246\n464#6,3:260\n467#6,3:264\n3737#7,6:254\n81#8:269\n107#8,2:270\n81#8:272\n107#8,2:273\n81#8:275\n*S KotlinDebug\n*F\n+ 1 CasesBottomRewardItem.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesBottomRewardItemKt\n*L\n69#1:193\n70#1:194,6\n71#1:200,6\n73#1:206,6\n75#1:212,6\n141#1:218,6\n158#1:224,6\n138#1:230,5\n138#1:263\n138#1:268\n138#1:235,11\n138#1:267\n138#1:246,8\n138#1:260,3\n138#1:264,3\n138#1:254,6\n70#1:269\n70#1:270,2\n71#1:272\n71#1:273,2\n75#1:275\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesBottomRewardItemKt {
    public static final long DELAY_BEFORE_RENDER = 150;
    public static final float ITEM_SCALE = 1.3f;
    public static final float WEIGHT_FILL_IMAGE = 0.9f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesBottomRewardItem(@NotNull final CaseReward currentAward, int i, @NotNull final LazyListState state, final int i2, @NotNull final MutableState<Integer> selectedItemIndex, final boolean z, final int i3, final int i4, @NotNull final Function1<? super Integer, Unit> selectItem, @NotNull final Function1<? super Integer, Unit> onClickItem, @NotNull final Function2<? super Bitmap, ? super Integer, Unit> getSelectedImage, @Nullable Composer composer, final int i5, final int i6, final int i7) {
        int bgColorBottomReward;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        Intrinsics.checkNotNullParameter(currentAward, "currentAward");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectedItemIndex, "selectedItemIndex");
        Intrinsics.checkNotNullParameter(selectItem, "selectItem");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        Intrinsics.checkNotNullParameter(getSelectedImage, "getSelectedImage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1179328499);
        if ((i7 & 2) != 0) {
            bgColorBottomReward = currentAward.getBgColorBottomReward();
            i8 = i5 & (-113);
        } else {
            bgColorBottomReward = i;
            i8 = i5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179328499, i8, i6, "com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItem (CasesBottomRewardItem.kt:67)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-950079082);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-950079012);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-950078943);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-950078879);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            i9 = bgColorBottomReward;
            i10 = i8;
            composer2 = composerStartRestartGroup;
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$scaleOfItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    Object next;
                    List<LazyListItemInfo> visibleItemsInfo = state.getLayoutInfo().getVisibleItemsInfo();
                    int i11 = i2;
                    Iterator<T> it = visibleItemsInfo.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((LazyListItemInfo) next).getIndex() == i11) {
                            break;
                        }
                    }
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                    if (lazyListItemInfo != null) {
                        LazyListState lazyListState = state;
                        Function1<Integer, Unit> function1 = selectItem;
                        int i12 = i2;
                        MutableState<Integer> mutableState3 = selectedItemIndex;
                        Function2<Bitmap, Integer, Unit> function2 = getSelectedImage;
                        MutableState<Bitmap> mutableState4 = mutableState;
                        MutableState<Integer> mutableState5 = mutableState2;
                        int size = lazyListItemInfo.getSize() / 2;
                        int offset = (lazyListItemInfo.getOffset() + (lazyListItemInfo.getSize() / 2)) - (lazyListState.getLayoutInfo().getViewportEndOffset() / 2);
                        if ((-size) <= offset && offset <= size) {
                            function1.invoke(Integer.valueOf(i12));
                            mutableState3.setValue(Integer.valueOf(i12));
                            function2.invoke(CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$1(mutableState4), CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$4(mutableState5));
                            return Float.valueOf(1.3f);
                        }
                    }
                    return Float.valueOf(1.0f);
                }
            });
            composer2.updateRememberedValue(objRememberedValue4);
        } else {
            i9 = bgColorBottomReward;
            i10 = i8;
            composer2 = composerStartRestartGroup;
        }
        final State state2 = (State) objRememberedValue4;
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(currentAward, new C52161(mutableState, currentAward, i3, i4, context, mutableState2, null), composer2, 72);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composer2, 6));
        composer2.startReplaceableGroup(-950076019);
        Object objRememberedValue5 = composer2.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setScaleX(CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$8(state2));
                    graphicsLayer.setScaleY(CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$8(state2));
                }
            };
            composer2.updateRememberedValue(objRememberedValue5);
        }
        composer2.endReplaceableGroup();
        Modifier modifierBackground$default = BackgroundKt.background$default(GraphicsLayerModifierKt.graphicsLayer(modifierM8172size3ABfNKs, (Function1) objRememberedValue5), Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(i9, composer2, (i10 >> 3) & 14))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), 0.0f, 4, null);
        boolean z2 = true;
        boolean z3 = selectedItemIndex.getValue().intValue() != i2 && z;
        composer2.startReplaceableGroup(-950075361);
        boolean z4 = (((1879048192 & i5) ^ 805306368) > 536870912 && composer2.changed(onClickItem)) || (i5 & 805306368) == 536870912;
        if ((((i5 & 7168) ^ 3072) <= 2048 || !composer2.changed(i2)) && (i5 & 3072) != 2048) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        Object objRememberedValue6 = composer2.rememberedValue();
        if (z5 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$3$1
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
                    onClickItem.invoke(Integer.valueOf(i2));
                }
            };
            composer2.updateRememberedValue(objRememberedValue6);
        }
        composer2.endReplaceableGroup();
        Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierBackground$default, mutableInteractionSource, null, z3, null, null, (Function0) objRememberedValue6, 24, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(CasesBottomRewardItem$lambda$1(mutableState), SizeKt.fillMaxSize(companion2, 0.9f), null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composer2, 3128, 116);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = i9;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt.CasesBottomRewardItem.5
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

                public final void invoke(@Nullable Composer composer3, int i12) {
                    CasesBottomRewardItemKt.CasesBottomRewardItem(currentAward, i11, state, i2, selectedItemIndex, z, i3, i4, selectItem, onClickItem, getSelectedImage, composer3, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }

    /* compiled from: CasesBottomRewardItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$1", m7120f = "CasesBottomRewardItem.kt", m7121i = {}, m7122l = {99, 101}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$1 */
    /* loaded from: classes7.dex */
    public static final class C52161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ CaseReward $currentAward;
        public final /* synthetic */ int $heightOfImage;
        public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
        public final /* synthetic */ MutableState<Integer> $rewardImageType$delegate;
        public final /* synthetic */ int $widthOfImage;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52161(MutableState<Bitmap> mutableState, CaseReward caseReward, int i, int i2, Context context, MutableState<Integer> mutableState2, Continuation<? super C52161> continuation) {
            super(2, continuation);
            this.$rewardImage$delegate = mutableState;
            this.$currentAward = caseReward;
            this.$widthOfImage = i;
            this.$heightOfImage = i2;
            this.$context = context;
            this.$rewardImageType$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C52161(this.$rewardImage$delegate, this.$currentAward, this.$widthOfImage, this.$heightOfImage, this.$context, this.$rewardImageType$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C52161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNotNull(CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$1(this.$rewardImage$delegate))) {
                    CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$2(this.$rewardImage$delegate, null);
                    this.label = 1;
                    if (DelayKt.delay(150L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentAward, this.$widthOfImage, this.$heightOfImage, this.$context, this.$rewardImageType$delegate, this.$rewardImage$delegate, null);
            this.label = 2;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CasesBottomRewardItem.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$1$1", m7120f = "CasesBottomRewardItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ CaseReward $currentAward;
            public final /* synthetic */ int $heightOfImage;
            public final /* synthetic */ MutableState<Bitmap> $rewardImage$delegate;
            public final /* synthetic */ MutableState<Integer> $rewardImageType$delegate;
            public final /* synthetic */ int $widthOfImage;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CaseReward caseReward, int i, int i2, Context context, MutableState<Integer> mutableState, MutableState<Bitmap> mutableState2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currentAward = caseReward;
                this.$widthOfImage = i;
                this.$heightOfImage = i2;
                this.$context = context;
                this.$rewardImageType$delegate = mutableState;
                this.$rewardImage$delegate = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$currentAward, this.$widthOfImage, this.$heightOfImage, this.$context, this.$rewardImageType$delegate, this.$rewardImage$delegate, continuation);
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
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$currentAward.isRender()) {
                    GameRender gameRender = GameRender.getInstance();
                    int type = this.$currentAward.getRenderAttachment().getType();
                    int modelId = this.$currentAward.getRenderAttachment().getModelId();
                    int modelId2 = this.$currentAward.getRenderAttachment().getModelId();
                    int color = this.$currentAward.getRenderAttachment().getColor();
                    int color2 = this.$currentAward.getRenderAttachment().getColor();
                    Float rotationX = this.$currentAward.getRenderAttachment().getRotationX();
                    float fFloatValue = rotationX != null ? rotationX.floatValue() : 20.0f;
                    Float rotationY = this.$currentAward.getRenderAttachment().getRotationY();
                    float fFloatValue2 = rotationY != null ? rotationY.floatValue() : 180.0f;
                    Float rotationZ = this.$currentAward.getRenderAttachment().getRotationZ();
                    float fFloatValue3 = rotationZ != null ? rotationZ.floatValue() : 45.0f;
                    float zoom = this.$currentAward.getRenderAttachment().getZoom();
                    float orZero = FloatExtensionKt.getOrZero(this.$currentAward.getRenderAttachment().getShiftX());
                    float orZero2 = FloatExtensionKt.getOrZero(this.$currentAward.getRenderAttachment().getShiftY());
                    float orZero3 = FloatExtensionKt.getOrZero(this.$currentAward.getRenderAttachment().getShiftZ());
                    int i = this.$widthOfImage;
                    int i2 = this.$heightOfImage;
                    final CaseReward caseReward = this.$currentAward;
                    final MutableState<Integer> mutableState = this.$rewardImageType$delegate;
                    final MutableState<Bitmap> mutableState2 = this.$rewardImage$delegate;
                    gameRender.RequestRenderWithSize(type, modelId, modelId2, color, color2, fFloatValue, fFloatValue2, fFloatValue3, zoom, orZero, orZero2, orZero3, i, i2, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt$CasesBottomRewardItem$1$1$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                        public final void OnRenderComplete(int i3, Bitmap bitmap) {
                            CasesBottomRewardItemKt.C52161.AnonymousClass1.invokeSuspend$lambda$0(caseReward, mutableState, mutableState2, i3, bitmap);
                        }
                    });
                } else {
                    MutableState<Bitmap> mutableState3 = this.$rewardImage$delegate;
                    Context context = this.$context;
                    String imageName = this.$currentAward.getImageName();
                    ImageTypePathInCDNEnum imageTypePathInCDN = StringExtensionKt.getImageTypePathInCDN(this.$currentAward.getImageName(), this.$currentAward.getRewardType(), this.$currentAward.getInternalId());
                    int i3 = this.$widthOfImage;
                    CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$2(mutableState3, BitmapUtilsKt.getBitmapFromZip(context, imageName, imageTypePathInCDN, i3, i3));
                }
                return Unit.INSTANCE;
            }

            public static final void invokeSuspend$lambda$0(CaseReward caseReward, MutableState mutableState, MutableState mutableState2, int i, Bitmap bitmap) {
                CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$5(mutableState, Integer.valueOf(caseReward.getRenderAttachment().getType()));
                CasesBottomRewardItemKt.CasesBottomRewardItem$lambda$2(mutableState2, bitmap);
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview
    public static final void PreviewCasesBottomRewardItem(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1125266308);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1125266308, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.PreviewCasesBottomRewardItem (CasesBottomRewardItem.kt:173)");
            }
            composer2 = composerStartRestartGroup;
            CasesBottomRewardItem(new CaseReward(0, 0, "ololo", null, null, null, 0, null, CommonRarityEnum.LEGENDARY, false, false, false, 0, false, null, null, 0, 128251, null), 0, LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3), 3, SnapshotIntStateKt.mutableIntStateOf(1), true, 512, 512, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt.PreviewCasesBottomRewardItem.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt.PreviewCasesBottomRewardItem.2
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function2<Bitmap, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt.PreviewCasesBottomRewardItem.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Bitmap bitmap, @Nullable Integer num) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap, Integer num) {
                    invoke2(bitmap, num);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920325128, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardItemKt.PreviewCasesBottomRewardItem.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    CasesBottomRewardItemKt.PreviewCasesBottomRewardItem(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap CasesBottomRewardItem$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void CasesBottomRewardItem$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    public static final Integer CasesBottomRewardItem$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue();
    }

    public static final void CasesBottomRewardItem$lambda$5(MutableState<Integer> mutableState, Integer num) {
        mutableState.setValue(num);
    }

    public static final float CasesBottomRewardItem$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }
}
