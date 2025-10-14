package ru.rustore.sdk.billingclient.impl.domain.interactor;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import ru.rustore.sdk.billingclient.impl.data.repository.C11487o;
import ru.rustore.sdk.billingclient.impl.domain.model.C11506c;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11529p;
import ru.rustore.sdk.billingclient.model.purchase.PurchaseAvailabilityResult;
import ru.rustore.sdk.core.exception.RuStoreException;

@DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.domain.interactor.IsPurchasesAvailableInteractor$invoke$2", m7120f = "IsPurchasesAvailableInteractor.kt", m7121i = {0}, m7122l = {23, 28}, m7123m = "invokeSuspend", m7124n = {"$this$withContext"}, m7125s = {"L$0"})
/* renamed from: ru.rustore.sdk.billingclient.impl.domain.interactor.a */
/* loaded from: classes8.dex */
public final class C11501a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PurchaseAvailabilityResult>, Object> {

    /* renamed from: a */
    public int f10471a;

    /* renamed from: b */
    public /* synthetic */ Object f10472b;

    /* renamed from: c */
    public final /* synthetic */ C11502b f10473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11501a(C11502b c11502b, Continuation<? super C11501a> continuation) {
        super(2, continuation);
        this.f10473c = c11502b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C11501a c11501a = new C11501a(this.f10473c, continuation);
        c11501a.f10472b = obj;
        return c11501a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PurchaseAvailabilityResult> continuation) {
        C11501a c11501a = new C11501a(this.f10473c, continuation);
        c11501a.f10472b = coroutineScope;
        return c11501a.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:34:0x0079, B:36:0x0084, B:40:0x0095, B:37:0x0087, B:38:0x0092, B:28:0x0064, B:31:0x006a, B:39:0x0093), top: B:55:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:34:0x0079, B:36:0x0084, B:40:0x0095, B:37:0x0087, B:38:0x0092, B:28:0x0064, B:31:0x006a, B:39:0x0093), top: B:55:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15699constructorimpl;
        Object objM15699constructorimpl2;
        Object obj2;
        Throwable thM15702exceptionOrNullimpl;
        RuStoreException ruStoreException;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10471a;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl2 = Result.m15699constructorimpl(ResultKt.createFailure(th2));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f10472b;
            C11502b c11502b = this.f10473c;
            Result.Companion companion3 = Result.INSTANCE;
            C11487o c11487o = c11502b.f10475b;
            this.f10472b = coroutineScope;
            this.f10471a = 1;
            obj = c11487o.m7457a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!StringsKt__StringsJVMKt.isBlank(((C11506c) obj).f10486a)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                obj2 = PurchaseAvailabilityResult.Available.INSTANCE;
                objM15699constructorimpl2 = Result.m15699constructorimpl(obj2);
                thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl2);
                if (thM15702exceptionOrNullimpl != null) {
                    return objM15699constructorimpl2;
                }
                if (thM15702exceptionOrNullimpl instanceof RuStoreException) {
                    ruStoreException = (RuStoreException) thM15702exceptionOrNullimpl;
                } else {
                    String message = thM15702exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = thM15702exceptionOrNullimpl.toString();
                    }
                    ruStoreException = new RuStoreException(message);
                }
                return new PurchaseAvailabilityResult.Unavailable(ruStoreException);
            }
            ResultKt.throwOnFailure(obj);
        }
        objM15699constructorimpl = Result.m15699constructorimpl((C11510g) obj);
        if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
            objM15699constructorimpl = null;
        }
        C11510g c11510g = (C11510g) objM15699constructorimpl;
        int iM7456a = this.f10473c.f10474a.m7456a();
        C11502b c11502b2 = this.f10473c;
        Result.Companion companion4 = Result.INSTANCE;
        if (iM7456a != 1 || c11510g == null) {
            obj2 = PurchaseAvailabilityResult.Unknown.INSTANCE;
            objM15699constructorimpl2 = Result.m15699constructorimpl(obj2);
            thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl2);
            if (thM15702exceptionOrNullimpl != null) {
            }
        } else {
            C11529p c11529p = c11502b2.f10476c;
            String str = c11502b2.f10478e;
            this.f10472b = null;
            this.f10471a = 2;
            obj = c11529p.m7472a(true, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!StringsKt__StringsJVMKt.isBlank(((C11506c) obj).f10486a)) {
            }
        }
    }
}
