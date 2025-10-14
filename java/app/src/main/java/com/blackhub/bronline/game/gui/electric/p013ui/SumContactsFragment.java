package com.blackhub.bronline.game.gui.electric.p013ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentSumContactsBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragAndDrop;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragView;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSumContactsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/SumContactsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,454:1\n106#2,15:455\n106#2,15:470\n41#3,2:485\n41#3,2:487\n41#3,2:489\n41#3,2:491\n41#3,2:493\n41#3,2:495\n41#3,2:497\n41#3,2:499\n41#3,2:501\n41#3,2:503\n41#3,2:505\n*S KotlinDebug\n*F\n+ 1 SumContactsFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/SumContactsFragment\n*L\n61#1:455,15\n69#1:470,15\n135#1:485,2\n154#1:487,2\n163#1:489,2\n227#1:491,2\n253#1:493,2\n262#1:495,2\n302#1:497,2\n342#1:499,2\n382#1:501,2\n417#1:503,2\n432#1:505,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SumContactsFragment extends BaseFragmentWithState<SumContactsUiState, SumContactsViewModel, FragmentSumContactsBinding> {
    public static final long ANIMATION_TRANSLATE_DURATION = 2000;
    public static final int HALF_SIZE = 2;

    @Nullable
    public AnimatorSet animatorSet;

    @Nullable
    public ObjectAnimator animatorX;

    @Nullable
    public ObjectAnimator animatorY;

    @Nullable
    public List<DataTargetArea> dataTargetAreaList;

    @Nullable
    public View.OnDragListener dragListener;

    @Inject
    public MainViewModelFactory<SumContactsViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public RotateAnimation handRotateAnimation;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    public SumContactsFragment() {
        super(R.layout.fragment_sum_contacts);
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$parentViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment fragmentRequireParentFragment = this.this$0.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ElectricViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$screenArgs$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String string;
                Bundle arguments = this.this$0.getArguments();
                return (arguments == null || (string = arguments.getString(ElectricConstants.ELECTRIC_BUNDLE)) == null) ? AnyExtensionKt.empty(this.this$0) : string;
            }
        });
        Function0<ViewModelProvider.Factory> function03 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                SumContactsFragment sumContactsFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(sumContactsFragment, sumContactsFragment.getFactory()).get(SumContactsViewModel.class);
            }
        };
        final Function0<Fragment> function04 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SumContactsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function03);
    }

    private final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @NotNull
    public final MainViewModelFactory<SumContactsViewModel> getFactory() {
        MainViewModelFactory<SumContactsViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<SumContactsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public SumContactsViewModel getViewModel() {
        return (SumContactsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() throws Resources.NotFoundException {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            SumContactsViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2);
        }
        getParentViewModel().sendStartMiniGame();
        setDragAndDropForView();
        setObservers();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull SumContactsUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        blockingLoader(uiState.isBlockingLoading());
        Boolean boolIsWin = uiState.isWin();
        if (boolIsWin != null) {
            getParentViewModel().sendFinishMiniGame(boolIsWin.booleanValue());
        }
        if (uiState.isSumAllTermsCorrect()) {
            getViewModel().setWin(true);
            clearTouch();
        }
        if (uiState.getCountError() > uiState.getCountErrorForGameOver()) {
            getViewModel().setWin(false);
        }
        if (uiState.isHintTwoTurnOn()) {
            getViewModel().setHintTwo();
        }
        if (uiState.isHintThreeTurnOn()) {
            getViewModel().setHintThree();
        }
        if (uiState.isHandTranslateAnimationShow()) {
            createHandTranslateAnimation();
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandRotateAnimationShow()) {
            createHandRotateAnimation();
        } else {
            clearHandRotateAnimation();
        }
        if (uiState.getCountHint() == 3) {
            FragmentSumContactsBinding binding = getBinding();
            AppCompatImageView ivSumContactsCircleTwo = binding.ivSumContactsCircleTwo;
            Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleTwo, "ivSumContactsCircleTwo");
            PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsCircleTwo);
            binding.ivSumContactsHand.setX(globalCenterPoint.getX());
            binding.ivSumContactsHand.setY(globalCenterPoint.getY());
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissGameInstructionsDialog();
        clearHandTranslateAnimation();
        clearHandRotateAnimation();
        clearListeners();
        clearTouch();
        super.onDestroyView();
    }

    public final void setDragAndDropForView() {
        FragmentSumContactsBinding binding = getBinding();
        TextView tvSumContactsBulbOne = binding.tvSumContactsBulbOne;
        Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbOne, "tvSumContactsBulbOne");
        ViewExtensionKt.setDragAndDrop$default(tvSumContactsBulbOne, null, 1, null);
        TextView tvSumContactsBulbTwo = binding.tvSumContactsBulbTwo;
        Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbTwo, "tvSumContactsBulbTwo");
        ViewExtensionKt.setDragAndDrop$default(tvSumContactsBulbTwo, null, 1, null);
        TextView tvSumContactsBulbThree = binding.tvSumContactsBulbThree;
        Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbThree, "tvSumContactsBulbThree");
        ViewExtensionKt.setDragAndDrop$default(tvSumContactsBulbThree, null, 1, null);
    }

    private final void setObservers() throws Resources.NotFoundException {
        final float dimension = getResources().getDimension(R.dimen._50sdp);
        final FragmentSumContactsBinding binding = getBinding();
        ConstraintLayout mlSumContacts = binding.mlSumContacts;
        Intrinsics.checkNotNullExpressionValue(mlSumContacts, "mlSumContacts");
        ViewExtensionKt.addViewObserver(mlSumContacts, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setObservers$1$1
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
                AppCompatImageView ivSumContactsCircleOne = binding.ivSumContactsCircleOne;
                Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleOne, "ivSumContactsCircleOne");
                PointFloat startLocationViewInWindow = ViewExtensionKt.getStartLocationViewInWindow(ivSumContactsCircleOne);
                AppCompatImageView ivSumContactsCircleTwo = binding.ivSumContactsCircleTwo;
                Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleTwo, "ivSumContactsCircleTwo");
                PointFloat startLocationViewInWindow2 = ViewExtensionKt.getStartLocationViewInWindow(ivSumContactsCircleTwo);
                AppCompatImageView ivSumContactsCircleThree = binding.ivSumContactsCircleThree;
                Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleThree, "ivSumContactsCircleThree");
                PointFloat startLocationViewInWindow3 = ViewExtensionKt.getStartLocationViewInWindow(ivSumContactsCircleThree);
                TextView tvSumContactsBulbOne = binding.tvSumContactsBulbOne;
                Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbOne, "tvSumContactsBulbOne");
                CurrentDraggableItem currentDraggableItem = CurrentDraggableItem.ELEMENT_BULB;
                FrameLayout blockSumContactsBulbOne = binding.blockSumContactsBulbOne;
                Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbOne, "blockSumContactsBulbOne");
                DataDragView dataDragView = new DataDragView(tvSumContactsBulbOne, currentDraggableItem, blockSumContactsBulbOne, new DataDragAndDrop(0.0f, 0.0f, this.getViewModel().getUiState().getValue().getBulbTextOne(), 3, null), null, null, false, 112, null);
                TextView tvSumContactsBulbTwo = binding.tvSumContactsBulbTwo;
                Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbTwo, "tvSumContactsBulbTwo");
                FrameLayout blockSumContactsBulbTwo = binding.blockSumContactsBulbTwo;
                Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbTwo, "blockSumContactsBulbTwo");
                DataDragView dataDragView2 = new DataDragView(tvSumContactsBulbTwo, currentDraggableItem, blockSumContactsBulbTwo, new DataDragAndDrop(0.0f, 0.0f, this.getViewModel().getUiState().getValue().getBulbTextTwo(), 3, null), null, null, false, 112, null);
                TextView tvSumContactsBulbThree = binding.tvSumContactsBulbThree;
                Intrinsics.checkNotNullExpressionValue(tvSumContactsBulbThree, "tvSumContactsBulbThree");
                FrameLayout blockSumContactsBulbThree = binding.blockSumContactsBulbThree;
                Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbThree, "blockSumContactsBulbThree");
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new DataDragView[]{dataDragView, dataDragView2, new DataDragView(tvSumContactsBulbThree, currentDraggableItem, blockSumContactsBulbThree, new DataDragAndDrop(0.0f, 0.0f, this.getViewModel().getUiState().getValue().getBulbTextThree(), 3, null), null, null, false, 112, null)});
                this.dataTargetAreaList = CollectionsKt__CollectionsKt.listOf((Object[]) new DataTargetArea[]{new DataTargetArea(CurrentTargetArea.TARGET_AREA_ONE, null, ElectricConstants.CARTRIDGE_BUSY_ONE, new PointFloat(startLocationViewInWindow.getX() + (binding.ivSumContactsCircleOne.getWidth() / 2), startLocationViewInWindow.getY() + (binding.ivSumContactsCircleOne.getHeight() / 2)), dimension, null, listListOf, 34, null), new DataTargetArea(CurrentTargetArea.TARGET_AREA_TWO, null, ElectricConstants.CARTRIDGE_BUSY_TWO, new PointFloat(startLocationViewInWindow2.getX() + (binding.ivSumContactsCircleTwo.getWidth() / 2), startLocationViewInWindow2.getY() + (binding.ivSumContactsCircleTwo.getHeight() / 2)), dimension, null, listListOf, 34, null), new DataTargetArea(CurrentTargetArea.TARGET_AREA_THREE, null, ElectricConstants.CARTRIDGE_BUSY_THREE, new PointFloat(startLocationViewInWindow3.getX() + (binding.ivSumContactsCircleThree.getWidth() / 2), startLocationViewInWindow3.getY() + (binding.ivSumContactsCircleThree.getHeight() / 2)), dimension, null, listListOf, 34, null)});
                SumContactsFragment sumContactsFragment = this;
                sumContactsFragment.setListener(sumContactsFragment.getViewModel().getCartridgeBusyList());
            }
        });
    }

    public final void setListener(List<String> targetAreaBusyList) {
        clearListeners();
        FragmentSumContactsBinding binding = getBinding();
        List<DataTargetArea> list = this.dataTargetAreaList;
        if (list != null) {
            View.OnDragListener onDragListenerInvoke = new DragAndDropListener(list, targetAreaBusyList, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setListener$1$1$1
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    String busyData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    DataTargetArea dataTargetArea = it.getDataTargetArea();
                    if (dataTargetArea != null && (busyData = dataTargetArea.getBusyData()) != null) {
                        SumContactsFragment sumContactsFragment = this.this$0;
                        sumContactsFragment.getViewModel().getCartridgeBusyList().remove(busyData);
                        sumContactsFragment.setListener(sumContactsFragment.getViewModel().getCartridgeBusyList());
                    }
                    this.this$0.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$setListener$1$1$2
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    String busyData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    DataTargetArea dataTargetArea = it.getDataTargetArea();
                    if (dataTargetArea != null && (busyData = dataTargetArea.getBusyData()) != null) {
                        SumContactsFragment sumContactsFragment = this.this$0;
                        if (!sumContactsFragment.getViewModel().getCartridgeBusyList().contains(busyData)) {
                            sumContactsFragment.getViewModel().getCartridgeBusyList().add(busyData);
                            sumContactsFragment.setListener(sumContactsFragment.getViewModel().getCartridgeBusyList());
                        }
                    }
                    this.this$0.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }).invoke();
            this.dragListener = onDragListenerInvoke;
            binding.mlSumContacts.setOnDragListener(onDragListenerInvoke);
        }
    }

    public final void createHandTranslateAnimation() {
        final FragmentSumContactsBinding binding = getBinding();
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        ViewExtensionKt.addViewObserver(ivSumContactsHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$createHandTranslateAnimation$1$1
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
                AppCompatImageView ivSumContactsCircleTwo = binding.ivSumContactsCircleTwo;
                Intrinsics.checkNotNullExpressionValue(ivSumContactsCircleTwo, "ivSumContactsCircleTwo");
                this.startHandTranslateAnimationOne(ViewExtensionKt.getGlobalCenterPoint(ivSumContactsCircleTwo));
            }
        });
    }

    public final void startHandTranslateAnimationOne(final PointFloat endPoint) {
        FragmentSumContactsBinding binding = getBinding();
        FrameLayout blockSumContactsBulbOne = binding.blockSumContactsBulbOne;
        Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbOne, "blockSumContactsBulbOne");
        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockSumContactsBulbOne);
        binding.ivSumContactsHand.setX(globalCenterPoint.getX() - (binding.ivSumContactsHand.getWidth() / 2));
        binding.ivSumContactsHand.setY(globalCenterPoint.getY() - (binding.ivSumContactsHand.getHeight() / 2));
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsHand);
        clearHandTranslateAnimation();
        this.animatorSet = new AnimatorSet();
        this.animatorX = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_X, globalCenterPoint2.getX(), endPoint.getX());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_Y, globalCenterPoint2.getY(), endPoint.getY());
        this.animatorY = objectAnimatorOfFloat;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.playTogether(this.animatorX, objectAnimatorOfFloat);
            animatorSet.setDuration(2000L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$startHandTranslateAnimationOne$1$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animation, boolean isReverse) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    super.onAnimationEnd(animation, isReverse);
                    if (this.this$0.getViewModel().getUiState().getValue().isHandTranslateAnimationShow()) {
                        this.this$0.startHandTranslateAnimationTwo(endPoint);
                    }
                }
            });
        } else {
            animatorSet = null;
        }
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public final void startHandTranslateAnimationTwo(final PointFloat endPoint) {
        FragmentSumContactsBinding binding = getBinding();
        FrameLayout blockSumContactsBulbTwo = binding.blockSumContactsBulbTwo;
        Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbTwo, "blockSumContactsBulbTwo");
        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockSumContactsBulbTwo);
        binding.ivSumContactsHand.setX(globalCenterPoint.getX() - (binding.ivSumContactsHand.getWidth() / 2));
        binding.ivSumContactsHand.setY(globalCenterPoint.getY() - (binding.ivSumContactsHand.getHeight() / 2));
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsHand);
        clearHandTranslateAnimation();
        this.animatorX = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_X, globalCenterPoint2.getX(), endPoint.getX());
        this.animatorY = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_Y, globalCenterPoint2.getY(), endPoint.getY());
        AnimatorSet animatorSet = new AnimatorSet();
        this.animatorSet = animatorSet;
        animatorSet.playTogether(this.animatorX, this.animatorY);
        animatorSet.setDuration(2000L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$startHandTranslateAnimationTwo$1$1$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation, boolean isReverse) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                if (this.this$0.getViewModel().getUiState().getValue().isHandTranslateAnimationShow()) {
                    this.this$0.startHandTranslateAnimationThree(endPoint);
                }
            }
        });
        animatorSet.start();
    }

    public final void startHandTranslateAnimationThree(final PointFloat endPoint) {
        FragmentSumContactsBinding binding = getBinding();
        FrameLayout blockSumContactsBulbThree = binding.blockSumContactsBulbThree;
        Intrinsics.checkNotNullExpressionValue(blockSumContactsBulbThree, "blockSumContactsBulbThree");
        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockSumContactsBulbThree);
        binding.ivSumContactsHand.setX(globalCenterPoint.getX() - (binding.ivSumContactsHand.getWidth() / 2));
        binding.ivSumContactsHand.setY(globalCenterPoint.getY() - (binding.ivSumContactsHand.getHeight() / 2));
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(ivSumContactsHand);
        clearHandTranslateAnimation();
        this.animatorX = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_X, globalCenterPoint2.getX(), endPoint.getX());
        this.animatorY = ObjectAnimator.ofFloat(binding.ivSumContactsHand, (Property<ImageView, Float>) View.TRANSLATION_Y, globalCenterPoint2.getY(), endPoint.getY());
        AnimatorSet animatorSet = new AnimatorSet();
        this.animatorSet = animatorSet;
        animatorSet.playTogether(this.animatorX, this.animatorY);
        animatorSet.setDuration(2000L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$startHandTranslateAnimationThree$1$1$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation, boolean isReverse) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                if (this.this$0.getViewModel().getUiState().getValue().isHandTranslateAnimationShow()) {
                    this.this$0.startHandTranslateAnimationOne(endPoint);
                }
            }
        });
        animatorSet.start();
    }

    private final void createHandRotateAnimation() {
        final FragmentSumContactsBinding binding = getBinding();
        ImageView ivSumContactsHand = binding.ivSumContactsHand;
        Intrinsics.checkNotNullExpressionValue(ivSumContactsHand, "ivSumContactsHand");
        ViewExtensionKt.addViewObserver(ivSumContactsHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$createHandRotateAnimation$1$1
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
                binding.ivSumContactsHand.clearAnimation();
                SumContactsFragment sumContactsFragment = this;
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -30.0f, binding.ivSumContactsHand.getX() + (binding.ivSumContactsHand.getWidth() / 2), binding.ivSumContactsHand.getY() + (binding.ivSumContactsHand.getHeight() / 2));
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setRepeatMode(2);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(700L);
                binding.ivSumContactsHand.startAnimation(rotateAnimation);
                sumContactsFragment.handRotateAnimation = rotateAnimation;
            }
        });
    }

    private final void clearHandTranslateAnimation() {
        ObjectAnimator objectAnimator = this.animatorX;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.animatorX = null;
        ObjectAnimator objectAnimator2 = this.animatorY;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.animatorY = null;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.animatorSet = null;
    }

    private final void clearHandRotateAnimation() {
        RotateAnimation rotateAnimation = this.handRotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.handRotateAnimation = null;
    }

    private final void clearListeners() {
        FragmentSumContactsBinding binding = getBinding();
        this.dragListener = null;
        binding.mlSumContacts.setOnDragListener(null);
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 6, isShow, false, false, false, null, false, false, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void clearTouch() {
        FragmentSumContactsBinding binding = getBinding();
        binding.tvSumContactsBulbOne.setOnTouchListener(null);
        binding.tvSumContactsBulbTwo.setOnTouchListener(null);
        binding.tvSumContactsBulbThree.setOnTouchListener(null);
    }

    private final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        GameInstructionsDialog gameInstructionsDialogCreate = companion.create(contextRequireContext, hintsList, new C39631(getViewModel()));
        gameInstructionsDialogCreate.show();
        this.gameInstructionsDialog = gameInstructionsDialogCreate;
    }

    /* compiled from: SumContactsFragment.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment$createGameInstructionsDialog$1 */

    public /* synthetic */ class C39631 extends FunctionReferenceImpl implements Function0<Unit> {
        public C39631(Object obj) {
            super(0, obj, SumContactsViewModel.class, "closeInstruction", "closeInstruction()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            ((SumContactsViewModel) this.receiver).closeInstruction();
        }
    }

    private final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }
}

