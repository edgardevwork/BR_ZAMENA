package coil.request;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.extractor.text.ttml.TtmlNode;
import coil.ImageLoader;
import coil.target.ViewTarget;
import coil.util.Lifecycles;
import coil.util.Utils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* compiled from: RequestDelegate.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0007J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "imageLoader", "Lcoil/ImageLoader;", "initialRequest", "Lcoil/request/ImageRequest;", "target", "Lcoil/target/ViewTarget;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "job", "Lkotlinx/coroutines/Job;", "(Lcoil/ImageLoader;Lcoil/request/ImageRequest;Lcoil/target/ViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "assertActive", "", "dispose", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "restart", TtmlNode.START, "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate {

    @NotNull
    public final ImageLoader imageLoader;

    @NotNull
    public final ImageRequest initialRequest;

    @NotNull
    public final Job job;

    @NotNull
    public final Lifecycle lifecycle;

    @NotNull
    public final ViewTarget<?> target;

    public ViewTargetRequestDelegate(@NotNull ImageLoader imageLoader, @NotNull ImageRequest imageRequest, @NotNull ViewTarget<?> viewTarget, @NotNull Lifecycle lifecycle, @NotNull Job job) {
        this.imageLoader = imageLoader;
        this.initialRequest = imageRequest;
        this.target = viewTarget;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @MainThread
    public final void restart() {
        this.imageLoader.enqueue(this.initialRequest);
    }

    @Override // coil.request.RequestDelegate
    public void assertActive() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        Utils.getRequestManager(this.target.getView()).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public void start() {
        this.lifecycle.addObserver(this);
        ViewTarget<?> viewTarget = this.target;
        if (viewTarget instanceof LifecycleObserver) {
            Lifecycles.removeAndAddObserver(this.lifecycle, (LifecycleObserver) viewTarget);
        }
        Utils.getRequestManager(this.target.getView()).setRequest(this);
    }

    @Override // coil.request.RequestDelegate
    public void dispose() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        ViewTarget<?> viewTarget = this.target;
        if (viewTarget instanceof LifecycleObserver) {
            this.lifecycle.removeObserver((LifecycleObserver) viewTarget);
        }
        this.lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Utils.getRequestManager(this.target.getView()).dispose();
    }
}
