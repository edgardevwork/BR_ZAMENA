package com.sdkit.paylib.paylibnetwork.impl.domain;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector;
import com.sdkit.paylib.paylibnetwork.impl.utils.C8490a;
import com.sdkit.paylib.paylibnetwork.impl.utils.C8491b;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.b */
/* loaded from: classes6.dex */
public final class C8461b implements PingInternetDetector {

    /* renamed from: c */
    public static final a f4135c = new a(null);

    /* renamed from: a */
    public final OkHttpClient f4136a = new OkHttpClient.Builder().callTimeout(2500, TimeUnit.MILLISECONDS).build();

    /* renamed from: b */
    public final Request f4137b = new Request.Builder().url("https://clients3.google.com/generate_204").get().build();

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.b$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public Object f4138a;

        /* renamed from: b */
        public /* synthetic */ Object f4139b;

        /* renamed from: d */
        public int f4141d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4139b = obj;
            this.f4141d |= Integer.MIN_VALUE;
            return C8461b.this.isConnected(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isConnected(Continuation continuation) throws Throwable {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f4141d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f4141d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object obj = bVar.f4139b;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f4141d;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Call callNewCall = this.f4136a.newCall(this.f4137b);
                bVar.f4138a = callNewCall;
                bVar.f4141d = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bVar), 1);
                cancellableContinuationImpl.initCancellability();
                FirebasePerfOkHttpClient.enqueue(callNewCall, new C8490a(cancellableContinuationImpl));
                cancellableContinuationImpl.invokeOnCancellation(new C8491b(callNewCall));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(bVar);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException unused) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }
}
