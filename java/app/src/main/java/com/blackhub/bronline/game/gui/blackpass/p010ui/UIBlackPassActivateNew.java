package com.blackhub.bronline.game.gui.blackpass.p010ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.databinding.LayoutBlackPassPremiumActivateBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassUtils;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.bless.client.R;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIBlackPassActivateNew.kt */
@StabilityInferred(parameters = 0)
@Deprecated(message = "удалить после тестов")
@SourceDebugExtension({"SMAP\nUIBlackPassActivateNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIBlackPassActivateNew.kt\ncom/blackhub/bronline/game/gui/blackpass/ui/UIBlackPassActivateNew\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,288:1\n106#2,15:289\n106#2,15:304\n106#2,15:319\n106#2,15:334\n41#3,2:349\n115#3:351\n74#3,2:352\n87#3:354\n74#3,4:355\n76#3,2:359\n43#3:361\n41#3,2:362\n115#3:364\n74#3,2:365\n87#3:367\n74#3,4:368\n76#3,2:372\n43#3:374\n41#3,2:375\n115#3:377\n74#3,2:378\n87#3:380\n74#3,4:381\n76#3,2:385\n43#3:387\n*S KotlinDebug\n*F\n+ 1 UIBlackPassActivateNew.kt\ncom/blackhub/bronline/game/gui/blackpass/ui/UIBlackPassActivateNew\n*L\n33#1:289,15\n34#1:304,15\n35#1:319,15\n36#1:334,15\n100#1:349,2\n102#1:351\n102#1:352,2\n103#1:354\n103#1:355,4\n102#1:359,2\n100#1:361\n109#1:362,2\n111#1:364\n111#1:365,2\n112#1:367\n112#1:368,4\n111#1:372,2\n109#1:374\n121#1:375,2\n125#1:377\n125#1:378,2\n126#1:380\n126#1:381,4\n125#1:385,2\n121#1:387\n*E\n"})
/* loaded from: classes2.dex */
public final class UIBlackPassActivateNew extends BaseFragment<LayoutBlackPassPremiumActivateBinding> {
    public static final int $stable = 8;

    /* renamed from: activateViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy activateViewModel;

    /* renamed from: blackPassPrizeListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassPrizeListViewModel;

    /* renamed from: blackPassViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassViewModel;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;
    public boolean isActivePremium;
    public int premiumDeluxePrice;
    public int premiumPrice;

    public static final /* synthetic */ LayoutBlackPassPremiumActivateBinding access$getBinding(UIBlackPassActivateNew uIBlackPassActivateNew) {
        return uIBlackPassActivateNew.getBinding();
    }

