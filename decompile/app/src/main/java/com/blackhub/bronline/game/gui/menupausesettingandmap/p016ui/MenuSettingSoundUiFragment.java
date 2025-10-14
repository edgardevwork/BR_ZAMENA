package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.Context;
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
import com.blackhub.bronline.databinding.FragmentMenuSettingSoundBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel;
import com.bless.client.R;
import com.google.android.material.slider.Slider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MenuSettingSoundUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingSoundUiFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingSoundBinding;", "()V", "menuSettingSoundViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "getMenuSettingSoundViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "menuSettingSoundViewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "initViews", "", "initialSwitch", "currentSwitch", "Landroidx/appcompat/widget/SwitchCompat;", "status", "", "saveSwitch", "isChecked", "paramTag", "", "setObservers", "setSeekBarListener", "setSwitchListener", "setVisibleSettingMicrophone", "isVisible", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingSoundUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingSoundUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingSoundUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,164:1\n106#2,15:165\n*S KotlinDebug\n*F\n+ 1 MenuSettingSoundUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingSoundUiFragment\n*L\n20#1:165,15\n*E\n"})
/* loaded from: classes7.dex */
public final class MenuSettingSoundUiFragment extends BaseFragment<FragmentMenuSettingSoundBinding> {
    public static final int $stable = 8;

