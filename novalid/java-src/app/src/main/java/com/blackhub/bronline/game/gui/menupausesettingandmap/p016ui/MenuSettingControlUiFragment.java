package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FragmentMenuSettingControlBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.CustomItemDecorator;
import com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingControlAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.bless.client.R;
import com.google.android.material.slider.Slider;
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
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: MenuSettingControlUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0016J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020%H\u0016J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0006\u00109\u001a\u00020%J\b\u0010:\u001a\u00020%H\u0002J\b\u0010;\u001a\u00020%H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001e¨\u0006="}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingControlUiFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingControlBinding;", "()V", "brContext", "Landroid/content/Context;", "getBrContext", "()Landroid/content/Context;", "brContext$delegate", "Lkotlin/Lazy;", "chatSpinnerList", "", "", "[Ljava/lang/String;", "chatVersionAdapter", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingControlAdapter;", "hudSpinnerList", "hudVersionAdapter", "joystickControlAdapter", "joystickSpinnerList", "keyboardSpinnerList", "keyboardVersionAdapter", "menuSettingControlViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "getMenuSettingControlViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "menuSettingControlViewModel$delegate", "screenArgs", "", "getScreenArgs", "()Z", "screenArgs$delegate", "getFormattedFloat", "", "currentValue", "getViewBinding", "initChangeWidget", "", "initControlAimingCamSensibilityX", "initControlAimingCamSensibilityY", "initControlCamSensibilityX", "initControlCamSensibilityY", "initControlCarSensibility", "initSpinner", "initTextView", "initViews", "initialSwitch", "currentSwitch", "Landroidx/appcompat/widget/SwitchCompat;", "status", "onStart", "setChatVisibleSpinner", "setVisible", "", "setHudVisibleSpinner", "setJoystickVisibleSpinner", "setKeyboardVisibleSpinner", "setNullableParameters", "setObservers", "setSwitchListener", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingControlUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingControlUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingControlUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,478:1\n106#2,15:479\n*S KotlinDebug\n*F\n+ 1 MenuSettingControlUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingControlUiFragment\n*L\n40#1:479,15\n*E\n"})
/* loaded from: classes.dex */
public final class MenuSettingControlUiFragment extends BaseFragment<FragmentMenuSettingControlBinding> {
    public static final int SCROLL_DELAY = 700;

