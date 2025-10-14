package com.blackhub.bronline.game.gui.tutorialhints;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FragmentTutorialGuiBinding;
import com.blackhub.bronline.databinding.HintDrivingSchoolBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState;
import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewExtensionKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TutorialGuiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 32\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000fH\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0017H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u00064"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialGuiFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragmentWithState;", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialUiState;", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel;", "Lcom/blackhub/bronline/databinding/FragmentTutorialGuiBinding;", "()V", "additionalQuestAdapter", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialAdapter;", "factory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "isWithAdditionalQuests", "", "mainQuestAdapter", "viewModel", "getViewModel", "()Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getGuiId", "", "handleUiState", "", "uiState", "initAndAttachQuests", "initBinding", "binding", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroy", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "onResume", "prepareView", "avatarNumber", "typeKey", "setInvisibleAdditionalQuestsForDrivingSchool", "setVisibleAdditionalQuests", "ifSetVisible", "setVisibleMainQuestsForDrivingSchool", "isVisible", "setVisibleTextHintForDrivingSchool", "updatePackage", "type", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTutorialGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialGuiFragment.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,320:1\n106#2,15:321\n256#3,2:336\n256#3,2:338\n*S KotlinDebug\n*F\n+ 1 TutorialGuiFragment.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialGuiFragment\n*L\n57#1:321,15\n102#1:336,2\n166#1:338,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TutorialGuiFragment extends BaseISAMPGUIFragmentWithState<TutorialUiState, TutorialViewModel, FragmentTutorialGuiBinding> {
    public static final long ON_CLICK_ANIMATE_DURATION = 500;

    @Nullable
    public TutorialAdapter additionalQuestAdapter;

    @Inject
    public MainViewModelFactory<TutorialViewModel> factory;
    public boolean isWithAdditionalQuests;

    @Nullable
    public TutorialAdapter mainQuestAdapter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;
    public static final int $stable = 8;

    /* compiled from: TutorialGuiFragment.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialEnum.values().length];
            try {
                iArr[TutorialEnum.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 39;
    }

    public TutorialGuiFragment() {
        super(R.layout.fragment_tutorial_gui);
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getFactory();
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TutorialViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentTutorialGuiBinding access$getBinding(TutorialGuiFragment tutorialGuiFragment) {
        return (FragmentTutorialGuiBinding) tutorialGuiFragment.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<TutorialViewModel> getFactory() {
        MainViewModelFactory<TutorialViewModel> mainViewModelFactory = this.factory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("factory");
        return null;
    }

    public final void setFactory(@NotNull MainViewModelFactory<TutorialViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.factory = mainViewModelFactory;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    @NotNull
    public TutorialViewModel getViewModel() {
        return (TutorialViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void initBinding(@NotNull FragmentTutorialGuiBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.initBinding((TutorialGuiFragment) binding);
        ComposeView composeView = binding.cvTutorial;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableSingletons$TutorialGuiFragmentKt.INSTANCE.m14758getLambda2$app_siteRelease());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragmentWithState
    public void initViewsISAMPGUI() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            int iOptInt = jsonObj.optInt("m", 0);
            int iOptInt2 = jsonObj.optInt("t", 0);
            initAndAttachQuests();
            prepareView(iOptInt, iOptInt2);
            getViewModel().initJson(jsonObj);
        }
        FragmentTutorialGuiBinding fragmentTutorialGuiBinding = (FragmentTutorialGuiBinding) getBinding();
        fragmentTutorialGuiBinding.getRoot().setClickable(false);
        fragmentTutorialGuiBinding.getRoot().setFocusable(false);
        LinearLayout blockHintDrivingSchoolTasks = fragmentTutorialGuiBinding.inTutorialHintDrivingSchool.blockHintDrivingSchoolTasks;
        Intrinsics.checkNotNullExpressionValue(blockHintDrivingSchoolTasks, "blockHintDrivingSchoolTasks");
        ViewExtensionKt.setOnDebounceAndAnimateClickListener(blockHintDrivingSchoolTasks, 500L, new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TutorialGuiFragment.initViewsISAMPGUI$lambda$3$lambda$2(this.f$0, view);
            }
        });
    }

    public static final void initViewsISAMPGUI$lambda$3$lambda$2(TutorialGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onClickTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState
    public void handleUiState(@NotNull TutorialUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        View root = ((FragmentTutorialGuiBinding) getBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(uiState.isInterfaceVisible() ? 0 : 8);
        if (uiState.isNeedClose()) {
            closeFragment();
        }
        if (WhenMappings.$EnumSwitchMapping$0[uiState.getHintScreenType().ordinal()] != 1) {
            ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintBottom.textHint.setText(uiState.getHintDesc());
            List<HintQuestData> listListOf = CollectionsKt__CollectionsJVMKt.listOf(uiState.getMainTask());
            TutorialAdapter tutorialAdapter = this.mainQuestAdapter;
            if (tutorialAdapter != null) {
                tutorialAdapter.setQuests(listListOf);
            }
            if (!uiState.getAdditionalTasksList().isEmpty()) {
                this.isWithAdditionalQuests = true;
                TutorialAdapter tutorialAdapter2 = this.additionalQuestAdapter;
                if (tutorialAdapter2 != null) {
                    tutorialAdapter2.setQuests(uiState.getAdditionalTasksList());
                }
            } else {
                this.isWithAdditionalQuests = false;
            }
            setVisibleAdditionalQuests(this.isWithAdditionalQuests);
            ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.tvHintDrivingSchoolInstructor.setText(StringExtensionKt.htmlStringToSpanned(uiState.getHintDesc()));
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            int iOptInt = json.optInt("t", -1);
            int iOptInt2 = json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
            if (json.optInt("c") != 1) {
                if (IntExtensionKt.isZero(Integer.valueOf(iOptInt2))) {
                    updatePackage(iOptInt);
                }
                getViewModel().updateJson(json);
            }
        }
    }

    /* compiled from: TutorialGuiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$newBackPress$1", m7120f = "TutorialGuiFragment.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment$newBackPress$1 */
    public static final class C46861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46861(Continuation<? super C46861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TutorialGuiFragment.this.new C46861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (TutorialGuiFragment.this.getActivity() != null && TutorialGuiFragment.this.isAdded()) {
                int hudVersion = TutorialGuiFragment.this.getViewModel().getHudVersion();
                if (TutorialGuiFragment.access$getBinding(TutorialGuiFragment.this).getRoot().getVisibility() == 0) {
                    TutorialGuiFragment.access$getBinding(TutorialGuiFragment.this).getRoot().setVisibility(8);
                    TutorialGuiFragment.this.getViewModel().setInterfaceVisible(false);
                } else {
                    TutorialGuiFragment.access$getBinding(TutorialGuiFragment.this).getRoot().setVisibility(0);
                    TutorialGuiFragment.this.getViewModel().setInterfaceVisible(true);
                }
                TutorialGuiFragment.this.getViewModel().setNewVersionVisible(hudVersion == 1);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C46861(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseFragmentWithState, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View root = ((FragmentTutorialGuiBinding) getBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(getViewModel().getUiState().getValue().isInterfaceVisible() ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mainQuestAdapter = null;
        this.additionalQuestAdapter = null;
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void prepareView(int avatarNumber, int typeKey) {
        if (avatarNumber == 0) {
            setVisibleTextHintForDrivingSchool(0);
            setVisibleMainQuestsForDrivingSchool(4);
            ImageView imageView = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.ivHintDrivingSchooInstructor;
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.img_instructor);
            return;
        }
        if (avatarNumber == 1) {
            setVisibleTextHintForDrivingSchool(0);
            setVisibleMainQuestsForDrivingSchool(4);
            ImageView imageView2 = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.ivHintDrivingSchooInstructor;
            imageView2.setVisibility(0);
            imageView2.setImageResource(R.drawable.img_uncle_misha);
            return;
        }
        if (avatarNumber != 4) {
            if (avatarNumber != 5) {
                return;
            }
            ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.ivHintDrivingSchooInstructor.setVisibility(4);
            if (typeKey == 3) {
                setVisibleTextHintForDrivingSchool(0);
                setVisibleMainQuestsForDrivingSchool(4);
                return;
            } else {
                if (typeKey != 4) {
                    return;
                }
                setVisibleTextHintForDrivingSchool(4);
                setVisibleMainQuestsForDrivingSchool(0);
                return;
            }
        }
        ImageView imageView3 = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.ivHintDrivingSchooInstructor;
        imageView3.setVisibility(0);
        imageView3.setImageResource(R.drawable.img_mes);
        if (typeKey == 3) {
            setVisibleTextHintForDrivingSchool(0);
            setVisibleMainQuestsForDrivingSchool(4);
        } else {
            if (typeKey != 4) {
                return;
            }
            setVisibleTextHintForDrivingSchool(4);
            setVisibleMainQuestsForDrivingSchool(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleTextHintForDrivingSchool(int isVisible) {
        ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.tvHintDrivingSchoolInstructor.setVisibility(isVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleMainQuestsForDrivingSchool(int isVisible) {
        HintDrivingSchoolBinding hintDrivingSchoolBinding = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool;
        hintDrivingSchoolBinding.tvHintDrivingSchoolMainTitle.setVisibility(isVisible);
        hintDrivingSchoolBinding.rvHintDrivingSchoolMainQuests.setVisibility(isVisible);
        hintDrivingSchoolBinding.underlineHintDrivingSchool.setVisibility(isVisible);
        hintDrivingSchoolBinding.tvHintDrivingSchoolAdditionalTitle.setVisibility(isVisible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initAndAttachQuests() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.mainQuestAdapter = new TutorialAdapter(contextRequireContext);
        this.additionalQuestAdapter = new TutorialAdapter(contextRequireContext);
        HintDrivingSchoolBinding hintDrivingSchoolBinding = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool;
        RecyclerView recyclerView = hintDrivingSchoolBinding.rvHintDrivingSchoolMainQuests;
        recyclerView.setLayoutManager(new LinearLayoutManager(contextRequireContext, 1, false));
        recyclerView.setAdapter(this.mainQuestAdapter);
        RecyclerView recyclerView2 = hintDrivingSchoolBinding.rvHintDrivingSchoolAdditionalQuests;
        recyclerView2.setLayoutManager(new LinearLayoutManager(contextRequireContext, 1, false));
        recyclerView2.setAdapter(this.additionalQuestAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleAdditionalQuests(boolean ifSetVisible) {
        HintDrivingSchoolBinding hintDrivingSchoolBinding = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool;
        if (ifSetVisible) {
            hintDrivingSchoolBinding.tvHintDrivingSchoolAdditionalTitle.setVisibility(0);
            hintDrivingSchoolBinding.rvHintDrivingSchoolAdditionalQuests.setVisibility(0);
            hintDrivingSchoolBinding.rvHintDrivingSchoolMainQuests.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.black_80, null));
            hintDrivingSchoolBinding.underlineHintDrivingSchool.setVisibility(0);
            return;
        }
        hintDrivingSchoolBinding.tvHintDrivingSchoolAdditionalTitle.setVisibility(4);
        hintDrivingSchoolBinding.rvHintDrivingSchoolAdditionalQuests.setVisibility(4);
        hintDrivingSchoolBinding.rvHintDrivingSchoolMainQuests.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.bg_rectangle_gray75_crb10));
        hintDrivingSchoolBinding.underlineHintDrivingSchool.setVisibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updatePackage(int type) {
        if (type == 0) {
            ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool.tvHintDrivingSchoolInstructor.setText(AnyExtensionKt.empty(this));
            setVisibleTextHintForDrivingSchool(0);
            setVisibleMainQuestsForDrivingSchool(4);
            setInvisibleAdditionalQuestsForDrivingSchool();
            return;
        }
        if (type != 3) {
            if (type != 4) {
                return;
            }
            closeFragment();
        } else {
            setVisibleTextHintForDrivingSchool(4);
            setVisibleMainQuestsForDrivingSchool(0);
            setVisibleAdditionalQuests(this.isWithAdditionalQuests);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setInvisibleAdditionalQuestsForDrivingSchool() {
        HintDrivingSchoolBinding hintDrivingSchoolBinding = ((FragmentTutorialGuiBinding) getBinding()).inTutorialHintDrivingSchool;
        hintDrivingSchoolBinding.rvHintDrivingSchoolAdditionalQuests.setVisibility(4);
        hintDrivingSchoolBinding.tvHintDrivingSchoolTextIfWithoutAdditionalQuests.setVisibility(8);
    }
}
