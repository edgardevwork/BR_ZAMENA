package com.blackhub.bronline.game.gui.gasmangame.p015ui;

import android.annotation.SuppressLint;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentGasmanGame5Binding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.gui.gasmangame.GasmanUtils;
import com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanDropAreaItem;
import com.blackhub.bronline.game.gui.gasmangame.entitie.GasmanDropAreaTag;
import com.blackhub.bronline.game.gui.gasmangame.entitie.MIDDLE_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.entitie.TOP_PLOT;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanChildUIState;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIGasmanGame5Fragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIGasmanGame5Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanGame5Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame5Fragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n106#2,15:217\n106#2,15:232\n41#3,2:247\n41#3:249\n42#3:256\n41#3:257\n42#3:260\n1855#4,2:250\n1855#4,2:252\n1855#4,2:254\n1855#4,2:258\n*S KotlinDebug\n*F\n+ 1 UIGasmanGame5Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame5Fragment\n*L\n49#1:217,15\n50#1:232,15\n65#1:247,2\n165#1:249\n165#1:256\n192#1:257\n192#1:260\n174#1:250,2\n181#1:252,2\n186#1:254,2\n209#1:258,2\n*E\n"})

public final class UIGasmanGame5Fragment extends BaseFragmentWithState<GasmanParentUIState, GasmanParentViewModel, FragmentGasmanGame5Binding> {
    public static final int BOT_PLOT_QUANTITY = 2;
    public static final int MIDDLE_PLOT_QUANTITY = 2;
    public static final int TOP_PLOT_QUANTITY = 4;

    @NotNull
    public final List<ImageView> botPlotListOfViews;

    /* renamed from: gasmanChildViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gasmanChildViewModel;

    @NotNull
    public final List<ImageView> middlePlotListOfViews;

    @NotNull
    public final List<ImageView> topPlotListOfViews;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull GasmanParentUIState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    public static final /* synthetic */ FragmentGasmanGame5Binding access$getBinding(UIGasmanGame5Fragment uIGasmanGame5Fragment) {
        return uIGasmanGame5Fragment.getBinding();
    }

    public UIGasmanGame5Fragment() {
        super(R.layout.fragment_gasman_game_5);
        this.topPlotListOfViews = new ArrayList();
        this.middlePlotListOfViews = new ArrayList();
        this.botPlotListOfViews = new ArrayList();
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$gasmanChildViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$1
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
        this.gasmanChildViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$viewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$5
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanParentViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$special$$inlined$viewModels$default$8
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
    }

