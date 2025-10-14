package com.blackhub.bronline.game.p019ui.widget.block.item;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
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
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.p019ui.widget.utils.AutoSizeTextKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTaskItem.kt */
@SourceDebugExtension({"SMAP\nCommonTaskItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTaskItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonTaskItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,313:1\n1116#2,6:314\n1116#2,6:320\n1116#2,6:326\n1116#2,6:332\n1116#2,6:338\n1116#2,6:537\n68#3,6:344\n74#3:378\n68#3,6:449\n74#3:483\n78#3:496\n68#3,6:497\n74#3:531\n78#3:536\n68#3,6:543\n74#3:577\n78#3:618\n78#3:628\n79#4,11:350\n79#4,11:381\n79#4,11:415\n92#4:447\n79#4,11:455\n92#4:495\n79#4,11:503\n92#4:535\n79#4,11:549\n79#4,11:580\n92#4:612\n92#4:617\n92#4:622\n92#4:627\n456#5,8:361\n464#5,3:375\n456#5,8:392\n464#5,3:406\n456#5,8:426\n464#5,3:440\n467#5,3:444\n456#5,8:466\n464#5,3:480\n467#5,3:492\n456#5,8:514\n464#5,3:528\n467#5,3:532\n456#5,8:560\n464#5,3:574\n456#5,8:591\n464#5,3:605\n467#5,3:609\n467#5,3:614\n467#5,3:619\n467#5,3:624\n3737#6,6:369\n3737#6,6:400\n3737#6,6:434\n3737#6,6:474\n3737#6,6:522\n3737#6,6:568\n3737#6,6:599\n91#7,2:379\n93#7:409\n91#7,2:578\n93#7:608\n97#7:613\n97#7:623\n75#8,5:410\n80#8:443\n84#8:448\n74#9:484\n74#9:485\n74#9:486\n74#9:487\n74#9:488\n74#9:489\n74#9:490\n74#9:491\n75#10:629\n108#10,2:630\n75#10:632\n108#10,2:633\n75#10:635\n108#10,2:636\n*S KotlinDebug\n*F\n+ 1 CommonTaskItem.kt\ncom/blackhub/bronline/game/ui/widget/block/item/CommonTaskItemKt\n*L\n75#1:314,6\n76#1:320,6\n79#1:326,6\n81#1:332,6\n140#1:338,6\n259#1:537,6\n133#1:344,6\n133#1:378\n186#1:449,6\n186#1:483\n186#1:496\n233#1:497,6\n233#1:531\n233#1:536\n254#1:543,6\n254#1:577\n254#1:618\n133#1:628\n133#1:350,11\n143#1:381,11\n156#1:415,11\n156#1:447\n186#1:455,11\n186#1:495\n233#1:503,11\n233#1:535\n254#1:549,11\n261#1:580,11\n261#1:612\n254#1:617\n143#1:622\n133#1:627\n133#1:361,8\n133#1:375,3\n143#1:392,8\n143#1:406,3\n156#1:426,8\n156#1:440,3\n156#1:444,3\n186#1:466,8\n186#1:480,3\n186#1:492,3\n233#1:514,8\n233#1:528,3\n233#1:532,3\n254#1:560,8\n254#1:574,3\n261#1:591,8\n261#1:605,3\n261#1:609,3\n254#1:614,3\n143#1:619,3\n133#1:624,3\n133#1:369,6\n143#1:400,6\n156#1:434,6\n186#1:474,6\n233#1:522,6\n254#1:568,6\n261#1:599,6\n143#1:379,2\n143#1:409\n261#1:578,2\n261#1:608\n261#1:613\n143#1:623\n156#1:410,5\n156#1:443\n156#1:448\n220#1:484\n221#1:485\n222#1:486\n223#1:487\n224#1:488\n225#1:489\n228#1:490\n229#1:491\n75#1:629\n75#1:630,2\n76#1:632\n76#1:633,2\n79#1:635\n79#1:636,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonTaskItemKt {
    public static final float IMAGE_FILL_FRACTION = 0.8f;

    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v50 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CommonTaskItem(final int i, @NotNull final CommonTaskModel task, @Nullable final Bitmap bitmap, @Nullable final Function1<? super CommonTaskModel, Unit> function1, @NotNull final Function0<Unit> onTaskClick, @Nullable Composer composer, final int i2) {
        int i3;
        CommonTaskState commonTaskState;
        int i4;
        int i5;
        boolean z;
        String str;
        Composer composer2;
        MutableIntState mutableIntState;
        ?? r1;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(onTaskClick, "onTaskClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(737760388);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(737760388, i2, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItem (CommonTaskItem.kt:73)");
        }
        composerStartRestartGroup.startReplaceableGroup(1823719548);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(R.color.black);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1823719617);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(R.color.white);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        String strHolidayEventsTaskButton = StringResourceCompose.INSTANCE.holidayEventsTaskButton(task.getStateOfTask(), task.getButtonType(), composerStartRestartGroup, 384);
        composerStartRestartGroup.startReplaceableGroup(1823719800);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        MutableIntState mutableIntState4 = (MutableIntState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        CommonTaskState stateOfTask = task.getStateOfTask();
        composerStartRestartGroup.startReplaceableGroup(1823719886);
        int i6 = (i2 & 112) ^ 48;
        boolean z2 = (i6 > 32 && composerStartRestartGroup.changed(task)) || (i2 & 48) == 32;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue4 == companion.getEmpty()) {
            i3 = i6;
            commonTaskState = stateOfTask;
            CommonTaskItemKt$CommonTaskItem$1$1 commonTaskItemKt$CommonTaskItem$1$1 = new CommonTaskItemKt$CommonTaskItem$1$1(task, mutableIntState2, mutableIntState3, mutableIntState4, null);
            composerStartRestartGroup.updateRememberedValue(commonTaskItemKt$CommonTaskItem$1$1);
            objRememberedValue4 = commonTaskItemKt$CommonTaskItem$1$1;
        } else {
            i3 = i6;
            commonTaskState = stateOfTask;
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(commonTaskState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 64);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(i, composerStartRestartGroup, i2 & 14)), 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.gray_white, composerStartRestartGroup, 6), null, 2, null);
        boolean zIsNotNull = AnyExtensionKt.isNotNull(function1);
        composerStartRestartGroup.startReplaceableGroup(1823722022);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !composerStartRestartGroup.changed(function1)) && (i2 & 3072) != 2048) {
            i4 = i3;
            i5 = 32;
            z = false;
        } else {
            i4 = i3;
            i5 = 32;
            z = true;
        }
        boolean z3 = ((i4 > i5 && composerStartRestartGroup.changed(task)) || (i2 & 48) == i5) | z;
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt$CommonTaskItem$2$1
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
                    Function1<CommonTaskModel, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(task);
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierNoRippleClickable = ComposeExtensionKt.noRippleClickable(modifierM7771backgroundbw27NRU$default, zIsNotNull, (Function0) objRememberedValue5);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable);
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
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), ColorResources_androidKt.colorResource(mutableIntState2.getIntValue(), composerStartRestartGroup, 0), null, 2, null), composerStartRestartGroup, 0);
        if (task.isWithVIP()) {
            composerStartRestartGroup.startReplaceableGroup(545548808);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween2, companion3.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            long jColorResource = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
            Offset.Companion companion5 = Offset.INSTANCE;
            mutableIntState = mutableIntState4;
            str = strHolidayEventsTaskButton;
            TextKt.m10024Text4IGK_g(task.getTitle(), PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, jColorResource, 0, companion5.m11115getZeroF1C5BW0(), 0.0f, null, null, composerStartRestartGroup, 12610566, 100), composerStartRestartGroup, 0, 0, 65532);
            composer2 = composerStartRestartGroup;
            TextKt.m10025TextIbK3jfQ(task.getDescription(), PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), 0, companion5.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, 224262, 4), composer2, 0, 0, 131068);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(AspectRatioKt.aspectRatio$default(PaddingKt.m8123padding3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6)), 1.0f, false, 2, null), 0.0f, 1, null), Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6)), 0.0f, 4, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-63511859);
            if (bitmap != null) {
                ImageKt.m7827Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, boxScopeInstance.align(SizeKt.fillMaxSize(companion2, 0.8f), companion3.getCenter()), null, null, 0.0f, null, 0, composer2, 56, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceableGroup();
            AutoSizeTextKt.m15112AutoSizeTextUapLOtE(String.valueOf(task.getAward()), PaddingKt.m8123padding3ABfNKs(boxScopeInstance.align(companion2, companion3.getBottomCenter()), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer2, 6)), AutoSizeTextKt.toImmutableWrapper(CollectionsKt__CollectionsKt.listOf((Object[]) new TextUnit[]{TextUnit.m13847boximpl(AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._8wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity()))), TextUnit.m13847boximpl(AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._9wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity()))), TextUnit.m13847boximpl(AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity()))), TextUnit.m13847boximpl(AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._12wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity()))), TextUnit.m13847boximpl(AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._13wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity()))), TextUnit.m13847boximpl(AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._14wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity())))})), AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._8wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity())), AutoSizeTextKt.m15113toTextUnitD5KLDUw(PrimitiveResources_androidKt.dimensionResource(R.dimen._14wsp, composer2, 6), (Density) composer2.consume(CompositionLocalsKt.getLocalDensity())), 0L, null, 0L, null, null, null, 0L, null, 0.0f, 1, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, 0L, 0, OffsetKt.Offset(-1.0f, 3.0f), 3.0f, null, composer2, 1600518, 38), composer2, 0, CpioConstants.C_ISBLK, 49120);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            r1 = 1;
        } else {
            str = strHolidayEventsTaskButton;
            composer2 = composerStartRestartGroup;
            mutableIntState = mutableIntState4;
            composer2.startReplaceableGroup(545552802);
            r1 = 1;
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_task_card, composer2, 6), (String) null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.holiday_events_available_with_premium_and_premium_deluxe, composer2, 6), boxScopeInstance.align(companion2, companion3.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65532);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        }
        Modifier modifierM7771backgroundbw27NRU$default2 = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion2, 0.0f, r1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._127wdp, composer2, 6)), ColorResources_androidKt.colorResource(mutableIntState3.getIntValue(), composer2, 0), null, 2, null);
        composer2.startReplaceableGroup(545553901);
        boolean z4 = ((((57344 & i2) ^ CpioConstants.C_ISBLK) <= 16384 || !composer2.changed(onTaskClick)) && (i2 & CpioConstants.C_ISBLK) != 16384) ? false : r1;
        Object objRememberedValue6 = composer2.rememberedValue();
        if (z4 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt$CommonTaskItem$3$1$4$1
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
                    onTaskClick.invoke();
                }
            };
            composer2.updateRememberedValue(objRememberedValue6);
        }
        composer2.endReplaceableGroup();
        Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(modifierM7771backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue6, 7, null);
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor6);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, r1, null);
        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, centerVertically2, composer2, 54);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor7);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        final MutableIntState mutableIntState5 = mutableIntState;
        ComposeExtensionKt.IfTrue(Boolean.valueOf(IntExtensionKt.isNotZero(Integer.valueOf(mutableIntState.getIntValue()))), ComposableLambdaKt.composableLambda(composer2, -1063289369, r1, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt$CommonTaskItem$3$1$5$1$1
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
            public final void invoke(@Nullable Composer composer3, int i7) {
                if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1063289369, i7, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTaskItem.kt:266)");
                    }
                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(mutableIntState5.getIntValue(), composer3, 0), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(task.getIconButtonSize(), composer3, 0)), ColorResources_androidKt.colorResource(task.getIconButtonColor(), composer3, 0), composer3, 56, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, 48);
        final String str2 = str;
        ComposeExtensionKt.IfTrue(Boolean.valueOf(str.length() > 0 ? r1 : false), ComposableLambdaKt.composableLambda(composer2, 1589662942, r1, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt$CommonTaskItem$3$1$5$1$2
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
            public final void invoke(@Nullable Composer composer3, int i7) {
                if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1589662942, i7, -1, "com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTaskItem.kt:277)");
                    }
                    TextKt.m10024Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.black, composer3, 6), 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, composer3, 1600518, 36), composer3, 0, 0, 65534);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, 48);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt.CommonTaskItem.4
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

                public final void invoke(@Nullable Composer composer3, int i7) {
                    CommonTaskItemKt.CommonTaskItem(i, task, bitmap, function1, onTaskClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CommonTaskItem")
    public static final void PreviewCommonTaskItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-341372128);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-341372128, i, -1, "com.blackhub.bronline.game.ui.widget.block.item.PreviewCommonTaskItem (CommonTaskItem.kt:295)");
            }
            CommonTaskItem(R.dimen._50wdp, new CommonTaskModel(false, 0, 0, "title title title title title title title title title title title title title title title title ", new AnnotatedString("DEscriptiondasdas", null, null, 6, null), 0, 999, null, new ImageModel(0, null, null, null, null, 31, null), CommonTaskState.STOP_STATE, 2, 167, null), null, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt.PreviewCommonTaskItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonTaskModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                    invoke2(commonTaskModel);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt.PreviewCommonTaskItem.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.item.CommonTaskItemKt.PreviewCommonTaskItem.3
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
                    CommonTaskItemKt.PreviewCommonTaskItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

