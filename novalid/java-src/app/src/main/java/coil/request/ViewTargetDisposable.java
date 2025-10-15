package coil.request;

import android.view.View;
import coil.util.Utils;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* compiled from: Disposable.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Lcoil/request/ViewTargetDisposable;", "Lcoil/request/Disposable;", SVG.View.NODE_NAME, "Landroid/view/View;", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "isDisposed", "", "()Z", "getJob", "()Lkotlinx/coroutines/Deferred;", "setJob", "(Lkotlinx/coroutines/Deferred;)V", "dispose", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ViewTargetDisposable implements Disposable {

    @NotNull
    public volatile Deferred<? extends ImageResult> job;

    @NotNull
    public final View view;

    public ViewTargetDisposable(@NotNull View view, @NotNull Deferred<? extends ImageResult> deferred) {
        this.view = view;
        this.job = deferred;
    }

    @Override // coil.request.Disposable
    @NotNull
    public Deferred<ImageResult> getJob() {
        return this.job;
    }

    public void setJob(@NotNull Deferred<? extends ImageResult> deferred) {
        this.job = deferred;
    }

    @Override // coil.request.Disposable
    public boolean isDisposed() {
        return Utils.getRequestManager(this.view).isDisposed(this);
    }

    @Override // coil.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        Utils.getRequestManager(this.view).dispose();
    }
}
