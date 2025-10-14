package com.blackhub.bronline.game.gui.electric.p013ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentFindProblemBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.draganddrop.DragAndDropListener;
import com.blackhub.bronline.game.core.utils.draganddrop.ViewTouchResultListener;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDataDragViewNative;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragAndDrop;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragView;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FindProblemFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFindProblemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/FindProblemFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,746:1\n106#2,15:747\n106#2,15:762\n41#3:777\n42#3:782\n41#3,2:783\n41#3,2:785\n41#3,2:787\n41#3,2:789\n41#3,2:791\n41#3,2:793\n41#3,2:795\n34#4:778\n34#4:779\n34#4:780\n34#4:781\n*S KotlinDebug\n*F\n+ 1 FindProblemFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/FindProblemFragment\n*L\n102#1:747,15\n105#1:762,15\n134#1:777\n134#1:782\n300#1:783,2\n459#1:785,2\n481#1:787,2\n573#1:789,2\n643#1:791,2\n667#1:793,2\n726#1:795,2\n141#1:778\n146#1:779\n151#1:780\n156#1:781\n*E\n"})
/* loaded from: classes3.dex */
public final class FindProblemFragment extends BaseFragmentWithState<FindProblemUiState, FindProblemViewModel, FragmentFindProblemBinding> implements ViewTouchResultListener {
    public static final int COUNT_FUSES = 4;
    public static final int COUNT_GAMES = 2;
    public static final float FUSE_CORRECT_HEIGHT = 4.0f;
    public static final float FUSE_CORRECT_HEIGHT_START = 1.35f;
    public static final float FUSE_CORRECT_WIDTH = 1.5f;
    public static final float FUSE_CORRECT_WIDTH_START = 1.15f;
    public static final float FUSE_DEGREE = 45.0f;
    public static final float FUSE_HORIZONTAL_DEGREE = 90.0f;
    public static final float FUSE_VERTICAL_DEGREE = 0.0f;
    public static final long HAND_TRANSLATE_DURATION = 2000;
    public static final int POSITION_ONE = 1;
    public static final int POSITION_THREE = 3;
    public static final int POSITION_TWO = 2;
    public static final int POSITION_ZERO = 0;
    public static final float PROBE_BLACK_ROTATE = 230.0f;
    public static final float PROBE_RED_ROTATE = 130.0f;
    public static final float PROBE_SCALE = 0.6f;

    @Nullable
    public List<DataTargetArea> dataTargetAreaList;

    @Nullable
    public View.OnDragListener dragListener;

    @Inject
    public MainViewModelFactory<FindProblemViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public RotateAnimation handRotateAnimation;

    @Nullable
    public TranslateAnimation handTranslateAnimation;

    @NotNull
    public final List<View> listElementTwoInContainer;

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

