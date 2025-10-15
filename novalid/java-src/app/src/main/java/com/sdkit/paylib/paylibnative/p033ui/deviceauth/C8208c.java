package com.sdkit.paylib.paylibnative.p033ui.deviceauth;

import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthType;
import com.sdkit.paylib.paylibnative.p033ui.deviceauth.InterfaceC8207b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.c */
/* loaded from: classes8.dex */
public final class C8208c {

    /* renamed from: a */
    public final DeviceAuthDelegate f2276a;

    /* renamed from: b */
    public final PaylibLogger f2277b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.c$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2278a;

        static {
            int[] iArr = new int[DeviceAuthType.values().length];
            try {
                iArr[DeviceAuthType.ONLY_BIOMETRICS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceAuthType.BIOMETRICS_OR_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceAuthType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2278a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public Object f2279a;

        /* renamed from: b */
        public Object f2280b;

        /* renamed from: c */
        public Object f2281c;

        /* renamed from: d */
        public int f2282d;

        /* renamed from: e */
        public /* synthetic */ Object f2283e;

        /* renamed from: g */
        public int f2285g;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2283e = obj;
            this.f2285g |= Integer.MIN_VALUE;
            return C8208c.this.m2179a((Fragment) null, (C8206a) null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends BiometricPrompt.AuthenticationCallback {

        /* renamed from: b */
        public final /* synthetic */ CancellableContinuation f2287b;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.deviceauth.c$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends Lambda implements Function0 {

            /* renamed from: a */
            public final /* synthetic */ int f2288a;

            /* renamed from: b */
            public final /* synthetic */ CharSequence f2289b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, CharSequence charSequence) {
                super(0);
                this.f2288a = i;
                this.f2289b = charSequence;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "onAuthenticationError (code=" + this.f2288a + ") - " + ((Object) this.f2289b);
            }
        }

        public c(CancellableContinuation cancellableContinuation) {
            this.f2287b = cancellableContinuation;
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence errorString) {
            Intrinsics.checkNotNullParameter(errorString, "errorString");
            super.onAuthenticationError(i, errorString);
            PaylibLogger.DefaultImpls.d$default(C8208c.this.f2277b, null, new a(i, errorString), 1, null);
            C8208c.this.m2181a(this.f2287b, (i == 10 || i == 13) ? InterfaceC8207b.a.C11910a.f2272a : InterfaceC8207b.a.c.f2274a);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            super.onAuthenticationSucceeded(result);
            DeviceAuthDelegate deviceAuthDelegate = C8208c.this.f2276a;
            if (deviceAuthDelegate != null) {
                deviceAuthDelegate.onAuthorized();
            }
            C8208c.this.m2181a(this.f2287b, InterfaceC8207b.b.f2275a);
        }
    }

    public C8208c(DeviceAuthDelegate deviceAuthDelegate, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2276a = deviceAuthDelegate;
        this.f2277b = loggerFactory.get("PaylibDeviceAuthenticator");
    }

    /* renamed from: a */
    public final BiometricPrompt.AuthenticationCallback m2177a(CancellableContinuation cancellableContinuation) {
        return new c(cancellableContinuation);
    }

    /* renamed from: a */
    public final Integer m2178a(DeviceAuthType deviceAuthType) {
        int i;
        int i2 = a.f2278a[deviceAuthType.ordinal()];
        if (i2 == 1) {
            i = 15;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            i = 33023;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2179a(Fragment fragment, C8206a c8206a, Continuation continuation) throws Throwable {
        b bVar;
        C8208c c8208c;
        Integer numM2178a;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f2285g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f2285g = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object requiredAuthType = bVar.f2283e;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f2285g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(requiredAuthType);
            DeviceAuthDelegate deviceAuthDelegate = this.f2276a;
            if (deviceAuthDelegate != null) {
                bVar.f2279a = this;
                bVar.f2280b = fragment;
                bVar.f2281c = c8206a;
                bVar.f2285g = 1;
                requiredAuthType = deviceAuthDelegate.getRequiredAuthType(bVar);
                if (requiredAuthType == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8208c = this;
            }
            return InterfaceC8207b.b.f2275a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(requiredAuthType);
        }
        c8206a = (C8206a) bVar.f2281c;
        fragment = (Fragment) bVar.f2280b;
        c8208c = (C8208c) bVar.f2279a;
        ResultKt.throwOnFailure(requiredAuthType);
        DeviceAuthType deviceAuthType = (DeviceAuthType) requiredAuthType;
        if (deviceAuthType != null && (numM2178a = c8208c.m2178a(deviceAuthType)) != null) {
            int iIntValue = numM2178a.intValue();
            bVar.f2279a = c8208c;
            bVar.f2280b = fragment;
            bVar.f2281c = c8206a;
            bVar.f2282d = iIntValue;
            bVar.f2285g = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bVar), 1);
            cancellableContinuationImpl.initCancellability();
            BiometricManager biometricManagerFrom = BiometricManager.from(fragment.requireContext());
            Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "from(fragment.requireContext())");
            if (biometricManagerFrom.canAuthenticate(iIntValue) == 0) {
                c8208c.m2180a(fragment, iIntValue, c8206a, cancellableContinuationImpl);
            } else {
                c8208c.m2181a(cancellableContinuationImpl, InterfaceC8207b.a.b.f2273a);
            }
            requiredAuthType = cancellableContinuationImpl.getResult();
            if (requiredAuthType == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(bVar);
            }
            return requiredAuthType == coroutine_suspended ? coroutine_suspended : requiredAuthType;
        }
        return InterfaceC8207b.b.f2275a;
    }

    /* renamed from: a */
    public final void m2180a(Fragment fragment, int i, C8206a c8206a, CancellableContinuation cancellableContinuation) {
        BiometricPrompt.PromptInfo.Builder title = new BiometricPrompt.PromptInfo.Builder().setAllowedAuthenticators(i).setConfirmationRequired(false).setTitle(c8206a.m2172d());
        String strM2171c = c8206a.m2171c();
        if (strM2171c != null) {
            Intrinsics.checkNotNullExpressionValue(title, "this");
            title.setSubtitle(strM2171c);
        }
        String strM2170b = c8206a.m2170b();
        if (strM2170b != null) {
            Intrinsics.checkNotNullExpressionValue(title, "this");
            title.setDescription(strM2170b);
        }
        if ((i & 32768) == 0) {
            title.setNegativeButtonText(c8206a.m2169a());
        }
        BiometricPrompt.PromptInfo promptInfoBuild = title.build();
        Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "Builder()\n            .s…   }\n            .build()");
        new BiometricPrompt(fragment, m2177a(cancellableContinuation)).authenticate(promptInfoBuild);
    }

    /* renamed from: a */
    public final void m2181a(CancellableContinuation cancellableContinuation, Object obj) {
        if (cancellableContinuation.isActive()) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m15699constructorimpl(obj));
        }
    }
}
