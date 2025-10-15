package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.Context;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibToken;
import java.util.Map;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.analytics.C11405a;
import ru.rustore.sdk.billingclient.impl.analytics.C11406b;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.analytics.C11415k;
import ru.rustore.sdk.billingclient.impl.data.repository.C11474b;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.f */
/* loaded from: classes7.dex */
public final class C11462f implements PaylibTokenProvider {

    /* renamed from: a */
    public final C11461e f10258a;

    /* renamed from: b */
    public final Context f10259b;

    /* renamed from: c */
    public final String f10260c;

    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.impl.data.provider.PaylibTokenProviderImpl", m7120f = "PaylibTokenProviderImpl.kt", m7121i = {}, m7122l = {27}, m7123m = "requestToken", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.f$a */
    /* loaded from: classes8.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f10261a;

        /* renamed from: c */
        public int f10263c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10261a = obj;
            this.f10263c |= Integer.MIN_VALUE;
            return C11462f.this.requestToken(null, null, this);
        }
    }

    public C11462f(C11461e payTokenProvider, Context androidContext, String applicationId) {
        Intrinsics.checkNotNullParameter(payTokenProvider, "payTokenProvider");
        Intrinsics.checkNotNullParameter(androidContext, "androidContext");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f10258a = payTokenProvider;
        this.f10259b = androidContext;
        this.f10260c = applicationId;
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
            int i = aVar.f10263c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f10263c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objM7451a = aVar.f10261a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f10263c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM7451a);
            boolean z = requestCause == PaylibTokenProvider.RequestCause.AUTHORIZATION_ERROR;
            if (z) {
                Lazy<C11497a> lazy = C11497a.f10328u0;
                C11405a c11405a = (C11405a) C11497a.C11965b.m7463a().f10397w.getValue();
                C11415k analyticsEvent = C11415k.f10179a;
                c11405a.getClass();
                Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
                C11474b c11474b = c11405a.f10160a;
                String eventName = analyticsEvent.getEventName();
                Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder.putAll((Map) c11405a.f10167h.getValue());
                mapCreateMapBuilder.putAll(analyticsEvent.getEventData());
                Unit unit = Unit.INSTANCE;
                SingleSubscribeKt.subscribe$default(c11474b.m7454a(new C11413i(eventName, MapsKt__MapsJVMKt.build(mapCreateMapBuilder)), c11405a.m7440a()), null, C11406b.f10170a, 1, null);
            }
            C11461e c11461e = this.f10258a;
            Context context = this.f10259b;
            String str = this.f10260c;
            aVar.f10263c = 1;
            objM7451a = c11461e.m7451a(context, z, str, aVar);
            if (objM7451a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM7451a);
        }
        return new PaylibToken((String) objM7451a);
    }
}
