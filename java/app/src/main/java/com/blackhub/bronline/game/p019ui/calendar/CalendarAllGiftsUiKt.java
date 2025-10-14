package com.blackhub.bronline.game.p019ui.calendar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
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
import androidx.compose.p003ui.text.AnnotatedStringKt;
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
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarAllGiftsUi.kt */
@SourceDebugExtension({"SMAP\nCalendarAllGiftsUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarAllGiftsUi.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarAllGiftsUiKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,405:1\n74#2:406\n74#2:413\n74#2:414\n74#2:415\n74#2:416\n74#2:417\n74#2:418\n74#2:419\n74#2:420\n74#2:421\n74#2:422\n74#2:423\n74#2:424\n74#2:425\n74#2:426\n74#2:427\n74#2:428\n74#2:429\n74#2:430\n74#2:431\n74#2:432\n74#2:433\n74#2:434\n74#2:435\n74#2:436\n74#2:437\n74#2:438\n74#2:439\n74#2:440\n74#2:441\n74#2:442\n74#2:443\n74#2:444\n74#2:445\n1116#3,6:407\n81#4:446\n107#4,2:447\n*S KotlinDebug\n*F\n+ 1 CalendarAllGiftsUi.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarAllGiftsUiKt\n*L\n81#1:406\n199#1:413\n207#1:414\n213#1:415\n219#1:416\n225#1:417\n231#1:418\n241#1:419\n246#1:420\n252#1:421\n258#1:422\n264#1:423\n270#1:424\n276#1:425\n283#1:426\n289#1:427\n295#1:428\n301#1:429\n307#1:430\n313#1:431\n319#1:432\n326#1:433\n332#1:434\n338#1:435\n344#1:436\n350#1:437\n356#1:438\n362#1:439\n369#1:440\n375#1:441\n381#1:442\n387#1:443\n393#1:444\n399#1:445\n82#1:407,6\n82#1:446\n82#1:447,2\n*E\n"})

