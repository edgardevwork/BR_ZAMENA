package com.blackhub.bronline.game.gui.electric.p013ui;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.p007ts.H262Reader;
import com.blackhub.bronline.databinding.BlockToggleSwitchElectricBinding;
import com.blackhub.bronline.databinding.FragmentCollectSchemeBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.LongExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: CollectSchemeFragment.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCollectSchemeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n106#2,15:335\n106#2,15:350\n41#3:365\n42#3:368\n41#3,2:369\n1855#4,2:366\n1855#4,2:371\n*S KotlinDebug\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment\n*L\n61#1:335,15\n64#1:350,15\n177#1:365\n177#1:368\n197#1:369,2\n190#1:366,2\n239#1:371,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CollectSchemeFragment extends BaseFragmentWithState<CollectSchemeUiState, CollectSchemeViewModel, FragmentCollectSchemeBinding> {
    public static final long INTERVAL_IN_MILLIS = 1000;
    public static final int RANDOM_FROM = 3;
    public static final int RANDOM_TO = 6;
    public static final long TOTAL_TIME_IN_MILLIS = 60000;

    @Inject
    public MainViewModelFactory<CollectSchemeViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public TranslateAnimation handTranslateAnimation;

    @NotNull
    public List<Integer> listElementScheme;

    @NotNull
    public List<Integer> listElementSwitch;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    @Nullable
    public CountDownTimer timer;

    @NotNull
    public List<BlockToggleSwitchElectricBinding> togglesList;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    public CollectSchemeFragment() {
        super(R.layout.fragment_collect_scheme);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                CollectSchemeFragment collectSchemeFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(collectSchemeFragment, collectSchemeFragment.getFactory()).get(CollectSchemeViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CollectSchemeViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$4
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
        }, function0);
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$parentViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$6
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
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ElectricViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function03;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$special$$inlined$viewModels$default$9
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
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$screenArgs$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String string;
                Bundle arguments = this.this$0.getArguments();
                return (arguments == null || (string = arguments.getString(ElectricConstants.ELECTRIC_BUNDLE)) == null) ? AnyExtensionKt.empty(this.this$0) : string;
            }
        });
        this.togglesList = CollectionsKt__CollectionsKt.emptyList();
        this.listElementScheme = CollectionsKt__CollectionsKt.emptyList();
        this.listElementSwitch = new ArrayList();
    }

    public static final /* synthetic */ FragmentCollectSchemeBinding access$getBinding(CollectSchemeFragment collectSchemeFragment) {
        return collectSchemeFragment.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<CollectSchemeViewModel> getFactory() {
        MainViewModelFactory<CollectSchemeViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<CollectSchemeViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public CollectSchemeViewModel getViewModel() {
        return (CollectSchemeViewModel) this.viewModel.getValue();
    }

    public final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            CollectSchemeViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2);
        }
        getParentViewModel().sendStartMiniGame();
        setRandom();
        setListeners();
        if (getViewModel().getUiState().getValue().isFirstGame()) {
            return;
        }
        createTimer();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull CollectSchemeUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        blockingLoader(uiState.isBlockingLoading());
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        Boolean boolIsWin = uiState.isWin();
        if (boolIsWin != null) {
            getParentViewModel().sendFinishMiniGame(boolIsWin.booleanValue());
        }
        if (uiState.isHandViewShow()) {
            createHandAnimation();
        } else {
            clearHandAnimation();
        }
        if (uiState.isInstructionsShow() || uiState.isTimerStart()) {
            return;
        }
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        getViewModel().startTimer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        dismissGameInstructionsDialog();
        timerStop();
        clearHandAnimation();
        super.onDestroy();
    }

    /* compiled from: CollectSchemeFragment.kt */
    @Metadata(m7104d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"com/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment$createTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$createTimer$1 */
    public static final class CountDownTimerC39551 extends CountDownTimer {
        public CountDownTimerC39551() {
            super(60000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            CollectSchemeFragment.access$getBinding(CollectSchemeFragment.this).tvCollectSchemeTime.setText(LongExtensionKt.parseTimeToStringWithFormat(millisUntilFinished));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CollectSchemeFragment.access$getBinding(CollectSchemeFragment.this).tvCollectSchemeTime.setText(CollectSchemeFragment.this.getString(R.string.common_time_zero));
            CollectSchemeFragment.this.getParentViewModel().sendFinishMiniGame(false);
        }
    }

    public final void createTimer() {
        this.timer = new CountDownTimer() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment.createTimer.1
            public CountDownTimerC39551() {
                super(60000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                CollectSchemeFragment.access$getBinding(CollectSchemeFragment.this).tvCollectSchemeTime.setText(LongExtensionKt.parseTimeToStringWithFormat(millisUntilFinished));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                CollectSchemeFragment.access$getBinding(CollectSchemeFragment.this).tvCollectSchemeTime.setText(CollectSchemeFragment.this.getString(R.string.common_time_zero));
                CollectSchemeFragment.this.getParentViewModel().sendFinishMiniGame(false);
            }
        };
    }

    /* compiled from: CollectSchemeFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$setRandom$1", m7120f = "CollectSchemeFragment.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCollectSchemeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment$setRandom$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1549#2:339\n1620#2,3:340\n*S KotlinDebug\n*F\n+ 1 CollectSchemeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/CollectSchemeFragment$setRandom$1\n*L\n166#1:335\n166#1:336,3\n169#1:339\n169#1:340,3\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$setRandom$1 */
    public static final class C39561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39561(Continuation<? super C39561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CollectSchemeFragment.this.new C39561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FragmentCollectSchemeBinding fragmentCollectSchemeBindingAccess$getBinding = CollectSchemeFragment.access$getBinding(CollectSchemeFragment.this);
            CollectSchemeFragment collectSchemeFragment = CollectSchemeFragment.this;
            int iRandom = RangesKt___RangesKt.random(new IntRange(3, 6), Random.INSTANCE);
            List listShuffled = CollectionsKt__CollectionsJVMKt.shuffled(CollectionsKt__CollectionsKt.mutableListOf(fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneOne, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneTwo, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneThree, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneFour, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneFive, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeTwoOne, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeTwoTwo, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeTwoThree, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeTwoFour, fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeTwoFive));
            Intrinsics.checkNotNull(listShuffled, "null cannot be cast to non-null type kotlin.collections.MutableList<@[EnhancedNullability] androidx.appcompat.widget.AppCompatImageView>");
            List listAsMutableList = TypeIntrinsics.asMutableList(listShuffled);
            for (int i = 0; i < iRandom; i++) {
                CollectionsKt__MutableCollectionsKt.removeLast(listAsMutableList);
            }
            if (!listAsMutableList.contains(fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneOne)) {
                listAsMutableList.add(fragmentCollectSchemeBindingAccess$getBinding.ivCollectSchemeBulbColorSchemeOneOne);
            }
            List<AppCompatImageView> list = listAsMutableList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (AppCompatImageView appCompatImageView : list) {
                Intrinsics.checkNotNull(appCompatImageView);
                collectSchemeFragment.setBulbColorToggleOn(appCompatImageView);
                arrayList.add(Unit.INSTANCE);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boxing.boxInt(collectSchemeFragment.mapIvToInt(((AppCompatImageView) it.next()).getId())));
            }
            collectSchemeFragment.listElementScheme = CollectionsKt___CollectionsKt.sorted(arrayList2);
            return Unit.INSTANCE;
        }
    }

    public final void setRandom() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C39561(null), 3, null);
    }

    private final void setListeners() {
        FragmentCollectSchemeBinding binding = getBinding();
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneOne = binding.rbCollectSchemeToggleSwitchOneOne;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneOne, "rbCollectSchemeToggleSwitchOneOne");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneTwo = binding.rbCollectSchemeToggleSwitchOneTwo;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneTwo, "rbCollectSchemeToggleSwitchOneTwo");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneThree = binding.rbCollectSchemeToggleSwitchOneThree;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneThree, "rbCollectSchemeToggleSwitchOneThree");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFour = binding.rbCollectSchemeToggleSwitchOneFour;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneFour, "rbCollectSchemeToggleSwitchOneFour");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchOneFive = binding.rbCollectSchemeToggleSwitchOneFive;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchOneFive, "rbCollectSchemeToggleSwitchOneFive");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoOne = binding.rbCollectSchemeToggleSwitchTwoOne;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoOne, "rbCollectSchemeToggleSwitchTwoOne");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoTwo = binding.rbCollectSchemeToggleSwitchTwoTwo;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoTwo, "rbCollectSchemeToggleSwitchTwoTwo");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoThree = binding.rbCollectSchemeToggleSwitchTwoThree;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoThree, "rbCollectSchemeToggleSwitchTwoThree");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFour = binding.rbCollectSchemeToggleSwitchTwoFour;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoFour, "rbCollectSchemeToggleSwitchTwoFour");
        BlockToggleSwitchElectricBinding rbCollectSchemeToggleSwitchTwoFive = binding.rbCollectSchemeToggleSwitchTwoFive;
        Intrinsics.checkNotNullExpressionValue(rbCollectSchemeToggleSwitchTwoFive, "rbCollectSchemeToggleSwitchTwoFive");
        List<BlockToggleSwitchElectricBinding> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BlockToggleSwitchElectricBinding[]{rbCollectSchemeToggleSwitchOneOne, rbCollectSchemeToggleSwitchOneTwo, rbCollectSchemeToggleSwitchOneThree, rbCollectSchemeToggleSwitchOneFour, rbCollectSchemeToggleSwitchOneFive, rbCollectSchemeToggleSwitchTwoOne, rbCollectSchemeToggleSwitchTwoTwo, rbCollectSchemeToggleSwitchTwoThree, rbCollectSchemeToggleSwitchTwoFour, rbCollectSchemeToggleSwitchTwoFive});
        this.togglesList = listListOf;
        Iterator<T> it = listListOf.iterator();
        while (it.hasNext()) {
            setForBlockWithToggleSwitchOnCheckedChangeListener((BlockToggleSwitchElectricBinding) it.next());
        }
    }

    public final void createHandAnimation() {
        final FragmentCollectSchemeBinding binding = getBinding();
        ImageView ivCollectSchemeHand = binding.ivCollectSchemeHand;
        Intrinsics.checkNotNullExpressionValue(ivCollectSchemeHand, "ivCollectSchemeHand");
        ViewExtensionKt.addViewObserver(ivCollectSchemeHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$createHandAnimation$1$1
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
                ImageView imageView = binding.ivCollectSchemeHand;
                CollectSchemeFragment collectSchemeFragment = this;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, imageView.getHeight() / 2.0f);
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setRepeatMode(2);
                translateAnimation.setInterpolator(new LinearInterpolator());
                translateAnimation.setDuration(700L);
                imageView.startAnimation(translateAnimation);
                collectSchemeFragment.handTranslateAnimation = translateAnimation;
            }
        });
    }

    public final void clearHandAnimation() {
        TranslateAnimation translateAnimation = this.handTranslateAnimation;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        this.handTranslateAnimation = null;
    }

    public final void setForBlockWithToggleSwitchOnCheckedChangeListener(final BlockToggleSwitchElectricBinding rbBlock) {
        rbBlock.toggle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$$ExternalSyntheticLambda0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) throws JSONException {
                CollectSchemeFragment.setForBlockWithToggleSwitchOnCheckedChangeListener$lambda$5(this.f$0, rbBlock, radioGroup, i);
            }
        });
    }

    public static final void setForBlockWithToggleSwitchOnCheckedChangeListener$lambda$5(CollectSchemeFragment this$0, BlockToggleSwitchElectricBinding rbBlock, RadioGroup radioGroup, int i) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rbBlock, "$rbBlock");
        int iMapRbToInt = this$0.mapRbToInt(rbBlock);
        switch (i) {
            case R.id.switch_off /* 2131364105 */:
                rbBlock.ivToggleSwitchBulbColor.setBackgroundResource(R.drawable.img_bulb_circle_red);
                this$0.listElementSwitch.remove(Integer.valueOf(iMapRbToInt));
                this$0.checkedLists();
                break;
            case R.id.switch_on /* 2131364106 */:
                rbBlock.ivToggleSwitchBulbColor.setBackgroundResource(R.drawable.img_bulb_circle_green);
                this$0.listElementSwitch.add(Integer.valueOf(iMapRbToInt));
                if ((!this$0.listElementSwitch.isEmpty()) && this$0.listElementSwitch.size() == 1) {
                    this$0.getViewModel().turnOnHintThree();
                }
                if (this$0.listElementScheme.contains(Integer.valueOf(iMapRbToInt))) {
                    this$0.checkedLists();
                    break;
                } else {
                    CollectSchemeViewModel viewModel = this$0.getViewModel();
                    String string = this$0.getString(R.string.electric_collect_scheme_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    viewModel.showErrorMessage(string);
                    Iterator<T> it = this$0.togglesList.iterator();
                    while (it.hasNext()) {
                        ((BlockToggleSwitchElectricBinding) it.next()).toggle.check(R.id.switch_off);
                    }
                    break;
                }
        }
    }

    public final void checkedLists() {
        if (Intrinsics.areEqual(CollectionsKt___CollectionsKt.sorted(this.listElementSwitch), this.listElementScheme)) {
            CountDownTimer countDownTimer = this.timer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            enableTrafficLight();
        }
    }

    public final void enableTrafficLight() {
        getViewModel().changeColorTrafficLight();
    }

    public final void setBulbColorToggleOn(View view) {
        view.setBackgroundResource(R.drawable.img_bulb_circle_green);
    }

    public final int mapRbToInt(BlockToggleSwitchElectricBinding id) {
        FragmentCollectSchemeBinding binding = getBinding();
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneOne)) {
            return 11;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneTwo)) {
            return 12;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneThree)) {
            return 13;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneFour)) {
            return 14;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchOneFive)) {
            return 15;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoOne)) {
            return 21;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoTwo)) {
            return 22;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoThree)) {
            return 23;
        }
        if (Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoFour)) {
            return 24;
        }
        return Intrinsics.areEqual(id, binding.rbCollectSchemeToggleSwitchTwoFive) ? 25 : 0;
    }

    public final int mapIvToInt(int id) {
        FragmentCollectSchemeBinding binding = getBinding();
        if (id == binding.ivCollectSchemeBulbColorSchemeOneOne.getId()) {
            return 11;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneTwo.getId()) {
            return 12;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneThree.getId()) {
            return 13;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneFour.getId()) {
            return 14;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeOneFive.getId()) {
            return 15;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoOne.getId()) {
            return 21;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoTwo.getId()) {
            return 22;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoThree.getId()) {
            return 23;
        }
        if (id == binding.ivCollectSchemeBulbColorSchemeTwoFour.getId()) {
            return 24;
        }
        return id == binding.ivCollectSchemeBulbColorSchemeTwoFive.getId() ? 25 : 0;
    }

    public final void timerStop() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        GameInstructionsDialog gameInstructionsDialogCreate = companion.create(contextRequireContext, hintsList, new C39541(getViewModel()));
        gameInstructionsDialogCreate.show();
        this.gameInstructionsDialog = gameInstructionsDialogCreate;
    }

    /* compiled from: CollectSchemeFragment.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment$createGameInstructionsDialog$1 */

    public /* synthetic */ class C39541 extends FunctionReferenceImpl implements Function0<Unit> {
        public C39541(Object obj) {
            super(0, obj, CollectSchemeViewModel.class, "closeInstruction", "closeInstruction()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            ((CollectSchemeViewModel) this.receiver).closeInstruction();
        }
    }

    public final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }

    private final void blockingLoader(boolean isShow) {
        BaseFragmentWithState.openOrDismissBlockingLoader$default(this, 3, isShow, false, false, false, null, true, false, H262Reader.START_GROUP, null);
    }
}

