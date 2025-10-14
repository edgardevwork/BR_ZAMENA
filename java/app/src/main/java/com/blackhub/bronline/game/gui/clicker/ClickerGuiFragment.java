package com.blackhub.bronline.game.gui.clicker;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentCompose;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.caverock.androidsvg.SVG;
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
import org.json.JSONObject;

/* compiled from: ClickerGuiFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nClickerGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerGuiFragment.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,44:1\n106#2,15:45\n*S KotlinDebug\n*F\n+ 1 ClickerGuiFragment.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerGuiFragment\n*L\n18#1:45,15\n*E\n"})

public final class ClickerGuiFragment extends BaseISAMPGUIFragmentCompose<ClickerUiState, ClickerViewModel> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<ClickerViewModel> factory;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @NotNull
    public final MainViewModelFactory<ClickerViewModel> getFactory() {
        MainViewModelFactory<ClickerViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<ClickerViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentCompose
    @NotNull
    public ClickerViewModel getViewModel() {
        return (ClickerViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentCompose
    public void initViewsISAMPGUI(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.initViewsISAMPGUI(view);
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            getViewModel().initInterface(jsonObj);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentCompose
    public void handleUiState(@NotNull ClickerUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        BooleanExtensionKt.ifTrue(Boolean.valueOf(uiState.isNeedToClose()), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment.handleUiState.1
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
                ClickerGuiFragment.this.closeFragment();
            }
        });
    }

    public ClickerGuiFragment() {
        super(79);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment$viewModel$2
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
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ClickerViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment$special$$inlined$viewModels$default$4
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
}

