package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11488p;
import ru.rustore.sdk.billingclient.impl.data.repository.C11490r;
import ru.rustore.sdk.billingclient.impl.domain.model.C11506c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11509f;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.p */
/* loaded from: classes5.dex */
public final class C11529p {

    /* renamed from: a */
    public final C11490r f10533a;

    /* renamed from: b */
    public final C11488p f10534b;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.domain.usecase.UpdateRustoreAuthorizationInfoUseCase", m7120f = "UpdateRustoreAuthorizationInfoUseCase.kt", m7121i = {0, 0, 0}, m7122l = {13, 14}, m7123m = "invoke", m7124n = {"this", "applicationId", "force"}, m7125s = {"L$0", "L$1", "Z$0"})
    /* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.p$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public C11529p f10535a;

        /* renamed from: b */
        public String f10536b;

        /* renamed from: c */
        public boolean f10537c;

        /* renamed from: d */
        public /* synthetic */ Object f10538d;

        /* renamed from: f */
        public int f10540f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10538d = obj;
            this.f10540f |= Integer.MIN_VALUE;
            return C11529p.this.m7472a(false, null, this);
        }
    }

    public C11529p(C11490r storeVersionRepository, C11488p rustoreAuthorizationInfoRepository) {
        Intrinsics.checkNotNullParameter(storeVersionRepository, "storeVersionRepository");
        Intrinsics.checkNotNullParameter(rustoreAuthorizationInfoRepository, "rustoreAuthorizationInfoRepository");
        this.f10533a = storeVersionRepository;
        this.f10534b = rustoreAuthorizationInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7472a(boolean z, String str, Continuation<? super C11506c> continuation) throws Throwable {
        a aVar;
        C11529p c11529p;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10540f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10540f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7460a = aVar.f10538d;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10540f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7460a);
            C11490r c11490r = this.f10533a;
            aVar.f10535a = this;
            aVar.f10536b = str;
            aVar.f10537c = z;
            aVar.f10540f = 1;
            objM7460a = c11490r.m7460a(aVar);
            if (objM7460a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c11529p = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objM7460a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = aVar.f10537c;
            str = aVar.f10536b;
            c11529p = aVar.f10535a;
            ResultKt.throwOnFailure(objM7460a);
        }
        C11488p c11488p = c11529p.f10534b;
        aVar.f10535a = null;
        aVar.f10536b = null;
        aVar.f10540f = 2;
        objM7460a = c11488p.m7458a((C11509f) objM7460a, z, str, aVar);
        return objM7460a == coroutine_suspended ? coroutine_suspended : objM7460a;
    }
}
