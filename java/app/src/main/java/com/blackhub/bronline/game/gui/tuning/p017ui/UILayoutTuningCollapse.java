package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.H262Reader;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.databinding.TuningFragmentCollapseBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
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
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UILayoutTuningCollapse.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUILayoutTuningCollapse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningCollapse.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningCollapse\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,288:1\n106#2,15:289\n106#2,15:304\n106#2,15:319\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningCollapse.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningCollapse\n*L\n40#1:289,15\n41#1:304,15\n42#1:319,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningCollapse extends BaseFragment<TuningFragmentCollapseBinding> {
    public static final int $stable = 8;
    public int collapse;

    /* renamed from: collapseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapseViewModel;
    public int detailsCost;

    @Nullable
    public TuningDialogApply dialogApply;

    @Nullable
    public TuningDialogResetDetails dialogResetDetails;
    public boolean ifInitValue;
    public boolean initView;
    public int mActiveSelectorId;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningCollapse() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$tuningViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$1
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$collapseViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$5
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
        this.collapseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningCollapseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$viewCarViewModel$2
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$special$$inlined$viewModels$default$12
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
        this.mActiveSelectorId = -1;
        this.initView = true;
        this.ifInitValue = true;
    }

    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    public final TuningCollapseViewModel getCollapseViewModel() {
        return (TuningCollapseViewModel) this.collapseViewModel.getValue();
    }

    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentCollapseBinding getViewBinding() {
        TuningFragmentCollapseBinding tuningFragmentCollapseBindingInflate = TuningFragmentCollapseBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tuningFragmentCollapseBindingInflate, "inflate(...)");
        return tuningFragmentCollapseBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        getCollapseViewModel().calculateTheCost(this.mActiveSelectorId);
        initObjects();
        setObservers(this.mActiveSelectorId);
        initListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void getStartData(String jsonString) {
        if (jsonString != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonString);
                this.mActiveSelectorId = jSONObject.optInt(TuningConstants.SELECTOR_JSON);
                String strOptString = jSONObject.optString(TuningConstants.TITLE_JSON);
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                setTitle(strOptString);
            } catch (JSONException e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    public final void setTitle(String title) {
        getBinding().seekbarTitleCollapse.setText(title);
    }

    private final void initObjects() {
        initDialogReset(this.mActiveSelectorId);
        initDialogApply();
    }

    public final void initDialogReset(int currentSelector) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dialogResetDetails = new TuningDialogResetDetails(fragmentActivityRequireActivity);
        initResetClickListener(currentSelector);
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initResetClickListener$1 */
    /* loaded from: classes.dex */
    public static final class C45811 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $currentSelector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45811(int i) {
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
                UILayoutTuningCollapse.this.initView = true;
                TuningMainViewModel.applyResetDetails$default(UILayoutTuningCollapse.this.getTuningViewModel(), i, 0, 2, null);
            }
        }
    }

    public final void initResetClickListener(int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initResetClickListener.1
            public final /* synthetic */ int $currentSelector;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C45811(int currentSelector2) {
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
                    UILayoutTuningCollapse.this.initView = true;
                    TuningMainViewModel.applyResetDetails$default(UILayoutTuningCollapse.this.getTuningViewModel(), i, 0, 2, null);
                }
            }
        });
    }

    public final void initDialogApply() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dialogApply = new TuningDialogApply(fragmentActivityRequireActivity);
        initDialogApplyClickListener();
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initDialogApplyClickListener$1 */
    /* loaded from: classes.dex */
    public static final class C45751 extends Lambda implements Function1<Boolean, Unit> {
        public C45751() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) throws JSONException {
            if (z) {
                UILayoutTuningCollapse.this.getCollapseViewModel().sendBuyCollapse(UILayoutTuningCollapse.this.collapse, UILayoutTuningCollapse.this.mActiveSelectorId);
            }
        }
    }

    public final void initDialogApplyClickListener() {
        TuningDialogApply tuningDialogApply = this.dialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initDialogApplyClickListener.1
            public C45751() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) throws JSONException {
                if (z) {
                    UILayoutTuningCollapse.this.getCollapseViewModel().sendBuyCollapse(UILayoutTuningCollapse.this.collapse, UILayoutTuningCollapse.this.mActiveSelectorId);
                }
            }
        });
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1", m7120f = "UILayoutTuningCollapse.kt", m7121i = {}, m7122l = {129, 135, Cea708Decoder.COMMAND_DLY, 147, Cea708Decoder.COMMAND_DF1, 159, MatroskaExtractor.ID_BLOCK_ADDITIONAL, BcBands.LOOKUPSWITCH, 177}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1 */
    public static final class C45821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentSelectorId;
        public int label;
        public final /* synthetic */ UILayoutTuningCollapse this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45821(int i, UILayoutTuningCollapse uILayoutTuningCollapse, Continuation<? super C45821> continuation) {
            super(2, continuation);
            this.$currentSelectorId = i;
            this.this$0 = uILayoutTuningCollapse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C45821(this.$currentSelectorId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    switch (this.$currentSelectorId) {
                        case 22:
                            StateFlow<Integer> newFullClearance = this.this$0.getCollapseViewModel().getNewFullClearance();
                            AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.1
                                public AnonymousClass1() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 1;
                            if (newFullClearance.collect(anonymousClass1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 23:
                            StateFlow<Integer> newIndividualClearance = this.this$0.getCollapseViewModel().getNewIndividualClearance();
                            AnonymousClass2 anonymousClass2 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.2
                                public AnonymousClass2() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 2;
                            if (newIndividualClearance.collect(anonymousClass2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 24:
                            StateFlow<Integer> newDepartureFrontWheels = this.this$0.getCollapseViewModel().getNewDepartureFrontWheels();
                            AnonymousClass3 anonymousClass3 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.3
                                public AnonymousClass3() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 3;
                            if (newDepartureFrontWheels.collect(anonymousClass3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 25:
                            StateFlow<Integer> newDepartureBackWheels = this.this$0.getCollapseViewModel().getNewDepartureBackWheels();
                            AnonymousClass4 anonymousClass4 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.4
                                public AnonymousClass4() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 4;
                            if (newDepartureBackWheels.collect(anonymousClass4, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 26:
                            StateFlow<Integer> newCollapseFront = this.this$0.getCollapseViewModel().getNewCollapseFront();
                            AnonymousClass5 anonymousClass5 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.5
                                public AnonymousClass5() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 5;
                            if (newCollapseFront.collect(anonymousClass5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 27:
                            StateFlow<Integer> newCollapseBack = this.this$0.getCollapseViewModel().getNewCollapseBack();
                            AnonymousClass6 anonymousClass6 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.6
                                public AnonymousClass6() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 6;
                            if (newCollapseBack.collect(anonymousClass6, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 28:
                            StateFlow<Integer> newWidthFrontWheels = this.this$0.getCollapseViewModel().getNewWidthFrontWheels();
                            AnonymousClass7 anonymousClass7 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.7
                                public AnonymousClass7() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 7;
                            if (newWidthFrontWheels.collect(anonymousClass7, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 29:
                            StateFlow<Integer> newWithBackWheels = this.this$0.getCollapseViewModel().getNewWithBackWheels();
                            AnonymousClass8 anonymousClass8 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.8
                                public AnonymousClass8() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 8;
                            if (newWithBackWheels.collect(anonymousClass8, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        case 30:
                            StateFlow<Integer> newRadiusWheels = this.this$0.getCollapseViewModel().getNewRadiusWheels();
                            AnonymousClass9 anonymousClass9 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.1.9
                                public AnonymousClass9() {
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                                }

                                @Nullable
                                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                                    uILayoutTuningCollapse.setParamsInView(i);
                                    return Unit.INSTANCE;
                                }
                            };
                            this.label = 9;
                            if (newRadiusWheels.collect(anonymousClass9, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw new KotlinNothingValueException();
                        default:
                            return Unit.INSTANCE;
                    }
                case 1:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 2:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 3:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 4:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 5:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 6:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 7:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 8:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                case 9:
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$2 */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public AnonymousClass2() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$3 */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public AnonymousClass3() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$4 */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public AnonymousClass4() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$5 */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public AnonymousClass5() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$6 */
        public static final class AnonymousClass6<T> implements FlowCollector {
            public AnonymousClass6() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$7 */
        public static final class AnonymousClass7<T> implements FlowCollector {
            public AnonymousClass7() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$8 */
        public static final class AnonymousClass8<T> implements FlowCollector {
            public AnonymousClass8() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$1$9 */
        public static final class AnonymousClass9<T> implements FlowCollector {
            public AnonymousClass9() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.setParamsInView(i);
                return Unit.INSTANCE;
            }
        }
    }

    public final void setObservers(int currentSelectorId) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C45821(currentSelectorId, this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C45832(null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new C45843(null));
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$2", m7120f = "UILayoutTuningCollapse.kt", m7121i = {}, m7122l = {H262Reader.START_GROUP}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$2 */
    public static final class C45832 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45832(Continuation<? super C45832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningCollapse.this.new C45832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$2$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningCollapse.detailsCost = i;
                uILayoutTuningCollapse.setPrice(i);
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
                StateFlow<Integer> newCurrentCost = UILayoutTuningCollapse.this.getCollapseViewModel().getNewCurrentCost();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        uILayoutTuningCollapse.detailsCost = i2;
                        uILayoutTuningCollapse.setPrice(i2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newCurrentCost.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$3", m7120f = "UILayoutTuningCollapse.kt", m7121i = {}, m7122l = {190}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$3 */
    public static final class C45843 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45843(Continuation<? super C45843> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningCollapse.this.new C45843(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45843) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutTuningCollapse.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$setObservers$3$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                if (z) {
                    uILayoutTuningCollapse.setVisibleRootView(4);
                } else {
                    uILayoutTuningCollapse.setVisibleRootView(0);
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
                StateFlow<Boolean> newIfShowViewCar = UILayoutTuningCollapse.this.getViewCarViewModel().getNewIfShowViewCar();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            uILayoutTuningCollapse.setVisibleRootView(4);
                        } else {
                            uILayoutTuningCollapse.setVisibleRootView(0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (newIfShowViewCar.collect(anonymousClass1, this) == coroutine_suspended) {
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

    public final void setParamsInView(int valueParameter) {
        if (this.initView) {
            this.initView = false;
            getBinding().tuningSeekbarCollapse.setProgress(valueParameter);
            setProgressInView(valueParameter);
        }
    }

    public final void setProgressInView(int currentValue) {
        getBinding().valueThisCorner.setText(requireActivity().getString(R.string.common_value_and_percent, Integer.valueOf(currentValue)));
    }

    public final void setPrice(int currentCost) {
        getBinding().tuningValuePriceCollapse.setText(getBinding().getRoot().getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
    }

    public final void setVisibleRootView(int isVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(isVisible);
        if (isVisible == 0) {
            root.bringToFront();
        }
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$1 */
    /* loaded from: classes.dex */
    public static final class C45761 extends Lambda implements Function0<Unit> {
        public C45761() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TuningDialogApply tuningDialogApply = UILayoutTuningCollapse.this.dialogApply;
            if (tuningDialogApply != null) {
                tuningDialogApply.showDialogApply(4, UILayoutTuningCollapse.this.detailsCost, 0);
            }
        }
    }

    private final void initListeners() {
        ConstraintLayout tuningPriceCollapse = getBinding().tuningPriceCollapse;
        Intrinsics.checkNotNullExpressionValue(tuningPriceCollapse, "tuningPriceCollapse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceCollapse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initListeners.1
            public C45761() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningDialogApply tuningDialogApply = UILayoutTuningCollapse.this.dialogApply;
                if (tuningDialogApply != null) {
                    tuningDialogApply.showDialogApply(4, UILayoutTuningCollapse.this.detailsCost, 0);
                }
            }
        }, 1, null);
        AppCompatButton backToSubmenuCollapse = getBinding().backToSubmenuCollapse;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuCollapse, "backToSubmenuCollapse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuCollapse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initListeners.2
            public C45772() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                TuningMainViewModel tuningViewModel = UILayoutTuningCollapse.this.getTuningViewModel();
                tuningViewModel.clearCarStatus();
                tuningViewModel.setCurrentLayout(2);
            }
        }, 1, null);
        AppCompatButton buttonViewCarCollapse = getBinding().buttonViewCarCollapse;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarCollapse, "buttonViewCarCollapse");
        setOnClickListenerWithAnimAndDelay(buttonViewCarCollapse, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initListeners.3
            public C45783() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningCollapse.this.getTuningViewModel().setCurrentLayout(1);
                UILayoutTuningCollapse.this.getTuningViewModel().isViewFromMainMenu(false);
            }
        });
        getBinding().tuningSeekbarCollapse.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initListeners.4
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            }

            public C45794() {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean b) throws JSONException {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                UILayoutTuningCollapse.this.collapse = i;
                UILayoutTuningCollapse uILayoutTuningCollapse = UILayoutTuningCollapse.this;
                uILayoutTuningCollapse.setProgressInView(uILayoutTuningCollapse.collapse);
                if (UILayoutTuningCollapse.this.ifInitValue) {
                    return;
                }
                UILayoutTuningCollapse.this.getCollapseViewModel().updateParamsForPreview(UILayoutTuningCollapse.this.collapse);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
                Intrinsics.checkNotNullParameter(seekBar, "seekBar");
                UILayoutTuningCollapse.this.ifInitValue = false;
            }
        });
        AppCompatButton buttonResetCollapse = getBinding().buttonResetCollapse;
        Intrinsics.checkNotNullExpressionValue(buttonResetCollapse, "buttonResetCollapse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetCollapse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse.initListeners.5
            public C45805() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                TuningDialogResetDetails tuningDialogResetDetails = UILayoutTuningCollapse.this.dialogResetDetails;
                if (tuningDialogResetDetails != null) {
                    tuningDialogResetDetails.showDialogReset();
                }
            }
        }, 1, null);
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$2 */
    /* loaded from: classes.dex */
    public static final class C45772 extends Lambda implements Function0<Unit> {
        public C45772() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            TuningMainViewModel tuningViewModel = UILayoutTuningCollapse.this.getTuningViewModel();
            tuningViewModel.clearCarStatus();
            tuningViewModel.setCurrentLayout(2);
        }
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$3 */
    /* loaded from: classes.dex */
    public static final class C45783 extends Lambda implements Function0<Unit> {
        public C45783() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutTuningCollapse.this.getTuningViewModel().setCurrentLayout(1);
            UILayoutTuningCollapse.this.getTuningViewModel().isViewFromMainMenu(false);
        }
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m7105d2 = {"com/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningCollapse$initListeners$4", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "i", "", "b", "", "onStartTrackingTouch", "onStopTrackingTouch", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$4 */
    public static final class C45794 implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        public C45794() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean b) throws JSONException {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            UILayoutTuningCollapse.this.collapse = i;
            UILayoutTuningCollapse uILayoutTuningCollapse = UILayoutTuningCollapse.this;
            uILayoutTuningCollapse.setProgressInView(uILayoutTuningCollapse.collapse);
            if (UILayoutTuningCollapse.this.ifInitValue) {
                return;
            }
            UILayoutTuningCollapse.this.getCollapseViewModel().updateParamsForPreview(UILayoutTuningCollapse.this.collapse);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            UILayoutTuningCollapse.this.ifInitValue = false;
        }
    }

    /* compiled from: UILayoutTuningCollapse.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningCollapse$initListeners$5 */
    /* loaded from: classes.dex */
    public static final class C45805 extends Lambda implements Function0<Unit> {
        public C45805() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            TuningDialogResetDetails tuningDialogResetDetails = UILayoutTuningCollapse.this.dialogResetDetails;
            if (tuningDialogResetDetails != null) {
                tuningDialogResetDetails.showDialogReset();
            }
        }
    }

    private final void closeDialogs() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.closeDialogReset();
        }
        TuningDialogApply tuningDialogApply = this.dialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParameters() {
        this.dialogApply = null;
        this.dialogResetDetails = null;
    }
}