    public FindProblemFragment() {
        super(R.layout.fragment_find_problem);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FindProblemFragment findProblemFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(findProblemFragment, findProblemFragment.getFactory()).get(FindProblemViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FindProblemViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function0);
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$parentViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$6
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
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ElectricViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function03;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$screenArgs$2
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
        this.listElementTwoInContainer = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @NotNull
    public final MainViewModelFactory<FindProblemViewModel> getFactory() {
        MainViewModelFactory<FindProblemViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<FindProblemViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public FindProblemViewModel getViewModel() {
        return (FindProblemViewModel) this.viewModel.getValue();
    }

    private final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initBinding(@NotNull FragmentFindProblemBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.initBinding((FindProblemFragment) binding);
        binding.cvFindProblemView.setTouchResultListener(this);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @SuppressLint({"ClickableViewAccessibility"})
    public void initViews() throws Resources.NotFoundException {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            FindProblemViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2, getParentViewModel().getUiState().getValue().getLevelCounter());
        }
        if (getParentViewModel().getUiState().getValue().getLevelCounter() == 1) {
            getParentViewModel().sendStartMiniGame();
        }
        FragmentFindProblemBinding binding = getBinding();
        if (getViewModel().getRandomOhmForTargetList().size() < 3) {
            binding.blockFindProblemElementTwo.removeViewInLayout(binding.ivFindProblemElementTwoFour);
        }
        if (getViewModel().getRandomOhmForTargetList().size() < 2) {
            binding.blockFindProblemElementTwo.removeViewInLayout(binding.ivFindProblemElementTwoThree);
        }
        FrameLayout blockFindProblemElementTwo = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoOne = binding.ivFindProblemElementTwoOne;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne, "ivFindProblemElementTwoOne");
        if (blockFindProblemElementTwo.indexOfChild(ivFindProblemElementTwoOne) != -1) {
            List<View> list = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoOne2 = binding.ivFindProblemElementTwoOne;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne2, "ivFindProblemElementTwoOne");
            list.add(ivFindProblemElementTwoOne2);
        }
        FrameLayout blockFindProblemElementTwo2 = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo2, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoTwo = binding.ivFindProblemElementTwoTwo;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo, "ivFindProblemElementTwoTwo");
        if (blockFindProblemElementTwo2.indexOfChild(ivFindProblemElementTwoTwo) != -1) {
            List<View> list2 = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoTwo2 = binding.ivFindProblemElementTwoTwo;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo2, "ivFindProblemElementTwoTwo");
            list2.add(ivFindProblemElementTwoTwo2);
        }
        FrameLayout blockFindProblemElementTwo3 = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo3, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoThree = binding.ivFindProblemElementTwoThree;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree, "ivFindProblemElementTwoThree");
        if (blockFindProblemElementTwo3.indexOfChild(ivFindProblemElementTwoThree) != -1) {
            List<View> list3 = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoThree2 = binding.ivFindProblemElementTwoThree;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree2, "ivFindProblemElementTwoThree");
            list3.add(ivFindProblemElementTwoThree2);
        }
        FrameLayout blockFindProblemElementTwo4 = binding.blockFindProblemElementTwo;
        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo4, "blockFindProblemElementTwo");
        AppCompatImageView ivFindProblemElementTwoFour = binding.ivFindProblemElementTwoFour;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour, "ivFindProblemElementTwoFour");
        if (blockFindProblemElementTwo4.indexOfChild(ivFindProblemElementTwoFour) != -1) {
            List<View> list4 = this.listElementTwoInContainer;
            AppCompatImageView ivFindProblemElementTwoFour2 = binding.ivFindProblemElementTwoFour;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour2, "ivFindProblemElementTwoFour");
            list4.add(ivFindProblemElementTwoFour2);
        }
        AppCompatImageView ivFindProblemElementTwoOne3 = binding.ivFindProblemElementTwoOne;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne3, "ivFindProblemElementTwoOne");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoOne3, null, 1, null);
        AppCompatImageView ivFindProblemElementTwoTwo3 = binding.ivFindProblemElementTwoTwo;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo3, "ivFindProblemElementTwoTwo");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoTwo3, null, 1, null);
        AppCompatImageView ivFindProblemElementTwoThree3 = binding.ivFindProblemElementTwoThree;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree3, "ivFindProblemElementTwoThree");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoThree3, null, 1, null);
        AppCompatImageView ivFindProblemElementTwoFour3 = binding.ivFindProblemElementTwoFour;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour3, "ivFindProblemElementTwoFour");
        ViewExtensionKt.setDragAndDrop$default(ivFindProblemElementTwoFour3, null, 1, null);
        AppCompatImageView ivFindProblemProbeRed = binding.ivFindProblemProbeRed;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemProbeRed, "ivFindProblemProbeRed");
        ViewExtensionKt.setDragAndDrop(ivFindProblemProbeRed, new DataDragAndDrop(0.6f, 130.0f, 0, 4, null));
        AppCompatImageView ivFindProblemProbeBlack = binding.ivFindProblemProbeBlack;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemProbeBlack, "ivFindProblemProbeBlack");
        ViewExtensionKt.setDragAndDrop(ivFindProblemProbeBlack, new DataDragAndDrop(0.6f, 230.0f, 0, 4, null));
        setObserver();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @SuppressLint({"ClickableViewAccessibility"})
    public void handleUiState(@NotNull FindProblemUiState uiState) {
        String strEmpty;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        blockingLoader(uiState.isBlockingLoading());
        FragmentFindProblemBinding binding = getBinding();
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        if (uiState.getProbeBlackOnTarget()) {
            binding.ivFindProblemProbeBlack.setOnTouchListener(null);
        }
        if (uiState.isNextGame()) {
            selectNextGame();
        }
        TextView textView = binding.tvFindProblemTargetOhm;
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) getViewModel().getRandomOhmForTargetList());
        if (str == null || (strEmpty = getString(R.string.electric_target_ohm, str)) == null) {
            strEmpty = AnyExtensionKt.empty(binding);
        }
        textView.setText(strEmpty);
        binding.cvFindProblemView.setFuseGrayOneVisible(uiState.isFuseGrayOneVisible());
        binding.cvFindProblemView.setFuseGrayTwoVisible(uiState.isFuseGrayTwoVisible());
        binding.cvFindProblemView.setFuseGrayThreeVisible(uiState.isFuseGrayThreeVisible());
        binding.cvFindProblemView.setFuseGrayFourVisible(uiState.isFuseGrayFourVisible());
        binding.cvFindProblemView.setFuseRedOneVisible(uiState.isFuseRedOneVisible());
        binding.cvFindProblemView.setFuseRedTwoVisible(uiState.isFuseRedTwoVisible());
        binding.cvFindProblemView.setFuseRedThreeVisible(uiState.isFuseRedThreeVisible());
        binding.cvFindProblemView.setFuseRedFourVisible(uiState.isFuseRedFourVisible());
        if (!uiState.isFuseGrayOneVisible() && !uiState.isFuseFillOne()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_ONE);
            setListener(getViewModel().getFuseBusyList());
        }
        if (!uiState.isFuseGrayTwoVisible() && !uiState.isFuseFillTwo()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_TWO);
            setListener(getViewModel().getFuseBusyList());
        }
        if (!uiState.isFuseGrayThreeVisible() && !uiState.isFuseFillThree()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_THREE);
            setListener(getViewModel().getFuseBusyList());
        }
        if (!uiState.isFuseGrayFourVisible() && !uiState.isFuseFillFour()) {
            getViewModel().getFuseBusyList().remove(ElectricConstants.FUSE_BUSY_FOUR);
            setListener(getViewModel().getFuseBusyList());
        }
        if (getViewModel().getFuseBusyList().size() == 4 && getViewModel().getRandomOhmForTargetList().size() == 0) {
            getViewModel().setWin(true);
        } else {
            getViewModel().setWin(false);
        }
        setHandStartCoordinate(uiState.getCountHint());
        if (uiState.isHandRotateAnimationShow()) {
            createHandRotateAnimation();
        } else {
            clearHandRotateAnimation();
        }
        if (uiState.isHandTranslateAnimationOneShow()) {
            ImageView ivFindProblemVoltagePointBlack = binding.ivFindProblemVoltagePointBlack;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointBlack, "ivFindProblemVoltagePointBlack");
            createHandTranslateAnimation(ivFindProblemVoltagePointBlack);
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandTranslateAnimationTwoShow()) {
            ImageView ivFindProblemVoltagePointRedOne = binding.ivFindProblemVoltagePointRedOne;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedOne, "ivFindProblemVoltagePointRedOne");
            createHandTranslateAnimation(ivFindProblemVoltagePointRedOne);
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandTranslateAnimationThreeShow()) {
            ImageView ivFindProblemFuseGrayOne = binding.ivFindProblemFuseGrayOne;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemFuseGrayOne, "ivFindProblemFuseGrayOne");
            createHandTranslateAnimation(ivFindProblemFuseGrayOne);
        } else {
            clearHandTranslateAnimation();
        }
        if (uiState.isHandTranslateAnimationFourShow()) {
            ImageView ivFindProblemVoltagePointRedThree = binding.ivFindProblemVoltagePointRedThree;
            Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedThree, "ivFindProblemVoltagePointRedThree");
            createHandTranslateAnimation(ivFindProblemVoltagePointRedThree);
        }
        if (getViewModel().getRandomOhmForTargetList().isEmpty()) {
            getViewModel().setHintEight();
        }
        binding.cvFindProblemView.invalidate();
    }

    @Override // com.blackhub.bronline.game.core.utils.draganddrop.ViewTouchResultListener
    public void onTouchResult(@NotNull CurrentTargetArea currentTargetArea) {
        Intrinsics.checkNotNullParameter(currentTargetArea, "currentTargetArea");
        getViewModel().setFuseGrayInvisible(currentTargetArea);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissGameInstructionsDialog();
        clearListeners();
        clearHandTranslateAnimation();
        clearHandRotateAnimation();
        super.onDestroyView();
    }

    public final void setObserver() throws Resources.NotFoundException {
        final float dimension = getResources().getDimension(R.dimen._30sdp);
        final FragmentFindProblemBinding binding = getBinding();
        ConstraintLayout mlFindProblem = binding.mlFindProblem;
        Intrinsics.checkNotNullExpressionValue(mlFindProblem, "mlFindProblem");
        ViewExtensionKt.addViewObserver(mlFindProblem, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setObserver$1$1
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
                AppCompatImageView ivFindProblemElementTwoOne = binding.ivFindProblemElementTwoOne;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoOne, "ivFindProblemElementTwoOne");
                CurrentDraggableItem currentDraggableItem = CurrentDraggableItem.ELEMENT_TWO;
                FrameLayout blockFindProblemElementTwo = binding.blockFindProblemElementTwo;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo, "blockFindProblemElementTwo");
                DataDragView dataDragView = new DataDragView(ivFindProblemElementTwoOne, currentDraggableItem, blockFindProblemElementTwo, new DataDragAndDrop(0.0f, 45.0f, 0, 5, null), null, new DataDataDragViewNative(0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 15, null), true, 16, null);
                AppCompatImageView ivFindProblemElementTwoTwo = binding.ivFindProblemElementTwoTwo;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoTwo, "ivFindProblemElementTwoTwo");
                FrameLayout blockFindProblemElementTwo2 = binding.blockFindProblemElementTwo;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo2, "blockFindProblemElementTwo");
                DataDragView dataDragView2 = new DataDragView(ivFindProblemElementTwoTwo, currentDraggableItem, blockFindProblemElementTwo2, new DataDragAndDrop(0.0f, 45.0f, 0, 5, null), null, new DataDataDragViewNative(0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 15, null), true, 16, null);
                AppCompatImageView ivFindProblemElementTwoThree = binding.ivFindProblemElementTwoThree;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoThree, "ivFindProblemElementTwoThree");
                FrameLayout blockFindProblemElementTwo3 = binding.blockFindProblemElementTwo;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo3, "blockFindProblemElementTwo");
                DataDragView dataDragView3 = new DataDragView(ivFindProblemElementTwoThree, currentDraggableItem, blockFindProblemElementTwo3, new DataDragAndDrop(0.0f, 45.0f, 0, 5, null), null, new DataDataDragViewNative(0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 15, null), true, 16, null);
                AppCompatImageView ivFindProblemElementTwoFour = binding.ivFindProblemElementTwoFour;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemElementTwoFour, "ivFindProblemElementTwoFour");
                FrameLayout blockFindProblemElementTwo4 = binding.blockFindProblemElementTwo;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo4, "blockFindProblemElementTwo");
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new DataDragView[]{dataDragView, dataDragView2, dataDragView3, new DataDragView(ivFindProblemElementTwoFour, currentDraggableItem, blockFindProblemElementTwo4, new DataDragAndDrop(0.0f, 45.0f, 0, 5, null), null, new DataDataDragViewNative(0.0f, 0.0f, 0.0f, 0.0f, 45.0f, 15, null), true, 16, null)});
                AppCompatImageView ivFindProblemProbeRed = binding.ivFindProblemProbeRed;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemProbeRed, "ivFindProblemProbeRed");
                CurrentDraggableItem currentDraggableItem2 = CurrentDraggableItem.PROBE_RED;
                FrameLayout blockFindProblemProbeRed = binding.blockFindProblemProbeRed;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeRed, "blockFindProblemProbeRed");
                DataDragAndDrop dataDragAndDrop = new DataDragAndDrop(0.6f, 130.0f, 0, 4, null);
                PointViewListenerEnum pointViewListenerEnum = PointViewListenerEnum.TOP_CENTER;
                List listListOf2 = CollectionsKt__CollectionsJVMKt.listOf(new DataDragView(ivFindProblemProbeRed, currentDraggableItem2, blockFindProblemProbeRed, dataDragAndDrop, pointViewListenerEnum, null, false, 96, null));
                AppCompatImageView ivFindProblemProbeBlack = binding.ivFindProblemProbeBlack;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemProbeBlack, "ivFindProblemProbeBlack");
                CurrentDraggableItem currentDraggableItem3 = CurrentDraggableItem.PROBE_BLACK;
                FrameLayout blockFindProblemProbeBlack = binding.blockFindProblemProbeBlack;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeBlack, "blockFindProblemProbeBlack");
                List listListOf3 = CollectionsKt__CollectionsJVMKt.listOf(new DataDragView(ivFindProblemProbeBlack, currentDraggableItem3, blockFindProblemProbeBlack, new DataDragAndDrop(0.6f, 230.0f, 0, 4, null), pointViewListenerEnum, null, true, 32, null));
                FindProblemFragment findProblemFragment = this;
                DataTargetArea dataTargetArea = new DataTargetArea(CurrentTargetArea.TARGET_AREA_ONE, (String) CollectionsKt___CollectionsKt.getOrNull(this.getViewModel().getRandomOhmForPointList(), 0), null, new PointFloat(binding.cvFindProblemView.getGlobalVoltagePointOneCenter().getX(), binding.cvFindProblemView.getGlobalVoltagePointOneCenter().getY()), dimension, null, listListOf2, 36, null);
                DataTargetArea dataTargetArea2 = new DataTargetArea(CurrentTargetArea.TARGET_AREA_TWO, (String) CollectionsKt___CollectionsKt.getOrNull(this.getViewModel().getRandomOhmForPointList(), 1), null, new PointFloat(binding.cvFindProblemView.getGlobalVoltagePointFourCenter().getX(), binding.cvFindProblemView.getGlobalVoltagePointFourCenter().getY()), dimension, null, listListOf2, 36, null);
                DataTargetArea dataTargetArea3 = new DataTargetArea(CurrentTargetArea.TARGET_AREA_THREE, (String) CollectionsKt___CollectionsKt.getOrNull(this.getViewModel().getRandomOhmForPointList(), 2), null, new PointFloat(binding.cvFindProblemView.getGlobalVoltagePointFiveCenter().getX(), binding.cvFindProblemView.getGlobalVoltagePointFiveCenter().getY()), dimension, null, listListOf2, 36, null);
                DataTargetArea dataTargetArea4 = new DataTargetArea(CurrentTargetArea.TARGET_AREA_FOUR, (String) CollectionsKt___CollectionsKt.getOrNull(this.getViewModel().getRandomOhmForPointList(), 3), null, new PointFloat(binding.cvFindProblemView.getGlobalVoltagePointSevenCenter().getX(), binding.cvFindProblemView.getGlobalVoltagePointSevenCenter().getY()), dimension, null, listListOf2, 36, null);
                DataTargetArea dataTargetArea5 = new DataTargetArea(CurrentTargetArea.TARGET_AREA_FIVE, null, null, new PointFloat(binding.cvFindProblemView.getGlobalVoltagePointTwoCenter().getX(), binding.cvFindProblemView.getGlobalVoltagePointTwoCenter().getY()), dimension, null, listListOf3, 38, null);
                CurrentTargetArea currentTargetArea = CurrentTargetArea.TARGET_AREA_FUSE_ONE;
                PointFloat pointFloat = new PointFloat(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() / 1.5f), binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 4.0f));
                Float fValueOf = Float.valueOf(0.0f);
                DataTargetArea dataTargetArea6 = new DataTargetArea(currentTargetArea, null, ElectricConstants.FUSE_BUSY_ONE, pointFloat, 0.0f, fValueOf, listListOf, 18, null);
                CurrentTargetArea currentTargetArea2 = CurrentTargetArea.TARGET_AREA_FUSE_TWO;
                PointFloat pointFloat2 = new PointFloat(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() / 1.5f), binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 4.0f));
                Float fValueOf2 = Float.valueOf(90.0f);
                findProblemFragment.dataTargetAreaList = CollectionsKt__CollectionsKt.mutableListOf(dataTargetArea, dataTargetArea2, dataTargetArea3, dataTargetArea4, dataTargetArea5, dataTargetArea6, new DataTargetArea(currentTargetArea2, null, ElectricConstants.FUSE_BUSY_TWO, pointFloat2, 0.0f, fValueOf2, listListOf, 18, null), new DataTargetArea(CurrentTargetArea.TARGET_AREA_FUSE_THREE, null, ElectricConstants.FUSE_BUSY_THREE, new PointFloat(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() / 1.5f), binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 4.0f)), 0.0f, fValueOf, listListOf, 18, null), new DataTargetArea(CurrentTargetArea.TARGET_AREA_FUSE_FOUR, null, ElectricConstants.FUSE_BUSY_FOUR, new PointFloat(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() / 1.5f), binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 4.0f)), 0.0f, fValueOf2, listListOf, 18, null));
                FindProblemFragment findProblemFragment2 = this;
                findProblemFragment2.setListener(findProblemFragment2.getViewModel().getFuseBusyList());
                this.setFakeImageViewForHint();
            }
        });
    }

    public final void setListener(List<String> targetAreaBusyList) {
        clearListeners();
        FragmentFindProblemBinding binding = getBinding();
        List<DataTargetArea> list = this.dataTargetAreaList;
        if (list != null) {
            View.OnDragListener onDragListenerInvoke = new DragAndDropListener(list, targetAreaBusyList, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setListener$1$1$1
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.getViewModel().isTargetOnArea(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setListener$1$1$2
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    String busyData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    DataTargetArea dataTargetArea = it.getDataTargetArea();
                    if (dataTargetArea != null && (busyData = dataTargetArea.getBusyData()) != null) {
                        FindProblemFragment findProblemFragment = this.this$0;
                        if (!findProblemFragment.getViewModel().getFuseBusyList().contains(busyData)) {
                            findProblemFragment.getViewModel().getFuseBusyList().add(busyData);
                            findProblemFragment.setListener(findProblemFragment.getViewModel().getFuseBusyList());
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
            binding.mlFindProblem.setOnDragListener(onDragListenerInvoke);
        }
    }

    public final void setFakeImageViewForHint() {
        FragmentFindProblemBinding binding = getBinding();
        binding.ivFindProblemVoltagePointBlack.setX(binding.cvFindProblemView.getGlobalVoltagePointTwoCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointBlack.setY(binding.cvFindProblemView.getGlobalVoltagePointTwoCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedOne.setX(binding.cvFindProblemView.getGlobalVoltagePointOneCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedOne.setY(binding.cvFindProblemView.getGlobalVoltagePointOneCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedTwo.setX(binding.cvFindProblemView.getGlobalVoltagePointFourCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedTwo.setY(binding.cvFindProblemView.getGlobalVoltagePointFourCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedThree.setX(binding.cvFindProblemView.getGlobalVoltagePointFiveCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedThree.setY(binding.cvFindProblemView.getGlobalVoltagePointFiveCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemVoltagePointRedFour.setX(binding.cvFindProblemView.getGlobalVoltagePointSevenCenter().getX() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getWidth() / 2));
        binding.ivFindProblemVoltagePointRedFour.setY(binding.cvFindProblemView.getGlobalVoltagePointSevenCenter().getY() - (binding.cvFindProblemView.getVoltagePointRedBitmap().getHeight() / 2));
        binding.ivFindProblemFuseRedOne.setX(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedOne.setY(binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayOne.setX(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayOne.setY(binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackOne.setX(binding.cvFindProblemView.getGlobalFusePointOne().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackOne.setY(binding.cvFindProblemView.getGlobalFusePointOne().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseRedTwo.setX(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedTwo.setY(binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayTwo.setX(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayTwo.setY(binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackTwo.setX(binding.cvFindProblemView.getGlobalFusePointTwo().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackTwo.setY(binding.cvFindProblemView.getGlobalFusePointTwo().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseRedThree.setX(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedThree.setY(binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayThree.setX(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayThree.setY(binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackThree.setX(binding.cvFindProblemView.getGlobalFusePointThree().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackThree.setY(binding.cvFindProblemView.getGlobalFusePointThree().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseRedFour.setX(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseRedBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseRedFour.setY(binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseRedBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseGrayFour.setX(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseGrayBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseGrayFour.setY(binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseGrayBitmap().getHeight() / 1.35f));
        binding.ivFindProblemFuseBlackFour.setX(binding.cvFindProblemView.getGlobalFusePointFour().getX() - (binding.cvFindProblemView.getFuseBlackBitmap().getWidth() * 1.15f));
        binding.ivFindProblemFuseBlackFour.setY(binding.cvFindProblemView.getGlobalFusePointFour().getY() - (binding.cvFindProblemView.getFuseBlackBitmap().getHeight() / 1.35f));
    }

    public final void setHandStartCoordinate(int countHint) {
        final FragmentFindProblemBinding binding = getBinding();
        switch (countHint) {
            case 1:
                FrameLayout blockFindProblemElementThree = binding.blockFindProblemElementThree;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementThree, "blockFindProblemElementThree");
                ViewExtensionKt.addViewObserver(blockFindProblemElementThree, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$1
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
                        FrameLayout blockFindProblemElementThree2 = binding.blockFindProblemElementThree;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementThree2, "blockFindProblemElementThree");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemElementThree2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX());
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 2:
                FrameLayout blockFindProblemProbeBlack = binding.blockFindProblemProbeBlack;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeBlack, "blockFindProblemProbeBlack");
                ViewExtensionKt.addViewObserver(blockFindProblemProbeBlack, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$2
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
                        FrameLayout blockFindProblemProbeBlack2 = binding.blockFindProblemProbeBlack;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeBlack2, "blockFindProblemProbeBlack");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemProbeBlack2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX() - (binding.blockFindProblemProbeBlack.getWidth() / 2));
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY() - (binding.blockFindProblemProbeBlack.getHeight() / 4));
                    }
                });
                break;
            case 3:
                FrameLayout blockFindProblemProbeRed = binding.blockFindProblemProbeRed;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeRed, "blockFindProblemProbeRed");
                ViewExtensionKt.addViewObserver(blockFindProblemProbeRed, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$3
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
                        FrameLayout blockFindProblemProbeRed2 = binding.blockFindProblemProbeRed;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemProbeRed2, "blockFindProblemProbeRed");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemProbeRed2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX() - (binding.blockFindProblemProbeRed.getWidth() / 2));
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY() - (binding.blockFindProblemProbeRed.getHeight() / 4));
                    }
                });
                break;
            case 5:
                ImageView ivFindProblemFuseGrayOne = binding.ivFindProblemFuseGrayOne;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemFuseGrayOne, "ivFindProblemFuseGrayOne");
                ViewExtensionKt.addViewObserver(ivFindProblemFuseGrayOne, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$4
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
                        ImageView ivFindProblemFuseGrayOne2 = binding.ivFindProblemFuseGrayOne;
                        Intrinsics.checkNotNullExpressionValue(ivFindProblemFuseGrayOne2, "ivFindProblemFuseGrayOne");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivFindProblemFuseGrayOne2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX());
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 6:
                FrameLayout blockFindProblemElementTwo = binding.blockFindProblemElementTwo;
                Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo, "blockFindProblemElementTwo");
                ViewExtensionKt.addViewObserver(blockFindProblemElementTwo, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$5
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
                        FrameLayout blockFindProblemElementTwo2 = binding.blockFindProblemElementTwo;
                        Intrinsics.checkNotNullExpressionValue(blockFindProblemElementTwo2, "blockFindProblemElementTwo");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(blockFindProblemElementTwo2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX() - (binding.blockFindProblemElementTwo.getWidth() / 2));
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 7:
                ImageView ivFindProblemVoltagePointRedOne = binding.ivFindProblemVoltagePointRedOne;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedOne, "ivFindProblemVoltagePointRedOne");
                ViewExtensionKt.addViewObserver(ivFindProblemVoltagePointRedOne, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$6
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
                        ImageView ivFindProblemVoltagePointRedOne2 = binding.ivFindProblemVoltagePointRedOne;
                        Intrinsics.checkNotNullExpressionValue(ivFindProblemVoltagePointRedOne2, "ivFindProblemVoltagePointRedOne");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivFindProblemVoltagePointRedOne2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX() - (binding.ivFindProblemVoltagePointRedOne.getWidth() / 2));
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY());
                    }
                });
                break;
            case 8:
                AppCompatButton btnFindProblemNext = binding.btnFindProblemNext;
                Intrinsics.checkNotNullExpressionValue(btnFindProblemNext, "btnFindProblemNext");
                ViewExtensionKt.addViewObserver(btnFindProblemNext, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$setHandStartCoordinate$1$7
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
                        AppCompatButton btnFindProblemNext2 = binding.btnFindProblemNext;
                        Intrinsics.checkNotNullExpressionValue(btnFindProblemNext2, "btnFindProblemNext");
                        PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(btnFindProblemNext2);
                        binding.ivFindProblemHand.setX(globalCenterPoint.getX() + (binding.btnFindProblemNext.getWidth() / 3));
                        binding.ivFindProblemHand.setY(globalCenterPoint.getY() - (binding.btnFindProblemNext.getHeight() / 3));
                    }
                });
                break;
        }
    }

    public final void createHandTranslateAnimation(final ImageView endView) {
        final FragmentFindProblemBinding binding = getBinding();
        ImageView ivFindProblemHand = binding.ivFindProblemHand;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemHand, "ivFindProblemHand");
        ViewExtensionKt.addViewObserver(ivFindProblemHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$createHandTranslateAnimation$1$1
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
                ImageView ivFindProblemHand2 = binding.ivFindProblemHand;
                Intrinsics.checkNotNullExpressionValue(ivFindProblemHand2, "ivFindProblemHand");
                PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(ivFindProblemHand2);
                PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(endView);
                ImageView imageView = binding.ivFindProblemHand;
                FindProblemFragment findProblemFragment = this;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (globalCenterPoint2.getX() - globalCenterPoint.getX()) + (endView.getWidth() / 2), 0.0f, (globalCenterPoint2.getY() - globalCenterPoint.getY()) + (imageView.getHeight() / 2));
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setRepeatMode(1);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setDuration(2000L);
                imageView.startAnimation(translateAnimation);
                findProblemFragment.handTranslateAnimation = translateAnimation;
            }
        });
    }

    public final void createHandRotateAnimation() {
        final FragmentFindProblemBinding binding = getBinding();
        ImageView ivFindProblemHand = binding.ivFindProblemHand;
        Intrinsics.checkNotNullExpressionValue(ivFindProblemHand, "ivFindProblemHand");
        ViewExtensionKt.addViewObserver(ivFindProblemHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$createHandRotateAnimation$1$1
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
                FindProblemFragment findProblemFragment = this.this$0;
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -30.0f, binding.ivFindProblemHand.getX() + (binding.ivFindProblemHand.getWidth() / 2), binding.ivFindProblemHand.getY() + (binding.ivFindProblemHand.getHeight() / 2));
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setRepeatMode(2);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(700L);
                binding.ivFindProblemHand.startAnimation(rotateAnimation);
                findProblemFragment.handRotateAnimation = rotateAnimation;
            }
        });
    }

    public final void selectNextGame() {
        getParentViewModel().setLevelCounter(getViewModel().getUiState().getValue().isWin());
        if (getParentViewModel().getUiState().getValue().getLevelCounter() <= 2) {
            replaceFragment(FindProblemFragment.class);
        } else {
            replaceFragment(ChangeBulbFragment.class);
        }
    }

    private final void replaceFragment(Class<? extends Fragment> cls) {
        requireParentFragment().getChildFragmentManager().beginTransaction().replace(getId(), cls, BundleKt.bundleOf(TuplesKt.m7112to(ElectricConstants.ELECTRIC_BUNDLE, getViewModel().getUiState().getValue().getScreenArgs()))).commit();
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 4, isShow, false, false, false, null, false, false, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, null);
    }

    private final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        GameInstructionsDialog gameInstructionsDialogCreate = companion.create(contextRequireContext, hintsList, new C39571(getViewModel()));
        gameInstructionsDialogCreate.show();
        this.gameInstructionsDialog = gameInstructionsDialogCreate;
    }

    /* compiled from: FindProblemFragment.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.FindProblemFragment$createGameInstructionsDialog$1 */
    
    public /* synthetic */ class C39571 extends FunctionReferenceImpl implements Function0<Unit> {
        public C39571(Object obj) {
            super(0, obj, FindProblemViewModel.class, "closeInstruction", "closeInstruction()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            ((FindProblemViewModel) this.receiver).closeInstruction();
        }
    }

    private final void clearListeners() {
        FragmentFindProblemBinding binding = getBinding();
        this.dragListener = null;
        binding.mlFindProblem.setOnDragListener(null);
    }

    public final void clearHandTranslateAnimation() {
        TranslateAnimation translateAnimation = this.handTranslateAnimation;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        this.handTranslateAnimation = null;
    }

    public final void clearHandRotateAnimation() {
        RotateAnimation rotateAnimation = this.handRotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.handRotateAnimation = null;
    }

    private final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }
}

