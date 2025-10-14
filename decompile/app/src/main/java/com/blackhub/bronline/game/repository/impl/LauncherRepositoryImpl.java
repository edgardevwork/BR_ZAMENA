package com.blackhub.bronline.game.repository.impl;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.model.local.AppConfigModel;
import com.blackhub.bronline.game.model.remote.response.app.AppConfigResponse;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
import com.blackhub.bronline.game.repository.LauncherRepository;
import com.blackhub.bronline.game.sources.remote.LauncherDataSource;
import com.blackhub.bronline.launcher.Settings;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* compiled from: LauncherRepositoryImpl.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@¢\u0006\u0002\u0010\u0011R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/repository/impl/LauncherRepositoryImpl;", "Lcom/blackhub/bronline/game/repository/LauncherRepository;", "launcherDataSource", "Lcom/blackhub/bronline/game/sources/remote/LauncherDataSource;", "(Lcom/blackhub/bronline/game/sources/remote/LauncherDataSource;)V", "_appConfig", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/blackhub/bronline/game/model/local/AppConfigModel;", "get_appConfig", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "appConfig", "Lkotlinx/coroutines/flow/StateFlow;", "getAppConfig", "()Lkotlinx/coroutines/flow/StateFlow;", "errorCount", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppConfigResponse", "Lcom/blackhub/bronline/game/model/remote/response/app/AppConfigResponse;", "getRemoteAppVersion", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLauncherRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepositoryImpl.kt\ncom/blackhub/bronline/game/repository/impl/LauncherRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes2.dex */
public final class LauncherRepositoryImpl implements LauncherRepository {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<AppConfigModel> _appConfig;

    @NotNull
    public final StateFlow<AppConfigModel> appConfig;
    public int errorCount;

    @NotNull
    public final LauncherDataSource launcherDataSource;

