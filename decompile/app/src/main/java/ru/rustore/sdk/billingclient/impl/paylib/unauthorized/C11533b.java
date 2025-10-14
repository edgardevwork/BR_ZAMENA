package ru.rustore.sdk.billingclient.impl.paylib.unauthorized;

import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibToken;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11428f;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11429g;
import ru.rustore.sdk.billingclient.impl.data.network.C11455a;
import ru.rustore.sdk.billingclient.impl.data.network.C11456b;
import ru.rustore.sdk.billingclient.impl.data.repository.C11482j;
import ru.rustore.sdk.billingclient.impl.domain.model.C11504a;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11517d;
import ru.rustore.sdk.billingclient.impl.utils.C11556h;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.paylib.unauthorized.b */
/* loaded from: classes7.dex */
public final class C11533b implements PaylibTokenProvider {

    /* renamed from: a */
    public final C11517d f10545a;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.paylib.unauthorized.UnauthorizedProductTokenProvider", m7120f = "UnauthorizedProductTokenProvider.kt", m7121i = {}, m7122l = {17}, m7123m = "requestToken", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.impl.paylib.unauthorized.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f10546a;

        /* renamed from: c */
        public int f10548c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10546a = obj;
            this.f10548c |= Integer.MIN_VALUE;
            return C11533b.this.requestToken(null, null, this);
        }
    }

    public C11533b(C11517d getProductTokenUseCase) {
        Intrinsics.checkNotNullParameter(getProductTokenUseCase, "getProductTokenUseCase");
        this.f10545a = getProductTokenUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestToken(PaylibTokenProvider.RequestCause requestCause, PaylibContext paylibContext, Continuation<? super PaylibToken> continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f10548c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10548c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7480a = aVar.f10546a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10548c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7480a);
            C11429g c11429g = this.f10545a.f10512a.f10295a;
            C11456b c11456b = c11429g.f10215a;
            c11456b.getClass();
            Single map = SingleMapKt.map(SingleMapKt.map(Single.INSTANCE.from(new C11455a(c11456b)), new C11428f(c11429g)), C11482j.f10294a);
            aVar.f10548c = 1;
            objM7480a = C11556h.m7480a(map, aVar);
            if (objM7480a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM7480a);
        }
        return new PaylibToken(((C11504a) objM7480a).f10485a);
    }
}
