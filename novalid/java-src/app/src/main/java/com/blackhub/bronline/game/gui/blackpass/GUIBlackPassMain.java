package com.blackhub.bronline.game.gui.blackpass;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.databinding.BlackPassMainNewBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.composemanager.ComposableProvider;
import com.blackhub.bronline.game.common.composemanager.ComposeViewManager;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.gui.blackpass.p010ui.BlackPassCustomDialog;
import com.blackhub.bronline.game.gui.blackpass.p010ui.BlackPassTaskInfoDialog;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.p019ui.blackpass.BlackPassMainUIKt;
import com.bless.client.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: GUIBlackPassMain.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/BlackPassMainNewBinding;", "()V", "blackPassMainViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "getBlackPassMainViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "blackPassMainViewModel$delegate", "Lkotlin/Lazy;", "blackPassPrizeListViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "getBlackPassPrizeListViewModel", "()Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassPrizeListViewModel;", "blackPassPrizeListViewModel$delegate", "customDialog", "Lcom/blackhub/bronline/game/gui/blackpass/ui/BlackPassCustomDialog;", "depositCoinsViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "getDepositCoinsViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateDepositCoinsViewModel;", "depositCoinsViewModel$delegate", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "getDonateMainViewModel", "()Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "donateMainViewModel$delegate", "taskDialog", "Lcom/blackhub/bronline/game/gui/blackpass/ui/BlackPassTaskInfoDialog;", "clearViewModel", "", "getViewBinding", "initCustomDialog", "initCustomDialogClickListener", "initObjects", "initTasksDialog", "initViews", "onDestroyView", "requestInitData", "setNullableParameters", "setObservers", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGUIBlackPassMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIBlackPassMain.kt\ncom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,376:1\n106#2,15:377\n106#2,15:392\n106#2,15:407\n106#2,15:422\n*S KotlinDebug\n*F\n+ 1 GUIBlackPassMain.kt\ncom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain\n*L\n49#1:377,15\n50#1:392,15\n51#1:407,15\n52#1:422,15\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIBlackPassMain extends BaseFragment<BlackPassMainNewBinding> {
    public static final int $stable = 8;

    /* renamed from: blackPassMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassMainViewModel;

    /* renamed from: blackPassPrizeListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackPassPrizeListViewModel;

    @Nullable
    public BlackPassCustomDialog customDialog;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;

    /* renamed from: donateMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy donateMainViewModel;

    @Nullable
    public BlackPassTaskInfoDialog taskDialog;

    public GUIBlackPassMain() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$blackPassMainViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$1
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
        this.blackPassMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$donateMainViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$5
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
        this.donateMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$depositCoinsViewModel$2
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$9
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
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        final Function0<ViewModelStoreOwner> function05 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$blackPassPrizeListViewModel$2
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
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.blackPassPrizeListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlackPassPrizeListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$14
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function02;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$special$$inlined$viewModels$default$16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
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

    public final BlackPassMainViewModel getBlackPassMainViewModel() {
        return (BlackPassMainViewModel) this.blackPassMainViewModel.getValue();
    }

    public final DonateMainViewModel getDonateMainViewModel() {
        return (DonateMainViewModel) this.donateMainViewModel.getValue();
    }

    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    public final BlackPassPrizeListViewModel getBlackPassPrizeListViewModel() {
        return (BlackPassPrizeListViewModel) this.blackPassPrizeListViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public BlackPassMainNewBinding getViewBinding() {
        BlackPassMainNewBinding blackPassMainNewBindingInflate = BlackPassMainNewBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(blackPassMainNewBindingInflate, "inflate(...)");
        return blackPassMainNewBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() throws JSONException {
        clearViewModel();
        requestInitData();
        initObjects();
        setObservers();
    }

    private final void initObjects() {
        ComposeViewManager composeViewManager = ComposeViewManager.INSTANCE;
        ComposeView composeViewBlackPassMainFullScreen = getBinding().composeViewBlackPassMainFullScreen;
        Intrinsics.checkNotNullExpressionValue(composeViewBlackPassMainFullScreen, "composeViewBlackPassMainFullScreen");
        composeViewManager.setComposableContentForKotlin(composeViewBlackPassMainFullScreen, ComposableLambdaKt.composableLambdaInstance(464738629, true, new Function3<ComposableProvider, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1
            public C37141() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                invoke(composableProvider, composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
            public final void invoke(@NotNull ComposableProvider composableProvider, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composableProvider, "$this$null");
                if ((i & 81) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(464738629, i, -1, "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.<anonymous> (GUIBlackPassMain.kt:70)");
                    }
                    BlackPassMainUIState blackPassMainUIState = (BlackPassMainUIState) FlowExtKt.collectAsStateWithLifecycle(GUIBlackPassMain.this.getBlackPassMainViewModel().getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7).getValue();
                    long jColor = ColorKt.Color(blackPassMainUIState.getSeasonColor());
                    String string = GUIBlackPassMain.this.getString(R.string.common_timer_title_1);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = GUIBlackPassMain.this.getString(R.string.common_timer_title_2, Integer.valueOf(blackPassMainUIState.getTimerDaysAndHours().getDays()), Integer.valueOf(blackPassMainUIState.getTimerDaysAndHours().getHours()));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    BlackPassMainUIKt.m14888BlackPassMainUIpoRtVFs(string, string2, blackPassMainUIState.getBpLevel(), blackPassMainUIState.getValueOfExperience(), blackPassMainUIState.getMaxLevelExp(), blackPassMainUIState.getSeasonBitmapImage(), blackPassMainUIState.getSeasonBitmapImageForRewards(), jColor, blackPassMainUIState.getSeasonName(), blackPassMainUIState.getBpBtnColor(), blackPassMainUIState.getBpBtnBg(), blackPassMainUIState.getTasksBtnColor(), blackPassMainUIState.getTasksBtnBg(), blackPassMainUIState.getRatingBtnColor(), blackPassMainUIState.getRatingBtnBg(), blackPassMainUIState.getSelectedLayout(), blackPassMainUIState.getDailyCategoryImageBitmap(), blackPassMainUIState.getPremiumBitmapImage(), blackPassMainUIState.getVipState(), blackPassMainUIState.isActiveVip(), blackPassMainUIState.getRewardsList(), blackPassMainUIState.getSpecialTasksList(), blackPassMainUIState.getDailyTasksList(), blackPassMainUIState.getWeeklyTimerForEndCategory(), blackPassMainUIState.getSelectedCategoryTask(), blackPassMainUIState.getSpecialCategoryImageBitmap(), blackPassMainUIState.getDailyCategoryImageBitmap(), blackPassMainUIState.getMyPlaceInRating(), blackPassMainUIState.getRatingList(), blackPassMainUIState.getRatingBgImage(), blackPassMainUIState.getBpExpBitmap(), blackPassMainUIState.getImgOfferSplit(), blackPassMainUIState.getActivatePremiumSubtitle(), blackPassMainUIState.getActivatePremiumDeluxeSubtitle(), blackPassMainUIState.getNameDeluxeCar(), blackPassMainUIState.getImgDeluxeCar(), blackPassMainUIState.getPremiumPrice(), blackPassMainUIState.getPremiumDeluxePrice(), blackPassMainUIState.getIsButtonBuyPremiumEnabled(), blackPassMainUIState.getBannerTitlePrize1(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.1
                        public AnonymousClass1() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumClick();
                            gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumPriceInt());
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.2
                        public AnonymousClass2() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumDeluxeClick();
                            gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumDeluxePriceInt());
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.3
                        public AnonymousClass3() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            gUIBlackPassMain.getBlackPassPrizeListViewModel().isNeedShowDialog();
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.4
                        public AnonymousClass4() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() throws JSONException {
                            gUIBlackPassMain.getBlackPassMainViewModel().onRefreshRatingClick();
                        }
                    }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.5
                        public AnonymousClass5() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i2) throws JSONException {
                            gUIBlackPassMain.getBlackPassMainViewModel().onClickSelectLayout(i2);
                            gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(i2);
                        }
                    }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.6

                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6$WhenMappings */
                        /* loaded from: classes.dex */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonRewardState.values().length];
                                try {
                                    iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        public AnonymousClass6() {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                            invoke2(commonRewardModel, bitmap);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull CommonRewardModel topRewardModel, @Nullable Bitmap bitmap) {
                            int i2;
                            int i3;
                            Intrinsics.checkNotNullParameter(topRewardModel, "topRewardModel");
                            DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                            String rewardDescription = topRewardModel.getRewardDescription();
                            int rewardId = topRewardModel.getRewardId();
                            int i4 = WhenMappings.$EnumSwitchMapping$0[topRewardModel.getMainRewardState().ordinal()];
                            if (i4 == 1) {
                                i2 = 0;
                            } else {
                                if (i4 != 2) {
                                    i3 = 1;
                                    donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                                }
                                i2 = 3;
                            }
                            i3 = i2;
                            donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                        }
                    }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.7

                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7$WhenMappings */
                        /* loaded from: classes.dex */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonRewardState.values().length];
                                try {
                                    iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        public AnonymousClass7() {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                            invoke2(commonRewardModel, bitmap);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull CommonRewardModel bottomRewardModel, @Nullable Bitmap bitmap) {
                            int i2;
                            int i3;
                            Intrinsics.checkNotNullParameter(bottomRewardModel, "bottomRewardModel");
                            DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                            String rewardDescription = bottomRewardModel.getRewardDescription();
                            int rewardId = bottomRewardModel.getRewardId();
                            int i4 = WhenMappings.$EnumSwitchMapping$0[bottomRewardModel.getMainRewardState().ordinal()];
                            if (i4 == 1) {
                                i2 = 0;
                            } else {
                                if (i4 != 2) {
                                    i3 = 1;
                                    donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                                }
                                i2 = 3;
                            }
                            i3 = i2;
                            donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                        }
                    }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.8
                        public AnonymousClass8() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            gUIBlackPassMain.getDonateMainViewModel().setShowLastChanceBPBoostView(true);
                        }
                    }, new Function1<Byte, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.9
                        public AnonymousClass9() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                            invoke(b.byteValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(byte b) {
                            gUIBlackPassMain.getBlackPassMainViewModel().onCategoryTaskClick(b);
                        }
                    }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.10
                        public final /* synthetic */ BlackPassMainUIState $state;

                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10$WhenMappings */
                        /* loaded from: classes.dex */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonTaskState.values().length];
                                try {
                                    iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[CommonTaskState.GET_STATE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass10(BlackPassMainUIState blackPassMainUIState2) {
                            super(1);
                            blackPassMainUIState = blackPassMainUIState2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                            invoke2(commonTaskModel);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                            Intrinsics.checkNotNullParameter(task, "task");
                            int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                            if (i2 == 1) {
                                DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                                gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                                return;
                            }
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(task);
                                    return;
                                }
                                DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                                int id = task.getId();
                                String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                                Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                                CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                                Intrinsics.checkNotNull(string3);
                                donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                            }
                        }
                    }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.11
                        public final /* synthetic */ BlackPassMainUIState $state;

                        /* compiled from: GUIBlackPassMain.kt */
                        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11$WhenMappings */
                        /* loaded from: classes.dex */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[CommonTaskState.values().length];
                                try {
                                    iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[CommonTaskState.GET_STATE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass11(BlackPassMainUIState blackPassMainUIState2) {
                            super(1);
                            blackPassMainUIState = blackPassMainUIState2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                            invoke2(commonTaskModel);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                            Intrinsics.checkNotNullParameter(task, "task");
                            int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                            if (i2 == 1) {
                                DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                                gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                                return;
                            }
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    gUIBlackPassMain.getBlackPassMainViewModel().onShowTaskDialog(task);
                                    return;
                                }
                                return;
                            }
                            DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                            int id = task.getId();
                            String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                            Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                            Intrinsics.checkNotNull(string3);
                            donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                        }
                    }, composer, 2359296, 18874368, 1210319432, 262216, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumClick();
                    gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumPriceInt());
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10 */
            public static final class AnonymousClass10 extends Lambda implements Function1<CommonTaskModel, Unit> {
                public final /* synthetic */ BlackPassMainUIState $state;

                /* compiled from: GUIBlackPassMain.kt */
                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10$WhenMappings */
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CommonTaskState.values().length];
                        try {
                            iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CommonTaskState.GET_STATE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass10(BlackPassMainUIState blackPassMainUIState2) {
                    super(1);
                    blackPassMainUIState = blackPassMainUIState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                    invoke2(commonTaskModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                    Intrinsics.checkNotNullParameter(task, "task");
                    int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                    if (i2 == 1) {
                        DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                        gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                        return;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(task);
                            return;
                        }
                        DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                        int id = task.getId();
                        String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                        Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                        CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                        Intrinsics.checkNotNull(string3);
                        donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                    }
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11 */
            public static final class AnonymousClass11 extends Lambda implements Function1<CommonTaskModel, Unit> {
                public final /* synthetic */ BlackPassMainUIState $state;

                /* compiled from: GUIBlackPassMain.kt */
                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11$WhenMappings */
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CommonTaskState.values().length];
                        try {
                            iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CommonTaskState.GET_STATE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass11(BlackPassMainUIState blackPassMainUIState2) {
                    super(1);
                    blackPassMainUIState = blackPassMainUIState2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                    invoke2(commonTaskModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                    Intrinsics.checkNotNullParameter(task, "task");
                    int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                    if (i2 == 1) {
                        DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                        gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                        return;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            gUIBlackPassMain.getBlackPassMainViewModel().onShowTaskDialog(task);
                            return;
                        }
                        return;
                    }
                    DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                    int id = task.getId();
                    String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                    Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                    CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                    Intrinsics.checkNotNull(string3);
                    donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$2 */
            public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                public AnonymousClass2() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumDeluxeClick();
                    gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumDeluxePriceInt());
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$3 */
            public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
                public AnonymousClass3() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    gUIBlackPassMain.getBlackPassPrizeListViewModel().isNeedShowDialog();
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$4 */
            public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
                public AnonymousClass4() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    gUIBlackPassMain.getBlackPassMainViewModel().onRefreshRatingClick();
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "buttonPosition", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$5 */
            public static final class AnonymousClass5 extends Lambda implements Function1<Integer, Unit> {
                public AnonymousClass5() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) throws JSONException {
                    gUIBlackPassMain.getBlackPassMainViewModel().onClickSelectLayout(i2);
                    gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(i2);
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "topRewardModel", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6 */
            public static final class AnonymousClass6 extends Lambda implements Function2<CommonRewardModel, Bitmap, Unit> {

                /* compiled from: GUIBlackPassMain.kt */
                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6$WhenMappings */
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CommonRewardState.values().length];
                        try {
                            iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public AnonymousClass6() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                    invoke2(commonRewardModel, bitmap);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull CommonRewardModel topRewardModel, @Nullable Bitmap bitmap) {
                    int i2;
                    int i3;
                    Intrinsics.checkNotNullParameter(topRewardModel, "topRewardModel");
                    DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                    String rewardDescription = topRewardModel.getRewardDescription();
                    int rewardId = topRewardModel.getRewardId();
                    int i4 = WhenMappings.$EnumSwitchMapping$0[topRewardModel.getMainRewardState().ordinal()];
                    if (i4 == 1) {
                        i2 = 0;
                    } else {
                        if (i4 != 2) {
                            i3 = 1;
                            donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                        }
                        i2 = 3;
                    }
                    i3 = i2;
                    donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "bottomRewardModel", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7 */
            public static final class AnonymousClass7 extends Lambda implements Function2<CommonRewardModel, Bitmap, Unit> {

                /* compiled from: GUIBlackPassMain.kt */
                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7$WhenMappings */
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CommonRewardState.values().length];
                        try {
                            iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public AnonymousClass7() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                    invoke2(commonRewardModel, bitmap);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull CommonRewardModel bottomRewardModel, @Nullable Bitmap bitmap) {
                    int i2;
                    int i3;
                    Intrinsics.checkNotNullParameter(bottomRewardModel, "bottomRewardModel");
                    DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                    String rewardDescription = bottomRewardModel.getRewardDescription();
                    int rewardId = bottomRewardModel.getRewardId();
                    int i4 = WhenMappings.$EnumSwitchMapping$0[bottomRewardModel.getMainRewardState().ordinal()];
                    if (i4 == 1) {
                        i2 = 0;
                    } else {
                        if (i4 != 2) {
                            i3 = 1;
                            donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                        }
                        i2 = 3;
                    }
                    i3 = i2;
                    donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$8 */
            public static final class AnonymousClass8 extends Lambda implements Function0<Unit> {
                public AnonymousClass8() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    gUIBlackPassMain.getDonateMainViewModel().setShowLastChanceBPBoostView(true);
                }
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "categoryId", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$9 */
            public static final class AnonymousClass9 extends Lambda implements Function1<Byte, Unit> {
                public AnonymousClass9() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                    invoke(b.byteValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(byte b) {
                    gUIBlackPassMain.getBlackPassMainViewModel().onCategoryTaskClick(b);
                }
            }
        }));
        initCustomDialog();
        initTasksDialog();
    }

    /* compiled from: GUIBlackPassMain.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;", "invoke", "(Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1 */
    /* loaded from: classes3.dex */
    public static final class C37141 extends Lambda implements Function3<ComposableProvider, Composer, Integer, Unit> {
        public C37141() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
            invoke(composableProvider, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
        public final void invoke(@NotNull ComposableProvider composableProvider, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composableProvider, "$this$null");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(464738629, i, -1, "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.<anonymous> (GUIBlackPassMain.kt:70)");
                }
                BlackPassMainUIState blackPassMainUIState2 = (BlackPassMainUIState) FlowExtKt.collectAsStateWithLifecycle(GUIBlackPassMain.this.getBlackPassMainViewModel().getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7).getValue();
                long jColor = ColorKt.Color(blackPassMainUIState2.getSeasonColor());
                String string = GUIBlackPassMain.this.getString(R.string.common_timer_title_1);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = GUIBlackPassMain.this.getString(R.string.common_timer_title_2, Integer.valueOf(blackPassMainUIState2.getTimerDaysAndHours().getDays()), Integer.valueOf(blackPassMainUIState2.getTimerDaysAndHours().getHours()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                BlackPassMainUIKt.m14888BlackPassMainUIpoRtVFs(string, string2, blackPassMainUIState2.getBpLevel(), blackPassMainUIState2.getValueOfExperience(), blackPassMainUIState2.getMaxLevelExp(), blackPassMainUIState2.getSeasonBitmapImage(), blackPassMainUIState2.getSeasonBitmapImageForRewards(), jColor, blackPassMainUIState2.getSeasonName(), blackPassMainUIState2.getBpBtnColor(), blackPassMainUIState2.getBpBtnBg(), blackPassMainUIState2.getTasksBtnColor(), blackPassMainUIState2.getTasksBtnBg(), blackPassMainUIState2.getRatingBtnColor(), blackPassMainUIState2.getRatingBtnBg(), blackPassMainUIState2.getSelectedLayout(), blackPassMainUIState2.getDailyCategoryImageBitmap(), blackPassMainUIState2.getPremiumBitmapImage(), blackPassMainUIState2.getVipState(), blackPassMainUIState2.isActiveVip(), blackPassMainUIState2.getRewardsList(), blackPassMainUIState2.getSpecialTasksList(), blackPassMainUIState2.getDailyTasksList(), blackPassMainUIState2.getWeeklyTimerForEndCategory(), blackPassMainUIState2.getSelectedCategoryTask(), blackPassMainUIState2.getSpecialCategoryImageBitmap(), blackPassMainUIState2.getDailyCategoryImageBitmap(), blackPassMainUIState2.getMyPlaceInRating(), blackPassMainUIState2.getRatingList(), blackPassMainUIState2.getRatingBgImage(), blackPassMainUIState2.getBpExpBitmap(), blackPassMainUIState2.getImgOfferSplit(), blackPassMainUIState2.getActivatePremiumSubtitle(), blackPassMainUIState2.getActivatePremiumDeluxeSubtitle(), blackPassMainUIState2.getNameDeluxeCar(), blackPassMainUIState2.getImgDeluxeCar(), blackPassMainUIState2.getPremiumPrice(), blackPassMainUIState2.getPremiumDeluxePrice(), blackPassMainUIState2.getIsButtonBuyPremiumEnabled(), blackPassMainUIState2.getBannerTitlePrize1(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.1
                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumClick();
                        gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumPriceInt());
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.2
                    public AnonymousClass2() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumDeluxeClick();
                        gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumDeluxePriceInt());
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.3
                    public AnonymousClass3() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        gUIBlackPassMain.getBlackPassPrizeListViewModel().isNeedShowDialog();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.4
                    public AnonymousClass4() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() throws JSONException {
                        gUIBlackPassMain.getBlackPassMainViewModel().onRefreshRatingClick();
                    }
                }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.5
                    public AnonymousClass5() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i2) throws JSONException {
                        gUIBlackPassMain.getBlackPassMainViewModel().onClickSelectLayout(i2);
                        gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(i2);
                    }
                }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.6

                    /* compiled from: GUIBlackPassMain.kt */
                    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6$WhenMappings */
                    /* loaded from: classes.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[CommonRewardState.values().length];
                            try {
                                iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public AnonymousClass6() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                        invoke2(commonRewardModel, bitmap);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull CommonRewardModel topRewardModel, @Nullable Bitmap bitmap) {
                        int i2;
                        int i3;
                        Intrinsics.checkNotNullParameter(topRewardModel, "topRewardModel");
                        DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                        String rewardDescription = topRewardModel.getRewardDescription();
                        int rewardId = topRewardModel.getRewardId();
                        int i4 = WhenMappings.$EnumSwitchMapping$0[topRewardModel.getMainRewardState().ordinal()];
                        if (i4 == 1) {
                            i2 = 0;
                        } else {
                            if (i4 != 2) {
                                i3 = 1;
                                donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                            }
                            i2 = 3;
                        }
                        i3 = i2;
                        donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                    }
                }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.7

                    /* compiled from: GUIBlackPassMain.kt */
                    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7$WhenMappings */
                    /* loaded from: classes.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[CommonRewardState.values().length];
                            try {
                                iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public AnonymousClass7() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                        invoke2(commonRewardModel, bitmap);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull CommonRewardModel bottomRewardModel, @Nullable Bitmap bitmap) {
                        int i2;
                        int i3;
                        Intrinsics.checkNotNullParameter(bottomRewardModel, "bottomRewardModel");
                        DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                        String rewardDescription = bottomRewardModel.getRewardDescription();
                        int rewardId = bottomRewardModel.getRewardId();
                        int i4 = WhenMappings.$EnumSwitchMapping$0[bottomRewardModel.getMainRewardState().ordinal()];
                        if (i4 == 1) {
                            i2 = 0;
                        } else {
                            if (i4 != 2) {
                                i3 = 1;
                                donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                            }
                            i2 = 3;
                        }
                        i3 = i2;
                        donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.8
                    public AnonymousClass8() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        gUIBlackPassMain.getDonateMainViewModel().setShowLastChanceBPBoostView(true);
                    }
                }, new Function1<Byte, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.9
                    public AnonymousClass9() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                        invoke(b.byteValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(byte b) {
                        gUIBlackPassMain.getBlackPassMainViewModel().onCategoryTaskClick(b);
                    }
                }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.10
                    public final /* synthetic */ BlackPassMainUIState $state;

                    /* compiled from: GUIBlackPassMain.kt */
                    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10$WhenMappings */
                    /* loaded from: classes.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[CommonTaskState.values().length];
                            try {
                                iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[CommonTaskState.GET_STATE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass10(BlackPassMainUIState blackPassMainUIState22) {
                        super(1);
                        blackPassMainUIState = blackPassMainUIState22;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                        invoke2(commonTaskModel);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                        Intrinsics.checkNotNullParameter(task, "task");
                        int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                        if (i2 == 1) {
                            DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                            gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                            return;
                        }
                        if (i2 != 2) {
                            if (i2 != 3) {
                                gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(task);
                                return;
                            }
                            DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                            int id = task.getId();
                            String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                            Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                            Intrinsics.checkNotNull(string3);
                            donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                        }
                    }
                }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initObjects.1.11
                    public final /* synthetic */ BlackPassMainUIState $state;

                    /* compiled from: GUIBlackPassMain.kt */
                    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11$WhenMappings */
                    /* loaded from: classes.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[CommonTaskState.values().length];
                            try {
                                iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CommonTaskState.GET_STATE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass11(BlackPassMainUIState blackPassMainUIState22) {
                        super(1);
                        blackPassMainUIState = blackPassMainUIState22;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                        invoke2(commonTaskModel);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                        Intrinsics.checkNotNullParameter(task, "task");
                        int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                        if (i2 == 1) {
                            DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                            gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                            return;
                        }
                        if (i2 != 2) {
                            if (i2 != 3) {
                                gUIBlackPassMain.getBlackPassMainViewModel().onShowTaskDialog(task);
                                return;
                            }
                            return;
                        }
                        DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                        int id = task.getId();
                        String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                        Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                        CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                        Intrinsics.checkNotNull(string3);
                        donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                    }
                }, composer, 2359296, 18874368, 1210319432, 262216, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumClick();
                gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumPriceInt());
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10 */
        public static final class AnonymousClass10 extends Lambda implements Function1<CommonTaskModel, Unit> {
            public final /* synthetic */ BlackPassMainUIState $state;

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$10$WhenMappings */
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonTaskState.values().length];
                    try {
                        iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommonTaskState.GET_STATE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(BlackPassMainUIState blackPassMainUIState22) {
                super(1);
                blackPassMainUIState = blackPassMainUIState22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                invoke2(commonTaskModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                Intrinsics.checkNotNullParameter(task, "task");
                int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                if (i2 == 1) {
                    DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                    gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                    return;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(task);
                        return;
                    }
                    DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                    int id = task.getId();
                    String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                    Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                    CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                    Intrinsics.checkNotNull(string3);
                    donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
                }
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11 */
        public static final class AnonymousClass11 extends Lambda implements Function1<CommonTaskModel, Unit> {
            public final /* synthetic */ BlackPassMainUIState $state;

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$11$WhenMappings */
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonTaskState.values().length];
                    try {
                        iArr[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonTaskState.GET_STATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommonTaskState.COMPLETED_STATE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(BlackPassMainUIState blackPassMainUIState22) {
                super(1);
                blackPassMainUIState = blackPassMainUIState22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) throws JSONException {
                invoke2(commonTaskModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull CommonTaskModel task) throws JSONException {
                Intrinsics.checkNotNullParameter(task, "task");
                int i2 = WhenMappings.$EnumSwitchMapping$0[task.getStateOfTask().ordinal()];
                if (i2 == 1) {
                    DonateMainViewModel.showNewFragment$default(gUIBlackPassMain.getDonateMainViewModel(), 102, false, false, 4, null);
                    gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(4);
                    return;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        gUIBlackPassMain.getBlackPassMainViewModel().onShowTaskDialog(task);
                        return;
                    }
                    return;
                }
                DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                int id = task.getId();
                String string3 = gUIBlackPassMain.getString(R.string.common_string_with_ruble, String.valueOf(blackPassMainUIState.getRubValue()));
                Bitmap imgRubBitmap = blackPassMainUIState.getImgRubBitmap();
                CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
                Intrinsics.checkNotNull(string3);
                donateMainViewModel.clickPreviewPrize(imgRubBitmap, string3, id, 0, 4, 1, (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : commonRarityEnum);
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$2 */
        public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
            public AnonymousClass2() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                gUIBlackPassMain.getBlackPassMainViewModel().onButtonBuyPremiumDeluxeClick();
                gUIBlackPassMain.getDepositCoinsViewModel().saveIntermediatePremiumPrice(gUIBlackPassMain.getBlackPassMainViewModel().getUiState().getValue().getPremiumDeluxePriceInt());
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$3 */
        public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
            public AnonymousClass3() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                gUIBlackPassMain.getBlackPassPrizeListViewModel().isNeedShowDialog();
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$4 */
        public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
            public AnonymousClass4() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                gUIBlackPassMain.getBlackPassMainViewModel().onRefreshRatingClick();
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "buttonPosition", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$5 */
        public static final class AnonymousClass5 extends Lambda implements Function1<Integer, Unit> {
            public AnonymousClass5() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2) throws JSONException {
                gUIBlackPassMain.getBlackPassMainViewModel().onClickSelectLayout(i2);
                gUIBlackPassMain.getBlackPassMainViewModel().sendShowCurrentLayout(i2);
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "topRewardModel", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6 */
        public static final class AnonymousClass6 extends Lambda implements Function2<CommonRewardModel, Bitmap, Unit> {

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$6$WhenMappings */
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonRewardState.values().length];
                    try {
                        iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass6() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                invoke2(commonRewardModel, bitmap);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull CommonRewardModel topRewardModel, @Nullable Bitmap bitmap) {
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(topRewardModel, "topRewardModel");
                DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                String rewardDescription = topRewardModel.getRewardDescription();
                int rewardId = topRewardModel.getRewardId();
                int i4 = WhenMappings.$EnumSwitchMapping$0[topRewardModel.getMainRewardState().ordinal()];
                if (i4 == 1) {
                    i2 = 0;
                } else {
                    if (i4 != 2) {
                        i3 = 1;
                        donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
                    }
                    i2 = 3;
                }
                i3 = i2;
                donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 1, i3, 0, topRewardModel.getTypeId(), topRewardModel.getRarityState());
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "bottomRewardModel", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7 */
        public static final class AnonymousClass7 extends Lambda implements Function2<CommonRewardModel, Bitmap, Unit> {

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$7$WhenMappings */
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonRewardState.values().length];
                    try {
                        iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass7() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                invoke2(commonRewardModel, bitmap);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull CommonRewardModel bottomRewardModel, @Nullable Bitmap bitmap) {
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(bottomRewardModel, "bottomRewardModel");
                DonateMainViewModel donateMainViewModel = gUIBlackPassMain.getDonateMainViewModel();
                String rewardDescription = bottomRewardModel.getRewardDescription();
                int rewardId = bottomRewardModel.getRewardId();
                int i4 = WhenMappings.$EnumSwitchMapping$0[bottomRewardModel.getMainRewardState().ordinal()];
                if (i4 == 1) {
                    i2 = 0;
                } else {
                    if (i4 != 2) {
                        i3 = 1;
                        donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
                    }
                    i2 = 3;
                }
                i3 = i2;
                donateMainViewModel.clickPreviewPrize(bitmap, rewardDescription, rewardId, 0, i3, 0, bottomRewardModel.getTypeId(), bottomRewardModel.getRarityState());
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$8 */
        public static final class AnonymousClass8 extends Lambda implements Function0<Unit> {
            public AnonymousClass8() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                gUIBlackPassMain.getDonateMainViewModel().setShowLastChanceBPBoostView(true);
            }
        }

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "categoryId", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initObjects$1$9 */
        public static final class AnonymousClass9 extends Lambda implements Function1<Byte, Unit> {
            public AnonymousClass9() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                invoke(b.byteValue());
                return Unit.INSTANCE;
            }

            public final void invoke(byte b) {
                gUIBlackPassMain.getBlackPassMainViewModel().onCategoryTaskClick(b);
            }
        }
    }

    public final void initTasksDialog() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        BlackPassTaskInfoDialog blackPassTaskInfoDialog = new BlackPassTaskInfoDialog(fragmentActivityRequireActivity);
        this.taskDialog = blackPassTaskInfoDialog;
        blackPassTaskInfoDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GUIBlackPassMain.initTasksDialog$lambda$0(this.f$0, dialogInterface);
            }
        });
    }

    public static final void initTasksDialog$lambda$0(GUIBlackPassMain this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBlackPassMainViewModel().onShowTaskDialog(null);
    }

    public final void initCustomDialog() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.customDialog = new BlackPassCustomDialog(fragmentActivityRequireActivity);
        initCustomDialogClickListener();
    }

    /* compiled from: GUIBlackPassMain.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", "currentAction", "", "levelsToBuy", "taskId", "invoke", "(ILjava/lang/Integer;Ljava/lang/Integer;)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$initCustomDialogClickListener$1 */
    /* loaded from: classes3.dex */
    public static final class C37131 extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public C37131() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) throws JSONException {
            invoke(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, @Nullable Integer num, @Nullable Integer num2) throws JSONException {
            if (i == 0) {
                if (num != null) {
                    GUIBlackPassMain.this.getBlackPassMainViewModel().customDialogConfirmationLevelUp(num.intValue());
                    GUIBlackPassMain.this.getDonateMainViewModel().setShowLastChanceBPBoostView(false);
                    return;
                }
                return;
            }
            if (i == 1) {
                DonateMainViewModel.showNewFragment$default(GUIBlackPassMain.this.getDonateMainViewModel(), 9, false, false, 4, null);
                return;
            }
            if (i == 2) {
                GUIBlackPassMain.this.getBlackPassMainViewModel().onShowTaskDialog(null);
                GUIBlackPassMain.this.getBlackPassMainViewModel().sendExchangeTask(IntExtensionKt.getOrZero(num2));
            } else if (i == 3) {
                GUIBlackPassMain.this.getBlackPassMainViewModel().purchasePremium(1);
            } else {
                if (i != 4) {
                    return;
                }
                GUIBlackPassMain.this.getBlackPassMainViewModel().purchasePremium(0);
            }
        }
    }

    public final void initCustomDialogClickListener() {
        BlackPassCustomDialog blackPassCustomDialog = this.customDialog;
        if (blackPassCustomDialog == null) {
            return;
        }
        blackPassCustomDialog.setDialogClickListener(new Function3<Integer, Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.initCustomDialogClickListener.1
            public C37131() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) throws JSONException {
                invoke(num.intValue(), num2, num3);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, @Nullable Integer num, @Nullable Integer num2) throws JSONException {
                if (i == 0) {
                    if (num != null) {
                        GUIBlackPassMain.this.getBlackPassMainViewModel().customDialogConfirmationLevelUp(num.intValue());
                        GUIBlackPassMain.this.getDonateMainViewModel().setShowLastChanceBPBoostView(false);
                        return;
                    }
                    return;
                }
                if (i == 1) {
                    DonateMainViewModel.showNewFragment$default(GUIBlackPassMain.this.getDonateMainViewModel(), 9, false, false, 4, null);
                    return;
                }
                if (i == 2) {
                    GUIBlackPassMain.this.getBlackPassMainViewModel().onShowTaskDialog(null);
                    GUIBlackPassMain.this.getBlackPassMainViewModel().sendExchangeTask(IntExtensionKt.getOrZero(num2));
                } else if (i == 3) {
                    GUIBlackPassMain.this.getBlackPassMainViewModel().purchasePremium(1);
                } else {
                    if (i != 4) {
                        return;
                    }
                    GUIBlackPassMain.this.getBlackPassMainViewModel().purchasePremium(0);
                }
            }
        });
    }

    public final void requestInitData() throws JSONException {
        getBlackPassMainViewModel().requestInitData();
    }

    /* compiled from: GUIBlackPassMain.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$1", m7120f = "GUIBlackPassMain.kt", m7121i = {}, m7122l = {301}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$1 */
    public static final class C37151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37151(Continuation<? super C37151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIBlackPassMain.this.new C37151(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> startLayout = GUIBlackPassMain.this.getBlackPassMainViewModel().getStartLayout();
                Lifecycle lifecycle = GUIBlackPassMain.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(startLayout, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        gUIBlackPassMain.getBlackPassMainViewModel().onClickSelectLayout(i2);
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

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", TtmlNode.TAG_LAYOUT, "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$1$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                gUIBlackPassMain.getBlackPassMainViewModel().onClickSelectLayout(i2);
                return Unit.INSTANCE;
            }
        }
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37151(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37162(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37173(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C37184(null), 3, null);
    }

    /* compiled from: GUIBlackPassMain.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$2", m7120f = "GUIBlackPassMain.kt", m7121i = {}, m7122l = {312}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$2 */
    public static final class C37162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37162(Continuation<? super C37162> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIBlackPassMain.this.new C37162(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<ItemForDialogConfirmation> objForDialogConfirmation = GUIBlackPassMain.this.getBlackPassMainViewModel().getObjForDialogConfirmation();
                Lifecycle lifecycle = GUIBlackPassMain.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(objForDialogConfirmation, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ItemForDialogConfirmation) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable ItemForDialogConfirmation itemForDialogConfirmation, @NotNull Continuation<? super Unit> continuation) {
                        BlackPassCustomDialog blackPassCustomDialog;
                        if (itemForDialogConfirmation != null && (blackPassCustomDialog = gUIBlackPassMain.customDialog) != null) {
                            blackPassCustomDialog.showConfirmationPopupDialog(itemForDialogConfirmation);
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

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;", "emit", "(Lcom/blackhub/bronline/game/gui/donate/data/ItemForDialogConfirmation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nGUIBlackPassMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIBlackPassMain.kt\ncom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain$setObservers$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$2$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ItemForDialogConfirmation) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@Nullable ItemForDialogConfirmation itemForDialogConfirmation, @NotNull Continuation<? super Unit> continuation) {
                BlackPassCustomDialog blackPassCustomDialog;
                if (itemForDialogConfirmation != null && (blackPassCustomDialog = gUIBlackPassMain.customDialog) != null) {
                    blackPassCustomDialog.showConfirmationPopupDialog(itemForDialogConfirmation);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: GUIBlackPassMain.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$3", m7120f = "GUIBlackPassMain.kt", m7121i = {}, m7122l = {321}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$3 */
    public static final class C37173 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37173(Continuation<? super C37173> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIBlackPassMain.this.new C37173(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37173) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<ObjForResultDialog> objForDialogResult = GUIBlackPassMain.this.getBlackPassMainViewModel().getObjForDialogResult();
                Lifecycle lifecycle = GUIBlackPassMain.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(objForDialogResult, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ObjForResultDialog) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable ObjForResultDialog objForResultDialog, @NotNull Continuation<? super Unit> continuation) {
                        BlackPassCustomDialog blackPassCustomDialog;
                        if (objForResultDialog != null && (blackPassCustomDialog = gUIBlackPassMain.customDialog) != null) {
                            blackPassCustomDialog.showResultDialog(objForResultDialog);
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

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/gui/donate/data/ObjForResultDialog;", "emit", "(Lcom/blackhub/bronline/game/gui/donate/data/ObjForResultDialog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nGUIBlackPassMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIBlackPassMain.kt\ncom/blackhub/bronline/game/gui/blackpass/GUIBlackPassMain$setObservers$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$3$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ObjForResultDialog) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@Nullable ObjForResultDialog objForResultDialog, @NotNull Continuation<? super Unit> continuation) {
                BlackPassCustomDialog blackPassCustomDialog;
                if (objForResultDialog != null && (blackPassCustomDialog = gUIBlackPassMain.customDialog) != null) {
                    blackPassCustomDialog.showResultDialog(objForResultDialog);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: GUIBlackPassMain.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4", m7120f = "GUIBlackPassMain.kt", m7121i = {}, m7122l = {330}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4 */
    public static final class C37184 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37184(Continuation<? super C37184> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIBlackPassMain.this.new C37184(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37184) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CommonTaskModel> taskPreviewItem = GUIBlackPassMain.this.getBlackPassMainViewModel().getTaskPreviewItem();
                Lifecycle lifecycle = GUIBlackPassMain.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = androidx.lifecycle.FlowExtKt.flowWithLifecycle(taskPreviewItem, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1
                    public AnonymousClass1() {
                    }

                    /* compiled from: GUIBlackPassMain.kt */
                    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4$1$1 */
                    /* loaded from: classes3.dex */
                    public static final class C118771 extends Lambda implements Function1<CommonTaskModel, Unit> {
                        public C118771() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                            invoke2(commonTaskModel);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull CommonTaskModel task) {
                            Intrinsics.checkNotNullParameter(task, "task");
                            BlackPassMainViewModel blackPassMainViewModel = gUIBlackPassMain.getBlackPassMainViewModel();
                            Integer numValueOf = Integer.valueOf(task.getId());
                            String string = gUIBlackPassMain.getString(R.string.black_pass_task_change_title);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = gUIBlackPassMain.getString(R.string.common_bc);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = gUIBlackPassMain.getString(R.string.common_confirmation);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = gUIBlackPassMain.getString(R.string.common_yes);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            String string5 = gUIBlackPassMain.getString(R.string.common_no);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            BlackPassMainViewModel.showDialogConfirmation$default(blackPassMainViewModel, numValueOf, string, 10, null, string2, string3, string4, string5, 2, 8, null);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CommonTaskModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@Nullable CommonTaskModel commonTaskModel, @NotNull Continuation<? super Unit> continuation) {
                        BlackPassTaskInfoDialog blackPassTaskInfoDialog = gUIBlackPassMain.taskDialog;
                        if (blackPassTaskInfoDialog != null) {
                            blackPassTaskInfoDialog.setTaskInfoDialogClickListener(new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1.1
                                public C118771() {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel2) {
                                    invoke2(commonTaskModel2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke */
                                public final void invoke2(@NotNull CommonTaskModel task) {
                                    Intrinsics.checkNotNullParameter(task, "task");
                                    BlackPassMainViewModel blackPassMainViewModel = gUIBlackPassMain.getBlackPassMainViewModel();
                                    Integer numValueOf = Integer.valueOf(task.getId());
                                    String string = gUIBlackPassMain.getString(R.string.black_pass_task_change_title);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    String string2 = gUIBlackPassMain.getString(R.string.common_bc);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    String string3 = gUIBlackPassMain.getString(R.string.common_confirmation);
                                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                    String string4 = gUIBlackPassMain.getString(R.string.common_yes);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    String string5 = gUIBlackPassMain.getString(R.string.common_no);
                                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                    BlackPassMainViewModel.showDialogConfirmation$default(blackPassMainViewModel, numValueOf, string, 10, null, string2, string3, string4, string5, 2, 8, null);
                                }
                            });
                        }
                        if (commonTaskModel != null) {
                            BlackPassTaskInfoDialog blackPassTaskInfoDialog2 = gUIBlackPassMain.taskDialog;
                            if (blackPassTaskInfoDialog2 != null) {
                                blackPassTaskInfoDialog2.showTaskInfo(commonTaskModel, commonTaskModel.getStateOfTask() != CommonTaskState.TRACK_STATE, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1.2
                                    public final /* synthetic */ CommonTaskModel $taskPreviewItem;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(CommonTaskModel commonTaskModel2) {
                                        super(0);
                                        commonTaskModel = commonTaskModel2;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke */
                                    public final void invoke2() {
                                        BlackPassTaskInfoDialog blackPassTaskInfoDialog3 = gUIBlackPassMain.taskDialog;
                                        if (blackPassTaskInfoDialog3 != null) {
                                            blackPassTaskInfoDialog3.dismiss();
                                        }
                                        gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(commonTaskModel);
                                    }
                                });
                            }
                        } else {
                            BlackPassTaskInfoDialog blackPassTaskInfoDialog3 = gUIBlackPassMain.taskDialog;
                            if (blackPassTaskInfoDialog3 != null) {
                                blackPassTaskInfoDialog3.dismiss();
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: GUIBlackPassMain.kt */
                    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                    /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4$1$2 */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                        public final /* synthetic */ CommonTaskModel $taskPreviewItem;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(CommonTaskModel commonTaskModel2) {
                            super(0);
                            commonTaskModel = commonTaskModel2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            BlackPassTaskInfoDialog blackPassTaskInfoDialog3 = gUIBlackPassMain.taskDialog;
                            if (blackPassTaskInfoDialog3 != null) {
                                blackPassTaskInfoDialog3.dismiss();
                            }
                            gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(commonTaskModel);
                        }
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

        /* compiled from: GUIBlackPassMain.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "taskPreviewItem", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "emit", "(Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4$1$1 */
            /* loaded from: classes3.dex */
            public static final class C118771 extends Lambda implements Function1<CommonTaskModel, Unit> {
                public C118771() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel2) {
                    invoke2(commonTaskModel2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@NotNull CommonTaskModel task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    BlackPassMainViewModel blackPassMainViewModel = gUIBlackPassMain.getBlackPassMainViewModel();
                    Integer numValueOf = Integer.valueOf(task.getId());
                    String string = gUIBlackPassMain.getString(R.string.black_pass_task_change_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = gUIBlackPassMain.getString(R.string.common_bc);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = gUIBlackPassMain.getString(R.string.common_confirmation);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string4 = gUIBlackPassMain.getString(R.string.common_yes);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    String string5 = gUIBlackPassMain.getString(R.string.common_no);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    BlackPassMainViewModel.showDialogConfirmation$default(blackPassMainViewModel, numValueOf, string, 10, null, string2, string3, string4, string5, 2, 8, null);
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((CommonTaskModel) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@Nullable CommonTaskModel commonTaskModel2, @NotNull Continuation<? super Unit> continuation) {
                BlackPassTaskInfoDialog blackPassTaskInfoDialog = gUIBlackPassMain.taskDialog;
                if (blackPassTaskInfoDialog != null) {
                    blackPassTaskInfoDialog.setTaskInfoDialogClickListener(new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1.1
                        public C118771() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel22) {
                            invoke2(commonTaskModel22);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2(@NotNull CommonTaskModel task) {
                            Intrinsics.checkNotNullParameter(task, "task");
                            BlackPassMainViewModel blackPassMainViewModel = gUIBlackPassMain.getBlackPassMainViewModel();
                            Integer numValueOf = Integer.valueOf(task.getId());
                            String string = gUIBlackPassMain.getString(R.string.black_pass_task_change_title);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = gUIBlackPassMain.getString(R.string.common_bc);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = gUIBlackPassMain.getString(R.string.common_confirmation);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = gUIBlackPassMain.getString(R.string.common_yes);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            String string5 = gUIBlackPassMain.getString(R.string.common_no);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            BlackPassMainViewModel.showDialogConfirmation$default(blackPassMainViewModel, numValueOf, string, 10, null, string2, string3, string4, string5, 2, 8, null);
                        }
                    });
                }
                if (commonTaskModel2 != null) {
                    BlackPassTaskInfoDialog blackPassTaskInfoDialog2 = gUIBlackPassMain.taskDialog;
                    if (blackPassTaskInfoDialog2 != null) {
                        blackPassTaskInfoDialog2.showTaskInfo(commonTaskModel2, commonTaskModel2.getStateOfTask() != CommonTaskState.TRACK_STATE, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain.setObservers.4.1.2
                            public final /* synthetic */ CommonTaskModel $taskPreviewItem;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(CommonTaskModel commonTaskModel22) {
                                super(0);
                                commonTaskModel = commonTaskModel22;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2() {
                                BlackPassTaskInfoDialog blackPassTaskInfoDialog3 = gUIBlackPassMain.taskDialog;
                                if (blackPassTaskInfoDialog3 != null) {
                                    blackPassTaskInfoDialog3.dismiss();
                                }
                                gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(commonTaskModel);
                            }
                        });
                    }
                } else {
                    BlackPassTaskInfoDialog blackPassTaskInfoDialog3 = gUIBlackPassMain.taskDialog;
                    if (blackPassTaskInfoDialog3 != null) {
                        blackPassTaskInfoDialog3.dismiss();
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: GUIBlackPassMain.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.blackpass.GUIBlackPassMain$setObservers$4$1$2 */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ CommonTaskModel $taskPreviewItem;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(CommonTaskModel commonTaskModel22) {
                    super(0);
                    commonTaskModel = commonTaskModel22;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    BlackPassTaskInfoDialog blackPassTaskInfoDialog3 = gUIBlackPassMain.taskDialog;
                    if (blackPassTaskInfoDialog3 != null) {
                        blackPassTaskInfoDialog3.dismiss();
                    }
                    gUIBlackPassMain.getBlackPassMainViewModel().onTaskClick(commonTaskModel);
                }
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        clearViewModel();
        setNullableParameters();
        super.onDestroyView();
        getBlackPassMainViewModel().setStartLayout(0);
    }

    public final void clearViewModel() {
        getBlackPassMainViewModel().clearViewModel();
    }

    private final void setNullableParameters() {
        BlackPassCustomDialog blackPassCustomDialog = this.customDialog;
        if (blackPassCustomDialog != null) {
            blackPassCustomDialog.dismissDialog();
        }
        this.customDialog = null;
    }
}
