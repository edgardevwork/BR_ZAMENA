package com.blackhub.bronline.game.gui.chooseserver;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
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
import com.blackhub.bronline.databinding.ServerSelectItemBinding;
import com.blackhub.bronline.databinding.ServerSelectWithLoadProgressBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.legacy.BrChooseServerErrorAlertDialog;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.network.Server;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChooseServerGuiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020/H\u0002J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020/H\u0016J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020/H\u0002J\u0018\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\rH\u0002J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020#H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/ServerSelectWithLoadProgressBinding;", "()V", "_localBinding", "Lcom/blackhub/bronline/databinding/ServerSelectItemBinding;", "fragmentContext", "Landroid/content/Context;", "getFragmentContext", "()Landroid/content/Context;", "fragmentContext$delegate", "Lkotlin/Lazy;", "isFirstInit", "", "jniActivity", "Lcom/blackhub/bronline/game/core/JNIActivity;", "kotlin.jvm.PlatformType", "getJniActivity", "()Lcom/blackhub/bronline/game/core/JNIActivity;", "jniActivity$delegate", "jniActivityViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getJniActivityViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "jniActivityViewModel$delegate", "localBinding", "getLocalBinding", "()Lcom/blackhub/bronline/databinding/ServerSelectItemBinding;", "mGUIManager", "Lcom/blackhub/bronline/game/GUIManager;", "mServers", "", "Lcom/blackhub/bronline/launcher/network/Server;", "mSwitchAfterInitializtion", "mType", "", "percentsOfProgressForNativeLib", "serverIp", "", "serverPort", "stepForProgressLoading", "", "totalValueOfRequests", "valueOfProgressForNativeLib", "getGuiId", "getViewBinding", "initServersView", "", "initUI", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "onDestroy", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "processMyServer", "setObservers", "setProgress", "progress", "isNativeProgress", "setServerIpAndServerPort", FirebaseAnalytics.Param.INDEX, "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChooseServerGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseServerGuiFragment.kt\ncom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,564:1\n106#2,15:565\n1#3:580\n350#4,7:581\n350#4,7:588\n*S KotlinDebug\n*F\n+ 1 ChooseServerGuiFragment.kt\ncom/blackhub/bronline/game/gui/chooseserver/ChooseServerGuiFragment\n*L\n74#1:565,15\n213#1:581,7\n252#1:588,7\n*E\n"})
/* loaded from: classes2.dex */
public final class ChooseServerGuiFragment extends BaseISAMPGUIFragment<ServerSelectWithLoadProgressBinding> {
    public static final int $stable = 8;

    @Nullable
    public ServerSelectItemBinding _localBinding;
    public boolean isFirstInit;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    @Nullable
    public GUIManager mGUIManager;
    public boolean mSwitchAfterInitializtion;
    public int mType;
    public int percentsOfProgressForNativeLib;
    public int serverPort;
    public float stepForProgressLoading;
    public int totalValueOfRequests;
    public int valueOfProgressForNativeLib;

