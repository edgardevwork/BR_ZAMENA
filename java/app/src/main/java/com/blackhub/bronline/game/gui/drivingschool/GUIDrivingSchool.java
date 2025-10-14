package com.blackhub.bronline.game.gui.drivingschool;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.DrivingSchoolMainDialogBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.gui.drivingschool.p012ui.DialogEndTest;
import com.blackhub.bronline.game.gui.drivingschool.p012ui.UIClassInfoLayout;
import com.blackhub.bronline.game.gui.drivingschool.p012ui.UIMainLayout;
import com.blackhub.bronline.game.gui.drivingschool.p012ui.UIQuestions;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolClassInfoViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolMainViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import com.blackhub.bronline.game.gui.moduledialog.ModuleDialogKeys;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIDrivingSchool.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIDrivingSchool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIDrivingSchool.kt\ncom/blackhub/bronline/game/gui/drivingschool/GUIDrivingSchool\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,181:1\n106#2,15:182\n106#2,15:197\n106#2,15:212\n106#2,15:227\n*S KotlinDebug\n*F\n+ 1 GUIDrivingSchool.kt\ncom/blackhub/bronline/game/gui/drivingschool/GUIDrivingSchool\n*L\n32#1:182,15\n39#1:197,15\n46#1:212,15\n53#1:227,15\n*E\n"})

public final class GUIDrivingSchool extends BaseISAMPGUIFragment<DrivingSchoolMainDialogBinding> {
    public static final int $stable = 8;
    public int allQuestions;

    @Inject
    public MainViewModelFactory<DrivingSchoolClassInfoViewModel> drivingSchoolClassInfoFactory;

    /* renamed from: drivingSchoolClassInfoViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolClassInfoViewModel;

    @Inject
    public MainViewModelFactory<DrivingSchoolViewModel> drivingSchoolFactory;

    @Inject
    public MainViewModelFactory<DrivingSchoolMainViewModel> drivingSchoolMainFactory;

    /* renamed from: drivingSchoolMainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolMainViewModel;

    @Inject
    public MainViewModelFactory<DrivingSchoolQuestsViewModel> drivingSchoolQuestionsFactory;

    /* renamed from: drivingSchoolQuestionsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolQuestionsViewModel;

    /* renamed from: drivingSchoolViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy drivingSchoolViewModel;
    public boolean ifNotInformingAboutDismiss;

    @Nullable
    public DialogEndTest resultDialog;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 37;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolViewModel> getDrivingSchoolFactory() {
        MainViewModelFactory<DrivingSchoolViewModel> mainViewModelFactory = this.drivingSchoolFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolFactory");
        return null;
    }

    public final void setDrivingSchoolFactory(@NotNull MainViewModelFactory<DrivingSchoolViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolFactory = mainViewModelFactory;
    }

    public final DrivingSchoolViewModel getDrivingSchoolViewModel() {
        return (DrivingSchoolViewModel) this.drivingSchoolViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolMainViewModel> getDrivingSchoolMainFactory() {
        MainViewModelFactory<DrivingSchoolMainViewModel> mainViewModelFactory = this.drivingSchoolMainFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolMainFactory");
        return null;
    }

    public final void setDrivingSchoolMainFactory(@NotNull MainViewModelFactory<DrivingSchoolMainViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolMainFactory = mainViewModelFactory;
    }

    public final DrivingSchoolMainViewModel getDrivingSchoolMainViewModel() {
        return (DrivingSchoolMainViewModel) this.drivingSchoolMainViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolClassInfoViewModel> getDrivingSchoolClassInfoFactory() {
        MainViewModelFactory<DrivingSchoolClassInfoViewModel> mainViewModelFactory = this.drivingSchoolClassInfoFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolClassInfoFactory");
        return null;
    }

    public final void setDrivingSchoolClassInfoFactory(@NotNull MainViewModelFactory<DrivingSchoolClassInfoViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolClassInfoFactory = mainViewModelFactory;
    }

    public final DrivingSchoolClassInfoViewModel getDrivingSchoolClassInfoViewModel() {
        return (DrivingSchoolClassInfoViewModel) this.drivingSchoolClassInfoViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<DrivingSchoolQuestsViewModel> getDrivingSchoolQuestionsFactory() {
        MainViewModelFactory<DrivingSchoolQuestsViewModel> mainViewModelFactory = this.drivingSchoolQuestionsFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drivingSchoolQuestionsFactory");
        return null;
    }

    public final void setDrivingSchoolQuestionsFactory(@NotNull MainViewModelFactory<DrivingSchoolQuestsViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.drivingSchoolQuestionsFactory = mainViewModelFactory;
    }

    public final DrivingSchoolQuestsViewModel getDrivingSchoolQuestionsViewModel() {
        return (DrivingSchoolQuestsViewModel) this.drivingSchoolQuestionsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        Integer numValueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        Integer numValueOf2 = json != null ? Integer.valueOf(json.optInt("s")) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                getDrivingSchoolMainViewModel().checkDriverLicenseType(false);
                return;
            } else {
                if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                    replaceFragment(UIClassInfoLayout.class);
                    return;
                }
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                getDrivingSchoolClassInfoViewModel().checkStartTest(false);
                return;
            } else {
                if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                    this.allQuestions = json.optInt(ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY);
                    getDrivingSchoolQuestionsViewModel().setMaxValueOfQuestions(this.allQuestions);
                    replaceFragment(UIQuestions.class);
                    return;
                }
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            DrivingSchoolQuestsViewModel drivingSchoolQuestionsViewModel = getDrivingSchoolQuestionsViewModel();
            drivingSchoolQuestionsViewModel.setCurrentValueOfQuestions(json.optInt("a"));
            drivingSchoolQuestionsViewModel.setQuestionNumber(json.optInt("cq"));
            drivingSchoolQuestionsViewModel.showNewQuest(json.optInt("b"));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            int iOptInt = json.optInt("s");
            int iOptInt2 = json.optInt("cq");
            DialogEndTest dialogEndTest = this.resultDialog;
            if (dialogEndTest != null) {
                dialogEndTest.showResultDialog(iOptInt, iOptInt2, this.allQuestions);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() throws Resources.NotFoundException {
        getDrivingSchoolViewModel();
        getDrivingSchoolClassInfoViewModel();
        DrivingSchoolQuestsViewModel drivingSchoolQuestionsViewModel = getDrivingSchoolQuestionsViewModel();
        String[] stringArray = requireActivity().getResources().getStringArray(R.array.driving_school_all_quests);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        drivingSchoolQuestionsViewModel.initAllQuests(stringArray);
        DrivingSchoolMainViewModel drivingSchoolMainViewModel = getDrivingSchoolMainViewModel();
        JSONObject jsonObj = getJsonObj();
        String[] stringArray2 = requireActivity().getResources().getStringArray(R.array.driver_license_type);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        drivingSchoolMainViewModel.initDriverLicenseType(jsonObj, stringArray2);
        initResultDialog();
        replaceFragment(UIMainLayout.class);
        View drivingSchoolClose = ((DrivingSchoolMainDialogBinding) getBinding()).drivingSchoolClose;
        Intrinsics.checkNotNullExpressionValue(drivingSchoolClose, "drivingSchoolClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, drivingSchoolClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool.initViewsISAMPGUI.1
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
                GUIDrivingSchool.this.closeFragment();
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolMainDialogBinding getViewBinding() {
        DrivingSchoolMainDialogBinding drivingSchoolMainDialogBindingInflate = DrivingSchoolMainDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(drivingSchoolMainDialogBindingInflate, "inflate(...)");
        return drivingSchoolMainDialogBindingInflate;
    }

    public final void initResultDialog() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.resultDialog = new DialogEndTest(fragmentActivityRequireActivity);
        initResultDialogClickListener();
    }

    public final void initResultDialogClickListener() {
        DialogEndTest dialogEndTest = this.resultDialog;
        if (dialogEndTest == null) {
            return;
        }
        dialogEndTest.setResultDialogClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool.initResultDialogClickListener.1
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
                GUIDrivingSchool.this.sendToServerClickButton(5);
                GUIDrivingSchool.this.closeFragment();
            }
        });
    }

    public final void sendToServerClickButton(int type) throws JSONException {
        getDrivingSchoolViewModel().pressButton(type);
        if (type == 5) {
            this.ifNotInformingAboutDismiss = true;
            closeFragment();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void replaceFragment(Class<? extends Fragment> fragment) {
        getChildFragmentManager().beginTransaction().replace(((DrivingSchoolMainDialogBinding) getBinding()).drivingSchoolMainContainer.getId(), fragment, (Bundle) null).commit();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        if (!this.ifNotInformingAboutDismiss) {
            getDrivingSchoolViewModel().pressButton(0);
        }
        closePopupWindows();
        setNullableParameters();
        super.onDestroyView();
    }

    public final void closePopupWindows() {
        DialogEndTest dialogEndTest = this.resultDialog;
        if (dialogEndTest != null) {
            dialogEndTest.dismiss();
        }
    }

    private final void setNullableParameters() {
        this.resultDialog = null;
    }

    public GUIDrivingSchool() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getDrivingSchoolFactory();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$1
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
        this.drivingSchoolViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$3
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolMainViewModel$2
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
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolMainViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getDrivingSchoolMainFactory();
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$5
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
        this.drivingSchoolMainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$7
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
        final Function0<ViewModelStoreOwner> function06 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolClassInfoViewModel$2
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
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolClassInfoViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getDrivingSchoolClassInfoFactory();
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$9
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function06.invoke();
            }
        });
        this.drivingSchoolClassInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolClassInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function08 = function03;
                if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function07);
        final Function0<ViewModelStoreOwner> function08 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolQuestionsViewModel$2
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
        Function0<ViewModelProvider.Factory> function09 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$drivingSchoolQuestionsViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getDrivingSchoolQuestionsFactory();
            }
        };
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function08.invoke();
            }
        });
        this.drivingSchoolQuestionsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolQuestsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$14
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.GUIDrivingSchool$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function010 = function03;
                if (function010 != null && (creationExtras = (CreationExtras) function010.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function09);
    }
}

