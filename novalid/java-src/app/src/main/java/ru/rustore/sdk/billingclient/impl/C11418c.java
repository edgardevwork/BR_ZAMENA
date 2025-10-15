package ru.rustore.sdk.billingclient.impl;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11524k;
import ru.rustore.sdk.billingclient.model.user.UserAuthorizationStatus;

/* renamed from: ru.rustore.sdk.billingclient.impl.c */
/* loaded from: classes5.dex */
public final class C11418c {

    /* renamed from: a */
    public final C11524k f10186a;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.UserInfoController", m7120f = "UserInfoController.kt", m7121i = {}, m7122l = {9}, m7123m = "getAuthorizationStatus", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.impl.c$a */
    /* loaded from: classes8.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f10187a;

        /* renamed from: c */
        public int f10189c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10187a = obj;
            this.f10189c |= Integer.MIN_VALUE;
            return C11418c.this.m7441a(this);
        }
    }

    public C11418c(C11524k getUserIdUseCase) {
        Intrinsics.checkNotNullParameter(getUserIdUseCase, "getUserIdUseCase");
        this.f10186a = getUserIdUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7441a(Continuation<? super UserAuthorizationStatus> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10189c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10189c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7470a = aVar.f10187a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10189c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7470a);
            C11524k c11524k = this.f10186a;
            aVar.f10189c = 1;
            objM7470a = c11524k.m7470a(aVar);
            if (objM7470a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM7470a);
        }
        return new UserAuthorizationStatus(((C11510g) objM7470a) != null);
    }
}
