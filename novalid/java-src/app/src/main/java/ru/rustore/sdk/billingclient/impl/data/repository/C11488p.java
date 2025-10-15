package ru.rustore.sdk.billingclient.impl.data.repository;

import android.content.Context;
import android.util.Log;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import ru.p068vk.store.sdk.lib.payment.info.aidl.model.C11824a;
import ru.rustore.sdk.billingclient.BuildConfig;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11424b;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11427e;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11432j;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11433k;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11450e;
import ru.rustore.sdk.billingclient.impl.data.provider.C11465i;
import ru.rustore.sdk.billingclient.impl.data.provider.C11466j;
import ru.rustore.sdk.billingclient.impl.data.provider.C11467k;
import ru.rustore.sdk.billingclient.impl.data.provider.C11470n;
import ru.rustore.sdk.billingclient.impl.data.provider.C11471o;
import ru.rustore.sdk.billingclient.impl.data.provider.C11472p;
import ru.rustore.sdk.billingclient.impl.domain.model.C11506c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11509f;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.p */
/* loaded from: classes5.dex */
public final class C11488p {

    /* renamed from: a */
    public final C11433k f10303a;

    /* renamed from: b */
    public final C11432j f10304b;

    /* renamed from: c */
    public final C11424b f10305c;

    /* renamed from: d */
    public final C11427e f10306d;

    /* renamed from: e */
    public final C11450e f10307e;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.data.repository.RustoreAuthorizationInfoRepository", m7120f = "RustoreAuthorizationInfoRepository.kt", m7121i = {0, 1}, m7122l = {25, 28}, m7123m = "create", m7124n = {"this", "this"}, m7125s = {"L$0", "L$0"})
    /* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.p$a */
    /* loaded from: classes8.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public C11488p f10308a;

        /* renamed from: b */
        public /* synthetic */ Object f10309b;

        /* renamed from: d */
        public int f10311d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10309b = obj;
            this.f10311d |= Integer.MIN_VALUE;
            return C11488p.this.m7458a(null, false, null, this);
        }
    }

    public C11488p(C11433k remoteRustorePayTokenDataSource, C11432j remoteRustoreAuthorizationInfoDataSource, C11424b defaultBackendUrlDataSource, C11427e localRustoreAuthorizationInfoDataSource, C11450e rustoreAuthorizationInfoMapper) {
        Intrinsics.checkNotNullParameter(remoteRustorePayTokenDataSource, "remoteRustorePayTokenDataSource");
        Intrinsics.checkNotNullParameter(remoteRustoreAuthorizationInfoDataSource, "remoteRustoreAuthorizationInfoDataSource");
        Intrinsics.checkNotNullParameter(defaultBackendUrlDataSource, "defaultBackendUrlDataSource");
        Intrinsics.checkNotNullParameter(localRustoreAuthorizationInfoDataSource, "localRustoreAuthorizationInfoDataSource");
        Intrinsics.checkNotNullParameter(rustoreAuthorizationInfoMapper, "rustoreAuthorizationInfoMapper");
        this.f10303a = remoteRustorePayTokenDataSource;
        this.f10304b = remoteRustoreAuthorizationInfoDataSource;
        this.f10305c = defaultBackendUrlDataSource;
        this.f10306d = localRustoreAuthorizationInfoDataSource;
        this.f10307e = rustoreAuthorizationInfoMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7458a(C11509f c11509f, boolean z, String str, Continuation<? super C11506c> continuation) throws Throwable {
        a aVar;
        C11488p c11488p;
        C11506c rustoreAuthorizationInfo;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10311d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10311d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object result = aVar.f10309b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10311d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            if (c11509f != null) {
                long j = c11509f.f10493a;
                if (j > 1 || (j >= 1 && c11509f.f10494b >= 28)) {
                    C11432j c11432j = this.f10304b;
                    aVar.f10308a = this;
                    aVar.f10311d = 1;
                    C11467k c11467k = c11432j.f10223b;
                    Context context = c11432j.f10222a;
                    c11467k.getClass();
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(aVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    try {
                        C11467k.m7452a(c11467k, context, str, z, new C11465i(cancellableContinuationImpl), new C11466j(cancellableContinuationImpl));
                    } catch (Exception e) {
                        Log.e("PayTokenRepository", "getPayToken", e);
                        if (cancellableContinuationImpl.isActive()) {
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuationImpl.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(e)));
                        }
                    }
                    result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(aVar);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c11488p = this;
                    C11824a dto = (C11824a) result;
                    c11488p.f10307e.getClass();
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    String str2 = dto.f11063a;
                    Intrinsics.checkNotNullExpressionValue(str2, "dto.payToken");
                    boolean z2 = dto.f11065c;
                    String str3 = dto.f11064b;
                    Intrinsics.checkNotNullExpressionValue(str3, "dto.backendBaseUrl");
                    rustoreAuthorizationInfo = new C11506c(str2, z2, str3);
                }
            }
            C11433k c11433k = this.f10303a;
            aVar.f10308a = this;
            aVar.f10311d = 2;
            C11472p c11472p = c11433k.f10225b;
            Context context2 = c11433k.f10224a;
            c11472p.getClass();
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(aVar), 1);
            cancellableContinuationImpl2.initCancellability();
            try {
                C11472p.m7453a(c11472p, context2, str, z, new C11470n(cancellableContinuationImpl2), new C11471o(cancellableContinuationImpl2));
            } catch (Exception e2) {
                Log.e("PayTokenRepository", "getPayToken", e2);
                if (cancellableContinuationImpl2.isActive()) {
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(e2)));
                }
            }
            result = cancellableContinuationImpl2.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(aVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            c11488p = this;
            c11488p.f10305c.getClass();
            rustoreAuthorizationInfo = new C11506c((String) result, false, BuildConfig.SBER_BACKEND_URL);
        } else if (i2 == 1) {
            c11488p = aVar.f10308a;
            ResultKt.throwOnFailure(result);
            C11824a dto2 = (C11824a) result;
            c11488p.f10307e.getClass();
            Intrinsics.checkNotNullParameter(dto2, "dto");
            String str22 = dto2.f11063a;
            Intrinsics.checkNotNullExpressionValue(str22, "dto.payToken");
            boolean z22 = dto2.f11065c;
            String str32 = dto2.f11064b;
            Intrinsics.checkNotNullExpressionValue(str32, "dto.backendBaseUrl");
            rustoreAuthorizationInfo = new C11506c(str22, z22, str32);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11488p = aVar.f10308a;
            ResultKt.throwOnFailure(result);
            c11488p.f10305c.getClass();
            rustoreAuthorizationInfo = new C11506c((String) result, false, BuildConfig.SBER_BACKEND_URL);
        }
        C11427e c11427e = c11488p.f10306d;
        c11427e.getClass();
        Intrinsics.checkNotNullParameter(rustoreAuthorizationInfo, "rustoreAuthorizationInfo");
        synchronized (c11427e) {
            c11427e.f10213a = rustoreAuthorizationInfo;
            Unit unit = Unit.INSTANCE;
        }
        return rustoreAuthorizationInfo;
    }
}