    public UIBlackPassActivateNew() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$activateViewModel$2
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$1
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
        this.activateViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassActivateViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$depositCoinsViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$blackPassViewModel$2
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$9
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
        this.blackPassViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        final Function0<ViewModelStoreOwner> function05 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$blackPassPrizeListViewModel$2
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
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.blackPassPrizeListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassPrizeListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$14
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function02;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$special$$inlined$viewModels$default$16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.premiumPrice = 599;
        this.premiumDeluxePrice = BlackPassUtils.DEFAULT_DELUXE_PRICE;
    }

    public final BlackPassActivateViewModel getActivateViewModel() {
        return (BlackPassActivateViewModel) this.activateViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    public final BlackPassMainViewModel getBlackPassViewModel() {
        return (BlackPassMainViewModel) this.blackPassViewModel.getValue();
    }

    private final BlackPassPrizeListViewModel getBlackPassPrizeListViewModel() {
        return (BlackPassPrizeListViewModel) this.blackPassPrizeListViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public LayoutBlackPassPremiumActivateBinding getViewBinding() {
        LayoutBlackPassPremiumActivateBinding layoutBlackPassPremiumActivateBindingInflate = LayoutBlackPassPremiumActivateBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(layoutBlackPassPremiumActivateBindingInflate, "inflate(...)");
        return layoutBlackPassPremiumActivateBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        updateDeluxePrize();
        initDefaultPrices();
        updateTextTitle();
        updatePrizeText();
        setObservers();
        initClickListeners();
        initComposeAnimateBlock();
        getBinding().getRoot().setClickable(true);
        getBinding().getRoot().setFocusable(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        clearViewModel();
        super.onDestroyView();
    }

    private final void clearViewModel() {
        getActivateViewModel().clearViewModel();
    }

    public final void updateDeluxePrize() {
        getBinding().bannerBonusTitleText4.setText((CharSequence) UtilsKt.buildTypeMerge(getString(R.string.banner_title_prize_deluxe_site), getString(R.string.banner_title_prize_deluxe_market)));
    }

    public final void initDefaultPrices() {
        ImageView imageView = getBinding().bannerBonusIcon5;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        imageView.setImageBitmap(BitmapUtilsKt.getBitmapFromZip$default(contextRequireContext, "ic_dust.svg", ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null));
        getBinding().btnPurchasePremium.setEnabled(false);
        getBinding().btnPurchasePremiumDeluxe.setEnabled(false);
        String string = getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(this.premiumPrice)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setPremiumPrice(string);
        setPremiumDeluxePrice(this.premiumDeluxePrice);
    }

    public final void setPremiumPrice(String value) {
        getBinding().btnPurchasePremium.setText(value);
    }

    public final void setPremiumDeluxePrice(int value) {
        getBinding().btnPurchasePremiumDeluxe.setText(getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(value))));
    }

    public final void updateTextTitle() {
        LayoutBlackPassPremiumActivateBinding binding = getBinding();
        TextView textView = binding.tvPremiumSubtitle;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.black_pass_premium_subtitle_1));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(getResources(), R.color.yellow, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.black_pass_premium_subtitle_2));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(new SpannedString(spannableStringBuilder));
        TextView textView2 = binding.tvPremiumDeluxeSubtitle;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) getString(R.string.black_pass_premium_deluxe_subtitle_1));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(ResourcesCompat.getColor(getResources(), R.color.yellow, null));
        int length3 = spannableStringBuilder2.length();
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length4 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) getString(R.string.black_pass_premium_title));
        spannableStringBuilder2.setSpan(styleSpan2, length4, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.setSpan(foregroundColorSpan2, length3, spannableStringBuilder2.length(), 17);
        textView2.setText(new SpannedString(spannableStringBuilder2));
    }

    public final void updatePrizeText() {
        TextView textView = getBinding().bannerBonusTitleText1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.banner_title_prize_1_1));
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder.append('\n'), "append(...)");
        spannableStringBuilder.append((CharSequence) getString(R.string.banner_title_prize_1_3));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(getResources(), R.color.red, null));
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.banner_title_prize_1_4));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(new SpannedString(spannableStringBuilder));
    }

    /* compiled from: UIBlackPassActivateNew.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$1", m7120f = "UIBlackPassActivateNew.kt", m7121i = {}, m7122l = {138}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$1 */
    public static final class C37201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37201(Continuation<? super C37201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIBlackPassActivateNew.this.new C37201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> premiumPrice = UIBlackPassActivateNew.this.getActivateViewModel().getPremiumPrice();
                Lifecycle lifecycle = UIBlackPassActivateNew.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(premiumPrice, lifecycle, Lifecycle.State.STARTED);
                final UIBlackPassActivateNew uIBlackPassActivateNew = UIBlackPassActivateNew.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        if (!uIBlackPassActivateNew.isActivePremium) {
                            UIBlackPassActivateNew uIBlackPassActivateNew2 = uIBlackPassActivateNew;
                            String string = uIBlackPassActivateNew2.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(i2)));
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            uIBlackPassActivateNew2.setPremiumPrice(string);
                            uIBlackPassActivateNew.premiumPrice = i2;
                            UIBlackPassActivateNew.access$getBinding(uIBlackPassActivateNew).btnPurchasePremium.setEnabled(true);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37201(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37212(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37223(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37234(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37245(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37256(null), 3, null);
    }

    /* compiled from: UIBlackPassActivateNew.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$2", m7120f = "UIBlackPassActivateNew.kt", m7121i = {}, m7122l = {156}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$2 */
    public static final class C37212 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37212(Continuation<? super C37212> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIBlackPassActivateNew.this.new C37212(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> premiumDeluxePrice = UIBlackPassActivateNew.this.getActivateViewModel().getPremiumDeluxePrice();
                Lifecycle lifecycle = UIBlackPassActivateNew.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(premiumDeluxePrice, lifecycle, Lifecycle.State.STARTED);
                final UIBlackPassActivateNew uIBlackPassActivateNew = UIBlackPassActivateNew.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        uIBlackPassActivateNew.setPremiumDeluxePrice(i2);
                        uIBlackPassActivateNew.premiumDeluxePrice = i2;
                        UIBlackPassActivateNew.access$getBinding(uIBlackPassActivateNew).btnPurchasePremiumDeluxe.setEnabled(true);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UIBlackPassActivateNew.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$3", m7120f = "UIBlackPassActivateNew.kt", m7121i = {}, m7122l = {200}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$3 */
    public static final class C37223 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37223(Continuation<? super C37223> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIBlackPassActivateNew.this.new C37223(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37223) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsCloseInterface = UIBlackPassActivateNew.this.getActivateViewModel().isCloseInterface();
                Lifecycle lifecycle = UIBlackPassActivateNew.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(stateFlowIsCloseInterface, lifecycle, Lifecycle.State.STARTED);
                final UIBlackPassActivateNew uIBlackPassActivateNew = UIBlackPassActivateNew.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            uIBlackPassActivateNew.getParentFragmentManager().popBackStack();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UIBlackPassActivateNew.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$4", m7120f = "UIBlackPassActivateNew.kt", m7121i = {}, m7122l = {Cea708Decoder.CueInfoBuilder.HORIZONTAL_SIZE}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$4 */
    public static final class C37234 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37234(Continuation<? super C37234> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIBlackPassActivateNew.this.new C37234(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37234) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Bitmap> imgOfferSplit = UIBlackPassActivateNew.this.getActivateViewModel().getImgOfferSplit();
                Lifecycle lifecycle = UIBlackPassActivateNew.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(imgOfferSplit, lifecycle, Lifecycle.State.STARTED);
                final UIBlackPassActivateNew uIBlackPassActivateNew = UIBlackPassActivateNew.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.setObservers.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Bitmap) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable Bitmap bitmap, @NotNull Continuation<? super Unit> continuation) {
                        UIBlackPassActivateNew.access$getBinding(uIBlackPassActivateNew).imgPremiumPrize.setImageBitmap(bitmap);
                        UIBlackPassActivateNew.access$getBinding(uIBlackPassActivateNew).bannerBonusIcon3.setImageBitmap(bitmap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UIBlackPassActivateNew.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$5", m7120f = "UIBlackPassActivateNew.kt", m7121i = {}, m7122l = {219}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$5 */
    public static final class C37245 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37245(Continuation<? super C37245> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIBlackPassActivateNew.this.new C37245(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37245) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Bitmap> imgDeluxeCar = UIBlackPassActivateNew.this.getActivateViewModel().getImgDeluxeCar();
                Lifecycle lifecycle = UIBlackPassActivateNew.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(imgDeluxeCar, lifecycle, Lifecycle.State.STARTED);
                final UIBlackPassActivateNew uIBlackPassActivateNew = UIBlackPassActivateNew.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.setObservers.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Bitmap) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable Bitmap bitmap, @NotNull Continuation<? super Unit> continuation) {
                        UIBlackPassActivateNew.access$getBinding(uIBlackPassActivateNew).bannerBonusIcon4.setImageBitmap(bitmap);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UIBlackPassActivateNew.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$6", m7120f = "UIBlackPassActivateNew.kt", m7121i = {}, m7122l = {228}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$setObservers$6 */
    public static final class C37256 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37256(Continuation<? super C37256> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIBlackPassActivateNew.this.new C37256(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37256) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<String> nameDeluxeCar = UIBlackPassActivateNew.this.getActivateViewModel().getNameDeluxeCar();
                Lifecycle lifecycle = UIBlackPassActivateNew.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(nameDeluxeCar, lifecycle, Lifecycle.State.STARTED);
                final UIBlackPassActivateNew uIBlackPassActivateNew = UIBlackPassActivateNew.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.setObservers.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        UIBlackPassActivateNew.access$getBinding(uIBlackPassActivateNew).bannerBonusTitleText4.setText(str);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initPremiumClickListener(final boolean isActiveButton) {
        TextView btnPurchasePremium = getBinding().btnPurchasePremium;
        Intrinsics.checkNotNullExpressionValue(btnPurchasePremium, "btnPurchasePremium");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, btnPurchasePremium, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew.initPremiumClickListener.1
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
                if (isActiveButton) {
                    BlackPassMainViewModel blackPassViewModel = this.getBlackPassViewModel();
                    String string = this.getString(R.string.black_pass_activate_text_body);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    int i = this.premiumPrice;
                    String string2 = this.getString(R.string.common_bc);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = this.getString(R.string.common_confirmation);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string4 = this.getString(R.string.common_yes);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    String string5 = this.getString(R.string.common_no);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    BlackPassMainViewModel.showDialogConfirmation$default(blackPassViewModel, null, string, i, null, string2, string3, string4, string5, 3, 9, null);
                    this.getDepositCoinsViewModel().saveIntermediatePremiumPrice(this.premiumPrice);
                }
            }
        }, 1, null);
    }

    private final void initClickListeners() {
        LayoutBlackPassPremiumActivateBinding binding = getBinding();
        TextView btnPurchasePremiumDeluxe = binding.btnPurchasePremiumDeluxe;
        Intrinsics.checkNotNullExpressionValue(btnPurchasePremiumDeluxe, "btnPurchasePremiumDeluxe");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, btnPurchasePremiumDeluxe, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initClickListeners$1$1
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
                BlackPassMainViewModel blackPassViewModel = this.this$0.getBlackPassViewModel();
                String string = this.this$0.getString(R.string.black_pass_activate_text_body);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int i = this.this$0.premiumDeluxePrice;
                String string2 = this.this$0.getString(R.string.common_bc);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = this.this$0.getString(R.string.common_confirmation);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = this.this$0.getString(R.string.common_yes);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                String string5 = this.this$0.getString(R.string.common_no);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                BlackPassMainViewModel.showDialogConfirmation$default(blackPassViewModel, null, string, i, null, string2, string3, string4, string5, 4, 9, null);
                this.this$0.getDepositCoinsViewModel().saveIntermediatePremiumPrice(this.this$0.premiumDeluxePrice);
            }
        }, 1, null);
        ImageButton imgbShowPremiumPrizes = binding.imgbShowPremiumPrizes;
        Intrinsics.checkNotNullExpressionValue(imgbShowPremiumPrizes, "imgbShowPremiumPrizes");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, imgbShowPremiumPrizes, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initClickListeners$1$2
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
                this.this$0.showPrizesList();
            }
        }, 1, null);
        ImageButton imgbShowPremiumDeluxePrizes = binding.imgbShowPremiumDeluxePrizes;
        Intrinsics.checkNotNullExpressionValue(imgbShowPremiumDeluxePrizes, "imgbShowPremiumDeluxePrizes");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, imgbShowPremiumDeluxePrizes, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.ui.UIBlackPassActivateNew$initClickListeners$1$3
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
                this.this$0.showPrizesList();
            }
        }, 1, null);
    }

    public final void showPrizesList() {
        getBlackPassPrizeListViewModel().isNeedShowDialog();
    }

    public final void initComposeAnimateBlock() {
        ComposeView composeView = getBinding().composeViewBlackPassBgEffect;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableSingletons$UIBlackPassActivateNewKt.INSTANCE.m14427getLambda1$app_siteRelease());
    }
}

