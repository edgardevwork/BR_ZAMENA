package com.blackhub.bronline.game.gui.bprewards;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.game.common.BaseFragmentCompose;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentCompose;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.craft.model.response.CraftJsonItemCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BpRewardsGuiFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBpRewardsGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsGuiFragment.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,78:1\n106#2,15:79\n106#2,15:94\n*S KotlinDebug\n*F\n+ 1 BpRewardsGuiFragment.kt\ncom/blackhub/bronline/game/gui/bprewards/BpRewardsGuiFragment\n*L\n22#1:79,15\n24#1:94,15\n*E\n"})

public final class BpRewardsGuiFragment extends BaseISAMPGUIFragmentCompose<BpRewardsUiState, BpRewardsViewModel> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<BpRewardsViewModel> factory;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public BpRewardsGuiFragment() {
        super(74);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getFactory();
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BpRewardsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$jniActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return fragmentActivityRequireActivity;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$6
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
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment$special$$inlined$viewModels$default$9
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
    }

    @NotNull
    public final MainViewModelFactory<BpRewardsViewModel> getFactory() {
        MainViewModelFactory<BpRewardsViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<BpRewardsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentCompose
    @NotNull
    public BpRewardsViewModel getViewModel() {
        return (BpRewardsViewModel) this.viewModel.getValue();
    }

    private final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentCompose
    public void initViewsISAMPGUI(@NotNull View view) {
        Resources resources;
        Intrinsics.checkNotNullParameter(view, "view");
        super.initViewsISAMPGUI(view);
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            List<BpRewardsAwardsDto> listOfAwardsTypes = getJniActivityViewModel().getConfigurationJsons().getValue().getBpRewardsModel().getListOfAwardsTypes();
            List<InvItems> invItemsFromJson = getJniActivityViewModel().getConfigurationJsons().getValue().getInvItemsFromJson();
            List<VehiclesDTO> vehiclesFromJson = getJniActivityViewModel().getConfigurationJsons().getValue().getVehiclesFromJson();
            List<SkinsDTO> skinsFromJson = getJniActivityViewModel().getConfigurationJsons().getValue().getSkinsFromJson();
            List<CraftJsonItemCategoryFilter> filters = getJniActivityViewModel().getConfigurationJsons().getValue().getMarketplaceDeliveryFilterModel().getFilters();
            BpRewardsViewModel viewModel = getViewModel();
            Context context = getContext();
            viewModel.initJson(jsonObj, listOfAwardsTypes, invItemsFromJson, vehiclesFromJson, skinsFromJson, (context == null || (resources = context.getResources()) == null) ? 512 : resources.getDimensionPixelSize(R.dimen._82wdp), filters);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentCompose
    public void handleUiState(@NotNull BpRewardsUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        blockingLoader(uiState.isScreenBlocked());
        if (uiState.isNeedClose()) {
            closeFragment();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            getViewModel().updateJson(json);
        }
    }

    public final void blockingLoader(boolean isShow) {
        BaseFragmentCompose.openOrDismissBlockingLoader$default(this, 74, isShow, false, false, true, 0L, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment.blockingLoader.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                BpRewardsViewModel viewModel = BpRewardsGuiFragment.this.getViewModel();
                String string = BpRewardsGuiFragment.this.getString(R.string.common_unknown_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                viewModel.showErrorMessage(string);
            }
        }, 108, null);
    }
}

