package ru.rustore.sdk.billingclient.impl.domain.usecase;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11487o;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.domain.model.C11505b;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.k */
/* loaded from: classes5.dex */
public final class C11524k {

    /* renamed from: a */
    public final C11486n f10522a;

    /* renamed from: b */
    public final C11496x f10523b;

    /* renamed from: c */
    public final C11487o f10524c;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.domain.usecase.GetUserIdUseCase", m7120f = "GetUserIdUseCase.kt", m7121i = {}, m7122l = {19}, m7123m = "invoke", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.impl.domain.usecase.k$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f10525a;

        /* renamed from: c */
        public int f10527c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10525a = obj;
            this.f10527c |= Integer.MIN_VALUE;
            return C11524k.this.m7470a(this);
        }
    }

    public C11524k(C11486n ruStoreInstallStatusRepository, C11496x webAuthorizationInfoRepository, C11487o ruStoreUserIdRepository) {
        Intrinsics.checkNotNullParameter(ruStoreInstallStatusRepository, "ruStoreInstallStatusRepository");
        Intrinsics.checkNotNullParameter(webAuthorizationInfoRepository, "webAuthorizationInfoRepository");
        Intrinsics.checkNotNullParameter(ruStoreUserIdRepository, "ruStoreUserIdRepository");
        this.f10522a = ruStoreInstallStatusRepository;
        this.f10523b = webAuthorizationInfoRepository;
        this.f10524c = ruStoreUserIdRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7470a(Continuation<? super C11510g> continuation) {
        a aVar;
        Object objM15699constructorimpl;
        C11510g c11510g;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10527c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10527c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7457a = aVar.f10525a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10527c;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7457a);
            Result.Companion companion2 = Result.INSTANCE;
            int iM7466a = C11505b.m7466a(this.f10522a.m7456a());
            if (iM7466a != 0) {
                if (iM7466a != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                C11511h c11511hM7461a = this.f10523b.m7461a();
                c11510g = c11511hM7461a != null ? c11511hM7461a.f10499d : null;
                objM15699constructorimpl = Result.m15699constructorimpl(c11510g);
                if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                    return objM15699constructorimpl;
                }
                return null;
            }
            C11487o c11487o = this.f10524c;
            aVar.f10527c = 1;
            objM7457a = c11487o.m7457a(aVar);
            if (objM7457a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM7457a);
        }
        c11510g = (C11510g) objM7457a;
        objM15699constructorimpl = Result.m15699constructorimpl(c11510g);
        if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
        }
    }
}
