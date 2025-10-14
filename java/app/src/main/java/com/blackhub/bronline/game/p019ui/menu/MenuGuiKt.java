package com.blackhub.bronline.game.p019ui.menu;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.menu.MenuUiState;
import com.blackhub.bronline.game.gui.menu.model.MenuListModel;
import com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonFillKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuGui.kt */
@SourceDebugExtension({"SMAP\nMenuGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuGui.kt\ncom/blackhub/bronline/game/ui/menu/MenuGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,249:1\n81#2,11:250\n74#3:261\n1116#4,3:262\n1119#4,3:266\n154#5:265\n81#6:269\n107#6,2:270\n*S KotlinDebug\n*F\n+ 1 MenuGui.kt\ncom/blackhub/bronline/game/ui/menu/MenuGuiKt\n*L\n61#1:250,11\n91#1:261\n93#1:262,3\n93#1:266,3\n93#1:265\n93#1:269\n93#1:270,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuGuiKt {
    public static final float HEIGHT_OF_COLUMN = 0.85f;
    public static final int PADDING_FOR_LIST_GRID = 16;
    public static final float SIZE_OF_BTN_EXIT = 0.07f;
    public static final float WIDTH_OF_COLUMN = 0.9f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MenuGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1718632823);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1718632823, i, -1, "com.blackhub.bronline.game.ui.menu.MenuGui (MenuGui.kt:58)");
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
            ViewModel viewModel = ViewModelKt.viewModel(MenuViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final MenuViewModel menuViewModel = (MenuViewModel) viewModel;
            MenuUiState menuUiState = (MenuUiState) SnapshotStateKt.collectAsState(menuViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            MenuContent(menuUiState.isCommunication(), menuUiState.isHeightCalculated(), menuUiState.getCountOfColumns(), menuUiState.getListWithItems(), menuUiState.getBgNativeButton(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuGui.1
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
                    menuViewModel.onHeightCalculated();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuGui.2
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
                    menuViewModel.blockButtons();
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuGui.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    menuViewModel.itemClicked(i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuGui.4
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
                    menuViewModel.buttonCloseClicked();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuGui.5
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
                    menuViewModel.onNativeButtonClick();
                }
            }, composerStartRestartGroup, 4096, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuGui.6
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
                    MenuGuiKt.MenuGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MenuContent(boolean z, boolean z2, final int i, @NotNull final List<MenuListModel> listWithItems, @ColorRes final int i2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function0<Unit> function03, @NotNull final Function0<Unit> onNativeButtonClick, @Nullable Composer composer, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(listWithItems, "listWithItems");
        Intrinsics.checkNotNullParameter(onNativeButtonClick, "onNativeButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1483353316);
        boolean z3 = (i4 & 1) != 0 ? false : z;
        boolean z4 = (i4 & 2) != 0 ? true : z2;
        Function0<Unit> function04 = (i4 & 32) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuContent.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function0<Unit> function05 = (i4 & 64) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuContent.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        Function1<? super Integer, Unit> function12 = (i4 & 128) != 0 ? new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuContent.3
            public final void invoke(int i5) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }
        } : function1;
        Function0<Unit> function06 = (i4 & 256) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuContent.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function03;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1483353316, i3, -1, "com.blackhub.bronline.game.ui.menu.MenuContent (MenuGui.kt:89)");
        }
        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        composerStartRestartGroup.startReplaceableGroup(209944650);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(0)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11291linearGradientmHitzGk$default = Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange_70, composerStartRestartGroup, 6))}), OffsetKt.Offset(0.0f, Float.POSITIVE_INFINITY), OffsetKt.Offset(Float.POSITIVE_INFINITY, 0.0f), 0, 8, (Object) null);
        final Function0<Unit> function07 = function04;
        final boolean z5 = z4;
        final boolean z6 = z3;
        final Function0<Unit> function08 = function05;
        final Function1<? super Integer, Unit> function13 = function12;
        final Function0<Unit> function09 = function06;
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 205686113, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuContent.5
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
            public final void invoke(@Nullable Composer composer2, int i5) {
                final MutableState<C2046Dp> mutableState2;
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(205686113, i5, -1, "com.blackhub.bronline.game.ui.menu.MenuContent.<anonymous> (MenuGui.kt:107)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.background$default(companion, brushM11291linearGradientmHitzGk$default, null, 0.0f, 6, null), 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment center = companion2.getCenter();
                    final Density density2 = density;
                    final Function0<Unit> function010 = function07;
                    List<MenuListModel> list = listWithItems;
                    int i6 = i;
                    boolean z7 = z5;
                    boolean z8 = z6;
                    final Function0<Unit> function011 = function08;
                    final Function1<Integer, Unit> function14 = function13;
                    final Function0<Unit> function012 = function09;
                    MutableState<C2046Dp> mutableState3 = mutableState;
                    int i7 = i2;
                    final Function0<Unit> function013 = onNativeButtonClick;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, 0.9f), 0.85f);
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlign = ColumnScopeInstance.INSTANCE.align(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._22sdp, composer2, 6), 0.0f, 11, null), companion2.getCenterHorizontally());
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(R.string.menu_action_title_actions, composer2, 6);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14801montserratBold42spOr32ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65534);
                    composer2.startReplaceableGroup(680602546);
                    boolean zChanged = composer2.changed(function012);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt$MenuContent$5$1$1$1$1$1
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
                                function012.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableSingletons$MenuGuiKt.INSTANCE.m15007getLambda1$app_siteRelease(), composer2, 0, 3072, UnixStat.PERM_MASK);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._22sdp, composer2, 6), 0.0f, 11, null), 0.0f, 1, null), C2046Dp.m13666constructorimpl(1)), Color.INSTANCE.m11377getWhite0d7_KjU(), null, 2, null), composer2, 0);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, C2046Dp.m13666constructorimpl(16), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceableGroup(-1784519625);
                    boolean zChanged2 = composer2.changed(density2) | composer2.changed(function010);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        mutableState2 = mutableState3;
                        objRememberedValue3 = new Function1<LayoutCoordinates, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt$MenuContent$5$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull LayoutCoordinates coordinates) {
                                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                                float fMo7871toDpu2uoSUM = density2.mo7871toDpu2uoSUM(IntSize.m13835getHeightimpl(coordinates.mo12617getSizeYbymL2g()));
                                if (C2046Dp.m13671equalsimpl0(fMo7871toDpu2uoSUM, MenuGuiKt.MenuContent$lambda$1(mutableState2))) {
                                    return;
                                }
                                MenuGuiKt.MenuContent$lambda$2(mutableState2, fMo7871toDpu2uoSUM);
                                function010.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        mutableState2 = mutableState3;
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM8127paddingqDBjuR0$default, (Function1) objRememberedValue3);
                    float fMenuContent$lambda$1 = MenuGuiKt.MenuContent$lambda$1(mutableState2);
                    composer2.startReplaceableGroup(-1784519026);
                    boolean zChanged3 = composer2.changed(function011);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt$MenuContent$5$1$1$3$1
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
                                function011.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function014 = (Function0) objRememberedValue4;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1784518972);
                    boolean zChanged4 = composer2.changed(function14);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt$MenuContent$5$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i8) {
                                function14.invoke(Integer.valueOf(i8));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MenuListGridKt.m15008MenuListGridUR9CgXA(modifierOnGloballyPositioned, list, fMenuContent$lambda$1, i6, z7, z8, function014, (Function1) objRememberedValue5, composer2, 64, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1942105025);
                    if (UtilsKt.isNotPublicBuildType()) {
                        Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._150sdp, composer2, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._150wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer2, 6)), companion2.getTopEnd());
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign2);
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
                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122);
                        long jColorResource = ColorResources_androidKt.colorResource(i7, composer2, 0);
                        composer2.startReplaceableGroup(-1784518035);
                        boolean zChanged5 = composer2.changed(function013);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt$MenuContent$5$1$2$1$1
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
                                    function013.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonFillKt.m15075MainButtonFilljAZ_Pg4(modifierFillMaxSize$default2, "NATIVE TOOLS", textStyleM14811montserratBoldCustomSpIzzofJo, jColorResource, 0.0f, 0.0f, false, false, false, (Function0) objRememberedValue6, composer2, 54, 496);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12583302, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z7 = z3;
            final boolean z8 = z4;
            final Function0<Unit> function010 = function04;
            final Function0<Unit> function011 = function05;
            final Function1<? super Integer, Unit> function14 = function12;
            final Function0<Unit> function012 = function06;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.MenuContent.6
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    MenuGuiKt.MenuContent(z7, z8, i, listWithItems, i2, function010, function011, function14, function012, onNativeButtonClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    public static final void MenuContent$lambda$2(MutableState<C2046Dp> mutableState, float f) {
        mutableState.setValue(C2046Dp.m13664boximpl(f));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBrDialogUI(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2060166687);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060166687, i, -1, "com.blackhub.bronline.game.ui.menu.PreviewBrDialogUI (MenuGui.kt:198)");
            }
            MenuContent(false, true, 4, CollectionsKt__CollectionsKt.mutableListOf(new MenuListModel(0, R.drawable.ic_menu_compass, R.string.menu_action_navigator), new MenuListModel(1, R.drawable.ic_menu_taxi, R.string.menu_action_taxi_call), new MenuListModel(2, R.drawable.ic_menu_menu_red, R.string.menu_action_menu), new MenuListModel(3, R.drawable.ic_menu_chat, R.string.menu_action_communication), new MenuListModel(4, R.drawable.ic_menu_bag, R.string.common_inventory), new MenuListModel(5, R.drawable.ic_menu_anim, R.string.menu_action_animations), new MenuListModel(6, R.drawable.ic_menu_ruble, R.string.common_donate), new MenuListModel(7, R.drawable.ic_menu_car, R.string.menu_action_cars), new MenuListModel(8, R.drawable.ic_menu_gift_box, R.string.menu_action_promo), new MenuListModel(9, R.drawable.ic_menu_help_desk, R.string.menu_action_complaint)), R.color.dark_green, null, null, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.PreviewBrDialogUI.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 805335478, 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuGuiKt.PreviewBrDialogUI.2
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
                    MenuGuiKt.PreviewBrDialogUI(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float MenuContent$lambda$1(MutableState<C2046Dp> mutableState) {
        return mutableState.getValue().m13680unboximpl();
    }
}