public final class CalendarAllGiftsUiKt {
    public static final float ALPHA_OF_BG_BEAR_IC = 0.05f;
    public static final float SIZE_OF_BG_BEAR_IC = 0.7f;
    public static final float TRANSPARENT_GRADIENT_BRUSH_FINISH = 0.925f;
    public static final float WEIGHT_FOR_TEXT_TITLE = 10.0f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CalendarAllGiftsUi-FU0evQE, reason: not valid java name */
    public static final void m14913CalendarAllGiftsUiFU0evQE(@NotNull final String nameOfEvent, @NotNull final String icSeasonCalendarBitmapName, final long j, @NotNull final List<CommonRewardModel> listOfRewards, @NotNull final String timerGetReward, @NotNull final Function3<? super Integer, ? super Boolean, ? super Bitmap, Unit> onItemClick, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(nameOfEvent, "nameOfEvent");
        Intrinsics.checkNotNullParameter(icSeasonCalendarBitmapName, "icSeasonCalendarBitmapName");
        Intrinsics.checkNotNullParameter(listOfRewards, "listOfRewards");
        Intrinsics.checkNotNullParameter(timerGetReward, "timerGetReward");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1150966615);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1150966615, i, -1, "com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUi (CalendarAllGiftsUi.kt:70)");
        }
        final Brush brushM11290horizontalGradient8A3gB4$default = Brush.Companion.m11290horizontalGradient8A3gB4$default(Brush.INSTANCE, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.925f), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)))}, 0.0f, 0.0f, 0, 14, (Object) null);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6));
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(1082343752);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new CalendarAllGiftsUiKt$CalendarAllGiftsUi$1(context, icSeasonCalendarBitmapName, mutableState, null), composerStartRestartGroup, 70);
        FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1059428323, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt$CalendarAllGiftsUi$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                        ComposerKt.traceEventStart(1059428323, i2, -1, "com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUi.<anonymous> (CalendarAllGiftsUi.kt:94)");
                    }
                    long jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
                    final RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    final Brush brush = brushM11290horizontalGradient8A3gB4$default;
                    final List<CommonRewardModel> list = listOfRewards;
                    final String str = timerGetReward;
                    final Function3<Integer, Boolean, Bitmap, Unit> function3 = onItemClick;
                    final Function0<Unit> function0 = onCloseClick;
                    final float f = fDimensionResource;
                    final long j2 = j;
                    final String str2 = nameOfEvent;
                    final MutableState<Bitmap> mutableState2 = mutableState;
                    SurfaceKt.m9876SurfaceT9BRK9s(null, null, jM11375getTransparent0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 2105971198, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt$CalendarAllGiftsUi$2.1
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
                        public final void invoke(@Nullable Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2105971198, i3, -1, "com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUi.<anonymous>.<anonymous> (CalendarAllGiftsUi.kt:95)");
                                }
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Alignment center = companion.getCenter();
                                RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                                Brush brush2 = brush;
                                List<CommonRewardModel> list2 = list;
                                String str3 = str;
                                final Function3<Integer, Boolean, Bitmap, Unit> function32 = function3;
                                final Function0<Unit> function02 = function0;
                                float f2 = f;
                                long j3 = j2;
                                String str4 = str2;
                                MutableState<Bitmap> mutableState3 = mutableState2;
                                composer3.startReplaceableGroup(733328855);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierBorder = BorderKt.border(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._354wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._748wdp, composer3, 6)), roundedCornerShape2), ColorResources_androidKt.colorResource(R.color.black, composer3, 6), null, 2, null), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, 6), ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composer3, 6)), roundedCornerShape2);
                                Alignment center2 = companion.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBorder);
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
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composer3, 6), (String) null, AlphaKt.alpha(SizeKt.fillMaxSize(companion2, 0.7f), 0.05f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 440, 120);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                composer3.startReplaceableGroup(-483455358);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._49wdp, composer3, 6)), brush2, null, 0.0f, 6, null);
                                Alignment.Vertical centerVertically = companion.getCenterVertically();
                                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.m8127paddingqDBjuR0$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), 10.0f, false, 2, null);
                                Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(CalendarAllGiftsUiKt.CalendarAllGiftsUi_FU0evQE$lambda$1(mutableState3), SizeKt.m8172size3ABfNKs(companion2, f2), null, null, 0.0f, null, 0, composer3, 8, 124);
                                TextKt.m10025TextIbK3jfQ(AnnotatedStringKt.toUpperCase$default(StringResourceCompose.INSTANCE.m14396calendarGetSeasonTitlesW7UJKQ(null, j3, str4, true, composer3, 27648, 1), null, 1, null), PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, TypographyStyle.INSTANCE.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composer3, 1572870, 62), composer3, 0, 3072, 122876);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer3, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._28wdp, composer3, 6));
                                composer3.startReplaceableGroup(-805649231);
                                boolean zChanged = composer3.changed(function02);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt$CalendarAllGiftsUi$2$1$1$1$1$1$2$1
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
                                            function02.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableSingletons$CalendarAllGiftsUiKt.INSTANCE.m14916getLambda1$app_siteRelease(), composer3, 0, 3072, 4094);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6));
                                composer3.startReplaceableGroup(-1264264002);
                                boolean zChanged2 = composer3.changed(function32);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function2<Integer, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt$CalendarAllGiftsUi$2$1$1$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Bitmap bitmap) {
                                            invoke(num.intValue(), bitmap);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int i4, @Nullable Bitmap bitmap) {
                                            function32.invoke(Integer.valueOf(i4), Boolean.TRUE, bitmap);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                CalendarListGridAllRewardsKt.CalendarListGridAllRewards(modifierM8124paddingVpY3zN4, list2, str3, (Function2) objRememberedValue3, composer3, 64);
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
                    }), composer2, 12583296, 123);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt$CalendarAllGiftsUi$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CalendarAllGiftsUiKt.m14913CalendarAllGiftsUiFU0evQE(nameOfEvent, icSeasonCalendarBitmapName, j, listOfRewards, timerGetReward, onItemClick, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCalendarAllGifts(@Nullable Composer composer, final int i) throws Resources.NotFoundException {
        Composer composerStartRestartGroup = composer.startRestartGroup(-770533388);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-770533388, i, -1, "com.blackhub.bronline.game.ui.calendar.PreviewCalendarAllGifts (CalendarAllGiftsUi.kt:186)");
            }
            long jM11374getRed0d7_KjU = Color.INSTANCE.m11374getRed0d7_KjU();
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            CommonRewardModel commonRewardModel = new CommonRewardModel(0, "10 BC", null, "получено", BitmapUtilsKt.getBitmap(resources, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, CommonRewardState.NORM_NOT_RECEIVED, null, false, false, null, 0, null, 260069, null);
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            CommonRewardModel commonRewardModel2 = new CommonRewardModel(0, "бронзовый", null, "14:59", BitmapUtilsKt.getBitmap(resources2, R.drawable.ic_br_logo), 0, 0, null, false, true, 4, CommonRewardState.NORM_TIMER, null, false, false, null, 0, null, 258533, null);
            Resources resources3 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            CommonRewardModel commonRewardModel3 = new CommonRewardModel(0, "10.000 Р", null, "день 3", BitmapUtilsKt.getBitmap(resources3, R.drawable.bp_money), 0, 0, null, false, false, 0, CommonRewardState.NORM_AVAILABLE, null, false, false, null, 0, null, 260069, null);
            Resources resources4 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            CommonRewardModel commonRewardModel4 = new CommonRewardModel(0, "скин бабуси", null, "день 4", BitmapUtilsKt.getBitmap(resources4, R.drawable.bp_money), 0, 0, null, false, false, 0, CommonRewardState.NORM_RECEIVED, null, false, false, null, 0, null, 260069, null);
            Resources resources5 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
            CommonRewardModel commonRewardModel5 = new CommonRewardModel(0, "аксессуар", null, "день 5", BitmapUtilsKt.getBitmap(resources5, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, CommonRewardState.EPIC_NOT_RECEIVED_LOW_LEVEL, null, false, false, null, 0, null, 260069, null);
            Resources resources6 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
            Bitmap bitmap = BitmapUtilsKt.getBitmap(resources6, R.drawable.ic_br_logo);
            CommonRewardState commonRewardState = CommonRewardState.EPIC_NOT_RECEIVED_NORW_LEVEL;
            CommonRewardModel commonRewardModel6 = new CommonRewardModel(0, "бронзовый", null, "день 6", bitmap, 0, 0, null, false, false, 0, commonRewardState, null, false, false, null, 0, null, 260069, null);
            Resources resources7 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
            CommonRewardModel commonRewardModel7 = new CommonRewardModel(0, "бронзовый кейс", null, "день 7", BitmapUtilsKt.getBitmap(resources7, R.drawable.ic_br_logo), 0, 0, null, true, true, 4, commonRewardState, null, false, false, null, 0, null, 258277, null);
            Resources resources8 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources8, "getResources(...)");
            CommonRewardModel commonRewardModel8 = new CommonRewardModel(0, "бронзовый кейс", null, "день 8", BitmapUtilsKt.getBitmap(resources8, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, CommonRewardState.EPIC_TIMER_NORM_LEVEL, null, false, false, null, 0, null, 260069, null);
            Resources resources9 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources9, "getResources(...)");
            CommonRewardModel commonRewardModel9 = new CommonRewardModel(0, "бронзовый кейс", null, "день 9", BitmapUtilsKt.getBitmap(resources9, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL, null, false, false, null, 0, null, 260069, null);
            Resources resources10 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources10, "getResources(...)");
            Bitmap bitmap2 = BitmapUtilsKt.getBitmap(resources10, R.drawable.ic_br_logo);
            CommonRewardState commonRewardState2 = CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL;
            CommonRewardModel commonRewardModel10 = new CommonRewardModel(0, "бронзовый кейс", null, "день 10", bitmap2, 0, 0, null, false, false, 0, commonRewardState2, null, false, false, null, 0, null, 260069, null);
            Resources resources11 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources11, "getResources(...)");
            CommonRewardModel commonRewardModel11 = new CommonRewardModel(0, "бронзовый кейс", null, "день 11", BitmapUtilsKt.getBitmap(resources11, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, commonRewardState2, null, false, false, null, 0, null, 260069, null);
            Resources resources12 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources12, "getResources(...)");
            CommonRewardModel commonRewardModel12 = new CommonRewardModel(0, "бронзовый кейс", null, "день 12", BitmapUtilsKt.getBitmap(resources12, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, commonRewardState2, null, false, false, null, 0, null, 260069, null);
            Resources resources13 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources13, "getResources(...)");
            CommonRewardModel commonRewardModel13 = new CommonRewardModel(0, "бронзовый кейс", null, "день 13", BitmapUtilsKt.getBitmap(resources13, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, commonRewardState2, null, false, false, null, 0, null, 260069, null);
            Resources resources14 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources14, "getResources(...)");
            CommonRewardModel commonRewardModel14 = new CommonRewardModel(0, "бронзовый кейс", null, "день 14", BitmapUtilsKt.getBitmap(resources14, R.drawable.ic_br_logo), 0, 0, null, true, false, 0, commonRewardState2, null, false, false, null, 0, null, 259813, null);
            Resources resources15 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources15, "getResources(...)");
            CommonRewardModel commonRewardModel15 = new CommonRewardModel(0, "бронзовый кейс", null, "день 15", BitmapUtilsKt.getBitmap(resources15, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, commonRewardState2, null, false, false, null, 0, null, 260069, null);
            Resources resources16 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources16, "getResources(...)");
            Bitmap bitmap3 = BitmapUtilsKt.getBitmap(resources16, R.drawable.ic_br_logo);
            CalendarBonusRewardState calendarBonusRewardState = CalendarBonusRewardState.NOT_RECEIVED;
            CommonRewardModel commonRewardModel16 = new CommonRewardModel(0, "бронзовый кейс", null, "день 16", bitmap3, 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources17 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources17, "getResources(...)");
            CommonRewardModel commonRewardModel17 = new CommonRewardModel(0, "бронзовый кейс", null, "день 17", BitmapUtilsKt.getBitmap(resources17, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources18 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources18, "getResources(...)");
            CommonRewardModel commonRewardModel18 = new CommonRewardModel(0, "бронзовый кейс", null, "день 18", BitmapUtilsKt.getBitmap(resources18, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources19 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources19, "getResources(...)");
            CommonRewardModel commonRewardModel19 = new CommonRewardModel(0, "бронзовый кейс", null, "день 19", BitmapUtilsKt.getBitmap(resources19, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources20 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources20, "getResources(...)");
            CommonRewardModel commonRewardModel20 = new CommonRewardModel(0, "бронзовый кейс", null, "день 20", BitmapUtilsKt.getBitmap(resources20, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources21 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources21, "getResources(...)");
            CommonRewardModel commonRewardModel21 = new CommonRewardModel(0, "бронзовый кейс", null, "день 21", BitmapUtilsKt.getBitmap(resources21, R.drawable.ic_br_logo), 0, 0, null, true, false, 0, commonRewardState, null, false, false, null, 0, null, 259813, null);
            Resources resources22 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources22, "getResources(...)");
            CommonRewardModel commonRewardModel22 = new CommonRewardModel(0, "бронзовый кейс", null, "день 22", BitmapUtilsKt.getBitmap(resources22, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources23 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources23, "getResources(...)");
            CommonRewardModel commonRewardModel23 = new CommonRewardModel(0, "бронзовый кейс", null, "день 23", BitmapUtilsKt.getBitmap(resources23, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources24 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources24, "getResources(...)");
            CommonRewardModel commonRewardModel24 = new CommonRewardModel(0, "бронзовый кейс", null, "день 24", BitmapUtilsKt.getBitmap(resources24, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources25 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources25, "getResources(...)");
            CommonRewardModel commonRewardModel25 = new CommonRewardModel(0, "бронзовый кейс", null, "день 25", BitmapUtilsKt.getBitmap(resources25, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources26 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources26, "getResources(...)");
            CommonRewardModel commonRewardModel26 = new CommonRewardModel(0, "бронзовый кейс", null, "день 26", BitmapUtilsKt.getBitmap(resources26, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources27 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources27, "getResources(...)");
            CommonRewardModel commonRewardModel27 = new CommonRewardModel(0, "бронзовый кейс", null, "день 27", BitmapUtilsKt.getBitmap(resources27, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources28 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources28, "getResources(...)");
            CommonRewardModel commonRewardModel28 = new CommonRewardModel(0, "бронзовый кейс", null, "12:12", BitmapUtilsKt.getBitmap(resources28, R.drawable.ic_br_logo), 0, 0, null, true, false, 0, null, CalendarBonusRewardState.AVAILABLE_NORM_LEVEL, false, false, null, 0, null, 257765, null);
            Resources resources29 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources29, "getResources(...)");
            CommonRewardModel commonRewardModel29 = new CommonRewardModel(0, "бронзовый кейс", null, "день 29", BitmapUtilsKt.getBitmap(resources29, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources30 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources30, "getResources(...)");
            CommonRewardModel commonRewardModel30 = new CommonRewardModel(0, "бронзовый кейс", null, "день 30", BitmapUtilsKt.getBitmap(resources30, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources31 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources31, "getResources(...)");
            CommonRewardModel commonRewardModel31 = new CommonRewardModel(0, "бронзовый кейс", null, "день 31", BitmapUtilsKt.getBitmap(resources31, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources32 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources32, "getResources(...)");
            CommonRewardModel commonRewardModel32 = new CommonRewardModel(0, "бронзовый кейс", null, "день 32", BitmapUtilsKt.getBitmap(resources32, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null);
            Resources resources33 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources33, "getResources(...)");
            m14913CalendarAllGiftsUiFU0evQE("новый год 2025 вап олапшо пало пл рпл од", "icSeasonCalendar.png", jM11374getRed0d7_KjU, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonRewardModel[]{commonRewardModel, commonRewardModel2, commonRewardModel3, commonRewardModel4, commonRewardModel5, commonRewardModel6, commonRewardModel7, commonRewardModel8, commonRewardModel9, commonRewardModel10, commonRewardModel11, commonRewardModel12, commonRewardModel13, commonRewardModel14, commonRewardModel15, commonRewardModel16, commonRewardModel17, commonRewardModel18, commonRewardModel19, commonRewardModel20, commonRewardModel21, commonRewardModel22, commonRewardModel23, commonRewardModel24, commonRewardModel25, commonRewardModel26, commonRewardModel27, commonRewardModel28, commonRewardModel29, commonRewardModel30, commonRewardModel31, commonRewardModel32, new CommonRewardModel(0, "бронзовый кейс", null, "день 33", BitmapUtilsKt.getBitmap(resources33, R.drawable.ic_br_logo), 0, 0, null, false, false, 0, null, calendarBonusRewardState, false, false, null, 0, null, 258021, null)}), "14:59", new Function3<Integer, Boolean, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt.PreviewCalendarAllGifts.1
                public final void invoke(int i2, boolean z, @Nullable Bitmap bitmap4) {
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool, Bitmap bitmap4) {
                    invoke(num.intValue(), bool.booleanValue(), bitmap4);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt.PreviewCalendarAllGifts.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 1798582);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarAllGiftsUiKt.PreviewCalendarAllGifts.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) throws Resources.NotFoundException {
                    CalendarAllGiftsUiKt.PreviewCalendarAllGifts(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap CalendarAllGiftsUi_FU0evQE$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }
}

