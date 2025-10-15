package com.blackhub.bronline.game.gui.fractions;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FractionMainMenuLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.gravitysnaphelper.GravitySnapHelper;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.game.gui.fractions.adapters.FractionsMainMenuProgressAdapter;
import com.blackhub.bronline.game.gui.fractions.data.FractionsProgressStaffItem;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIFractionMainLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J4\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J,\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010'\u001a\u00020\u0018H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/UIFractionMainLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FractionMainMenuLayoutBinding;", "()V", "mainViewModel", "Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsMainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "progressAdapter", "Lcom/blackhub/bronline/game/gui/fractions/adapters/FractionsMainMenuProgressAdapter;", "getImageForTasksBackground", "", "fractionId", "getListOfImagesForAdapter", "", "getListOfImagesFunction", "link", "", "getListOfPositionForAdapter", "", "getViewBinding", "initViews", "", "onDestroyView", "setUpData", "fractionsProgressStaffItem", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsProgressStaffItem;", "imageForTasksBackground", "listOfImageForAdapter", "listOfPositionForAdapter", "setupButtonClickListeners", "setupProgressAdapter", "item", "listOfImages", "listOfPosition", "setupRecyclerView", "setupTextProgressInOrganisation", "setupVMObservers", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUIFractionMainLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIFractionMainLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionMainLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,289:1\n106#2,15:290\n*S KotlinDebug\n*F\n+ 1 UIFractionMainLayout.kt\ncom/blackhub/bronline/game/gui/fractions/UIFractionMainLayout\n*L\n31#1:290,15\n*E\n"})
/* loaded from: classes2.dex */
public final class UIFractionMainLayout extends BaseFragment<FractionMainMenuLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public FractionsMainMenuProgressAdapter progressAdapter;

    public final int getImageForTasksBackground(int fractionId) {
        if (fractionId == 11) {
            return R.drawable.bg_fractions_tasks_fsin;
        }
        switch (fractionId) {
            case 1:
                return R.drawable.bg_fractions_tasks_government;
            case 2:
                return R.drawable.bg_fractions_tasks_defense_department;
            case 3:
                return R.drawable.bg_fractions_tasks_hospital;
            case 4:
                return R.drawable.bg_fractions_tasks_mass_media;
            case 5:
                return R.drawable.bg_fractions_tasks_dps;
            case 6:
                return R.drawable.bg_fractions_tasks_mvd;
            case 7:
                return R.drawable.bg_fractions_tasks_fsb;
            default:
                return -1;
        }
    }

    public UIFractionMainLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$mainViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$1
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FractionsMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$special$$inlined$viewModels$default$4
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
    }

    public final FractionsMainViewModel getMainViewModel() {
        return (FractionsMainViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FractionMainMenuLayoutBinding getViewBinding() {
        FractionMainMenuLayoutBinding fractionMainMenuLayoutBindingInflate = FractionMainMenuLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fractionMainMenuLayoutBindingInflate, "inflate(...)");
        return fractionMainMenuLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() throws IllegalStateException {
        setupVMObservers();
        setupRecyclerView();
        setupTextProgressInOrganisation();
        setupButtonClickListeners();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.progressAdapter = null;
        super.onDestroyView();
    }

    public final void setupRecyclerView() throws IllegalStateException {
        new GravitySnapHelper(17).attachToRecyclerView(getBinding().recyclerView);
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 0, false));
        recyclerView.setAdapter(this.progressAdapter);
    }

    /* compiled from: UIFractionMainLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "item", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsProgressStaffItem;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$setupVMObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C40531 extends Lambda implements Function1<FractionsProgressStaffItem, Unit> {
        public C40531() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FractionsProgressStaffItem fractionsProgressStaffItem) {
            invoke2(fractionsProgressStaffItem);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(FractionsProgressStaffItem fractionsProgressStaffItem) {
            UIFractionMainLayout uIFractionMainLayout = UIFractionMainLayout.this;
            Intrinsics.checkNotNull(fractionsProgressStaffItem);
            uIFractionMainLayout.setUpData(fractionsProgressStaffItem, UIFractionMainLayout.this.getImageForTasksBackground(fractionsProgressStaffItem.getFractionId()), UIFractionMainLayout.this.getListOfImagesForAdapter(fractionsProgressStaffItem.getFractionId()), UIFractionMainLayout.this.getListOfPositionForAdapter(fractionsProgressStaffItem.getFractionId()));
        }
    }

    private final void setupVMObservers() {
        getMainViewModel().getProgressStaffItemLiveData().observe(getViewLifecycleOwner(), new UIFractionMainLayout$sam$androidx_lifecycle_Observer$0(new Function1<FractionsProgressStaffItem, Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout.setupVMObservers.1
            public C40531() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FractionsProgressStaffItem fractionsProgressStaffItem) {
                invoke2(fractionsProgressStaffItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(FractionsProgressStaffItem fractionsProgressStaffItem) {
                UIFractionMainLayout uIFractionMainLayout = UIFractionMainLayout.this;
                Intrinsics.checkNotNull(fractionsProgressStaffItem);
                uIFractionMainLayout.setUpData(fractionsProgressStaffItem, UIFractionMainLayout.this.getImageForTasksBackground(fractionsProgressStaffItem.getFractionId()), UIFractionMainLayout.this.getListOfImagesForAdapter(fractionsProgressStaffItem.getFractionId()), UIFractionMainLayout.this.getListOfPositionForAdapter(fractionsProgressStaffItem.getFractionId()));
            }
        }));
    }

    public final void setUpData(FractionsProgressStaffItem fractionsProgressStaffItem, int imageForTasksBackground, List<Integer> listOfImageForAdapter, List<String> listOfPositionForAdapter) {
        ImageButton imageButtonFractionsTasks = getBinding().imageButtonFractionsTasks;
        Intrinsics.checkNotNullExpressionValue(imageButtonFractionsTasks, "imageButtonFractionsTasks");
        ViewExtensionKt.loadImage$default(imageButtonFractionsTasks, Integer.valueOf(imageForTasksBackground), 0, null, 6, null);
        setupProgressAdapter(fractionsProgressStaffItem, listOfImageForAdapter, listOfPositionForAdapter);
        int iIndexOf = fractionsProgressStaffItem.getRankStatus().indexOf(1);
        if (1 <= iIndexOf && iIndexOf < 9) {
            getBinding().recyclerView.scrollToPosition(iIndexOf - 1);
        } else if (iIndexOf == 9) {
            getBinding().recyclerView.scrollToPosition(iIndexOf);
        }
        getBinding().recyclerView.setAdapter(this.progressAdapter);
    }

    public final void setupProgressAdapter(FractionsProgressStaffItem item, List<Integer> listOfImages, List<String> listOfPosition) {
        FractionsMainMenuProgressAdapter fractionsMainMenuProgressAdapter = new FractionsMainMenuProgressAdapter(item.getRankStatus(), item.getRankProgress(), listOfImages, listOfPosition);
        fractionsMainMenuProgressAdapter.setOnGetNewRankButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$setupProgressAdapter$1$1$1
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
                this.this$0.getMainViewModel().sendButtonPressed(1, 7);
            }
        });
        this.progressAdapter = fractionsMainMenuProgressAdapter;
    }

    public final void setupTextProgressInOrganisation() {
        SpannableString spannableString = new SpannableString(requireContext().getString(R.string.fractions_progress_in_organisation_1));
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getBinding().getRoot().getContext(), R.color.yellow)), 0, spannableString.length(), 33);
        Unit unit = Unit.INSTANCE;
        SpannableString spannableString2 = new SpannableString(requireContext().getString(R.string.fractions_progress_in_organisation_2));
        spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getBinding().getRoot().getContext(), R.color.white)), 0, spannableString2.length(), 33);
        getBinding().textViewProgressInOrganisation.setText(TextUtils.concat(spannableString, spannableString2));
    }

    private final void setupButtonClickListeners() {
        ImageButton imageButtonFractionsTasks = getBinding().imageButtonFractionsTasks;
        Intrinsics.checkNotNullExpressionValue(imageButtonFractionsTasks, "imageButtonFractionsTasks");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, imageButtonFractionsTasks, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.fractions.UIFractionMainLayout$setupButtonClickListeners$1$1
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
                this.this$0.getMainViewModel().sendButtonPressed(1, 6);
            }
        }, 1, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<String> getListOfPositionForAdapter(int fractionId) throws Resources.NotFoundException {
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        Resources resources6;
        Resources resources7;
        Resources resources8;
        ArrayList arrayList = new ArrayList();
        String[] stringArray = null;
        if (fractionId != 11) {
            switch (fractionId) {
                case 1:
                    FragmentActivity activity = getActivity();
                    if (activity != null && (resources2 = activity.getResources()) != null) {
                        stringArray = resources2.getStringArray(R.array.fractions_government_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
                case 2:
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null && (resources3 = activity2.getResources()) != null) {
                        stringArray = resources3.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
                case 3:
                    FragmentActivity activity3 = getActivity();
                    if (activity3 != null && (resources4 = activity3.getResources()) != null) {
                        stringArray = resources4.getStringArray(R.array.fractions_hospital_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
                case 4:
                    FragmentActivity activity4 = getActivity();
                    if (activity4 != null && (resources5 = activity4.getResources()) != null) {
                        stringArray = resources5.getStringArray(R.array.fractions_mass_media_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
                case 5:
                    FragmentActivity activity5 = getActivity();
                    if (activity5 != null && (resources6 = activity5.getResources()) != null) {
                        stringArray = resources6.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
                case 6:
                    FragmentActivity activity6 = getActivity();
                    if (activity6 != null && (resources7 = activity6.getResources()) != null) {
                        stringArray = resources7.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
                case 7:
                    FragmentActivity activity7 = getActivity();
                    if (activity7 != null && (resources8 = activity7.getResources()) != null) {
                        stringArray = resources8.getStringArray(R.array.fractions_army_staff_array);
                    }
                    Intrinsics.checkNotNull(stringArray);
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
                    break;
            }
        } else {
            FragmentActivity activity8 = getActivity();
            if (activity8 != null && (resources = activity8.getResources()) != null) {
                stringArray = resources.getStringArray(R.array.fractions_army_staff_array);
            }
            Intrinsics.checkNotNull(stringArray);
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, stringArray);
        }
        return arrayList;
    }

    public final List<Integer> getListOfImagesForAdapter(int fractionId) {
        if (fractionId != 11) {
            switch (fractionId) {
                case 1:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_GOVERNMENT);
                case 2:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_DEPARTMENT);
                case 3:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_HOSPITAL);
                case 4:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MASS_MEDIA);
                case 5:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                case 6:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                case 7:
                    return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
                default:
                    return new ArrayList();
            }
        }
        return getListOfImagesFunction(Const.FRACTION_DRAWABLE_PATH_DEFENSE_MVD);
    }

    @SuppressLint({"DiscouragedApi"})
    private final List<Integer> getListOfImagesFunction(String link) {
        Resources resources;
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 11; i++) {
            String str = link + i;
            FragmentActivity activity = getActivity();
            if (activity != null && (resources = activity.getResources()) != null) {
                arrayList.add(Integer.valueOf(resources.getIdentifier(str, "drawable", activity.getPackageName())));
            }
        }
        return arrayList;
    }
}
