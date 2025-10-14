package com.blackhub.bronline.game.p019ui.activetask;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskEnum;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskUiState;
import com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActiveTaskGui.kt */
@SourceDebugExtension({"SMAP\nActiveTaskGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskGui.kt\ncom/blackhub/bronline/game/ui/activetask/ActiveTaskGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,135:1\n81#2,11:136\n1116#3,6:147\n1116#3,6:153\n1116#3,6:229\n1116#3,6:235\n68#4,6:159\n74#4:193\n68#4,6:194\n74#4:228\n78#4:245\n78#4:250\n79#5,11:165\n79#5,11:200\n92#5:244\n92#5:249\n456#6,8:176\n464#6,3:190\n456#6,8:211\n464#6,3:225\n467#6,3:241\n467#6,3:246\n3737#7,6:184\n3737#7,6:219\n75#8:251\n108#8,2:252\n*S KotlinDebug\n*F\n+ 1 ActiveTaskGui.kt\ncom/blackhub/bronline/game/ui/activetask/ActiveTaskGuiKt\n*L\n38#1:136,11\n42#1:147,6\n82#1:153,6\n111#1:229,6\n112#1:235,6\n84#1:159,6\n84#1:193\n87#1:194,6\n87#1:228\n87#1:245\n84#1:250\n84#1:165,11\n87#1:200,11\n87#1:244\n84#1:249\n84#1:176,8\n84#1:190,3\n87#1:211,8\n87#1:225,3\n87#1:241,3\n84#1:246,3\n84#1:184,6\n87#1:219,6\n42#1:251\n42#1:252,2\n*E\n"})
/* loaded from: classes.dex */
public final class ActiveTaskGuiKt {
    public static final int BOX_VERTICAL_PERCENT = 24;
    public static final float HINT_WIDTH = 0.3f;

