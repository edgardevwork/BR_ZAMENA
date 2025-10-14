package com.blackhub.bronline.launcher.download;

import com.blackhub.bronline.BuildConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.Sender;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import okhttp3.Credentials;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadWorker.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker$client$2$1$1", m7120f = "DownloadWorker.kt", m7121i = {}, m7122l = {98}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
/* loaded from: classes8.dex */
public final class DownloadWorker$client$2$1$1 extends SuspendLambda implements Function3<Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public DownloadWorker$client$2$1$1(Continuation<? super DownloadWorker$client$2$1$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull Sender sender, @NotNull HttpRequestBuilder httpRequestBuilder, @Nullable Continuation<? super HttpClientCall> continuation) {
        DownloadWorker$client$2$1$1 downloadWorker$client$2$1$1 = new DownloadWorker$client$2$1$1(continuation);
        downloadWorker$client$2$1$1.L$0 = sender;
        downloadWorker$client$2$1$1.L$1 = httpRequestBuilder;
        return downloadWorker$client$2$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Sender sender = (Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            UtilsKt.header(httpRequestBuilder, "Authorization", Credentials.basic$default(BuildConfig.CDN_USERNAME, BuildConfig.CDN_PASSWORD, null, 4, null));
            this.L$0 = null;
            this.label = 1;
            obj = sender.execute(httpRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
