package com.blackhub.bronline.game.gui.donate.p011ui;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateServicesLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.donate.adapters.DonateServiceAdapter;
import com.blackhub.bronline.game.gui.donate.adapters.DonateTileAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.DonateTileObj;
import com.blackhub.bronline.game.gui.donate.utils.DonateConstants;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import com.bless.client.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
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

/* compiled from: UILayoutDonateServices.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUILayoutDonateServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonateServices.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateServices\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,159:1\n106#2,15:160\n106#2,15:175\n*S KotlinDebug\n*F\n+ 1 UILayoutDonateServices.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateServices\n*L\n32#1:160,15\n33#1:175,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonateServices extends BaseFragment<DonateServicesLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public DonateTileAdapter donateCurrentService;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    @Nullable
    public DonateServiceAdapter donateServiceAdapter;

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext;

    /* renamed from: serviceViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy serviceViewModel;

    public UILayoutDonateServices() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$donateMainViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$1
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$serviceViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$5
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
        this.serviceViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateServiceViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$special$$inlined$viewModels$default$8
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
        this.fragmentContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$fragmentContext$2
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DonateServiceViewModel getServiceViewModel() {
        return (DonateServiceViewModel) this.serviceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateServicesLayoutBinding getViewBinding() {
        DonateServicesLayoutBinding donateServicesLayoutBindingInflate = DonateServicesLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(donateServicesLayoutBindingInflate, "inflate(...)");
        return donateServicesLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        serObservers();
    }

    /* compiled from: UILayoutDonateServices.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$serObservers$1", m7120f = "UILayoutDonateServices.kt", m7121i = {}, m7122l = {51}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$serObservers$1 */
    public static final class C39141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39141(Continuation<? super C39141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonateServices.this.new C39141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<DonateItem>> serviceItems = UILayoutDonateServices.this.getServiceViewModel().getServiceItems();
                Lifecycle lifecycle = UILayoutDonateServices.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(serviceItems, lifecycle, Lifecycle.State.STARTED);
                final UILayoutDonateServices uILayoutDonateServices = UILayoutDonateServices.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices.serObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<DonateItem>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<DonateItem> list, @NotNull Continuation<? super Unit> continuation) {
                        if (!list.isEmpty()) {
                            uILayoutDonateServices.initAndAttachCurrentService();
                            uILayoutDonateServices.initAndAttachServices(list);
                            uILayoutDonateServices.updateCurrentItem(list.get(0));
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

    public final void serObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39141(null), 3, null);
    }

    public final void initAndAttachCurrentService() {
        Context fragmentContext = getFragmentContext();
        Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
        this.donateCurrentService = new DonateTileAdapter((int) (getValueOfWidthPixels() * 1.4d), true, fragmentContext);
        initButtonClickListener();
        RecyclerView recyclerView = getBinding().donateServiceCurrentItem;
        final Context fragmentContext2 = getFragmentContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentContext2) { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices$initAndAttachCurrentService$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        recyclerView.setAdapter(this.donateCurrentService);
    }

    public final int getValueOfWidthPixels() {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) getFragmentContext().getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            return currentWindowMetrics.getBounds().width();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final void initButtonClickListener() {
        DonateTileAdapter donateTileAdapter = this.donateCurrentService;
        if (donateTileAdapter == null) {
            return;
        }
        donateTileAdapter.setButtonClickListener(new Function5<Integer, DonateItem, Integer, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices.initButtonClickListener.1
            {
                super(5);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, DonateItem donateItem, Integer num2, Integer num3, View view) {
                invoke(num.intValue(), donateItem, num2.intValue(), num3.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(final int i, @NotNull final DonateItem currentItem, int i2, final int i3, @NotNull View view) {
                Intrinsics.checkNotNullParameter(currentItem, "currentItem");
                Intrinsics.checkNotNullParameter(view, "view");
                final UILayoutDonateServices uILayoutDonateServices = UILayoutDonateServices.this;
                uILayoutDonateServices.startAnimAndDelay(view, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices.initButtonClickListener.1.1
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
                        DonateMainViewModel donateMainViewModel = uILayoutDonateServices.getDonateMainViewModel();
                        DonateItem donateItem = currentItem;
                        int i4 = i3;
                        int i5 = i;
                        UILayoutDonateServices uILayoutDonateServices2 = uILayoutDonateServices;
                        donateMainViewModel.setBLockTimer(System.currentTimeMillis());
                        donateMainViewModel.saveCurrentItem(donateItem, i4);
                        if (i5 == 7) {
                            String string = uILayoutDonateServices2.getFragmentContext().getString(R.string.donate_action_buy_item);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String priceText = DonateUtilsKt.getPriceText(donateItem);
                            String string2 = uILayoutDonateServices2.getFragmentContext().getString(R.string.common_confirmation);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = uILayoutDonateServices2.getFragmentContext().getString(R.string.common_yes);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = uILayoutDonateServices2.getFragmentContext().getString(R.string.common_no);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            donateMainViewModel.showDialogConfirmation(string, i4, priceText, string2, string3, string4, null);
                        }
                    }
                });
            }
        });
    }

    public final void initAndAttachServices(List<DonateItem> serviceItems) {
        this.donateServiceAdapter = new DonateServiceAdapter(serviceItems);
        RecyclerView recyclerView = getBinding().donateServicesRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(getFragmentContext(), 1, false));
        recyclerView.setAdapter(this.donateServiceAdapter);
        initServiceClickListener();
    }

    public final void initServiceClickListener() {
        DonateServiceAdapter donateServiceAdapter = this.donateServiceAdapter;
        if (donateServiceAdapter == null) {
            return;
        }
        donateServiceAdapter.setServiceItemClickListener(new Function2<DonateItem, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateServices.initServiceClickListener.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(DonateItem donateItem, Integer num) {
                invoke(donateItem, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DonateItem currentObject, int i) {
                Intrinsics.checkNotNullParameter(currentObject, "currentObject");
                DonateServiceAdapter donateServiceAdapter2 = UILayoutDonateServices.this.donateServiceAdapter;
                if (donateServiceAdapter2 != null) {
                    donateServiceAdapter2.updateSelectItem(i);
                }
                UILayoutDonateServices.this.updateCurrentItem(currentObject);
                Log.v(DonateConstants.DONATE_LOG, currentObject.toString());
            }
        });
    }

    public final void updateCurrentItem(DonateItem currentItem) {
        DonateTileAdapter donateTileAdapter = this.donateCurrentService;
        if (donateTileAdapter != null) {
            donateTileAdapter.initBodyItems(new DonateTileObj(CollectionsKt__CollectionsJVMKt.listOf(currentItem), 5));
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        refreshSelectedItem();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void refreshSelectedItem() {
        DonateServiceAdapter donateServiceAdapter = this.donateServiceAdapter;
        if (donateServiceAdapter != null) {
            donateServiceAdapter.refreshSelectedItem();
        }
    }

    private final void setNullableParameters() {
        this.donateServiceAdapter = null;
        this.donateCurrentService = null;
    }
}