    /* renamed from: menuSettingSoundViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingSoundViewModel;

    public MenuSettingSoundUiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$menuSettingSoundViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$1
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
        this.menuSettingSoundViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingSoundViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$special$$inlined$viewModels$default$4
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

    public static final /* synthetic */ FragmentMenuSettingSoundBinding access$getBinding(MenuSettingSoundUiFragment menuSettingSoundUiFragment) {
        return menuSettingSoundUiFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenuSettingSoundViewModel getMenuSettingSoundViewModel() {
        return (MenuSettingSoundViewModel) this.menuSettingSoundViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingSoundBinding getViewBinding() {
        FragmentMenuSettingSoundBinding fragmentMenuSettingSoundBindingInflate = FragmentMenuSettingSoundBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuSettingSoundBindingInflate, "inflate(...)");
        return fragmentMenuSettingSoundBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setSeekBarListener();
        setSwitchListener();
        setObservers();
    }

    public final void setSeekBarListener() {
        getBinding().allSoundSeekBar.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingSoundUiFragment.setSeekBarListener$lambda$0(this.f$0, slider, f, z);
            }
        });
        getBinding().allSoundSeekBar.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setSeekBarListener.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
                MenuSettingSoundUiFragment.this.getMenuSettingSoundViewModel().saveNewSettingParameter(NewMenuConstants.ALL_SOUNDS, (int) slider.getValue());
            }
        });
        getBinding().seekBarSpeakerVolume.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingSoundUiFragment.setSeekBarListener$lambda$1(this.f$0, slider, f, z);
            }
        });
        getBinding().seekBarSpeakerVolume.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setSeekBarListener.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
                MenuSettingSoundUiFragment.this.getMenuSettingSoundViewModel().saveNewSettingParameter(NewMenuConstants.PARAM_1, (int) slider.getValue());
            }
        });
        getBinding().seekBarMuteTheMicrophone.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingSoundUiFragment.setSeekBarListener$lambda$2(this.f$0, slider, f, z);
            }
        });
        getBinding().seekBarMuteTheMicrophone.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setSeekBarListener.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider) {
                Intrinsics.checkNotNullParameter(slider, "slider");
                MenuSettingSoundUiFragment.this.getMenuSettingSoundViewModel().saveNewSettingParameter(NewMenuConstants.PARAM_2, (int) slider.getValue());
            }
        });
    }

    public static final void setSeekBarListener$lambda$0(MenuSettingSoundUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingSoundViewModel().setAllSound((int) f);
    }

    public static final void setSeekBarListener$lambda$1(MenuSettingSoundUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingSoundViewModel().setSpeakerVolume((int) f);
    }

    public static final void setSeekBarListener$lambda$2(MenuSettingSoundUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingSoundViewModel().setTimerMuteTheMicrophone((int) f);
    }

    private final void setSwitchListener() {
        FragmentMenuSettingSoundBinding binding = getBinding();
        binding.newMenuSettingSwitchShowSpeakers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$3(this.f$0, compoundButton, z);
            }
        });
        binding.newMenuSettingSwitchShowVoiceChat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$4(this.f$0, compoundButton, z);
            }
        });
        binding.newMenuSettingSwitchAlwaysTurnOnVoiceChat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$5(this.f$0, compoundButton, z);
            }
        });
        binding.newMenuSettingSwitchRadioWithoutCensorship.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingSoundUiFragment.setSwitchListener$lambda$7$lambda$6(this.f$0, compoundButton, z);
            }
        });
    }

    public static final void setSwitchListener$lambda$7$lambda$3(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setShowSpeakers(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_3);
    }

    public static final void setSwitchListener$lambda$7$lambda$4(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setShowVoiceChat(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_4);
    }

    public static final void setSwitchListener$lambda$7$lambda$5(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setTurnOnVoiceChat(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_5);
        this$0.setVisibleSettingMicrophone(!z);
    }

    public static final void setSwitchListener$lambda$7$lambda$6(MenuSettingSoundUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingSoundViewModel().setRadioWithoutCensorship(z);
        this$0.saveSwitch(z, NewMenuConstants.PARAM_6);
    }

    public final void saveSwitch(boolean isChecked, String paramTag) {
        if (isChecked) {
            getMenuSettingSoundViewModel().saveNewSettingParameter(paramTag, 1);
        } else {
            getMenuSettingSoundViewModel().saveNewSettingParameter(paramTag, 0);
        }
    }

    public final void setVisibleSettingMicrophone(boolean isVisible) {
        int i = isVisible ? 0 : 8;
        FragmentMenuSettingSoundBinding binding = getBinding();
        binding.seekBarMuteTheMicrophone.setVisibility(i);
        binding.newMenuSettingTitleMuteTheMicrophone.setVisibility(i);
    }

    private final void setObservers() {
        getMenuSettingSoundViewModel().getNewAllSound().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.1
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
                MenuSettingSoundUiFragment.access$getBinding(MenuSettingSoundUiFragment.this).allSoundSeekBar.setValue(num.intValue());
                MenuSettingSoundUiFragment.access$getBinding(MenuSettingSoundUiFragment.this).newMenuSettingValueSound.setText(String.valueOf(num));
            }
        }));
        getMenuSettingSoundViewModel().getSpeakerVolume().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.2
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
                MenuSettingSoundUiFragment.access$getBinding(MenuSettingSoundUiFragment.this).seekBarSpeakerVolume.setValue(num.intValue());
                MenuSettingSoundUiFragment.access$getBinding(MenuSettingSoundUiFragment.this).newMenuSettingValueSpeakerVolume.setText(String.valueOf(num));
            }
        }));
        getMenuSettingSoundViewModel().getMuteTheMicrophone().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.3
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
                String string;
                MenuSettingSoundUiFragment.access$getBinding(MenuSettingSoundUiFragment.this).seekBarMuteTheMicrophone.setValue(num.intValue());
                TextView textView = MenuSettingSoundUiFragment.access$getBinding(MenuSettingSoundUiFragment.this).newMenuSettingTitleMuteTheMicrophone;
                Context context = MenuSettingSoundUiFragment.this.getContext();
                if (context == null || (string = context.getString(R.string.new_menu_setting_parameter_mute_the_microphone, num)) == null) {
                    string = "";
                }
                textView.setText(string);
            }
        }));
        getMenuSettingSoundViewModel().isShowSpeakers().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.4
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
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                SwitchCompat newMenuSettingSwitchShowSpeakers = MenuSettingSoundUiFragment.access$getBinding(menuSettingSoundUiFragment).newMenuSettingSwitchShowSpeakers;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchShowSpeakers, "newMenuSettingSwitchShowSpeakers");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchShowSpeakers, bool.booleanValue());
            }
        }));
        getMenuSettingSoundViewModel().isShowVoiceChat().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.5
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
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                SwitchCompat newMenuSettingSwitchShowVoiceChat = MenuSettingSoundUiFragment.access$getBinding(menuSettingSoundUiFragment).newMenuSettingSwitchShowVoiceChat;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchShowVoiceChat, "newMenuSettingSwitchShowVoiceChat");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchShowVoiceChat, bool.booleanValue());
            }
        }));
        getMenuSettingSoundViewModel().getAlwaysOnVoiceChat().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.6
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
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                SwitchCompat newMenuSettingSwitchAlwaysTurnOnVoiceChat = MenuSettingSoundUiFragment.access$getBinding(menuSettingSoundUiFragment).newMenuSettingSwitchAlwaysTurnOnVoiceChat;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchAlwaysTurnOnVoiceChat, "newMenuSettingSwitchAlwaysTurnOnVoiceChat");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchAlwaysTurnOnVoiceChat, bool.booleanValue());
            }
        }));
        getMenuSettingSoundViewModel().getRadioWithoutCensorship().observe(getViewLifecycleOwner(), new MenuSettingSoundUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingSoundUiFragment.setObservers.7
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
                MenuSettingSoundUiFragment menuSettingSoundUiFragment = MenuSettingSoundUiFragment.this;
                SwitchCompat newMenuSettingSwitchRadioWithoutCensorship = MenuSettingSoundUiFragment.access$getBinding(menuSettingSoundUiFragment).newMenuSettingSwitchRadioWithoutCensorship;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchRadioWithoutCensorship, "newMenuSettingSwitchRadioWithoutCensorship");
                Intrinsics.checkNotNull(bool);
                menuSettingSoundUiFragment.initialSwitch(newMenuSettingSwitchRadioWithoutCensorship, bool.booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
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
}