    public final GasmanChildViewModel getGasmanChildViewModel() {
        return (GasmanChildViewModel) this.gasmanChildViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public GasmanParentViewModel getViewModel() {
        return (GasmanParentViewModel) this.viewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        initViewModel();
        initObservers();
        initDropAreas();
        initPlotsOnTouchListener();
        GasmanUtils gasmanUtils = GasmanUtils.INSTANCE;
        ConstraintLayout containerRoot = getBinding().containerRoot;
        Intrinsics.checkNotNullExpressionValue(containerRoot, "containerRoot");
        gasmanUtils.resetAnimationOfImageViews(containerRoot);
    }

    private final void initViewModel() {
        FragmentGasmanGame5Binding binding = getBinding();
        GasmanChildViewModel gasmanChildViewModel = getGasmanChildViewModel();
        ImageView imageView = binding.ivCornerPipeTopPlot4;
        Boolean bool = Boolean.FALSE;
        gasmanChildViewModel.initPlots(MapsKt__MapsKt.mutableMapOf(new Pair(imageView, bool), new Pair(binding.ivCornerPipeTopPlot3, bool), new Pair(binding.ivCornerPipeTopPlot2, bool), new Pair(binding.ivStraightPipeMiddlePlot2, bool), new Pair(binding.ivStraightPipeMiddlePlot1, bool)), 4, 2, 2);
    }

    /* compiled from: UIGasmanGame5Fragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$initObservers$1", m7120f = "UIGasmanGame5Fragment.kt", m7121i = {}, m7122l = {83}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$initObservers$1 */
    public static final class C41061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41061(Continuation<? super C41061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIGasmanGame5Fragment.this.new C41061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIGasmanGame5Fragment.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$initObservers$1$1", m7120f = "UIGasmanGame5Fragment.kt", m7121i = {}, m7122l = {84}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$initObservers$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ UIGasmanGame5Fragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UIGasmanGame5Fragment uIGasmanGame5Fragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uIGasmanGame5Fragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UIGasmanGame5Fragment.kt */
            @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "state", "Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanChildUIState;", "emit", "(Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanChildUIState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @SourceDebugExtension({"SMAP\nUIGasmanGame5Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanGame5Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame5Fragment$initObservers$1$1$1\n+ 2 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n41#2,2:217\n1726#3,3:219\n*S KotlinDebug\n*F\n+ 1 UIGasmanGame5Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame5Fragment$initObservers$1$1$1\n*L\n89#1:217,2\n107#1:219,3\n*E\n"})
            /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment$initObservers$1$1$1 */
            public static final class C118841<T> implements FlowCollector {
                public C118841() {
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((GasmanChildUIState) obj, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull GasmanChildUIState gasmanChildUIState, @NotNull Continuation<? super Unit> continuation) {
                    if (gasmanChildUIState.getAnimateGas()) {
                        uIGasmanGame5Fragment.animateGas();
                        uIGasmanGame5Fragment.getViewModel().gasAnimated();
                    }
                    FragmentGasmanGame5Binding fragmentGasmanGame5BindingAccess$getBinding = UIGasmanGame5Fragment.access$getBinding(uIGasmanGame5Fragment);
                    fragmentGasmanGame5BindingAccess$getBinding.tvTopPlot.setText(String.valueOf(gasmanChildUIState.getTopPlotQuantity()));
                    int topPlotQuantity = gasmanChildUIState.getTopPlotQuantity();
                    if (topPlotQuantity == 0) {
                        fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot.setVisibility(0);
                    } else if (topPlotQuantity == 1) {
                        fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot1.setVisibility(0);
                    } else if (topPlotQuantity == 2) {
                        fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot2.setVisibility(0);
                    } else if (topPlotQuantity == 3) {
                        fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot3.setVisibility(0);
                    }
                    fragmentGasmanGame5BindingAccess$getBinding.tvMiddlePlot.setText(String.valueOf(gasmanChildUIState.getMiddlePlotQuantity()));
                    int middlePlotQuantity = gasmanChildUIState.getMiddlePlotQuantity();
                    if (middlePlotQuantity == 0) {
                        fragmentGasmanGame5BindingAccess$getBinding.ivStraightPipeMiddlePlot.setVisibility(0);
                    } else if (middlePlotQuantity == 1) {
                        fragmentGasmanGame5BindingAccess$getBinding.ivStraightPipeMiddlePlot1.setVisibility(0);
                    }
                    fragmentGasmanGame5BindingAccess$getBinding.tvBotPlot.setText(String.valueOf(gasmanChildUIState.getBotPlotQuantity()));
                    Collection<Boolean> collectionValues = gasmanChildUIState.getCheckIfPipesInPlaces().values();
                    if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                        uIGasmanGame5Fragment.getGasmanChildViewModel().setAnimateGas();
                    } else {
                        Iterator<T> it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        uIGasmanGame5Fragment.getGasmanChildViewModel().setAnimateGas();
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
                    StateFlow<GasmanChildUIState> uiState = this.this$0.getGasmanChildViewModel().getUiState();
                    C118841 c118841 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame5Fragment.initObservers.1.1.1
                        public C118841() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((GasmanChildUIState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        @Nullable
                        public final Object emit(@NotNull GasmanChildUIState gasmanChildUIState, @NotNull Continuation<? super Unit> continuation) {
                            if (gasmanChildUIState.getAnimateGas()) {
                                uIGasmanGame5Fragment.animateGas();
                                uIGasmanGame5Fragment.getViewModel().gasAnimated();
                            }
                            FragmentGasmanGame5Binding fragmentGasmanGame5BindingAccess$getBinding = UIGasmanGame5Fragment.access$getBinding(uIGasmanGame5Fragment);
                            fragmentGasmanGame5BindingAccess$getBinding.tvTopPlot.setText(String.valueOf(gasmanChildUIState.getTopPlotQuantity()));
                            int topPlotQuantity = gasmanChildUIState.getTopPlotQuantity();
                            if (topPlotQuantity == 0) {
                                fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot.setVisibility(0);
                            } else if (topPlotQuantity == 1) {
                                fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot1.setVisibility(0);
                            } else if (topPlotQuantity == 2) {
                                fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot2.setVisibility(0);
                            } else if (topPlotQuantity == 3) {
                                fragmentGasmanGame5BindingAccess$getBinding.ivCornerPipeTopPlot3.setVisibility(0);
                            }
                            fragmentGasmanGame5BindingAccess$getBinding.tvMiddlePlot.setText(String.valueOf(gasmanChildUIState.getMiddlePlotQuantity()));
                            int middlePlotQuantity = gasmanChildUIState.getMiddlePlotQuantity();
                            if (middlePlotQuantity == 0) {
                                fragmentGasmanGame5BindingAccess$getBinding.ivStraightPipeMiddlePlot.setVisibility(0);
                            } else if (middlePlotQuantity == 1) {
                                fragmentGasmanGame5BindingAccess$getBinding.ivStraightPipeMiddlePlot1.setVisibility(0);
                            }
                            fragmentGasmanGame5BindingAccess$getBinding.tvBotPlot.setText(String.valueOf(gasmanChildUIState.getBotPlotQuantity()));
                            Collection<Boolean> collectionValues = gasmanChildUIState.getCheckIfPipesInPlaces().values();
                            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                                uIGasmanGame5Fragment.getGasmanChildViewModel().setAnimateGas();
                            } else {
                                Iterator<T> it = collectionValues.iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) it.next()).booleanValue()) {
                                        break;
                                    }
                                }
                                uIGasmanGame5Fragment.getGasmanChildViewModel().setAnimateGas();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (uiState.collect(c118841, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = UIGasmanGame5Fragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UIGasmanGame5Fragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
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

    private final void initObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C41061(null), 3, null);
    }

    private final void initDropAreas() {
        getBinding().getRoot().setOnDragListener(new GasmanDragAndDropListener(getListOfDropAreas(), getGasmanChildViewModel()).invoke());
    }

    private final List<GasmanDropAreaItem> getListOfDropAreas() {
        FragmentGasmanGame5Binding binding = getBinding();
        List<ImageView> list = this.topPlotListOfViews;
        ImageView ivCornerDropArea1 = binding.ivCornerDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivCornerDropArea1, "ivCornerDropArea1");
        GasmanDropAreaTag.USUAL_PIPE usual_pipe = GasmanDropAreaTag.USUAL_PIPE.INSTANCE;
        Float fValueOf = Float.valueOf(90.0f);
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(fValueOf);
        TOP_PLOT top_plot = TOP_PLOT.INSTANCE;
        GasmanDropAreaItem gasmanDropAreaItem = new GasmanDropAreaItem(list, ivCornerDropArea1, usual_pipe, 180.0f, listListOf, top_plot);
        List<ImageView> list2 = this.topPlotListOfViews;
        ImageView ivCornerDropArea2 = binding.ivCornerDropArea2;
        Intrinsics.checkNotNullExpressionValue(ivCornerDropArea2, "ivCornerDropArea2");
        Float fValueOf2 = Float.valueOf(0.0f);
        GasmanDropAreaItem gasmanDropAreaItem2 = new GasmanDropAreaItem(list2, ivCornerDropArea2, usual_pipe, 180.0f, CollectionsKt__CollectionsJVMKt.listOf(fValueOf2), top_plot);
        List<ImageView> list3 = this.topPlotListOfViews;
        ImageView ivCornerDropArea3 = binding.ivCornerDropArea3;
        Intrinsics.checkNotNullExpressionValue(ivCornerDropArea3, "ivCornerDropArea3");
        Float fValueOf3 = Float.valueOf(270.0f);
        GasmanDropAreaItem gasmanDropAreaItem3 = new GasmanDropAreaItem(list3, ivCornerDropArea3, usual_pipe, 90.0f, CollectionsKt__CollectionsJVMKt.listOf(fValueOf3), top_plot);
        List<ImageView> list4 = this.middlePlotListOfViews;
        ImageView ivStraightDropArea1 = binding.ivStraightDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivStraightDropArea1, "ivStraightDropArea1");
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf2, Float.valueOf(180.0f)});
        MIDDLE_PLOT middle_plot = MIDDLE_PLOT.INSTANCE;
        GasmanDropAreaItem gasmanDropAreaItem4 = new GasmanDropAreaItem(list4, ivStraightDropArea1, usual_pipe, 0.0f, listListOf2, middle_plot);
        List<ImageView> list5 = this.middlePlotListOfViews;
        ImageView ivStraightDropArea2 = binding.ivStraightDropArea2;
        Intrinsics.checkNotNullExpressionValue(ivStraightDropArea2, "ivStraightDropArea2");
        return CollectionsKt__CollectionsKt.mutableListOf(gasmanDropAreaItem, gasmanDropAreaItem2, gasmanDropAreaItem3, gasmanDropAreaItem4, new GasmanDropAreaItem(list5, ivStraightDropArea2, GasmanDropAreaTag.STRAIGHT_LONG_PIPE_90_DEGREES.INSTANCE, 270.0f, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf3}), middle_plot));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initPlotsOnTouchListener() {
        FragmentGasmanGame5Binding binding = getBinding();
        this.topPlotListOfViews.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivCornerPipeTopPlot4, binding.ivCornerPipeTopPlot3, binding.ivCornerPipeTopPlot2, binding.ivCornerPipeTopPlot1}));
        Iterator<T> it = this.topPlotListOfViews.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
        this.middlePlotListOfViews.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivStraightPipeMiddlePlot1, binding.ivStraightPipeMiddlePlot2}));
        Iterator<T> it2 = this.middlePlotListOfViews.iterator();
        while (it2.hasNext()) {
            ((ImageView) it2.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
        this.botPlotListOfViews.addAll(CollectionsKt__CollectionsJVMKt.listOf(binding.ivTeePipeBotPlot2));
        Iterator<T> it3 = this.botPlotListOfViews.iterator();
        while (it3.hasNext()) {
            ((ImageView) it3.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void animateGas() {
        FragmentGasmanGame5Binding binding = getBinding();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = binding.ivAnimationGas.animate();
        viewPropertyAnimatorAnimate.setDuration(1000L);
        viewPropertyAnimatorAnimate.alpha(1.0f);
        viewPropertyAnimatorAnimate.start();
        for (ImageView imageView : CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivCornerPipeTopPlot4, binding.ivCornerPipeTopPlot3, binding.ivCornerPipeTopPlot2, binding.ivStraightPipeMiddlePlot2, binding.ivStraightPipeMiddlePlot1, binding.ivTeeStaticPipe1, binding.ivCornerStaticPipe1, binding.ivStraightStaticPipe1, binding.ivStraightStaticPipe2, binding.ivCornerStaticPipe2})) {
            GasmanUtils gasmanUtils = GasmanUtils.INSTANCE;
            Intrinsics.checkNotNull(imageView);
            gasmanUtils.animateImageViews(imageView);
            imageView.setOnClickListener(null);
        }
    }
}

