package com.blackhub.bronline.game.gui.drivingschool.p012ui;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DrivingSchoolMainLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolMainTypeAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingMainType;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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

/* compiled from: UIMainLayout.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIMainLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIMainLayout.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIMainLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,146:1\n106#2,15:147\n106#2,15:162\n106#2,15:177\n*S KotlinDebug\n*F\n+ 1 UIMainLayout.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIMainLayout\n*L\n23#1:147,15\n24#1:162,15\n25#1:177,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIMainLayout extends BaseFragment<DrivingSchoolMainLayoutBinding> {
    public static final int DEFAULT_COUNTER = 0;
    public static final int IF_CHECKED = 1;
    public static final int IF_STOP = 2;

    /* renamed from: classInfoViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy classInfoViewModel;

    @NotNull
    public List<Integer> counter;

    @Nullable
    public DrivingMainType currentCategory;

    /* renamed from: currentViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy currentViewModel;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public DrivingSchoolMainTypeAdapter typeSchoolsAdapter;
    public static final int $stable = 8;

    public UIMainLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$currentViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$1
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
        this.currentViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$mainViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$5
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$classInfoViewModel$2
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$9
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
        this.classInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolClassInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$special$$inlined$viewModels$default$12
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
        this.counter = CollectionsKt__CollectionsKt.mutableListOf(-1, 0);
    }

    public final DrivingSchoolMainViewModel getCurrentViewModel() {
        return (DrivingSchoolMainViewModel) this.currentViewModel.getValue();
    }

    public final DrivingSchoolViewModel getMainViewModel() {
        return (DrivingSchoolViewModel) this.mainViewModel.getValue();
    }

    public final DrivingSchoolClassInfoViewModel getClassInfoViewModel() {
        return (DrivingSchoolClassInfoViewModel) this.classInfoViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolMainLayoutBinding getViewBinding() {
        DrivingSchoolMainLayoutBinding drivingSchoolMainLayoutBindingInflate = DrivingSchoolMainLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(drivingSchoolMainLayoutBindingInflate, "inflate(...)");
        return drivingSchoolMainLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setBackground();
        initDriverLicenseType();
        setObservers();
        initClickListeners();
    }

    public final void setBackground() {
        TextView textView = getBinding().text2;
        Useful useful = Useful.INSTANCE;
        String string = requireActivity().getString(R.string.driving_school_class_info_main_title_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(useful.getTextWithHtmlStyles(string));
        TextView textView2 = getBinding().text3;
        String string2 = requireActivity().getString(R.string.driving_school_class_info_main_subtitle_1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        textView2.setText(useful.getTextWithHtmlStyles(string2));
    }

    public final void initDriverLicenseType() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.typeSchoolsAdapter = new DrivingSchoolMainTypeAdapter(fragmentActivityRequireActivity);
        setLogicForItemsClick();
        RecyclerView recyclerView = getBinding().blockWitchTypeSchools;
        recyclerView.setLayoutManager(new GridLayoutManager(getBinding().getRoot().getContext(), 2, 1, false));
        recyclerView.setAdapter(this.typeSchoolsAdapter);
    }

    /* compiled from: UIMainLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m7105d2 = {"<anonymous>", "", "item", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "position", "", SVG.View.NODE_NAME, "Landroid/view/View;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setLogicForItemsClick$1 */
    /* loaded from: classes2.dex */
    public static final class C39431 extends Lambda implements Function3<DrivingMainType, Integer, View, Unit> {
        public C39431() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(DrivingMainType drivingMainType, Integer num, View view) {
            invoke(drivingMainType, num.intValue(), view);
            return Unit.INSTANCE;
        }

        /* compiled from: UIMainLayout.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setLogicForItemsClick$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ DrivingMainType $item;
            public final /* synthetic */ int $position;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DrivingMainType drivingMainType, int i) {
                super(0);
                drivingMainType = drivingMainType;
                i = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                if (((Number) uIMainLayout.counter.get(1)).intValue() != 2) {
                    uIMainLayout.getClassInfoViewModel().saveCategory(drivingMainType);
                    DrivingMainType drivingMainType = drivingMainType;
                    drivingMainType.setCheck(drivingMainType.isUnBlock() == 1);
                    DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = uIMainLayout.typeSchoolsAdapter;
                    if (drivingSchoolMainTypeAdapter != null) {
                        drivingSchoolMainTypeAdapter.setOnlyItemCheck(i);
                    }
                    if (drivingMainType.isCheck()) {
                        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter2 = uIMainLayout.typeSchoolsAdapter;
                        if (drivingSchoolMainTypeAdapter2 != null) {
                            drivingSchoolMainTypeAdapter2.notifyItemChanged(i);
                        }
                        if (drivingMainType.getId() != ((Number) uIMainLayout.counter.get(0)).intValue() || ((Number) uIMainLayout.counter.get(1)).intValue() != 1) {
                            uIMainLayout.counter.set(0, Integer.valueOf(drivingMainType.getId()));
                            uIMainLayout.counter.set(1, 1);
                            uIMainLayout.currentCategory = drivingMainType;
                            return;
                        } else {
                            uIMainLayout.getMainViewModel().checkType(drivingMainType.getId());
                            uIMainLayout.counter.set(1, 2);
                            return;
                        }
                    }
                    uIMainLayout.counter.set(0, -1);
                    uIMainLayout.counter.set(1, 0);
                    uIMainLayout.currentCategory = null;
                }
            }
        }

        public final void invoke(@NotNull DrivingMainType item, int i, @NotNull View view) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(view, "view");
            UIMainLayout uIMainLayout = UIMainLayout.this;
            BaseFragment.startAnimAndDelay$default(uIMainLayout, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.setLogicForItemsClick.1.1
                public final /* synthetic */ DrivingMainType $item;
                public final /* synthetic */ int $position;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(DrivingMainType item2, int i2) {
                    super(0);
                    drivingMainType = item2;
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    if (((Number) uIMainLayout.counter.get(1)).intValue() != 2) {
                        uIMainLayout.getClassInfoViewModel().saveCategory(drivingMainType);
                        DrivingMainType drivingMainType = drivingMainType;
                        drivingMainType.setCheck(drivingMainType.isUnBlock() == 1);
                        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = uIMainLayout.typeSchoolsAdapter;
                        if (drivingSchoolMainTypeAdapter != null) {
                            drivingSchoolMainTypeAdapter.setOnlyItemCheck(i);
                        }
                        if (drivingMainType.isCheck()) {
                            DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter2 = uIMainLayout.typeSchoolsAdapter;
                            if (drivingSchoolMainTypeAdapter2 != null) {
                                drivingSchoolMainTypeAdapter2.notifyItemChanged(i);
                            }
                            if (drivingMainType.getId() != ((Number) uIMainLayout.counter.get(0)).intValue() || ((Number) uIMainLayout.counter.get(1)).intValue() != 1) {
                                uIMainLayout.counter.set(0, Integer.valueOf(drivingMainType.getId()));
                                uIMainLayout.counter.set(1, 1);
                                uIMainLayout.currentCategory = drivingMainType;
                                return;
                            } else {
                                uIMainLayout.getMainViewModel().checkType(drivingMainType.getId());
                                uIMainLayout.counter.set(1, 2);
                                return;
                            }
                        }
                        uIMainLayout.counter.set(0, -1);
                        uIMainLayout.counter.set(1, 0);
                        uIMainLayout.currentCategory = null;
                    }
                }
            }, 1, null);
        }
    }

    public final void setLogicForItemsClick() {
        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = this.typeSchoolsAdapter;
        if (drivingSchoolMainTypeAdapter == null) {
            return;
        }
        drivingSchoolMainTypeAdapter.setMainTypeSchoolClickListener(new Function3<DrivingMainType, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.setLogicForItemsClick.1
            public C39431() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(DrivingMainType drivingMainType, Integer num, View view) {
                invoke(drivingMainType, num.intValue(), view);
                return Unit.INSTANCE;
            }

            /* compiled from: UIMainLayout.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setLogicForItemsClick$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ DrivingMainType $item;
                public final /* synthetic */ int $position;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(DrivingMainType item2, int i2) {
                    super(0);
                    drivingMainType = item2;
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    if (((Number) uIMainLayout.counter.get(1)).intValue() != 2) {
                        uIMainLayout.getClassInfoViewModel().saveCategory(drivingMainType);
                        DrivingMainType drivingMainType = drivingMainType;
                        drivingMainType.setCheck(drivingMainType.isUnBlock() == 1);
                        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = uIMainLayout.typeSchoolsAdapter;
                        if (drivingSchoolMainTypeAdapter != null) {
                            drivingSchoolMainTypeAdapter.setOnlyItemCheck(i);
                        }
                        if (drivingMainType.isCheck()) {
                            DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter2 = uIMainLayout.typeSchoolsAdapter;
                            if (drivingSchoolMainTypeAdapter2 != null) {
                                drivingSchoolMainTypeAdapter2.notifyItemChanged(i);
                            }
                            if (drivingMainType.getId() != ((Number) uIMainLayout.counter.get(0)).intValue() || ((Number) uIMainLayout.counter.get(1)).intValue() != 1) {
                                uIMainLayout.counter.set(0, Integer.valueOf(drivingMainType.getId()));
                                uIMainLayout.counter.set(1, 1);
                                uIMainLayout.currentCategory = drivingMainType;
                                return;
                            } else {
                                uIMainLayout.getMainViewModel().checkType(drivingMainType.getId());
                                uIMainLayout.counter.set(1, 2);
                                return;
                            }
                        }
                        uIMainLayout.counter.set(0, -1);
                        uIMainLayout.counter.set(1, 0);
                        uIMainLayout.currentCategory = null;
                    }
                }
            }

            public final void invoke(@NotNull DrivingMainType item2, int i2, @NotNull View view) {
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(view, "view");
                UIMainLayout uIMainLayout = UIMainLayout.this;
                BaseFragment.startAnimAndDelay$default(uIMainLayout, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.setLogicForItemsClick.1.1
                    public final /* synthetic */ DrivingMainType $item;
                    public final /* synthetic */ int $position;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(DrivingMainType item22, int i22) {
                        super(0);
                        drivingMainType = item22;
                        i = i22;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() throws JSONException {
                        if (((Number) uIMainLayout.counter.get(1)).intValue() != 2) {
                            uIMainLayout.getClassInfoViewModel().saveCategory(drivingMainType);
                            DrivingMainType drivingMainType = drivingMainType;
                            drivingMainType.setCheck(drivingMainType.isUnBlock() == 1);
                            DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter2 = uIMainLayout.typeSchoolsAdapter;
                            if (drivingSchoolMainTypeAdapter2 != null) {
                                drivingSchoolMainTypeAdapter2.setOnlyItemCheck(i);
                            }
                            if (drivingMainType.isCheck()) {
                                DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter22 = uIMainLayout.typeSchoolsAdapter;
                                if (drivingSchoolMainTypeAdapter22 != null) {
                                    drivingSchoolMainTypeAdapter22.notifyItemChanged(i);
                                }
                                if (drivingMainType.getId() != ((Number) uIMainLayout.counter.get(0)).intValue() || ((Number) uIMainLayout.counter.get(1)).intValue() != 1) {
                                    uIMainLayout.counter.set(0, Integer.valueOf(drivingMainType.getId()));
                                    uIMainLayout.counter.set(1, 1);
                                    uIMainLayout.currentCategory = drivingMainType;
                                    return;
                                } else {
                                    uIMainLayout.getMainViewModel().checkType(drivingMainType.getId());
                                    uIMainLayout.counter.set(1, 2);
                                    return;
                                }
                            }
                            uIMainLayout.counter.set(0, -1);
                            uIMainLayout.counter.set(1, 0);
                            uIMainLayout.currentCategory = null;
                        }
                    }
                }, 1, null);
            }
        });
    }

    /* compiled from: UIMainLayout.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$1", m7120f = "UIMainLayout.kt", m7121i = {}, m7122l = {99}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$1 */
    public static final class C39441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39441(Continuation<? super C39441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIMainLayout.this.new C39441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIMainLayout.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingMainType;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$1$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<DrivingMainType>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<DrivingMainType> list, @NotNull Continuation<? super Unit> continuation) {
                DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter;
                if ((!list.isEmpty()) && (drivingSchoolMainTypeAdapter = uIMainLayout.typeSchoolsAdapter) != null) {
                    drivingSchoolMainTypeAdapter.initItems(list);
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
                StateFlow<List<DrivingMainType>> driverLicenseType = UIMainLayout.this.getCurrentViewModel().getDriverLicenseType();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<DrivingMainType>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<DrivingMainType> list, @NotNull Continuation<? super Unit> continuation) {
                        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter;
                        if ((!list.isEmpty()) && (drivingSchoolMainTypeAdapter = uIMainLayout.typeSchoolsAdapter) != null) {
                            drivingSchoolMainTypeAdapter.initItems(list);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (driverLicenseType.collect(anonymousClass1, this) == coroutine_suspended) {
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

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C39441(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C39452(null));
    }

    /* compiled from: UIMainLayout.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$2", m7120f = "UIMainLayout.kt", m7121i = {}, m7122l = {106}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$2 */
    public static final class C39452 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39452(Continuation<? super C39452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIMainLayout.this.new C39452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIMainLayout.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$setObservers$2$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                if (!z) {
                    uIMainLayout.clearCounter();
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
                SharedFlow<Boolean> sharedFlowIsApplyDriverLicenseType = UIMainLayout.this.getCurrentViewModel().isApplyDriverLicenseType();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (!z) {
                            uIMainLayout.clearCounter();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowIsApplyDriverLicenseType.collect(anonymousClass1, this) == coroutine_suspended) {
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

    public final void clearCounter() {
        this.counter.set(0, -1);
        this.counter.set(1, 0);
        this.currentCategory = null;
        DrivingSchoolMainTypeAdapter drivingSchoolMainTypeAdapter = this.typeSchoolsAdapter;
        if (drivingSchoolMainTypeAdapter != null) {
            drivingSchoolMainTypeAdapter.setOnlyItemCheck(-1);
        }
    }

    /* compiled from: UIMainLayout.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout$initClickListeners$1 */
    /* loaded from: classes2.dex */
    public static final class C39421 extends Lambda implements Function0<Unit> {
        public C39421() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            if (((Number) UIMainLayout.this.counter.get(0)).intValue() == -1 || ((Number) UIMainLayout.this.counter.get(1)).intValue() == 2) {
                return;
            }
            if (UIMainLayout.this.currentCategory != null) {
                DrivingMainType drivingMainType = UIMainLayout.this.currentCategory;
                if (drivingMainType != null) {
                    UIMainLayout.this.getMainViewModel().checkType(drivingMainType.getId());
                }
            } else {
                UIMainLayout.this.getMainViewModel().checkType(((Number) UIMainLayout.this.counter.get(0)).intValue());
            }
            UIMainLayout.this.counter.set(1, 2);
        }
    }

    private final void initClickListeners() {
        AppCompatButton buttonStartCourse = getBinding().buttonStartCourse;
        Intrinsics.checkNotNullExpressionValue(buttonStartCourse, "buttonStartCourse");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonStartCourse, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIMainLayout.initClickListeners.1
            public C39421() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                if (((Number) UIMainLayout.this.counter.get(0)).intValue() == -1 || ((Number) UIMainLayout.this.counter.get(1)).intValue() == 2) {
                    return;
                }
                if (UIMainLayout.this.currentCategory != null) {
                    DrivingMainType drivingMainType = UIMainLayout.this.currentCategory;
                    if (drivingMainType != null) {
                        UIMainLayout.this.getMainViewModel().checkType(drivingMainType.getId());
                    }
                } else {
                    UIMainLayout.this.getMainViewModel().checkType(((Number) UIMainLayout.this.counter.get(0)).intValue());
                }
                UIMainLayout.this.counter.set(1, 2);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.typeSchoolsAdapter = null;
        this.currentCategory = null;
    }
}

