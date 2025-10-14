package com.blackhub.bronline.game.p019ui.minigameshelper;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperEnum;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperUiState;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MiniGamesHelperGui.kt */
@SourceDebugExtension({"SMAP\nMiniGamesHelperGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperGui.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MiniGamesHelperGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,160:1\n81#2,11:161\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperGui.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MiniGamesHelperGuiKt\n*L\n34#1:161,11\n*E\n"})
/* loaded from: classes3.dex */
public final class MiniGamesHelperGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MiniGamesHelperGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1779107534);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779107534, i, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGui (MiniGamesHelperGui.kt:32)");
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
            ViewModel viewModel = ViewModelKt.viewModel(MiniGamesHelperViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final MiniGamesHelperViewModel miniGamesHelperViewModel = (MiniGamesHelperViewModel) viewModel;
            MiniGamesHelperUiState miniGamesHelperUiState = (MiniGamesHelperUiState) FlowExtKt.collectAsStateWithLifecycle(miniGamesHelperViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt$MiniGamesHelperGui$isHit$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<Boolean> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                }
            }, composerStartRestartGroup, 3080, 6);
            composer2 = composerStartRestartGroup;
            MiniGamesContent(miniGamesHelperUiState.getHelperType(), miniGamesHelperUiState.getPrizeHeader(), miniGamesHelperUiState.getPrizeImage(), miniGamesHelperUiState.getCongratulatoryText(), miniGamesHelperUiState.getCurrentProgressBarStatus(), miniGamesHelperUiState.getMaxValue(), miniGamesHelperUiState.getMaxProgressBarValue(), miniGamesHelperUiState.getProgressBarTitle(), miniGamesHelperUiState.getTick(), miniGamesHelperUiState.getTimer(), miniGamesHelperUiState.getRandomNum(), mutableState, miniGamesHelperUiState.isNeedToShowClose(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesHelperGui.1
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
                    miniGamesHelperViewModel.onEndOfTime();
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesHelperGui.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    miniGamesHelperViewModel.onHitLine(mutableState.getValue().booleanValue());
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesHelperGui.3
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
                    miniGamesHelperViewModel.onCloseButtonClick();
                }
            }, composer2, 512, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesHelperGui.4
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
                    MiniGamesHelperGuiKt.MiniGamesHelperGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MiniGamesContent(@Nullable final MiniGamesHelperEnum miniGamesHelperEnum, @NotNull final String prizeHeader, @Nullable Bitmap bitmap, @NotNull final String congratulatoryText, final int i, final int i2, final int i3, @NotNull final String progressBarTitle, final int i4, final long j, final int i5, @NotNull final MutableState<Boolean> isLineHit, final boolean z, @NotNull final Function0<Unit> onEndOfTime, @NotNull final Function1<? super Boolean, Unit> onFingerButtonClick, @NotNull final Function0<Unit> onCloseButtonClick, @Nullable Composer composer, final int i6, final int i7, final int i8) {
        int i9;
        int i10;
        Composer composer2;
        final Bitmap bitmap2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(prizeHeader, "prizeHeader");
        Intrinsics.checkNotNullParameter(congratulatoryText, "congratulatoryText");
        Intrinsics.checkNotNullParameter(progressBarTitle, "progressBarTitle");
        Intrinsics.checkNotNullParameter(isLineHit, "isLineHit");
        Intrinsics.checkNotNullParameter(onEndOfTime, "onEndOfTime");
        Intrinsics.checkNotNullParameter(onFingerButtonClick, "onFingerButtonClick");
        Intrinsics.checkNotNullParameter(onCloseButtonClick, "onCloseButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1495148846);
        if ((i8 & 1) != 0) {
            i9 = i6 | 6;
        } else if ((i6 & 14) == 0) {
            i9 = (composerStartRestartGroup.changed(miniGamesHelperEnum) ? 4 : 2) | i6;
        } else {
            i9 = i6;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i6 & 112) == 0) {
            i9 |= composerStartRestartGroup.changed(prizeHeader) ? 32 : 16;
        }
        int i12 = i8 & 4;
        if (i12 != 0) {
            i9 |= 128;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i9 |= composerStartRestartGroup.changed(congratulatoryText) ? 2048 : 1024;
        }
        if ((i8 & 16) != 0) {
            i9 |= CpioConstants.C_ISBLK;
        } else {
            if ((i6 & 57344) == 0) {
                i9 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
            }
            if ((i8 & 32) == 0) {
                i9 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i6 & 458752) == 0) {
                i9 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
            }
            if ((i8 & 64) == 0) {
                i9 |= 1572864;
            } else if ((i6 & 3670016) == 0) {
                i9 |= composerStartRestartGroup.changed(i3) ? 1048576 : 524288;
            }
            if ((i8 & 128) != 0) {
                i11 = (29360128 & i6) == 0 ? composerStartRestartGroup.changed(progressBarTitle) ? 8388608 : 4194304 : 12582912;
                if ((i8 & 256) != 0) {
                    i9 |= 100663296;
                } else {
                    if ((234881024 & i6) == 0) {
                        i9 |= composerStartRestartGroup.changed(i4) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i8 & 512) == 0) {
                        i9 |= 805306368;
                    } else if ((1879048192 & i6) == 0) {
                        i9 |= composerStartRestartGroup.changed(j) ? 536870912 : 268435456;
                    }
                    if ((i8 & 1024) == 0) {
                        i10 = i7 | 6;
                    } else if ((i7 & 14) == 0) {
                        i10 = i7 | (composerStartRestartGroup.changed(i5) ? 4 : 2);
                    } else {
                        i10 = i7;
                    }
                    if ((i8 & 2048) == 0) {
                        i10 |= 48;
                    } else if ((i7 & 112) == 0) {
                        i10 |= composerStartRestartGroup.changed(isLineHit) ? 32 : 16;
                    }
                    int i13 = i10;
                    if ((i8 & 4096) != 0) {
                        if ((i7 & 896) == 0) {
                            i13 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                        }
                        if ((i8 & 8192) != 0) {
                            i13 |= 3072;
                        } else if ((i7 & 7168) == 0) {
                            i13 |= composerStartRestartGroup.changedInstance(onEndOfTime) ? 2048 : 1024;
                        }
                        if ((i8 & 16384) != 0) {
                            i13 |= CpioConstants.C_ISBLK;
                        } else if ((i7 & 57344) == 0) {
                            i13 |= composerStartRestartGroup.changedInstance(onFingerButtonClick) ? 16384 : 8192;
                        }
                        if ((32768 & i8) != 0) {
                            i13 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i7 & 458752) == 0) {
                            i13 |= composerStartRestartGroup.changedInstance(onCloseButtonClick) ? 131072 : 65536;
                        }
                        if (i12 != 4 || (1533916891 & i9) != 306783378 || (374491 & i13) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            Bitmap bitmap3 = i12 == 0 ? null : bitmap;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1495148846, i9, i13, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesContent (MiniGamesHelperGui.kt:78)");
                            }
                            final Bitmap bitmap4 = bitmap3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -560062861, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContent.1

                                /* compiled from: MiniGamesHelperGui.kt */
                                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                /* renamed from: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt$MiniGamesContent$1$WhenMappings */
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[MiniGamesHelperEnum.values().length];
                                        try {
                                            iArr[MiniGamesHelperEnum.SCREEN_PRIZE.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[MiniGamesHelperEnum.SCREEN_UNTIE.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[MiniGamesHelperEnum.SCREEN_FINGER.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

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
                                public final void invoke(@Nullable Composer composer3, int i14) {
                                    if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-560062861, i14, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesContent.<anonymous> (MiniGamesHelperGui.kt:83)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        boolean z2 = z;
                                        MiniGamesHelperEnum miniGamesHelperEnum2 = miniGamesHelperEnum;
                                        String str = prizeHeader;
                                        Bitmap bitmap5 = bitmap4;
                                        String str2 = congratulatoryText;
                                        int i15 = i;
                                        int i16 = i2;
                                        int i17 = i3;
                                        String str3 = progressBarTitle;
                                        int i18 = i4;
                                        long j2 = j;
                                        Function0<Unit> function0 = onEndOfTime;
                                        int i19 = i5;
                                        MutableState<Boolean> mutableState = isLineHit;
                                        Function1<Boolean, Unit> function1 = onFingerButtonClick;
                                        final Function0<Unit> function02 = onCloseButtonClick;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composer3, 309707473, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt$MiniGamesContent$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i20) {
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(309707473, i20, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesContent.<anonymous>.<anonymous>.<anonymous> (MiniGamesHelperGui.kt:87)");
                                                    }
                                                    IconButtonKt.IconButton(function02, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer4, 6)), Alignment.INSTANCE.getTopEnd()), false, null, null, ComposableSingletons$MiniGamesHelperGuiKt.INSTANCE.m15010getLambda1$app_siteRelease(), composer4, ProfileVerifier.CompilationStatus.f342xf2722a21, 28);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 48);
                                        int i20 = miniGamesHelperEnum2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[miniGamesHelperEnum2.ordinal()];
                                        if (i20 == 1) {
                                            composer3.startReplaceableGroup(-1556418450);
                                            MiniGamesHelperPrizeUiKt.MiniGamesHelperPrizeUI(str, bitmap5, str2, composer3, 64);
                                            composer3.endReplaceableGroup();
                                        } else if (i20 == 2) {
                                            composer3.startReplaceableGroup(-1556418166);
                                            MiniGamesHelperUntieUiKt.MiniGamesHelperUntieUI(i15, i16, i17, str3, i18, j2, function0, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else if (i20 == 3) {
                                            composer3.startReplaceableGroup(-1556417693);
                                            MiniGamesHelperFingerUiKt.MiniGamesHelperFingerUI(i19, mutableState, function1, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-1556417443);
                                            composer3.endReplaceableGroup();
                                        }
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
                            }), composer2, 12582918, 122);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            bitmap2 = bitmap3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            bitmap2 = bitmap;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContent.2
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

                                public final void invoke(@Nullable Composer composer3, int i14) {
                                    MiniGamesHelperGuiKt.MiniGamesContent(miniGamesHelperEnum, prizeHeader, bitmap2, congratulatoryText, i, i2, i3, progressBarTitle, i4, j, i5, isLineHit, z, onEndOfTime, onFingerButtonClick, onCloseButtonClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), RecomposeScopeImplKt.updateChangedFlags(i7), i8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i13 |= 384;
                    if ((i8 & 8192) != 0) {
                    }
                    if ((i8 & 16384) != 0) {
                    }
                    if ((32768 & i8) != 0) {
                    }
                    if (i12 != 4) {
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Bitmap bitmap42 = bitmap3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -560062861, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContent.1

                            /* compiled from: MiniGamesHelperGui.kt */
                            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                            /* renamed from: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt$MiniGamesContent$1$WhenMappings */
                            /* loaded from: classes3.dex */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[MiniGamesHelperEnum.values().length];
                                    try {
                                        iArr[MiniGamesHelperEnum.SCREEN_PRIZE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[MiniGamesHelperEnum.SCREEN_UNTIE.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[MiniGamesHelperEnum.SCREEN_FINGER.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

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
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-560062861, i14, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesContent.<anonymous> (MiniGamesHelperGui.kt:83)");
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    boolean z2 = z;
                                    MiniGamesHelperEnum miniGamesHelperEnum2 = miniGamesHelperEnum;
                                    String str = prizeHeader;
                                    Bitmap bitmap5 = bitmap42;
                                    String str2 = congratulatoryText;
                                    int i15 = i;
                                    int i16 = i2;
                                    int i17 = i3;
                                    String str3 = progressBarTitle;
                                    int i18 = i4;
                                    long j2 = j;
                                    Function0<Unit> function0 = onEndOfTime;
                                    int i19 = i5;
                                    MutableState<Boolean> mutableState = isLineHit;
                                    Function1<Boolean, Unit> function1 = onFingerButtonClick;
                                    final Function0<Unit> function02 = onCloseButtonClick;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    final BoxScope boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composer3, 309707473, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt$MiniGamesContent$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i20) {
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(309707473, i20, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesContent.<anonymous>.<anonymous>.<anonymous> (MiniGamesHelperGui.kt:87)");
                                                }
                                                IconButtonKt.IconButton(function02, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer4, 6)), Alignment.INSTANCE.getTopEnd()), false, null, null, ComposableSingletons$MiniGamesHelperGuiKt.INSTANCE.m15010getLambda1$app_siteRelease(), composer4, ProfileVerifier.CompilationStatus.f342xf2722a21, 28);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 48);
                                    int i20 = miniGamesHelperEnum2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[miniGamesHelperEnum2.ordinal()];
                                    if (i20 == 1) {
                                        composer3.startReplaceableGroup(-1556418450);
                                        MiniGamesHelperPrizeUiKt.MiniGamesHelperPrizeUI(str, bitmap5, str2, composer3, 64);
                                        composer3.endReplaceableGroup();
                                    } else if (i20 == 2) {
                                        composer3.startReplaceableGroup(-1556418166);
                                        MiniGamesHelperUntieUiKt.MiniGamesHelperUntieUI(i15, i16, i17, str3, i18, j2, function0, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    } else if (i20 == 3) {
                                        composer3.startReplaceableGroup(-1556417693);
                                        MiniGamesHelperFingerUiKt.MiniGamesHelperFingerUI(i19, mutableState, function1, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-1556417443);
                                        composer3.endReplaceableGroup();
                                    }
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
                        }), composer2, 12582918, 122);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        bitmap2 = bitmap3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i8 & 512) == 0) {
                }
                if ((i8 & 1024) == 0) {
                }
                if ((i8 & 2048) == 0) {
                }
                int i132 = i10;
                if ((i8 & 4096) != 0) {
                }
                if ((i8 & 8192) != 0) {
                }
                if ((i8 & 16384) != 0) {
                }
                if ((32768 & i8) != 0) {
                }
                if (i12 != 4) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i9 |= i11;
            if ((i8 & 256) != 0) {
            }
            if ((i8 & 512) == 0) {
            }
            if ((i8 & 1024) == 0) {
            }
            if ((i8 & 2048) == 0) {
            }
            int i1322 = i10;
            if ((i8 & 4096) != 0) {
            }
            if ((i8 & 8192) != 0) {
            }
            if ((i8 & 16384) != 0) {
            }
            if ((32768 & i8) != 0) {
            }
            if (i12 != 4) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i8 & 32) == 0) {
        }
        if ((i8 & 64) == 0) {
        }
        if ((i8 & 128) != 0) {
        }
        i9 |= i11;
        if ((i8 & 256) != 0) {
        }
        if ((i8 & 512) == 0) {
        }
        if ((i8 & 1024) == 0) {
        }
        if ((i8 & 2048) == 0) {
        }
        int i13222 = i10;
        if ((i8 & 4096) != 0) {
        }
        if ((i8 & 8192) != 0) {
        }
        if ((i8 & 16384) != 0) {
        }
        if ((32768 & i8) != 0) {
        }
        if (i12 != 4) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @FigmaLargePreview
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    public static final void MiniGamesContentPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1913401688);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1913401688, i, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesContentPreview (MiniGamesHelperGui.kt:138)");
            }
            MiniGamesContent(MiniGamesHelperEnum.SCREEN_UNTIE, "", null, "", 0, 100, 100, "", 0, 0L, 2, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContentPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContentPreview.2
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContentPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350134, 224646, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperGuiKt.MiniGamesContentPreview.4
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
                    MiniGamesHelperGuiKt.MiniGamesContentPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

