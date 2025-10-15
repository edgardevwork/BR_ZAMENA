package com.blackhub.bronline.game.gui.tuning.p017ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.TuningFragmentDetailsListBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter;
import com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* compiled from: UILayoutTuningDetailsList.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u00101\u001a\u0002022\u0010\u00103\u001a\f\u0012\u0006\b\u0001\u0012\u000205\u0018\u000104H\u0002J\b\u00106\u001a\u000202H\u0002J\u0012\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u00109\u001a\u00020\u0002H\u0016J\b\u0010:\u001a\u000202H\u0002J\b\u0010;\u001a\u000202H\u0002J\b\u0010<\u001a\u000202H\u0002J\b\u0010=\u001a\u000202H\u0002J\u0010\u0010>\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u000202H\u0002J\b\u0010A\u001a\u000202H\u0002J\b\u0010B\u001a\u000202H\u0002J\u0010\u0010C\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010D\u001a\u000202H\u0016J\b\u0010E\u001a\u000202H\u0002J\b\u0010F\u001a\u000202H\u0016J\u0010\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0005H\u0002J\u0010\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020\u0005H\u0002J\u0018\u0010K\u001a\u0002022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0012\u0010L\u001a\u0002022\b\u0010M\u001a\u0004\u0018\u00010NH\u0002J\u0012\u0010O\u001a\u0002022\b\u0010P\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u00020\u0005H\u0002J\b\u0010S\u001a\u000202H\u0002J\b\u0010T\u001a\u000202H\u0002J\u0010\u0010U\u001a\u0002022\u0006\u0010V\u001a\u00020\u0005H\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\u0005H\u0002J\u0018\u0010Z\u001a\u0002022\u0006\u0010[\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u001eH\u0002J\b\u0010]\u001a\u000202H\u0002J\b\u0010^\u001a\u000202H\u0002J\u0012\u0010_\u001a\u0002022\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u0010\u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010'R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b.\u0010/¨\u0006e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/TuningFragmentDetailsListBinding;", "()V", "carId", "", "clickDetail", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter$OnClickDetailItem;", "clickVinyl", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$OnClickVinylItem;", "currentAction", "currentCost", "currentCurrency", "currentId", "currentSelector", "currentTitle", "", "detailsAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter;", "detailsListViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "getDetailsListViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningDetailsListViewModel;", "detailsListViewModel$delegate", "Lkotlin/Lazy;", "dialogOpeningBox", "Lcom/blackhub/bronline/game/gui/tuning/ui/DialogOpeningBox;", "dialogResetDetails", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogResetDetails;", "ifGetType", "", "ifInitInterface", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "tuningDialogApply", "Lcom/blackhub/bronline/game/gui/tuning/ui/TuningDialogApply;", "tuningViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "getTuningViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningMainViewModel;", "tuningViewModel$delegate", "tuningVinylsAdapter", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter;", "typeOfDetail", "viewCarViewModel", "Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "getViewCarViewModel", "()Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "viewCarViewModel$delegate", "attachAdapterToView", "", "myAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "closeDialogs", "getStartData", "jsonString", "getViewBinding", "initDetailAdapter", "initDialogApply", "initDialogApplyClickListener", "initDialogOpenBox", "initDialogReset", "initListeners", "initObjects", "initOnClickDetail", "initOnClickVinyl", "initResetClickListener", "initViews", "initVinylAdapter", "onDestroyView", "prepareResetButton", "selectorId", "previewDetailOrPlaySound", "tuneId", "setCostInView", "setIconOnButton", "icon", "Landroid/graphics/drawable/Drawable;", "setNameThisWindow", "nameWindow", "setNewParamsForPriceBlock", "currentSize", "setNullableParameters", "setObservers", "setVisibleBody", "valueOfVisible", "setVisibleForInfoBrake", "setVisibleForResetButton", "isVisible", "setVisiblePriceBlock", "ifVisible", "ifBoth", "showDialogOpeningBox", "showDialogReset", "updateButtonViewForDetail", "currentObject", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "updateButtonViewForVinyl", "currentVinyl", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUILayoutTuningDetailsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutTuningDetailsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,653:1\n106#2,15:654\n106#2,15:669\n106#2,15:684\n*S KotlinDebug\n*F\n+ 1 UILayoutTuningDetailsList.kt\ncom/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList\n*L\n69#1:654,15\n70#1:669,15\n71#1:684,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UILayoutTuningDetailsList extends BaseFragment<TuningFragmentDetailsListBinding> {
    public static final int $stable = 8;
    public int carId;

    @Nullable
    public TuningDetailsAdapter.OnClickDetailItem clickDetail;

    @Nullable
    public TuningVinylsAdapter.OnClickVinylItem clickVinyl;
    public int currentAction;
    public int currentCost;
    public int currentCurrency;
    public int currentId;
    public int currentSelector;

    @NotNull
    public String currentTitle;

    @Nullable
    public TuningDetailsAdapter detailsAdapter;

    /* renamed from: detailsListViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy detailsListViewModel;

    @Nullable
    public DialogOpeningBox dialogOpeningBox;

    @Nullable
    public TuningDialogResetDetails dialogResetDetails;
    public boolean ifGetType;
    public boolean ifInitInterface;

    @NotNull
    public final TimeChecker timeChecker;

    @Nullable
    public TuningDialogApply tuningDialogApply;

    /* renamed from: tuningViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy tuningViewModel;

    @Nullable
    public TuningVinylsAdapter tuningVinylsAdapter;
    public int typeOfDetail;

    /* renamed from: viewCarViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewCarViewModel;

    public UILayoutTuningDetailsList() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$detailsListViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$1
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
        this.detailsListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningDetailsListViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$tuningViewModel$2
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
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$5
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
        this.tuningViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$8
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$viewCarViewModel$2
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
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$9
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
        this.viewCarViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TuningViewCarViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$special$$inlined$viewModels$default$12
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
        this.ifInitInterface = true;
        this.currentSelector = -1;
        this.currentAction = -1;
        this.currentId = -1;
        this.currentTitle = "";
        this.typeOfDetail = -1;
    }

    public final TuningDetailsListViewModel getDetailsListViewModel() {
        return (TuningDetailsListViewModel) this.detailsListViewModel.getValue();
    }

    public final TuningMainViewModel getTuningViewModel() {
        return (TuningMainViewModel) this.tuningViewModel.getValue();
    }

    public final TuningViewCarViewModel getViewCarViewModel() {
        return (TuningViewCarViewModel) this.viewCarViewModel.getValue();
    }

    private final void getStartData(String jsonString) {
        if (jsonString != null) {
            try {
                JSONObject jSONObject = new JSONObject(jsonString);
                this.currentSelector = jSONObject.optInt(TuningConstants.SELECTOR_JSON);
                this.carId = jSONObject.optInt(TuningConstants.CAR_ID_JSON);
                String strOptString = jSONObject.optString(TuningConstants.TITLE_JSON);
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                this.currentTitle = strOptString;
            } catch (JSONException e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public TuningFragmentDetailsListBinding getViewBinding() {
        TuningFragmentDetailsListBinding tuningFragmentDetailsListBindingInflate = TuningFragmentDetailsListBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tuningFragmentDetailsListBindingInflate, "inflate(...)");
        return tuningFragmentDetailsListBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        Bundle arguments = getArguments();
        getStartData(arguments != null ? arguments.getString(TuningConstants.JSON_OBJECT) : null);
        prepareResetButton(this.currentSelector);
        initObjects();
        setNameThisWindow(this.currentTitle);
        setObservers();
        initListeners();
    }

    public final void prepareResetButton(int selectorId) {
        switch (selectorId) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                break;
            default:
                switch (selectorId) {
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                        break;
                    default:
                        this.ifGetType = false;
                        setVisibleForResetButton(0);
                        break;
                }
        }
        this.ifGetType = true;
        setVisibleForResetButton(4);
    }

    public final void setVisibleForResetButton(int isVisible) {
        getBinding().buttonResetDetail.setVisibility(isVisible);
    }

    private final void initObjects() {
        initDialogApply();
        initDialogReset(this.currentSelector);
    }

    private final void initDialogApply() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.tuningDialogApply = new TuningDialogApply(fragmentActivityRequireActivity);
        initDialogApplyClickListener();
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initDialogApplyClickListener$1 */
    public static final class C45981 extends Lambda implements Function1<Boolean, Unit> {
        public C45981() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) throws JSONException {
            if (z) {
                if (UILayoutTuningDetailsList.this.currentSelector == 2) {
                    UILayoutTuningDetailsList.this.getDetailsListViewModel().sendBuyVinyl(UILayoutTuningDetailsList.this.currentId);
                } else {
                    UILayoutTuningDetailsList.this.getDetailsListViewModel().sendBuyNewDetail(UILayoutTuningDetailsList.this.currentId);
                }
            }
        }
    }

    private final void initDialogApplyClickListener() {
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply == null) {
            return;
        }
        tuningDialogApply.setMyClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initDialogApplyClickListener.1
            public C45981() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws JSONException {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) throws JSONException {
                if (z) {
                    if (UILayoutTuningDetailsList.this.currentSelector == 2) {
                        UILayoutTuningDetailsList.this.getDetailsListViewModel().sendBuyVinyl(UILayoutTuningDetailsList.this.currentId);
                    } else {
                        UILayoutTuningDetailsList.this.getDetailsListViewModel().sendBuyNewDetail(UILayoutTuningDetailsList.this.currentId);
                    }
                }
            }
        });
    }

    private final void initDialogReset(int currentSelector) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dialogResetDetails = new TuningDialogResetDetails(fragmentActivityRequireActivity);
        initResetClickListener(currentSelector);
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "ifApply", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initResetClickListener$1 */
    public static final class C46061 extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $currentSelector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46061(int i) {
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
                UILayoutTuningDetailsList.this.getTuningViewModel().applyResetDetails(i, UILayoutTuningDetailsList.this.typeOfDetail);
                if (UILayoutTuningDetailsList.this.ifGetType) {
                    UILayoutTuningDetailsList.this.setVisibleForResetButton(4);
                }
            }
        }
    }

    private final void initResetClickListener(int currentSelector) {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails == null) {
            return;
        }
        tuningDialogResetDetails.setResetClickListener(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initResetClickListener.1
            public final /* synthetic */ int $currentSelector;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46061(int currentSelector2) {
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
                    UILayoutTuningDetailsList.this.getTuningViewModel().applyResetDetails(i, UILayoutTuningDetailsList.this.typeOfDetail);
                    if (UILayoutTuningDetailsList.this.ifGetType) {
                        UILayoutTuningDetailsList.this.setVisibleForResetButton(4);
                    }
                }
            }
        });
    }

    public final void setNameThisWindow(String nameWindow) {
        getBinding().titleDetailsList.setText(nameWindow);
    }

    private final void setObservers() {
        if (this.currentSelector == 2) {
            initOnClickVinyl();
            initVinylAdapter();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46071(null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46082(null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46093(null), 3, null);
        } else {
            initOnClickDetail();
            initDetailAdapter();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46104(null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46115(null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46126(null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46137(null), 3, null);
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$1", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {203}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$1 */
    public static final class C46071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46071(Continuation<? super C46071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Integer> newVinylCost = UILayoutTuningDetailsList.this.getDetailsListViewModel().getNewVinylCost();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newVinylCost, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        uILayoutTuningDetailsList.currentCost = i2;
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$1$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                uILayoutTuningDetailsList.currentCost = i2;
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$2", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {211}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$2 */
    public static final class C46082 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46082(Continuation<? super C46082> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46082(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46082) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<TuneVinylsObj>> newVinylsList = UILayoutTuningDetailsList.this.getDetailsListViewModel().getNewVinylsList();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newVinylsList, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<TuneVinylsObj>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<TuneVinylsObj> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningVinylsAdapter tuningVinylsAdapter = uILayoutTuningDetailsList.tuningVinylsAdapter;
                        if (tuningVinylsAdapter != null) {
                            UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                            tuningVinylsAdapter.setVinyls(list);
                            if (uILayoutTuningDetailsList.ifInitInterface) {
                                uILayoutTuningDetailsList.ifInitInterface = false;
                                uILayoutTuningDetailsList.attachAdapterToView(tuningVinylsAdapter);
                                tuningVinylsAdapter.initVinyls();
                                uILayoutTuningDetailsList.setNewParamsForPriceBlock(list.size());
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$2$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<TuneVinylsObj>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<TuneVinylsObj> list, @NotNull Continuation<? super Unit> continuation) {
                TuningVinylsAdapter tuningVinylsAdapter = uILayoutTuningDetailsList.tuningVinylsAdapter;
                if (tuningVinylsAdapter != null) {
                    UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                    tuningVinylsAdapter.setVinyls(list);
                    if (uILayoutTuningDetailsList.ifInitInterface) {
                        uILayoutTuningDetailsList.ifInitInterface = false;
                        uILayoutTuningDetailsList.attachAdapterToView(tuningVinylsAdapter);
                        tuningVinylsAdapter.initVinyls();
                        uILayoutTuningDetailsList.setNewParamsForPriceBlock(list.size());
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$3", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {228}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$3 */
    public static final class C46093 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46093(Continuation<? super C46093> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46093(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46093) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<Integer>> newNewAndOldVinyls = UILayoutTuningDetailsList.this.getDetailsListViewModel().getNewNewAndOldVinyls();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newNewAndOldVinyls, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningVinylsAdapter tuningVinylsAdapter;
                        if ((!list.isEmpty()) && (tuningVinylsAdapter = uILayoutTuningDetailsList.tuningVinylsAdapter) != null) {
                            UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                            tuningVinylsAdapter.updateStartVinyl(list);
                            if (((Number) CollectionsKt___CollectionsKt.first((List) list)).intValue() != -1) {
                                uILayoutTuningDetailsList.updateButtonViewForVinyl(tuningVinylsAdapter.getTuneVinylObjs().get(((Number) CollectionsKt___CollectionsKt.first((List) list)).intValue()));
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$3$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                TuningVinylsAdapter tuningVinylsAdapter;
                if ((!list.isEmpty()) && (tuningVinylsAdapter = uILayoutTuningDetailsList.tuningVinylsAdapter) != null) {
                    UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                    tuningVinylsAdapter.updateStartVinyl(list);
                    if (((Number) CollectionsKt___CollectionsKt.first((List) list)).intValue() != -1) {
                        uILayoutTuningDetailsList.updateButtonViewForVinyl(tuningVinylsAdapter.getTuneVinylObjs().get(((Number) CollectionsKt___CollectionsKt.first((List) list)).intValue()));
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$4", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {246}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$4 */
    public static final class C46104 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46104(Continuation<? super C46104> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46104(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46104) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<List<TuneObj>> newDetailsList = UILayoutTuningDetailsList.this.getDetailsListViewModel().getNewDetailsList();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newDetailsList, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.4.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<TuneObj>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<TuneObj> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningDetailsAdapter tuningDetailsAdapter = uILayoutTuningDetailsList.detailsAdapter;
                        if (tuningDetailsAdapter != null) {
                            UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                            tuningDetailsAdapter.setItems(list);
                            if (uILayoutTuningDetailsList.ifInitInterface) {
                                uILayoutTuningDetailsList.ifInitInterface = false;
                                uILayoutTuningDetailsList.attachAdapterToView(tuningDetailsAdapter);
                                tuningDetailsAdapter.initItems(uILayoutTuningDetailsList.carId);
                                uILayoutTuningDetailsList.setVisibleForInfoBrake();
                                uILayoutTuningDetailsList.setNewParamsForPriceBlock(list.size());
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$4$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<TuneObj>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<TuneObj> list, @NotNull Continuation<? super Unit> continuation) {
                TuningDetailsAdapter tuningDetailsAdapter = uILayoutTuningDetailsList.detailsAdapter;
                if (tuningDetailsAdapter != null) {
                    UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                    tuningDetailsAdapter.setItems(list);
                    if (uILayoutTuningDetailsList.ifInitInterface) {
                        uILayoutTuningDetailsList.ifInitInterface = false;
                        uILayoutTuningDetailsList.attachAdapterToView(tuningDetailsAdapter);
                        tuningDetailsAdapter.initItems(uILayoutTuningDetailsList.carId);
                        uILayoutTuningDetailsList.setVisibleForInfoBrake();
                        uILayoutTuningDetailsList.setNewParamsForPriceBlock(list.size());
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$5", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {264}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$5 */
    public static final class C46115 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46115(Continuation<? super C46115> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46115(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46115) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<Integer>> newNewAndOldDetails = UILayoutTuningDetailsList.this.getDetailsListViewModel().getNewNewAndOldDetails();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newNewAndOldDetails, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.5.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                        TuningDetailsAdapter tuningDetailsAdapter;
                        T next;
                        if ((!list.isEmpty()) && (tuningDetailsAdapter = uILayoutTuningDetailsList.detailsAdapter) != null) {
                            UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                            tuningDetailsAdapter.updateItemStatus(list);
                            Iterator<T> it = tuningDetailsAdapter.getLDetailsItems().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                if (((TuneObj) next).getId() == ((Number) CollectionsKt___CollectionsKt.first((List) list)).intValue()) {
                                    break;
                                }
                            }
                            uILayoutTuningDetailsList.updateButtonViewForDetail(next);
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$5$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                TuningDetailsAdapter tuningDetailsAdapter;
                T next;
                if ((!list.isEmpty()) && (tuningDetailsAdapter = uILayoutTuningDetailsList.detailsAdapter) != null) {
                    UILayoutTuningDetailsList uILayoutTuningDetailsList = uILayoutTuningDetailsList;
                    tuningDetailsAdapter.updateItemStatus(list);
                    Iterator<T> it = tuningDetailsAdapter.getLDetailsItems().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (((TuneObj) next).getId() == ((Number) CollectionsKt___CollectionsKt.first((List) list)).intValue()) {
                            break;
                        }
                    }
                    uILayoutTuningDetailsList.updateButtonViewForDetail(next);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$6", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {279}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$6 */
    public static final class C46126 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46126(Continuation<? super C46126> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46126(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46126) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> newVisibleDialogBox = UILayoutTuningDetailsList.this.getDetailsListViewModel().getNewVisibleDialogBox();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newVisibleDialogBox, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.6.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            uILayoutTuningDetailsList.setVisibleBody(4);
                        } else {
                            uILayoutTuningDetailsList.setVisibleBody(0);
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$6$1 */
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
                    uILayoutTuningDetailsList.setVisibleBody(4);
                } else {
                    uILayoutTuningDetailsList.setVisibleBody(0);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$7", m7120f = "UILayoutTuningDetailsList.kt", m7121i = {}, m7122l = {292}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$7 */
    public static final class C46137 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46137(Continuation<? super C46137> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutTuningDetailsList.this.new C46137(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46137) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> newIfShowViewCar = UILayoutTuningDetailsList.this.getViewCarViewModel().getNewIfShowViewCar();
                Lifecycle lifecycle = UILayoutTuningDetailsList.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(newIfShowViewCar, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.setObservers.7.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            uILayoutTuningDetailsList.setVisibleBody(4);
                        } else {
                            uILayoutTuningDetailsList.setVisibleBody(0);
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

        /* compiled from: UILayoutTuningDetailsList.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$setObservers$7$1 */
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
                    uILayoutTuningDetailsList.setVisibleBody(4);
                } else {
                    uILayoutTuningDetailsList.setVisibleBody(0);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m7105d2 = {"com/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList$initOnClickVinyl$1", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningVinylsAdapter$OnClickVinylItem;", "click", "", "tuneVinyl", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initOnClickVinyl$1 */
    public static final class C46051 implements TuningVinylsAdapter.OnClickVinylItem {
        public C46051() {
        }

        @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter.OnClickVinylItem
        public void click(@NotNull TuneVinylsObj tuneVinyl, int getPosition, @Nullable View view) throws JSONException {
            Intrinsics.checkNotNullParameter(tuneVinyl, "tuneVinyl");
            if (UILayoutTuningDetailsList.this.timeChecker.ifAccess(250L)) {
                tuneVinyl.setSelected(true);
                TuningVinylsAdapter tuningVinylsAdapter = UILayoutTuningDetailsList.this.tuningVinylsAdapter;
                if (tuningVinylsAdapter != null) {
                    tuningVinylsAdapter.notifyItemChanged(getPosition);
                    tuningVinylsAdapter.setOnlyVinylClickable(getPosition);
                }
                UILayoutTuningDetailsList.this.currentId = tuneVinyl.getId();
                UILayoutTuningDetailsList.this.updateButtonViewForVinyl(tuneVinyl);
                UILayoutTuningDetailsList.this.getDetailsListViewModel().previewVinyl(tuneVinyl.getNameVinyl());
            }
        }
    }

    public final void initOnClickVinyl() {
        this.clickVinyl = new TuningVinylsAdapter.OnClickVinylItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initOnClickVinyl.1
            public C46051() {
            }

            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningVinylsAdapter.OnClickVinylItem
            public void click(@NotNull TuneVinylsObj tuneVinyl, int getPosition, @Nullable View view) throws JSONException {
                Intrinsics.checkNotNullParameter(tuneVinyl, "tuneVinyl");
                if (UILayoutTuningDetailsList.this.timeChecker.ifAccess(250L)) {
                    tuneVinyl.setSelected(true);
                    TuningVinylsAdapter tuningVinylsAdapter = UILayoutTuningDetailsList.this.tuningVinylsAdapter;
                    if (tuningVinylsAdapter != null) {
                        tuningVinylsAdapter.notifyItemChanged(getPosition);
                        tuningVinylsAdapter.setOnlyVinylClickable(getPosition);
                    }
                    UILayoutTuningDetailsList.this.currentId = tuneVinyl.getId();
                    UILayoutTuningDetailsList.this.updateButtonViewForVinyl(tuneVinyl);
                    UILayoutTuningDetailsList.this.getDetailsListViewModel().previewVinyl(tuneVinyl.getNameVinyl());
                }
            }
        };
    }

    public final void updateButtonViewForVinyl(TuneVinylsObj currentVinyl) {
        if (currentVinyl.getStartVinyl()) {
            this.currentAction = -1;
            setVisiblePriceBlock(false, true);
        } else {
            this.currentAction = 1;
            setCostInView(0, this.currentCost);
            setIconOnButton(null);
            setVisiblePriceBlock(true, true);
        }
    }

    public final void setVisiblePriceBlock(boolean ifVisible, boolean ifBoth) {
        int i;
        int i2 = 0;
        if (ifVisible && ifBoth) {
            i = 0;
        } else {
            i = 4;
            if (!ifVisible || ifBoth) {
                i2 = 4;
            }
        }
        getBinding().tuningPriceDetail.setVisibility(i2);
        getBinding().titlePriceBlockDetails.setVisibility(i);
    }

    public final void setCostInView(int currentCurrency, int currentCost) {
        if (currentCurrency == 0) {
            getBinding().tuningPriceDetail.setText(getBinding().getRoot().getContext().getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
        } else {
            if (currentCurrency != 1) {
                return;
            }
            getBinding().tuningPriceDetail.setText(getBinding().getRoot().getContext().getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Integer.valueOf(currentCost))));
        }
    }

    public final void setIconOnButton(Drawable icon) {
        getBinding().tuningPriceDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(icon, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void initVinylAdapter() {
        this.tuningVinylsAdapter = new TuningVinylsAdapter(this, this.clickVinyl, getDetailsListViewModel());
    }

    public final void attachAdapterToView(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> myAdapter) {
        RecyclerView recyclerView = getBinding().recvDetailsList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(myAdapter);
    }

    public final void setNewParamsForPriceBlock(int currentSize) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(19, R.id.help_view_in_detail_list);
        layoutParams.addRule(8, R.id.help_view_in_detail_list);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(19, R.id.help_view_above_list_in_detail_list);
        layoutParams2.addRule(8, R.id.help_view_above_list_in_detail_list);
        if (currentSize < 4) {
            getBinding().menuBlockDetail.setLayoutParams(layoutParams);
        } else {
            getBinding().menuBlockDetail.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m7105d2 = {"com/blackhub/bronline/game/gui/tuning/ui/UILayoutTuningDetailsList$initOnClickDetail$1", "Lcom/blackhub/bronline/game/gui/tuning/adapters/TuningDetailsAdapter$OnClickDetailItem;", "click", "", "detailsItem", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "getPosition", "", SVG.View.NODE_NAME, "Landroid/view/View;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initOnClickDetail$1 */
    public static final class C46041 implements TuningDetailsAdapter.OnClickDetailItem {
        public C46041() {
        }

        @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter.OnClickDetailItem
        public void click(@NotNull TuneObj detailsItem, int getPosition, @Nullable View view) throws JSONException {
            int type;
            Intrinsics.checkNotNullParameter(detailsItem, "detailsItem");
            if (UILayoutTuningDetailsList.this.timeChecker.ifAccess(250L)) {
                detailsItem.setChecked(true);
                TuningDetailsAdapter tuningDetailsAdapter = UILayoutTuningDetailsList.this.detailsAdapter;
                if (tuningDetailsAdapter != null) {
                    tuningDetailsAdapter.notifyItemChanged(getPosition);
                    tuningDetailsAdapter.setOnlyDetailClickable(getPosition);
                }
                UILayoutTuningDetailsList.this.currentCost = detailsItem.getCost();
                UILayoutTuningDetailsList.this.currentCurrency = detailsItem.getCurrency();
                UILayoutTuningDetailsList.this.currentId = detailsItem.getId();
                UILayoutTuningDetailsList.this.updateButtonViewForDetail(detailsItem);
                UILayoutTuningDetailsList.this.previewDetailOrPlaySound(detailsItem.getTuneId());
                if (UILayoutTuningDetailsList.this.ifGetType) {
                    UILayoutTuningDetailsList uILayoutTuningDetailsList = UILayoutTuningDetailsList.this;
                    if (detailsItem.getThisLocation() == 2) {
                        UILayoutTuningDetailsList.this.setVisibleForResetButton(0);
                        type = detailsItem.getType();
                    } else {
                        UILayoutTuningDetailsList.this.setVisibleForResetButton(4);
                        type = -1;
                    }
                    uILayoutTuningDetailsList.typeOfDetail = type;
                }
            }
        }
    }

    public final void initOnClickDetail() {
        this.clickDetail = new TuningDetailsAdapter.OnClickDetailItem() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initOnClickDetail.1
            public C46041() {
            }

            @Override // com.blackhub.bronline.game.gui.tuning.adapters.TuningDetailsAdapter.OnClickDetailItem
            public void click(@NotNull TuneObj detailsItem, int getPosition, @Nullable View view) throws JSONException {
                int type;
                Intrinsics.checkNotNullParameter(detailsItem, "detailsItem");
                if (UILayoutTuningDetailsList.this.timeChecker.ifAccess(250L)) {
                    detailsItem.setChecked(true);
                    TuningDetailsAdapter tuningDetailsAdapter = UILayoutTuningDetailsList.this.detailsAdapter;
                    if (tuningDetailsAdapter != null) {
                        tuningDetailsAdapter.notifyItemChanged(getPosition);
                        tuningDetailsAdapter.setOnlyDetailClickable(getPosition);
                    }
                    UILayoutTuningDetailsList.this.currentCost = detailsItem.getCost();
                    UILayoutTuningDetailsList.this.currentCurrency = detailsItem.getCurrency();
                    UILayoutTuningDetailsList.this.currentId = detailsItem.getId();
                    UILayoutTuningDetailsList.this.updateButtonViewForDetail(detailsItem);
                    UILayoutTuningDetailsList.this.previewDetailOrPlaySound(detailsItem.getTuneId());
                    if (UILayoutTuningDetailsList.this.ifGetType) {
                        UILayoutTuningDetailsList uILayoutTuningDetailsList = UILayoutTuningDetailsList.this;
                        if (detailsItem.getThisLocation() == 2) {
                            UILayoutTuningDetailsList.this.setVisibleForResetButton(0);
                            type = detailsItem.getType();
                        } else {
                            UILayoutTuningDetailsList.this.setVisibleForResetButton(4);
                            type = -1;
                        }
                        uILayoutTuningDetailsList.typeOfDetail = type;
                    }
                }
            }
        };
    }

    public final void updateButtonViewForDetail(TuneObj currentObject) {
        Drawable drawable;
        if (currentObject == null) {
            return;
        }
        if (currentObject.getType() == -1) {
            this.currentAction = 3;
            drawable = ContextCompat.getDrawable(getBinding().getRoot().getContext(), R.drawable.tuning_icon_box_white);
            getBinding().tuningPriceDetail.setText(R.string.common_view);
            setVisiblePriceBlock(true, false);
        } else {
            int thisLocation = currentObject.getThisLocation();
            if (thisLocation == 0) {
                this.currentAction = 1;
                setCostInView(currentObject.getCurrency(), currentObject.getCost());
                setVisiblePriceBlock(true, true);
            } else if (thisLocation == 1) {
                this.currentAction = 5;
                drawable = ContextCompat.getDrawable(getBinding().getRoot().getContext(), R.drawable.tuning_repair);
                getBinding().tuningPriceDetail.setText(R.string.tuning_title_button_set_detail);
                setVisiblePriceBlock(true, false);
            } else if (thisLocation == 2) {
                this.currentAction = -1;
                setVisiblePriceBlock(false, true);
            }
            drawable = null;
        }
        setIconOnButton(drawable);
    }

    public final void previewDetailOrPlaySound(int tuneId) throws JSONException {
        Iterator<Integer> it = TuningConstants.INSTANCE.getActiveSelectorListForPreview().iterator();
        while (it.hasNext()) {
            if (this.currentSelector == it.next().intValue()) {
                getDetailsListViewModel().previewDetail(tuneId);
                return;
            }
        }
        Iterator<Integer> it2 = TuningConstants.INSTANCE.getActiveSelectorListForSoundPlay().iterator();
        while (it2.hasNext()) {
            if (this.currentSelector == it2.next().intValue()) {
                getDetailsListViewModel().playSound(tuneId);
                return;
            }
        }
    }

    public final void initDetailAdapter() {
        this.detailsAdapter = new TuningDetailsAdapter(this.clickDetail);
    }

    public final void setVisibleBody(int valueOfVisible) {
        RelativeLayout root = getBinding().getRoot();
        root.setVisibility(valueOfVisible);
        if (valueOfVisible == 0) {
            root.bringToFront();
        }
    }

    public final void setVisibleForInfoBrake() {
        Iterator<Integer> it = TuningConstants.INSTANCE.getActiveSelectorListForInfoBrake().iterator();
        while (it.hasNext()) {
            if (it.next().intValue() == this.currentSelector) {
                getBinding().buttonInfoBrake.setVisibility(0);
                return;
            }
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$1 */
    public static final class C45991 extends Lambda implements Function0<Unit> {
        public C45991() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            int i = UILayoutTuningDetailsList.this.currentAction;
            if (i == 1) {
                TuningDialogApply tuningDialogApply = UILayoutTuningDetailsList.this.tuningDialogApply;
                if (tuningDialogApply != null) {
                    tuningDialogApply.showDialogApply(1, UILayoutTuningDetailsList.this.currentCost, UILayoutTuningDetailsList.this.currentCurrency);
                    return;
                }
                return;
            }
            if (i == 3) {
                UILayoutTuningDetailsList.this.showDialogOpeningBox();
            } else {
                if (i != 5) {
                    return;
                }
                UILayoutTuningDetailsList.this.getDetailsListViewModel().sendSetDetail(UILayoutTuningDetailsList.this.currentId);
            }
        }
    }

    private final void initListeners() {
        AppCompatButton tuningPriceDetail = getBinding().tuningPriceDetail;
        Intrinsics.checkNotNullExpressionValue(tuningPriceDetail, "tuningPriceDetail");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, tuningPriceDetail, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initListeners.1
            public C45991() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                int i = UILayoutTuningDetailsList.this.currentAction;
                if (i == 1) {
                    TuningDialogApply tuningDialogApply = UILayoutTuningDetailsList.this.tuningDialogApply;
                    if (tuningDialogApply != null) {
                        tuningDialogApply.showDialogApply(1, UILayoutTuningDetailsList.this.currentCost, UILayoutTuningDetailsList.this.currentCurrency);
                        return;
                    }
                    return;
                }
                if (i == 3) {
                    UILayoutTuningDetailsList.this.showDialogOpeningBox();
                } else {
                    if (i != 5) {
                        return;
                    }
                    UILayoutTuningDetailsList.this.getDetailsListViewModel().sendSetDetail(UILayoutTuningDetailsList.this.currentId);
                }
            }
        }, 1, null);
        AppCompatButton backToSubmenuDetail = getBinding().backToSubmenuDetail;
        Intrinsics.checkNotNullExpressionValue(backToSubmenuDetail, "backToSubmenuDetail");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, backToSubmenuDetail, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initListeners.2
            public C46002() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                TuningMainViewModel tuningViewModel = UILayoutTuningDetailsList.this.getTuningViewModel();
                tuningViewModel.setCurrentLayout(2);
                tuningViewModel.clearCarStatus();
            }
        }, 1, null);
        AppCompatButton buttonViewCarDetailsList = getBinding().buttonViewCarDetailsList;
        Intrinsics.checkNotNullExpressionValue(buttonViewCarDetailsList, "buttonViewCarDetailsList");
        setOnClickListenerWithAnimAndDelay(buttonViewCarDetailsList, 500L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initListeners.3
            public C46013() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningDetailsList.this.getTuningViewModel().setCurrentLayout(1);
                UILayoutTuningDetailsList.this.getTuningViewModel().isViewFromMainMenu(false);
            }
        });
        ImageView buttonInfoBrake = getBinding().buttonInfoBrake;
        Intrinsics.checkNotNullExpressionValue(buttonInfoBrake, "buttonInfoBrake");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonInfoBrake, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initListeners.4
            public C46024() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningDetailsList.this.getTuningViewModel().setCurrentLayout(10);
            }
        }, 1, null);
        AppCompatButton buttonResetDetail = getBinding().buttonResetDetail;
        Intrinsics.checkNotNullExpressionValue(buttonResetDetail, "buttonResetDetail");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonResetDetail, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList.initListeners.5
            public C46035() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                UILayoutTuningDetailsList.this.showDialogReset();
            }
        }, 1, null);
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$2 */
    public static final class C46002 extends Lambda implements Function0<Unit> {
        public C46002() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            TuningMainViewModel tuningViewModel = UILayoutTuningDetailsList.this.getTuningViewModel();
            tuningViewModel.setCurrentLayout(2);
            tuningViewModel.clearCarStatus();
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$3 */
    public static final class C46013 extends Lambda implements Function0<Unit> {
        public C46013() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutTuningDetailsList.this.getTuningViewModel().setCurrentLayout(1);
            UILayoutTuningDetailsList.this.getTuningViewModel().isViewFromMainMenu(false);
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$4 */
    public static final class C46024 extends Lambda implements Function0<Unit> {
        public C46024() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutTuningDetailsList.this.getTuningViewModel().setCurrentLayout(10);
        }
    }

    /* compiled from: UILayoutTuningDetailsList.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.tuning.ui.UILayoutTuningDetailsList$initListeners$5 */
    public static final class C46035 extends Lambda implements Function0<Unit> {
        public C46035() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            UILayoutTuningDetailsList.this.showDialogReset();
        }
    }

    public final void showDialogOpeningBox() {
        DialogOpeningBox dialogOpeningBox = this.dialogOpeningBox;
        if (dialogOpeningBox != null) {
            Intrinsics.checkNotNull(dialogOpeningBox);
            if (dialogOpeningBox.getIfSavedStatus()) {
                DialogOpeningBox dialogOpeningBox2 = this.dialogOpeningBox;
                if (dialogOpeningBox2 != null) {
                    dialogOpeningBox2.showDialogOpeningBox();
                    return;
                }
                return;
            }
        }
        initDialogOpenBox();
        DialogOpeningBox dialogOpeningBox3 = this.dialogOpeningBox;
        if (dialogOpeningBox3 != null) {
            dialogOpeningBox3.showDialogOpeningBox();
        }
    }

    public final void initDialogOpenBox() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        int i = this.carId;
        TuningDetailsListViewModel detailsListViewModel = getDetailsListViewModel();
        TuningMainViewModel tuningViewModel = getTuningViewModel();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dialogOpeningBox = new DialogOpeningBox(lifecycleScope, i, detailsListViewModel, tuningViewModel, fragmentActivityRequireActivity);
    }

    public final void showDialogReset() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.showDialogReset();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        closeDialogs();
        setNullableParameters();
        super.onDestroyView();
    }

    private final void closeDialogs() {
        TuningDialogResetDetails tuningDialogResetDetails = this.dialogResetDetails;
        if (tuningDialogResetDetails != null) {
            tuningDialogResetDetails.closeDialogReset();
        }
        DialogOpeningBox dialogOpeningBox = this.dialogOpeningBox;
        if (dialogOpeningBox != null) {
            dialogOpeningBox.closeDialogOpeningBox();
        }
        TuningDialogApply tuningDialogApply = this.tuningDialogApply;
        if (tuningDialogApply != null) {
            tuningDialogApply.closeDialog();
        }
    }

    private final void setNullableParameters() {
        this.clickVinyl = null;
        this.tuningVinylsAdapter = null;
        this.clickDetail = null;
        this.detailsAdapter = null;
        this.tuningDialogApply = null;
        this.dialogResetDetails = null;
        this.dialogOpeningBox = null;
    }
}
