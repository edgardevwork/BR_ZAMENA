package com.blackhub.bronline.game.p019ui.holidayevents;

import android.graphics.Bitmap;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.IconKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGainBlockData;
import com.blackhub.bronline.game.p019ui.holidayevents.uiblock.HolidayEventsBottomGainBlockKt;
import com.blackhub.bronline.game.p019ui.holidayevents.uiblock.HolidayEventsListButtonKt;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonRewardWithProgressItemKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsMain.kt */
@SourceDebugExtension({"SMAP\nHolidayEventsMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsMain.kt\ncom/blackhub/bronline/game/ui/holidayevents/HolidayEventsMainKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,349:1\n1191#2,7:350\n1083#2,5:357\n1191#2,7:362\n1083#2,5:369\n1162#2,5:374\n1083#2,5:379\n1162#2,5:384\n1083#2,5:389\n68#3,6:394\n74#3:428\n78#3:464\n79#4,11:400\n92#4:463\n456#5,8:411\n464#5,3:425\n25#5:433\n467#5,3:460\n3737#6,6:419\n73#7,4:429\n77#7,20:440\n955#8,6:434\n*S KotlinDebug\n*F\n+ 1 HolidayEventsMain.kt\ncom/blackhub/bronline/game/ui/holidayevents/HolidayEventsMainKt\n*L\n69#1:350,7\n69#1:357,5\n77#1:362,7\n77#1:369,5\n85#1:374,5\n85#1:379,5\n92#1:384,5\n92#1:389,5\n100#1:394,6\n100#1:428\n100#1:464\n100#1:400,11\n100#1:463\n100#1:411,8\n100#1:425,3\n106#1:433\n100#1:460,3\n100#1:419,6\n106#1:429,4\n106#1:440,20\n106#1:434,6\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsMainKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: HolidayEventsMain-25RIiPk, reason: not valid java name */
    public static final void m14982HolidayEventsMain25RIiPk(final int i, final int i2, @Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, final boolean z, @Nullable final Bitmap bitmap3, @Nullable final Bitmap bitmap4, @Nullable final Bitmap bitmap5, @NotNull final HolidayEventsGainBlockData holidayEventsGainBlockData, final boolean z2, final long j, final long j2, @NotNull final List<CommonRewardModel> rewardsList, @NotNull final Function1<? super Boolean, Unit> onExpandButtonClick, @NotNull final Function0<Unit> onClickPlusButton, @NotNull final Function2<? super Integer, ? super Bitmap, Unit> onItemClick, @NotNull final Function0<Unit> onButtonGainLvlUp, @Nullable Composer composer, final int i3, final int i4) {
        float fDimensionResource;
        char c;
        float fDimensionResource2;
        float fDimensionResource3;
        float fDimensionResource4;
        Intrinsics.checkNotNullParameter(holidayEventsGainBlockData, "holidayEventsGainBlockData");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(onExpandButtonClick, "onExpandButtonClick");
        Intrinsics.checkNotNullParameter(onClickPlusButton, "onClickPlusButton");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onButtonGainLvlUp, "onButtonGainLvlUp");
        final Composer composerStartRestartGroup = composer.startRestartGroup(-1436805562);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436805562, i3, i4, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain (HolidayEventsMain.kt:64)");
        }
        Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), "selected state", composerStartRestartGroup, ((i3 >> 12) & 14) | 48, 0);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strEmpty = AnyExtensionKt.empty(stringCompanionObject);
        composerStartRestartGroup.startReplaceableGroup(184732935);
        C5724x8934c8eb c5724x8934c8eb = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain-25RIiPk$$inlined$animateDp$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<C2046Dp> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }

            @Composable
            @NotNull
            public final SpringSpec<C2046Dp> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i5) {
                composer2.startReplaceableGroup(-575880366);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-575880366, i5, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1191)");
                }
                SpringSpec<C2046Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2046Dp.m13664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C2046Dp.INSTANCE)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return springSpecSpring$default;
            }
        };
        C2046Dp.Companion companion = C2046Dp.INSTANCE;
        TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(companion);
        composerStartRestartGroup.startReplaceableGroup(-142660079);
        boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-1490879702);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1490879702, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:69)");
        }
        if (zBooleanValue) {
            composerStartRestartGroup.startReplaceableGroup(-884211994);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._656wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-884211925);
            float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._0wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            fDimensionResource = fDimensionResource5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(fDimensionResource);
        boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-1490879702);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1490879702, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:69)");
        }
        if (zBooleanValue2) {
            composerStartRestartGroup.startReplaceableGroup(-884211994);
            c = 6;
            float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._656wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            fDimensionResource2 = fDimensionResource6;
        } else {
            c = 6;
            composerStartRestartGroup.startReplaceableGroup(-884211925);
            fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._0wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl, C2046Dp.m13664boximpl(fDimensionResource2), c5724x8934c8eb.invoke((C5724x8934c8eb) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, strEmpty, composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        String strEmpty2 = AnyExtensionKt.empty(stringCompanionObject);
        composerStartRestartGroup.startReplaceableGroup(184732935);
        C5725x8934c8ec c5725x8934c8ec = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C2046Dp>>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain-25RIiPk$$inlined$animateDp$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<C2046Dp> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }

            @Composable
            @NotNull
            public final SpringSpec<C2046Dp> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i5) {
                composer2.startReplaceableGroup(-575880366);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-575880366, i5, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1191)");
                }
                SpringSpec<C2046Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C2046Dp.m13664boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C2046Dp.INSTANCE)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return springSpecSpring$default;
            }
        };
        TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(companion);
        composerStartRestartGroup.startReplaceableGroup(-142660079);
        boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-245187848);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245187848, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:77)");
        }
        if (zBooleanValue3) {
            composerStartRestartGroup.startReplaceableGroup(-884211746);
            fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._0wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-884211679);
            fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._502wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        C2046Dp c2046DpM13664boximpl2 = C2046Dp.m13664boximpl(fDimensionResource3);
        boolean zBooleanValue4 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-245187848);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245187848, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:77)");
        }
        if (zBooleanValue4) {
            composerStartRestartGroup.startReplaceableGroup(-884211746);
            fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._0wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-884211679);
            fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._502wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, c2046DpM13664boximpl2, C2046Dp.m13664boximpl(fDimensionResource4), c5725x8934c8ec.invoke((C5725x8934c8ec) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter2, strEmpty2, composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        String strEmpty3 = AnyExtensionKt.empty(stringCompanionObject);
        composerStartRestartGroup.startReplaceableGroup(-1338768149);
        C5726x3cd28bd7 c5726x3cd28bd7 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain-25RIiPk$$inlined$animateFloat$1
            @Composable
            @NotNull
            public final SpringSpec<Float> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i5) {
                composer2.startReplaceableGroup(-522164544);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-522164544, i5, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1161)");
                }
                SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return springSpecSpring$default;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        };
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
        composerStartRestartGroup.startReplaceableGroup(-142660079);
        boolean zBooleanValue5 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-715304774);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-715304774, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:85)");
        }
        float f = zBooleanValue5 ? 0.0f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f);
        boolean zBooleanValue6 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-715304774);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-715304774, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:85)");
        }
        float f2 = zBooleanValue6 ? 0.0f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), c5726x3cd28bd7.invoke((C5726x3cd28bd7) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter3, strEmpty3, composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        String strEmpty4 = AnyExtensionKt.empty(stringCompanionObject);
        composerStartRestartGroup.startReplaceableGroup(-1338768149);
        C5727x3cd28bd8 c5727x3cd28bd8 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain-25RIiPk$$inlined$animateFloat$2
            @Composable
            @NotNull
            public final SpringSpec<Float> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i5) {
                composer2.startReplaceableGroup(-522164544);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-522164544, i5, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1161)");
                }
                SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return springSpecSpring$default;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        };
        TwoWayConverter<Float, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
        composerStartRestartGroup.startReplaceableGroup(-142660079);
        boolean zBooleanValue7 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(1173280300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1173280300, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:92)");
        }
        float f3 = zBooleanValue7 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        Float fValueOf2 = Float.valueOf(f3);
        boolean zBooleanValue8 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(1173280300);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1173280300, 0, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous> (HolidayEventsMain.kt:92)");
        }
        float f4 = zBooleanValue8 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), c5727x3cd28bd8.invoke((C5727x3cd28bd8) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter4, strEmpty4, composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-270267587);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new Measurer();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Measurer measurer = (Measurer) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composerStartRestartGroup, 4544);
        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
        final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
        final int i5 = 6;
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain_25RIiPk$lambda$17$$inlined$ConstraintLayout$1
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
        }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain_25RIiPk$lambda$17$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i6) {
                Modifier.Companion companion5;
                ConstrainedLayoutReference constrainedLayoutReference;
                ConstrainedLayoutReference constrainedLayoutReference2;
                ConstraintLayoutScope constraintLayoutScope2;
                if (((i6 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    BoxKt.Box(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReferenceComponent6, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                            invoke2(constrainScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                        }
                    }), PrimitiveResources_androidKt.dimensionResource(R.dimen._776wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._128wdp, composer2, 6)), composer2, 0);
                    composer2.startReplaceableGroup(1069821250);
                    boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent6);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent6.getStart(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    HolidayEventsListButtonKt.m14988HolidayEventsListButton8V94_ZQ(constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), i, StringResources_androidKt.stringResource(R.string.common_presents, composer2, 6), bitmap5, composer2, ((i3 << 6) & 896) | 32768, 0);
                    composer2.startReplaceableGroup(1069821704);
                    boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent1.getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(AlphaKt.alpha(constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue5), ((Number) stateCreateTransitionAnimation3.getValue()).floatValue()), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer2, 6));
                    composer2.startReplaceableGroup(1069822121);
                    boolean z3 = (((i4 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onExpandButtonClick)) || (i4 & 3072) == 2048;
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (z3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function1 = onExpandButtonClick;
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$4$1
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
                                function1.invoke(Boolean.TRUE);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierNoRippleClickable$default = ComposeExtensionKt.noRippleClickable$default(modifierM8177width3ABfNKs, false, (Function0) objRememberedValue6, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_right_arrow_v2, composer2, 6), (String) null, boxScopeInstance2.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6)), companion7.getCenter()), ColorResources_androidKt.colorResource(R.color.white, composer2, 6), composer2, 56, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1069822789);
                    boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$6$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent1.getStart(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    HolidayEventsListButtonKt.m14988HolidayEventsListButton8V94_ZQ(constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue7), j2, i2, StringResources_androidKt.stringResource(R.string.holiday_events_gain, composer2, 6), bitmap4, composer2, ((i3 << 3) & 896) | (i4 & 112) | 32768, 0);
                    composer2.startReplaceableGroup(1069823232);
                    boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$7$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent1.getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(AlphaKt.alpha(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue8), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer2, 6)), ((Number) stateCreateTransitionAnimation4.getValue()).floatValue()), j2, null, 2, null);
                    composer2.startReplaceableGroup(1069823632);
                    boolean z4 = (((i4 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onExpandButtonClick)) || (i4 & 3072) == 2048;
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (z4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = onExpandButtonClick;
                        objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$8$1
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
                                function12.invoke(Boolean.FALSE);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierNoRippleClickable$default2 = ComposeExtensionKt.noRippleClickable$default(modifierM7771backgroundbw27NRU$default, false, (Function0) objRememberedValue9, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_right_arrow_v2, composer2, 6), (String) null, boxScopeInstance2.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6)), companion7.getCenter()), ColorResources_androidKt.colorResource(R.color.white, composer2, 6), composer2, 56, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1069824212);
                    if (C2046Dp.m13671equalsimpl0(((C2046Dp) stateCreateTransitionAnimation2.getValue()).m13680unboximpl(), PrimitiveResources_androidKt.dimensionResource(R.dimen._0wdp, composer2, 6))) {
                        companion5 = companion6;
                        constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                        constrainedLayoutReference2 = constrainedLayoutReferenceComponent1;
                        constraintLayoutScope2 = constraintLayoutScope3;
                    } else {
                        composer2.startReplaceableGroup(1069824405);
                        boolean zChanged5 = composer2.changed(constrainedLayoutReferenceComponent2);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$10$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReferenceComponent7, (Function1) objRememberedValue10);
                        float fM13680unboximpl = ((C2046Dp) stateCreateTransitionAnimation2.getValue()).m13680unboximpl();
                        float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6);
                        Bitmap bitmap6 = bitmap3;
                        HolidayEventsGainBlockData holidayEventsGainBlockData2 = holidayEventsGainBlockData;
                        long j3 = j;
                        long j4 = j2;
                        composer2.startReplaceableGroup(1069824966);
                        boolean z5 = (((i4 & 3670016) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(onButtonGainLvlUp)) || (i4 & 1572864) == 1048576;
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (z5 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            final Function0 function0 = onButtonGainLvlUp;
                            objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$11$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        composer2.endReplaceableGroup();
                        int i7 = ((i3 >> 12) & 57344) | 4096;
                        int i8 = i4;
                        int i9 = i7 | ((i8 << 15) & 458752) | ((i8 << 15) & 3670016);
                        companion5 = companion6;
                        constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                        constrainedLayoutReference2 = constrainedLayoutReferenceComponent1;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        HolidayEventsBottomGainBlockKt.m14985HolidayEventsBottomGainBlockc2U5e7w(modifierConstrainAs, fM13680unboximpl, fDimensionResource7, bitmap6, holidayEventsGainBlockData2, j3, j4, (Function0) objRememberedValue11, composer2, i9, 0);
                    }
                    composer2.endReplaceableGroup();
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    final Function0 function02 = onClickPlusButton;
                    final Bitmap bitmap7 = bitmap2;
                    final ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                    final ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReference;
                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, -668446151, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$12
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
                        public final void invoke(@Nullable Composer composer3, int i10) {
                            if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-668446151, i10, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMain.<anonymous>.<anonymous>.<anonymous> (HolidayEventsMain.kt:221)");
                            }
                            ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope4;
                            Modifier.Companion companion9 = Modifier.INSTANCE;
                            ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReferenceComponent8;
                            composer3.startReplaceableGroup(1964882504);
                            boolean zChanged6 = composer3.changed(constrainedLayoutReference3);
                            final ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReference3;
                            Object objRememberedValue12 = composer3.rememberedValue();
                            if (zChanged6 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$12$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference5.getBottom(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference5.getTop(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue12);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(constraintLayoutScope5.constrainAs(companion9, constrainedLayoutReference4, (Function1) objRememberedValue12), PrimitiveResources_androidKt.dimensionResource(R.dimen._81wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._183wdp, composer3, 6));
                            composer3.startReplaceableGroup(1964882886);
                            boolean zChanged7 = composer3.changed(function02);
                            final Function0<Unit> function03 = function02;
                            Object objRememberedValue13 = composer3.rememberedValue();
                            if (zChanged7 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$12$2$1
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
                                        function03.invoke();
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue13);
                            }
                            composer3.endReplaceableGroup();
                            ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap7, ClickableKt.m7805clickableXHw0xAI$default(modifierM8177width3ABfNKs2, false, null, null, (Function0) objRememberedValue13, 7, null), null, null, 0.0f, null, 0, composer3, 8, 124);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, ((i3 >> 27) & 14) | 48);
                    composer2.startReplaceableGroup(1069825760);
                    final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReference2;
                    boolean zChanged6 = composer2.changed(constrainedLayoutReference4);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$13$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference4.getEnd(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    Modifier.Companion companion9 = companion5;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_rewards_list, composer2, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion9, constrainedLayoutReferenceComponent9, (Function1) objRememberedValue12), ((C2046Dp) stateCreateTransitionAnimation.getValue()).m13680unboximpl()), PrimitiveResources_androidKt.dimensionResource(R.dimen._118wdp, composer2, 6)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                    composer2.startReplaceableGroup(-884205230);
                    if (!C2046Dp.m13671equalsimpl0(((C2046Dp) stateCreateTransitionAnimation.getValue()).m13680unboximpl(), PrimitiveResources_androidKt.dimensionResource(R.dimen._0wdp, composer2, 6))) {
                        composer2.startReplaceableGroup(1069826335);
                        boolean zChanged7 = composer2.changed(constrainedLayoutReference4);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (zChanged7 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$14$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                    invoke2(constrainScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference4.getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion9, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue13), ((C2046Dp) stateCreateTransitionAnimation.getValue()).m13680unboximpl()), PrimitiveResources_androidKt.dimensionResource(R.dimen._128wdp, composer2, 6));
                        final List list = rewardsList;
                        final Bitmap bitmap8 = bitmap;
                        final int i10 = i;
                        final Function0 function03 = onClickPlusButton;
                        final Function2 function2 = onItemClick;
                        LazyDslKt.LazyRow(modifierM8158height3ABfNKs2, null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$15
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull LazyListScope LazyRow) {
                                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                                final List<CommonRewardModel> list2 = list;
                                final Bitmap bitmap9 = bitmap8;
                                final int i11 = i10;
                                final Function0<Unit> function04 = function03;
                                final Function2<Integer, Bitmap, Unit> function22 = function2;
                                LazyRow.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$15$invoke$$inlined$itemsIndexed$default$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    @Nullable
                                    public final Object invoke(int i12) {
                                        list2.get(i12);
                                        return null;
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$15$invoke$$inlined$itemsIndexed$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@NotNull LazyItemScope lazyItemScope, final int i12, @Nullable Composer composer3, int i13) {
                                        int i14;
                                        if ((i13 & 14) == 0) {
                                            i14 = i13 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                        } else {
                                            i14 = i13;
                                        }
                                        if ((i13 & 112) == 0) {
                                            i14 |= composer3.changed(i12) ? 32 : 16;
                                        }
                                        if ((i14 & 731) == 146 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1091073711, i14, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                                        }
                                        int i15 = i14 & 126;
                                        CommonRewardModel commonRewardModel = (CommonRewardModel) list2.get(i12);
                                        Modifier.Companion companion10 = Modifier.INSTANCE;
                                        int size = list2.size();
                                        Bitmap bitmap10 = bitmap9;
                                        int i16 = i11;
                                        composer3.startReplaceableGroup(1737152125);
                                        boolean zChanged8 = composer3.changed(function04);
                                        Object objRememberedValue14 = composer3.rememberedValue();
                                        if (zChanged8 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                            final Function0 function05 = function04;
                                            objRememberedValue14 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$15$1$1$1
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
                                                    function05.invoke();
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue14);
                                        }
                                        Function0 function06 = (Function0) objRememberedValue14;
                                        composer3.endReplaceableGroup();
                                        composer3.startReplaceableGroup(1737152038);
                                        boolean zChanged9 = ((((i14 & 112) ^ 48) > 32 && composer3.changed(i12)) || (i14 & 48) == 32) | composer3.changed(function22);
                                        Object objRememberedValue15 = composer3.rememberedValue();
                                        if (zChanged9 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                            final Function2 function23 = function22;
                                            objRememberedValue15 = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$1$1$15$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap11) {
                                                    invoke2(bitmap11);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@Nullable Bitmap bitmap11) {
                                                    function23.invoke(Integer.valueOf(i12), bitmap11);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue15);
                                        }
                                        composer3.endReplaceableGroup();
                                        CommonRewardWithProgressItemKt.m15058CommonPrizeWithProgressItemwn8IZOc(companion10, commonRewardModel, null, bitmap10, i12, size, i16, false, 0.0f, function06, (Function1) objRememberedValue15, null, composer3, ((i15 << 9) & 57344) | 12587078, 0, 2308);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                            }
                        }, composer2, 0, 254);
                    }
                    composer2.endReplaceableGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        function0Component2.invoke();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), measurePolicyComponent1, composerStartRestartGroup, 48, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt$HolidayEventsMain$2
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

                public final void invoke(@Nullable Composer composer2, int i6) {
                    HolidayEventsMainKt.m14982HolidayEventsMain25RIiPk(i, i2, bitmap, bitmap2, z, bitmap3, bitmap4, bitmap5, holidayEventsGainBlockData, z2, j, j2, rewardsList, onExpandButtonClick, onClickPlusButton, onItemClick, onButtonGainLvlUp, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void HolidayEventsMainPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(661658403);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661658403, i, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainPreview (HolidayEventsMain.kt:279)");
            }
            HolidayEventsGainBlockData holidayEventsGainBlockData = new HolidayEventsGainBlockData("2000", "x 2.30", "2200", "x 2.32", "1 000 000 000 P", 22322);
            long jColorResource = ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6);
            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6);
            CommonRewardModel commonRewardModel = new CommonRewardModel(0, "1", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null);
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.LEGENDARY;
            CommonRewardModel commonRewardModel2 = new CommonRewardModel(0, "228", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null);
            CommonRewardModel commonRewardModel3 = new CommonRewardModel(0, "322", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.EPIC;
            composer2 = composerStartRestartGroup;
            m14982HolidayEventsMain25RIiPk(5, 3, null, null, true, null, null, null, holidayEventsGainBlockData, true, jColorResource, jColorResource2, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonRewardModel[]{commonRewardModel, commonRewardModel2, commonRewardModel3, new CommonRewardModel(0, "4", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum2, 0, null, 229373, null), new CommonRewardModel(0, YouTubePlayerBridge.ERROR_HTML_5_PLAYER, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, CommonRarityEnum.RARE, 0, null, 229373, null), new CommonRewardModel(0, "6", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum2, 0, null, 229373, null), new CommonRewardModel(0, "7", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null), new CommonRewardModel(0, "8", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, CommonRarityEnum.PRIZE, 0, null, 229373, null), new CommonRewardModel(0, "9", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "10", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null)}), new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt.HolidayEventsMainPreview.1
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt.HolidayEventsMainPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<Integer, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt.HolidayEventsMainPreview.3
                public final void invoke(int i2, @Nullable Bitmap bitmap) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Bitmap bitmap) {
                    invoke(num.intValue(), bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt.HolidayEventsMainPreview.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 819686838, 1797632);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsMainKt.HolidayEventsMainPreview.5
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
                    HolidayEventsMainKt.HolidayEventsMainPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

