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
import com.blackhub.bronline.databinding.FragmentGasmanGame6Binding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.gui.gasmangame.GasmanUtils;
import com.blackhub.bronline.game.gui.gasmangame.draganddrop.GasmanDragAndDropListener;
import com.blackhub.bronline.game.gui.gasmangame.entitie.BOT_PLOT;
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

/* compiled from: UIGasmanGame6Fragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIGasmanGame6Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanGame6Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame6Fragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n106#2,15:215\n106#2,15:230\n41#3,2:245\n41#3:247\n42#3:254\n41#3:255\n42#3:258\n1855#4,2:248\n1855#4,2:250\n1855#4,2:252\n1855#4,2:256\n*S KotlinDebug\n*F\n+ 1 UIGasmanGame6Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame6Fragment\n*L\n47#1:215,15\n48#1:230,15\n63#1:245,2\n164#1:247\n164#1:254\n190#1:255\n190#1:258\n170#1:248,2\n177#1:250,2\n184#1:252,2\n206#1:256,2\n*E\n"})
/* loaded from: classes2.dex */
public final class UIGasmanGame6Fragment extends BaseFragmentWithState<GasmanParentUIState, GasmanParentViewModel, FragmentGasmanGame6Binding> {
    public static final int BOT_PLOT_QUANTITY = 2;
    public static final int MIDDLE_PLOT_QUANTITY = 2;
    public static final int TOP_PLOT_QUANTITY = 1;

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

    public static final /* synthetic */ FragmentGasmanGame6Binding access$getBinding(UIGasmanGame6Fragment uIGasmanGame6Fragment) {
        return uIGasmanGame6Fragment.getBinding();
    }

