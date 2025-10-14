package com.blackhub.bronline.game.gui.electric;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentElectricGuiBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.p013ui.CollectSchemeFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.FindProblemFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.RaiseChargeFragment;
import com.blackhub.bronline.game.gui.electric.p013ui.SumContactsFragment;
import com.blackhub.bronline.game.gui.electric.state.ElectricUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
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
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ElectricGuiFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nElectricGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricGuiFragment.kt\ncom/blackhub/bronline/game/gui/electric/ElectricGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,147:1\n106#2,15:148\n113#3:163\n*S KotlinDebug\n*F\n+ 1 ElectricGuiFragment.kt\ncom/blackhub/bronline/game/gui/electric/ElectricGuiFragment\n*L\n41#1:148,15\n95#1:163\n*E\n"})

public final class ElectricGuiFragment extends BaseISAMPGUIFragmentWithState<ElectricUiState, ElectricViewModel, FragmentElectricGuiBinding> {
    public static final int $stable = 8;
    public long blockMessageTimer;

    @Inject
    public MainViewModelFactory<ElectricViewModel> miniGamesElectricFactory;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 56;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    public ElectricGuiFragment() {
        super(R.layout.fragment_electric_gui);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ElectricGuiFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ElectricGuiFragment electricGuiFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(electricGuiFragment, electricGuiFragment.getMiniGamesElectricFactory()).get(ElectricViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.electric.ElectricGuiFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ElectricGuiFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ElectricViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ElectricGuiFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ElectricGuiFragment$special$$inlined$viewModels$default$4
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
    }

    @NotNull
    public final MainViewModelFactory<ElectricViewModel> getMiniGamesElectricFactory() {
        MainViewModelFactory<ElectricViewModel> mainViewModelFactory = this.miniGamesElectricFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("miniGamesElectricFactory");
        return null;
    }

    public final void setMiniGamesElectricFactory(@NotNull MainViewModelFactory<ElectricViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.miniGamesElectricFactory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public ElectricViewModel getViewModel() {
        return (ElectricViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState
    public void initViewsISAMPGUI() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            getViewModel().initJson(jsonObj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull ElectricUiState uiState) throws JSONException, Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        int childCount = ((FragmentElectricGuiBinding) getBinding()).mainContainer.getChildCount();
        blockingLoader(uiState.isBlockingLoading());
        if (IntExtensionKt.isNotZero(Integer.valueOf(uiState.getMiniGame())) && IntExtensionKt.isZero(Integer.valueOf(childCount))) {
            layoutListener(uiState.getMiniGame(), uiState.getInstructionsAndHintsList());
        }
        if (uiState.isNeedClose()) {
            closeFragment();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        closeFragment();
    }

    public final void replaceFragment(Class<? extends Fragment> fragment, String instructionsAndHintsList) {
        getChildFragmentManager().beginTransaction().replace(R.id.main_container, fragment, BundleKt.bundleOf(TuplesKt.m7112to(ElectricConstants.ELECTRIC_BUNDLE, instructionsAndHintsList))).commit();
    }

    public final void layoutListener(int currentLayoutId, List<ElectricInstructionsAndHintsModel> instructionsAndHintsList) throws JSONException, Resources.NotFoundException {
        Json.Companion companion = Json.INSTANCE;
        companion.getSerializersModule();
        String strEncodeToString = companion.encodeToString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), instructionsAndHintsList);
        if (currentLayoutId == 1) {
            replaceFragment(CollectSchemeFragment.class, strEncodeToString);
            return;
        }
        if (currentLayoutId == 2) {
            replaceFragment(FindProblemFragment.class, strEncodeToString);
            return;
        }
        if (currentLayoutId == 3) {
            replaceFragment(RaiseChargeFragment.class, strEncodeToString);
            return;
        }
        if (currentLayoutId == 4) {
            replaceFragment(SumContactsFragment.class, strEncodeToString);
            return;
        }
        String string = getResources().getString(R.string.common_unknown_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        showErrorMessage(string);
        getViewModel().sendCloseScreen();
    }

    private final void showErrorMessage(String errorMessage) throws JSONException {
        if (System.currentTimeMillis() - this.blockMessageTimer > 1000) {
            this.blockMessageTimer = System.currentTimeMillis();
            getViewModel().showErrorMessage(errorMessage);
        }
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 2, isShow, false, false, false, null, false, false, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER, null);
    }
}

