package coil.request;

import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageRequest.kt */
@Metadata(m7104d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¨\u0006\f"}, m7105d2 = {"coil/request/ImageRequest$Builder$listener$5", "Lcoil/request/ImageRequest$Listener;", "onCancel", "", "request", "Lcoil/request/ImageRequest;", "onError", "result", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 176)
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n*L\n1#1,1057:1\n*E\n"})
/* loaded from: classes.dex */
public final class ImageRequest$Builder$listener$5 implements ImageRequest.Listener {
    public final /* synthetic */ Function1<ImageRequest, Unit> $onCancel;
    public final /* synthetic */ Function2<ImageRequest, ErrorResult, Unit> $onError;
    public final /* synthetic */ Function1<ImageRequest, Unit> $onStart;
    public final /* synthetic */ Function2<ImageRequest, SuccessResult, Unit> $onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest$Builder$listener$5(Function1<? super ImageRequest, Unit> function1, Function1<? super ImageRequest, Unit> function12, Function2<? super ImageRequest, ? super ErrorResult, Unit> function2, Function2<? super ImageRequest, ? super SuccessResult, Unit> function22) {
        this.$onStart = function1;
        this.$onCancel = function12;
        this.$onError = function2;
        this.$onSuccess = function22;
    }

    @Override // coil.request.ImageRequest.Listener
    public void onStart(@NotNull ImageRequest request) {
        this.$onStart.invoke(request);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onCancel(@NotNull ImageRequest request) {
        this.$onCancel.invoke(request);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
        this.$onError.invoke(request, result);
    }

    @Override // coil.request.ImageRequest.Listener
    public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
        this.$onSuccess.invoke(request, result);
    }
}