    @NotNull
    public String serverIp = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);

    @NotNull
    public List<Server> mServers = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: fragmentContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fragmentContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$fragmentContext$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Context invoke() {
            return this.this$0.requireContext();
        }
    });

    /* renamed from: jniActivity$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivity = LazyKt__LazyJVMKt.lazy(new Function0<JNIActivity>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$jniActivity$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final JNIActivity invoke() {
            return JNIActivity.getContext();
        }
    });

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 11;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    public ChooseServerGuiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$jniActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return fragmentActivityRequireActivity;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$1
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
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$special$$inlined$viewModels$default$4
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
        this.isFirstInit = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ServerSelectWithLoadProgressBinding access$getBinding(ChooseServerGuiFragment chooseServerGuiFragment) {
        return (ServerSelectWithLoadProgressBinding) chooseServerGuiFragment.getBinding();
    }

    public final Context getFragmentContext() {
        return (Context) this.fragmentContext.getValue();
    }

    public final JNIActivity getJniActivity() {
        return (JNIActivity) this.jniActivity.getValue();
    }

    public final ServerSelectItemBinding getLocalBinding() {
        ServerSelectItemBinding serverSelectItemBinding = this._localBinding;
        if (serverSelectItemBinding != null) {
            return serverSelectItemBinding;
        }
        throw new NullPointerException("ServerSelectItemBinding is not initialized");
    }

    public final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        int iOptInt = json.optInt("t");
        if (iOptInt != 0) {
            if (iOptInt != 1) {
                return;
            }
            getJniActivityViewModel().onNativeInitFinish();
        } else {
            Integer numValueOf = Integer.valueOf(json.optInt("s"));
            if (numValueOf.intValue() >= 100) {
                numValueOf = null;
            }
            setProgress(numValueOf != null ? numValueOf.intValue() : 100, true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.mGUIManager = GUIManager.INSTANCE.getInstance();
        this.mType = Preferences.getInteger(getFragmentContext(), Preferences.USER_SERVER, -1);
        setObservers();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public ServerSelectWithLoadProgressBinding getViewBinding() {
        ServerSelectWithLoadProgressBinding serverSelectWithLoadProgressBindingInflate = ServerSelectWithLoadProgressBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(serverSelectWithLoadProgressBindingInflate, "inflate(...)");
        return serverSelectWithLoadProgressBindingInflate;
    }

    /* compiled from: ChooseServerGuiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$1", m7120f = "ChooseServerGuiFragment.kt", m7121i = {}, m7122l = {150}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$1 */
    /* loaded from: classes.dex */
    public static final class C38271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38271(Continuation<? super C38271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChooseServerGuiFragment.this.new C38271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsNeedRestart = ChooseServerGuiFragment.this.getJniActivityViewModel().isNeedRestart();
                Lifecycle lifecycle = ChooseServerGuiFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(stateFlowIsNeedRestart, lifecycle, Lifecycle.State.STARTED);
                final ChooseServerGuiFragment chooseServerGuiFragment = ChooseServerGuiFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            Context fragmentContext = chooseServerGuiFragment.getFragmentContext();
                            Intrinsics.checkNotNullExpressionValue(fragmentContext, "access$getFragmentContext(...)");
                            new BrChooseServerErrorAlertDialog(fragmentContext).show();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38271(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38282(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38293(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38304(null), 3, null);
        getJniActivityViewModel().getUpdatedServers().observe(this, new ChooseServerGuiFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Server>, Unit>() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.setObservers.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list) {
                invoke2((List<Server>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Server> list) {
                ChooseServerGuiFragment chooseServerGuiFragment = ChooseServerGuiFragment.this;
                Intrinsics.checkNotNull(list);
                chooseServerGuiFragment.mServers = list;
                ChooseServerGuiFragment.this.initUI();
            }
        }));
    }

    /* compiled from: ChooseServerGuiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$2", m7120f = "ChooseServerGuiFragment.kt", m7121i = {}, m7122l = {159}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$2 */
    /* loaded from: classes.dex */
    public static final class C38282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38282(Continuation<? super C38282> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChooseServerGuiFragment.this.new C38282(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsFailedRequest = ChooseServerGuiFragment.this.getJniActivityViewModel().isFailedRequest();
                Lifecycle lifecycle = ChooseServerGuiFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(stateFlowIsFailedRequest, lifecycle, Lifecycle.State.STARTED);
                final ChooseServerGuiFragment chooseServerGuiFragment = ChooseServerGuiFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            ChooseServerGuiFragment.access$getBinding(chooseServerGuiFragment).loadingText.setText(chooseServerGuiFragment.getString(R.string.loading_error_with_reloading));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* compiled from: ChooseServerGuiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$3", m7120f = "ChooseServerGuiFragment.kt", m7121i = {}, m7122l = {167}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$3 */
    /* loaded from: classes.dex */
    public static final class C38293 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38293(Continuation<? super C38293> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChooseServerGuiFragment.this.new C38293(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38293) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> totalSizeOfRequests = ChooseServerGuiFragment.this.getJniActivityViewModel().getTotalSizeOfRequests();
                Lifecycle lifecycle = ChooseServerGuiFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(totalSizeOfRequests, lifecycle, Lifecycle.State.STARTED);
                final ChooseServerGuiFragment chooseServerGuiFragment = ChooseServerGuiFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        if (chooseServerGuiFragment.isFirstInit) {
                            chooseServerGuiFragment.isFirstInit = false;
                            chooseServerGuiFragment.valueOfProgressForNativeLib = 100 - i2;
                            chooseServerGuiFragment.stepForProgressLoading = r4.valueOfProgressForNativeLib / 100;
                        }
                        chooseServerGuiFragment.totalValueOfRequests = i2;
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* compiled from: ChooseServerGuiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4", m7120f = "ChooseServerGuiFragment.kt", m7121i = {}, m7122l = {178}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4 */
    /* loaded from: classes.dex */
    public static final class C38304 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38304(Continuation<? super C38304> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChooseServerGuiFragment.this.new C38304(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38304) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ChooseServerGuiFragment.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "counterOfRequests", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$setObservers$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ ChooseServerGuiFragment this$0;

            public AnonymousClass1(ChooseServerGuiFragment chooseServerGuiFragment) {
                this.this$0 = chooseServerGuiFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                ChooseServerGuiFragment$setObservers$4$1$emit$1 chooseServerGuiFragment$setObservers$4$1$emit$1;
                AnonymousClass1<T> anonymousClass1;
                if (continuation instanceof ChooseServerGuiFragment$setObservers$4$1$emit$1) {
                    chooseServerGuiFragment$setObservers$4$1$emit$1 = (ChooseServerGuiFragment$setObservers$4$1$emit$1) continuation;
                    int i2 = chooseServerGuiFragment$setObservers$4$1$emit$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        chooseServerGuiFragment$setObservers$4$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    } else {
                        chooseServerGuiFragment$setObservers$4$1$emit$1 = new ChooseServerGuiFragment$setObservers$4$1$emit$1(this, continuation);
                    }
                }
                Object obj = chooseServerGuiFragment$setObservers$4$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = chooseServerGuiFragment$setObservers$4$1$emit$1.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (IntExtensionKt.isNotZero(Boxing.boxInt(i))) {
                        this.this$0.setProgress(i, false);
                        if (this.this$0.totalValueOfRequests == i) {
                            chooseServerGuiFragment$setObservers$4$1$emit$1.L$0 = this;
                            chooseServerGuiFragment$setObservers$4$1$emit$1.label = 1;
                            if (DelayKt.delay(500L, chooseServerGuiFragment$setObservers$4$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            anonymousClass1 = this;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anonymousClass1 = (AnonymousClass1) chooseServerGuiFragment$setObservers$4$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
                ChooseServerGuiFragment.access$getBinding(anonymousClass1.this$0).chooseServerRootChoose.setVisibility(0);
                ChooseServerGuiFragment.access$getBinding(anonymousClass1.this$0).chooseServerRootChoose.setAlpha(1.0f);
                ChooseServerGuiFragment.access$getBinding(anonymousClass1.this$0).chooseServerRootLoading.setVisibility(8);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> counterOfRequests = ChooseServerGuiFragment.this.getJniActivityViewModel().getCounterOfRequests();
                Lifecycle lifecycle = ChooseServerGuiFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(counterOfRequests, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ChooseServerGuiFragment.this);
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void processMyServer() {
        if (this.mType >= this.mServers.size()) {
            Iterator<Server> it = this.mServers.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Integer testServerId = it.next().getTestServerId();
                int i2 = this.mType;
                if (testServerId != null && testServerId.intValue() == i2) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() <= -1) {
                numValueOf = null;
            }
            this.mType = IntExtensionKt.getOrZero(numValueOf);
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) this.mServers.get(this.mType).getFirstName(), (CharSequence) "test", false, 2, (Object) null)) {
            ((ServerSelectWithLoadProgressBinding) getBinding()).brServerName.setText(this.mServers.get(this.mType).getFirstName());
            return;
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerName.setText(this.mServers.get(this.mType).getFirstName());
        ((ServerSelectWithLoadProgressBinding) getBinding()).serverListBackColor.getBackground().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(Color.parseColor("#" + this.mServers.get(this.mType).getColor()), BlendModeCompat.SRC_ATOP));
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerProgress.setProgressColor(Color.parseColor("#" + this.mServers.get(this.mType).getColor()));
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerProgress.setProgress((int) ((Double.parseDouble(this.mServers.get(this.mType).getOnline()) / Double.parseDouble(this.mServers.get(this.mType).getMaxOnline())) * ((double) 100)));
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerImage.setColorFilter(Color.parseColor("#" + this.mServers.get(this.mType).getColor()), PorterDuff.Mode.SRC_ATOP);
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerX2.setVisibility(this.mServers.get(this.mType).getX2() ? 0 : 8);
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServerOnline.setText(Useful.INSTANCE.getTextWithHtmlStyles(this.mServers.get(this.mType).getOnline() + "<font color='#808080'>/" + this.mServers.get(this.mType).getMaxOnline()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initUI() {
        if (this.mType >= this.mServers.size() || this.mType < 0) {
            Iterator<Server> it = this.mServers.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Integer testServerId = it.next().getTestServerId();
                int i2 = this.mType;
                if (testServerId != null && testServerId.intValue() == i2) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() <= -1) {
                numValueOf = null;
            }
            this.mType = numValueOf != null ? numValueOf.intValue() : -1;
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).progressBar.setMax(100.0f);
        ((ServerSelectWithLoadProgressBinding) getBinding()).serverMainFrame.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$5(this.f$0, view);
            }
        });
        ((ServerSelectWithLoadProgressBinding) getBinding()).brServersPlay.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                ChooseServerGuiFragment.initUI$lambda$6(this.f$0, view);
            }
        });
        if (this.mType != -1) {
            ((ServerSelectWithLoadProgressBinding) getBinding()).listServersChoose.setAlpha(0.0f);
            ((ServerSelectWithLoadProgressBinding) getBinding()).listServersChoose.setVisibility(8);
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setVisibility(0);
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setAlpha(1.0f);
        } else {
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setAlpha(0.0f);
            ((ServerSelectWithLoadProgressBinding) getBinding()).mainServersChoose.setVisibility(8);
            ((ServerSelectWithLoadProgressBinding) getBinding()).listServersChoose.setVisibility(0);
            ((ServerSelectWithLoadProgressBinding) getBinding()).allServersButton.setVisibility(8);
            ((ServerSelectWithLoadProgressBinding) getBinding()).serversBtnMyServer.setVisibility(8);
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).serversBtnMyServer.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$7(this.f$0, view);
            }
        });
        ((ServerSelectWithLoadProgressBinding) getBinding()).allServersButton.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseServerGuiFragment.initUI$lambda$8(this.f$0, view);
            }
        });
        if (this.mType != -1) {
            processMyServer();
        }
        initServersView();
        if (this.mSwitchAfterInitializtion) {
            ((ServerSelectWithLoadProgressBinding) getBinding()).chooseServerRootChoose.setVisibility(0);
            ((ServerSelectWithLoadProgressBinding) getBinding()).chooseServerRootChoose.setAlpha(1.0f);
            ((ServerSelectWithLoadProgressBinding) getBinding()).chooseServerRootLoading.setVisibility(8);
            this.mSwitchAfterInitializtion = false;
        }
    }

    public static final void initUI$lambda$5(ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
    }

    public static final void initUI$lambda$6(ChooseServerGuiFragment this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        this$0.getJniActivity().sendGetRequest(this$0.mServers.get(this$0.mType).getUrl());
        this$0.setServerIpAndServerPort(this$0.mType);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("b", this$0.mType);
        jSONObject.put("i", this$0.serverIp);
        jSONObject.put("p", this$0.serverPort);
        jSONObject.put("u", this$0.mServers.get(this$0.mType).getUrl());
        if (this$0.mServers.get(this$0.mType).getX2cordx() != null) {
            jSONObject.put("2x", this$0.mServers.get(this$0.mType).getX2cordx());
        }
        if (this$0.mServers.get(this$0.mType).getX2cordy() != null) {
            jSONObject.put("2y", this$0.mServers.get(this$0.mType).getX2cordy());
        }
        GUIManager gUIManager = this$0.mGUIManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(11, jSONObject);
        }
        GUIManager gUIManager2 = this$0.mGUIManager;
        if (gUIManager2 != null) {
            gUIManager2.closeGUI(null, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initUI$lambda$7(final ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        view.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_rectangle_orange_hgr_cr8_1, null));
        ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).allServersButton.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_button_red_unfilled_ss, null));
        if (((ServerSelectWithLoadProgressBinding) this$0.getBinding()).mainServersChoose.getVisibility() != 0) {
            ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).listServersChoose.animate().alpha(0.0f).setDuration(100L).setListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$initUI$5$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    ChooseServerGuiFragment.access$getBinding(this.this$0).listServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).listServersChoose.setVisibility(8);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).mainServersChoose.setVisibility(0);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).mainServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).mainServersChoose.animate().alpha(1.0f).setDuration(100L).setListener(null).start();
                }
            }).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initUI$lambda$8(final ChooseServerGuiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        view.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_rectangle_orange_hgr_cr8_1, null));
        ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).serversBtnMyServer.setBackground(ResourcesCompat.getDrawable(this$0.getResources(), R.drawable.bg_button_red_unfilled_ss, null));
        if (((ServerSelectWithLoadProgressBinding) this$0.getBinding()).listServersChoose.getVisibility() != 0) {
            ((ServerSelectWithLoadProgressBinding) this$0.getBinding()).mainServersChoose.animate().alpha(0.0f).setDuration(100L).setListener(new Animator.AnimatorListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$initUI$6$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    ChooseServerGuiFragment.access$getBinding(this.this$0).mainServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).mainServersChoose.setVisibility(8);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).listServersChoose.setVisibility(0);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).listServersChoose.setAlpha(0.0f);
                    ChooseServerGuiFragment.access$getBinding(this.this$0).listServersChoose.animate().alpha(1.0f).setDuration(100L).setListener(null).start();
                }
            }).start();
        }
    }

    public final void setServerIpAndServerPort(int index) {
        String TEST_SERVER_PORT = Settings.TEST_SERVER_PORT;
        Intrinsics.checkNotNullExpressionValue(TEST_SERVER_PORT, "TEST_SERVER_PORT");
        if (TEST_SERVER_PORT.length() > 0) {
            this.serverIp = "80.66.82.19";
            this.serverPort = Integer.parseInt(Settings.TEST_SERVER_PORT);
        } else {
            this.serverIp = this.mServers.get(index).getIp();
            this.serverPort = Integer.parseInt(this.mServers.get(index).getPort());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public final void initServersView() {
        int i;
        int i2;
        LinearLayout scrollLayoutServers = ((ServerSelectWithLoadProgressBinding) getBinding()).scrollLayoutServers;
        Intrinsics.checkNotNullExpressionValue(scrollLayoutServers, "scrollLayoutServers");
        boolean z = false;
        scrollLayoutServers.setScrollbarFadingEnabled(false);
        scrollLayoutServers.removeAllViews();
        int i3 = 4;
        int size = this.mServers.size() / 4;
        int i4 = size + 1;
        int i5 = 0;
        while (i5 < i4) {
            LinearLayout linearLayout = new LinearLayout(getFragmentContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1 / i4;
            if (i5 < size) {
                Context fragmentContext = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext, "<get-fragmentContext>(...)");
                layoutParams.setMargins(z ? 1 : 0, z ? 1 : 0, z ? 1 : 0, IntExtensionKt.dpToPx(12, fragmentContext));
            }
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(z ? 1 : 0);
            int i6 = z ? 1 : 0;
            ?? r2 = z;
            while (i6 < i3 && (i = (i5 * 4) + i6) < this.mServers.size()) {
                final int size2 = (this.mServers.size() - i) - 1;
                this._localBinding = ServerSelectItemBinding.inflate(getLayoutInflater());
                getLocalBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.chooseserver.ChooseServerGuiFragment$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws JSONException {
                        ChooseServerGuiFragment.initServersView$lambda$9(this.f$0, size2, view);
                    }
                });
                getLocalBinding().brServerName.setText(this.mServers.get(size2).getFirstName());
                Context fragmentContext2 = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext2, "<get-fragmentContext>(...)");
                int iDpToPx = IntExtensionKt.dpToPx(160, fragmentContext2);
                Context fragmentContext3 = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext3, "<get-fragmentContext>(...)");
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iDpToPx, IntExtensionKt.dpToPx(80, fragmentContext3));
                layoutParams2.weight = 0.25f;
                Context fragmentContext4 = getFragmentContext();
                Intrinsics.checkNotNullExpressionValue(fragmentContext4, "<get-fragmentContext>(...)");
                layoutParams2.setMargins(r2, r2, IntExtensionKt.dpToPx(20, fragmentContext4), r2);
                getLocalBinding().getRoot().setLayoutParams(layoutParams2);
                if (getLocalBinding().getRoot().getParent() != null) {
                    ViewParent parent = getLocalBinding().getRoot().getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(getLocalBinding().getRoot());
                }
                if (StringsKt__StringsKt.contains$default(this.mServers.get(size2).getFirstName(), "test", (boolean) r2, 2, (Object) null)) {
                    linearLayout.addView(getLocalBinding().getRoot());
                    i2 = size;
                } else {
                    getLocalBinding().serverListBackColor.getBackground().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(Color.parseColor("#" + this.mServers.get(size2).getColor()), BlendModeCompat.SRC_ATOP));
                    getLocalBinding().brServerProgress.setProgressColor(Color.parseColor("#" + this.mServers.get(size2).getColor()));
                    getLocalBinding().brServerX2.setVisibility(this.mServers.get(size2).getX2() ? r2 : 8);
                    i2 = size;
                    getLocalBinding().brServerProgress.setProgress((int) ((Double.parseDouble(this.mServers.get(size2).getOnline()) / Double.parseDouble(this.mServers.get(size2).getMaxOnline())) * 100));
                    getLocalBinding().brServerImage.setColorFilter(Color.parseColor("#" + this.mServers.get(size2).getColor()), PorterDuff.Mode.SRC_ATOP);
                    getLocalBinding().brServerOnline.setText(Useful.INSTANCE.getTextWithHtmlStyles(this.mServers.get(size2).getOnline() + "<font color='#808080'>/" + this.mServers.get(size2).getMaxOnline()));
                    linearLayout.addView(getLocalBinding().getRoot());
                }
                i6++;
                size = i2;
                r2 = 0;
                i3 = 4;
            }
            int i7 = size;
            if (linearLayout.getParent() != null) {
                ViewParent parent2 = linearLayout.getParent();
                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(linearLayout);
            }
            scrollLayoutServers.addView(linearLayout);
            i5++;
            size = i7;
            z = false;
            i3 = 4;
        }
    }

    public static final void initServersView$lambda$9(ChooseServerGuiFragment this$0, int i, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        view.startAnimation(AnimationUtils.loadAnimation(this$0.getFragmentContext(), R.anim.button_click));
        this$0.getJniActivity().sendGetRequest(this$0.mServers.get(i).getUrl());
        this$0.setServerIpAndServerPort(i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("b", i);
        jSONObject.put("i", this$0.serverIp);
        jSONObject.put("p", this$0.serverPort);
        jSONObject.put("u", this$0.mServers.get(i).getUrl());
        GUIManager gUIManager = this$0.mGUIManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(11, jSONObject);
        }
        Context fragmentContext = this$0.getFragmentContext();
        Integer testServerId = this$0.mServers.get(i).getTestServerId();
        if (testServerId != null) {
            i = testServerId.intValue();
        }
        Preferences.putInteger(fragmentContext, Preferences.USER_SERVER, i);
        GUIManager gUIManager2 = this$0.mGUIManager;
        if (gUIManager2 != null) {
            gUIManager2.closeGUI(null, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setProgress(int progress, boolean isNativeProgress) {
        int iIntValue;
        if (isNativeProgress) {
            progress = (int) (progress * this.stepForProgressLoading);
            this.percentsOfProgressForNativeLib = progress;
            iIntValue = getJniActivityViewModel().getCounterOfRequests().getValue().intValue();
        } else {
            iIntValue = this.percentsOfProgressForNativeLib;
        }
        int i = progress + iIntValue;
        if (i > 100) {
            i = 100;
        }
        ((ServerSelectWithLoadProgressBinding) getBinding()).brLsProgress.setText(getString(R.string.common_value_and_percent, Integer.valueOf(i)));
        ((ServerSelectWithLoadProgressBinding) getBinding()).progressBar.setProgress(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this._localBinding = null;
        this.mGUIManager = null;
        super.onDestroy();
    }
}
