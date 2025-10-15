package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
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
import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningFragmentColorListBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UILayoutTuningColorsList.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020)H\u0002J\b\u0010.\u001a\u00020)H\u0002J\b\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u00104\u001a\u00020)H\u0002J\b\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u00020)H\u0016J\b\u00107\u001a\u00020)H\u0016J\u0010\u00108\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\u0005H\u0002J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u0005H\u0002J\u001e\u0010?\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050AH\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010E\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010F\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0010\u0010G\u001a\u00020)2\u0006\u0010C\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010&¨\u0006H"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentColorListBinding;", "()V", "carId", "", "colorAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter;", "colorClickListener", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter$OnClickColorItem;", "colorCost", "colorListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "getColorListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "colorListViewModel$delegate", "Lkotlin/Lazy;", "currentSelector", "currentTitle", "", "dialogResetDetails", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "hexColor", "intValueOfTransparency", "isInitInterface", "", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "tuningDialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "closeDialogs", "", "getStartData", "jsonString", "getViewBinding", "initColorAdapterAndAttachToView", "initColorCLickListener", "initColorListInView", "initDialogApply", "initDialogApplyCLickListener", "initDialogReset", "initDialogResetClickListener", "initListeners", "initObjects", "initViews", "onDestroyView", "setColorCostInView", "setNullableParams", "setObservers", "setTextInViewWithTransparency", "currentValue", "setTransparencyToView", "valueOfTransparency", "setValueOfTransparency", "listWithValueOfTransparency", "", "setVisibleBlockWithSeekbar", "isVisible", "setVisibleBlockWithSeekbarAndResetButton", "setVisiblePriceButton", "setVisibleResetButton", "setVisibleRootView", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningColorsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningColorsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,360:1\n106#2,15:361\n106#2,15:376\n106#2,15:391\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningColorsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList\n*L\n44#1:361,15\n45#1:376,15\n46#1:391,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningColorsList extends BaseFragment<TuningFragmentColorListBinding> {
    public static final int $stable = 8;
    public int carId;

    @Nullable
    public TuningColorAdapter colorAdapter;

    @Nullable
    public TuningColorAdapter.OnClickColorItem colorClickListener;
    public int colorCost;

    /* renamed from: colorListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy colorListViewModel;
    public int currentSelector;

    @NotNull
    public String currentTitle;

    @Nullable
    public TuningDialogResetDetails dialogResetDetails;

    @NotNull
    public String hexColor;
    public int intValueOfTransparency;
    public boolean isInitInterface;

    @NotNull
    public final TimeChecker timeChecker;

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningColorsList() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$colorListViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$1
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
        this.colorListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningColorListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$tuningViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$viewCarViewModel$2
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$special$$inlined$viewModels$default$12
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
        this.timeChecker = new TimeChecker();
        this.currentSelector = -1;
        this.currentTitle = "";
        this.intValueOfTransparency = -1;
        this.hexColor = "";
    }

    public static final /* synthetic */ TuningFragmentColorListBinding access$getBinding(UILayoutTuningColorsList uILayoutTuningColorsList) {
        return uILayoutTuningColorsList.getBinding();
    }

    public final TuningColorListViewModel getColorListViewModel() {
        return (TuningColorListViewModel) this.colorListViewModel.getValue();
    }

    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentColorListBinding getViewBinding() {
        TuningFragmentColorListBinding tuningFragmentColorListBindingInflate = TuningFragmentColorListBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tuningFragmentColorListBindingInflate, "inflate(...)");
        return tuningFragmentColorListBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        getColorListViewModel().initInterface(this.currentSelector);
        initObjects();
        setObservers();
        setVisibleBlockWithSeekbarAndResetButton(this.currentSelector);
        initColorListInView();
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParams();
        super.onDestroyView();
    }

    private final void getStartData(String jsonString) {
        if (jsonString != null) {
            JSONObject jSONObject = new JSONObject(jsonString);
            this.currentSelector = jSONObject.optInt(TuningConstants.SELECTOR_JSON);
            this.carId = jSONObject.optInt(TuningConstants.CAR_ID_JSON);
            String strOptString = jSONObject.optString(TuningConstants.TITLE_JSON);
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            this.currentTitle = strOptString;
        }
    }

    private final void initObjects() {
        initDialogApply(this.currentSelector);
        initDialogReset(this.currentSelector);
    }

    public final void initDialogApply(int currentSelector) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(fragmentActivityRequireActivity);
        initDialogApplyCLickListener(currentSelector);
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initDialogApplyCLickListener$1 */
    /* loaded from: classes.dex */
    public static final class C45861 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $currentSelector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45861(int i) {
            super(1);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                UILayoutTuningColorsList.this.getColorListViewModel().sendApplyBuyReadyColor(i);
            }
        }
    }

    public final void initDialogApplyCLickListener(int currentSelector) {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initDialogApplyCLickListener.1
            public final /* synthetic */ int $currentSelector;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45861(int currentSelector2) {
                super(1);
                i = currentSelector2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    UILayoutTuningColorsList.this.getColorListViewModel().sendApplyBuyReadyColor(i);
                }
            }
        });
    }

    private final void initDialogReset(int currentSelector) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dialogResetDetails = new TuningDialogResetDetails(fragmentActivityRequireActivity);
        initDialogResetClickListener(currentSelector);
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initDialogResetClickListener$1 */
    /* loaded from: classes.dex */
    public static final class C45871 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $currentSelector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45871(int i) {
            super(1);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) throws JSONException {
            if (z) {
                TuningMainViewModel tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
                TuningMainViewModel.applyResetDetails$default(tuningViewModel, i, 0, 2, null);
                tuningViewModel.clearCarStatus();
            }
        }
    }

    public final void initDialogResetClickListener(int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initDialogResetClickListener.1
            public final /* synthetic */ int $currentSelector;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45871(int currentSelector2) {
                super(1);
                i = currentSelector2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) throws JSONException {
                if (z) {
                    TuningMainViewModel tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
                    TuningMainViewModel.applyResetDetails$default(tuningViewModel, i, 0, 2, null);
                    tuningViewModel.clearCarStatus();
                }
            }
        });
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$1", m7120f = "UILayoutTuningColorsList.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_CW5}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$1 */
    public static final class C45931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45931(Continuation<? super C45931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningColorsList.this.new C45931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> newColorCost = UILayoutTuningColorsList.this.getColorListViewModel().getNewColorCost();
                Lifecycle lifecycle = UILayoutTuningColorsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newColorCost, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        uILayoutTuningColorsList.setColorCostInView(i2);
                        uILayoutTuningColorsList.colorCost = i2;
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

        /* compiled from: UILayoutTuningColorsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$1$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningColorsList.setColorCostInView(i2);
                uILayoutTuningColorsList.colorCost = i2;
                return Unit.INSTANCE;
            }
        }
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C45931(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C45942(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C45953(null), 3, null);
        int i = this.currentSelector;
        if (i == 3 || i == 4) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C45964(null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C45975(null), 3, null);
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$2", m7120f = "UILayoutTuningColorsList.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLC}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$2 */
    public static final class C45942 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45942(Continuation<? super C45942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningColorsList.this.new C45942(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<CarColorItem>> newColorItems = UILayoutTuningColorsList.this.getColorListViewModel().getNewColorItems();
                Lifecycle lifecycle = UILayoutTuningColorsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newColorItems, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<CarColorItem>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<CarColorItem> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningColorAdapter tuningColorAdapter = uILayoutTuningColorsList.colorAdapter;
                        if (tuningColorAdapter != null) {
                            tuningColorAdapter.setColorItems(list);
                        }
                        if (!uILayoutTuningColorsList.isInitInterface) {
                            uILayoutTuningColorsList.isInitInterface = true;
                            TuningColorAdapter tuningColorAdapter2 = uILayoutTuningColorsList.colorAdapter;
                            if (tuningColorAdapter2 != null) {
                                tuningColorAdapter2.initAdapter();
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

        /* compiled from: UILayoutTuningColorsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$2$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<CarColorItem>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<CarColorItem> list, @NotNull Continuation<? super Unit> continuation) {
                TuningColorAdapter tuningColorAdapter = uILayoutTuningColorsList.colorAdapter;
                if (tuningColorAdapter != null) {
                    tuningColorAdapter.setColorItems(list);
                }
                if (!uILayoutTuningColorsList.isInitInterface) {
                    uILayoutTuningColorsList.isInitInterface = true;
                    TuningColorAdapter tuningColorAdapter2 = uILayoutTuningColorsList.colorAdapter;
                    if (tuningColorAdapter2 != null) {
                        tuningColorAdapter2.initAdapter();
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$3", m7120f = "UILayoutTuningColorsList.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DF2}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$3 */
    public static final class C45953 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45953(Continuation<? super C45953> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningColorsList.this.new C45953(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45953) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<Integer>> newAndOldStartColor = UILayoutTuningColorsList.this.getColorListViewModel().getNewAndOldStartColor();
                Lifecycle lifecycle = UILayoutTuningColorsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newAndOldStartColor, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningColorAdapter tuningColorAdapter = uILayoutTuningColorsList.colorAdapter;
                        if (tuningColorAdapter != null) {
                            tuningColorAdapter.updateStartColors(list);
                        }
                        uILayoutTuningColorsList.setVisiblePriceButton(4);
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

        /* compiled from: UILayoutTuningColorsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$3$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                TuningColorAdapter tuningColorAdapter = uILayoutTuningColorsList.colorAdapter;
                if (tuningColorAdapter != null) {
                    tuningColorAdapter.updateStartColors(list);
                }
                uILayoutTuningColorsList.setVisiblePriceButton(4);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$4", m7120f = "UILayoutTuningColorsList.kt", m7121i = {}, m7122l = {164}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$4 */
    public static final class C45964 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45964(Continuation<? super C45964> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningColorsList.this.new C45964(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45964) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<Integer>> newValueOfTransparency = UILayoutTuningColorsList.this.getColorListViewModel().getNewValueOfTransparency();
                Lifecycle lifecycle = UILayoutTuningColorsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newValueOfTransparency, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.setObservers.4.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                        UILayoutTuningColorsList uILayoutTuningColorsList = uILayoutTuningColorsList;
                        uILayoutTuningColorsList.setValueOfTransparency(uILayoutTuningColorsList.currentSelector, list);
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

        /* compiled from: UILayoutTuningColorsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$4$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                UILayoutTuningColorsList uILayoutTuningColorsList = uILayoutTuningColorsList;
                uILayoutTuningColorsList.setValueOfTransparency(uILayoutTuningColorsList.currentSelector, list);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$5", m7120f = "UILayoutTuningColorsList.kt", m7121i = {}, m7122l = {176}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$5 */
    public static final class C45975 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45975(Continuation<? super C45975> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningColorsList.this.new C45975(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45975) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> newIfShowViewCar = UILayoutTuningColorsList.this.getViewCarViewModel().getNewIfShowViewCar();
                Lifecycle lifecycle = UILayoutTuningColorsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newIfShowViewCar, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.setObservers.5.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            uILayoutTuningColorsList.setVisibleRootView(4);
                        } else {
                            uILayoutTuningColorsList.setVisibleRootView(0);
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

        /* compiled from: UILayoutTuningColorsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$setObservers$5$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                if (z) {
                    uILayoutTuningColorsList.setVisibleRootView(4);
                } else {
                    uILayoutTuningColorsList.setVisibleRootView(0);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void setColorCostInView(int colorCost) {
        getBinding().tuningPriceColor.setText(getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(colorCost))));
    }

    public final void setVisiblePriceButton(int isVisible) {
        getBinding().titlePriceBlockColor.setVisibility(isVisible);
        getBinding().tuningPriceColor.setVisibility(isVisible);
    }

    public final void setValueOfTransparency(int currentSelector, List<Integer> listWithValueOfTransparency) {
        if (currentSelector == 3) {
            setTransparencyToView(listWithValueOfTransparency.get(2).intValue());
        } else {
            if (currentSelector != 4) {
                return;
            }
            setTransparencyToView(listWithValueOfTransparency.get(3).intValue());
        }
    }

    public final void setTransparencyToView(int valueOfTransparency) {
        getBinding().tuningSeekbarColor.setProgress(valueOfTransparency);
        setTextInViewWithTransparency(valueOfTransparency);
    }

    public final void setTextInViewWithTransparency(int currentValue) {
        getBinding().valueTransparencyColor.setText(requireActivity().getString(R.string.common_value_and_percent, Integer.valueOf(currentValue)));
    }

    public final void setVisibleRootView(int isVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(isVisible);
        if (isVisible == 0) {
            root.bringToFront();
        }
    }

    public final void setVisibleBlockWithSeekbarAndResetButton(int currentSelector) {
        if (currentSelector == 3 || currentSelector == 4) {
            setVisibleBlockWithSeekbar(0);
            setVisibleResetButton(0);
        } else {
            setVisibleBlockWithSeekbar(4);
            setVisibleResetButton(4);
        }
    }

    public final void setVisibleBlockWithSeekbar(int isVisible) {
        getBinding().seekbarViewColor.setVisibility(isVisible);
    }

    public final void setVisibleResetButton(int isVisible) {
        getBinding().buttonResetToningReady.setVisibility(isVisible);
    }

    public final void initColorListInView() {
        initColorCLickListener();
        initColorAdapterAndAttachToView();
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m7105d2 = {"com/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList$initColorCLickListener$1", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningColorAdapter$OnClickColorItem;", "click", "", "colorItem", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initColorCLickListener$1 */
    public static final class C45851 implements TuningColorAdapter.OnClickColorItem {
        public C45851() {
        }

        @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter.OnClickColorItem
        public void click(@NotNull CarColorItem colorItem, int getPosition, @Nullable View view) {
            Intrinsics.checkNotNullParameter(colorItem, "colorItem");
            if (UILayoutTuningColorsList.this.timeChecker.ifAccess(250L)) {
                colorItem.setSelected(true);
                TuningColorAdapter tuningColorAdapter = UILayoutTuningColorsList.this.colorAdapter;
                if (tuningColorAdapter != null) {
                    tuningColorAdapter.notifyItemChanged(getPosition);
                    tuningColorAdapter.setOnlyColorClickable(getPosition);
                }
                if (colorItem.getStartColor()) {
                    UILayoutTuningColorsList.this.setVisiblePriceButton(4);
                } else {
                    UILayoutTuningColorsList.this.setVisiblePriceButton(0);
                }
                UILayoutTuningColorsList.this.hexColor = colorItem.getColor();
                UILayoutTuningColorsList.this.getColorListViewModel().setColorObjToBuy(UILayoutTuningColorsList.this.hexColor, UILayoutTuningColorsList.this.intValueOfTransparency);
            }
        }
    }

    public final void initColorCLickListener() {
        this.colorClickListener = new TuningColorAdapter.OnClickColorItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initColorCLickListener.1
            public C45851() {
            }

            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningColorAdapter.OnClickColorItem
            public void click(@NotNull CarColorItem colorItem, int getPosition, @Nullable View view) {
                Intrinsics.checkNotNullParameter(colorItem, "colorItem");
                if (UILayoutTuningColorsList.this.timeChecker.ifAccess(250L)) {
                    colorItem.setSelected(true);
                    TuningColorAdapter tuningColorAdapter = UILayoutTuningColorsList.this.colorAdapter;
                    if (tuningColorAdapter != null) {
                        tuningColorAdapter.notifyItemChanged(getPosition);
                        tuningColorAdapter.setOnlyColorClickable(getPosition);
                    }
                    if (colorItem.getStartColor()) {
                        UILayoutTuningColorsList.this.setVisiblePriceButton(4);
                    } else {
                        UILayoutTuningColorsList.this.setVisiblePriceButton(0);
                    }
                    UILayoutTuningColorsList.this.hexColor = colorItem.getColor();
                    UILayoutTuningColorsList.this.getColorListViewModel().setColorObjToBuy(UILayoutTuningColorsList.this.hexColor, UILayoutTuningColorsList.this.intValueOfTransparency);
                }
            }
        };
    }

    public final void initColorAdapterAndAttachToView() {
        this.colorAdapter = new TuningColorAdapter(this.colorClickListener);
        RecyclerView recyclerView = getBinding().recvColorsList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.colorAdapter);
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$1 */
    /* loaded from: classes.dex */
    public static final class C45881 extends Lambda implements Function0<Unit> {
        public C45881() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            TuningMainViewModel tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
            tuningViewModel.clearCarStatus();
            tuningViewModel.setCurrentLayout(2);
        }
    }

    private final void initListeners() {
        AppCompatButton backToSubmenuColor = getBinding().backToSubmenuColor;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuColor, "backToSubmenuColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initListeners.1
            public C45881() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                TuningMainViewModel tuningViewModel = UILayoutTuningColorsList.this.getTuningViewModel();
                tuningViewModel.clearCarStatus();
                tuningViewModel.setCurrentLayout(2);
            }
        }, 1, null);
        AppCompatButton buttonViewCarColor = getBinding().buttonViewCarColor;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarColor, "buttonViewCarColor");
        setOnClickListenerWithAnimAndDelay(buttonViewCarColor, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initListeners.2
            public C45892() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningColorsList.this.getTuningViewModel().setCurrentLayout(1);
                UILayoutTuningColorsList.this.getTuningViewModel().isViewFromMainMenu(false);
            }
        });
        AppCompatButton buttonResetToningReady = getBinding().buttonResetToningReady;
        Intrinsics.checkNotNullExpressionValue(buttonResetToningReady, "buttonResetToningReady");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetToningReady, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initListeners.3
            public C45903() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningDialogResetDetails tuningDialogResetDetails = UILayoutTuningColorsList.this.dialogResetDetails;
                if (tuningDialogResetDetails != null) {
                    tuningDialogResetDetails.showDialogReset();
                }
            }
        }, 1, null);
        TextView tuningPriceColor = getBinding().tuningPriceColor;
        Intrinsics.checkNotNullExpressionValue(tuningPriceColor, "tuningPriceColor");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceColor, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initListeners.4
            public C45914() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningDialogApply tuningDialogApply = UILayoutTuningColorsList.this.tuningDialogApply;
                if (tuningDialogApply != null) {
                    tuningDialogApply.showDialogApply(1, UILayoutTuningColorsList.this.colorCost, 0);
                }
            }
        }, 1, null);
        getBinding().tuningSeekbarColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList.initListeners.5
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            }

            public C45925() {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean b) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                UILayoutTuningColorsList.this.setTextInViewWithTransparency(i);
                UILayoutTuningColorsList.this.intValueOfTransparency = seekBar.getMax() - i;
                UILayoutTuningColorsList.this.getColorListViewModel().setColorObjToBuy(UILayoutTuningColorsList.this.hexColor, UILayoutTuningColorsList.this.intValueOfTransparency);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                if (UILayoutTuningColorsList.access$getBinding(UILayoutTuningColorsList.this).tuningPriceColor.getVisibility() != 4 || Intrinsics.areEqual(UILayoutTuningColorsList.this.hexColor, "")) {
                    return;
                }
                UILayoutTuningColorsList.this.setVisiblePriceButton(0);
            }
        });
        getBinding().listRgbColors.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutTuningColorsList.initListeners$lambda$2(this.f$0, view);
            }
        });
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$2 */
    /* loaded from: classes.dex */
    public static final class C45892 extends Lambda implements Function0<Unit> {
        public C45892() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutTuningColorsList.this.getTuningViewModel().setCurrentLayout(1);
            UILayoutTuningColorsList.this.getTuningViewModel().isViewFromMainMenu(false);
        }
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$3 */
    /* loaded from: classes.dex */
    public static final class C45903 extends Lambda implements Function0<Unit> {
        public C45903() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TuningDialogResetDetails tuningDialogResetDetails = UILayoutTuningColorsList.this.dialogResetDetails;
            if (tuningDialogResetDetails != null) {
                tuningDialogResetDetails.showDialogReset();
            }
        }
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$4 */
    /* loaded from: classes.dex */
    public static final class C45914 extends Lambda implements Function0<Unit> {
        public C45914() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TuningDialogApply tuningDialogApply = UILayoutTuningColorsList.this.tuningDialogApply;
            if (tuningDialogApply != null) {
                tuningDialogApply.showDialogApply(1, UILayoutTuningColorsList.this.colorCost, 0);
            }
        }
    }

    /* compiled from: UILayoutTuningColorsList.kt */
    @Metadata(m7104d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m7105d2 = {"com/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningColorsList$initListeners$5", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "i", "", "b", "", "onStartTrackingTouch", "onStopTrackingTouch", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningColorsList$initListeners$5 */
    public static final class C45925 implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        public C45925() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean b) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            UILayoutTuningColorsList.this.setTextInViewWithTransparency(i);
            UILayoutTuningColorsList.this.intValueOfTransparency = seekBar.getMax() - i;
            UILayoutTuningColorsList.this.getColorListViewModel().setColorObjToBuy(UILayoutTuningColorsList.this.hexColor, UILayoutTuningColorsList.this.intValueOfTransparency);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (UILayoutTuningColorsList.access$getBinding(UILayoutTuningColorsList.this).tuningPriceColor.getVisibility() != 4 || Intrinsics.areEqual(UILayoutTuningColorsList.this.hexColor, "")) {
                return;
            }
            UILayoutTuningColorsList.this.setVisiblePriceButton(0);
        }
    }

    public static final void initListeners$lambda$2(UILayoutTuningColorsList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.setEnabled(false);
        this$0.getTuningViewModel().setCurrentLayout(8);
    }

    private final void closeDialogs() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.closeDialogReset();
        }
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParams() {
        this.colorClickListener = null;
        this.colorAdapter = null;
        this.tuningDialogApply = null;
        this.dialogResetDetails = null;
    }
}
