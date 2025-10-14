package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.lifecycle.ViewModelKt;
import com.sdkit.paylib.paylibdomain.api.entity.SbpBankInfo;
import com.sdkit.paylib.paylibdomain.api.sbp.interactors.BanksInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.InterfaceC8142a;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.entity.BankOpenUnavailableException;
import com.sdkit.paylib.paylibnative.p033ui.domain.error.DefaultPaymentException;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8261a;
import com.sdkit.paylib.paylibnative.p033ui.routing.EnumC8262b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8266a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.AbstractC8338b;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8340d;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8369f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.d */
/* loaded from: classes5.dex */
public final class C8269d extends AbstractC8129a {

    /* renamed from: b */
    public final InterfaceC8097f f2812b;

    /* renamed from: c */
    public final InterfaceC8131b f2813c;

    /* renamed from: d */
    public final BanksInteractor f2814d;

    /* renamed from: e */
    public final InterfaceC8142a f2815e;

    /* renamed from: f */
    public final FinishCodeReceiver f2816f;

    /* renamed from: g */
    public final InternalPaylibRouter f2817g;

    /* renamed from: h */
    public final PaylibLogger f2818h;

    /* renamed from: i */
    public final PackageManager f2819i;

    /* renamed from: j */
    public List f2820j;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2821a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8269d.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo15381getSbpBanksIoAF18A;
            Object value;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2821a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BanksInteractor banksInteractor = C8269d.this.f2814d;
                this.f2821a = 1;
                objMo15381getSbpBanksIoAF18A = banksInteractor.mo15381getSbpBanksIoAF18A(this);
                if (objMo15381getSbpBanksIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo15381getSbpBanksIoAF18A = ((Result) obj).getValue();
            }
            C8269d c8269d = C8269d.this;
            if (Result.m15706isSuccessimpl(objMo15381getSbpBanksIoAF18A)) {
                List list = (List) objMo15381getSbpBanksIoAF18A;
                InterfaceC8271f interfaceC8271fM2603c = c8269d.m2603c(list);
                c8269d.m2597a(interfaceC8271fM2603c);
                MutableStateFlow mutableStateFlowM2002b = c8269d.m2002b();
                do {
                    value = mutableStateFlowM2002b.getValue();
                } while (!mutableStateFlowM2002b.compareAndSet(value, interfaceC8271fM2603c));
                c8269d.m2599a(list);
            }
            C8269d c8269d2 = C8269d.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo15381getSbpBanksIoAF18A);
            if (thM15702exceptionOrNullimpl != null) {
                c8269d2.m2598a(thM15702exceptionOrNullimpl, AbstractC8128b.g.f1939a, false, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.d$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ List f2823a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f2823a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unknown packages detected! List: " + this.f2823a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f2824a;

        /* renamed from: c */
        public final /* synthetic */ String f2826c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.f2826c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8269d.this.new c(this.f2826c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objMo2036a;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2824a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8269d.this.m2609i();
                InterfaceC8142a interfaceC8142a = C8269d.this.f2815e;
                String str = this.f2826c;
                this.f2824a = 1;
                objMo2036a = interfaceC8142a.mo2036a(str, this);
                if (objMo2036a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo2036a = ((Result) obj).getValue();
            }
            C8269d c8269d = C8269d.this;
            if (Result.m15706isSuccessimpl(objMo2036a)) {
                c8269d.f2817g.mo2499d();
            }
            C8269d c8269d2 = C8269d.this;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objMo2036a);
            if (thM15702exceptionOrNullimpl != null) {
                C8269d.m2589a(c8269d2, thM15702exceptionOrNullimpl, AbstractC8369f.m3449a(thM15702exceptionOrNullimpl, false, 1, (Object) null), false, false, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.d$d */
    /* loaded from: classes8.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(((C8266a.a) obj2).m2559f()), Boolean.valueOf(((C8266a.a) obj).m2559f()));
        }
    }

    public C8269d(InterfaceC8097f analytics, InterfaceC8131b config, Context context, BanksInteractor banksInteractor, InterfaceC8142a openBankAppInteractor, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter router, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(banksInteractor, "banksInteractor");
        Intrinsics.checkNotNullParameter(openBankAppInteractor, "openBankAppInteractor");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2812b = analytics;
        this.f2813c = config;
        this.f2814d = banksInteractor;
        this.f2815e = openBankAppInteractor;
        this.f2816f = finishCodeReceiver;
        this.f2817g = router;
        this.f2818h = loggerFactory.get("BanksViewModel");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        this.f2819i = packageManager;
        this.f2820j = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.common.viewmodel.AbstractC8129a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC8271f mo1999a() {
        return new C8272g(false);
    }

    /* renamed from: e */
    public final void m2605e() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    /* renamed from: f */
    public final void m2606f() {
        InternalPaylibRouter.DefaultImpls.pushInvoiceDetailsScreen$default(this.f2817g, null, 1, null);
    }

    /* renamed from: g */
    public final void m2607g() {
        FinishCodeReceiver.DefaultImpls.notifyPaymentComplete$default(this.f2816f, null, 1, null);
        this.f2817g.mo2485a();
    }

    /* renamed from: h */
    public final void m2608h() {
        String strMo2037a = this.f2815e.mo2037a();
        if (strMo2037a != null) {
            m2602b(strMo2037a);
        } else {
            m2589a(this, DefaultPaymentException.f2386a, AbstractC8128b.a.f1932a, false, false, 4, null);
        }
    }

    /* renamed from: i */
    public final void m2609i() {
        Object value;
        MutableStateFlow mutableStateFlowM2002b = m2002b();
        do {
            value = mutableStateFlowM2002b.getValue();
        } while (!mutableStateFlowM2002b.compareAndSet(value, new C8272g(this.f2813c.isSandbox())));
    }

    /* renamed from: c */
    public final InterfaceC8271f m2603c(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SbpBankInfo sbpBankInfo = (SbpBankInfo) it.next();
            arrayList.add(new C8266a.a(sbpBankInfo.getTitle(), sbpBankInfo.getIconUrl(), sbpBankInfo.getPackageName(), m2600a(sbpBankInfo.getPackageName()), sbpBankInfo.getSchemaDeeplink(), false));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C8266a.a aVar = (C8266a.a) next;
            if (this.f2813c.isPaylibSbpAllBanksEnabled() || aVar.m2559f()) {
                arrayList2.add(next);
            }
        }
        List listM2601b = m2601b(CollectionsKt___CollectionsKt.sortedWith(arrayList2, new d()));
        return listM2601b.isEmpty() ? new C8273h(this.f2813c.isSandbox()) : new C8266a(listM2601b, this.f2813c.isSandbox());
    }

    /* renamed from: a */
    public final void m2596a(C8266a.a app) {
        Intrinsics.checkNotNullParameter(app, "app");
        if (app.m2559f()) {
            AbstractC8096e.m1795a(this.f2812b, app.m2558e(), app.m2555b(), this.f2820j);
            m2602b(app.m2556c());
        }
    }

    /* renamed from: b */
    public final List m2601b(List list) {
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        Iterator it = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (!((C8266a.a) it.next()).m2559f()) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            mutableList.set(i, C8266a.a.m2552a((C8266a.a) mutableList.get(i), null, null, null, false, null, true, 31, null));
        }
        return mutableList;
    }

    /* renamed from: b */
    public final void m2602b(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(str, null), 3, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m2589a(C8269d c8269d, Throwable th, AbstractC8128b abstractC8128b, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC8128b = AbstractC8369f.m3449a(th, false, 1, (Object) null);
        }
        if ((i & 4) != 0) {
            z = true;
        }
        c8269d.m2598a(th, abstractC8128b, z, z2);
    }

    /* renamed from: a */
    public final void m2597a(InterfaceC8271f interfaceC8271f) {
        if ((interfaceC8271f instanceof C8273h) || (interfaceC8271f instanceof C8272g) || !(interfaceC8271f instanceof C8266a)) {
            return;
        }
        List listM2551a = ((C8266a) interfaceC8271f).m2551a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2551a) {
            if (((C8266a.a) obj).m2559f()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C8266a.a) it.next()).m2555b());
        }
        this.f2820j = arrayList2;
    }

    /* renamed from: a */
    public final void m2598a(Throwable th, AbstractC8128b abstractC8128b, boolean z, boolean z2) {
        C8269d c8269d;
        AbstractC8338b.a aVar;
        EnumC8262b enumC8262b = th instanceof BankOpenUnavailableException ? EnumC8262b.NONE : EnumC8262b.BANKS;
        if (z2) {
            aVar = new AbstractC8338b.a(C11403R.string.paylib_native_select_bank_for_payment);
            c8269d = this;
        } else {
            c8269d = this;
            aVar = null;
        }
        c8269d.f2817g.mo2491a(new C8340d(aVar, AbstractC8369f.m3454a(th, (String) null, 1, (Object) null), new C8261a(enumC8262b, abstractC8128b), z, EnumC8105d.UNHANDLED_FORM_ERROR, null, 32, null));
    }

    /* renamed from: a */
    public final void m2599a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SbpBankInfo sbpBankInfo = (SbpBankInfo) it.next();
            String packageName = sbpBankInfo.isKnownPackage() ? null : sbpBankInfo.getPackageName();
            if (packageName != null) {
                arrayList.add(packageName);
            }
        }
        if (!arrayList.isEmpty()) {
            PaylibLogger.DefaultImpls.e$default(this.f2818h, null, new b(arrayList), 1, null);
            AbstractC8096e.m1798a(this.f2812b, arrayList);
        }
    }

    /* renamed from: a */
    public final boolean m2600a(String str) throws PackageManager.NameNotFoundException {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                this.f2819i.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            } else {
                this.f2819i.getPackageInfo(str, 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
