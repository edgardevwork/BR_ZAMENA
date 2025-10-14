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
import com.blackhub.bronline.databinding.FragmentMenuSettingGraphicBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.data.DisplayFPS;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel;
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

/* compiled from: MenuSettingGraphicUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0006\u0010&\u001a\u00020\u0014J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010/\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u00100\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+H\u0002J\b\u00101\u001a\u00020\u0014H\u0002J\u0010\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020\u0014H\u0002J\b\u00105\u001a\u00020\u0014H\u0002R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u00066"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingGraphicUiFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingGraphicBinding;", "()V", "effectQualities", "", "", "[Ljava/lang/String;", "graphicsDistance", "graphicsQualityShadow", "graphicsQualityWater", "menuSettingGraphicViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingGraphicViewModel;", "getMenuSettingGraphicViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingGraphicViewModel;", "menuSettingGraphicViewModel$delegate", "Lkotlin/Lazy;", "parametersGraphicsCar", "vegetationValues", "addOnSliderTouchListener", "", "slider", "Lcom/google/android/material/slider/Slider;", "currentSettingKey", "blockSSAA", "getViewBinding", "initViews", "initialSwitch", "currentSwitch", "Landroidx/appcompat/widget/SwitchCompat;", "status", "", "setAlphaForSSAA", "valueOfAlpha", "", "setClickableForSSAA", "isClickable", "setInitialTextView", "setNullableParameters", "setObservers", "setSeekBarChangeListener", "setStatusForEffectQualitySeekBar", "currentStatus", "", "setStatusForReflectionOnCarSeekBar", "setStatusForShadowQualitySeekBar", "setStatusForVegetationSeekBar", "setStatusForVisibilityRangeSeekBar", "setStatusForWaterQualitySeekBar", "setSwitchListener", "setVisibleSSAASubInfo", "isVisible", "unCheckSSAA", "unlockSSAA", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingGraphicUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingGraphicUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingGraphicUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,306:1\n106#2,15:307\n*S KotlinDebug\n*F\n+ 1 MenuSettingGraphicUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingGraphicUiFragment\n*L\n38#1:307,15\n*E\n"})
/* loaded from: classes7.dex */
public final class MenuSettingGraphicUiFragment extends BaseFragment<FragmentMenuSettingGraphicBinding> {
    public static final int $stable = 8;

    @Nullable
    public String[] effectQualities;

    @Nullable
    public String[] graphicsDistance;

    @Nullable
    public String[] graphicsQualityShadow;

    @Nullable
    public String[] graphicsQualityWater;

