package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.Context;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import ru.rustore.sdk.billingclient.impl.data.repository.C11487o;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11503c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11506c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;
import ru.rustore.sdk.billingclient.impl.domain.model.C11513j;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11526m;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11529p;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.core.util.RuStoreUtils;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.e */
/* loaded from: classes5.dex */
public final class C11461e {

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.data.provider.PayTokenProvider", m7120f = "PayTokenProvider.kt", m7121i = {0, 0, 0, 0, 0}, m7122l = {28, 32, 37}, m7123m = "provide", m7124n = {"this", "context", "applicationId", "webPayToken", "force"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
    /* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.e$a */
    /* loaded from: classes8.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public C11461e f10250a;

        /* renamed from: b */
        public Context f10251b;

        /* renamed from: c */
        public String f10252c;

        /* renamed from: d */
        public C11513j f10253d;

        /* renamed from: e */
        public boolean f10254e;

        /* renamed from: f */
        public /* synthetic */ Object f10255f;

        /* renamed from: h */
        public int f10257h;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10255f = obj;
            this.f10257h |= Integer.MIN_VALUE;
            return C11461e.this.m7451a(null, false, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7451a(Context context, boolean z, String str, Continuation<? super String> continuation) throws Throwable {
        a aVar;
        C11513j c11513jM7471a;
        C11461e c11461e;
        Object objM7457a;
        Object objM15699constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10257h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10257h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7465a = aVar.f10255f;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10257h;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objM7465a);
                    return ((C11506c) objM7465a).f10486a;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM7465a);
                return ((C11511h) objM7465a).f10496a.f10503b;
            }
            z = aVar.f10254e;
            C11513j c11513j = aVar.f10253d;
            str = aVar.f10252c;
            Context context2 = aVar.f10251b;
            c11461e = aVar.f10250a;
            try {
                ResultKt.throwOnFailure(objM7465a);
                c11513jM7471a = c11513j;
                context = context2;
                objM7457a = objM7465a;
            } catch (Throwable th) {
                c11513jM7471a = c11513j;
                context = context2;
                th = th;
                Result.Companion companion = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                }
                C11510g c11510g = (C11510g) objM15699constructorimpl;
                if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
                }
                if (!z) {
                }
            }
            try {
                objM15699constructorimpl = Result.m15699constructorimpl((C11510g) objM7457a);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                }
                C11510g c11510g2 = (C11510g) objM15699constructorimpl;
                if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
                }
                if (!z) {
                }
            }
            if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                objM15699constructorimpl = null;
            }
            C11510g c11510g22 = (C11510g) objM15699constructorimpl;
            if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context) && c11510g22 != null) {
                c11461e.getClass();
                Lazy<C11497a> lazy = C11497a.f10328u0;
                C11529p c11529p = (C11529p) C11497a.C11965b.m7463a().f10396v.getValue();
                aVar.f10250a = null;
                aVar.f10251b = null;
                aVar.f10252c = null;
                aVar.f10253d = null;
                aVar.f10257h = 2;
                objM7465a = c11529p.m7472a(z, str, aVar);
                if (objM7465a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return ((C11506c) objM7465a).f10486a;
            }
            if (!z) {
                if (c11513jM7471a != null) {
                    return c11513jM7471a.f10503b;
                }
                throw new RuStoreUserUnauthorizedException();
            }
            c11461e.getClass();
            Lazy<C11497a> lazy2 = C11497a.f10328u0;
            C11503c c11503c = (C11503c) C11497a.C11965b.m7463a().f10348T.getValue();
            aVar.f10250a = null;
            aVar.f10251b = null;
            aVar.f10252c = null;
            aVar.f10253d = null;
            aVar.f10257h = 3;
            objM7465a = c11503c.m7465a(aVar);
            if (objM7465a == coroutine_suspended) {
                return coroutine_suspended;
            }
            return ((C11511h) objM7465a).f10496a.f10503b;
        }
        ResultKt.throwOnFailure(objM7465a);
        Lazy<C11497a> lazy3 = C11497a.f10328u0;
        c11513jM7471a = ((C11526m) C11497a.C11965b.m7463a().f10346R.getValue()).m7471a();
        try {
            Result.Companion companion3 = Result.INSTANCE;
            C11487o c11487o = (C11487o) C11497a.C11965b.m7463a().f10342N.getValue();
            aVar.f10250a = this;
            aVar.f10251b = context;
            aVar.f10252c = str;
            aVar.f10253d = c11513jM7471a;
            aVar.f10254e = z;
            aVar.f10257h = 1;
            objM7457a = c11487o.m7457a(aVar);
        } catch (Throwable th3) {
            th = th3;
            c11461e = this;
            Result.Companion companion22 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
            }
            C11510g c11510g222 = (C11510g) objM15699constructorimpl;
            if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            }
            if (!z) {
            }
        }
        if (objM7457a == coroutine_suspended) {
            return coroutine_suspended;
        }
        c11461e = this;
        objM15699constructorimpl = Result.m15699constructorimpl((C11510g) objM7457a);
        if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
        }
        C11510g c11510g2222 = (C11510g) objM15699constructorimpl;
        if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
        }
        if (!z) {
        }
    }
}
