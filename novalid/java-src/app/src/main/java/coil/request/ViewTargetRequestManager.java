package coil.request;

import android.view.View;
import androidx.annotation.MainThread;
import coil.util.Utils;
import com.caverock.androidsvg.SVG;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTargetRequestManager.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0003H\u0017J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0003H\u0017J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", SVG.View.NODE_NAME, "Landroid/view/View;", "(Landroid/view/View;)V", "currentDisposable", "Lcoil/request/ViewTargetDisposable;", "currentRequest", "Lcoil/request/ViewTargetRequestDelegate;", "isRestart", "", "pendingClear", "Lkotlinx/coroutines/Job;", "dispose", "", "getDisposable", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "getResult", "isDisposed", "disposable", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "setRequest", "request", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nViewTargetRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTargetRequestManager.kt\ncoil/request/ViewTargetRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    @Nullable
    public ViewTargetDisposable currentDisposable;

    @Nullable
    public ViewTargetRequestDelegate currentRequest;
    public boolean isRestart;

    @Nullable
    public Job pendingClear;

    @NotNull
    public final View view;

    public ViewTargetRequestManager(@NotNull View view) {
        this.view = view;
    }

    public final synchronized boolean isDisposed(@NotNull ViewTargetDisposable disposable) {
        return disposable != this.currentDisposable;
    }

    @NotNull
    public final synchronized ViewTargetDisposable getDisposable(@NotNull Deferred<? extends ImageResult> job) {
        ViewTargetDisposable viewTargetDisposable = this.currentDisposable;
        if (viewTargetDisposable != null && Utils.isMainThread() && this.isRestart) {
            this.isRestart = false;
            viewTargetDisposable.setJob(job);
            return viewTargetDisposable;
        }
        Job job2 = this.pendingClear;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.pendingClear = null;
        ViewTargetDisposable viewTargetDisposable2 = new ViewTargetDisposable(this.view, job);
        this.currentDisposable = viewTargetDisposable2;
        return viewTargetDisposable2;
    }

    /* compiled from: ViewTargetRequestManager.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.request.ViewTargetRequestManager$dispose$1", m7120f = "ViewTargetRequestManager.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: coil.request.ViewTargetRequestManager$dispose$1 */
    /* loaded from: classes.dex */
    public static final class C34181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C34181(Continuation<? super C34181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ViewTargetRequestManager.this.new C34181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ViewTargetRequestManager.this.setRequest(null);
            return Unit.INSTANCE;
        }
    }

    public final synchronized void dispose() {
        try {
            Job job = this.pendingClear;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.pendingClear = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new C34181(null), 2, null);
            this.currentDisposable = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final synchronized ImageResult getResult() {
        ViewTargetDisposable viewTargetDisposable;
        Deferred<ImageResult> job;
        viewTargetDisposable = this.currentDisposable;
        return (viewTargetDisposable == null || (job = viewTargetDisposable.getJob()) == null) ? null : (ImageResult) Utils.getCompletedOrNull(job);
    }

    @MainThread
    public final void setRequest(@Nullable ViewTargetRequestDelegate request) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewAttachedToWindow(@NotNull View v) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.isRestart = true;
        viewTargetRequestDelegate.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewDetachedFromWindow(@NotNull View v) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }
}
