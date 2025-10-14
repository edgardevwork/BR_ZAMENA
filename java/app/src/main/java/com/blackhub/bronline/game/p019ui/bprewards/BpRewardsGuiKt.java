package com.blackhub.bronline.game.p019ui.bprewards;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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
import androidx.compose.runtime.State;
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
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsUiState;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsViewModel;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsText;
import com.blackhub.bronline.game.p019ui.widget.dialog.DialogCustomBlockKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsGui.kt */
@SourceDebugExtension({"SMAP\nBpRewardsGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsGui.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,249:1\n81#2,11:250\n74#3:261\n1116#4,6:262\n1116#4,6:268\n1116#4,6:274\n1116#4,6:280\n1116#4,6:286\n1116#4,6:292\n1116#4,6:298\n1116#4,6:304\n81#5:310\n*S KotlinDebug\n*F\n+ 1 BpRewardsGui.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsGuiKt\n*L\n41#1:250,11\n116#1:261\n117#1:262,6\n137#1:268,6\n138#1:274,6\n141#1:280,6\n143#1:286,6\n142#1:292,6\n145#1:298,6\n146#1:304,6\n42#1:310\n*E\n"})

public final class BpRewardsGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BpRewardsGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1995615280);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1995615280, i, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsGui (BpRewardsGui.kt:38)");
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
            ViewModel viewModel = ViewModelKt.viewModel(BpRewardsViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final BpRewardsViewModel bpRewardsViewModel = (BpRewardsViewModel) viewModel;
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(bpRewardsViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
            Bitmap refreshButtonBitmap = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getRefreshButtonBitmap();
            boolean zIsBpRewardsScreen = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).isBpRewardsScreen();
            BpRewardsText annotatedText = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getAnnotatedText();
            boolean zIsTutorialEnabled = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).isTutorialEnabled();
            List<BpRewardsServerItemModel> listWithItems = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getBpRewardsLists().getListWithItems();
            List<Integer> listOfAlarmsForButtons = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getBpRewardsLists().getListOfAlarmsForButtons();
            int filterState = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getFilterState();
            boolean zIsButtonFilterBlocked = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).isButtonFilterBlocked();
            int sizeOfImage = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getSizeOfImage();
            List<BpRewardsFilterButtonImageItem> imagesForFilterList = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getImagesForFilterList();
            List<String> topHintList = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getTopHintList();
            List<String> bottomHintList = BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getBottomHintList();
            composer2 = composerStartRestartGroup;
            BpRewardsGuiContent(refreshButtonBitmap, zIsBpRewardsScreen, annotatedText, zIsTutorialEnabled, listWithItems, filterState, listOfAlarmsForButtons, zIsButtonFilterBlocked, sizeOfImage, BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getEmptyIconRes(), imagesForFilterList, topHintList, bottomHintList, BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).isNeedToShowDialog(), BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).isSprayForDialog(), BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).isHasTanpin(), BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getRewardNameForDialog(), BpRewardsGui$lambda$0(stateCollectAsStateWithLifecycle).getSprayTextForDialog(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.2
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
                    bpRewardsViewModel.onItemsRequested();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.3
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
                    bpRewardsViewModel.onDialogButtonYesClick();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.4
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
                    bpRewardsViewModel.onDialogButtonNoClick();
                }
            }, new C49651(bpRewardsViewModel), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    bpRewardsViewModel.onStartFilterButtonPressed(i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.6
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
                    bpRewardsViewModel.sendButtonCasesPressed();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.7
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
                    bpRewardsViewModel.showTutorial(true);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.8
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
                    bpRewardsViewModel.showTutorial(false);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.9
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
                    bpRewardsViewModel.sendUpdateTanpin();
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.10
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
                    bpRewardsViewModel.sendCloseScreen();
                }
            }, composer2, 2129928, 584, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGui.11
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
                    BpRewardsGuiKt.BpRewardsGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: BpRewardsGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGui$1 */
    public /* synthetic */ class C49651 extends FunctionReferenceImpl implements Function4<Integer, Integer, String, Integer, Unit> {
        public C49651(Object obj) {
            super(4, obj, BpRewardsViewModel.class, "onItemClick", "onItemClick(IILjava/lang/String;Ljava/lang/Integer;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, String str, Integer num3) {
            invoke(num.intValue(), num2.intValue(), str, num3);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2, @Nullable String str, @Nullable Integer num) {
            ((BpRewardsViewModel) this.receiver).onItemClick(i, i2, str, num);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BpRewardsGuiContent(@Nullable final Bitmap bitmap, final boolean z, @NotNull final BpRewardsText annotatedText, final boolean z2, @NotNull final List<BpRewardsServerItemModel> listWithItems, final int i, @NotNull final List<Integer> listOfAlarmsForButtons, final boolean z3, final int i2, final int i3, @NotNull final List<BpRewardsFilterButtonImageItem> imagesForFilterList, @NotNull final List<String> topHintsList, @NotNull final List<String> bottomHintsList, final boolean z4, final boolean z5, final boolean z6, @Nullable final String str, @Nullable final AnnotatedString annotatedString, @NotNull final Function0<Unit> onItemsRequested, @NotNull final Function0<Unit> onDialogBtnYes, @NotNull final Function0<Unit> onDialogBtnNo, @NotNull final Function4<? super Integer, ? super Integer, ? super String, ? super Integer, Unit> onItemClick, @NotNull final Function1<? super Integer, Unit> onStartFilterButtonPressed, @NotNull final Function0<Unit> onButtonCasesPressed, @NotNull final Function0<Unit> onInfoClick, @NotNull final Function0<Unit> onCloseInfoClick, @NotNull final Function0<Unit> onButtonUpdateTanpinClicked, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        Intrinsics.checkNotNullParameter(annotatedText, "annotatedText");
        Intrinsics.checkNotNullParameter(listWithItems, "listWithItems");
        Intrinsics.checkNotNullParameter(listOfAlarmsForButtons, "listOfAlarmsForButtons");
        Intrinsics.checkNotNullParameter(imagesForFilterList, "imagesForFilterList");
        Intrinsics.checkNotNullParameter(topHintsList, "topHintsList");
        Intrinsics.checkNotNullParameter(bottomHintsList, "bottomHintsList");
        Intrinsics.checkNotNullParameter(onItemsRequested, "onItemsRequested");
        Intrinsics.checkNotNullParameter(onDialogBtnYes, "onDialogBtnYes");
        Intrinsics.checkNotNullParameter(onDialogBtnNo, "onDialogBtnNo");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onStartFilterButtonPressed, "onStartFilterButtonPressed");
        Intrinsics.checkNotNullParameter(onButtonCasesPressed, "onButtonCasesPressed");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onCloseInfoClick, "onCloseInfoClick");
        Intrinsics.checkNotNullParameter(onButtonUpdateTanpinClicked, "onButtonUpdateTanpinClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1206988845);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1206988845, i4, i5, "com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiContent (BpRewardsGui.kt:113)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(289747742);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = BitmapUtilsKt.getBitmapFromZip$default(context, "ic_dust.svg", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final Bitmap bitmap2 = (Bitmap) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289748595);
        boolean z7 = (((i5 & 234881024) ^ 100663296) > 67108864 && composerStartRestartGroup.changed(onItemsRequested)) || (i5 & 100663296) == 67108864;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z7 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$1$1
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
                    onItemsRequested.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289748656);
        boolean z8 = (((i6 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(onStartFilterButtonPressed)) || (i6 & 384) == 256;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z8 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$2$1
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

                public final void invoke(int i7) {
                    onStartFilterButtonPressed.invoke(Integer.valueOf(i7));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289748793);
        boolean z9 = (((i6 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onButtonCasesPressed)) || (i6 & 3072) == 2048;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z9 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$3$1
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
                    onButtonCasesPressed.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        Function0 function02 = (Function0) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289748894);
        boolean z10 = (((57344 & i6) ^ CpioConstants.C_ISBLK) > 16384 && composerStartRestartGroup.changed(onInfoClick)) || (i6 & CpioConstants.C_ISBLK) == 16384;
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z10 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$4$1
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
                    onInfoClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        Function0 function03 = (Function0) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289748848);
        boolean z11 = (((458752 & i6) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(onCloseInfoClick)) || (i6 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 131072;
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (z11 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$5$1
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
                    onCloseInfoClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        Function0 function04 = (Function0) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289748986);
        boolean z12 = (((i6 & 3670016) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(onButtonUpdateTanpinClicked)) || (i6 & 1572864) == 1048576;
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (z12 || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$6$1
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
                    onButtonUpdateTanpinClicked.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        Function0 function05 = (Function0) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(289749044);
        boolean z13 = (((i6 & 29360128) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(onCloseClick)) || (i6 & 12582912) == 8388608;
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (z13 || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$7$1
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
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        Function0 function06 = (Function0) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        int i7 = i4 << 3;
        int i8 = i4 >> 24;
        BpRewardsMainUIKt.BpRewardsMainUI(null, z, bitmap, annotatedText, listWithItems, listOfAlarmsForButtons, z2, i, z3, z6, i2, i3, imagesForFilterList, topHintsList, bottomHintsList, function0, onItemClick, function1, function02, function03, function04, function05, function06, composerStartRestartGroup, (i4 & 112) | 295424 | (i7 & 7168) | ((i4 << 9) & 3670016) | ((i4 << 6) & 29360128) | (i7 & 234881024) | ((i5 << 12) & 1879048192), (i8 & 112) | (i8 & 14) | 37376 | ((i6 << 15) & 3670016), 0, 1);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z4), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1133597189, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGuiContent.8
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
            public final void invoke(@Nullable Composer composer2, int i9) {
                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1133597189, i9, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiContent.<anonymous> (BpRewardsGui.kt:149)");
                    }
                    String upperCase = StringResources_androidKt.stringResource(R.string.common_confirmation, composer2, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    composer2.startReplaceableGroup(2016507986);
                    boolean zChanged = composer2.changed(onDialogBtnYes);
                    final Function0<Unit> function07 = onDialogBtnYes;
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$8$1$1
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
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    Function0 function08 = (Function0) objRememberedValue9;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(2016508042);
                    boolean zChanged2 = composer2.changed(onDialogBtnNo);
                    final Function0<Unit> function09 = onDialogBtnNo;
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt$BpRewardsGuiContent$8$2$1
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
                                function09.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    Function0 function010 = (Function0) objRememberedValue10;
                    composer2.endReplaceableGroup();
                    final boolean z14 = z5;
                    final AnnotatedString annotatedString2 = annotatedString;
                    final String str2 = str;
                    final Bitmap bitmap3 = bitmap2;
                    DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, R.color.total_black_70, upperCase, null, 0L, 0.0f, null, false, null, null, null, 0L, 0L, 0.0f, 0.0f, null, null, function08, function010, ComposableLambdaKt.composableLambda(composer2, -1376735822, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGuiContent.8.3
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
                            if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1376735822, i10, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiContent.<anonymous>.<anonymous> (BpRewardsGui.kt:155)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._122wdp, composer3, 6)), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer3, 6), 7, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                boolean z15 = z14;
                                AnnotatedString annotatedString3 = annotatedString2;
                                String str3 = str2;
                                Bitmap bitmap4 = bitmap3;
                                composer3.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                if (z15 && annotatedString3 != null) {
                                    composer3.startReplaceableGroup(716454981);
                                    String strStringResource = StringResources_androidKt.stringResource(R.string.bp_rewards_are_u_sure_you_want_spray, composer3, 6);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    TextKt.m10024Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._16wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30), composer3, 0, 0, 65534);
                                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(annotatedString3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, 0L, 0, 0L, 0.0f, null, composer3, 1572870, 62), composer3, 0, 0, 131070);
                                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap4, null, null, null, 0.0f, null, 0, composer3, 8, 126);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(716455735);
                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.bp_rewards_are_u_sure_you_want_take, composer3, 6);
                                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                    TextKt.m10024Text4IGK_g(strStringResource2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14843montserratMediumCustomSpbl3sdaw(R.dimen._16wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30), composer3, 0, 0, 65534);
                                    if (str3 != null) {
                                        TextKt.m10024Text4IGK_g(str3, PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._16wsp, ColorResources_androidKt.colorResource(R.color.yellow, composer3, 6), 0, 0L, 0.0f, null, composer3, 1572870, 60), composer3, 0, 0, 65532);
                                    }
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
                    }), composer2, 48, 805306368, 131065);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((i5 >> 9) & 14) | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.BpRewardsGuiContent.9
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    BpRewardsGuiKt.BpRewardsGuiContent(bitmap, z, annotatedText, z2, listWithItems, i, listOfAlarmsForButtons, z3, i2, i3, imagesForFilterList, topHintsList, bottomHintsList, z4, z5, z6, str, annotatedString, onItemsRequested, onDialogBtnYes, onDialogBtnNo, onItemClick, onStartFilterButtonPressed, onButtonCasesPressed, onInfoClick, onCloseInfoClick, onButtonUpdateTanpinClicked, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBpRewardsGuiContent(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-545490071);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545490071, i, -1, "com.blackhub.bronline.game.ui.bprewards.PreviewBpRewardsGuiContent (BpRewardsGui.kt:202)");
            }
            String upperCase = StringResources_androidKt.stringResource(R.string.bp_rewards_title_text, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            BpRewardsText bpRewardsText = new BpRewardsText(StringExtensionKt.htmlTextToAnnotatedString(upperCase), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.bp_rewards_tutorial_btn_cases, composerStartRestartGroup, 6)));
            List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            composer2 = composerStartRestartGroup;
            BpRewardsGuiContent(null, true, bpRewardsText, false, CollectionsKt__CollectionsJVMKt.listOf(new BpRewardsServerItemModel(0, null, 0, 0, null, null, 0, 0, null, 0, 0, false, null, null, null, 32767, null)), BpRewardsFilterStateEnum.ALL.getFilterState(), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 10, 1, 0, 0, 5}), false, 0, R.drawable.ic_reward, listEmptyList, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"text 1", "text 2", "text 3"}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"text 1", "text 2", "text 3"}), true, true, true, "Очень длинное название ну совсем прям", StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.bp_rewards_u_will_have_n_spray, new Object[]{12}, composerStartRestartGroup, 70)), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function4<Integer, Integer, String, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.4
                public final void invoke(int i2, int i3, @Nullable String str, @Nullable Integer num) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, String str, Integer num3) {
                    invoke(num.intValue(), num2.intValue(), str, num3);
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.5
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920357942, 907767222, 14380470);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsGuiKt.PreviewBpRewardsGuiContent.11
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
                    BpRewardsGuiKt.PreviewBpRewardsGuiContent(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final BpRewardsUiState BpRewardsGui$lambda$0(State<BpRewardsUiState> state) {
        return state.getValue();
    }
}

