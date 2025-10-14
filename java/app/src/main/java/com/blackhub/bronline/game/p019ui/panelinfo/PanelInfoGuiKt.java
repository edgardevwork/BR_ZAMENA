package com.blackhub.bronline.game.p019ui.panelinfo;

import android.graphics.Bitmap;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoUiState;
import com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoContentModel;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoModel;
import com.blackhub.bronline.game.p019ui.widget.block.HorizontalPagerBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.tutorial.PanelInfoBlockKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PanelInfoGui.kt */
@SourceDebugExtension({"SMAP\nPanelInfoGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelInfoGui.kt\ncom/blackhub/bronline/game/ui/panelinfo/PanelInfoGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,97:1\n81#2,11:98\n1116#3,6:109\n81#4:115\n107#4,2:116\n*S KotlinDebug\n*F\n+ 1 PanelInfoGui.kt\ncom/blackhub/bronline/game/ui/panelinfo/PanelInfoGuiKt\n*L\n24#1:98,11\n42#1:109,6\n42#1:115\n42#1:116,2\n*E\n"})
/* loaded from: classes3.dex */
public final class PanelInfoGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PanelInfoGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(582329196);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582329196, i, -1, "com.blackhub.bronline.game.ui.panelinfo.PanelInfoGui (PanelInfoGui.kt:22)");
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
            ViewModel viewModel = ViewModelKt.viewModel(PanelInfoViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final PanelInfoViewModel panelInfoViewModel = (PanelInfoViewModel) viewModel;
            PanelInfoUiState panelInfoUiState = (PanelInfoUiState) FlowExtKt.collectAsStateWithLifecycle(panelInfoViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            PanelInfoGuiContent(panelInfoUiState.getImages(), panelInfoUiState.getHintModel(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PanelInfoGui.1
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
                    panelInfoViewModel.sendCloseScreen();
                }
            }, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PanelInfoGui.2
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
                    PanelInfoGuiKt.PanelInfoGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PanelInfoGuiContent(@NotNull final Map<String, Bitmap> images, @NotNull final PanelInfoModel hintModel, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(hintModel, "hintModel");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-199946604);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-199946604, i, -1, "com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiContent (PanelInfoGui.kt:39)");
        }
        final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt$PanelInfoGuiContent$pagerState$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(hintModel.getAllHints().size());
            }
        }, composerStartRestartGroup, 0, 3);
        composerStartRestartGroup.startReplaceableGroup(-1174767903);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        PanelInfoBlockKt.m15068PanelInfoBlockGF6hDo(0.0f, 0.0f, null, PanelInfoGuiContent$lambda$1(mutableState), 0L, null, 0, 0, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, onCloseClick, null, null, false, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 287406673, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PanelInfoGuiContent.1
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
                        ComposerKt.traceEventStart(287406673, i2, -1, "com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiContent.<anonymous> (PanelInfoGui.kt:47)");
                    }
                    PagerState pagerState = pagerStateRememberPagerState;
                    int size = hintModel.getAllHints().size();
                    final PanelInfoModel panelInfoModel = hintModel;
                    final MutableState<String> mutableState2 = mutableState;
                    final Map<String, Bitmap> map = images;
                    HorizontalPagerBlockKt.HorizontalPagerBlock(pagerState, size, ComposableLambdaKt.composableLambda(composer2, 1834304533, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PanelInfoGuiContent.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer3, Integer num2) {
                            invoke(num.intValue(), composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(int i3, @Nullable Composer composer3, int i4) {
                            if ((i4 & 14) == 0) {
                                i4 |= composer3.changed(i3) ? 4 : 2;
                            }
                            if ((i4 & 91) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1834304533, i4, -1, "com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiContent.<anonymous>.<anonymous> (PanelInfoGui.kt:51)");
                                }
                                PanelInfoContentModel panelInfoContentModel = (PanelInfoContentModel) CollectionsKt___CollectionsKt.getOrNull(panelInfoModel.getAllHints(), i3);
                                MutableState<String> mutableState3 = mutableState2;
                                String titleText = panelInfoContentModel != null ? panelInfoContentModel.getTitleText() : null;
                                if (titleText == null) {
                                    titleText = "";
                                }
                                PanelInfoGuiKt.PanelInfoGuiContent$lambda$2(mutableState3, titleText);
                                if (panelInfoContentModel != null) {
                                    PanelInfoContentKt.PanelInfoContent(map.get(panelInfoContentModel.getImageName()), StringExtensionKt.htmlTextToAnnotatedString(panelInfoContentModel.getDescriptionText()), null, composer3, 8, 4);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 0, ((i >> 6) & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21, 32505847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PanelInfoGuiContent.2
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
                    PanelInfoGuiKt.PanelInfoGuiContent(images, hintModel, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewPanelInfoGui(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1689566496);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1689566496, i, -1, "com.blackhub.bronline.game.ui.panelinfo.PreviewPanelInfoGui (PanelInfoGui.kt:66)");
            }
            PanelInfoGuiContent(MapsKt__MapsKt.emptyMap(), new PanelInfoModel(CollectionsKt__CollectionsKt.listOf((Object[]) new PanelInfoContentModel[]{new PanelInfoContentModel("Каждый час по карте разбрасываются подарки, которые можно собрать.\n\nТолько это не так просто, ведь все любят подарки.\n\nКак только Вы увидите что подарки были разбросаны по карте, сразу отправляйтесь на поиски и найдите их первым как можно больше. ", "-Проходить сюжетный квест\n(Меню - Навигатор - Новый Год 2024 - Пройти квест)\n- Выполнять ежедневные задания у Cиняка\n(Меню - Навигатор - Новый Год 2024 - Синяк | Ежедневные задания)\n- Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры)", ""), new PanelInfoContentModel("Каждый час по карте разбрасываются подарки, которые можно собрать.\n\nТолько это не так просто, ведь все любят подарки.\n\nКак только Вы увидите что подарки были разбросаны по карте, сразу отправляйтесь на поиски и найдите их первым как можно больше. ", "-Проходить сюжетный квест\n(Меню - Навигатор - Новый Год 2024 - Пройти квест)\n- Выполнять ежедневные задания у Cиняка\n(Меню - Навигатор - Новый Год 2024 - Синяк | Ежедневные задания)\n- Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры) Проходить сюжетный квест\n(Меню - Навигатор - Новый Год 2024 - Пройти квест)\n- Выполнять ежедневные задания у Cиняка\n(Меню - Навигатор - Новый Год 2024 - Синяк | Ежедневные задания)\n- Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры)", "")})), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PreviewPanelInfoGui.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 454);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.panelinfo.PanelInfoGuiKt.PreviewPanelInfoGui.2
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
                    PanelInfoGuiKt.PreviewPanelInfoGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final String PanelInfoGuiContent$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final void PanelInfoGuiContent$lambda$2(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }
}

