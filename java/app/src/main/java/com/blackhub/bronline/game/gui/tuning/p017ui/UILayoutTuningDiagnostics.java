package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningFragmentDiagnosticsBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UILayoutTuningDiagnostics.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUILayoutTuningDiagnostics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningDiagnostics.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDiagnostics\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,254:1\n106#2,15:255\n106#2,15:270\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningDiagnostics.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDiagnostics\n*L\n34#1:255,15\n35#1:270,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningDiagnostics extends BaseFragment<TuningFragmentDiagnosticsBinding> {
    public static final int $stable = 8;

    @Nullable
    public TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem clickDetailInDiagnosticItem;
    public int costDiagnostic;

    @Nullable
    public TuningDetailsInDiagnosticAdapter detailsAdapter;
    public int detailsCost;

    /* renamed from: diagnosticViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy diagnosticViewModel;
    public boolean ifInitItems;

    @Nullable
    public RelativeLayout.LayoutParams params;
    public int repairDetailId;
    public int statusDiagnostics;

    @NotNull
    public final TimeChecker timeChecker;

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    public UILayoutTuningDiagnostics() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$diagnosticViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$1
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
        this.diagnosticViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningDiagnosticViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$tuningViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$special$$inlined$viewModels$default$8
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
        this.timeChecker = new TimeChecker();
        this.statusDiagnostics = -1;
        this.repairDetailId = -1;
        this.ifInitItems = true;
    }

    public static final /* synthetic */ TuningFragmentDiagnosticsBinding access$getBinding(UILayoutTuningDiagnostics uILayoutTuningDiagnostics) {
        return uILayoutTuningDiagnostics.getBinding();
    }

    public final TuningDiagnosticViewModel getDiagnosticViewModel() {
        return (TuningDiagnosticViewModel) this.diagnosticViewModel.getValue();
    }

    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentDiagnosticsBinding getViewBinding() {
        TuningFragmentDiagnosticsBinding tuningFragmentDiagnosticsBindingInflate = TuningFragmentDiagnosticsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tuningFragmentDiagnosticsBindingInflate, "inflate(...)");
        return tuningFragmentDiagnosticsBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initObjects();
        setObservers();
        initDetailsAndAttachToView();
        initListeners();
    }

    private final void initObjects() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.params = layoutParams;
        layoutParams.addRule(19, R.id.help_view_in_diagnostic);
        layoutParams.addRule(8, R.id.help_view_in_diagnostic);
        initDialogApply();
    }

    private final void initDialogApply() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(fragmentActivityRequireActivity);
        initDialogApplyClickListener();
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initDialogApplyClickListener$1 */
    public static final class C46141 extends Lambda implements Function1<Boolean, Unit> {
        public C46141() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) throws JSONException {
            if (z) {
                UILayoutTuningDiagnostics.this.buyDetail();
            } else {
                if (z) {
                    return;
                }
                UILayoutTuningDiagnostics.this.getDiagnosticViewModel().setStatusOfApplyRepair(false);
            }
        }
    }

    private final void initDialogApplyClickListener() {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.initDialogApplyClickListener.1
            public C46141() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) throws JSONException {
                if (z) {
                    UILayoutTuningDiagnostics.this.buyDetail();
                } else {
                    if (z) {
                        return;
                    }
                    UILayoutTuningDiagnostics.this.getDiagnosticViewModel().setStatusOfApplyRepair(false);
                }
            }
        });
    }

    public final void buyDetail() throws JSONException {
        int i = this.statusDiagnostics;
        if (i == 0) {
            getDiagnosticViewModel().sendApplyDiagnostic();
        } else {
            if (i != 1) {
                return;
            }
            getDiagnosticViewModel().sendRepairDetailForBuy(this.repairDetailId);
        }
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$1", m7120f = "UILayoutTuningDiagnostics.kt", m7121i = {}, m7122l = {101}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$1 */
    public static final class C46181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46181(Continuation<? super C46181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDiagnostics.this.new C46181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningDiagnostics.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$1$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = uILayoutTuningDiagnostics.detailsAdapter;
                if (tuningDetailsInDiagnosticAdapter != null) {
                    tuningDetailsInDiagnosticAdapter.setStatusOfDiagnostic(i);
                }
                uILayoutTuningDiagnostics.statusDiagnostics = i;
                UILayoutTuningDiagnostics uILayoutTuningDiagnostics = uILayoutTuningDiagnostics;
                uILayoutTuningDiagnostics.changeViewButton(uILayoutTuningDiagnostics.statusDiagnostics);
                UILayoutTuningDiagnostics uILayoutTuningDiagnostics2 = uILayoutTuningDiagnostics;
                uILayoutTuningDiagnostics2.setStatusOfDiagnostic(uILayoutTuningDiagnostics2.statusDiagnostics);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> newStatusOfDiagnostic = UILayoutTuningDiagnostics.this.getDiagnosticViewModel().getNewStatusOfDiagnostic();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = uILayoutTuningDiagnostics.detailsAdapter;
                        if (tuningDetailsInDiagnosticAdapter != null) {
                            tuningDetailsInDiagnosticAdapter.setStatusOfDiagnostic(i2);
                        }
                        uILayoutTuningDiagnostics.statusDiagnostics = i2;
                        UILayoutTuningDiagnostics uILayoutTuningDiagnostics = uILayoutTuningDiagnostics;
                        uILayoutTuningDiagnostics.changeViewButton(uILayoutTuningDiagnostics.statusDiagnostics);
                        UILayoutTuningDiagnostics uILayoutTuningDiagnostics2 = uILayoutTuningDiagnostics;
                        uILayoutTuningDiagnostics2.setStatusOfDiagnostic(uILayoutTuningDiagnostics2.statusDiagnostics);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newStatusOfDiagnostic.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C46181(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C46192(null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new C46203(null));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4).launchWhenStarted(new C46214(null));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5).launchWhenStarted(new C46225(null));
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$2", m7120f = "UILayoutTuningDiagnostics.kt", m7121i = {}, m7122l = {109}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$2 */
    public static final class C46192 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46192(Continuation<? super C46192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDiagnostics.this.new C46192(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningDiagnostics.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningDetailDiagnosticItemObj;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$2$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<TuningDetailDiagnosticItemObj>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<TuningDetailDiagnosticItemObj> list, @NotNull Continuation<? super Unit> continuation) {
                TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = uILayoutTuningDiagnostics.detailsAdapter;
                if (tuningDetailsInDiagnosticAdapter != null) {
                    UILayoutTuningDiagnostics uILayoutTuningDiagnostics = uILayoutTuningDiagnostics;
                    tuningDetailsInDiagnosticAdapter.setItems(list);
                    if (uILayoutTuningDiagnostics.ifInitItems) {
                        tuningDetailsInDiagnosticAdapter.notifyDataSetChanged();
                        uILayoutTuningDiagnostics.ifInitItems = false;
                    }
                }
                if (list.size() < 4) {
                    UILayoutTuningDiagnostics.access$getBinding(uILayoutTuningDiagnostics).menuBlockDiagnostics.setLayoutParams(uILayoutTuningDiagnostics.params);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<TuningDetailDiagnosticItemObj>> newValueOfStates = UILayoutTuningDiagnostics.this.getDiagnosticViewModel().getNewValueOfStates();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<TuningDetailDiagnosticItemObj>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<TuningDetailDiagnosticItemObj> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = uILayoutTuningDiagnostics.detailsAdapter;
                        if (tuningDetailsInDiagnosticAdapter != null) {
                            UILayoutTuningDiagnostics uILayoutTuningDiagnostics = uILayoutTuningDiagnostics;
                            tuningDetailsInDiagnosticAdapter.setItems(list);
                            if (uILayoutTuningDiagnostics.ifInitItems) {
                                tuningDetailsInDiagnosticAdapter.notifyDataSetChanged();
                                uILayoutTuningDiagnostics.ifInitItems = false;
                            }
                        }
                        if (list.size() < 4) {
                            UILayoutTuningDiagnostics.access$getBinding(uILayoutTuningDiagnostics).menuBlockDiagnostics.setLayoutParams(uILayoutTuningDiagnostics.params);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newValueOfStates.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$3", m7120f = "UILayoutTuningDiagnostics.kt", m7121i = {}, m7122l = {125}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$3 */
    public static final class C46203 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46203(Continuation<? super C46203> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDiagnostics.this.new C46203(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46203) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningDiagnostics.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$3$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningDiagnostics.costDiagnostic = i;
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> newCostOfDiagnostic = UILayoutTuningDiagnostics.this.getDiagnosticViewModel().getNewCostOfDiagnostic();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        uILayoutTuningDiagnostics.costDiagnostic = i2;
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newCostOfDiagnostic.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$4", m7120f = "UILayoutTuningDiagnostics.kt", m7121i = {}, m7122l = {130}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$4 */
    public static final class C46214 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46214(Continuation<? super C46214> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDiagnostics.this.new C46214(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46214) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningDiagnostics.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$4$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = uILayoutTuningDiagnostics.detailsAdapter;
                if (tuningDetailsInDiagnosticAdapter != null) {
                    tuningDetailsInDiagnosticAdapter.notifyItemChanged(i);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Integer> newPosForUpdateItem = UILayoutTuningDiagnostics.this.getDiagnosticViewModel().getNewPosForUpdateItem();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.setObservers.4.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = uILayoutTuningDiagnostics.detailsAdapter;
                        if (tuningDetailsInDiagnosticAdapter != null) {
                            tuningDetailsInDiagnosticAdapter.notifyItemChanged(i2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newPosForUpdateItem.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$5", m7120f = "UILayoutTuningDiagnostics.kt", m7121i = {}, m7122l = {135}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$5 */
    public static final class C46225 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46225(Continuation<? super C46225> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDiagnostics.this.new C46225(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46225) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningDiagnostics.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$setObservers$5$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                TuningDialogApply tuningDialogApply;
                if (z && (tuningDialogApply = uILayoutTuningDiagnostics.tuningDialogApply) != null) {
                    tuningDialogApply.showDialogApply(0, uILayoutTuningDiagnostics.detailsCost, 0);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> newStatusOfApplyRepair = UILayoutTuningDiagnostics.this.getDiagnosticViewModel().getNewStatusOfApplyRepair();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.setObservers.5.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        TuningDialogApply tuningDialogApply;
                        if (z && (tuningDialogApply = uILayoutTuningDiagnostics.tuningDialogApply) != null) {
                            tuningDialogApply.showDialogApply(0, uILayoutTuningDiagnostics.detailsCost, 0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newStatusOfApplyRepair.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void changeViewButton(int statusDiagnostics) {
        Drawable drawable;
        int i;
        if (statusDiagnostics == 0) {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_icon_diagnostics);
            i = R.string.common_diagnostic;
        } else {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_repair);
            i = R.string.tuning_submenu_button_repeat;
        }
        AppCompatButton appCompatButton = getBinding().tuningDiagnostics;
        appCompatButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatButton.setText(i);
    }

    public final void setStatusOfDiagnostic(int status) {
        Drawable drawable;
        int i;
        if (status == 0) {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_bg_not_actual_diagnostics);
            i = R.string.tuning_diagnostic_status_no_actual;
        } else {
            drawable = ContextCompat.getDrawable(requireActivity(), R.drawable.tuning_bg_actual_diagnostics);
            i = R.string.tuning_diagnostic_status_actual;
        }
        TextView textView = getBinding().titleActualDiagnostics;
        textView.setText(i);
        textView.setBackground(drawable);
    }

    public final void initDetailsAndAttachToView() {
        initOnClickDetailInDiagnosticItem();
        this.detailsAdapter = new TuningDetailsInDiagnosticAdapter(this.clickDetailInDiagnosticItem);
        RecyclerView recyclerView = getBinding().recvDetailsListDiagnostics;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.detailsAdapter);
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m7105d2 = {"com/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDiagnostics$initOnClickDetailInDiagnosticItem$1", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsInDiagnosticAdapter$OnClickDetailInDiagnosticItem;", "clickInDiagnostic", "", "detailsItem", "Lcom/blackhub/bronline/game/gui/tuning/data/TuningDetailDiagnosticItemObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initOnClickDetailInDiagnosticItem$1 */
    public static final class C46171 implements TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem {
        public C46171() {
        }

        @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem
        public void clickInDiagnostic(@NotNull TuningDetailDiagnosticItemObj detailsItem, int getPosition, @Nullable View view) {
            Intrinsics.checkNotNullParameter(detailsItem, "detailsItem");
            if (UILayoutTuningDiagnostics.this.timeChecker.ifAccess(250L)) {
                detailsItem.setChecked(true);
                TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = UILayoutTuningDiagnostics.this.detailsAdapter;
                if (tuningDetailsInDiagnosticAdapter != null) {
                    tuningDetailsInDiagnosticAdapter.notifyItemChanged(getPosition);
                    tuningDetailsInDiagnosticAdapter.setOnlyItemClickable(getPosition);
                }
                UILayoutTuningDiagnostics.this.detailsCost = detailsItem.getCost();
                UILayoutTuningDiagnostics.this.repairDetailId = detailsItem.getId();
            }
        }
    }

    public final void initOnClickDetailInDiagnosticItem() {
        this.clickDetailInDiagnosticItem = new TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.initOnClickDetailInDiagnosticItem.1
            public C46171() {
            }

            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsInDiagnosticAdapter.OnClickDetailInDiagnosticItem
            public void clickInDiagnostic(@NotNull TuningDetailDiagnosticItemObj detailsItem, int getPosition, @Nullable View view) {
                Intrinsics.checkNotNullParameter(detailsItem, "detailsItem");
                if (UILayoutTuningDiagnostics.this.timeChecker.ifAccess(250L)) {
                    detailsItem.setChecked(true);
                    TuningDetailsInDiagnosticAdapter tuningDetailsInDiagnosticAdapter = UILayoutTuningDiagnostics.this.detailsAdapter;
                    if (tuningDetailsInDiagnosticAdapter != null) {
                        tuningDetailsInDiagnosticAdapter.notifyItemChanged(getPosition);
                        tuningDetailsInDiagnosticAdapter.setOnlyItemClickable(getPosition);
                    }
                    UILayoutTuningDiagnostics.this.detailsCost = detailsItem.getCost();
                    UILayoutTuningDiagnostics.this.repairDetailId = detailsItem.getId();
                }
            }
        };
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initListeners$1 */
    public static final class C46151 extends Lambda implements Function0<Unit> {
        public C46151() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            if (UILayoutTuningDiagnostics.this.statusDiagnostics == 0) {
                TuningDialogApply tuningDialogApply = UILayoutTuningDiagnostics.this.tuningDialogApply;
                if (tuningDialogApply != null) {
                    tuningDialogApply.showDialogApply(2, UILayoutTuningDiagnostics.this.costDiagnostic, 0);
                    return;
                }
                return;
            }
            if (UILayoutTuningDiagnostics.this.statusDiagnostics != 1 || UILayoutTuningDiagnostics.this.detailsCost == 0) {
                return;
            }
            UILayoutTuningDiagnostics.this.getDiagnosticViewModel().sendRepairDetailForCheck(UILayoutTuningDiagnostics.this.repairDetailId);
        }
    }

    private final void initListeners() {
        AppCompatButton tuningDiagnostics = getBinding().tuningDiagnostics;
        Intrinsics.checkNotNullExpressionValue(tuningDiagnostics, "tuningDiagnostics");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningDiagnostics, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.initListeners.1
            public C46151() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                if (UILayoutTuningDiagnostics.this.statusDiagnostics == 0) {
                    TuningDialogApply tuningDialogApply = UILayoutTuningDiagnostics.this.tuningDialogApply;
                    if (tuningDialogApply != null) {
                        tuningDialogApply.showDialogApply(2, UILayoutTuningDiagnostics.this.costDiagnostic, 0);
                        return;
                    }
                    return;
                }
                if (UILayoutTuningDiagnostics.this.statusDiagnostics != 1 || UILayoutTuningDiagnostics.this.detailsCost == 0) {
                    return;
                }
                UILayoutTuningDiagnostics.this.getDiagnosticViewModel().sendRepairDetailForCheck(UILayoutTuningDiagnostics.this.repairDetailId);
            }
        }, 1, null);
        AppCompatButton backToSubmenuDiagnostics = getBinding().backToSubmenuDiagnostics;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuDiagnostics, "backToSubmenuDiagnostics");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuDiagnostics, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics.initListeners.2
            public C46162() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningDiagnostics.this.getTuningViewModel().setCurrentLayout(2);
            }
        }, 1, null);
    }

    /* compiled from: UILayoutTuningDiagnostics.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDiagnostics$initListeners$2 */
    public static final class C46162 extends Lambda implements Function0<Unit> {
        public C46162() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutTuningDiagnostics.this.getTuningViewModel().setCurrentLayout(2);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    private final void closeDialogs() {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParameters() {
        this.detailsAdapter = null;
        this.params = null;
        this.clickDetailInDiagnosticItem = null;
        this.tuningDialogApply = null;
    }
}