    /* compiled from: LauncherRepositoryImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl", m7120f = "LauncherRepositoryImpl.kt", m7121i = {0}, m7122l = {37}, m7123m = "getAppConfig", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl$getAppConfig$1 */
    /* loaded from: classes.dex */
    public static final class C47351 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C47351(Continuation<? super C47351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LauncherRepositoryImpl.this.getAppConfig(this);
        }
    }

    /* compiled from: LauncherRepositoryImpl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl", m7120f = "LauncherRepositoryImpl.kt", m7121i = {0, 1, 2}, m7122l = {50, 55, 56}, m7123m = "getAppConfigResponse", m7124n = {"this", "this", "this"}, m7125s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl$getAppConfigResponse$1 */
    /* loaded from: classes.dex */
    public static final class C47361 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C47361(Continuation<? super C47361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LauncherRepositoryImpl.this.getAppConfigResponse(this);
        }
    }

    @Inject
    public LauncherRepositoryImpl(@NotNull LauncherDataSource launcherDataSource) {
        Intrinsics.checkNotNullParameter(launcherDataSource, "launcherDataSource");
        this.launcherDataSource = launcherDataSource;
        this._appConfig = StateFlowKt.MutableStateFlow(null);
        this.appConfig = FlowKt.asStateFlow(get_appConfig());
    }

    @Override // com.blackhub.bronline.game.repository.LauncherRepository
    @NotNull
    public MutableStateFlow<AppConfigModel> get_appConfig() {
        return this._appConfig;
    }

    @Override // com.blackhub.bronline.game.repository.LauncherRepository
    @NotNull
    public StateFlow<AppConfigModel> getAppConfig() {
        return this.appConfig;
    }

    @Override // com.blackhub.bronline.game.repository.LauncherRepository
    @Nullable
    public Object getRemoteAppVersion(@NotNull Continuation<? super Response<AppVersionResponse>> continuation) {
        return this.launcherDataSource.getRemoteAppVersion(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.blackhub.bronline.game.repository.LauncherRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAppConfig(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C47351 c47351;
        LauncherRepositoryImpl launcherRepositoryImpl;
        if (continuation instanceof C47351) {
            c47351 = (C47351) continuation;
            int i = c47351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47351.label = i - Integer.MIN_VALUE;
            } else {
                c47351 = new C47351(continuation);
            }
        }
        Object appConfigResponse = c47351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c47351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(appConfigResponse);
            c47351.L$0 = this;
            c47351.label = 1;
            appConfigResponse = getAppConfigResponse(c47351);
            if (appConfigResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            launcherRepositoryImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            launcherRepositoryImpl = (LauncherRepositoryImpl) c47351.L$0;
            ResultKt.throwOnFailure(appConfigResponse);
        }
        AppConfigResponse appConfigResponse2 = (AppConfigResponse) appConfigResponse;
        Integer versionAndroid = appConfigResponse2 != null ? appConfigResponse2.getVersionAndroid() : null;
        String port = appConfigResponse2 != null ? appConfigResponse2.getPort() : null;
        if (port == null) {
            port = "";
        }
        String testServerPort = UtilsKt.getTestServerPort(versionAndroid, port);
        if (testServerPort == null) {
            testServerPort = "";
        }
        Settings.TEST_SERVER_PORT = testServerPort;
        Integer versionAndroid2 = appConfigResponse2 != null ? appConfigResponse2.getVersionAndroid() : null;
        String cdnUrl = appConfigResponse2 != null ? appConfigResponse2.getCdnUrl() : null;
        Settings.CURRENT_CDN_URL = UtilsKt.getCurrentCDNUrl(versionAndroid2, cdnUrl != null ? cdnUrl : "");
        MutableStateFlow<AppConfigModel> mutableStateFlow = launcherRepositoryImpl.get_appConfig();
        String CURRENT_CDN_URL = Settings.CURRENT_CDN_URL;
        Intrinsics.checkNotNullExpressionValue(CURRENT_CDN_URL, "CURRENT_CDN_URL");
        mutableStateFlow.setValue(new AppConfigModel(CURRENT_CDN_URL));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #0 {Exception -> 0x004c, blocks: (B:25:0x0056, B:28:0x0063, B:30:0x006d, B:18:0x0048), top: B:41:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a3 -> B:23:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAppConfigResponse(Continuation<? super AppConfigResponse> continuation) throws Throwable {
        C47361 c47361;
        LauncherRepositoryImpl launcherRepositoryImpl;
        AppConfigResponse appConfigResponse;
        LauncherRepositoryImpl launcherRepositoryImpl2;
        if (continuation instanceof C47361) {
            c47361 = (C47361) continuation;
            int i = c47361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c47361.label = i - Integer.MIN_VALUE;
            } else {
                c47361 = new C47361(continuation);
            }
        }
        Object appConfigResponse2 = c47361.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        LauncherRepositoryImpl launcherRepositoryImpl3 = c47361.label;
        try {
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("LauncherRepositoryImpl getAppConfigResponse throw exception: " + e);
            launcherRepositoryImpl3.errorCount = launcherRepositoryImpl3.errorCount + 1;
            c47361.L$0 = launcherRepositoryImpl3;
            c47361.label = 2;
            launcherRepositoryImpl = launcherRepositoryImpl3;
            if (DelayKt.delay(3000L, c47361) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (launcherRepositoryImpl3 == 0) {
            ResultKt.throwOnFailure(appConfigResponse2);
            launcherRepositoryImpl2 = this;
        } else {
            if (launcherRepositoryImpl3 == 1) {
                LauncherRepositoryImpl launcherRepositoryImpl4 = (LauncherRepositoryImpl) c47361.L$0;
                ResultKt.throwOnFailure(appConfigResponse2);
                launcherRepositoryImpl3 = launcherRepositoryImpl4;
                Response response = (Response) appConfigResponse2;
                appConfigResponse = (AppConfigResponse) response.body();
                if (appConfigResponse != null) {
                    return null;
                }
                if (response.isSuccessful()) {
                    return appConfigResponse;
                }
                return null;
            }
            if (launcherRepositoryImpl3 == 2) {
                LauncherRepositoryImpl launcherRepositoryImpl5 = (LauncherRepositoryImpl) c47361.L$0;
                ResultKt.throwOnFailure(appConfigResponse2);
                launcherRepositoryImpl = launcherRepositoryImpl5;
                c47361.L$0 = launcherRepositoryImpl;
                c47361.label = 3;
                Object appConfigResponse3 = launcherRepositoryImpl.getAppConfigResponse(c47361);
                launcherRepositoryImpl2 = launcherRepositoryImpl;
                if (appConfigResponse3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (launcherRepositoryImpl3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LauncherRepositoryImpl launcherRepositoryImpl6 = (LauncherRepositoryImpl) c47361.L$0;
                ResultKt.throwOnFailure(appConfigResponse2);
                launcherRepositoryImpl2 = launcherRepositoryImpl6;
            }
        }
        if (launcherRepositoryImpl2.errorCount >= 3) {
            return null;
        }
        LauncherDataSource launcherDataSource = launcherRepositoryImpl2.launcherDataSource;
        c47361.L$0 = launcherRepositoryImpl2;
        c47361.label = 1;
        appConfigResponse2 = launcherDataSource.getAppConfigResponse(c47361);
        launcherRepositoryImpl3 = launcherRepositoryImpl2;
        if (appConfigResponse2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        Response response2 = (Response) appConfigResponse2;
        appConfigResponse = (AppConfigResponse) response2.body();
        if (appConfigResponse != null) {
        }
    }
}
