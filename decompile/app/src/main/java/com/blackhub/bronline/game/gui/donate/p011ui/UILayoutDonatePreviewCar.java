package com.blackhub.bronline.game.gui.donate.p011ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.DonateCarPreviewLayoutBinding;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonateCarColorAdapter;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.utils.DonateUtilsKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UILayoutDonatePreviewCar.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J*\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006*"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/DonateCarPreviewLayoutBinding;", "()V", "blockTimer", "", "donateCarColorAdapter", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateCarColorAdapter;", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainViewModel$delegate", "Lkotlin/Lazy;", "jniActivityViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getJniActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "jniActivityViewModel$delegate", FirebaseAnalytics.Param.PRICE, "", "getPrice", "()I", "setPrice", "(I)V", "getViewBinding", "initOnClickListeners", "", "initOnColorClickListenerFromAdapter", "initRecyclerView", "initStartData", "initViews", "onDestroyView", "setDonateMainVMObservers", "setImageForItem", "image", "Landroid/widget/ImageView;", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "color1", "color2", "setupJNIActivityVMObservers", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutDonatePreviewCar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonatePreviewCar.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,223:1\n172#2,9:224\n106#2,15:233\n*S KotlinDebug\n*F\n+ 1 UILayoutDonatePreviewCar.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar\n*L\n30#1:224,9\n31#1:233,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewCar extends BaseFragment<DonateCarPreviewLayoutBinding> {
    public static final int $stable = 8;
    public long blockTimer;

    @Nullable
    public DonateCarColorAdapter donateCarColorAdapter;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;
    public int price;

    public UILayoutDonatePreviewCar() {
        final Function0 function0 = null;
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<ViewModelStoreOwner> function02 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$donateMainViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$1
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$special$$inlined$viewModels$default$4
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

    public static final /* synthetic */ DonateCarPreviewLayoutBinding access$getBinding(UILayoutDonatePreviewCar uILayoutDonatePreviewCar) {
        return uILayoutDonatePreviewCar.getBinding();
    }

    public final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateCarPreviewLayoutBinding getViewBinding() {
        DonateCarPreviewLayoutBinding donateCarPreviewLayoutBindingInflate = DonateCarPreviewLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(donateCarPreviewLayoutBindingInflate, "inflate(...)");
        return donateCarPreviewLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupJNIActivityVMObservers();
        this.blockTimer = System.currentTimeMillis();
        setDonateMainVMObservers();
        initRecyclerView();
        initOnClickListeners();
        initStartData();
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1", m7120f = "UILayoutDonatePreviewCar.kt", m7121i = {}, m7122l = {54}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1 */
    public static final class C39041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39041(Continuation<? super C39041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonatePreviewCar.this.new C39041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = UILayoutDonatePreviewCar.this.getJniActivityViewModel().getConfigurationJsons();
                Lifecycle lifecycle = UILayoutDonatePreviewCar.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.setupJNIActivityVMObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                        DonateCarColorAdapter donateCarColorAdapter;
                        List<CarColorItem> carColorItems = configurationJsonModel.getCarColorItems();
                        if (!carColorItems.isEmpty()) {
                            Iterator<T> it = carColorItems.iterator();
                            while (it.hasNext()) {
                                ((CarColorItem) it.next()).setSelected(false);
                            }
                            carColorItems.get(0).setSelected(true);
                        }
                        if (uILayoutDonatePreviewCar.donateCarColorAdapter != null && (donateCarColorAdapter = uILayoutDonatePreviewCar.donateCarColorAdapter) != null) {
                            donateCarColorAdapter.setCarColors(carColorItems);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UILayoutDonatePreviewCar.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "configurationJsons", "Lcom/blackhub/bronline/game/core/model/ConfigurationJsonModel;", "emit", "(Lcom/blackhub/bronline/game/core/model/ConfigurationJsonModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nUILayoutDonatePreviewCar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonatePreviewCar.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1855#2,2:224\n*S KotlinDebug\n*F\n+ 1 UILayoutDonatePreviewCar.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1$1\n*L\n58#1:224,2\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setupJNIActivityVMObservers$1$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                DonateCarColorAdapter donateCarColorAdapter;
                List<CarColorItem> carColorItems = configurationJsonModel.getCarColorItems();
                if (!carColorItems.isEmpty()) {
                    Iterator<T> it = carColorItems.iterator();
                    while (it.hasNext()) {
                        ((CarColorItem) it.next()).setSelected(false);
                    }
                    carColorItems.get(0).setSelected(true);
                }
                if (uILayoutDonatePreviewCar.donateCarColorAdapter != null && (donateCarColorAdapter = uILayoutDonatePreviewCar.donateCarColorAdapter) != null) {
                    donateCarColorAdapter.setCarColors(carColorItems);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void setupJNIActivityVMObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39041(null), 3, null);
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$1", m7120f = "UILayoutDonatePreviewCar.kt", m7121i = {}, m7122l = {72}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$1 */
    public static final class C39011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39011(Continuation<? super C39011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonatePreviewCar.this.new C39011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> colorPrice = UILayoutDonatePreviewCar.this.getDonateMainViewModel().getColorPrice();
                Lifecycle lifecycle = UILayoutDonatePreviewCar.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(colorPrice, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.setDonateMainVMObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        DonateCarColorAdapter donateCarColorAdapter;
                        if (uILayoutDonatePreviewCar.donateCarColorAdapter != null && (donateCarColorAdapter = uILayoutDonatePreviewCar.donateCarColorAdapter) != null) {
                            donateCarColorAdapter.setPriceForColour(i2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UILayoutDonatePreviewCar.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "colorPrice", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$1$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                DonateCarColorAdapter donateCarColorAdapter;
                if (uILayoutDonatePreviewCar.donateCarColorAdapter != null && (donateCarColorAdapter = uILayoutDonatePreviewCar.donateCarColorAdapter) != null) {
                    donateCarColorAdapter.setPriceForColour(i2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void setDonateMainVMObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39011(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39022(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39033(null), 3, null);
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$2", m7120f = "UILayoutDonatePreviewCar.kt", m7121i = {}, m7122l = {81}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$2 */
    public static final class C39022 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39022(Continuation<? super C39022> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonatePreviewCar.this.new C39022(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> currentPrice = UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentPrice();
                Lifecycle lifecycle = UILayoutDonatePreviewCar.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(currentPrice, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.setDonateMainVMObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar).button.setText(uILayoutDonatePreviewCar.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(i2))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UILayoutDonatePreviewCar.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "currentPrice", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$2$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar).button.setText(uILayoutDonatePreviewCar.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(i2))));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$3", m7120f = "UILayoutDonatePreviewCar.kt", m7121i = {}, m7122l = {88}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$3 */
    public static final class C39033 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39033(Continuation<? super C39033> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonatePreviewCar.this.new C39033(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39033) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DonateItem> currentItem = UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem();
                Lifecycle lifecycle = UILayoutDonatePreviewCar.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(currentItem, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.setDonateMainVMObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DonateItem) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DonateItem donateItem, @NotNull Continuation<? super Unit> continuation) {
                        if (IntExtensionKt.isNotZero(Boxing.boxInt(donateItem.getSalePercent()))) {
                            TextView textView = UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar).priceStroked;
                            UILayoutDonatePreviewCar uILayoutDonatePreviewCar = uILayoutDonatePreviewCar;
                            textView.setPaintFlags(16);
                            textView.setText(uILayoutDonatePreviewCar.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(donateItem.getBasePrice())));
                        }
                        DonateCarPreviewLayoutBinding donateCarPreviewLayoutBindingAccess$getBinding = UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar);
                        UILayoutDonatePreviewCar uILayoutDonatePreviewCar2 = uILayoutDonatePreviewCar;
                        donateCarPreviewLayoutBindingAccess$getBinding.donateCarPreviewName.setText(uILayoutDonatePreviewCar2.getString(R.string.common_double_string_values, UtilsKt.buildTypeMerge(donateItem.getHeader(), donateItem.getHeaderStore()), UtilsKt.buildTypeMerge(donateItem.getSubheader(), donateItem.getSubheaderStore())));
                        if (donateItem.getSpecs() != null) {
                            ArrayList<Integer> specs = donateItem.getSpecs();
                            IntRange indices = specs != null ? CollectionsKt__CollectionsKt.getIndices(specs) : null;
                            Intrinsics.checkNotNull(indices);
                            int first = indices.getFirst();
                            int last = indices.getLast();
                            if (first <= last) {
                                while (true) {
                                    if (first == 0) {
                                        ProgressBar progressBar = donateCarPreviewLayoutBindingAccess$getBinding.progressMax;
                                        ArrayList<Integer> specs2 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs2);
                                        Integer num = specs2.get(first);
                                        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
                                        progressBar.setProgress(num.intValue());
                                        TextView textView2 = donateCarPreviewLayoutBindingAccess$getBinding.textMax;
                                        ArrayList<Integer> specs3 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs3);
                                        textView2.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_km_h, specs3.get(first)));
                                    } else if (first == 1) {
                                        ProgressBar progressBar2 = donateCarPreviewLayoutBindingAccess$getBinding.progress0100;
                                        ArrayList<Integer> specs4 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs4);
                                        Integer num2 = specs4.get(first);
                                        Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
                                        progressBar2.setProgress(num2.intValue());
                                        TextView textView3 = donateCarPreviewLayoutBindingAccess$getBinding.text0100;
                                        ArrayList<Integer> specs5 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs5);
                                        textView3.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_sec, specs5.get(first)));
                                    } else if (first == 2) {
                                        ProgressBar progressBar3 = donateCarPreviewLayoutBindingAccess$getBinding.progressCapacity;
                                        ArrayList<Integer> specs6 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs6);
                                        Integer num3 = specs6.get(first);
                                        Intrinsics.checkNotNullExpressionValue(num3, "get(...)");
                                        progressBar3.setProgress(num3.intValue());
                                        TextView textView4 = donateCarPreviewLayoutBindingAccess$getBinding.textCapacity;
                                        ArrayList<Integer> specs7 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs7);
                                        textView4.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_people, specs7.get(first)));
                                    } else if (first == 3) {
                                        ProgressBar progressBar4 = donateCarPreviewLayoutBindingAccess$getBinding.progressTrunk;
                                        ArrayList<Integer> specs8 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs8);
                                        Integer num4 = specs8.get(first);
                                        Intrinsics.checkNotNullExpressionValue(num4, "get(...)");
                                        progressBar4.setProgress(num4.intValue());
                                        TextView textView5 = donateCarPreviewLayoutBindingAccess$getBinding.textTrunk;
                                        ArrayList<Integer> specs9 = donateItem.getSpecs();
                                        Intrinsics.checkNotNull(specs9);
                                        textView5.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_kilos, specs9.get(first)));
                                    }
                                    if (first == last) {
                                        break;
                                    }
                                    first++;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UILayoutDonatePreviewCar.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "emit", "(Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$setDonateMainVMObservers$3$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((DonateItem) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull DonateItem donateItem, @NotNull Continuation<? super Unit> continuation) {
                if (IntExtensionKt.isNotZero(Boxing.boxInt(donateItem.getSalePercent()))) {
                    TextView textView = UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar).priceStroked;
                    UILayoutDonatePreviewCar uILayoutDonatePreviewCar = uILayoutDonatePreviewCar;
                    textView.setPaintFlags(16);
                    textView.setText(uILayoutDonatePreviewCar.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(donateItem.getBasePrice())));
                }
                DonateCarPreviewLayoutBinding donateCarPreviewLayoutBindingAccess$getBinding = UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar);
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar2 = uILayoutDonatePreviewCar;
                donateCarPreviewLayoutBindingAccess$getBinding.donateCarPreviewName.setText(uILayoutDonatePreviewCar2.getString(R.string.common_double_string_values, UtilsKt.buildTypeMerge(donateItem.getHeader(), donateItem.getHeaderStore()), UtilsKt.buildTypeMerge(donateItem.getSubheader(), donateItem.getSubheaderStore())));
                if (donateItem.getSpecs() != null) {
                    ArrayList<Integer> specs = donateItem.getSpecs();
                    IntRange indices = specs != null ? CollectionsKt__CollectionsKt.getIndices(specs) : null;
                    Intrinsics.checkNotNull(indices);
                    int first = indices.getFirst();
                    int last = indices.getLast();
                    if (first <= last) {
                        while (true) {
                            if (first == 0) {
                                ProgressBar progressBar = donateCarPreviewLayoutBindingAccess$getBinding.progressMax;
                                ArrayList<Integer> specs2 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs2);
                                Integer num = specs2.get(first);
                                Intrinsics.checkNotNullExpressionValue(num, "get(...)");
                                progressBar.setProgress(num.intValue());
                                TextView textView2 = donateCarPreviewLayoutBindingAccess$getBinding.textMax;
                                ArrayList<Integer> specs3 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs3);
                                textView2.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_km_h, specs3.get(first)));
                            } else if (first == 1) {
                                ProgressBar progressBar2 = donateCarPreviewLayoutBindingAccess$getBinding.progress0100;
                                ArrayList<Integer> specs4 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs4);
                                Integer num2 = specs4.get(first);
                                Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
                                progressBar2.setProgress(num2.intValue());
                                TextView textView3 = donateCarPreviewLayoutBindingAccess$getBinding.text0100;
                                ArrayList<Integer> specs5 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs5);
                                textView3.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_sec, specs5.get(first)));
                            } else if (first == 2) {
                                ProgressBar progressBar3 = donateCarPreviewLayoutBindingAccess$getBinding.progressCapacity;
                                ArrayList<Integer> specs6 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs6);
                                Integer num3 = specs6.get(first);
                                Intrinsics.checkNotNullExpressionValue(num3, "get(...)");
                                progressBar3.setProgress(num3.intValue());
                                TextView textView4 = donateCarPreviewLayoutBindingAccess$getBinding.textCapacity;
                                ArrayList<Integer> specs7 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs7);
                                textView4.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_people, specs7.get(first)));
                            } else if (first == 3) {
                                ProgressBar progressBar4 = donateCarPreviewLayoutBindingAccess$getBinding.progressTrunk;
                                ArrayList<Integer> specs8 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs8);
                                Integer num4 = specs8.get(first);
                                Intrinsics.checkNotNullExpressionValue(num4, "get(...)");
                                progressBar4.setProgress(num4.intValue());
                                TextView textView5 = donateCarPreviewLayoutBindingAccess$getBinding.textTrunk;
                                ArrayList<Integer> specs9 = donateItem.getSpecs();
                                Intrinsics.checkNotNull(specs9);
                                textView5.setText(uILayoutDonatePreviewCar2.getString(R.string.donate_car_preview_kilos, specs9.get(first)));
                            }
                            if (first == last) {
                                break;
                            }
                            first++;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$initOnClickListeners$1 */
    /* loaded from: classes2.dex */
    public static final class C38981 extends Lambda implements Function0<Unit> {
        public C38981() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutDonatePreviewCar.this.getParentFragmentManager().popBackStack();
        }
    }

    public final void initOnClickListeners() {
        AppCompatButton donateButtonBack = getBinding().donateButtonBack;
        Intrinsics.checkNotNullExpressionValue(donateButtonBack, "donateButtonBack");
        setOnClickListenerWithAnimAndDelay(donateButtonBack, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.initOnClickListeners.1
            public C38981() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutDonatePreviewCar.this.getParentFragmentManager().popBackStack();
            }
        });
        AppCompatButton button = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, button, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.initOnClickListeners.2
            public C38992() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                DonateMainViewModel donateMainViewModel = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
                String string = UILayoutDonatePreviewCar.this.getString(R.string.donate_action_buy_item);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int price = UILayoutDonatePreviewCar.this.getPrice();
                String priceText = DonateUtilsKt.getPriceText(UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue());
                String string2 = UILayoutDonatePreviewCar.this.getString(R.string.common_confirmation);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = UILayoutDonatePreviewCar.this.getString(R.string.common_yes);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = UILayoutDonatePreviewCar.this.getString(R.string.common_no);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                List<CarColorItem> carColorItems = UILayoutDonatePreviewCar.this.getJniActivityViewModel().getConfigurationJsons().getValue().getCarColorItems();
                DonateCarColorAdapter donateCarColorAdapter = UILayoutDonatePreviewCar.this.donateCarColorAdapter;
                CarColorItem carColorItem = (CarColorItem) CollectionsKt___CollectionsKt.getOrNull(carColorItems, donateCarColorAdapter != null ? donateCarColorAdapter.getSelected() : 0);
                donateMainViewModel.showDialogConfirmation(string, price, priceText, string2, string3, string4, carColorItem != null ? Integer.valueOf(carColorItem.getGameColor()) : null);
            }
        }, 1, null);
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$initOnClickListeners$2 */
    /* loaded from: classes2.dex */
    public static final class C38992 extends Lambda implements Function0<Unit> {
        public C38992() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            DonateMainViewModel donateMainViewModel = UILayoutDonatePreviewCar.this.getDonateMainViewModel();
            String string = UILayoutDonatePreviewCar.this.getString(R.string.donate_action_buy_item);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int price = UILayoutDonatePreviewCar.this.getPrice();
            String priceText = DonateUtilsKt.getPriceText(UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue());
            String string2 = UILayoutDonatePreviewCar.this.getString(R.string.common_confirmation);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = UILayoutDonatePreviewCar.this.getString(R.string.common_yes);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = UILayoutDonatePreviewCar.this.getString(R.string.common_no);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            List<CarColorItem> carColorItems = UILayoutDonatePreviewCar.this.getJniActivityViewModel().getConfigurationJsons().getValue().getCarColorItems();
            DonateCarColorAdapter donateCarColorAdapter = UILayoutDonatePreviewCar.this.donateCarColorAdapter;
            CarColorItem carColorItem = (CarColorItem) CollectionsKt___CollectionsKt.getOrNull(carColorItems, donateCarColorAdapter != null ? donateCarColorAdapter.getSelected() : 0);
            donateMainViewModel.showDialogConfirmation(string, price, priceText, string2, string3, string4, carColorItem != null ? Integer.valueOf(carColorItem.getGameColor()) : null);
        }
    }

    public final void initRecyclerView() {
        DonateCarColorAdapter donateCarColorAdapter = new DonateCarColorAdapter();
        this.donateCarColorAdapter = donateCarColorAdapter;
        initOnColorClickListenerFromAdapter(donateCarColorAdapter);
        getBinding().colorSelectRV.setAdapter(this.donateCarColorAdapter);
    }

    /* compiled from: UILayoutDonatePreviewCar.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "selected", "", "gameColor", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$initOnColorClickListenerFromAdapter$1 */
    /* loaded from: classes2.dex */
    public static final class C39001 extends Lambda implements Function2<Integer, Integer, Unit> {
        public C39001() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, int i2) {
            if (i > 0) {
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar = UILayoutDonatePreviewCar.this;
                uILayoutDonatePreviewCar.setPrice(uILayoutDonatePreviewCar.getDonateMainViewModel().getCarPriceWithColor().getValue().intValue());
                if (UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getSalePercent() != 0) {
                    Integer basePrice = UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getBasePrice();
                    UILayoutDonatePreviewCar.access$getBinding(UILayoutDonatePreviewCar.this).priceStroked.setText(UILayoutDonatePreviewCar.this.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(basePrice != null ? Integer.valueOf(basePrice.intValue() + UILayoutDonatePreviewCar.this.getDonateMainViewModel().getColorPrice().getValue().intValue()) : null)));
                }
            } else {
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar2 = UILayoutDonatePreviewCar.this;
                uILayoutDonatePreviewCar2.setPrice(uILayoutDonatePreviewCar2.getDonateMainViewModel().getCurrentPrice().getValue().intValue());
                if (UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getSalePercent() != 0) {
                    UILayoutDonatePreviewCar.access$getBinding(UILayoutDonatePreviewCar.this).priceStroked.setText(UILayoutDonatePreviewCar.this.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getBasePrice())));
                }
            }
            UILayoutDonatePreviewCar uILayoutDonatePreviewCar3 = UILayoutDonatePreviewCar.this;
            ImageView donateCarPreviewImage = UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar3).donateCarPreviewImage;
            Intrinsics.checkNotNullExpressionValue(donateCarPreviewImage, "donateCarPreviewImage");
            uILayoutDonatePreviewCar3.setImageForItem(donateCarPreviewImage, UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue(), i2, i2);
            AppCompatButton appCompatButton = UILayoutDonatePreviewCar.access$getBinding(UILayoutDonatePreviewCar.this).button;
            UILayoutDonatePreviewCar uILayoutDonatePreviewCar4 = UILayoutDonatePreviewCar.this;
            appCompatButton.setText(uILayoutDonatePreviewCar4.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(uILayoutDonatePreviewCar4.getPrice()))));
        }
    }

    public final void initOnColorClickListenerFromAdapter(DonateCarColorAdapter donateCarColorAdapter) {
        if (donateCarColorAdapter == null) {
            return;
        }
        donateCarColorAdapter.setOnColorClickListener(new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar.initOnColorClickListenerFromAdapter.1
            public C39001() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2) {
                if (i > 0) {
                    UILayoutDonatePreviewCar uILayoutDonatePreviewCar = UILayoutDonatePreviewCar.this;
                    uILayoutDonatePreviewCar.setPrice(uILayoutDonatePreviewCar.getDonateMainViewModel().getCarPriceWithColor().getValue().intValue());
                    if (UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getSalePercent() != 0) {
                        Integer basePrice = UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getBasePrice();
                        UILayoutDonatePreviewCar.access$getBinding(UILayoutDonatePreviewCar.this).priceStroked.setText(UILayoutDonatePreviewCar.this.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(basePrice != null ? Integer.valueOf(basePrice.intValue() + UILayoutDonatePreviewCar.this.getDonateMainViewModel().getColorPrice().getValue().intValue()) : null)));
                    }
                } else {
                    UILayoutDonatePreviewCar uILayoutDonatePreviewCar2 = UILayoutDonatePreviewCar.this;
                    uILayoutDonatePreviewCar2.setPrice(uILayoutDonatePreviewCar2.getDonateMainViewModel().getCurrentPrice().getValue().intValue());
                    if (UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getSalePercent() != 0) {
                        UILayoutDonatePreviewCar.access$getBinding(UILayoutDonatePreviewCar.this).priceStroked.setText(UILayoutDonatePreviewCar.this.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue().getBasePrice())));
                    }
                }
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar3 = UILayoutDonatePreviewCar.this;
                ImageView donateCarPreviewImage = UILayoutDonatePreviewCar.access$getBinding(uILayoutDonatePreviewCar3).donateCarPreviewImage;
                Intrinsics.checkNotNullExpressionValue(donateCarPreviewImage, "donateCarPreviewImage");
                uILayoutDonatePreviewCar3.setImageForItem(donateCarPreviewImage, UILayoutDonatePreviewCar.this.getDonateMainViewModel().getCurrentItem().getValue(), i2, i2);
                AppCompatButton appCompatButton = UILayoutDonatePreviewCar.access$getBinding(UILayoutDonatePreviewCar.this).button;
                UILayoutDonatePreviewCar uILayoutDonatePreviewCar4 = UILayoutDonatePreviewCar.this;
                appCompatButton.setText(uILayoutDonatePreviewCar4.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(uILayoutDonatePreviewCar4.getPrice()))));
            }
        });
    }

    public final void initStartData() {
        this.price = getDonateMainViewModel().getCurrentPrice().getValue().intValue();
        ImageView donateCarPreviewImage = getBinding().donateCarPreviewImage;
        Intrinsics.checkNotNullExpressionValue(donateCarPreviewImage, "donateCarPreviewImage");
        setImageForItem(donateCarPreviewImage, getDonateMainViewModel().getCurrentItem().getValue(), 0, 0);
    }

    public final void setImageForItem(final ImageView image, DonateItem item, int color1, int color2) {
        if ((item != null ? item.getType() : null) == null || item.getInternalId() == null || item.getGameId() == null) {
            return;
        }
        image.setAlpha(0.0f);
        GameRender gameRender = GameRender.getInstance();
        Integer type = item.getType();
        Intrinsics.checkNotNull(type);
        int iIntValue = type.intValue();
        Integer internalId = item.getInternalId();
        Intrinsics.checkNotNull(internalId);
        int iIntValue2 = internalId.intValue();
        Integer gameId = item.getGameId();
        Intrinsics.checkNotNull(gameId);
        gameRender.RequestRender(iIntValue, iIntValue2, gameId.intValue(), color1, color2, 20.0f, 180.0f, 45.0f, 0.85f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                UILayoutDonatePreviewCar.setImageForItem$lambda$1(this.f$0, image, i, bitmap);
            }
        });
    }

    public static final void setImageForItem$lambda$1(UILayoutDonatePreviewCar this$0, final ImageView image, int i, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(image, "$image");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewCar$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UILayoutDonatePreviewCar.setImageForItem$lambda$1$lambda$0(image, bitmap);
                }
            });
        }
    }

    public static final void setImageForItem$lambda$1$lambda$0(ImageView image, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(image, "$image");
        try {
            image.setImageBitmap(bitmap);
            image.animate().alpha(1.0f).setDuration(300L);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.donateCarColorAdapter = null;
        super.onDestroyView();
    }
}
