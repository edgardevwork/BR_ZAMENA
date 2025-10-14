package com.blackhub.bronline.game.common;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStateManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.dialog.FullScreenLoaderDialog;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFragmentWithState.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseFragmentWithState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragmentWithState.kt\ncom/blackhub/bronline/game/common/BaseFragmentWithState\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,205:1\n215#2,2:206\n*S KotlinDebug\n*F\n+ 1 BaseFragmentWithState.kt\ncom/blackhub/bronline/game/common/BaseFragmentWithState\n*L\n201#1:206,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseFragmentWithState<UiState extends UiState, ViewModel extends BaseViewModel<UiState>, ViewBinding extends ViewDataBinding> extends Fragment {
    public static final int LOADER_ELECTRIC_COLLECT_SCHEME_ID = 3;
    public static final int LOADER_ELECTRIC_FIND_PROBLEM_ID = 4;
    public static final int LOADER_ELECTRIC_ID = 2;
    public static final int LOADER_ELECTRIC_SUM_CONTACTS_ID = 6;

    @Nullable
    public ViewBinding _binding;
    public final int contentLayoutId;
    public static final int $stable = 8;
    public final int viewModelBRId = 2;

    /* renamed from: anim$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy anim = LazyKt__LazyJVMKt.lazy(new Function0<Animation>(this) { // from class: com.blackhub.bronline.game.common.BaseFragmentWithState$anim$2
        public final /* synthetic */ BaseFragmentWithState<UiState, ViewModel, ViewBinding> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.button_click);
        }
    });

    @NotNull
    public Map<Integer, FullScreenLoaderDialog> blockingLoaders = new LinkedHashMap();

    @NotNull
    public abstract ViewModel getViewModel();

    public abstract void handleUiState(@NotNull UiState uiState);

    public void initBinding(@NotNull ViewBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    public void initViews() {
    }

    public BaseFragmentWithState(@LayoutRes int i) {
        this.contentLayoutId = i;
    }

    public int getContentLayoutId() {
        return this.contentLayoutId;
    }

    @NotNull
    public final ViewBinding getBinding() {
        ViewBinding viewbinding = this._binding;
        if (viewbinding != null) {
            return viewbinding;
        }
        throw new NullPointerException("Binding is null in " + Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + ". Accessing binding before onCreateView or after onDestroyView?");
    }

    @NotNull
    public final Animation getAnim() {
        Object value = this.anim.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animation) value;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setUiStateFlowCollect();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return setupBindingView(viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onViewCreated()");
        initViews();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onPause()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onStop()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onResume()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        dismissLoaders();
        getAnim().cancel();
        getAnim().reset();
        super.onDestroyView();
        ViewBinding viewbinding = this._binding;
        UtilsKt.crashlyticsLog((viewbinding != null ? viewbinding.getClass() : null) + " onDestroyView()");
        this._binding = null;
    }

    public static /* synthetic */ void openOrDismissBlockingLoader$default(BaseFragmentWithState baseFragmentWithState, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrDismissBlockingLoader");
        }
        baseFragmentWithState.openOrDismissBlockingLoader(i, z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6);
    }

    public final void openOrDismissBlockingLoader(int id, boolean show, boolean isProgressAnimate, boolean isFlipAnimation, boolean isCancellable, @Nullable String loaderText, boolean isTransparentBack, boolean isLightTheme) {
        dismissLoader(id);
        if (show) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            FullScreenLoaderDialog.Builder flipAnimation = new FullScreenLoaderDialog.Builder(contextRequireContext, isTransparentBack, isLightTheme).setCancelable(isCancellable).setProgressAnimate(isProgressAnimate).setFlipAnimation(isFlipAnimation);
            if (loaderText != null) {
                flipAnimation.setTitleText(loaderText);
            }
            FullScreenLoaderDialog fullScreenLoaderDialogShow = flipAnimation.show();
            this.blockingLoaders.put(Integer.valueOf(id), fullScreenLoaderDialogShow);
        }
    }

    public static /* synthetic */ void openOrDismissBlockingLoaderOnce$default(BaseFragmentWithState baseFragmentWithState, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openOrDismissBlockingLoaderOnce");
        }
        baseFragmentWithState.openOrDismissBlockingLoaderOnce(i, z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6);
    }

    public final void openOrDismissBlockingLoaderOnce(int id, boolean show, boolean isProgressAnimate, boolean isFlipAnimation, boolean isCancellable, @Nullable String loaderText, boolean isTransparentBack, boolean isLightTheme) {
        FullScreenLoaderDialog fullScreenLoaderDialog = this.blockingLoaders.get(Integer.valueOf(id));
        if (!show || fullScreenLoaderDialog == null) {
            openOrDismissBlockingLoader(id, show, isProgressAnimate, isFlipAnimation, isCancellable, loaderText, isTransparentBack, isLightTheme);
        } else {
            dismissLoader(id);
        }
    }

    private final void dismissLoader(int id) {
        FullScreenLoaderDialog fullScreenLoaderDialogRemove = this.blockingLoaders.remove(Integer.valueOf(id));
        if (fullScreenLoaderDialogRemove != null) {
            fullScreenLoaderDialogRemove.dismiss();
        }
    }

    public final View setupBindingView(ViewGroup viewGroup) {
        ViewBinding viewbinding = (ViewBinding) DataBindingUtil.inflate(getLayoutInflater(), getContentLayoutId(), viewGroup, false);
        viewbinding.setLifecycleOwner(getViewLifecycleOwner());
        viewbinding.setVariable(this.viewModelBRId, getViewModel());
        this._binding = viewbinding;
        viewbinding.executePendingBindings();
        Intrinsics.checkNotNull(viewbinding);
        initBinding(viewbinding);
        ViewBinding viewbinding2 = this._binding;
        UtilsKt.crashlyticsLog((viewbinding2 != null ? viewbinding2.getClass() : null) + " onCreateView()");
        View root = viewbinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* compiled from: BaseFragmentWithState.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007*\u00020\bH\u008a@"}, m7105d2 = {"<anonymous>", "", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.common.BaseFragmentWithState$setUiStateFlowCollect$1", m7120f = "BaseFragmentWithState.kt", m7121i = {}, m7122l = {194}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.common.BaseFragmentWithState$setUiStateFlowCollect$1 */
    /* loaded from: classes3.dex */
    public static final class C34951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ BaseFragmentWithState<UiState, ViewModel, ViewBinding> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34951(BaseFragmentWithState<UiState, ViewModel, ViewBinding> baseFragmentWithState, Continuation<? super C34951> continuation) {
            super(2, continuation);
            this.this$0 = baseFragmentWithState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C34951(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<UiState> uiState = this.this$0.getViewModel().getUiState();
                Lifecycle lifecycle = this.this$0.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(uiState, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.common.BaseFragmentWithState.setUiStateFlowCollect.1.1
                    public final /* synthetic */ BaseFragmentWithState<UiState, ViewModel, ViewBinding> this$0;

                    public AnonymousClass1(BaseFragmentWithState<UiState, ViewModel, ViewBinding> baseFragmentWithState) {
                        baseFragmentWithState = baseFragmentWithState;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AnonymousClass1<T>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull UiState uistate, @NotNull Continuation<? super Unit> continuation) {
                        baseFragmentWithState.handleUiState(uistate);
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

        /* compiled from: BaseFragmentWithState.kt */
        @Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\b\b\u0002\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\t\u0010\n"}, m7105d2 = {"<anonymous>", "", "UiState", "Lcom/blackhub/bronline/game/common/UiState;", "ViewModel", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "it", "emit", "(Lcom/blackhub/bronline/game/common/UiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.common.BaseFragmentWithState$setUiStateFlowCollect$1$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ BaseFragmentWithState<UiState, ViewModel, ViewBinding> this$0;

            public AnonymousClass1(BaseFragmentWithState<UiState, ViewModel, ViewBinding> baseFragmentWithState) {
                baseFragmentWithState = baseFragmentWithState;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((AnonymousClass1<T>) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull UiState uistate, @NotNull Continuation<? super Unit> continuation) {
                baseFragmentWithState.handleUiState(uistate);
                return Unit.INSTANCE;
            }
        }
    }

    private final void setUiStateFlowCollect() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34951(this, null), 3, null);
    }

    private final void dismissLoaders() {
        Iterator<Map.Entry<Integer, FullScreenLoaderDialog>> it = this.blockingLoaders.entrySet().iterator();
        while (it.hasNext()) {
            dismissLoader(it.next().getKey().intValue());
        }
    }
}

