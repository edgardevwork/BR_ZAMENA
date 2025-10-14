package com.blackhub.bronline.game.sources.remote;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.model.remote.response.gifts.GiftsResponse;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.p021di.IoDispatcher;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: GiftsDataSourceImpl.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class GiftsDataSourceImpl implements GiftsDataSource {
    public static final int $stable = 8;

    @NotNull
    public final Api apiService;

    @NotNull
    public final CoroutineDispatcher ioDispatcher;

    /* compiled from: GiftsDataSourceImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl", m7120f = "GiftsDataSourceImpl.kt", m7121i = {}, m7122l = {21}, m7123m = "getGifts", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl$getGifts$1 */
    public static final class C47371 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C47371(Continuation<? super C47371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GiftsDataSourceImpl.this.getGifts(this);
        }
    }

    @Inject
    public GiftsDataSourceImpl(@NotNull Api apiService, @IoDispatcher @NotNull CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.apiService = apiService;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.blackhub.bronline.game.sources.remote.GiftsDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGifts(@NotNull Continuation<? super Response<GiftsResponse>> continuation) throws Throwable {
        C47371 c47371;
        if (continuation instanceof C47371) {
            c47371 = (C47371) continuation;
            int i = c47371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47371.label = i - Integer.MIN_VALUE;
            } else {
                c47371 = new C47371(continuation);
            }
        }
        Object objWithContext = c47371.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c47371.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
                C47382 c47382 = new C47382(null);
                c47371.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, c47382, c47371);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return (Response) objWithContext;
        } catch (Exception e) {
            Response responseError = Response.error(405, ResponseBody.INSTANCE.create(e.toString(), MediaType.INSTANCE.get("application/json")));
            Intrinsics.checkNotNull(responseError);
            return responseError;
        }
    }

    /* compiled from: GiftsDataSourceImpl.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl$getGifts$2", m7120f = "GiftsDataSourceImpl.kt", m7121i = {}, m7122l = {22}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl$getGifts$2 */
    /* loaded from: classes2.dex */
    public static final class C47382 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<GiftsResponse>>, Object> {
        public int label;

        public C47382(Continuation<? super C47382> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftsDataSourceImpl.this.new C47382(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<GiftsResponse>> continuation) {
            return ((C47382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Api api = GiftsDataSourceImpl.this.apiService;
                this.label = 1;
                obj = api.getGifts(this);
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
}

