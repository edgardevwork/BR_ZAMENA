package com.blackhub.bronline.game.p019ui.fishing;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.fishing.FishingUiState;
import com.blackhub.bronline.game.gui.fishing.FishingViewModel;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.p019ui.widget.other.CorrugatedOvalKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectShadowKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FishingResultUi.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m7105d2 = {"FishingResultContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "descrObj", "descrAction", "prizeItem", "Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/blackhub/bronline/game/gui/fishing/data/FishingBaitObj;Landroidx/compose/runtime/Composer;II)V", "FishingResultUi", "viewModel", "Lcom/blackhub/bronline/game/gui/fishing/FishingViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/fishing/FishingViewModel;Landroidx/compose/runtime/Composer;II)V", "PreviewFishingResultUi", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFishingResultUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingResultUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingResultUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,153:1\n154#2:154\n154#2:155\n154#2:156\n154#2:157\n69#3,5:158\n74#3:191\n78#3:237\n79#4,11:163\n79#4,11:199\n92#4:231\n92#4:236\n456#5,8:174\n464#5,3:188\n456#5,8:210\n464#5,3:224\n467#5,3:228\n467#5,3:233\n3737#6,6:182\n3737#6,6:218\n73#7,7:192\n80#7:227\n84#7:232\n*S KotlinDebug\n*F\n+ 1 FishingResultUi.kt\ncom/blackhub/bronline/game/ui/fishing/FishingResultUiKt\n*L\n75#1:154\n76#1:155\n78#1:156\n79#1:157\n81#1:158,5\n81#1:191\n81#1:237\n81#1:163,11\n100#1:199,11\n100#1:231\n81#1:236\n81#1:174,8\n81#1:188,3\n100#1:210,8\n100#1:224,3\n100#1:228,3\n81#1:233,3\n81#1:182,6\n100#1:218,6\n100#1:192,7\n100#1:227\n100#1:232\n*E\n"})
/* loaded from: classes3.dex */
public final class FishingResultUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FishingResultUi(@Nullable Modifier modifier, @NotNull final FishingViewModel viewModel, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1105140781);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1105140781, i, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultUi (FishingResultUi.kt:40)");
        }
        final FishingUiState fishingUiState = (FishingUiState) FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C55901(viewModel, null), composerStartRestartGroup, 70);
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(null, null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1367294424, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultUiKt.FishingResultUi.2
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1367294424, i3, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultUi.<anonymous> (FishingResultUi.kt:51)");
                    }
                    FishingResultUiKt.FishingResultContent(modifier2, fishingUiState.getFishingObj().getTitle(), fishingUiState.getFishingObj().getDescription(), fishingUiState.getFishingObj().getDescriptionAction(), fishingUiState.getFishingObj(), composer2, 32768, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12583296, 123);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultUiKt.FishingResultUi.3
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
                    FishingResultUiKt.FishingResultUi(modifier3, viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: FishingResultUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.fishing.FishingResultUiKt$FishingResultUi$1", m7120f = "FishingResultUi.kt", m7121i = {}, m7122l = {45}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.fishing.FishingResultUiKt$FishingResultUi$1 */
    /* loaded from: classes7.dex */
    public static final class C55901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ FishingViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55901(FishingViewModel fishingViewModel, Continuation<? super C55901> continuation) {
            super(2, continuation);
            this.$viewModel = fishingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C55901(this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C55901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.$viewModel.closeInterface();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FishingResultContent(Modifier modifier, String str, String str2, String str3, FishingBaitObj fishingBaitObj, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str4;
        String strEmpty;
        String strEmpty2;
        Modifier modifier3;
        String strEmpty3;
        FishingBaitObj fishingBaitObj2;
        int i4;
        final String str5;
        final FishingBaitObj fishingBaitObj3;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(377443446);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                str4 = str;
                if (composerStartRestartGroup.changed(str4)) {
                    i5 = 32;
                }
                i3 |= i5;
            } else {
                str4 = str;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            str4 = str;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                strEmpty = str2;
                int i7 = composerStartRestartGroup.changed(strEmpty) ? 256 : 128;
                i3 |= i7;
            } else {
                strEmpty = str2;
            }
            i3 |= i7;
        } else {
            strEmpty = str2;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                strEmpty2 = str3;
                int i8 = composerStartRestartGroup.changed(strEmpty2) ? 2048 : 1024;
                i3 |= i8;
            } else {
                strEmpty2 = str3;
            }
            i3 |= i8;
        } else {
            strEmpty2 = str3;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 8192;
        }
        if (i9 != 16 || (46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    strEmpty3 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    i3 &= -113;
                } else {
                    strEmpty3 = str4;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                }
                if (i9 != 0) {
                    i4 = i3 & (-57345);
                    fishingBaitObj2 = new FishingBaitObj(null, 0, null, null, null, 0.0f, null, 0, 0, null, 1023, null);
                } else {
                    fishingBaitObj2 = fishingBaitObj;
                    i4 = i3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if (i9 != 0) {
                    i3 &= -57345;
                }
                fishingBaitObj2 = fishingBaitObj;
                modifier3 = modifier2;
                i4 = i3;
                strEmpty3 = str4;
            }
            String str6 = strEmpty;
            String str7 = strEmpty2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(377443446, i4, -1, "com.blackhub.bronline.game.ui.fishing.FishingResultContent (FishingResultUi.kt:68)");
            }
            int i10 = i4 >> 6;
            AnnotatedString fishingResultSubtitle = StringResourceCompose.INSTANCE.getFishingResultSubtitle(str6, str7, composerStartRestartGroup, (i10 & 112) | (i10 & 14) | 384);
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._150sdp, composerStartRestartGroup, 6);
            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composerStartRestartGroup, 6);
            float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._50sdp, composerStartRestartGroup, 6);
            float fM13666constructorimpl = C2046Dp.m13666constructorimpl(5);
            float f = 10;
            float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(f);
            float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(3);
            float fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(f);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            CorrugatedOvalKt.CorrugatedOval(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, fDimensionResource2, 0.0f, 0.0f, 13, null), fDimensionResource), composerStartRestartGroup, 0, 0);
            int i11 = i4;
            RectShadowKt.m15098RectShadowOfrYxbw(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(companion3, 0.5f), fDimensionResource3), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 92);
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            long jColorResource = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.m10024Text4IGK_g(strEmpty3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14871mullerBold30ssp67j0QOw(jColorResource, companion4.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 12), composerStartRestartGroup, (i11 >> 3) & 14, 0, 65534);
            BoxKt.Box(SizeKt.m8158height3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxWidth(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, fM13666constructorimpl, 0.0f, fM13666constructorimpl2, 5, null), 0.44f), ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6), null, 2, null), fM13666constructorimpl3), composerStartRestartGroup, 0);
            TextKt.m10025TextIbK3jfQ(fishingResultSubtitle, PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, fM13666constructorimpl4, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14797montserratBold18ssp67j0QOw(0L, companion4.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 48, 0, 131068);
            FishingResultPrizeObjUiKt.m14975FishingResultPrizeObjUiuFdPcIQ(SizeKt.m8172size3ABfNKs(companion3, fDimensionResource2), 0.0f, fishingBaitObj2, composerStartRestartGroup, 512, 2);
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
            strEmpty = str6;
            str5 = str7;
            fishingBaitObj3 = fishingBaitObj2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            strEmpty3 = str4;
            str5 = strEmpty2;
            fishingBaitObj3 = fishingBaitObj;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final String str8 = strEmpty3;
            final String str9 = strEmpty;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultUiKt.FishingResultContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    FishingResultUiKt.FishingResultContent(modifier4, str8, str9, str5, fishingBaitObj3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 31, heightDp = 390, widthDp = 844)
    public static final void PreviewFishingResultUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985684384);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985684384, i, -1, "com.blackhub.bronline.game.ui.fishing.PreviewFishingResultUi (FishingResultUi.kt:142)");
            }
            FishingResultContent(BackgroundKt.m7771backgroundbw27NRU$default(Modifier.INSTANCE, ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), null, 2, null), "РЫБА ПОЙМАНА!", "Нерка", "помещена в Ваш инвентарь", new FishingBaitObj(null, 0, null, null, "Нерка 1", 0.0f, null, 0, 0, null, 1007, null), composerStartRestartGroup, 36272, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.fishing.FishingResultUiKt.PreviewFishingResultUi.1
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
                    FishingResultUiKt.PreviewFishingResultUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
