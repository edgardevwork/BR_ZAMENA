package com.blackhub.bronline.game.gui.electric.p013ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentRaiseChargeBinding;
import com.blackhub.bronline.game.common.BaseFragmentWithState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.blackhub.bronline.game.gui.electric.view.ProgressBarWithListener;
import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RaiseChargeFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 V2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020/H\u0002J\b\u00107\u001a\u00020/H\u0002J\b\u00108\u001a\u00020/H\u0002J\b\u00109\u001a\u00020/H\u0002J\u0016\u0010:\u001a\u00020/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020\u0002H\u0016J\b\u0010F\u001a\u00020/H\u0002J\b\u0010G\u001a\u00020/H\u0016J\u0010\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020/H\u0016J\b\u0010L\u001a\u00020/H\u0016J\u0010\u0010M\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u001bH\u0002J\u0010\u0010N\u001a\u00020/2\u0006\u0010A\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020/2\u0006\u0010A\u001a\u00020OH\u0002J\b\u0010Q\u001a\u00020/H\u0002J\u0010\u0010R\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\b\u0010S\u001a\u00020/H\u0002J\b\u0010T\u001a\u00020/H\u0002J\b\u0010U\u001a\u00020/H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b+\u0010,¨\u0006W"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/ui/RaiseChargeFragment;", "Lcom/blackhub/bronline/game/common/BaseFragmentWithState;", "Lcom/blackhub/bronline/game/gui/electric/state/RaiseChargeUiState;", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel;", "Lcom/blackhub/bronline/databinding/FragmentRaiseChargeBinding;", "()V", "animatorPB", "Landroid/animation/ObjectAnimator;", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "gameInstructionsDialog", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "handRotateAnimation", "Landroid/view/animation/RotateAnimation;", "jobButton", "Lkotlinx/coroutines/Job;", "jobImageCharge", "listenerFour", "Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener$OnProgressChangeListener;", "listenerOne", "listenerThree", "listenerTwo", "markerFourValue", "", "markerOneValue", "markerThreeValue", "markerTwoValue", "parentViewModel", "Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "getParentViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/ElectricViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "screenArgs", "", "getScreenArgs", "()Ljava/lang/String;", "screenArgs$delegate", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel;", "viewModel$delegate", "animateButton", "", "animateImageCharge", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "changeProgressBar", CatchStreamerKeys.COUNT_KEY, "", "checkProgressBarValidate", "clearAnimator", "clearHandAnimation", "clearProgress", "createGameInstructionsDialog", "hintsList", "", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "createHandAnimation", "dismissGameInstructionsDialog", "getResultChecked", "progressBar", "Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener;", "markerValue", "handleUiState", "uiState", "initButtons", "initViews", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPause", "progressBarListener", "setAnimatorDown", "Landroid/widget/ProgressBar;", "setProgressBarAnimator", "startPulseButton", "startPulseImageCharge", "stopPulseButton", "stopPulseImage", "stopUi", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRaiseChargeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/RaiseChargeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewExtension.kt\ncom/blackhub/bronline/game/core/extension/ViewExtensionKt\n*L\n1#1,536:1\n106#2,15:537\n106#2,15:552\n41#3,2:567\n41#3:569\n41#3,2:570\n41#3,2:572\n42#3:574\n41#3,2:575\n41#3,2:577\n41#3,2:579\n41#3,2:581\n41#3,2:583\n41#3,2:585\n41#3,2:587\n41#3,2:589\n*S KotlinDebug\n*F\n+ 1 RaiseChargeFragment.kt\ncom/blackhub/bronline/game/gui/electric/ui/RaiseChargeFragment\n*L\n93#1:537,15\n96#1:552,15\n124#1:567,2\n176#1:569\n199#1:570,2\n207#1:572,2\n176#1:574\n243#1:575,2\n258#1:577,2\n282#1:579,2\n329#1:581,2\n367#1:583,2\n384#1:585,2\n458#1:587,2\n520#1:589,2\n*E\n"})
/* loaded from: classes3.dex */
public final class RaiseChargeFragment extends BaseFragmentWithState<RaiseChargeUiState, RaiseChargeViewModel, FragmentRaiseChargeBinding> {
    public static final float ANIMATION_BTN_ATTACH_SCALE_X = 1.3f;
    public static final float ANIMATION_BTN_ATTACH_SCALE_Y = 1.5f;
    public static final long ANIMATION_BTN_ONE_DURATION = 700;
    public static final long ANIMATION_BTN_TWO_DURATION = 500;
    public static final long ANIMATION_DURATION_IN_MLS_DOWN_BUTTON_ATTACH = 500;
    public static final long ANIMATION_DURATION_IN_MLS_DOWN_IMAGE_CHARGE = 500;
    public static final long ANIMATION_DURATION_IN_MLS_DOWN_PB = 250;
    public static final long ANIMATION_DURATION_IN_MLS_UP_BUTTON_ATTACH = 500;
    public static final long ANIMATION_DURATION_IN_MLS_UP_IMAGE_CHARGE = 500;
    public static final long ANIMATION_DURATION_IN_MLS_UP_PB = 250;
    public static final float ANIMATION_IMAGE_CHARGE_END_SCALE = 0.8f;
    public static final float ANIMATION_IMAGE_CHARGE_START_SCALE = 1.2f;
    public static final float BTN_RAISE_CHARGE_SCALE = 1.1f;
    public static final int FULL_PROGRESS = 100;
    public static final float HAND_DEGREE = -30.0f;
    public static final int MARKER_BIAS_MAX = 8;
    public static final int MARKER_BIAS_MIN = 3;
    public static final float MARKER_VALUE_ERROR = 0.05f;
    public static final float PROGRESS_BAR_WIN_MAX_POSITION = 99.0f;

