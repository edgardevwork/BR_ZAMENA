package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11435m;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.utils.C11556h;
import ru.rustore.sdk.user.profile.model.UserProfile;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.o */
/* loaded from: classes5.dex */
public final class C11487o {

    /* renamed from: a */
    public final C11435m f10299a;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.data.repository.RuStoreUserIdRepository", m7120f = "RuStoreUserIdRepository.kt", m7121i = {}, m7122l = {11}, m7123m = "get", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.o$a */
    /* loaded from: classes8.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f10300a;

        /* renamed from: c */
        public int f10302c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10300a = obj;
            this.f10302c |= Integer.MIN_VALUE;
            return C11487o.this.m7457a(this);
        }
    }

    public C11487o(C11435m dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f10299a = dataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7457a(Continuation<? super C11510g> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10302c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10302c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7480a = aVar.f10300a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10302c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7480a);
            C11435m c11435m = this.f10299a;
            aVar.f10302c = 1;
            objM7480a = C11556h.m7480a(c11435m.f10227a.getUserProfile(c11435m.f10228b), aVar);
            if (objM7480a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM7480a);
        }
        return new C11510g(((UserProfile) objM7480a).getUserId());
    }
}
