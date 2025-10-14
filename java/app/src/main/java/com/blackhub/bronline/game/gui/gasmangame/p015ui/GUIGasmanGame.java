package com.blackhub.bronline.game.gui.gasmangame.p015ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentGasmanMainContainerBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIGasmanGame.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIGasmanGame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIGasmanGame.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/GUIGasmanGame\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,174:1\n106#2,15:175\n106#2,15:190\n28#3,12:205\n*S KotlinDebug\n*F\n+ 1 GUIGasmanGame.kt\ncom/blackhub/bronline/game/gui/gasmangame/ui/GUIGasmanGame\n*L\n35#1:175,15\n40#1:190,15\n156#1:205,12\n*E\n"})

public final class GUIGasmanGame extends BaseISAMPGUIFragment<FragmentGasmanMainContainerBinding> {
    public static final int $stable = 8;

    /* renamed from: childViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy childViewModel;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    @Inject
    public MainViewModelFactory<GasmanChildViewModel> vmChildFactory;

    @Inject
    public MainViewModelFactory<GasmanParentViewModel> vmParentFactory;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 58;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentGasmanMainContainerBinding access$getBinding(GUIGasmanGame gUIGasmanGame) {
        return (FragmentGasmanMainContainerBinding) gUIGasmanGame.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<GasmanParentViewModel> getVmParentFactory() {
        MainViewModelFactory<GasmanParentViewModel> mainViewModelFactory = this.vmParentFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vmParentFactory");
        return null;
    }

    public final void setVmParentFactory(@NotNull MainViewModelFactory<GasmanParentViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.vmParentFactory = mainViewModelFactory;
    }

    public final GasmanParentViewModel getParentViewModel() {
        return (GasmanParentViewModel) this.parentViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<GasmanChildViewModel> getVmChildFactory() {
        MainViewModelFactory<GasmanChildViewModel> mainViewModelFactory = this.vmChildFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vmChildFactory");
        return null;
    }

    public final void setVmChildFactory(@NotNull MainViewModelFactory<GasmanChildViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.vmChildFactory = mainViewModelFactory;
    }

    public final GasmanChildViewModel getChildViewModel() {
        return (GasmanChildViewModel) this.childViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentGasmanMainContainerBinding getViewBinding() {
        FragmentGasmanMainContainerBinding fragmentGasmanMainContainerBindingInflate = FragmentGasmanMainContainerBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentGasmanMainContainerBindingInflate, "inflate(...)");
        return fragmentGasmanMainContainerBindingInflate;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        showExitDialog();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        UsefulKt.hideSystemUI(((FragmentGasmanMainContainerBinding) getBinding()).getRoot());
        initViewModel();
        ConstraintLayout root = ((FragmentGasmanMainContainerBinding) getBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionKt.addViewObserver(root, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.initViewsISAMPGUI.1
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
                GUIGasmanGame.this.getParentViewModel().setTubesSizes(GUIGasmanGame.access$getBinding(GUIGasmanGame.this).getRoot().getWidth());
            }
        });
        getChildFragmentManager().beginTransaction().replace(R.id.fragmentContainer, UIGasmanLoadingFragment.class, (Bundle) null).commit();
        ImageButton ibExit = ((FragmentGasmanMainContainerBinding) getBinding()).ibExit;
        Intrinsics.checkNotNullExpressionValue(ibExit, "ibExit");
        setOnClickListenerWithAnimAndDelay(ibExit, 250L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.initViewsISAMPGUI.2
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
                GUIGasmanGame.this.showExitDialog();
            }
        });
        ImageButton ibInfo = ((FragmentGasmanMainContainerBinding) getBinding()).ibInfo;
        Intrinsics.checkNotNullExpressionValue(ibInfo, "ibInfo");
        setOnClickListenerWithAnimAndDelay(ibInfo, 250L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.initViewsISAMPGUI.3
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
                FragmentActivity activity = GUIGasmanGame.this.getActivity();
                if (activity != null) {
                    new UIGasmanHintDialog(activity).show();
                }
            }
        });
        getParentViewModel().setResultOfGames(getJsonObj());
        getParentViewModel().setNeedToShowDialog(getJsonObj());
    }

    /* compiled from: GUIGasmanGame.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1", m7120f = "GUIGasmanGame.kt", m7121i = {}, m7122l = {86}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1 */
    public static final class C40971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40971(Continuation<? super C40971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIGasmanGame.this.new C40971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GUIGasmanGame.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1$1", m7120f = "GUIGasmanGame.kt", m7121i = {}, m7122l = {87}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$initViewModel$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ GUIGasmanGame this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GUIGasmanGame gUIGasmanGame, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = gUIGasmanGame;
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<GasmanParentUIState> uiState = this.this$0.getParentViewModel().getUiState();
                    final GUIGasmanGame gUIGasmanGame = this.this$0;
                    FlowCollector<? super GasmanParentUIState> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.initViewModel.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((GasmanParentUIState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        @Nullable
                        public final Object emit(@NotNull GasmanParentUIState gasmanParentUIState, @NotNull Continuation<? super Unit> continuation) {
                            FragmentActivity activity;
                            if (gasmanParentUIState.getLoadingFragmentEnded()) {
                                gUIGasmanGame.getParentViewModel().calculateGames();
                                Group containerGroup = GUIGasmanGame.access$getBinding(gUIGasmanGame).containerGroup;
                                Intrinsics.checkNotNullExpressionValue(containerGroup, "containerGroup");
                                ViewExtensionKt.animateAlphaForAll(containerGroup, 1.0f);
                                if (gasmanParentUIState.isNeedToShowDialog() && (activity = gUIGasmanGame.getActivity()) != null) {
                                    new UIGasmanHintDialog(activity).show();
                                }
                            }
                            if (!gasmanParentUIState.getRandomListOfGames().isEmpty()) {
                                int quantityOfChecks = gasmanParentUIState.getQuantityOfChecks();
                                if (quantityOfChecks < 3 && gasmanParentUIState.getCurrentFragmentNumber() != gasmanParentUIState.getRandomListOfGames().get(quantityOfChecks).intValue()) {
                                    gUIGasmanGame.replaceChildFragment(gasmanParentUIState.getRandomListOfGames().get(quantityOfChecks).intValue());
                                }
                                GUIGasmanGame.access$getBinding(gUIGasmanGame).tvQuantityOfChecks.setText(gUIGasmanGame.getString(R.string.gasman_checked_int_of_3, Boxing.boxInt(quantityOfChecks)));
                                if (quantityOfChecks == 1) {
                                    GUIGasmanGame gUIGasmanGame2 = gUIGasmanGame;
                                    View vResultOfCheck1 = GUIGasmanGame.access$getBinding(gUIGasmanGame2).vResultOfCheck1;
                                    Intrinsics.checkNotNullExpressionValue(vResultOfCheck1, "vResultOfCheck1");
                                    gUIGasmanGame2.setResultDrawable(vResultOfCheck1, quantityOfChecks);
                                } else if (quantityOfChecks == 2) {
                                    GUIGasmanGame gUIGasmanGame3 = gUIGasmanGame;
                                    View vResultOfCheck2 = GUIGasmanGame.access$getBinding(gUIGasmanGame3).vResultOfCheck2;
                                    Intrinsics.checkNotNullExpressionValue(vResultOfCheck2, "vResultOfCheck2");
                                    gUIGasmanGame3.setResultDrawable(vResultOfCheck2, quantityOfChecks);
                                } else if (quantityOfChecks == 3) {
                                    GUIGasmanGame gUIGasmanGame4 = gUIGasmanGame;
                                    View vResultOfCheck3 = GUIGasmanGame.access$getBinding(gUIGasmanGame4).vResultOfCheck3;
                                    Intrinsics.checkNotNullExpressionValue(vResultOfCheck3, "vResultOfCheck3");
                                    gUIGasmanGame4.setResultDrawable(vResultOfCheck3, quantityOfChecks);
                                    gUIGasmanGame.getParentViewModel().sendGameEnded();
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (uiState.collect(flowCollector, this) == coroutine_suspended) {
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
                Lifecycle lifecycle = GUIGasmanGame.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(GUIGasmanGame.this, null);
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

    public final void initViewModel() {
        getChildViewModel();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C40971(null), 3, null);
    }

    public final void setResultDrawable(View view, int quantityOfChecks) {
        if (getContext() != null) {
            List<Integer> listResultOfCheck = getParentViewModel().getUiState().getValue().getListResultOfCheck();
            if ((!listResultOfCheck.isEmpty()) && listResultOfCheck.size() == 3) {
                if (listResultOfCheck.get(quantityOfChecks - 1).intValue() == 1) {
                    ViewExtensionKt.loadBackground$default(view, Integer.valueOf(R.drawable.bg_gasman_result_of_check_green), null, null, 6, null);
                } else {
                    ViewExtensionKt.loadBackground$default(view, Integer.valueOf(R.drawable.bg_gasman_result_of_check_red), null, null, 6, null);
                }
            }
        }
    }

    public final void replaceChildFragment(int fragmentNumber) {
        Class<? extends Fragment> cls = UIGasmanGame1Fragment.class;
        switch (fragmentNumber) {
            case 2:
                cls = UIGasmanGame2Fragment.class;
                break;
            case 3:
                cls = UIGasmanGame3Fragment.class;
                break;
            case 4:
                cls = UIGasmanGame4Fragment.class;
                break;
            case 5:
                cls = UIGasmanGame5Fragment.class;
                break;
            case 6:
                cls = UIGasmanGame6Fragment.class;
                break;
            case 7:
                cls = UIGasmanGame7Fragment.class;
                break;
            case 8:
                cls = UIGasmanGame8Fragment.class;
                break;
            case 9:
                cls = UIGasmanGame9Fragment.class;
                break;
            case 10:
                cls = UIGasmanGame10Fragment.class;
                break;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.replace(R.id.fragmentContainer, cls, (Bundle) null);
        fragmentTransactionBeginTransaction.commit();
        getParentViewModel().setCurrentFragmentNumber(fragmentNumber);
    }

    public final void showExitDialog() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            UIGasmanExitDialog uIGasmanExitDialog = new UIGasmanExitDialog(activity);
            uIGasmanExitDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$showExitDialog$1$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws JSONException {
                    this.this$0.getParentViewModel().sendButtonExitPressed();
                }
            });
            uIGasmanExitDialog.show();
        }
    }

    public GUIGasmanGame() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$parentViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return this.this$0;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$parentViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getVmParentFactory();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$1
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
        final Function0 function03 = null;
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanParentViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$childViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return this.this$0;
            }
        };
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$childViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getVmChildFactory();
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$5
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
        this.childViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GasmanChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function03;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function05);
    }
}