    @Nullable
    public ObjectAnimator animatorPB;

    @Inject
    public MainViewModelFactory<RaiseChargeViewModel> factory;

    @Nullable
    public GameInstructionsDialog gameInstructionsDialog;

    @Nullable
    public RotateAnimation handRotateAnimation;

    @Nullable
    public Job jobButton;

    @Nullable
    public Job jobImageCharge;

    @Nullable
    public ProgressBarWithListener.OnProgressChangeListener listenerFour;

    @Nullable
    public ProgressBarWithListener.OnProgressChangeListener listenerOne;

    @Nullable
    public ProgressBarWithListener.OnProgressChangeListener listenerThree;

    @Nullable
    public ProgressBarWithListener.OnProgressChangeListener listenerTwo;
    public float markerFourValue;
    public float markerOneValue;
    public float markerThreeValue;
    public float markerTwoValue;

    /* renamed from: parentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    public RaiseChargeFragment() {
        super(R.layout.fragment_raise_charge);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                RaiseChargeFragment raiseChargeFragment = this.this$0;
                return (ViewModelProvider.Factory) new ViewModelProvider(raiseChargeFragment, raiseChargeFragment.getFactory()).get(RaiseChargeViewModel.class);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RaiseChargeViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$parentViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$6
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
        this.parentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ElectricViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$special$$inlined$viewModels$default$9
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
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$screenArgs$2
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
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @NotNull
    public final MainViewModelFactory<RaiseChargeViewModel> getFactory() {
        MainViewModelFactory<RaiseChargeViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<RaiseChargeViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public RaiseChargeViewModel getViewModel() {
        return (RaiseChargeViewModel) this.viewModel.getValue();
    }

    private final ElectricViewModel getParentViewModel() {
        return (ElectricViewModel) this.parentViewModel.getValue();
    }

    private final String getScreenArgs() {
        return (String) this.screenArgs.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initViews() {
        String screenArgs = getScreenArgs();
        Intrinsics.checkNotNullExpressionValue(screenArgs, "<get-screenArgs>(...)");
        if (screenArgs.length() > 0) {
            RaiseChargeViewModel viewModel = getViewModel();
            String screenArgs2 = getScreenArgs();
            Intrinsics.checkNotNullExpressionValue(screenArgs2, "<get-screenArgs>(...)");
            viewModel.initArgs(screenArgs2);
        }
        getParentViewModel().sendStartMiniGame();
        initButtons();
        FragmentRaiseChargeBinding binding = getBinding();
        ConstraintLayout mlRaiseCharge = binding.mlRaiseCharge;
        Intrinsics.checkNotNullExpressionValue(mlRaiseCharge, "mlRaiseCharge");
        this.markerOneValue = UtilsKt.setVerticalRandomBias(mlRaiseCharge, binding.markerRaiseChargeOne.getId(), 3, 8);
        ConstraintLayout mlRaiseCharge2 = binding.mlRaiseCharge;
        Intrinsics.checkNotNullExpressionValue(mlRaiseCharge2, "mlRaiseCharge");
        this.markerTwoValue = UtilsKt.setVerticalRandomBias(mlRaiseCharge2, binding.markerRaiseChargeTwo.getId(), 3, 8);
        ConstraintLayout mlRaiseCharge3 = binding.mlRaiseCharge;
        Intrinsics.checkNotNullExpressionValue(mlRaiseCharge3, "mlRaiseCharge");
        this.markerThreeValue = UtilsKt.setVerticalRandomBias(mlRaiseCharge3, binding.markerRaiseChargeThree.getId(), 3, 8);
        ConstraintLayout mlRaiseCharge4 = binding.mlRaiseCharge;
        Intrinsics.checkNotNullExpressionValue(mlRaiseCharge4, "mlRaiseCharge");
        this.markerFourValue = UtilsKt.setVerticalRandomBias(mlRaiseCharge4, binding.markerRaiseChargeFour.getId(), 3, 8);
        this.listenerOne = progressBarListener(this.markerOneValue);
        this.listenerTwo = progressBarListener(this.markerTwoValue);
        this.listenerThree = progressBarListener(this.markerThreeValue);
        this.listenerFour = progressBarListener(this.markerFourValue);
        ProgressBarWithListener.OnProgressChangeListener onProgressChangeListener = this.listenerOne;
        if (onProgressChangeListener != null) {
            binding.pbRaiseChargeOne.setOnProgressChangeListener(onProgressChangeListener);
        }
        ProgressBarWithListener.OnProgressChangeListener onProgressChangeListener2 = this.listenerTwo;
        if (onProgressChangeListener2 != null) {
            binding.pbRaiseChargeTwo.setOnProgressChangeListener(onProgressChangeListener2);
        }
        ProgressBarWithListener.OnProgressChangeListener onProgressChangeListener3 = this.listenerThree;
        if (onProgressChangeListener3 != null) {
            binding.pbRaiseChargeThree.setOnProgressChangeListener(onProgressChangeListener3);
        }
        ProgressBarWithListener.OnProgressChangeListener onProgressChangeListener4 = this.listenerFour;
        if (onProgressChangeListener4 != null) {
            binding.pbRaiseChargeFour.setOnProgressChangeListener(onProgressChangeListener4);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull RaiseChargeUiState uiState) {
        AppCompatImageView appCompatImageView;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.isInstructionsShow()) {
            createGameInstructionsDialog(uiState.getGameInstructionsItemList());
        } else {
            GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
            if (gameInstructionsDialog != null) {
                gameInstructionsDialog.dismiss();
            }
        }
        FragmentRaiseChargeBinding binding = getBinding();
        Boolean boolIsWin = uiState.isWin();
        if (boolIsWin != null) {
            boolean zBooleanValue = boolIsWin.booleanValue();
            stopUi();
            getParentViewModel().sendFinishMiniGame(zBooleanValue);
        }
        int count = uiState.getCount();
        if (count == 1) {
            appCompatImageView = binding.ivRaiseChargeOne;
        } else if (count == 2) {
            appCompatImageView = binding.ivRaiseChargeTwo;
        } else if (count == 3) {
            appCompatImageView = binding.ivRaiseChargeThree;
        } else {
            appCompatImageView = binding.ivRaiseChargeFour;
        }
        Intrinsics.checkNotNull(appCompatImageView);
        startPulseImageCharge(appCompatImageView);
        if (uiState.isHandViewShow()) {
            createHandAnimation();
        } else {
            clearHandAnimation();
        }
        int countHint = uiState.getCountHint();
        if (countHint == 1) {
            FragmentRaiseChargeBinding binding2 = getBinding();
            AppCompatButton btnRaiseChargeRaise = binding2.btnRaiseChargeRaise;
            Intrinsics.checkNotNullExpressionValue(btnRaiseChargeRaise, "btnRaiseChargeRaise");
            PointFloat globalCenterPoint = ViewExtensionKt.getGlobalCenterPoint(btnRaiseChargeRaise);
            binding2.ivRaiseChargeHand.setX(globalCenterPoint.getX());
            binding2.ivRaiseChargeHand.setY(globalCenterPoint.getY());
        } else if (countHint == 2) {
            FragmentRaiseChargeBinding binding3 = getBinding();
            AppCompatButton btnRaiseChargeAttach = binding3.btnRaiseChargeAttach;
            Intrinsics.checkNotNullExpressionValue(btnRaiseChargeAttach, "btnRaiseChargeAttach");
            PointFloat globalCenterPoint2 = ViewExtensionKt.getGlobalCenterPoint(btnRaiseChargeAttach);
            binding3.ivRaiseChargeHand.setX(globalCenterPoint2.getX());
            binding3.ivRaiseChargeHand.setY(globalCenterPoint2.getY());
        } else if (countHint == 3) {
            if (getViewModel().getUiState().getValue().isHintShow()) {
                ObjectAnimator objectAnimator = this.animatorPB;
                if (objectAnimator != null) {
                    objectAnimator.pause();
                }
            } else {
                ObjectAnimator objectAnimator2 = this.animatorPB;
                if (objectAnimator2 != null) {
                    objectAnimator2.resume();
                }
            }
            getViewModel().hideHand();
        }
        if (uiState.isHintShow() || binding.btnRaiseChargeAttach.hasOnClickListeners() || binding.btnRaiseChargeRaise.hasOnClickListeners()) {
            return;
        }
        initButtons();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopUi();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissGameInstructionsDialog();
        stopUi();
        clearProgress();
        getViewModel().resetData();
        super.onDestroyView();
    }

    public final void initButtons() {
        FragmentRaiseChargeBinding binding = getBinding();
        AppCompatButton btnRaiseChargeAttach = binding.btnRaiseChargeAttach;
        Intrinsics.checkNotNullExpressionValue(btnRaiseChargeAttach, "btnRaiseChargeAttach");
        ViewExtensionKt.setBeforeAnimateClickListener(btnRaiseChargeAttach, new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RaiseChargeFragment.initButtons$lambda$11$lambda$9(this.f$0, view);
            }
        });
        binding.btnRaiseChargeRaise.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RaiseChargeFragment.initButtons$lambda$11$lambda$10(this.f$0, view);
            }
        });
    }

    public static final void initButtons$lambda$11$lambda$9(RaiseChargeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clearAnimator();
        this$0.checkProgressBarValidate();
        this$0.stopPulseButton();
    }

    public static final void initButtons$lambda$11$lambda$10(RaiseChargeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(this$0.getAnim());
        this$0.changeProgressBar(this$0.getViewModel().getUiState().getValue().getCount());
    }

    public final void createHandAnimation() {
        final FragmentRaiseChargeBinding binding = getBinding();
        ImageView ivRaiseChargeHand = binding.ivRaiseChargeHand;
        Intrinsics.checkNotNullExpressionValue(ivRaiseChargeHand, "ivRaiseChargeHand");
        ViewExtensionKt.addViewObserver(ivRaiseChargeHand, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$createHandAnimation$1$1
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
                RaiseChargeFragment raiseChargeFragment = this.this$0;
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -30.0f, binding.ivRaiseChargeHand.getX() + (binding.ivRaiseChargeHand.getWidth() / 2), binding.ivRaiseChargeHand.getY() + (binding.ivRaiseChargeHand.getHeight() / 2));
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setRepeatMode(2);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(700L);
                binding.ivRaiseChargeHand.startAnimation(rotateAnimation);
                raiseChargeFragment.handRotateAnimation = rotateAnimation;
            }
        });
    }

    public final void stopUi() {
        stopPulseImage();
        stopPulseButton();
        clearAnimator();
        clearHandAnimation();
        FragmentRaiseChargeBinding binding = getBinding();
        binding.btnRaiseChargeAttach.setOnClickListener(null);
        binding.btnRaiseChargeRaise.setOnClickListener(null);
    }

    /* compiled from: RaiseChargeFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseButton$1", m7120f = "RaiseChargeFragment.kt", m7121i = {0, 1}, m7122l = {292, 295}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "$this$launch"}, m7125s = {"L$0", "L$0"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseButton$1 */
    public static final class C39611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C39611(Continuation<? super C39611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39611 c39611 = RaiseChargeFragment.this.new C39611(continuation);
            c39611.L$0 = obj;
            return c39611;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0056 -> B:30:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else if (i == 1) {
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope2;
                this.label = 2;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                }
                coroutineScope = coroutineScope2;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(RaiseChargeFragment.this, null);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    this.L$0 = coroutineScope2;
                    this.label = 2;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* compiled from: RaiseChargeFragment.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseButton$1$1", m7120f = "RaiseChargeFragment.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseButton$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ RaiseChargeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RaiseChargeFragment raiseChargeFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = raiseChargeFragment;
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
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.animateButton();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void startPulseButton() {
        if (this.jobButton == null) {
            this.jobButton = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C39611(null), 3, null);
        }
    }