    public UIGasmanGame6Fragment() {
        super(R.layout.fragment_gasman_game_6);
        this.topPlotListOfViews = new ArrayList();
        this.middlePlotListOfViews = new ArrayList();
        this.botPlotListOfViews = new ArrayList();
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$viewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$1
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanParentViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$gasmanChildViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$5
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
        this.gasmanChildViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$special$$inlined$viewModels$default$8
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

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public GasmanParentViewModel getViewModel() {
        return (GasmanParentViewModel) this.viewModel.getValue();
    }

    public final GasmanChildViewModel getGasmanChildViewModel() {
        return (GasmanChildViewModel) this.gasmanChildViewModel.getValue();
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
        FragmentGasmanGame6Binding binding = getBinding();
        GasmanChildViewModel gasmanChildViewModel = getGasmanChildViewModel();
        ImageView imageView = binding.ivCornerPipeTopPlot1;
        Boolean bool = Boolean.FALSE;
        gasmanChildViewModel.initPlots(MapsKt__MapsKt.mutableMapOf(new Pair(imageView, bool), new Pair(binding.ivStraightPipeMiddlePlot2, bool), new Pair(binding.ivStraightPipeMiddlePlot1, bool), new Pair(binding.ivTeePipeBotPlot2, bool), new Pair(binding.ivTeePipeBotPlot1, bool)), 1, 2, 2);
    }

    /* compiled from: UIGasmanGame6Fragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$initObservers$1", m7120f = "UIGasmanGame6Fragment.kt", m7121i = {}, m7122l = {81}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$initObservers$1 */
    public static final class C41071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41071(Continuation<? super C41071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIGasmanGame6Fragment.this.new C41071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIGasmanGame6Fragment.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$initObservers$1$1", m7120f = "UIGasmanGame6Fragment.kt", m7121i = {}, m7122l = {82}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$initObservers$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ UIGasmanGame6Fragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UIGasmanGame6Fragment uIGasmanGame6Fragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uIGasmanGame6Fragment;
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

            /* compiled from: UIGasmanGame6Fragment.kt */
            @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "state", "Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanChildUIState;", "emit", "(Lcom/blackhub/bronline/game/gui/gasmangame/uistate/GasmanChildUIState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @SourceDebugExtension({"SMAP\nUIGasmanGame6Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGasmanGame6Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame6Fragment$initObservers$1$1$1\n+ 2 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n41#2,2:215\n1726#3,3:217\n*S KotlinDebug\n*F\n+ 1 UIGasmanGame6Fragment.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/UIGasmanGame6Fragment$initObservers$1$1$1\n*L\n87#1:215,2\n106#1:217,3\n*E\n"})
            /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment$initObservers$1$1$1 */
            public static final class C118851<T> implements FlowCollector {
                public C118851() {
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((GasmanChildUIState) obj, (Continuation<? super Unit>) continuation);
                }

                @Nullable
                public final Object emit(@NotNull GasmanChildUIState gasmanChildUIState, @NotNull Continuation<? super Unit> continuation) {
                    if (gasmanChildUIState.getAnimateGas()) {
                        uIGasmanGame6Fragment.animateGas();
                        uIGasmanGame6Fragment.getViewModel().gasAnimated();
                    }
                    FragmentGasmanGame6Binding fragmentGasmanGame6BindingAccess$getBinding = UIGasmanGame6Fragment.access$getBinding(uIGasmanGame6Fragment);
                    fragmentGasmanGame6BindingAccess$getBinding.tvTopPlot.setText(String.valueOf(gasmanChildUIState.getTopPlotQuantity()));
                    if (gasmanChildUIState.getTopPlotQuantity() == 0) {
                        fragmentGasmanGame6BindingAccess$getBinding.ivCornerPipeTopPlot.setVisibility(0);
                    }
                    fragmentGasmanGame6BindingAccess$getBinding.tvMiddlePlot.setText(String.valueOf(gasmanChildUIState.getMiddlePlotQuantity()));
                    int middlePlotQuantity = gasmanChildUIState.getMiddlePlotQuantity();
                    if (middlePlotQuantity == 0) {
                        fragmentGasmanGame6BindingAccess$getBinding.ivStraightPipeMiddlePlot.setVisibility(0);
                    } else if (middlePlotQuantity == 1) {
                        fragmentGasmanGame6BindingAccess$getBinding.ivStraightPipeMiddlePlot1.setVisibility(0);
                    }
                    fragmentGasmanGame6BindingAccess$getBinding.tvBotPlot.setText(String.valueOf(gasmanChildUIState.getBotPlotQuantity()));
                    int botPlotQuantity = gasmanChildUIState.getBotPlotQuantity();
                    if (botPlotQuantity == 0) {
                        fragmentGasmanGame6BindingAccess$getBinding.ivTeePipeBotPlot.setVisibility(0);
                    } else if (botPlotQuantity == 1) {
                        fragmentGasmanGame6BindingAccess$getBinding.ivTeePipeBotPlot1.setVisibility(0);
                    }
                    Collection<Boolean> collectionValues = gasmanChildUIState.getCheckIfPipesInPlaces().values();
                    if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                        uIGasmanGame6Fragment.getGasmanChildViewModel().setAnimateGas();
                    } else {
                        Iterator<T> it = collectionValues.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        uIGasmanGame6Fragment.getGasmanChildViewModel().setAnimateGas();
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
                    C118851 c118851 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.UIGasmanGame6Fragment.initObservers.1.1.1
                        public C118851() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((GasmanChildUIState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        @Nullable
                        public final Object emit(@NotNull GasmanChildUIState gasmanChildUIState, @NotNull Continuation<? super Unit> continuation) {
                            if (gasmanChildUIState.getAnimateGas()) {
                                uIGasmanGame6Fragment.animateGas();
                                uIGasmanGame6Fragment.getViewModel().gasAnimated();
                            }
                            FragmentGasmanGame6Binding fragmentGasmanGame6BindingAccess$getBinding = UIGasmanGame6Fragment.access$getBinding(uIGasmanGame6Fragment);
                            fragmentGasmanGame6BindingAccess$getBinding.tvTopPlot.setText(String.valueOf(gasmanChildUIState.getTopPlotQuantity()));
                            if (gasmanChildUIState.getTopPlotQuantity() == 0) {
                                fragmentGasmanGame6BindingAccess$getBinding.ivCornerPipeTopPlot.setVisibility(0);
                            }
                            fragmentGasmanGame6BindingAccess$getBinding.tvMiddlePlot.setText(String.valueOf(gasmanChildUIState.getMiddlePlotQuantity()));
                            int middlePlotQuantity = gasmanChildUIState.getMiddlePlotQuantity();
                            if (middlePlotQuantity == 0) {
                                fragmentGasmanGame6BindingAccess$getBinding.ivStraightPipeMiddlePlot.setVisibility(0);
                            } else if (middlePlotQuantity == 1) {
                                fragmentGasmanGame6BindingAccess$getBinding.ivStraightPipeMiddlePlot1.setVisibility(0);
                            }
                            fragmentGasmanGame6BindingAccess$getBinding.tvBotPlot.setText(String.valueOf(gasmanChildUIState.getBotPlotQuantity()));
                            int botPlotQuantity = gasmanChildUIState.getBotPlotQuantity();
                            if (botPlotQuantity == 0) {
                                fragmentGasmanGame6BindingAccess$getBinding.ivTeePipeBotPlot.setVisibility(0);
                            } else if (botPlotQuantity == 1) {
                                fragmentGasmanGame6BindingAccess$getBinding.ivTeePipeBotPlot1.setVisibility(0);
                            }
                            Collection<Boolean> collectionValues = gasmanChildUIState.getCheckIfPipesInPlaces().values();
                            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                                uIGasmanGame6Fragment.getGasmanChildViewModel().setAnimateGas();
                            } else {
                                Iterator<T> it = collectionValues.iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) it.next()).booleanValue()) {
                                        break;
                                    }
                                }
                                uIGasmanGame6Fragment.getGasmanChildViewModel().setAnimateGas();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (uiState.collect(c118851, this) == coroutine_suspended) {
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
                Lifecycle lifecycle = UIGasmanGame6Fragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UIGasmanGame6Fragment.this, null);
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
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C41071(null), 3, null);
    }

    private final void initDropAreas() {
        getBinding().getRoot().setOnDragListener(new GasmanDragAndDropListener(getListOfDropAreas(), getGasmanChildViewModel()).invoke());
    }

    private final List<GasmanDropAreaItem> getListOfDropAreas() {
        FragmentGasmanGame6Binding binding = getBinding();
        List<ImageView> list = this.middlePlotListOfViews;
        ImageView ivStraightDropArea1 = binding.ivStraightDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivStraightDropArea1, "ivStraightDropArea1");
        GasmanDropAreaTag.STRAIGHT_LONG_PIPE_90_DEGREES straight_long_pipe_90_degrees = GasmanDropAreaTag.STRAIGHT_LONG_PIPE_90_DEGREES.INSTANCE;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(180.0f);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf, fValueOf2});
        MIDDLE_PLOT middle_plot = MIDDLE_PLOT.INSTANCE;
        GasmanDropAreaItem gasmanDropAreaItem = new GasmanDropAreaItem(list, ivStraightDropArea1, straight_long_pipe_90_degrees, 90.0f, listListOf, middle_plot);
        List<ImageView> list2 = this.middlePlotListOfViews;
        ImageView ivStraightDropArea2 = binding.ivStraightDropArea2;
        Intrinsics.checkNotNullExpressionValue(ivStraightDropArea2, "ivStraightDropArea2");
        Float fValueOf3 = Float.valueOf(90.0f);
        GasmanDropAreaItem gasmanDropAreaItem2 = new GasmanDropAreaItem(list2, ivStraightDropArea2, straight_long_pipe_90_degrees, 270.0f, CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fValueOf3, Float.valueOf(270.0f)}), middle_plot);
        List<ImageView> list3 = this.topPlotListOfViews;
        ImageView ivCornerDropArea1 = binding.ivCornerDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivCornerDropArea1, "ivCornerDropArea1");
        GasmanDropAreaItem gasmanDropAreaItem3 = new GasmanDropAreaItem(list3, ivCornerDropArea1, GasmanDropAreaTag.USUAL_PIPE.INSTANCE, 180.0f, CollectionsKt__CollectionsJVMKt.listOf(fValueOf3), TOP_PLOT.INSTANCE);
        List<ImageView> list4 = this.botPlotListOfViews;
        ImageView ivTeePipeDropArea1 = binding.ivTeePipeDropArea1;
        Intrinsics.checkNotNullExpressionValue(ivTeePipeDropArea1, "ivTeePipeDropArea1");
        GasmanDropAreaTag.TEE_PIPE tee_pipe = GasmanDropAreaTag.TEE_PIPE.INSTANCE;
        List listListOf2 = CollectionsKt__CollectionsJVMKt.listOf(fValueOf2);
        BOT_PLOT bot_plot = BOT_PLOT.INSTANCE;
        GasmanDropAreaItem gasmanDropAreaItem4 = new GasmanDropAreaItem(list4, ivTeePipeDropArea1, tee_pipe, 180.0f, listListOf2, bot_plot);
        List<ImageView> list5 = this.botPlotListOfViews;
        ImageView ivTeePipeDropArea2 = binding.ivTeePipeDropArea2;
        Intrinsics.checkNotNullExpressionValue(ivTeePipeDropArea2, "ivTeePipeDropArea2");
        return CollectionsKt__CollectionsKt.mutableListOf(gasmanDropAreaItem, gasmanDropAreaItem2, gasmanDropAreaItem3, gasmanDropAreaItem4, new GasmanDropAreaItem(list5, ivTeePipeDropArea2, tee_pipe, 180.0f, CollectionsKt__CollectionsJVMKt.listOf(fValueOf), bot_plot));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initPlotsOnTouchListener() {
        FragmentGasmanGame6Binding binding = getBinding();
        this.topPlotListOfViews.addAll(CollectionsKt__CollectionsJVMKt.listOf(binding.ivCornerPipeTopPlot1));
        Iterator<T> it = this.topPlotListOfViews.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
        this.middlePlotListOfViews.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivStraightPipeMiddlePlot2, binding.ivStraightPipeMiddlePlot1}));
        Iterator<T> it2 = this.middlePlotListOfViews.iterator();
        while (it2.hasNext()) {
            ((ImageView) it2.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
        this.botPlotListOfViews.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivTeePipeBotPlot2, binding.ivTeePipeBotPlot1}));
        Iterator<T> it3 = this.botPlotListOfViews.iterator();
        while (it3.hasNext()) {
            ((ImageView) it3.next()).setOnTouchListener(GasmanUtils.INSTANCE.setOnActionDownListener());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void animateGas() {
        FragmentGasmanGame6Binding binding = getBinding();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = binding.ivAnimationGas.animate();
        viewPropertyAnimatorAnimate.setDuration(1000L);
        viewPropertyAnimatorAnimate.alpha(1.0f);
        viewPropertyAnimatorAnimate.start();
        for (ImageView imageView : CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{binding.ivCornerPipeTopPlot1, binding.ivStraightPipeMiddlePlot2, binding.ivStraightPipeMiddlePlot1, binding.ivTeePipeBotPlot2, binding.ivTeePipeBotPlot1, binding.ivTeeStaticPipe1, binding.ivCornerStaticPipe1, binding.ivCornerStaticPipe2, binding.ivCornerStaticPipe3})) {
            GasmanUtils gasmanUtils = GasmanUtils.INSTANCE;
            Intrinsics.checkNotNull(imageView);
            gasmanUtils.animateImageViews(imageView);
            imageView.setOnClickListener(null);
        }
    }
}

