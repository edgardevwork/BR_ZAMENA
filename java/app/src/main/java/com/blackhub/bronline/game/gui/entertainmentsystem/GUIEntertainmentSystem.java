package com.blackhub.bronline.game.gui.entertainmentsystem;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
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
import com.blackhub.bronline.databinding.EntertainmentSystemMainBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.DialogGameInfo;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.UIGamesLayout;
import com.blackhub.bronline.game.gui.entertainmentsystem.p014ui.UIPlayersTop;
import com.blackhub.bronline.game.gui.entertainmentsystem.utils.EntertainmentConstants;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIEntertainmentSystem.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIEntertainmentSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIEntertainmentSystem.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/GUIEntertainmentSystem\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,177:1\n106#2,15:178\n*S KotlinDebug\n*F\n+ 1 GUIEntertainmentSystem.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/GUIEntertainmentSystem\n*L\n44#1:178,15\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIEntertainmentSystem extends BaseISAMPGUIFragment<EntertainmentSystemMainBinding> {

    @Nullable
    public DialogGameInfo dialogGameInfo;

    @Inject
    public MainViewModelFactory<EntertainmentGamesViewModel> gamesFactory;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;
    public boolean isThePlayerClosed;
    public static final int $stable = 8;

    @NotNull
    public static final List<Integer> resourcesList = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.img_battleground), Integer.valueOf(R.drawable.img_rubilovo), Integer.valueOf(R.drawable.img_flatout), Integer.valueOf(R.drawable.img_tank), Integer.valueOf(R.drawable.img_guns), Integer.valueOf(R.drawable.img_rice)});

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 42;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @NotNull
    public final MainViewModelFactory<EntertainmentGamesViewModel> getGamesFactory() {
        MainViewModelFactory<EntertainmentGamesViewModel> mainViewModelFactory = this.gamesFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gamesFactory");
        return null;
    }

    public final void setGamesFactory(@NotNull MainViewModelFactory<EntertainmentGamesViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.gamesFactory = mainViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        if (json != null) {
            getGamesViewModel().onPacketIncoming(json);
        }
        Integer numValueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (numValueOf != null && numValueOf.intValue() == 3) {
            this.isThePlayerClosed = false;
            closeFragment();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() throws Resources.NotFoundException {
        getGamesViewModel();
        addAllData(getJsonObj());
        setObservers();
        initDialogGameInfo();
        initClickListeners();
        replaceFragment(UIGamesLayout.class);
    }

    public final void addAllData(JSONObject json) throws Resources.NotFoundException {
        EntertainmentGamesViewModel gamesViewModel = getGamesViewModel();
        JSONArray jSONArrayOptJSONArray = json != null ? json.optJSONArray("ps") : null;
        String[] stringArray = requireActivity().getResources().getStringArray(R.array.entertainment_system_all_games);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = requireActivity().getResources().getStringArray(R.array.entertainment_system_all_descriptions);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        gamesViewModel.initGamesList(jSONArrayOptJSONArray, stringArray, stringArray2, resourcesList);
        gamesViewModel.setPlayersNick(json != null ? json.optString(EntertainmentConstants.KEY_GET_ARR_WITH_CURRENT_TOP_NICK) : null);
    }

    /* compiled from: GUIEntertainmentSystem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$setObservers$1", m7120f = "GUIEntertainmentSystem.kt", m7121i = {}, m7122l = {90}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$setObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C39911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39911(Continuation<? super C39911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIEntertainmentSystem.this.new C39911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsVisibleButtonInfo = GUIEntertainmentSystem.this.getGamesViewModel().isVisibleButtonInfo();
                final GUIEntertainmentSystem gUIEntertainmentSystem = GUIEntertainmentSystem.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            gUIEntertainmentSystem.setVisibleForButtonInfo(0);
                        } else {
                            gUIEntertainmentSystem.setVisibleForButtonInfo(4);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowIsVisibleButtonInfo.collect(flowCollector, this) == coroutine_suspended) {
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
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C39911(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleForButtonInfo(int visibleValue) {
        ((EntertainmentSystemMainBinding) getBinding()).buttonInfo.setVisibility(visibleValue);
    }

    public final void initDialogGameInfo() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dialogGameInfo = new DialogGameInfo(fragmentActivityRequireActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickListeners() {
        EntertainmentSystemMainBinding entertainmentSystemMainBinding = (EntertainmentSystemMainBinding) getBinding();
        AppCompatButton buttonClose = entertainmentSystemMainBinding.buttonClose;
        Intrinsics.checkNotNullExpressionValue(buttonClose, "buttonClose");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonClose, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$1
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
                this.this$0.closeFragment();
            }
        }, 1, null);
        AppCompatButton buttonBack = entertainmentSystemMainBinding.buttonBack;
        Intrinsics.checkNotNullExpressionValue(buttonBack, "buttonBack");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonBack, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$2
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
                this.this$0.replaceFragment(UIGamesLayout.class);
                this.this$0.setVisibleForButtonBack(4);
                this.this$0.getGamesViewModel().setVisibleButtonInfo(true);
            }
        }, 1, null);
        AppCompatButton buttonInfo = entertainmentSystemMainBinding.buttonInfo;
        Intrinsics.checkNotNullExpressionValue(buttonInfo, "buttonInfo");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonInfo, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$3
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
                DialogGameInfo dialogGameInfo = this.this$0.dialogGameInfo;
                if (dialogGameInfo != null) {
                    GUIEntertainmentSystem gUIEntertainmentSystem = this.this$0;
                    if (dialogGameInfo.isVisible()) {
                        return;
                    }
                    dialogGameInfo.show(gUIEntertainmentSystem.getChildFragmentManager(), GUIEntertainmentSystemKt.DIALOG_INFO_TAG);
                }
            }
        }, 1, null);
        AppCompatImageButton buttonTop = entertainmentSystemMainBinding.buttonTop;
        Intrinsics.checkNotNullExpressionValue(buttonTop, "buttonTop");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonTop, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$initClickListeners$1$4
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
                this.this$0.replaceFragment(UIPlayersTop.class);
                this.this$0.setVisibleForButtonBack(0);
                this.this$0.getGamesViewModel().sendPressButton(4);
                this.this$0.getGamesViewModel().setVisibleButtonInfo(false);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemMainBinding getViewBinding() {
        EntertainmentSystemMainBinding entertainmentSystemMainBindingInflate = EntertainmentSystemMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(entertainmentSystemMainBindingInflate, "inflate(...)");
        return entertainmentSystemMainBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void replaceFragment(Class<? extends Fragment> fragment) {
        getChildFragmentManager().beginTransaction().replace(((EntertainmentSystemMainBinding) getBinding()).myContainer.getId(), fragment, (Bundle) null).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setVisibleForButtonBack(int visibleValue) {
        ((EntertainmentSystemMainBinding) getBinding()).buttonBack.setVisibility(visibleValue);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        if (this.isThePlayerClosed) {
            getGamesViewModel().sendPressButton(3);
        }
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.dialogGameInfo = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    public GUIEntertainmentSystem() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$gamesViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$gamesViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getGamesFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$special$$inlined$viewModels$default$1
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
        this.gamesViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EntertainmentGamesViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem$special$$inlined$viewModels$default$3
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
        this.isThePlayerClosed = true;
    }
}

