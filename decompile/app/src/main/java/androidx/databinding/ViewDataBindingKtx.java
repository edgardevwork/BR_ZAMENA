package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewDataBindingKtx.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "()V", "CREATE_STATE_FLOW_LISTENER", "Landroidx/databinding/CreateWeakListener;", "updateStateFlowRegistration", "", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "localFieldId", "", "observable", "Lkotlinx/coroutines/flow/Flow;", "StateFlowListener", "databindingKtx_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx {

    @NotNull
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();

    @NotNull
    public static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBindingKtx$$ExternalSyntheticLambda0
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i, referenceQueue);
        }
    };

    public static final WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        Intrinsics.checkNotNull(referenceQueue);
        return new StateFlowListener(viewDataBinding, i, referenceQueue).getListener();
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@NotNull ViewDataBinding viewDataBinding, int localFieldId, @Nullable Flow<?> observable) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(localFieldId, observable, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }

    /* compiled from: ViewDataBindingKtx.kt */
    @Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0016\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Lkotlinx/coroutines/flow/Flow;", "", "binder", "Landroidx/databinding/ViewDataBinding;", "localFieldId", "", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "_lifecycleOwnerRef", "Ljava/lang/ref/WeakReference;", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/databinding/WeakListener;", "observerJob", "Lkotlinx/coroutines/Job;", "addListener", "", "target", "getListener", "removeListener", "setLifecycleOwner", "lifecycleOwner", "startCollection", "owner", "flow", "databindingKtx_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public static final class StateFlowListener implements ObservableReference<Flow<? extends Object>> {

        @Nullable
        public WeakReference<LifecycleOwner> _lifecycleOwnerRef;

        @NotNull
        public final WeakListener<Flow<Object>> listener;

        @Nullable
        public Job observerJob;

        public StateFlowListener(@Nullable ViewDataBinding viewDataBinding, int i, @NotNull ReferenceQueue<ViewDataBinding> referenceQueue) {
            Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        @NotNull
        public WeakListener<Flow<? extends Object>> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(@Nullable Flow<? extends Object> target) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || target == null) {
                return;
            }
            startCollection(lifecycleOwner, target);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(@Nullable Flow<? extends Object> target) {
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observerJob = null;
        }

        public final void startCollection(LifecycleOwner owner, Flow<? extends Object> flow) {
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observerJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(owner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(owner, flow, this, null), 3, null);
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            Job job = this.observerJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            Flow<? extends Object> flow = (Flow) this.listener.getTarget();
            if (flow != null) {
                startCollection(lifecycleOwner, flow);
            }
        }
    }
}
