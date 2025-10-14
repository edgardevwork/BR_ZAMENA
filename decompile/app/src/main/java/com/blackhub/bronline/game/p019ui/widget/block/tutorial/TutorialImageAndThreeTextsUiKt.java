package com.blackhub.bronline.game.p019ui.widget.block.tutorial;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.AnnotatedStringKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TutorialImageAndThreeTextsUi.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a1\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0007¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0013X\u008a\u0084\u0002"}, m7105d2 = {"FILL_HEIGHT_PERCENT", "", "PreviewCasesMainHintUi", "", "(Landroidx/compose/runtime/Composer;I)V", "TutorialWithImageAndThreeTextsUi", "tutorialAttachment", "", "Lcom/blackhub/bronline/game/core/utils/attachment/tutorial/CommonTutorialTextsWithImage;", "pageCount", "", "onCloseClick", "Lkotlin/Function0;", "(Ljava/util/List;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "newSelectedIndicator", "selectedIndicator", "colorLeftArrow", "isEnabledLeftArrowClick", "", "colorRightArrow", "isEnabledRightArrowClick"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTutorialImageAndThreeTextsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialImageAndThreeTextsUi.kt\ncom/blackhub/bronline/game/ui/widget/block/tutorial/TutorialImageAndThreeTextsUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,248:1\n1116#2,6:249\n1116#2,6:255\n1116#2,6:261\n1116#2,6:267\n1116#2,6:273\n1116#2,6:279\n1116#2,6:285\n1116#2,6:291\n1116#2,6:297\n1116#2,6:337\n69#3,5:303\n74#3:336\n78#3:387\n79#4,11:308\n79#4,11:349\n92#4:381\n92#4:386\n456#5,8:319\n464#5,3:333\n456#5,8:360\n464#5,3:374\n467#5,3:378\n467#5,3:383\n3737#6,6:327\n3737#6,6:368\n74#7,6:343\n80#7:377\n84#7:382\n75#8:388\n108#8,2:389\n75#8:392\n75#8:394\n81#9:391\n81#9:393\n81#9:395\n*S KotlinDebug\n*F\n+ 1 TutorialImageAndThreeTextsUi.kt\ncom/blackhub/bronline/game/ui/widget/block/tutorial/TutorialImageAndThreeTextsUiKt\n*L\n52#1:249,6\n53#1:255,6\n55#1:261,6\n72#1:267,6\n80#1:273,6\n89#1:279,6\n97#1:285,6\n122#1:291,6\n123#1:297,6\n194#1:337,6\n183#1:303,5\n183#1:336\n183#1:387\n183#1:308,11\n198#1:349,11\n198#1:381\n183#1:386\n183#1:319,8\n183#1:333,3\n198#1:360,8\n198#1:374,3\n198#1:378,3\n183#1:383,3\n183#1:327,6\n198#1:368,6\n198#1:343,6\n198#1:377\n198#1:382\n52#1:388\n52#1:389,2\n72#1:392\n89#1:394\n55#1:391\n80#1:393\n97#1:395\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialImageAndThreeTextsUiKt {
    public static final float FILL_HEIGHT_PERCENT = 0.9f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TutorialWithImageAndThreeTextsUi(@NotNull final List<CommonTutorialTextsWithImage> tutorialAttachment, final int i, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i2) {
        Composer composer2;
        AnnotatedString title;
        Intrinsics.checkNotNullParameter(tutorialAttachment, "tutorialAttachment");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-736028638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-736028638, i2, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialWithImageAndThreeTextsUi (TutorialImageAndThreeTextsUi.kt:49)");
        }
        final long jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        composerStartRestartGroup.startReplaceableGroup(2008281128);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2008281197);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        int intValue = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(2008281267);
        boolean zChanged = composerStartRestartGroup.changed(intValue);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt$TutorialWithImageAndThreeTextsUi$selectedIndicator$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    int intValue2;
                    if (mutableIntState.getIntValue() < 0) {
                        intValue2 = 0;
                    } else if (mutableIntState.getIntValue() >= i) {
                        onCloseClick.invoke();
                        intValue2 = i - 1;
                    } else {
                        intValue2 = mutableIntState.getIntValue();
                    }
                    return Integer.valueOf(intValue2);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        int iTutorialWithImageAndThreeTextsUi$lambda$5 = TutorialWithImageAndThreeTextsUi$lambda$5(state);
        composerStartRestartGroup.startReplaceableGroup(2008281734);
        boolean zChanged2 = composerStartRestartGroup.changed(iTutorialWithImageAndThreeTextsUi$lambda$5);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(TutorialWithImageAndThreeTextsUi$lambda$5(state) == 0 ? R.color.white_40 : R.color.white);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        int iTutorialWithImageAndThreeTextsUi$lambda$52 = TutorialWithImageAndThreeTextsUi$lambda$5(state);
        composerStartRestartGroup.startReplaceableGroup(2008281978);
        boolean zChanged3 = composerStartRestartGroup.changed(iTutorialWithImageAndThreeTextsUi$lambda$52);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(TutorialWithImageAndThreeTextsUi$lambda$5(state) != 0), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        MutableState mutableState = (MutableState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        int iTutorialWithImageAndThreeTextsUi$lambda$53 = TutorialWithImageAndThreeTextsUi$lambda$5(state);
        composerStartRestartGroup.startReplaceableGroup(2008282192);
        boolean zChanged4 = composerStartRestartGroup.changed(iTutorialWithImageAndThreeTextsUi$lambda$53);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(TutorialWithImageAndThreeTextsUi$lambda$5(state) == CollectionsKt__CollectionsKt.getLastIndex(tutorialAttachment) ? R.color.white_40 : R.color.white);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        int iTutorialWithImageAndThreeTextsUi$lambda$54 = TutorialWithImageAndThreeTextsUi$lambda$5(state);
        composerStartRestartGroup.startReplaceableGroup(2008282457);
        boolean zChanged5 = composerStartRestartGroup.changed(iTutorialWithImageAndThreeTextsUi$lambda$54);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (zChanged5 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(TutorialWithImageAndThreeTextsUi$lambda$5(state) != CollectionsKt__CollectionsKt.getLastIndex(tutorialAttachment)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        final CommonTutorialTextsWithImage commonTutorialTextsWithImage = (CommonTutorialTextsWithImage) CollectionsKt___CollectionsKt.getOrNull(tutorialAttachment, TutorialWithImageAndThreeTextsUi$lambda$5(state));
        CommonTutorialTextsWithImage commonTutorialTextsWithImage2 = (CommonTutorialTextsWithImage) CollectionsKt___CollectionsKt.getOrNull(tutorialAttachment, TutorialWithImageAndThreeTextsUi$lambda$5(state));
        String string = StringExtensionKt.getOrEmpty((commonTutorialTextsWithImage2 == null || (title = commonTutorialTextsWithImage2.getTitle()) == null) ? null : AnnotatedStringKt.toUpperCase$default(title, null, 1, null)).toString();
        long jColorResource = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
        int iTutorialWithImageAndThreeTextsUi$lambda$55 = TutorialWithImageAndThreeTextsUi$lambda$5(state);
        int intValue2 = mutableIntState2.getIntValue();
        int intValue3 = mutableIntState3.getIntValue();
        boolean zTutorialWithImageAndThreeTextsUi$lambda$9 = TutorialWithImageAndThreeTextsUi$lambda$9(mutableState);
        boolean zTutorialWithImageAndThreeTextsUi$lambda$13 = TutorialWithImageAndThreeTextsUi$lambda$13(mutableState2);
        composerStartRestartGroup.startReplaceableGroup(2008283431);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt$TutorialWithImageAndThreeTextsUi$1$1
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
                    mutableIntState.setIntValue(r0.getIntValue() - 1);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        Function0 function0 = (Function0) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2008283496);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt$TutorialWithImageAndThreeTextsUi$2$1
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
                    MutableIntState mutableIntState4 = mutableIntState;
                    mutableIntState4.setIntValue(mutableIntState4.getIntValue() + 1);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        PanelInfoBlockKt.m15068PanelInfoBlockGF6hDo(0.0f, 0.0f, null, string, jColorResource, null, R.color.total_black_90, R.color.black_80, false, true, true, intValue3, intValue2, i, iTutorialWithImageAndThreeTextsUi$lambda$55, 0, 0, 0, 0, 0, null, function0, (Function0) objRememberedValue9, zTutorialWithImageAndThreeTextsUi$lambda$9, zTutorialWithImageAndThreeTextsUi$lambda$13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -874089275, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt.TutorialWithImageAndThreeTextsUi.3
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
            public final void invoke(@Nullable Composer composer3, int i3) {
                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-874089275, i3, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialWithImageAndThreeTextsUi.<anonymous> (TutorialImageAndThreeTextsUi.kt:124)");
                    }
                    CommonTutorialTextsWithImage commonTutorialTextsWithImage3 = commonTutorialTextsWithImage;
                    if (commonTutorialTextsWithImage3 != null) {
                        long j = jM11115getZeroF1C5BW0;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6), 5, null), 0.0f, 1, null), 0.9f);
                        composer3.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Horizontal start = arrangement.getStart();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getTop(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ImageBitmapKt.m15118ImageBitmapAy9G7rc(commonTutorialTextsWithImage3.getImage(), SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 0.5f), null, null, 0.0f, null, 0, composer3, 56, 124);
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.m8127paddingqDBjuR0$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                        composer3.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, companion3.getStart(), composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        AnnotatedString text1 = commonTutorialTextsWithImage3.getText1();
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, 0L, 0, j, 0.0f, null, composer3, 1600518, 38);
                        Composer composer4 = composer3;
                        TextKt.m10025TextIbK3jfQ(text1, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, composer3, 0, 0, 131070);
                        AnnotatedString text2 = commonTutorialTextsWithImage3.getText2();
                        composer4.startReplaceableGroup(142862388);
                        if (text2 != null) {
                            AnnotatedString text22 = commonTutorialTextsWithImage3.getText2();
                            TextStyle textStyleM14843montserratMediumCustomSpbl3sdaw = typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._13wsp, 0L, 0, j, 0.0f, composer3, 224262, 6);
                            composer4 = composer4;
                            TextKt.m10025TextIbK3jfQ(text22, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyleM14843montserratMediumCustomSpbl3sdaw, composer3, 0, 0, 131070);
                        }
                        composer3.endReplaceableGroup();
                        AnnotatedString text3 = commonTutorialTextsWithImage3.getText3();
                        composer4.startReplaceableGroup(-370225699);
                        if (text3 != null) {
                            TextKt.m10025TextIbK3jfQ(text3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._13wsp, 0L, 0, j, 0.0f, composer3, 224262, 6), composer3, 0, 0, 131070);
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
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 920125440, ((i2 << 6) & 7168) | 6, 197040, 2064423);
        if (commonTutorialTextsWithImage == null) {
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment bottomCenter = companion3.getBottomCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(1386302436);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt$TutorialWithImageAndThreeTextsUi$4$1$1$1
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
                        MutableIntState mutableIntState4 = mutableIntState;
                        mutableIntState4.setIntValue(mutableIntState4.getIntValue() + 1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(ClickableKt.m7803clickableO2vRcR0$default(modifierM8158height3ABfNKs, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue10, 28, null), composerStartRestartGroup, 0);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.fillMaxHeight(companion2, 0.9f), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m10024Text4IGK_g(commonTutorialTextsWithImage.getBottomText(), SizeKt.wrapContentHeight$default(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0, jM11115getZeroF1C5BW0, 0.0f, null, composerStartRestartGroup, 1600518, 36), composer2, 48, 0, 65532);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt.TutorialWithImageAndThreeTextsUi.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i3) {
                    TutorialImageAndThreeTextsUiKt.TutorialWithImageAndThreeTextsUi(tutorialAttachment, i, onCloseClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesMainHintUi(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2072495966);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072495966, i, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PreviewCasesMainHintUi (TutorialImageAndThreeTextsUi.kt:222)");
            }
            TutorialWithImageAndThreeTextsUi(CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTutorialTextsWithImage[]{new CommonTutorialTextsWithImage(null, StringExtensionKt.htmlTextToAnnotatedString("title 1"), StringExtensionKt.htmlTextToAnnotatedString("text 1"), StringExtensionKt.htmlTextToAnnotatedString("text 2"), null, "text3", 17, null), new CommonTutorialTextsWithImage(null, StringExtensionKt.htmlTextToAnnotatedString("title 2"), StringExtensionKt.htmlTextToAnnotatedString("text 1"), StringExtensionKt.htmlTextToAnnotatedString("text 2"), null, "text3", 17, null), new CommonTutorialTextsWithImage(null, StringExtensionKt.htmlTextToAnnotatedString("title 3"), StringExtensionKt.htmlTextToAnnotatedString("text 1"), StringExtensionKt.htmlTextToAnnotatedString("text 2"), null, "text3", 17, null)}), 4, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt.PreviewCasesMainHintUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt.PreviewCasesMainHintUi.2
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
                    TutorialImageAndThreeTextsUiKt.PreviewCasesMainHintUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int TutorialWithImageAndThreeTextsUi$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final boolean TutorialWithImageAndThreeTextsUi$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean TutorialWithImageAndThreeTextsUi$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}
