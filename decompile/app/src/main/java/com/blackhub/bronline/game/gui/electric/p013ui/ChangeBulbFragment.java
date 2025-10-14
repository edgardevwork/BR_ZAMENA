package com.blackhub.bronline.game.gui.electric.p013ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
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
import com.blackhub.bronline.databinding.FragmentChangeBulbBinding;
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
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.blackhub.bronline.game.gui.electric.view.CircleView;
import com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
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
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeBulbFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020!H\u0016J\u0016\u0010)\u001a\u00020!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0002J\b\u0010+\u001a\u00020!H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/ui/ChangeBulbFragment;", "Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "Lcom/blackhub/bronline/game/gui/electric/state/ChangeBulbUiState;", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel;", "Lcom/blackhub/bronline/databinding/FragmentChangeBulbBinding;", "()V", "dataTargetAreaForElementOneList", "", "Lcom/blackhub/bronline/game/core/utils/draganddrop/model/DataTargetArea;", "dragListener", "Landroid/view/View$OnDragListener;", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "parentViewModel", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "getParentViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "screenArgs", "", "getScreenArgs", "()Ljava/lang/String;", "screenArgs$delegate", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel;", "viewModel$delegate", "clearListeners", "", "handleUiState", "uiState", "initViews", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "setListener", "targetAreaBusyList", "startAnimationGlasses", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChangeBulbFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/ChangeBulbFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,148:1\n106#2,15:149\n106#2,15:164\n41#3,2:179\n41#3,2:181\n41#3,2:183\n41#3,2:185\n41#3,2:187\n*S KotlinDebug\n*F\n+ 1 ChangeBulbFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/ChangeBulbFragment\n*L\n48#1:149,15\n51#1:164,15\n65#1:179,2\n98#1:181,2\n116#1:183,2\n134#1:185,2\n141#1:187,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ChangeBulbFragment extends BaseFragmentWithState<ChangeBulbUiState, ChangeBulbViewModel, FragmentChangeBulbBinding> {
    public static final float BULB_SCALE = 3.0f;

    @Nullable
    public List<DataTargetArea> dataTargetAreaForElementOneList;

    @Nullable
    public View.OnDragListener dragListener;

    @Inject
    public MainViewModelFactory<ChangeBulbViewModel> factory;

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

    public ChangeBulbFragment() {
        super(R.layout.fragment_change_bulb);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ChangeBulbFragment changeBulbFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(changeBulbFragment, changeBulbFragment.getFactory()).get(ChangeBulbViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChangeBulbViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$parentViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$6
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
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ElectricViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$special$$inlined$viewModels$default$9
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
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$screenArgs$2
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
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @NotNull
    public final MainViewModelFactory<ChangeBulbViewModel> getFactory() {
        MainViewModelFactory<ChangeBulbViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<ChangeBulbViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public ChangeBulbViewModel getViewModel() {
        return (ChangeBulbViewModel) this.viewModel.getValue();
    }

    public final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    public final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            ChangeBulbViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2);
        }
        final FragmentChangeBulbBinding binding = getBinding();
        AppCompatImageView ivChangeBulbElementOne = binding.ivChangeBulbElementOne;
        Intrinsics.checkNotNullExpressionValue(ivChangeBulbElementOne, "ivChangeBulbElementOne");
        ViewExtensionKt.setDragAndDrop(ivChangeBulbElementOne, new DataDragAndDrop(3.0f, 0.0f, 0, 6, null));
        ConstraintLayout constraintLayout = binding.constraintLayout;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "constraintLayout");
        ViewExtensionKt.addViewObserver(constraintLayout, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$initViews$1$1
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
                FragmentChangeBulbBinding fragmentChangeBulbBinding = binding;
                AppCompatImageView appCompatImageView = fragmentChangeBulbBinding.ivChangeBulbElementOne;
                FrameLayout frameLayout = fragmentChangeBulbBinding.blockChangeBulbElementOne;
                CurrentDraggableItem currentDraggableItem = CurrentDraggableItem.ELEMENT_ONE;
                DataDragAndDrop dataDragAndDrop = new DataDragAndDrop(3.0f, 0.0f, 0, 6, null);
                Intrinsics.checkNotNull(appCompatImageView);
                Intrinsics.checkNotNull(frameLayout);
                this.dataTargetAreaForElementOneList = CollectionsKt__CollectionsKt.mutableListOf(new DataTargetArea(CurrentTargetArea.TARGET_AREA_GLASS_SMALL, null, ElectricConstants.BULB_BUSY, new PointFloat(binding.cvChangeBulbGlassSmall.getX() + (binding.cvChangeBulbGlassSmall.getWidth() / 2), binding.cvChangeBulbGlassSmall.getY() + (binding.cvChangeBulbGlassSmall.getHeight() / 2)), 0.0f, null, CollectionsKt__CollectionsJVMKt.listOf(new DataDragView(appCompatImageView, currentDraggableItem, frameLayout, dataDragAndDrop, null, null, false, 112, null)), 50, null));
                ChangeBulbFragment changeBulbFragment = this;
                changeBulbFragment.setListener(changeBulbFragment.getViewModel().getBulbBusyList());
            }
        });
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull ChangeBulbUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Boolean boolIsWin = uiState.isWin();
        if (boolIsWin != null) {
            boolean zBooleanValue = boolIsWin.booleanValue();
            getBinding().ivChangeBulbBulbBroke.setOnClickListener(null);
            if (zBooleanValue) {
                startAnimationGlasses();
            } else {
                getParentViewModel().sendFinishMiniGame(false);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        clearListeners();
        super.onDestroyView();
    }

    public final void setListener(List<String> targetAreaBusyList) {
        clearListeners();
        final FragmentChangeBulbBinding binding = getBinding();
        List<DataTargetArea> list = this.dataTargetAreaForElementOneList;
        if (list != null) {
            View.OnDragListener onDragListenerInvoke = new DragAndDropListener(list, targetAreaBusyList, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$setListener$1$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DragAndDropCallback it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }, new Function1<DragAndDropCallback, Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$setListener$1$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DragAndDropCallback endCallback) {
                    Intrinsics.checkNotNullParameter(endCallback, "endCallback");
                    if (!endCallback.getOnTarget() || this.this$0.getViewModel().getUiState().getValue().isBulbBrokeVisible()) {
                        return;
                    }
                    AppCompatImageView ivChangeBulbElementOne = binding.ivChangeBulbElementOne;
                    Intrinsics.checkNotNullExpressionValue(ivChangeBulbElementOne, "ivChangeBulbElementOne");
                    ivChangeBulbElementOne.setVisibility(8);
                    this.this$0.getViewModel().setBulbVisible(this.this$0.getParentViewModel().getUiState().getValue().getCountWin());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropCallback dragAndDropCallback) {
                    invoke2(dragAndDropCallback);
                    return Unit.INSTANCE;
                }
            }).invoke();
            this.dragListener = onDragListenerInvoke;
            binding.constraintLayout.setOnDragListener(onDragListenerInvoke);
        }
    }

    public final void clearListeners() {
        FragmentChangeBulbBinding binding = getBinding();
        this.dragListener = null;
        binding.constraintLayout.setOnDragListener(null);
    }

    public final void startAnimationGlasses() {
        FragmentChangeBulbBinding binding = getBinding();
        CircleView cvChangeBulbGlassBig = binding.cvChangeBulbGlassBig;
        Intrinsics.checkNotNullExpressionValue(cvChangeBulbGlassBig, "cvChangeBulbGlassBig");
        CircleView.animateColorChangeStart$default(cvChangeBulbGlassBig, null, 1, null);
        binding.cvChangeBulbGlassSmall.animateColorChangeStart(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.ChangeBulbFragment$startAnimationGlasses$1$1
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
                this.this$0.getParentViewModel().sendFinishMiniGame(true);
            }
        });
    }
}
