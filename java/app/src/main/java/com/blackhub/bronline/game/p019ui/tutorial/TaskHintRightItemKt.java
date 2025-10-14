package com.blackhub.bronline.game.p019ui.tutorial;

import android.graphics.Color;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.gui.tutorialhints.HintQuestData;
import com.blackhub.bronline.game.p019ui.widget.progressbar.ProgressBarHorizontalKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: TaskHintRightItem.kt */
@SourceDebugExtension({"SMAP\nTaskHintRightItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskHintRightItem.kt\ncom/blackhub/bronline/game/ui/tutorial/TaskHintRightItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Color.kt\nandroidx/core/graphics/ColorKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n1116#2,6:111\n88#3,5:117\n93#3:150\n97#3:191\n79#4,11:122\n79#4,11:153\n92#4:185\n92#4:190\n456#5,8:133\n464#5,3:147\n456#5,8:164\n464#5,3:178\n467#5,3:182\n467#5,3:187\n3737#6,6:141\n3737#6,6:172\n78#7,2:151\n80#7:181\n84#7:186\n154#8:192\n470#9:193\n81#10:194\n81#10:195\n*S KotlinDebug\n*F\n+ 1 TaskHintRightItem.kt\ncom/blackhub/bronline/game/ui/tutorial/TaskHintRightItemKt\n*L\n44#1:111,6\n60#1:117,5\n60#1:150\n60#1:191\n60#1:122,11\n69#1:153,11\n69#1:185\n60#1:190\n60#1:133,8\n60#1:147,3\n69#1:164,8\n69#1:178,3\n69#1:182,3\n60#1:187,3\n60#1:141,6\n69#1:172,6\n69#1:151,2\n69#1:181\n69#1:186\n101#1:192\n106#1:193\n44#1:194\n54#1:195\n*E\n"})
/* loaded from: classes2.dex */
public final class TaskHintRightItemKt {
    public static final float COLUMN_BLOCK_WEIGHT = 0.25f;
    public static final float TEXT_BLOCK_WEIGHT = 0.75f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaskHintRightItem(@Nullable Modifier modifier, @NotNull final HintQuestData hintQuestData, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(hintQuestData, "hintQuestData");
        Composer composerStartRestartGroup = composer.startRestartGroup(974961720);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(974961720, i, -1, "com.blackhub.bronline.game.ui.tutorial.TaskHintRightItem (TaskHintRightItem.kt:42)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1935659355);
        boolean zChanged = composerStartRestartGroup.changed(hintQuestData);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.tutorial.TaskHintRightItemKt$TaskHintRightItem$currentProgress$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(IntExtensionKt.isNotZero(Integer.valueOf(hintQuestData.getMaxQuestsStatus())) ? hintQuestData.getThisQuestsStatus() / hintQuestData.getMaxQuestsStatus() : 0.0f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(TaskHintRightItem$lambda$1((State) objRememberedValue), ProgressIndicatorDefaults.INSTANCE.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 0, 20);
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(modifier2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 0.75f, false, 2, null);
        AnnotatedString annotatedString = ComposeExtensionKt.toAnnotatedString(hintQuestData.getQuestsText());
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        final Modifier modifier3 = modifier2;
        TextKt.m10025TextIbK3jfQ(annotatedString, modifierWeight$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14846montserratRegular8spOr6ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, 0, 0, 131068);
        Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion3, 0.25f, false, 2, null);
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_42 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_42, centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_progress_value, new Object[]{Integer.valueOf(hintQuestData.getThisQuestsStatus()), Integer.valueOf(hintQuestData.getMaxQuestsStatus())}, composerStartRestartGroup, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14858montserratSemiBold6spOr5ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65534);
        ProgressBarHorizontalKt.m15102ProgressBarHorizontal2uT47r8(companion3, TaskHintRightItem$lambda$2(stateAnimateFloatAsState), PrimitiveResources_androidKt.dimensionResource(R.dimen._25sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.black_50, composerStartRestartGroup, 6), hintQuestData.m14762getProgressBarColor0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6), null, composerStartRestartGroup, 6, 128);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TaskHintRightItemKt.TaskHintRightItem.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TaskHintRightItemKt.TaskHintRightItem(modifier3, hintQuestData, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "TaskHintRightItem")
    public static final void PreviewTaskHintRightItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2132184460);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2132184460, i, -1, "com.blackhub.bronline.game.ui.tutorial.PreviewTaskHintRightItem (TaskHintRightItem.kt:98)");
            }
            TaskHintRightItem(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(190)), new HintQuestData(StringExtensionKt.htmlStringToSpanned("Эвакуировать <font color=#FFBA08>газовый балон</font> в безопасную зону.\n\nЗатушить бочку с горючим при помощи огнетушителя."), 2, 7, ColorKt.Color(Color.parseColor("#FF4CDB5A")), false, null), composerStartRestartGroup, 70, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TaskHintRightItemKt.PreviewTaskHintRightItem.1
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
                    TaskHintRightItemKt.PreviewTaskHintRightItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float TaskHintRightItem$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float TaskHintRightItem$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }
}