    /* renamed from: brContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy brContext;

    @Nullable
    public String[] chatSpinnerList;

    @Nullable
    public MenuSettingControlAdapter chatVersionAdapter;

    @Nullable
    public String[] hudSpinnerList;

    @Nullable
    public MenuSettingControlAdapter hudVersionAdapter;

    @Nullable
    public MenuSettingControlAdapter joystickControlAdapter;

    @Nullable
    public String[] joystickSpinnerList;

    @Nullable
    public String[] keyboardSpinnerList;

    @Nullable
    public MenuSettingControlAdapter keyboardVersionAdapter;

    /* renamed from: menuSettingControlViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingControlViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;
    public static final int $stable = 8;

    public MenuSettingControlUiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$menuSettingControlViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$1
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
        this.menuSettingControlViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$special$$inlined$viewModels$default$4
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
        this.brContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$brContext$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                return this.this$0.requireContext();
            }
        });
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$screenArgs$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Bundle arguments = this.this$0.getArguments();
                return Boolean.valueOf(BooleanExtensionKt.getOrFalse(arguments != null ? Boolean.valueOf(arguments.getBoolean(NewMenuConstants.NEW_MENU_SETTING_LAYOUT_SCROLL_TO_SWITCH_ARGS)) : null));
            }
        });
    }

    public static final /* synthetic */ FragmentMenuSettingControlBinding access$getBinding(MenuSettingControlUiFragment menuSettingControlUiFragment) {
        return menuSettingControlUiFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenuSettingControlViewModel getMenuSettingControlViewModel() {
        return (MenuSettingControlViewModel) this.menuSettingControlViewModel.getValue();
    }

    public final Context getBrContext() {
        return (Context) this.brContext.getValue();
    }

    private final boolean getScreenArgs() {
        return ((Boolean) this.screenArgs.getValue()).booleanValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingControlBinding getViewBinding() {
        FragmentMenuSettingControlBinding fragmentMenuSettingControlBindingInflate = FragmentMenuSettingControlBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuSettingControlBindingInflate, "inflate(...)");
        return fragmentMenuSettingControlBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() throws Resources.NotFoundException {
        initTextView();
        initSpinner();
        setSwitchListener();
        initControlCarSensibility();
        initControlCamSensibilityX();
        initControlCamSensibilityY();
        initControlAimingCamSensibilityX();
        initControlAimingCamSensibilityY();
        initChangeWidget();
        setObservers();
        final FragmentMenuSettingControlBinding binding = getBinding();
        binding.settingMenuCarControlSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$0(this.f$0, view);
            }
        });
        binding.tvSettingMenuSwitchHudSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$1(this.f$0, view);
            }
        });
        binding.tvSettingMenuSwitchChatSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$2(this.f$0, view);
            }
        });
        binding.tvSettingMenuSwitchKeyboardSpinner.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initViews$lambda$4$lambda$3(this.f$0, view);
            }
        });
        BooleanExtensionKt.ifTrue(Boolean.valueOf(getScreenArgs()), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initViews$1$5
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
                NestedScrollView nsvNewMenuControlLayout = binding.nsvNewMenuControlLayout;
                Intrinsics.checkNotNullExpressionValue(nsvNewMenuControlLayout, "nsvNewMenuControlLayout");
                final FragmentMenuSettingControlBinding fragmentMenuSettingControlBinding = binding;
                ViewExtensionKt.addViewObserver(nsvNewMenuControlLayout, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initViews$1$5.1
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
                        FragmentMenuSettingControlBinding fragmentMenuSettingControlBinding2 = fragmentMenuSettingControlBinding;
                        fragmentMenuSettingControlBinding2.nsvNewMenuControlLayout.smoothScrollTo(0, fragmentMenuSettingControlBinding2.tvSettingMenuSwitchKeyboardTitle.getBottom(), 700);
                    }
                });
            }
        });
    }

    public static final void initViews$lambda$4$lambda$0(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setJoystickVisibleSpinner(0);
    }

    public static final void initViews$lambda$4$lambda$1(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setHudVisibleSpinner(0);
        this$0.setChatVisibleSpinner(4);
        this$0.setKeyboardVisibleSpinner(4);
    }

    public static final void initViews$lambda$4$lambda$2(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setChatVisibleSpinner(0);
        this$0.setHudVisibleSpinner(4);
        this$0.setKeyboardVisibleSpinner(4);
    }

    public static final void initViews$lambda$4$lambda$3(MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setChatVisibleSpinner(4);
        this$0.setHudVisibleSpinner(4);
        this$0.setKeyboardVisibleSpinner(0);
    }

    public final void initControlCarSensibility() {
        Slider slider = getBinding().seekBarsSettingsCarControlSensibility;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlCarSensibility$lambda$6$lambda$5(this.f$0, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlCarSensibility$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
                this.this$0.getMenuSettingControlViewModel().saveInPreferencesFloatParams(NewMenuConstants.CAR_CONTROL_SENSIBILITY, this.this$0.getFormattedFloat(slider2.getValue()));
            }
        });
    }

    public static final void initControlCarSensibility$lambda$6$lambda$5(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfCarControlSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlCamSensibilityX() {
        Slider slider = getBinding().seekBarsSettingsCarCamSensX;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda0
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlCamSensibilityX$lambda$8$lambda$7(this.f$0, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlCamSensibilityX$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
                this.this$0.getMenuSettingControlViewModel().saveInPreferencesFloatParams(NewMenuConstants.CAR_CAMERA_X_SENSIBILITY, this.this$0.getFormattedFloat(slider2.getValue()));
            }
        });
    }

    public static final void initControlCamSensibilityX$lambda$8$lambda$7(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfCamXSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlCamSensibilityY() {
        Slider slider = getBinding().seekBarsSettingsCarCamSensY;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlCamSensibilityY$lambda$10$lambda$9(this.f$0, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlCamSensibilityY$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
                this.this$0.getMenuSettingControlViewModel().saveInPreferencesFloatParams(NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY, this.this$0.getFormattedFloat(slider2.getValue()));
            }
        });
    }

    public static final void initControlCamSensibilityY$lambda$10$lambda$9(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfCamYSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlAimingCamSensibilityX() {
        Slider slider = getBinding().seekBarsSettingsAimingCamSensX;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlAimingCamSensibilityX$lambda$12$lambda$11(this.f$0, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlAimingCamSensibilityX$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
                this.this$0.getMenuSettingControlViewModel().saveInPreferencesFloatParams(NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY, this.this$0.getFormattedFloat(slider2.getValue()));
            }
        });
    }

    public static final void initControlAimingCamSensibilityX$lambda$12$lambda$11(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfAimingCamXSensibility(this$0.getFormattedFloat(f));
    }

    public final void initControlAimingCamSensibilityY() {
        Slider slider = getBinding().seekBarsSettingsAimingCamSensY;
        slider.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider2, float f, boolean z) {
                MenuSettingControlUiFragment.initControlAimingCamSensibilityY$lambda$14$lambda$13(this.f$0, slider2, f, z);
            }
        });
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initControlAimingCamSensibilityY$1$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
                this.this$0.getMenuSettingControlViewModel().saveInPreferencesFloatParams(NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY, this.this$0.getFormattedFloat(slider2.getValue()));
            }
        });
    }

    public static final void initControlAimingCamSensibilityY$lambda$14$lambda$13(MenuSettingControlUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingControlViewModel().setValueOfAimingCamYSensibility(this$0.getFormattedFloat(f));
    }

    public final float getFormattedFloat(float currentValue) {
        return FloatExtensionKt.roundToIntSafely(currentValue * 100.0f) / 100.0f;
    }

    public final void initTextView() throws Resources.NotFoundException {
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_title_parameters_controls);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 2) {
            getBinding().settingMenuCarControlTitle.setText(stringArray[0]);
            getBinding().newMenuSettingTitleLookBack.setText(stringArray[1]);
        }
    }

    public final void initSpinner() {
        this.joystickSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_controls);
        this.hudSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_switch_new_old);
        this.chatSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_switch_new_old);
        this.keyboardSpinnerList = getResources().getStringArray(R.array.new_menu_setting_value_parameters_switch_new_old);
        Drawable drawable = AppCompatResources.getDrawable(getBrContext(), R.drawable.bg_rectangle_gray_t1);
        String[] strArr = this.joystickSpinnerList;
        if (strArr != null) {
            MenuSettingControlAdapter menuSettingControlAdapter = new MenuSettingControlAdapter(strArr);
            menuSettingControlAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    this.this$0.getMenuSettingControlViewModel().setCarControl(i);
                    this.this$0.setJoystickVisibleSpinner(4);
                }
            });
            this.joystickControlAdapter = menuSettingControlAdapter;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchControl.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView = getBinding().rvSettingMenuSwitchControl;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.joystickControlAdapter);
        }
        String[] strArr2 = this.hudSpinnerList;
        if (strArr2 != null) {
            MenuSettingControlAdapter menuSettingControlAdapter2 = new MenuSettingControlAdapter(strArr2);
            menuSettingControlAdapter2.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$2$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    this.this$0.getMenuSettingControlViewModel().setHudVersion(i);
                    this.this$0.setHudVisibleSpinner(4);
                    GUIManager.INSTANCE.getInstance().migrateNotifications();
                }
            });
            this.hudVersionAdapter = menuSettingControlAdapter2;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchHud.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView2 = getBinding().rvSettingMenuSwitchHud;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
            recyclerView2.setAdapter(this.hudVersionAdapter);
        }
        String[] strArr3 = this.chatSpinnerList;
        if (strArr3 != null) {
            MenuSettingControlAdapter menuSettingControlAdapter3 = new MenuSettingControlAdapter(strArr3);
            menuSettingControlAdapter3.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$3$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    this.this$0.getMenuSettingControlViewModel().setChatVersion(i);
                    this.this$0.setChatVisibleSpinner(4);
                }
            });
            this.chatVersionAdapter = menuSettingControlAdapter3;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchChat.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView3 = getBinding().rvSettingMenuSwitchChat;
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext(), 1, false));
            recyclerView3.setAdapter(this.chatVersionAdapter);
        }
        String[] strArr4 = this.keyboardSpinnerList;
        if (strArr4 != null) {
            MenuSettingControlAdapter menuSettingControlAdapter4 = new MenuSettingControlAdapter(strArr4);
            menuSettingControlAdapter4.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initSpinner$4$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i) {
                    this.this$0.getMenuSettingControlViewModel().setKeyboardVersion(i);
                    this.this$0.setKeyboardVisibleSpinner(4);
                }
            });
            this.keyboardVersionAdapter = menuSettingControlAdapter4;
            if (drawable != null) {
                getBinding().rvSettingMenuSwitchKeyboard.addItemDecoration(new CustomItemDecorator(drawable));
            }
            RecyclerView recyclerView4 = getBinding().rvSettingMenuSwitchKeyboard;
            recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext(), 1, false));
            recyclerView4.setAdapter(this.keyboardVersionAdapter);
        }
    }

    public final void setSwitchListener() {
        getBinding().newMenuSettingSwitchLookBack.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingControlUiFragment.setSwitchListener$lambda$31(this.f$0, compoundButton, z);
            }
        });
    }

    public static final void setSwitchListener$lambda$31(MenuSettingControlUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingControlViewModel().setLookBack(z);
    }

    public final void initChangeWidget() {
        getBinding().newMenuSettingButtonChangeWidget.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MenuSettingControlUiFragment.initChangeWidget$lambda$34(this.f$0, view);
            }
        });
    }

    public static final void initChangeWidget$lambda$34(final MenuSettingControlUiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.requireActivity().getClass(), MainActivity.class)) {
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog = new TwoButtonsAndTextWithDescriptionDialog(fragmentActivityRequireActivity);
            twoButtonsAndTextWithDescriptionDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
            twoButtonsAndTextWithDescriptionDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$1$2
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
                    UsefulKt.hideSystemUI(MenuSettingControlUiFragment.access$getBinding(this.this$0).getRoot());
                }
            });
            twoButtonsAndTextWithDescriptionDialog.show();
            String string = this$0.getString(R.string.common_unavailable);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            twoButtonsAndTextWithDescriptionDialog.setTitle(string);
            String string2 = this$0.getString(R.string.new_menu_setting_error_change_widget);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            twoButtonsAndTextWithDescriptionDialog.setDescription(string2);
            twoButtonsAndTextWithDescriptionDialog.setVisibilityOfOKButton(8);
            twoButtonsAndTextWithDescriptionDialog.setCancelable(true);
            UsefulKt.hideSystemUI(this$0.getBinding().getRoot());
            return;
        }
        String string3 = this$0.getString(R.string.new_menu_setting_apply_change_widget_body);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog2 = new TwoButtonsAndTextWithDescriptionDialog(fragmentActivityRequireActivity2);
        twoButtonsAndTextWithDescriptionDialog2.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$2$1
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
                this.this$0.getMenuSettingControlViewModel().changeWidget();
            }
        });
        twoButtonsAndTextWithDescriptionDialog2.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment$initChangeWidget$1$2$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        twoButtonsAndTextWithDescriptionDialog2.show();
        String string4 = this$0.getString(R.string.new_menu_setting_apply_change_widget_title);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog2.setTitle(string4);
        twoButtonsAndTextWithDescriptionDialog2.setDescription(Useful.INSTANCE.getTextWithHtmlStyles(string3));
        twoButtonsAndTextWithDescriptionDialog2.setCancelable(true);
        UsefulKt.hideSystemUI(this$0.getBinding().getRoot());
    }

    private final void setObservers() {
        getMenuSettingControlViewModel().getNewCarControl().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr = MenuSettingControlUiFragment.this.joystickSpinnerList;
                if (strArr != null) {
                    TextView textView = MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).settingMenuCarControlSpinner;
                    Intrinsics.checkNotNull(num);
                    String strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (strEmpty == null) {
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(strEmpty);
                }
            }
        }));
        getMenuSettingControlViewModel().getHudVersion().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr = MenuSettingControlUiFragment.this.hudSpinnerList;
                if (strArr != null) {
                    TextView textView = MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).tvSettingMenuSwitchHudSpinner;
                    Intrinsics.checkNotNull(num);
                    String strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (strEmpty == null) {
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(strEmpty);
                }
            }
        }));
        getMenuSettingControlViewModel().getChatVersion().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr = MenuSettingControlUiFragment.this.chatSpinnerList;
                if (strArr != null) {
                    TextView textView = MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).tvSettingMenuSwitchChatSpinner;
                    Intrinsics.checkNotNull(num);
                    String strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (strEmpty == null) {
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(strEmpty);
                }
            }
        }));
        getMenuSettingControlViewModel().getKeyboardVersion().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                String[] strArr = MenuSettingControlUiFragment.this.keyboardSpinnerList;
                if (strArr != null) {
                    TextView textView = MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).tvSettingMenuSwitchKeyboardSpinner;
                    Intrinsics.checkNotNull(num);
                    String strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, num.intValue());
                    if (strEmpty == null) {
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    textView.setText(strEmpty);
                }
            }
        }));
        getMenuSettingControlViewModel().getValueOfCarControlSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Float f) {
                Intrinsics.checkNotNull(f);
                if (f.floatValue() > MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarControlSensibility.getValueTo() || f.floatValue() < MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarControlSensibility.getValueFrom()) {
                    f = Float.valueOf(MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarControlSensibility.getValueTo());
                }
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarControlSensibility.setValue(f.floatValue());
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).settingsMenuCarControlSensibilityValue.setText(String.valueOf(f));
            }
        }));
        getMenuSettingControlViewModel().getValueOfCamXSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Float f) {
                Intrinsics.checkNotNull(f);
                if (f.floatValue() > MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarCamSensX.getValueTo() || f.floatValue() < MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarCamSensX.getValueFrom()) {
                    f = Float.valueOf(MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarControlSensibility.getValueTo());
                }
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarCamSensX.setValue(f.floatValue());
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).settingsMenuCarControlCamSensXValue.setText(String.valueOf(f));
            }
        }));
        getMenuSettingControlViewModel().getValueOfCamYSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Float f) {
                Intrinsics.checkNotNull(f);
                if (f.floatValue() > MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarCamSensY.getValueTo() || f.floatValue() < MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarCamSensY.getValueFrom()) {
                    f = Float.valueOf(MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarControlSensibility.getValueTo());
                }
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsCarCamSensY.setValue(f.floatValue());
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).settingsMenuCarControlCamSensYValue.setText(String.valueOf(f));
            }
        }));
        getMenuSettingControlViewModel().getValueOfAimingCamXSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.8
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Float f) {
                Intrinsics.checkNotNull(f);
                if (f.floatValue() > MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensX.getValueTo() || f.floatValue() < MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensX.getValueFrom()) {
                    f = Float.valueOf(MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensX.getValueTo());
                }
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensX.setValue(f.floatValue());
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).settingsMenuControlAimingCamSensXValue.setText(String.valueOf(f));
            }
        }));
        getMenuSettingControlViewModel().getValueOfAimingCamYSensibility().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke2(f);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Float f) {
                Intrinsics.checkNotNull(f);
                if (f.floatValue() > MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensY.getValueTo() || f.floatValue() < MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensY.getValueFrom()) {
                    f = Float.valueOf(MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensY.getValueTo());
                }
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).seekBarsSettingsAimingCamSensY.setValue(f.floatValue());
                MenuSettingControlUiFragment.access$getBinding(MenuSettingControlUiFragment.this).settingsMenuControlAimingCamSensYValue.setText(String.valueOf(f));
            }
        }));
        getMenuSettingControlViewModel().getNewLookBack().observe(getViewLifecycleOwner(), new MenuSettingControlUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingControlUiFragment.setObservers.10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws Resources.NotFoundException {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) throws Resources.NotFoundException {
                MenuSettingControlUiFragment menuSettingControlUiFragment = MenuSettingControlUiFragment.this;
                SwitchCompat newMenuSettingSwitchLookBack = MenuSettingControlUiFragment.access$getBinding(menuSettingControlUiFragment).newMenuSettingSwitchLookBack;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchLookBack, "newMenuSettingSwitchLookBack");
                Intrinsics.checkNotNull(bool);
                menuSettingControlUiFragment.initialSwitch(newMenuSettingSwitchLookBack, bool.booleanValue());
            }
        }));
    }

    public final void initialSwitch(SwitchCompat currentSwitch, boolean status) throws Resources.NotFoundException {
        if (status) {
            currentSwitch.setThumbResource(R.drawable.bg_oval_red_s12);
            currentSwitch.setTrackResource(R.drawable.bg_rectangle_white15_cr6_1);
        } else {
            currentSwitch.setThumbResource(R.drawable.bg_oval_gray_s15);
            currentSwitch.setTrackResource(R.drawable.bg_rectangle_gray_cr6);
        }
        currentSwitch.setChecked(status);
    }

    public final void setJoystickVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchControl.setVisibility(setVisible);
    }

    public final void setHudVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchHud.setVisibility(setVisible);
    }

    public final void setChatVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchChat.setVisibility(setVisible);
    }

    public final void setKeyboardVisibleSpinner(int setVisible) {
        getBinding().rvSettingMenuSwitchKeyboard.setVisibility(setVisible);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setJoystickVisibleSpinner(4);
    }

    public final void setNullableParameters() {
        this.joystickControlAdapter = null;
        this.hudVersionAdapter = null;
        this.chatVersionAdapter = null;
        this.keyboardVersionAdapter = null;
        this.joystickSpinnerList = null;
        this.hudSpinnerList = null;
        this.chatSpinnerList = null;
        this.keyboardSpinnerList = null;
    }
}
