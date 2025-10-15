package com.blackhub.bronline.game.gui.taximap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentTaxiMapBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TaxiMapFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0003R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taximap/TaxiMapFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragmentWithState;", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapUiState;", "Lcom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel;", "Lcom/blackhub/bronline/databinding/FragmentTaxiMapBinding;", "()V", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/taximap/TaxiMapViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getGuiId", "", "handleUiState", "", "uiState", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "setListeners", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTaxiMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiMapFragment.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,108:1\n106#2,15:109\n41#3,2:124\n*S KotlinDebug\n*F\n+ 1 TaxiMapFragment.kt\ncom/blackhub/bronline/game/gui/taximap/TaxiMapFragment\n*L\n34#1:109,15\n63#1:124,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TaxiMapFragment extends BaseISAMPGUIFragmentWithState<TaxiMapUiState, TaxiMapViewModel, FragmentTaxiMapBinding> {
    public static final float MARGIN = 8.0f;
    public static final float PARAMS_SIZE = 16.0f;

    @Inject
    public MainViewModelFactory<TaxiMapViewModel> factory;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 21;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    public TaxiMapFragment() {
        super(R.layout.fragment_taxi_map);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.taximap.TaxiMapFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                TaxiMapFragment taxiMapFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(taxiMapFragment, taxiMapFragment.getFactory()).get(TaxiMapViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.taximap.TaxiMapFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.taximap.TaxiMapFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TaxiMapViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.taximap.TaxiMapFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.taximap.TaxiMapFragment$special$$inlined$viewModels$default$4
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
    public final MainViewModelFactory<TaxiMapViewModel> getFactory() {
        MainViewModelFactory<TaxiMapViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<TaxiMapViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public TaxiMapViewModel getViewModel() {
        return (TaxiMapViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState
    public void initViewsISAMPGUI() {
        setListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull TaxiMapUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.isNeedClose()) {
            closeFragment();
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        getViewModel().sendCloseScreen();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void setListeners() {
        final FragmentTaxiMapBinding fragmentTaxiMapBinding = (FragmentTaxiMapBinding) getBinding();
        fragmentTaxiMapBinding.brTaxiMapMap.setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.taximap.TaxiMapFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TaxiMapFragment.setListeners$lambda$1$lambda$0(this.f$0, fragmentTaxiMapBinding, view, motionEvent);
            }
        });
    }

    public static final boolean setListeners$lambda$1$lambda$0(TaxiMapFragment this$0, FragmentTaxiMapBinding this_invoke, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_invoke, "$this_invoke");
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (motionEvent.getAction() == 1) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < FloatExtensionKt.dpToPx(8.0f, contextRequireContext)) {
                x = FloatExtensionKt.dpToPx(8.0f, contextRequireContext);
            }
            if (y < FloatExtensionKt.dpToPx(8.0f, contextRequireContext)) {
                y = FloatExtensionKt.dpToPx(8.0f, contextRequireContext);
            }
            if (x > view.getWidth() - FloatExtensionKt.dpToPx(8.0f, contextRequireContext)) {
                x = view.getWidth() - FloatExtensionKt.dpToPx(8.0f, contextRequireContext);
            }
            if (y > view.getHeight() - FloatExtensionKt.dpToPx(8.0f, contextRequireContext)) {
                y = view.getHeight() - FloatExtensionKt.dpToPx(8.0f, contextRequireContext);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(FloatExtensionKt.dpToPx(16.0f, contextRequireContext), FloatExtensionKt.dpToPx(16.0f, contextRequireContext));
            layoutParams.setMargins(x - FloatExtensionKt.dpToPx(8.0f, contextRequireContext), y - FloatExtensionKt.dpToPx(8.0f, contextRequireContext), 0, 0);
            this_invoke.brTaxiMapDest.setLayoutParams(layoutParams);
            this_invoke.brTaxiMapDest.setVisibility(0);
            this$0.getViewModel().handlerCoordinates(view.getWidth(), view.getHeight(), x, y);
        }
        return true;
    }
}
