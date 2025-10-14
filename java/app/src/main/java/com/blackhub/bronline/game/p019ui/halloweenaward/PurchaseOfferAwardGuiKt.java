package com.blackhub.bronline.game.p019ui.halloweenaward;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardUiState;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardViewModel;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseOfferAwardGui.kt */
@SourceDebugExtension({"SMAP\nPurchaseOfferAwardGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseOfferAwardGui.kt\ncom/blackhub/bronline/game/ui/halloweenaward/PurchaseOfferAwardGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,85:1\n81#2,11:86\n*S KotlinDebug\n*F\n+ 1 PurchaseOfferAwardGui.kt\ncom/blackhub/bronline/game/ui/halloweenaward/PurchaseOfferAwardGuiKt\n*L\n22#1:86,11\n*E\n"})
/* loaded from: classes3.dex */
public final class PurchaseOfferAwardGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PurchaseOfferAwardGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-936534066);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-936534066, i, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGui (PurchaseOfferAwardGui.kt:19)");
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
            ViewModel viewModel = ViewModelKt.viewModel(HalloweenAwardViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            HalloweenAwardViewModel halloweenAwardViewModel = (HalloweenAwardViewModel) viewModel;
            HalloweenAwardUiState halloweenAwardUiState = (HalloweenAwardUiState) FlowExtKt.collectAsStateWithLifecycle(halloweenAwardViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            PurchaseOfferAwardGuiContent(null, halloweenAwardUiState.getTitleText(), halloweenAwardUiState.isHasPremium(), String.valueOf(halloweenAwardUiState.getMoney()), String.valueOf(halloweenAwardUiState.getMoneyBP()), String.valueOf(halloweenAwardUiState.getScoreBP()), String.valueOf(halloweenAwardUiState.getXpBP()), new C56431(halloweenAwardViewModel), composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt.PurchaseOfferAwardGui.2
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
                    PurchaseOfferAwardGuiKt.PurchaseOfferAwardGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: PurchaseOfferAwardGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt$PurchaseOfferAwardGui$1 */
    
    public /* synthetic */ class C56431 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C56431(Object obj) {
            super(1, obj, HalloweenAwardViewModel.class, "sendType", "sendType(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((HalloweenAwardViewModel) this.receiver).sendType(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurchaseOfferAwardGuiContent(@Nullable Modifier modifier, @NotNull final String textTitle, final boolean z, @NotNull final String money, @NotNull final String moneyBP, @NotNull final String scoreBP, @NotNull final String xpBP, @NotNull final Function1<? super Integer, Unit> onClick, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(textTitle, "textTitle");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(moneyBP, "moneyBP");
        Intrinsics.checkNotNullParameter(scoreBP, "scoreBP");
        Intrinsics.checkNotNullParameter(xpBP, "xpBP");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(748418886);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(textTitle) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(money) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(moneyBP) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i4 = ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else {
            if ((458752 & i) == 0) {
                i4 = composerStartRestartGroup.changed(scoreBP) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                i7 = (3670016 & i) == 0 ? composerStartRestartGroup.changed(xpBP) ? 1048576 : 524288 : 1572864;
                if ((i2 & 128) == 0) {
                    i6 = (29360128 & i) == 0 ? composerStartRestartGroup.changedInstance(onClick) ? 8388608 : 4194304 : 12582912;
                    i5 = i3;
                    if ((23967451 & i5) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(748418886, i5, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiContent (PurchaseOfferAwardGui.kt:45)");
                        }
                        composer2 = composerStartRestartGroup;
                        FakeDialogKt.m15089FakeDialog3IgeMak(modifier4, 0L, ComposableLambdaKt.composableLambda(composer2, 2023233082, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt.PurchaseOfferAwardGuiContent.1
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
                            public final void invoke(@Nullable Composer composer3, int i9) {
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2023233082, i9, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiContent.<anonymous> (PurchaseOfferAwardGui.kt:47)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    String str = textTitle;
                                    final Function1<Integer, Unit> function1 = onClick;
                                    String str2 = money;
                                    String str3 = moneyBP;
                                    String str4 = scoreBP;
                                    String str5 = xpBP;
                                    boolean z2 = z;
                                    composer3.startReplaceableGroup(733328855);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer3, 6), 0.0f, 0.0f, 13, null);
                                    composer3.startReplaceableGroup(1602604223);
                                    boolean zChanged = composer3.changed(function1);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt$PurchaseOfferAwardGuiContent$1$1$1$1
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
                                                function1.invoke(0);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceableGroup();
                                    PurchaseOfferAwardHeadBlockKt.PurchaseOfferAwardHeadBlock(modifierM8127paddingqDBjuR0$default, str, (Function0) objRememberedValue, composer3, 0, 0);
                                    PurchaseOfferAwardWithoutBPBlockKt.PurchaseOfferAwardWithoutBPBlock(boxScopeInstance.align(companion, companion2.getCenterStart()), str2, composer3, 0, 0);
                                    Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterEnd());
                                    composer3.startReplaceableGroup(1602604715);
                                    boolean zChanged2 = composer3.changed(function1);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt$PurchaseOfferAwardGuiContent$1$1$2$1
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
                                                function1.invoke(1);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    PurchaseOfferAwardWithBPBlockKt.PurchaseOfferAwardWithBPBlock(modifierAlign, str3, str4, str5, z2, (Function0) objRememberedValue2, composer3, 0, 0);
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
                        }), composer2, (i5 & 14) | 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt.PurchaseOfferAwardGuiContent.2
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

                            public final void invoke(@Nullable Composer composer3, int i9) {
                                PurchaseOfferAwardGuiKt.PurchaseOfferAwardGuiContent(modifier3, textTitle, z, money, moneyBP, scoreBP, xpBP, onClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i6;
                i5 = i3;
                if ((23967451 & i5) == 4793490) {
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    FakeDialogKt.m15089FakeDialog3IgeMak(modifier4, 0L, ComposableLambdaKt.composableLambda(composer2, 2023233082, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt.PurchaseOfferAwardGuiContent.1
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
                        public final void invoke(@Nullable Composer composer3, int i9) {
                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2023233082, i9, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiContent.<anonymous> (PurchaseOfferAwardGui.kt:47)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                String str = textTitle;
                                final Function1<? super Integer, Unit> function1 = onClick;
                                String str2 = money;
                                String str3 = moneyBP;
                                String str4 = scoreBP;
                                String str5 = xpBP;
                                boolean z2 = z;
                                composer3.startReplaceableGroup(733328855);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer3, 6), 0.0f, 0.0f, 13, null);
                                composer3.startReplaceableGroup(1602604223);
                                boolean zChanged = composer3.changed(function1);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt$PurchaseOfferAwardGuiContent$1$1$1$1
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
                                            function1.invoke(0);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                PurchaseOfferAwardHeadBlockKt.PurchaseOfferAwardHeadBlock(modifierM8127paddingqDBjuR0$default, str, (Function0) objRememberedValue, composer3, 0, 0);
                                PurchaseOfferAwardWithoutBPBlockKt.PurchaseOfferAwardWithoutBPBlock(boxScopeInstance.align(companion, companion2.getCenterStart()), str2, composer3, 0, 0);
                                Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterEnd());
                                composer3.startReplaceableGroup(1602604715);
                                boolean zChanged2 = composer3.changed(function1);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt$PurchaseOfferAwardGuiContent$1$1$2$1
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
                                            function1.invoke(1);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                PurchaseOfferAwardWithBPBlockKt.PurchaseOfferAwardWithBPBlock(modifierAlign, str3, str4, str5, z2, (Function0) objRememberedValue2, composer3, 0, 0);
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
                    }), composer2, (i5 & 14) | 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i3 |= i7;
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            i5 = i3;
            if ((23967451 & i5) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i3 |= i4;
        if ((i2 & 64) != 0) {
        }
        i3 |= i7;
        if ((i2 & 128) == 0) {
        }
        i3 |= i6;
        i5 = i3;
        if ((23967451 & i5) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewPurchaseOfferAwardGuiContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1462810177);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1462810177, i, -1, "com.blackhub.bronline.game.ui.halloweenaward.PreviewPurchaseOfferAwardGuiContent (PurchaseOfferAwardGui.kt:74)");
            }
            PurchaseOfferAwardGuiContent(null, "HOT COFFEE", true, "5 000", "5 000", "100", "3", new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt.PreviewPurchaseOfferAwardGuiContent.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 14380464, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardGuiKt.PreviewPurchaseOfferAwardGuiContent.2
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
                    PurchaseOfferAwardGuiKt.PreviewPurchaseOfferAwardGuiContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

