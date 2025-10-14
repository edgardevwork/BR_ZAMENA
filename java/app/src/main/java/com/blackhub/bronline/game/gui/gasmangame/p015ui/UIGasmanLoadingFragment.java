package com.blackhub.bronline.game.gui.gasmangame.p015ui;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.GasmanLoadingLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.bless.client.R;
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

/* compiled from: UIGasmanLoadingFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIGasmanLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanLoadingFragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanLoadingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,38:1\n106#2,15:39\n*S KotlinDebug\n*F\n+ 1 UIGasmanLoadingFragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanLoadingFragment\n*L\n14#1:39,15\n*E\n"})

public final class UIGasmanLoadingFragment extends BaseFragment<GasmanLoadingLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public ValueAnimator animator;

    /* renamed from: gasmanParentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gasmanParentViewModel;

    public UIGasmanLoadingFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$gasmanParentViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$1
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
        this.gasmanParentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanParentViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$special$$inlined$viewModels$default$4
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

    public final GasmanParentViewModel getGasmanParentViewModel() {
        return (GasmanParentViewModel) this.gasmanParentViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.setDuration(2500L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator(1.5f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanLoadingFragment$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UIGasmanLoadingFragment.initViews$lambda$1$lambda$0(this.f$0, valueAnimator);
            }
        });
        this.animator = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public static final void initViews$lambda$1$lambda$0(UIGasmanLoadingFragment this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) animatedValue;
        int iIntValue = num.intValue();
        this$0.getBinding().textViewLoadingPercents.setText(this$0.getString(R.string.common_value_and_percent, num));
        if (iIntValue == 100) {
            this$0.getGasmanParentViewModel().setLoadingFragmentEnded(true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public GasmanLoadingLayoutBinding getViewBinding() {
        GasmanLoadingLayoutBinding gasmanLoadingLayoutBindingInflate = GasmanLoadingLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gasmanLoadingLayoutBindingInflate, "inflate(...)");
        return gasmanLoadingLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        super.onDestroyView();
    }
}

