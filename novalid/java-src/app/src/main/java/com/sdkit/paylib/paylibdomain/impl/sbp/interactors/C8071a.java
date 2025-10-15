package com.sdkit.paylib.paylibdomain.impl.sbp.interactors;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.entity.SbpBankInfo;
import com.sdkit.paylib.paylibdomain.api.sbp.interactors.BanksInteractor;
import com.sdkit.paylib.paylibdomain.impl.sbp.entity.KnownSbpPackages;
import com.sdkit.paylib.paylibpayment.api.network.bistro.BistroNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.entity.bistro.BankInfo;
import com.sdkit.paylib.paylibpayment.api.network.response.bistro.BanksListResponse;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibutils.lib.AbstractC8609a;
import com.sdkit.paylib.paylibutils.lib.C8610b;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.p051io.TextStreamsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.sbp.interactors.a */
/* loaded from: classes5.dex */
public final class C8071a implements BanksInteractor {

    /* renamed from: a */
    public final BistroNetworkClient f1479a;

    /* renamed from: b */
    public final CoroutineDispatchers f1480b;

    /* renamed from: c */
    public final Context f1481c;

    /* renamed from: d */
    public final Json f1482d;

    /* renamed from: e */
    public final Lazy f1483e;

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.sbp.interactors.a$a */
    /* loaded from: classes6.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1484a;

        /* renamed from: c */
        public int f1486c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1484a = obj;
            this.f1486c |= Integer.MIN_VALUE;
            Object objMo15381getSbpBanksIoAF18A = C8071a.this.mo15381getSbpBanksIoAF18A(this);
            return objMo15381getSbpBanksIoAF18A == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo15381getSbpBanksIoAF18A : Result.m15698boximpl(objMo15381getSbpBanksIoAF18A);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.sbp.interactors.a$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f1487a;

        /* renamed from: b */
        public /* synthetic */ Object f1488b;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = C8071a.this.new b(continuation);
            bVar.f1488b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15699constructorimpl;
            Object objM15699constructorimpl2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1487a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C8071a c8071a = C8071a.this;
                    Result.Companion companion = Result.INSTANCE;
                    BistroNetworkClient bistroNetworkClient = c8071a.f1479a;
                    this.f1487a = 1;
                    obj = bistroNetworkClient.getBanksList(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM15699constructorimpl = Result.m15699constructorimpl((BanksListResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            Object objM4713a = AbstractC8609a.m4713a(objM15699constructorimpl);
            C8071a c8071a2 = C8071a.this;
            if (Result.m15706isSuccessimpl(objM4713a)) {
                Result.Companion companion3 = Result.INSTANCE;
                List<BankInfo> banksList = ((BanksListResponse) objM4713a).getBanksList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(banksList, 10));
                for (BankInfo bankInfo : banksList) {
                    String bankName = bankInfo.getBankName();
                    String string = bankInfo.getBankLogoUrl().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "it.bankLogoUrl.toString()");
                    arrayList.add(new SbpBankInfo(bankName, string, bankInfo.getBankPackageName(), bankInfo.getBankSchema(), c8071a2.m1659a().contains(bankInfo.getBankPackageName())));
                }
                objM15699constructorimpl2 = Result.m15699constructorimpl(arrayList);
            } else {
                objM15699constructorimpl2 = Result.m15699constructorimpl(objM4713a);
            }
            return Result.m15698boximpl(objM15699constructorimpl2);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.sbp.interactors.a$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            Object objM15699constructorimpl;
            C8071a c8071a = C8071a.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c8071a.f1481c.getResources().openRawResource(C11403R.raw.paylib_domain_known_sbp_packages), "UTF8"));
                Json json = c8071a.f1482d;
                List listM1652b = ((KnownSbpPackages) json.decodeFromString(SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(KnownSbpPackages.class)), TextStreamsKt.readText(bufferedReader))).m1652b();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM1652b, 10));
                Iterator it = listM1652b.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt__StringsJVMKt.replace$default((String) it.next(), "🔒", C8610b.f5886a.m4714a(), false, 4, (Object) null));
                }
                objM15699constructorimpl = Result.m15699constructorimpl(CollectionsKt___CollectionsKt.toSet(arrayList));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            Set setEmptySet = SetsKt__SetsKt.emptySet();
            if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                objM15699constructorimpl = setEmptySet;
            }
            return (Set) objM15699constructorimpl;
        }
    }

    public C8071a(BistroNetworkClient bistroNetworkClient, CoroutineDispatchers coroutineDispatchers, Context context, Json json) {
        Intrinsics.checkNotNullParameter(bistroNetworkClient, "bistroNetworkClient");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f1479a = bistroNetworkClient;
        this.f1480b = coroutineDispatchers;
        this.f1481c = context;
        this.f1482d = json;
        this.f1483e = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibdomain.api.sbp.interactors.BanksInteractor
    /* renamed from: getSbpBanks-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo15381getSbpBanksIoAF18A(Continuation continuation) throws Throwable {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f1486c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f1486c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objWithContext = aVar.f1484a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f1486c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = this.f1480b.getIo();
            b bVar = new b(null);
            aVar.f1486c = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* renamed from: a */
    public final Set m1659a() {
        return (Set) this.f1483e.getValue();
    }
}
