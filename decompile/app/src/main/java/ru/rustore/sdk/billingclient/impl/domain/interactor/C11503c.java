package ru.rustore.sdk.billingclient.impl.domain.interactor;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;
import ru.rustore.sdk.billingclient.impl.domain.model.InterfaceC11512i;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11525l;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11528o;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.interactor.c */
/* loaded from: classes5.dex */
public final class C11503c {

    /* renamed from: a */
    public final C11496x f10479a;

    /* renamed from: b */
    public final C11525l f10480b;

    /* renamed from: c */
    public final C11528o f10481c;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.domain.interactor.UpdateWebAuthorizationInfoInteractor", m7120f = "UpdateWebAuthorizationInfoInteractor.kt", m7121i = {}, m7122l = {21}, m7123m = "invoke", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.impl.domain.interactor.c$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f10482a;

        /* renamed from: c */
        public int f10484c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10482a = obj;
            this.f10484c |= Integer.MIN_VALUE;
            return C11503c.this.m7465a(this);
        }
    }

    public C11503c(C11496x webAuthorizationInfoRepository, C11525l getWebAuthorizationInfoUpdateFlowUseCase, C11528o startWebAuthUseCase) {
        Intrinsics.checkNotNullParameter(webAuthorizationInfoRepository, "webAuthorizationInfoRepository");
        Intrinsics.checkNotNullParameter(getWebAuthorizationInfoUpdateFlowUseCase, "getWebAuthorizationInfoUpdateFlowUseCase");
        Intrinsics.checkNotNullParameter(startWebAuthUseCase, "startWebAuthUseCase");
        this.f10479a = webAuthorizationInfoRepository;
        this.f10480b = getWebAuthorizationInfoUpdateFlowUseCase;
        this.f10481c = startWebAuthUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7465a(Continuation<? super C11511h> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10484c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10484c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objFirst = aVar.f10482a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10484c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            this.f10479a.m7462a(null);
            this.f10481c.f10532a.f10325a.m7446a();
            MutableSharedFlow<InterfaceC11512i> mutableSharedFlow = this.f10480b.f10528a.f10327b;
            aVar.f10484c = 1;
            objFirst = FlowKt.first(mutableSharedFlow, aVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        InterfaceC11512i interfaceC11512i = (InterfaceC11512i) objFirst;
        if (interfaceC11512i instanceof InterfaceC11512i.b) {
            return ((InterfaceC11512i.b) interfaceC11512i).f10501a;
        }
        if (interfaceC11512i instanceof InterfaceC11512i.a) {
            throw new RuStoreUserUnauthorizedException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