    /* compiled from: ActiveTaskGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActiveTaskEnum.values().length];
            try {
                iArr[ActiveTaskEnum.ACTIVE_TASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActiveTaskEnum.ACTIVE_HINT_WITH_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ActiveTaskGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-814747013);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-814747013, i, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskGui (ActiveTaskGui.kt:35)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(ActiveTaskViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final ActiveTaskViewModel activeTaskViewModel = (ActiveTaskViewModel) viewModel;
            ActiveTaskUiState activeTaskUiState = (ActiveTaskUiState) FlowExtKt.collectAsStateWithLifecycle(activeTaskViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            boolean z = activeTaskUiState.getHintTime() != -1;
            composerStartRestartGroup.startReplaceableGroup(-1871420860);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(-1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1871420794);
            if (z) {
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new C47511(activeTaskUiState, activeTaskViewModel, mutableIntState, null), composerStartRestartGroup, 70);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (activeTaskUiState.isInterfaceVisible()) {
                ActiveTaskGuiContent(null, activeTaskUiState.getHintScreen(), StringExtensionKt.htmlTextToAnnotatedString(activeTaskUiState.getHintTitle()), StringExtensionKt.htmlTextToAnnotatedString(activeTaskUiState.getHintDesc()), z, mutableIntState.getIntValue(), activeTaskUiState.getBtnText(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.ActiveTaskGui.2
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
                        activeTaskViewModel.sendClickId(1);
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.ActiveTaskGui.3
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
                        activeTaskViewModel.sendClickId(0);
                    }
                }, composerStartRestartGroup, 0, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.ActiveTaskGui.4
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
                    ActiveTaskGuiKt.ActiveTaskGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: ActiveTaskGui.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt$ActiveTaskGui$1", m7120f = "ActiveTaskGui.kt", m7121i = {}, m7122l = {48}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt$ActiveTaskGui$1 */
    /* loaded from: classes2.dex */
    public static final class C47511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ActiveTaskUiState $state;
        public final /* synthetic */ MutableIntState $ticks$delegate;
        public final /* synthetic */ ActiveTaskViewModel $viewModel;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47511(ActiveTaskUiState activeTaskUiState, ActiveTaskViewModel activeTaskViewModel, MutableIntState mutableIntState, Continuation<? super C47511> continuation) {
            super(2, continuation);
            this.$state = activeTaskUiState;
            this.$viewModel = activeTaskViewModel;
            this.$ticks$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C47511(this.$state, this.$viewModel, this.$ticks$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:14:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ActiveTaskGuiKt.ActiveTaskGui$lambda$2(this.$ticks$delegate, this.$state.getHintTime());
                if (ActiveTaskGuiKt.ActiveTaskGui$lambda$1(this.$ticks$delegate) > 0) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ActiveTaskGuiKt.ActiveTaskGui$lambda$2(this.$ticks$delegate, ActiveTaskGuiKt.ActiveTaskGui$lambda$1(this.$ticks$delegate) - 1);
                if (ActiveTaskGuiKt.ActiveTaskGui$lambda$1(this.$ticks$delegate) > 0) {
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                    this.label = 1;
                    if (DelayKt.m17189delayVtjQ1oo(duration, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ActiveTaskGuiKt.ActiveTaskGui$lambda$2(this.$ticks$delegate, ActiveTaskGuiKt.ActiveTaskGui$lambda$1(this.$ticks$delegate) - 1);
                    if (ActiveTaskGuiKt.ActiveTaskGui$lambda$1(this.$ticks$delegate) > 0) {
                        this.$viewModel.onEndOfTime();
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0136  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActiveTaskGuiContent(@Nullable Modifier modifier, @NotNull final ActiveTaskEnum hintScreen, @NotNull final AnnotatedString hintTitle, @NotNull final AnnotatedString hintDesc, final boolean z, final int i, @NotNull final String btnText, @NotNull final Function0<Unit> onBtnClick, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i5;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(hintScreen, "hintScreen");
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        Intrinsics.checkNotNullParameter(onBtnClick, "onBtnClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-722742143);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(hintScreen) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(hintTitle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(hintDesc) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= CpioConstants.C_ISBLK;
        } else {
            if ((i2 & 57344) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i2 & 458752) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i8 = (i2 & 3670016) == 0 ? composerStartRestartGroup.changed(btnText) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i7 = (i2 & 29360128) == 0 ? composerStartRestartGroup.changedInstance(onBtnClick) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i6 = (i2 & 234881024) == 0 ? composerStartRestartGroup.changedInstance(onCloseClick) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                        if ((191739611 & i4) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-722742143, i4, -1, "com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiContent (ActiveTaskGui.kt:79)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1060537944);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            MutableState mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(PaddingKt.m8127paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, ComposeExtensionKt.toVerticalPercentSwDp(24, composerStartRestartGroup, 6), 7, null), companion3.getTopEnd()), 0.0f, ComposeExtensionKt.toVerticalPercentSwDp(24, composerStartRestartGroup, 6), 1, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            i5 = WhenMappings.$EnumSwitchMapping$0[hintScreen.ordinal()];
                            if (i5 != 1) {
                                composer2 = composerStartRestartGroup;
                                composer2.startReplaceableGroup(1438649561);
                                int i10 = i4 >> 3;
                                ActiveTaskBlockKt.ActiveTaskBlock(SizeKt.fillMaxWidth(companion2, 0.3f), hintTitle, hintDesc, z, i, mutableState, composer2, (i10 & 112) | 196614 | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 0);
                                composer2.endReplaceableGroup();
                                Unit unit = Unit.INSTANCE;
                            } else if (i5 == 2) {
                                composerStartRestartGroup.startReplaceableGroup(1438650003);
                                Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion2, 0.3f);
                                composerStartRestartGroup.startReplaceableGroup(1438650271);
                                boolean z2 = (i4 & 29360128) == 8388608;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z2 || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt$ActiveTaskGuiContent$1$1$1$1
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
                                            onBtnClick.invoke();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                Function0 function0 = (Function0) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(1438650328);
                                boolean z3 = (i4 & 234881024) == 67108864;
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z3 || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt$ActiveTaskGuiContent$1$1$2$1
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
                                            onCloseClick.invoke();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                Function0 function02 = (Function0) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                                int i11 = i4 >> 3;
                                composer2 = composerStartRestartGroup;
                                HintRightWithButtonBlockKt.HintRightWithButtonBlock(modifierFillMaxWidth, hintTitle, hintDesc, btnText, function0, function02, composerStartRestartGroup, (i11 & 896) | (i11 & 112) | 6 | ((i4 >> 9) & 7168), 0);
                                composer2.endReplaceableGroup();
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(1438650412);
                                composerStartRestartGroup.endReplaceableGroup();
                                Unit unit3 = Unit.INSTANCE;
                                composer2 = composerStartRestartGroup;
                            }
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
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.ActiveTaskGuiContent.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    ActiveTaskGuiKt.ActiveTaskGuiContent(modifier4, hintScreen, hintTitle, hintDesc, z, i, btnText, onBtnClick, onCloseClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= i6;
                    if ((191739611 & i4) != 38347922) {
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1060537944);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        MutableState mutableState2 = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy3, companion42.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            Modifier modifierM8084offsetVpY3zN4$default2 = OffsetKt.m8084offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(PaddingKt.m8127paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, ComposeExtensionKt.toVerticalPercentSwDp(24, composerStartRestartGroup, 6), 7, null), companion32.getTopEnd()), 0.0f, ComposeExtensionKt.toVerticalPercentSwDp(24, composerStartRestartGroup, 6), 1, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion42.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl2.getInserting()) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                i5 = WhenMappings.$EnumSwitchMapping$0[hintScreen.ordinal()];
                                if (i5 != 1) {
                                }
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier3;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 |= i7;
                if ((i3 & 256) != 0) {
                }
                i4 |= i6;
                if ((191739611 & i4) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i4 |= i8;
            if ((i3 & 128) == 0) {
            }
            i4 |= i7;
            if ((i3 & 256) != 0) {
            }
            i4 |= i6;
            if ((191739611 & i4) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        i4 |= i8;
        if ((i3 & 128) == 0) {
        }
        i4 |= i7;
        if ((i3 & 256) != 0) {
        }
        i4 |= i6;
        if ((191739611 & i4) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewActiveTaskGuiContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2029549562);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2029549562, i, -1, "com.blackhub.bronline.game.ui.activetask.PreviewActiveTaskGuiContent (ActiveTaskGui.kt:123)");
            }
            ActiveTaskGuiContent(null, ActiveTaskEnum.ACTIVE_HINT_WITH_BUTTON, StringExtensionKt.htmlTextToAnnotatedString("Заголовок"), StringExtensionKt.htmlTextToAnnotatedString("Приветствую. Не волнуйтесь, Вы уже прошли половину экзамена. Осталось самое интересное.\n<font color=#CCFFDD>Откройте Радиальное меню</font> и заведите двигатель.Приветствую. Не волнуйтесь, Вы уже прошли половину <font color=#FFBAFA>экзамена</font>. Осталось самое интересное.\nОткройте Радиальное меню и заведите двигатель.Приветствую."), true, 100, "Кнопка", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.PreviewActiveTaskGuiContent.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.PreviewActiveTaskGuiContent.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 115040304, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.activetask.ActiveTaskGuiKt.PreviewActiveTaskGuiContent.3
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
                    ActiveTaskGuiKt.PreviewActiveTaskGuiContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int ActiveTaskGui$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void ActiveTaskGui$lambda$2(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}

