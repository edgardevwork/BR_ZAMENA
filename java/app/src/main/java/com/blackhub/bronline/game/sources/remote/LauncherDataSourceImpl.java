package com.blackhub.bronline.game.sources.remote;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.model.remote.response.app.AppConfigResponse;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
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

/* compiled from: LauncherDataSourceImpl.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class LauncherDataSourceImpl implements LauncherDataSource {
    public static final int $stable = 8;

    @NotNull
    public final Api apiService;

    @NotNull
    public final CoroutineDispatcher ioDispatcher;

    /* compiled from: LauncherDataSourceImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl", m7120f = "LauncherDataSourceImpl.kt", m7121i = {}, m7122l = {36}, m7123m = "getAppConfigResponse", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl$getAppConfigResponse$1 */
    public static final class C47391 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C47391(Continuation<? super C47391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LauncherDataSourceImpl.this.getAppConfigResponse(this);
        }
    }

    /* compiled from: LauncherDataSourceImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl", m7120f = "LauncherDataSourceImpl.kt", m7121i = {}, m7122l = {23}, m7123m = "getRemoteAppVersion", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl$getRemoteAppVersion$1 */
    public static final class C47411 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C47411(Continuation<? super C47411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LauncherDataSourceImpl.this.getRemoteAppVersion(this);
        }
    }

    @Inject
    public LauncherDataSourceImpl(@NotNull Api apiService, @IoDispatcher @NotNull CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.apiService = apiService;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.blackhub.bronline.game.sources.remote.LauncherDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRemoteAppVersion(@NotNull Continuation<? super Response<AppVersionResponse>> continuation) throws Throwable {
        C47411 c47411;
        if (continuation instanceof C47411) {
            c47411 = (C47411) continuation;
            int i = c47411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47411.label = i - Integer.MIN_VALUE;
            } else {
                c47411 = new C47411(continuation);
            }
        }
        Object objWithContext = c47411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c47411.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
                C47422 c47422 = new C47422(null);
                c47411.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, c47422, c47411);
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

    /* compiled from: LauncherDataSourceImpl.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl$getRemoteAppVersion$2", m7120f = "LauncherDataSourceImpl.kt", m7121i = {}, m7122l = {24}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl$getRemoteAppVersion$2 */

    public static final class C47422 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<AppVersionResponse>>, Object> {
        public int label;

        public C47422(Continuation<? super C47422> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LauncherDataSourceImpl.this.new C47422(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<AppVersionResponse>> continuation) {
            return ((C47422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Api api = LauncherDataSourceImpl.this.apiService;
                this.label = 1;
                obj = api.getRemoteAppVersion(this);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.blackhub.bronline.game.sources.remote.LauncherDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAppConfigResponse(@NotNull Continuation<? super Response<AppConfigResponse>> continuation) throws Throwable {
        C47391 c47391;
        if (continuation instanceof C47391) {
            c47391 = (C47391) continuation;
            int i = c47391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47391.label = i - Integer.MIN_VALUE;
            } else {
                c47391 = new C47391(continuation);
            }
        }
        Object objWithContext = c47391.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c47391.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
                C47402 c47402 = new C47402(null);
                c47391.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, c47402, c47391);
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

    /* compiled from: LauncherDataSourceImpl.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/app/AppConfigResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl$getAppConfigResponse$2", m7120f = "LauncherDataSourceImpl.kt", m7121i = {}, m7122l = {37}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl$getAppConfigResponse$2 */

    public static final class C47402 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<AppConfigResponse>>, Object> {
        public int label;

        public C47402(Continuation<? super C47402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LauncherDataSourceImpl.this.new C47402(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<AppConfigResponse>> continuation) {
            return ((C47402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Api api = LauncherDataSourceImpl.this.apiService;
                this.label = 1;
                obj = api.getAppConfig(this);
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