    public final void startPulseImageCharge(AppCompatImageView imageView) {
        stopPulseImage();
        if (AnyExtensionKt.isNull(this.jobImageCharge)) {
            this.jobImageCharge = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C39621(imageView, null), 3, null);
        }
    }

    /* compiled from: RaiseChargeFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1", m7120f = "RaiseChargeFragment.kt", m7121i = {0, 1}, m7122l = {306, 309}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "$this$launch"}, m7125s = {"L$0", "L$0"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1 */
    public static final class C39621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ AppCompatImageView $imageView;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39621(AppCompatImageView appCompatImageView, Continuation<? super C39621> continuation) {
            super(2, continuation);
            this.$imageView = appCompatImageView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39621 c39621 = RaiseChargeFragment.this.new C39621(this.$imageView, continuation);
            c39621.L$0 = obj;
            return c39621;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x005b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0058 -> B:30:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else if (i == 1) {
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope2;
                this.label = 2;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                }
                coroutineScope = coroutineScope2;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(RaiseChargeFragment.this, this.$imageView, null);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    this.L$0 = coroutineScope2;
                    this.label = 2;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* compiled from: RaiseChargeFragment.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1$1", m7120f = "RaiseChargeFragment.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$startPulseImageCharge$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ AppCompatImageView $imageView;
            public int label;
            public final /* synthetic */ RaiseChargeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RaiseChargeFragment raiseChargeFragment, AppCompatImageView appCompatImageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = raiseChargeFragment;
                this.$imageView = appCompatImageView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$imageView, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.animateImageCharge(this.$imageView);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void stopPulseButton() {
        Job job = this.jobButton;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            AppCompatButton btnRaiseChargeAttach = getBinding().btnRaiseChargeAttach;
            Intrinsics.checkNotNullExpressionValue(btnRaiseChargeAttach, "btnRaiseChargeAttach");
            ViewExtensionKt.setBackgroundDrawableWithPadding(btnRaiseChargeAttach, R.drawable.bg_rectangle_gray_hgr_cr3_t1_white);
        }
        this.jobButton = null;
    }

    public final void stopPulseImage() {
        Job job = this.jobImageCharge;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.jobImageCharge = null;
    }

    public final void animateButton() {
        final FragmentRaiseChargeBinding binding = getBinding();
        AppCompatButton btnRaiseChargeAttach = binding.btnRaiseChargeAttach;
        Intrinsics.checkNotNullExpressionValue(btnRaiseChargeAttach, "btnRaiseChargeAttach");
        ViewExtensionKt.setBackgroundDrawableWithPadding(btnRaiseChargeAttach, R.drawable.bg_rectangle_gray_hgr_cr3_t1_red);
        binding.btnRaiseChargeAttach.animate().scaleX(1.1f).scaleY(1.1f).setDuration(500L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RaiseChargeFragment.animateButton$lambda$18$lambda$15(binding);
            }
        });
        binding.btnRaiseChargeAttachAnimationOne.animate().scaleX(1.3f).scaleY(1.5f).alpha(0.0f).setDuration(700L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RaiseChargeFragment.animateButton$lambda$18$lambda$16(binding);
            }
        });
        binding.btnRaiseChargeAttachAnimationTwo.animate().scaleX(1.3f).scaleY(1.5f).alpha(0.0f).setDuration(500L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RaiseChargeFragment.animateButton$lambda$18$lambda$17(binding);
            }
        });
    }

    public static final void animateButton$lambda$18$lambda$15(FragmentRaiseChargeBinding this_invoke) {
        Intrinsics.checkNotNullParameter(this_invoke, "$this_invoke");
        this_invoke.btnRaiseChargeAttach.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L);
    }

    public static final void animateButton$lambda$18$lambda$16(FragmentRaiseChargeBinding this_invoke) {
        Intrinsics.checkNotNullParameter(this_invoke, "$this_invoke");
        this_invoke.btnRaiseChargeAttachAnimationOne.setScaleX(1.0f);
        this_invoke.btnRaiseChargeAttachAnimationOne.setScaleY(1.0f);
        this_invoke.btnRaiseChargeAttachAnimationOne.setAlpha(1.0f);
    }

    public static final void animateButton$lambda$18$lambda$17(FragmentRaiseChargeBinding this_invoke) {
        Intrinsics.checkNotNullParameter(this_invoke, "$this_invoke");
        this_invoke.btnRaiseChargeAttachAnimationTwo.setScaleX(1.0f);
        this_invoke.btnRaiseChargeAttachAnimationTwo.setScaleY(1.0f);
        this_invoke.btnRaiseChargeAttachAnimationTwo.setAlpha(1.0f);
    }

    public final void animateImageCharge(final AppCompatImageView imageView) {
        getBinding();
        imageView.animate().scaleX(1.2f).scaleY(1.2f).setDuration(500L).withEndAction(new Runnable() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RaiseChargeFragment.animateImageCharge$lambda$20$lambda$19(imageView);
            }
        });
    }

    public static final void animateImageCharge$lambda$20$lambda$19(AppCompatImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "$imageView");
        imageView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(500L);
    }

    public final void checkProgressBarValidate() {
        ProgressBarWithListener pbRaiseChargeOne;
        float f;
        FragmentRaiseChargeBinding binding = getBinding();
        int count = getViewModel().getUiState().getValue().getCount();
        if (count == 1) {
            pbRaiseChargeOne = binding.pbRaiseChargeOne;
            Intrinsics.checkNotNullExpressionValue(pbRaiseChargeOne, "pbRaiseChargeOne");
            f = this.markerOneValue;
        } else if (count == 2) {
            pbRaiseChargeOne = binding.pbRaiseChargeTwo;
            Intrinsics.checkNotNullExpressionValue(pbRaiseChargeOne, "pbRaiseChargeTwo");
            f = this.markerTwoValue;
        } else if (count == 3) {
            pbRaiseChargeOne = binding.pbRaiseChargeThree;
            Intrinsics.checkNotNullExpressionValue(pbRaiseChargeOne, "pbRaiseChargeThree");
            f = this.markerThreeValue;
        } else {
            pbRaiseChargeOne = binding.pbRaiseChargeFour;
            Intrinsics.checkNotNullExpressionValue(pbRaiseChargeOne, "pbRaiseChargeFour");
            f = this.markerFourValue;
        }
        getResultChecked(pbRaiseChargeOne, f);
    }

    /* compiled from: RaiseChargeFragment.kt */
    @Metadata(m7104d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m7105d2 = {"com/blackhub/bronline/game/gui/electric/ui/RaiseChargeFragment$progressBarListener$1", "Lcom/blackhub/bronline/game/gui/electric/view/ProgressBarWithListener$OnProgressChangeListener;", "onProgressChanged", "", "progress", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$progressBarListener$1 */
    /* loaded from: classes.dex */
    public static final class C39591 implements ProgressBarWithListener.OnProgressChangeListener {
        public final /* synthetic */ float $markerValue;

        public C39591(float f) {
            f = f;
        }

        @Override // com.blackhub.bronline.game.gui.electric.view.ProgressBarWithListener.OnProgressChangeListener
        public void onProgressChanged(int progress) {
            float f = progress / 100;
            if (progress >= 100) {
                RaiseChargeFragment.this.stopUi();
                RaiseChargeFragment.this.getViewModel().setWin(false);
                return;
            }
            if (f + 0.05f > f || f > 99.0f) {
                RaiseChargeFragment.this.stopPulseButton();
                return;
            }
            RaiseChargeFragment.this.startPulseButton();
            RaiseChargeFragment.this.clearHandAnimation();
            if (RaiseChargeFragment.this.getViewModel().getUiState().getValue().getCountHint() != 3) {
                RaiseChargeFragment.this.getViewModel().setTwoHint();
            }
            if (RaiseChargeFragment.this.getViewModel().getUiState().getValue().isHintShow()) {
                ObjectAnimator objectAnimator = RaiseChargeFragment.this.animatorPB;
                if (objectAnimator != null) {
                    objectAnimator.pause();
                }
            } else {
                ObjectAnimator objectAnimator2 = RaiseChargeFragment.this.animatorPB;
                if (objectAnimator2 != null) {
                    objectAnimator2.resume();
                }
            }
            if (RaiseChargeFragment.this.getViewModel().getUiState().getValue().isHandViewShow()) {
                RaiseChargeFragment.this.createHandAnimation();
            }
        }
    }

    public final ProgressBarWithListener.OnProgressChangeListener progressBarListener(float markerValue) {
        return new ProgressBarWithListener.OnProgressChangeListener() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment.progressBarListener.1
            public final /* synthetic */ float $markerValue;

            public C39591(float markerValue2) {
                f = markerValue2;
            }

            @Override // com.blackhub.bronline.game.gui.electric.view.ProgressBarWithListener.OnProgressChangeListener
            public void onProgressChanged(int progress) {
                float f = progress / 100;
                if (progress >= 100) {
                    RaiseChargeFragment.this.stopUi();
                    RaiseChargeFragment.this.getViewModel().setWin(false);
                    return;
                }
                if (f + 0.05f > f || f > 99.0f) {
                    RaiseChargeFragment.this.stopPulseButton();
                    return;
                }
                RaiseChargeFragment.this.startPulseButton();
                RaiseChargeFragment.this.clearHandAnimation();
                if (RaiseChargeFragment.this.getViewModel().getUiState().getValue().getCountHint() != 3) {
                    RaiseChargeFragment.this.getViewModel().setTwoHint();
                }
                if (RaiseChargeFragment.this.getViewModel().getUiState().getValue().isHintShow()) {
                    ObjectAnimator objectAnimator = RaiseChargeFragment.this.animatorPB;
                    if (objectAnimator != null) {
                        objectAnimator.pause();
                    }
                } else {
                    ObjectAnimator objectAnimator2 = RaiseChargeFragment.this.animatorPB;
                    if (objectAnimator2 != null) {
                        objectAnimator2.resume();
                    }
                }
                if (RaiseChargeFragment.this.getViewModel().getUiState().getValue().isHandViewShow()) {
                    RaiseChargeFragment.this.createHandAnimation();
                }
            }
        };
    }

    public final void getResultChecked(ProgressBarWithListener progressBar, float markerValue) {
        float f = 100;
        float progress = progressBar.getProgress() / f;
        float max = (progressBar.getMax() - 1) / f;
        if (markerValue <= progress && progress <= max) {
            if (getViewModel().getUiState().getValue().getCount() < 4) {
                getViewModel().raiseCount();
                return;
            } else {
                getViewModel().setWin(true);
                return;
            }
        }
        getViewModel().setWin(false);
    }

    public final void changeProgressBar(int i) {
        ProgressBarWithListener progressBarWithListener;
        FragmentRaiseChargeBinding binding = getBinding();
        if (i == 1) {
            progressBarWithListener = binding.pbRaiseChargeOne;
        } else if (i == 2) {
            progressBarWithListener = binding.pbRaiseChargeTwo;
        } else if (i == 3) {
            progressBarWithListener = binding.pbRaiseChargeThree;
        } else {
            progressBarWithListener = binding.pbRaiseChargeFour;
        }
        Intrinsics.checkNotNull(progressBarWithListener);
        setProgressBarAnimator(progressBarWithListener);
    }

    public final void setProgressBarAnimator(ProgressBar progressBar) {
        clearAnimator();
        ObjectAnimator objectAnimatorAnimateProgressBarUp = UtilsKt.animateProgressBarUp(progressBar, 250L);
        this.animatorPB = objectAnimatorAnimateProgressBarUp;
        if (objectAnimatorAnimateProgressBarUp != null) {
            objectAnimatorAnimateProgressBarUp.addListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment.setProgressBarAnimator.1
                public final /* synthetic */ ProgressBar $progressBar;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animation");
                }

                public C39601(ProgressBar progressBar2) {
                    progressBar = progressBar2;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animation");
                    RaiseChargeFragment.this.setAnimatorDown(progressBar);
                }
            });
        }
        ObjectAnimator objectAnimator = this.animatorPB;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    /* compiled from: RaiseChargeFragment.kt */
    @Metadata(m7104d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, m7105d2 = {"com/blackhub/bronline/game/gui/electric/ui/RaiseChargeFragment$setProgressBarAnimator$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME, "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$setProgressBarAnimator$1 */
    public static final class C39601 implements Animator.AnimatorListener {
        public final /* synthetic */ ProgressBar $progressBar;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        public C39601(ProgressBar progressBar2) {
            progressBar = progressBar2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            RaiseChargeFragment.this.setAnimatorDown(progressBar);
        }
    }

    public final void setAnimatorDown(ProgressBar progressBar) {
        clearAnimator();
        ObjectAnimator objectAnimatorAnimateProgressBarDown = UtilsKt.animateProgressBarDown(progressBar, 250L);
        this.animatorPB = objectAnimatorAnimateProgressBarDown;
        if (objectAnimatorAnimateProgressBarDown != null) {
            objectAnimatorAnimateProgressBarDown.start();
        }
    }

    public final void clearAnimator() {
        ObjectAnimator objectAnimator = this.animatorPB;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        this.animatorPB = null;
    }

    public final void clearHandAnimation() {
        RotateAnimation rotateAnimation = this.handRotateAnimation;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.handRotateAnimation = null;
    }

    private final void createGameInstructionsDialog(List<GameInstructionsItem> hintsList) {
        dismissGameInstructionsDialog();
        GameInstructionsDialog.Companion companion = GameInstructionsDialog.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        GameInstructionsDialog gameInstructionsDialogCreate = companion.create(contextRequireContext, hintsList, new C39581(getViewModel()));
        gameInstructionsDialogCreate.show();
        this.gameInstructionsDialog = gameInstructionsDialogCreate;
    }

    /* compiled from: RaiseChargeFragment.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment$createGameInstructionsDialog$1 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C39581 extends FunctionReferenceImpl implements Function0<Unit> {
        public C39581(Object obj) {
            super(0, obj, RaiseChargeViewModel.class, "closeInstruction", "closeInstruction()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            ((RaiseChargeViewModel) this.receiver).closeInstruction();
        }
    }

    public final void clearProgress() {
        FragmentRaiseChargeBinding binding = getBinding();
        binding.pbRaiseChargeOne.setOnProgressChangeListener(null);
        binding.pbRaiseChargeTwo.setOnProgressChangeListener(null);
        binding.pbRaiseChargeThree.setOnProgressChangeListener(null);
        binding.pbRaiseChargeFour.setOnProgressChangeListener(null);
        binding.pbRaiseChargeOne.setProgress(0);
        binding.pbRaiseChargeTwo.setProgress(0);
        binding.pbRaiseChargeThree.setProgress(0);
        binding.pbRaiseChargeFour.setProgress(0);
    }

    private final void dismissGameInstructionsDialog() {
        GameInstructionsDialog gameInstructionsDialog = this.gameInstructionsDialog;
        if (gameInstructionsDialog != null) {
            gameInstructionsDialog.dismiss();
        }
        this.gameInstructionsDialog = null;
    }
}