    /* renamed from: menuSettingGraphicViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingGraphicViewModel;

    @Nullable
    public String[] parametersGraphicsCar;

    @Nullable
    public String[] vegetationValues;

    public MenuSettingGraphicUiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$menuSettingGraphicViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$special$$inlined$viewModels$default$1
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
        this.menuSettingGraphicViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingGraphicViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$special$$inlined$viewModels$default$4
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

    public static final /* synthetic */ FragmentMenuSettingGraphicBinding access$getBinding(MenuSettingGraphicUiFragment menuSettingGraphicUiFragment) {
        return menuSettingGraphicUiFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenuSettingGraphicViewModel getMenuSettingGraphicViewModel() {
        return (MenuSettingGraphicViewModel) this.menuSettingGraphicViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingGraphicBinding getViewBinding() {
        FragmentMenuSettingGraphicBinding fragmentMenuSettingGraphicBindingInflate = FragmentMenuSettingGraphicBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuSettingGraphicBindingInflate, "inflate(...)");
        return fragmentMenuSettingGraphicBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setInitialTextView();
        setSeekBarChangeListener();
        setSwitchListener();
        setObservers();
    }

    public final void setSeekBarChangeListener() {
        getBinding().graphicSeekBar.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$$ExternalSyntheticLambda0
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingGraphicUiFragment.setSeekBarChangeListener$lambda$0(this.f$0, slider, f, z);
            }
        });
        Slider graphicSeekBar = getBinding().graphicSeekBar;
        Intrinsics.checkNotNullExpressionValue(graphicSeekBar, "graphicSeekBar");
        addOnSliderTouchListener(graphicSeekBar, NewMenuConstants.RESOLUTION);
        CustomSliderWithFourDots customSliderWithFourDots = getBinding().effectsQualitySeekBar;
        customSliderWithFourDots.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().setEffectQuality(i);
            }
        });
        customSliderWithFourDots.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$2$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.EFFECT_QUALITY, i);
            }
        });
        CustomSliderWithFourDots customSliderWithFourDots2 = getBinding().waterQualitySeekBar;
        customSliderWithFourDots2.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().setGraphicsWaterQuality(i);
            }
        });
        customSliderWithFourDots2.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$3$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.WATER_QUALITY, i);
            }
        });
        CustomSliderWithFourDots customSliderWithFourDots3 = getBinding().shadowQualitySeekBar;
        customSliderWithFourDots3.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$4$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().setGraphicsShadowQuality(i);
            }
        });
        customSliderWithFourDots3.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$4$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.SHADOW_QUALITY, i);
            }
        });
        CustomSliderWithFourDots customSliderWithFourDots4 = getBinding().reflectionOnCarSeekBar;
        customSliderWithFourDots4.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$5$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().setParametersReflectionOnCar(i);
            }
        });
        customSliderWithFourDots4.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$5$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.REFLECTION_ON_CAR, i);
            }
        });
        CustomSliderWithFourDots customSliderWithFourDots5 = getBinding().visibilityDistanceSeekBar;
        customSliderWithFourDots5.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$6$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().setGraphicsDistance(i);
            }
        });
        customSliderWithFourDots5.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$6$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.DISTANCE, i);
            }
        });
        CustomSliderWithThreeDots customSliderWithThreeDots = getBinding().vegetationSeekBar;
        customSliderWithThreeDots.setAddOnChangeListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$7$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().setVegetation(i);
            }
        });
        customSliderWithThreeDots.setAddOnSliderTouchListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$setSeekBarChangeListener$7$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.VEGETATION, i);
            }
        });
        getBinding().fpsSeekBar.addOnChangeListener(new Slider.OnChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$$ExternalSyntheticLambda1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f, boolean z) {
                MenuSettingGraphicUiFragment.setSeekBarChangeListener$lambda$7(this.f$0, slider, f, z);
            }
        });
        Slider fpsSeekBar = getBinding().fpsSeekBar;
        Intrinsics.checkNotNullExpressionValue(fpsSeekBar, "fpsSeekBar");
        addOnSliderTouchListener(fpsSeekBar, NewMenuConstants.FPS);
    }

    public static final void setSeekBarChangeListener$lambda$0(MenuSettingGraphicUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingGraphicViewModel().setResolution((int) f);
    }

    public static final void setSeekBarChangeListener$lambda$7(MenuSettingGraphicUiFragment this$0, Slider slider, float f, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(slider, "<anonymous parameter 0>");
        this$0.getMenuSettingGraphicViewModel().setValueOfFPS((int) f);
    }

    public final void addOnSliderTouchListener(Slider slider, final String currentSettingKey) {
        slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.addOnSliderTouchListener.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStartTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnSliderTouchListener, com.google.android.material.slider.BaseOnSliderTouchListener
            public void onStopTrackingTouch(@NotNull Slider slider2) {
                Intrinsics.checkNotNullParameter(slider2, "slider");
                MenuSettingGraphicUiFragment.this.getMenuSettingGraphicViewModel().sendNewSettingParameter(currentSettingKey, (int) slider2.getValue());
            }
        });
    }

    private final void setSwitchListener() {
        getBinding().newMenuSettingSwitchSmoothing.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MenuSettingGraphicUiFragment.setSwitchListener$lambda$8(this.f$0, compoundButton, z);
            }
        });
    }

    public static final void setSwitchListener$lambda$8(MenuSettingGraphicUiFragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMenuSettingGraphicViewModel().setSSAA(z);
        if (z) {
            this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.SSAA, 1);
        } else {
            this$0.getMenuSettingGraphicViewModel().sendNewSettingParameter(NewMenuConstants.SSAA, 0);
        }
    }

    public final void setInitialTextView() {
        this.graphicsQualityWater = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_quality_water);
        this.graphicsQualityShadow = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_quality_shadow);
        this.parametersGraphicsCar = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_car);
        this.graphicsDistance = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_distance);
        this.effectQualities = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_effect_qualities);
        this.vegetationValues = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_vegetation);
    }

    private final void setObservers() {
        getMenuSettingGraphicViewModel().getNewValueOfResolution().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).graphicSeekBar.setValue(num.intValue());
                MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).newMenuSettingValueGraphic.setText(String.valueOf(num));
                if (num.intValue() == 100) {
                    MenuSettingGraphicUiFragment.this.unlockSSAA();
                } else {
                    MenuSettingGraphicUiFragment.this.blockSSAA();
                }
            }
        }));
        getMenuSettingGraphicViewModel().getEffectQuality().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                CustomSliderWithFourDots customSliderWithFourDots = MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).effectsQualitySeekBar;
                Intrinsics.checkNotNull(num);
                customSliderWithFourDots.setValue(num.intValue());
                MenuSettingGraphicUiFragment.this.setStatusForEffectQualitySeekBar(num.intValue());
            }
        }));
        getMenuSettingGraphicViewModel().getNewGraphicsWaterQuality().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                CustomSliderWithFourDots customSliderWithFourDots = MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).waterQualitySeekBar;
                Intrinsics.checkNotNull(num);
                customSliderWithFourDots.setValue(num.intValue());
                MenuSettingGraphicUiFragment.this.setStatusForWaterQualitySeekBar(num.intValue());
            }
        }));
        getMenuSettingGraphicViewModel().getNewGraphicsShadowQuality().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                CustomSliderWithFourDots customSliderWithFourDots = MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).shadowQualitySeekBar;
                Intrinsics.checkNotNull(num);
                customSliderWithFourDots.setValue(num.intValue());
                MenuSettingGraphicUiFragment.this.setStatusForShadowQualitySeekBar(num.intValue());
            }
        }));
        getMenuSettingGraphicViewModel().getNewParametersReflectionOnCar().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                CustomSliderWithFourDots customSliderWithFourDots = MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).reflectionOnCarSeekBar;
                Intrinsics.checkNotNull(num);
                customSliderWithFourDots.setValue(num.intValue());
                MenuSettingGraphicUiFragment.this.setStatusForReflectionOnCarSeekBar(num.intValue());
            }
        }));
        getMenuSettingGraphicViewModel().getNewGraphicsDistance().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                CustomSliderWithFourDots customSliderWithFourDots = MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).visibilityDistanceSeekBar;
                Intrinsics.checkNotNull(num);
                customSliderWithFourDots.setValue(num.intValue());
                MenuSettingGraphicUiFragment.this.setStatusForVisibilityRangeSeekBar(num.intValue());
            }
        }));
        getMenuSettingGraphicViewModel().getVegetation().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws Resources.NotFoundException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws Resources.NotFoundException {
                CustomSliderWithThreeDots customSliderWithThreeDots = MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).vegetationSeekBar;
                Intrinsics.checkNotNull(num);
                customSliderWithThreeDots.setValue(num.intValue());
                MenuSettingGraphicUiFragment.this.setStatusForVegetationSeekBar(num.intValue());
            }
        }));
        getMenuSettingGraphicViewModel().getNewSSAA().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.8
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
                MenuSettingGraphicUiFragment menuSettingGraphicUiFragment = MenuSettingGraphicUiFragment.this;
                SwitchCompat newMenuSettingSwitchSmoothing = MenuSettingGraphicUiFragment.access$getBinding(menuSettingGraphicUiFragment).newMenuSettingSwitchSmoothing;
                Intrinsics.checkNotNullExpressionValue(newMenuSettingSwitchSmoothing, "newMenuSettingSwitchSmoothing");
                Intrinsics.checkNotNull(bool);
                menuSettingGraphicUiFragment.initialSwitch(newMenuSettingSwitchSmoothing, bool.booleanValue());
            }
        }));
        getMenuSettingGraphicViewModel().getDisplayFPS().observe(getViewLifecycleOwner(), new MenuSettingGraphicUiFragment$sam$androidx_lifecycle_Observer$0(new Function1<DisplayFPS, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingGraphicUiFragment.setObservers.9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DisplayFPS displayFPS) {
                invoke2(displayFPS);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DisplayFPS displayFPS) {
                if (MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).fpsSeekBar.getValueTo() != displayFPS.getMaxFPS()) {
                    MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).fpsSeekBar.setValueTo(displayFPS.getMaxFPS());
                }
                MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).fpsSeekBar.setValue(displayFPS.getCurrentFPS());
                MenuSettingGraphicUiFragment.access$getBinding(MenuSettingGraphicUiFragment.this).newMenuSettingValueFps.setText(String.valueOf(displayFPS.getCurrentFPS()));
            }
        }));
    }

    public final void setStatusForEffectQualitySeekBar(int currentStatus) throws Resources.NotFoundException {
        String strEmpty;
        if (this.effectQualities != null) {
            TextView textView = getBinding().newMenuSettingValueEffectsQuality;
            String[] strArr = this.effectQualities;
            if (strArr == null || (strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus)) == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            textView.setText(strEmpty);
            return;
        }
        TextView textView2 = getBinding().newMenuSettingValueEffectsQuality;
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_effect_qualities);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String strEmpty2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
        if (strEmpty2 == null) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        textView2.setText(strEmpty2);
    }

    public final void setStatusForWaterQualitySeekBar(int currentStatus) throws Resources.NotFoundException {
        String strEmpty;
        if (this.graphicsQualityWater != null) {
            TextView textView = getBinding().newMenuSettingValueWaterQuality;
            String[] strArr = this.graphicsQualityWater;
            if (strArr == null || (strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus)) == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            textView.setText(strEmpty);
            return;
        }
        TextView textView2 = getBinding().newMenuSettingValueWaterQuality;
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_quality_water);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String strEmpty2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
        if (strEmpty2 == null) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        textView2.setText(strEmpty2);
    }

    public final void setStatusForShadowQualitySeekBar(int currentStatus) throws Resources.NotFoundException {
        String strEmpty;
        if (this.graphicsQualityShadow != null) {
            TextView textView = getBinding().newMenuSettingValueShadowQuality;
            String[] strArr = this.graphicsQualityShadow;
            if (strArr == null || (strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus)) == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            textView.setText(strEmpty);
            return;
        }
        TextView textView2 = getBinding().newMenuSettingValueShadowQuality;
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_quality_shadow);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String strEmpty2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
        if (strEmpty2 == null) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        textView2.setText(strEmpty2);
    }

    public final void setStatusForReflectionOnCarSeekBar(int currentStatus) throws Resources.NotFoundException {
        String strEmpty;
        if (this.parametersGraphicsCar != null) {
            TextView textView = getBinding().newMenuSettingValueReflectionOnCar;
            String[] strArr = this.graphicsQualityShadow;
            if (strArr == null || (strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus)) == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            textView.setText(strEmpty);
            return;
        }
        TextView textView2 = getBinding().newMenuSettingValueReflectionOnCar;
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_car);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String strEmpty2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
        if (strEmpty2 == null) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        textView2.setText(strEmpty2);
    }

    public final void setStatusForVisibilityRangeSeekBar(int currentStatus) throws Resources.NotFoundException {
        String strEmpty;
        if (this.graphicsDistance != null) {
            TextView textView = getBinding().newMenuSettingValueVisibilityRange;
            String[] strArr = this.graphicsDistance;
            if (strArr == null || (strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus)) == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            textView.setText(strEmpty);
            return;
        }
        TextView textView2 = getBinding().newMenuSettingValueVisibilityRange;
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_distance);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String strEmpty2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
        if (strEmpty2 == null) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        textView2.setText(strEmpty2);
    }

    public final void setStatusForVegetationSeekBar(int currentStatus) throws Resources.NotFoundException {
        String strEmpty;
        if (this.vegetationValues != null) {
            TextView textView = getBinding().newMenuSettingValueVegetation;
            String[] strArr = this.vegetationValues;
            if (strArr == null || (strEmpty = (String) ArraysKt___ArraysKt.getOrNull(strArr, currentStatus)) == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            textView.setText(strEmpty);
            return;
        }
        TextView textView2 = getBinding().newMenuSettingValueVegetation;
        String[] stringArray = getResources().getStringArray(R.array.new_menu_setting_value_parameters_graphics_vegetation);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String strEmpty2 = (String) ArraysKt___ArraysKt.getOrNull(stringArray, currentStatus);
        if (strEmpty2 == null) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        textView2.setText(strEmpty2);
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

    public final void blockSSAA() throws Resources.NotFoundException {
        if (getBinding().newMenuSettingSwitchSmoothing.getAlpha() == 0.6f) {
            return;
        }
        setAlphaForSSAA(0.6f);
        setVisibleSSAASubInfo(0);
        setClickableForSSAA(false);
        unCheckSSAA();
    }

    public final void unlockSSAA() {
        setAlphaForSSAA(1.0f);
        setVisibleSSAASubInfo(4);
        setClickableForSSAA(true);
    }

    public final void setAlphaForSSAA(float valueOfAlpha) {
        getBinding().newMenuSettingSwitchSmoothing.setAlpha(valueOfAlpha);
        getBinding().newMenuSettingTitleSmoothing.setAlpha(valueOfAlpha);
    }

    public final void setVisibleSSAASubInfo(int isVisible) {
        getBinding().newMenuSettingSubInfoSmoothing.setVisibility(isVisible);
    }

    public final void setClickableForSSAA(boolean isClickable) {
        getBinding().newMenuSettingSwitchSmoothing.setClickable(isClickable);
    }

    public final void unCheckSSAA() throws Resources.NotFoundException {
        getBinding().newMenuSettingSwitchSmoothing.setChecked(false);
        getMenuSettingGraphicViewModel().setSSAA(false);
    }

    public final void setNullableParameters() {
        this.effectQualities = null;
        this.graphicsQualityWater = null;
        this.graphicsQualityShadow = null;
        this.parametersGraphicsCar = null;
        this.graphicsDistance = null;
        this.vegetationValues = null;
    }
}
