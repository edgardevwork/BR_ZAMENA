package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.res.Resources;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentMenuSettingWinterBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.state.MenuWinterUiState;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel;
import com.bless.client.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuSettingWinterUiFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMenuSettingWinterUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingWinterUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingWinterUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,103:1\n106#2,15:104\n*S KotlinDebug\n*F\n+ 1 MenuSettingWinterUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingWinterUiFragment\n*L\n22#1:104,15\n*E\n"})
/* loaded from: classes7.dex */
public final class MenuSettingWinterUiFragment extends BaseFragmentWithState<MenuWinterUiState, MenuSettingWinterViewModel, FragmentMenuSettingWinterBinding> {
    public static final int $stable = 8;

    @Nullable
    public String[] snowIntensity;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    public MenuSettingWinterUiFragment() {
        super(R.layout.fragment_menu_setting_winter);
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$viewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$special$$inlined$viewModels$default$1
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingWinterViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$special$$inlined$viewModels$default$4
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
    }

    public static final /* synthetic */ FragmentMenuSettingWinterBinding access$getBinding(MenuSettingWinterUiFragment menuSettingWinterUiFragment) {
        return menuSettingWinterUiFragment.getBinding();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public MenuSettingWinterViewModel getViewModel() {
        return (MenuSettingWinterViewModel) this.viewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        this.snowIntensity = getResources().getStringArray(R.array.new_menu_setting_value_parameters_snow_intensity);
        setSeekBarChangeListener();
        setSwitchListener();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull MenuWinterUiState uiState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        SwitchCompat switchNewMenuSettingWinter = getBinding().switchNewMenuSettingWinter;
        Intrinsics.checkNotNullExpressionValue(switchNewMenuSettingWinter, "switchNewMenuSettingWinter");
        initialSwitch(switchNewMenuSettingWinter, uiState.isWinterSlip());
        getBinding().sbNewMenuSettingWinterShowIntensity.setValue(uiState.getSnowIntensityValue());
        setStatusForSnowIntensitySeekBar(uiState.getSnowIntensityValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        setNullableParameters();
        super.onDestroy();
    }

    private final void setSeekBarChangeListener() {
        CustomSliderWithFourDots customSliderWithFourDots = getBinding().sbNewMenuSettingWinterShowIntensity;
        customSliderWithFourDots.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$setSeekBarChangeListener$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getViewModel().setSnowIntensity(i);
            }
        });
        customSliderWithFourDots.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$setSeekBarChangeListener$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getViewModel().sendNewSettingParameter(NewMenuConstants.SNOW_INTENSITY, i);
            }
        });
    }

    private final void initialSwitch(SwitchCompat currentSwitch, boolean status) throws Resources.NotFoundException {
        if (status) {
            currentSwitch.setThumbResource(R.drawable.bg_oval_red_s12);
            currentSwitch.setTrackResource(R.drawable.bg_rectangle_white15_cr6_1);
        } else {
            currentSwitch.setThumbResource(R.drawable.bg_oval_gray_s15);
            currentSwitch.setTrackResource(R.drawable.bg_rectangle_gray_cr6);
        }
        currentSwitch.setChecked(status);
    }

    public final void setStatusForSnowIntensitySeekBar(final int currentStatus) {
        if (this.snowIntensity != null) {
            TextView textView = getBinding().tvNewMenuSettingShowIntensityValue;
            String[] strArr = this.snowIntensity;
            String str = strArr != null ? (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus) : null;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            Unit unit = Unit.INSTANCE;
            return;
        }
        new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment.setStatusForSnowIntensitySeekBar.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Resources.NotFoundException {
                TextView textView2 = MenuSettingWinterUiFragment.access$getBinding(MenuSettingWinterUiFragment.this).tvNewMenuSettingShowIntensityValue;
                String[] stringArray = MenuSettingWinterUiFragment.this.getResources().getStringArray(R.array.new_menu_setting_value_parameters_snow_intensity);
                Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                String str2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
                if (str2 == null) {
                    str2 = "";
                }
                textView2.setText(str2);
            }
        };
    }

    private final void setSwitchListener() {
        getBinding().switchNewMenuSettingWinter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingWinterUiFragment$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingWinterUiFragment.setSwitchListener$lambda$3(this.f$0, compoundButton, z);
            }
        });
    }

    public static final void setSwitchListener$lambda$3(MenuSettingWinterUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().setWinterSlip(z);
        if (z) {
            this$0.getViewModel().sendNewSettingParameter(NewMenuConstants.WINTER_SLIP, 1);
        } else {
            this$0.getViewModel().sendNewSettingParameter(NewMenuConstants.WINTER_SLIP, 0);
        }
    }

    private final void setNullableParameters() {
        this.snowIntensity = null;
    }
}

