package com.blackhub.bronline.game.p019ui.widget.block.tutorial;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.cases.model.CasesBonusHintAttachment;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TutorialImageAndFourRowsUi.kt */
@SourceDebugExtension({"SMAP\nTutorialImageAndFourRowsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialImageAndFourRowsUi.kt\ncom/blackhub/bronline/game/ui/widget/block/tutorial/TutorialImageAndFourRowsUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,123:1\n1116#2,6:124\n81#3:130\n*S KotlinDebug\n*F\n+ 1 TutorialImageAndFourRowsUi.kt\ncom/blackhub/bronline/game/ui/widget/block/tutorial/TutorialImageAndFourRowsUiKt\n*L\n38#1:124,6\n38#1:130\n*E\n"})
/* loaded from: classes3.dex */
public final class TutorialImageAndFourRowsUiKt {
    public static final float DIALOG_HEIGHT_PERCENT = 0.72f;
    public static final float DIALOG_WIDTH_PERCENT = 0.5f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TutorialImageAndFourRowsUi(@NotNull final CasesBonusHintAttachment hintAttachment, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(hintAttachment, "hintAttachment");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(504337055);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(504337055, i, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndFourRowsUi (TutorialImageAndFourRowsUi.kt:36)");
        }
        composerStartRestartGroup.startReplaceableGroup(-735483616);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(Offset.INSTANCE.m11115getZeroF1C5BW0()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        PanelInfoBlockKt.m15068PanelInfoBlockGF6hDo(0.5f, 0.72f, null, hintAttachment.getTitle(), 0L, TypographyStyle.INSTANCE.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._20wsp, ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), R.color.total_black_90, R.color.black_80, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, onCloseClick, null, null, false, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2142528446, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi.1
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
            public final void invoke(@Nullable Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2142528446, i2, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndFourRowsUi.<anonymous> (TutorialImageAndFourRowsUi.kt:52)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6), 4, null);
                    CasesBonusHintAttachment casesBonusHintAttachment = hintAttachment;
                    MutableState<Offset> mutableState2 = mutableState;
                    composer2.startReplaceableGroup(693286680);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Horizontal start = arrangement.getStart();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(casesBonusHintAttachment.getImage(), SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), null, ContentScale.INSTANCE.getFillHeight(), 0.0f, null, 0, composer2, 3128, 116);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion2.getStart(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    AnnotatedString hintText1 = casesBonusHintAttachment.getHintText1();
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10025TextIbK3jfQ(hintText1, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._13wsp, 0L, 0, TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi$lambda$1(mutableState2), 0.0f, composer2, 221190, 6), composer2, 0, 0, 131070);
                    TextKt.m10024Text4IGK_g(casesBonusHintAttachment.getHintText2(), (Modifier) null, ColorResources_androidKt.colorResource(R.color.red, composer2, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, 0L, 0, TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi$lambda$1(mutableState2), 0.0f, null, composer2, 1597446, 38), composer2, 0, 0, 65530);
                    TextKt.m10025TextIbK3jfQ(casesBonusHintAttachment.getHintText3(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._13wsp, 0L, 0, TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi$lambda$1(mutableState2), 0.0f, composer2, 221190, 6), composer2, 0, 0, 131070);
                    TextKt.m10025TextIbK3jfQ(casesBonusHintAttachment.getHintText4(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._13wsp, 0L, 0, TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi$lambda$1(mutableState2), 0.0f, composer2, 221190, 6), composer2, 0, 0, 131070);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 14155830, 6, ((i >> 3) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21, 32504596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi.2
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
                    TutorialImageAndFourRowsUiKt.TutorialImageAndFourRowsUi(hintAttachment, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesBonusHintUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1319602217);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319602217, i, -1, "com.blackhub.bronline.game.ui.widget.block.tutorial.PreviewCasesBonusHintUi (TutorialImageAndFourRowsUi.kt:111)");
            }
            String upperCase = StringResources_androidKt.stringResource(R.string.cases_bonus_hint, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TutorialImageAndFourRowsUi(new CasesBonusHintAttachment(null, upperCase, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_bonus_hint_text_1, composerStartRestartGroup, 6)), StringResources_androidKt.stringResource(R.string.cases_bonus_hint_text_2, composerStartRestartGroup, 6), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_bonus_hint_text_3, composerStartRestartGroup, 6)), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_bonus_hint_text_4, composerStartRestartGroup, 6)), 1, null), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndFourRowsUiKt.PreviewCasesBonusHintUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.tutorial.TutorialImageAndFourRowsUiKt.PreviewCasesBonusHintUi.2
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
                    TutorialImageAndFourRowsUiKt.PreviewCasesBonusHintUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final long TutorialImageAndFourRowsUi$lambda$1(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }
}

