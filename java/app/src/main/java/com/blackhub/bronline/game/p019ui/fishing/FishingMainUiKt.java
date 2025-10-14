package com.blackhub.bronline.game.p019ui.fishing;

import android.annotation.SuppressLint;
import androidx.annotation.DrawableRes;
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
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.gui.fishing.FishingUiState;
import com.blackhub.bronline.game.gui.fishing.FishingViewModel;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.theme.ThemeKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingMainUi.kt */
@SourceDebugExtension({"SMAP\nFishingMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingMainUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingMainUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,239:1\n154#2:240\n69#3,5:241\n74#3:274\n69#3,5:345\n74#3:378\n78#3:383\n69#3,5:384\n74#3:417\n78#3:428\n69#3,5:429\n74#3:462\n78#3:467\n69#3,5:468\n74#3:501\n78#3:512\n78#3:522\n79#4,11:246\n79#4,11:277\n79#4,11:311\n92#4:343\n79#4,11:350\n92#4:382\n79#4,11:389\n92#4:427\n79#4,11:434\n92#4:466\n79#4,11:473\n92#4:511\n92#4:516\n92#4:521\n456#5,8:257\n464#5,3:271\n456#5,8:288\n464#5,3:302\n456#5,8:322\n464#5,3:336\n467#5,3:340\n456#5,8:361\n464#5,3:375\n467#5,3:379\n456#5,8:400\n464#5,3:414\n467#5,3:424\n456#5,8:445\n464#5,3:459\n467#5,3:463\n456#5,8:484\n464#5,3:498\n467#5,3:508\n467#5,3:513\n467#5,3:518\n3737#6,6:265\n3737#6,6:296\n3737#6,6:330\n3737#6,6:369\n3737#6,6:408\n3737#6,6:453\n3737#6,6:492\n91#7,2:275\n93#7:305\n97#7:517\n75#8,5:306\n80#8:339\n84#8:344\n1116#9,6:418\n1116#9,6:502\n1116#9,6:523\n*S KotlinDebug\n*F\n+ 1 FishingMainUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingMainUiKt\n*L\n93#1:240\n97#1:241,5\n97#1:274\n139#1:345,5\n139#1:378\n139#1:383\n151#1:384,5\n151#1:417\n151#1:428\n164#1:429,5\n164#1:462\n164#1:467\n175#1:468,5\n175#1:501\n175#1:512\n97#1:522\n97#1:246,11\n103#1:277,11\n110#1:311,11\n110#1:343\n139#1:350,11\n139#1:382\n151#1:389,11\n151#1:427\n164#1:434,11\n164#1:466\n175#1:473,11\n175#1:511\n103#1:516\n97#1:521\n97#1:257,8\n97#1:271,3\n103#1:288,8\n103#1:302,3\n110#1:322,8\n110#1:336,3\n110#1:340,3\n139#1:361,8\n139#1:375,3\n139#1:379,3\n151#1:400,8\n151#1:414,3\n151#1:424,3\n164#1:445,8\n164#1:459,3\n164#1:463,3\n175#1:484,8\n175#1:498,3\n175#1:508,3\n103#1:513,3\n97#1:518,3\n97#1:265,6\n103#1:296,6\n110#1:330,6\n139#1:369,6\n151#1:408,6\n164#1:453,6\n175#1:492,6\n103#1:275,2\n103#1:305\n103#1:517\n110#1:306,5\n110#1:339\n110#1:344\n160#1:418,6\n184#1:502,6\n203#1:523,6\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingMainUiKt {

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$7 */
    /* loaded from: classes2.dex */
    public static final class C55787 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MutableState<Boolean> $animState;
        public final /* synthetic */ Function0<Unit> $hookAFishClick;
        public final /* synthetic */ Function0<Unit> $isStartFishing;
        public final /* synthetic */ Function0<Unit> $onClickBaitDescription;
        public final /* synthetic */ Function0<Unit> $onClickTackleDescription;
        public final /* synthetic */ Function0<Unit> $pullTheFishClick;
        public final /* synthetic */ FishingUiState $state;
        public final /* synthetic */ long $timerForStartFishing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55787(FishingUiState fishingUiState, long j, MutableState<Boolean> mutableState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i, int i2) {
            super(2);
            fishingUiState = fishingUiState;
            j = j;
            mutableState = mutableState;
            function0 = function0;
            function0 = function02;
            function0 = function03;
            function0 = function04;
            function0 = function05;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FishingMainUiKt.FishingMainContent(modifier, fishingUiState, j, mutableState, function0, function0, function0, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$3 */
    /* loaded from: classes2.dex */
    public static final class C55813 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FishingViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55813(FishingViewModel fishingViewModel, int i, int i2) {
            super(2);
            fishingViewModel = fishingViewModel;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FishingMainUiKt.FishingMainUi(modifier, fishingViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$PreviewFishingMainUi$1 */
    /* loaded from: classes2.dex */
    public static final class C55821 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55821(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FishingMainUiKt.PreviewFishingMainUi(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$SetButtonForCurrentState$3 */
    /* loaded from: classes2.dex */
    public static final class C55843 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $animateDurationMillis;
        public final /* synthetic */ int $drawableIconId;
        public final /* synthetic */ Function0<Unit> $onFinishClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55843(int i, int i2, Function0<Unit> function0, int i3, int i4) {
            super(2);
            i = i;
            i = i2;
            function0 = function0;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FishingMainUiKt.SetButtonForCurrentState(i, i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FishingMainUi(@Nullable Modifier modifier, @NotNull FishingViewModel viewModel, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-52189733);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-52189733, i, -1, "com.blackhub.bronline.game.ui.fishing.FishingMainUi (FishingMainUi.kt:46)");
        }
        FishingUiState fishingUiState = (FishingUiState) FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
        MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$animState$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<Boolean> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$ifNeedCloseIfYouLoser$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<Boolean> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(null, null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2059153824, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1
            public final /* synthetic */ MutableState<Boolean> $animState;
            public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;
            public final /* synthetic */ FishingUiState $state;
            public final /* synthetic */ FishingViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C55791(FishingUiState fishingUiState2, MutableState<Boolean> mutableState3, FishingViewModel viewModel2, MutableState<Boolean> mutableState22) {
                super(2);
                fishingUiState = fishingUiState2;
                mutableState = mutableState3;
                fishingViewModel = viewModel2;
                mutableState = mutableState22;
            }

            /* compiled from: FishingMainUi.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ MutableState<Boolean> $animState;
                public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
                    super(0);
                    mutableState = mutableState;
                    mutableState = mutableState2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    fishingViewModel.hookAFish(mutableState.getValue().booleanValue());
                    mutableState.setValue(Boolean.FALSE);
                }
            }

            /* compiled from: FishingMainUi.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$2 */
            public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                public AnonymousClass2() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    fishingViewModel.pullTheFish();
                }
            }

            /* compiled from: FishingMainUi.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$3 */
            public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
                public AnonymousClass3() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    fishingViewModel.clickBaitDescription();
                }
            }

            /* compiled from: FishingMainUi.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$4 */
            public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
                public AnonymousClass4() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    fishingViewModel.clickTackleDescription();
                }
            }

            /* compiled from: FishingMainUi.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$5 */
            public static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
                public AnonymousClass5() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    fishingViewModel.startAudioIfStartFishing();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2059153824, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingMainUi.<anonymous> (FishingMainUi.kt:54)");
                    }
                    Modifier modifier4 = modifier;
                    FishingUiState fishingUiState2 = fishingUiState;
                    long fishingTimer = fishingUiState2.getFishingTimer();
                    MutableState<Boolean> mutableState3 = mutableState;
                    FishingMainUiKt.FishingMainContent(modifier4, fishingUiState2, fishingTimer, mutableState3, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.1
                        public final /* synthetic */ MutableState<Boolean> $animState;
                        public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<Boolean> mutableState32, MutableState<Boolean> mutableState22) {
                            super(0);
                            mutableState = mutableState32;
                            mutableState = mutableState22;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            fishingViewModel.hookAFish(mutableState.getValue().booleanValue());
                            mutableState.setValue(Boolean.FALSE);
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.2
                        public AnonymousClass2() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            fishingViewModel.pullTheFish();
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.3
                        public AnonymousClass3() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            fishingViewModel.clickBaitDescription();
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.4
                        public AnonymousClass4() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            fishingViewModel.clickTackleDescription();
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.5
                        public AnonymousClass5() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            fishingViewModel.startAudioIfStartFishing();
                        }
                    }, composer2, 64, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12583296, 123);
        if (((Boolean) mutableState3.getValue()).booleanValue()) {
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new C55802(mutableState22, viewModel2, null), composerStartRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ FishingViewModel $viewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C55813(FishingViewModel viewModel2, int i3, int i22) {
                    super(2);
                    fishingViewModel = viewModel2;
                    i = i3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    FishingMainUiKt.FishingMainUi(modifier, fishingViewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1 */
    /* loaded from: classes2.dex */
    public static final class C55791 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $animState;
        public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;
        public final /* synthetic */ FishingUiState $state;
        public final /* synthetic */ FishingViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55791(FishingUiState fishingUiState2, MutableState<Boolean> mutableState3, FishingViewModel viewModel2, MutableState<Boolean> mutableState22) {
            super(2);
            fishingUiState = fishingUiState2;
            mutableState = mutableState3;
            fishingViewModel = viewModel2;
            mutableState = mutableState22;
        }

        /* compiled from: FishingMainUi.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ MutableState<Boolean> $animState;
            public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableState<Boolean> mutableState32, MutableState<Boolean> mutableState22) {
                super(0);
                mutableState = mutableState32;
                mutableState = mutableState22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                fishingViewModel.hookAFish(mutableState.getValue().booleanValue());
                mutableState.setValue(Boolean.FALSE);
            }
        }

        /* compiled from: FishingMainUi.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$2 */
        public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
            public AnonymousClass2() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                fishingViewModel.pullTheFish();
            }
        }

        /* compiled from: FishingMainUi.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$3 */
        public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
            public AnonymousClass3() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                fishingViewModel.clickBaitDescription();
            }
        }

        /* compiled from: FishingMainUi.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$4 */
        public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
            public AnonymousClass4() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                fishingViewModel.clickTackleDescription();
            }
        }

        /* compiled from: FishingMainUi.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$1$5 */
        public static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
            public AnonymousClass5() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                fishingViewModel.startAudioIfStartFishing();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i3) {
            if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2059153824, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingMainUi.<anonymous> (FishingMainUi.kt:54)");
                }
                Modifier modifier4 = modifier;
                FishingUiState fishingUiState2 = fishingUiState;
                long fishingTimer = fishingUiState2.getFishingTimer();
                MutableState<Boolean> mutableState32 = mutableState;
                FishingMainUiKt.FishingMainContent(modifier4, fishingUiState2, fishingTimer, mutableState32, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.1
                    public final /* synthetic */ MutableState<Boolean> $animState;
                    public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(MutableState<Boolean> mutableState322, MutableState<Boolean> mutableState22) {
                        super(0);
                        mutableState = mutableState322;
                        mutableState = mutableState22;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        fishingViewModel.hookAFish(mutableState.getValue().booleanValue());
                        mutableState.setValue(Boolean.FALSE);
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.2
                    public AnonymousClass2() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        fishingViewModel.pullTheFish();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.3
                    public AnonymousClass3() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        fishingViewModel.clickBaitDescription();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.4
                    public AnonymousClass4() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        fishingViewModel.clickTackleDescription();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainUi.1.5
                    public AnonymousClass5() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        fishingViewModel.startAudioIfStartFishing();
                    }
                }, composer2, 64, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$2", m7120f = "FishingMainUi.kt", m7121i = {}, m7122l = {73}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainUi$2 */
    /* loaded from: classes7.dex */
    public static final class C55802 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Boolean> $ifNeedCloseIfYouLoser;
        public final /* synthetic */ FishingViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55802(MutableState<Boolean> mutableState, FishingViewModel fishingViewModel, Continuation<? super C55802> continuation) {
            super(2, continuation);
            this.$ifNeedCloseIfYouLoser = mutableState;
            this.$viewModel = fishingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C55802(this.$ifNeedCloseIfYouLoser, this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C55802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                this.label = 1;
                if (DelayKt.m17189delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.$ifNeedCloseIfYouLoser.getValue().booleanValue()) {
                this.$viewModel.closeIfYouLoser();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$1 */
    /* loaded from: classes2.dex */
    public static final class C55731 extends Lambda implements Function0<Unit> {
        public static final C55731 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$2 */
    /* loaded from: classes2.dex */
    public static final class C55742 extends Lambda implements Function0<Unit> {
        public static final C55742 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$3 */
    /* loaded from: classes2.dex */
    public static final class C55753 extends Lambda implements Function0<Unit> {
        public static final C55753 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$4 */
    /* loaded from: classes2.dex */
    public static final class C55764 extends Lambda implements Function0<Unit> {
        public static final C55764 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$5 */
    /* loaded from: classes2.dex */
    public static final class C55775 extends Lambda implements Function0<Unit> {
        public static final C55775 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FishingMainContent(Modifier modifier, FishingUiState fishingUiState, long j, MutableState<Boolean> mutableState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Composer composer, int i, int i2) {
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-438394244);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        long j2 = (i2 & 4) != 0 ? 0L : j;
        final Function0<Unit> function06 = (i2 & 16) != 0 ? C55731.INSTANCE : function0;
        final Function0<Unit> function07 = (i2 & 32) != 0 ? C55742.INSTANCE : function02;
        Function0<Unit> function08 = (i2 & 64) != 0 ? C55753.INSTANCE : function03;
        Function0<Unit> function09 = (i2 & 128) != 0 ? C55764.INSTANCE : function04;
        Function0<Unit> function010 = (i2 & 256) != 0 ? C55775.INSTANCE : function05;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438394244, i, -1, "com.blackhub.bronline.game.ui.fishing.FishingMainContent (FishingMainUi.kt:91)");
        }
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(10);
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment bottomCenter = companion2.getBottomCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical bottom = companion2.getBottom();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, bottom, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._40sdp, composerStartRestartGroup, 6), 2, null);
        Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceAround, companion2.getStart(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        FishingBaitObj baitObj = fishingUiState.getBaitObj();
        composerStartRestartGroup.startReplaceableGroup(-1151469974);
        if (baitObj == null) {
            companion = companion4;
            modifier2 = modifier3;
            i3 = 733328855;
            z = true;
        } else {
            modifier2 = modifier3;
            companion = companion4;
            i3 = 733328855;
            z = true;
            FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), 7, null), baitObj, fishingUiState.isShowBaitDescription(), function08, composerStartRestartGroup, ((i >> 9) & 7168) | 64, 0);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        FishingBaitObj tackleObj = fishingUiState.getTackleObj();
        composerStartRestartGroup.startReplaceableGroup(724026619);
        if (tackleObj != null) {
            FishingButtonWithDescriptionUiKt.FishingButtonWithDescriptionUi(null, tackleObj, fishingUiState.isShowTackleDescription(), function09, composerStartRestartGroup, ((i >> 12) & 7168) | 64, 1);
            Unit unit2 = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (!fishingUiState.isHideFloat()) {
            composerStartRestartGroup.startReplaceableGroup(724026995);
            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM13666constructorimpl, 7, null);
            Alignment bottomCenter2 = companion2.getBottomCenter();
            composerStartRestartGroup.startReplaceableGroup(i3);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomCenter2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            FishingFloatUIKt.FishingFloatUI(mutableState, j2, function010, composerStartRestartGroup, ((i >> 9) & 14) | ((i >> 3) & 112) | ((i >> 18) & 896), 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), fM13666constructorimpl);
            Alignment centerEnd = companion2.getCenterEnd();
            composerStartRestartGroup.startReplaceableGroup(i3);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1151468275);
            boolean z2 = ((((57344 & i) ^ CpioConstants.C_ISBLK) > 16384 && composerStartRestartGroup.changed(function06)) || (i & CpioConstants.C_ISBLK) == 16384) ? z : false;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$6$1$3$1$1
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
                        function06.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SetButtonForCurrentState(R.drawable.ic_fishing_rod_button, 50, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else if (!fishingUiState.isHideProgress()) {
            composerStartRestartGroup.startReplaceableGroup(724028009);
            Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM13666constructorimpl, 7, null);
            Alignment bottomCenter3 = companion2.getBottomCenter();
            composerStartRestartGroup.startReplaceableGroup(i3);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(bottomCenter3, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            FishingProgressUiKt.FishingProgressUi(fishingUiState.getProgressRotate(), fishingUiState.getCurrentProgress(), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8123padding3ABfNKs2 = PaddingKt.m8123padding3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), fM13666constructorimpl);
            Alignment centerEnd2 = companion2.getCenterEnd();
            composerStartRestartGroup.startReplaceableGroup(i3);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy5, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-1151467293);
            boolean z3 = ((((458752 & i) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) <= 131072 || !composerStartRestartGroup.changed(function07)) && (i & ProfileVerifier.CompilationStatus.f342xf2722a21) != 131072) ? false : z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$FishingMainContent$6$1$5$1$1
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
                        function07.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SetButtonForCurrentState(R.drawable.ic_fishing_rog_with_fish_button, 25, (Function0) objRememberedValue2, composerStartRestartGroup, 54, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(724028942);
            composerStartRestartGroup.endReplaceableGroup();
        }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.FishingMainContent.7
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ MutableState<Boolean> $animState;
                public final /* synthetic */ Function0<Unit> $hookAFishClick;
                public final /* synthetic */ Function0<Unit> $isStartFishing;
                public final /* synthetic */ Function0<Unit> $onClickBaitDescription;
                public final /* synthetic */ Function0<Unit> $onClickTackleDescription;
                public final /* synthetic */ Function0<Unit> $pullTheFishClick;
                public final /* synthetic */ FishingUiState $state;
                public final /* synthetic */ long $timerForStartFishing;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C55787(FishingUiState fishingUiState2, long j22, MutableState<Boolean> mutableState2, final Function0<Unit> function062, final Function0<Unit> function072, Function0<Unit> function082, Function0<Unit> function092, Function0<Unit> function0102, int i4, int i22) {
                    super(2);
                    fishingUiState = fishingUiState2;
                    j = j22;
                    mutableState = mutableState2;
                    function0 = function062;
                    function0 = function072;
                    function0 = function082;
                    function0 = function092;
                    function0 = function0102;
                    i = i4;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    FishingMainUiKt.FishingMainContent(modifier, fishingUiState, j, mutableState, function0, function0, function0, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetButtonForCurrentState(@DrawableRes int i, int i2, final Function0<Unit> function0, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        boolean z;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1808657062);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 == 0) {
            if ((i3 & 112) == 0) {
                i6 = i2;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            if ((i4 & 4) == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                int i8 = i7 == 0 ? 125 : i6;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1808657062, i5, -1, "com.blackhub.bronline.game.ui.fishing.SetButtonForCurrentState (FishingMainUi.kt:196)");
                }
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._80sdp, composerStartRestartGroup, 6));
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                composerStartRestartGroup.startReplaceableGroup(-689395805);
                z = (i5 & 896) != 256;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$SetButtonForCurrentState$1$1
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, circleShape, i8, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1503732201, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.SetButtonForCurrentState.2
                    public final /* synthetic */ int $drawableIconId;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C55832(int i9) {
                        super(2);
                        i = i9;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i9) {
                        if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1503732201, i9, -1, "com.blackhub.bronline.game.ui.fishing.SetButtonForCurrentState.<anonymous> (FishingMainUi.kt:204)");
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i5 << 24) & 1879048192, 3072, 3326);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i6 = i8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.SetButtonForCurrentState.3
                    public final /* synthetic */ int $$changed;
                    public final /* synthetic */ int $$default;
                    public final /* synthetic */ int $animateDurationMillis;
                    public final /* synthetic */ int $drawableIconId;
                    public final /* synthetic */ Function0<Unit> $onFinishClick;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C55843(int i9, int i62, final Function0<Unit> function02, int i32, int i42) {
                        super(2);
                        i = i9;
                        i = i62;
                        function0 = function02;
                        i = i32;
                        i = i42;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        FishingMainUiKt.SetButtonForCurrentState(i, i, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        i62 = i2;
        if ((i42 & 4) == 0) {
        }
        if ((i5 & 731) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._80sdp, composerStartRestartGroup, 6));
            RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
            composerStartRestartGroup.startReplaceableGroup(-689395805);
            if ((i5 & 896) != 256) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$SetButtonForCurrentState$1$1
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceableGroup();
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, circleShape2, i8, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1503732201, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.SetButtonForCurrentState.2
                    public final /* synthetic */ int $drawableIconId;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C55832(int i9) {
                        super(2);
                        i = i9;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i9) {
                        if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1503732201, i9, -1, "com.blackhub.bronline.game.ui.fishing.SetButtonForCurrentState.<anonymous> (FishingMainUi.kt:204)");
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, (i5 << 24) & 1879048192, 3072, 3326);
                if (ComposerKt.isTraceInProgress()) {
                }
                i62 = i8;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: FishingMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt$SetButtonForCurrentState$2 */
    /* loaded from: classes2.dex */
    public static final class C55832 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $drawableIconId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55832(int i9) {
            super(2);
            i = i9;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i9) {
            if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1503732201, i9, -1, "com.blackhub.bronline.game.ui.fishing.SetButtonForCurrentState.<anonymous> (FishingMainUi.kt:204)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(i, composer2, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview(apiLevel = 31, heightDp = 390, widthDp = 844)
    public static final void PreviewFishingMainUi(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(634819680);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634819680, i, -1, "com.blackhub.bronline.game.ui.fishing.PreviewFishingMainUi (FishingMainUi.kt:219)");
            }
            ThemeKt.BRTheme(false, false, ComposableSingletons$FishingMainUiKt.INSTANCE.m14973getLambda1$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingMainUiKt.PreviewFishingMainUi.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C55821(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    FishingMainUiKt.PreviewFishingMainUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

