package com.blackhub.bronline.game.gui.donate.p011ui;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.HtmlCompat;
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
import com.blackhub.bronline.databinding.DonatePackPreviewLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonatePreviewPackAdapter;
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

/* compiled from: UILayoutDonatePreviewPack.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUILayoutDonatePreviewPack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonatePreviewPack.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewPack\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n106#2,15:131\n172#2,9:146\n1#3:155\n*S KotlinDebug\n*F\n+ 1 UILayoutDonatePreviewPack.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonatePreviewPack\n*L\n34#1:131,15\n35#1:146,9\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutDonatePreviewPack extends BaseFragment<DonatePackPreviewLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: donateMainVM$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainVM;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    public UILayoutDonatePreviewPack() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$donateMainVM$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$1
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
        this.donateMainVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$viewModels$default$4
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
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$special$$inlined$activityViewModels$default$3
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
    }

    public static final /* synthetic */ DonatePackPreviewLayoutBinding access$getBinding(UILayoutDonatePreviewPack uILayoutDonatePreviewPack) {
        return uILayoutDonatePreviewPack.getBinding();
    }

    public final DonateMainViewModel getDonateMainVM() {
        return (DonateMainViewModel) this.donateMainVM.getValue();
    }

    private final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonatePackPreviewLayoutBinding getViewBinding() {
        DonatePackPreviewLayoutBinding donatePackPreviewLayoutBindingInflate = DonatePackPreviewLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(donatePackPreviewLayoutBindingInflate, "inflate(...)");
        return donatePackPreviewLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setupVMObservers();
        setupSetOnClickListeners();
    }

    /* compiled from: UILayoutDonatePreviewPack.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupVMObservers$1", m7120f = "UILayoutDonatePreviewPack.kt", m7121i = {}, m7122l = {47}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupVMObservers$1 */
    public static final class C39101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39101(Continuation<? super C39101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonatePreviewPack.this.new C39101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DonateItem> currentItem = UILayoutDonatePreviewPack.this.getDonateMainVM().getCurrentItem();
                Lifecycle lifecycle = UILayoutDonatePreviewPack.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(currentItem, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack.setupVMObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DonateItem) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull DonateItem donateItem, @NotNull Continuation<? super Unit> continuation) {
                        uILayoutDonatePreviewPack.setupRecyclerView(donateItem);
                        uILayoutDonatePreviewPack.setupStrokedPrice(donateItem);
                        uILayoutDonatePreviewPack.setupImage(donateItem);
                        uILayoutDonatePreviewPack.setupHeader(donateItem);
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

        /* compiled from: UILayoutDonatePreviewPack.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "emit", "(Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupVMObservers$1$1 */
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
                uILayoutDonatePreviewPack.setupRecyclerView(donateItem);
                uILayoutDonatePreviewPack.setupStrokedPrice(donateItem);
                uILayoutDonatePreviewPack.setupImage(donateItem);
                uILayoutDonatePreviewPack.setupHeader(donateItem);
                return Unit.INSTANCE;
            }
        }
    }

    public final void setupVMObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39101(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39112(null), 3, null);
    }

    /* compiled from: UILayoutDonatePreviewPack.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupVMObservers$2", m7120f = "UILayoutDonatePreviewPack.kt", m7121i = {}, m7122l = {57}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupVMObservers$2 */
    public static final class C39112 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39112(Continuation<? super C39112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonatePreviewPack.this.new C39112(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> currentPrice = UILayoutDonatePreviewPack.this.getDonateMainVM().getCurrentPrice();
                Lifecycle lifecycle = UILayoutDonatePreviewPack.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(currentPrice, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack.setupVMObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        UILayoutDonatePreviewPack.access$getBinding(uILayoutDonatePreviewPack).button.setText(uILayoutDonatePreviewPack.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(i2))));
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

        /* compiled from: UILayoutDonatePreviewPack.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", FirebaseAnalytics.Param.PRICE, "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupVMObservers$2$1 */
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
                UILayoutDonatePreviewPack.access$getBinding(uILayoutDonatePreviewPack).button.setText(uILayoutDonatePreviewPack.getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(i2))));
                return Unit.INSTANCE;
            }
        }
    }

    public final void setupHeader(DonateItem item) {
        Integer type;
        Integer type2;
        if (item.getType() != null && (type2 = item.getType()) != null && type2.intValue() == 3) {
            getBinding().header.setText(HtmlCompat.fromHtml("<font color='#FFFFFF'>Набор</font> <font color='#E2310C'>" + UtilsKt.buildTypeMerge(item.getHeader(), item.getHeaderStore()) + "</font>", 0));
        }
        if (item.getType() == null || (type = item.getType()) == null || type.intValue() != 9 || UtilsKt.buildTypeMerge(item.getDesc(), item.getDescStore()) == null) {
            return;
        }
        getBinding().header.setText(UsefulKt.transformColors((String) UtilsKt.buildTypeMerge(item.getDesc(), item.getDescStore())));
    }

    public final void setupImage(DonateItem item) {
        ImageView image = getBinding().image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ViewExtensionKt.loadImage$default(image, Useful.INSTANCE.getDrawableByName(item.getImageId()), 0, null, 6, null);
    }

    public final void setupStrokedPrice(DonateItem item) {
        if (item.getSalePercent() != 0) {
            TextView textView = getBinding().strokedPrice;
            textView.setPaintFlags(16);
            textView.setText(getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(item.getBasePrice())));
        }
    }

    public final void setupRecyclerView(DonateItem item) {
        DonateItem donateItem;
        Object next;
        List<Integer> contains = item.getContains();
        if (contains == null || contains.isEmpty()) {
            FirebaseCrashlytics.getInstance().log("dolbaeb " + item.getInternalId());
            FirebaseCrashlytics.getInstance().recordException(new Throwable());
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<DonateItem> donateItemsFromJson = getJniActivityViewModel().getConfigurationJsons().getValue().getDonateItemsFromJson();
        List<Integer> contains2 = item.getContains();
        IntRange indices = contains2 != null ? CollectionsKt__CollectionsKt.getIndices(contains2) : null;
        Intrinsics.checkNotNull(indices);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (true) {
                List<Integer> contains3 = item.getContains();
                Integer num = contains3 != null ? contains3.get(first) : null;
                if (donateItemsFromJson != null) {
                    Iterator<T> it = donateItemsFromJson.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (Intrinsics.areEqual(((DonateItem) next).getInternalId(), num)) {
                                break;
                            }
                        }
                    }
                    donateItem = (DonateItem) next;
                } else {
                    donateItem = null;
                }
                Integer type = item.getType();
                if (type != null && type.intValue() == 7) {
                    Object objBuildTypeMerge = UtilsKt.buildTypeMerge(donateItem != null ? donateItem.getHeader() : null, donateItem != null ? donateItem.getHeaderStore() : null);
                    arrayList.add(objBuildTypeMerge + " " + UtilsKt.buildTypeMerge(donateItem != null ? donateItem.getSubheader() : null, donateItem != null ? donateItem.getSubheaderStore() : null));
                } else {
                    arrayList.add(UtilsKt.buildTypeMerge(donateItem != null ? donateItem.getHeader() : null, donateItem != null ? donateItem.getHeaderStore() : null));
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        RecyclerView recyclerView = getBinding().donatePackRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        recyclerView.setAdapter(new DonatePreviewPackAdapter(arrayList));
    }

    /* compiled from: UILayoutDonatePreviewPack.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupSetOnClickListeners$1 */
    /* loaded from: classes2.dex */
    public static final class C39081 extends Lambda implements Function0<Unit> {
        public C39081() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutDonatePreviewPack.this.getParentFragmentManager().popBackStack();
        }
    }

    private final void setupSetOnClickListeners() {
        AppCompatButton donateButtonBack = getBinding().donateButtonBack;
        Intrinsics.checkNotNullExpressionValue(donateButtonBack, "donateButtonBack");
        setOnClickListenerWithAnimAndDelay(donateButtonBack, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack.setupSetOnClickListeners.1
            public C39081() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutDonatePreviewPack.this.getParentFragmentManager().popBackStack();
            }
        });
        AppCompatButton button = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, button, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack.setupSetOnClickListeners.2
            public C39092() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                DonateMainViewModel donateMainVM = UILayoutDonatePreviewPack.this.getDonateMainVM();
                String string = UILayoutDonatePreviewPack.this.getString(R.string.donate_action_buy_item);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int iIntValue = UILayoutDonatePreviewPack.this.getDonateMainVM().getCurrentPrice().getValue().intValue();
                String priceText = DonateUtilsKt.getPriceText(UILayoutDonatePreviewPack.this.getDonateMainVM().getCurrentItem().getValue());
                String string2 = UILayoutDonatePreviewPack.this.getString(R.string.common_confirmation);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = UILayoutDonatePreviewPack.this.getString(R.string.common_yes);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = UILayoutDonatePreviewPack.this.getString(R.string.common_no);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                donateMainVM.showDialogConfirmation(string, iIntValue, priceText, string2, string3, string4, null);
            }
        }, 1, null);
    }

    /* compiled from: UILayoutDonatePreviewPack.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonatePreviewPack$setupSetOnClickListeners$2 */
    /* loaded from: classes2.dex */
    public static final class C39092 extends Lambda implements Function0<Unit> {
        public C39092() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            DonateMainViewModel donateMainVM = UILayoutDonatePreviewPack.this.getDonateMainVM();
            String string = UILayoutDonatePreviewPack.this.getString(R.string.donate_action_buy_item);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int iIntValue = UILayoutDonatePreviewPack.this.getDonateMainVM().getCurrentPrice().getValue().intValue();
            String priceText = DonateUtilsKt.getPriceText(UILayoutDonatePreviewPack.this.getDonateMainVM().getCurrentItem().getValue());
            String string2 = UILayoutDonatePreviewPack.this.getString(R.string.common_confirmation);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = UILayoutDonatePreviewPack.this.getString(R.string.common_yes);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = UILayoutDonatePreviewPack.this.getString(R.string.common_no);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            donateMainVM.showDialogConfirmation(string, iIntValue, priceText, string2, string3, string4, null);
        }
    }
}

