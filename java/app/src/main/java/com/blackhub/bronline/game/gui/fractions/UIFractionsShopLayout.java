package com.blackhub.bronline.game.gui.fractions;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionsShopLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsShopAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopList;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsShopViewModel;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: UIFractionsShopLayout.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIFractionsShopLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionsShopLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsShopLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,45:1\n106#2,15:46\n*S KotlinDebug\n*F\n+ 1 UIFractionsShopLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionsShopLayout\n*L\n14#1:46,15\n*E\n"})

public final class UIFractionsShopLayout extends BaseFragment<FractionsShopLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: shopViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy shopViewModel;

    public UIFractionsShopLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$shopViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$special$$inlined$viewModels$default$1
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
        this.shopViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsShopViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$special$$inlined$viewModels$default$4
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

    public final FractionsShopViewModel getShopViewModel() {
        return (FractionsShopViewModel) this.shopViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionsShopLayoutBinding getViewBinding() {
        FractionsShopLayoutBinding fractionsShopLayoutBindingInflate = FractionsShopLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fractionsShopLayoutBindingInflate, "inflate(...)");
        return fractionsShopLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupRecyclerView();
        setupObservers();
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = getBinding().recyclerViewShop;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3, 1, false));
    }

    /* compiled from: UIFractionsShopLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", IFramePlayerOptions.Builder.LIST, "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$setupObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C40761 extends Lambda implements Function1<FractionsShopList, Unit> {
        public C40761() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FractionsShopList fractionsShopList) {
            invoke2(fractionsShopList);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(FractionsShopList fractionsShopList) {
            if (fractionsShopList != null) {
                UIFractionsShopLayout.this.setupShopAdapter(fractionsShopList);
            }
        }
    }

    private final void setupObservers() {
        getShopViewModel().getShopListLiveData().observe(getViewLifecycleOwner(), new UIFractionsShopLayout$sam$androidx_lifecycle_Observer$0(new Function1<FractionsShopList, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout.setupObservers.1
            public C40761() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsShopList fractionsShopList) {
                invoke2(fractionsShopList);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(FractionsShopList fractionsShopList) {
                if (fractionsShopList != null) {
                    UIFractionsShopLayout.this.setupShopAdapter(fractionsShopList);
                }
            }
        }));
    }

    public final void setupShopAdapter(FractionsShopList fractionsShopList) {
        RecyclerView recyclerView = getBinding().recyclerViewShop;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        FractionsShopAdapter fractionsShopAdapter = new FractionsShopAdapter(fractionsShopList, fragmentActivityRequireActivity);
        fractionsShopAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionsShopLayout$setupShopAdapter$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) throws JSONException {
                this.this$0.getShopViewModel().sendItemPressed(i);
            }
        });
        recyclerView.setAdapter(fractionsShopAdapter);
    }
}

