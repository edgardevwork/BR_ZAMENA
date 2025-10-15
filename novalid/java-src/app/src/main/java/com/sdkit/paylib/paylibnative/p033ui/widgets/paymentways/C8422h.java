package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.AbstractC8096e;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8371f;
import com.sdkit.paylib.paylibnative.p033ui.utils.C8363e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8379a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8380b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.C8385b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8392e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8403a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8404b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.AbstractC8420f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.viewobjects.C8426a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.AbstractC8427a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8429c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8430d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.AbstractC8449e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8445a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8446b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8450a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8452c;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaymentWay;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h */
/* loaded from: classes6.dex */
public final class C8422h implements InterfaceC8421g {

    /* renamed from: a */
    public final InvoiceHolder f3908a;

    /* renamed from: b */
    public final InterfaceC8097f f3909b;

    /* renamed from: c */
    public final InternalPaylibRouter f3910c;

    /* renamed from: d */
    public final InterfaceC8430d f3911d;

    /* renamed from: e */
    public final InterfaceC8380b f3912e;

    /* renamed from: f */
    public final InterfaceC8446b f3913f;

    /* renamed from: g */
    public final InterfaceC8404b f3914g;

    /* renamed from: h */
    public final InterfaceC8452c f3915h;

    /* renamed from: i */
    public final InterfaceC8392e f3916i;

    /* renamed from: j */
    public final InterfaceC8412a f3917j;

    /* renamed from: k */
    public final InterfaceC8238l f3918k;

    /* renamed from: l */
    public final CoroutineScope f3919l;

    /* renamed from: m */
    public final MutableSharedFlow f3920m;

    /* renamed from: n */
    public final MutableSharedFlow f3921n;

    /* renamed from: o */
    public final MutableStateFlow f3922o;

    /* renamed from: p */
    public final MutableSharedFlow f3923p;

    /* renamed from: q */
    public List f3924q;

    /* renamed from: r */
    public final Mutex f3925r;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3926a;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3926a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public Object f3927a;

        /* renamed from: b */
        public Object f3928b;

        /* renamed from: c */
        public /* synthetic */ Object f3929c;

        /* renamed from: e */
        public int f3931e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3929c = obj;
            this.f3931e |= Integer.MIN_VALUE;
            return C8422h.this.m3684a((InterfaceC8419e.a) null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: a */
        public Object f3932a;

        /* renamed from: b */
        public Object f3933b;

        /* renamed from: c */
        public Object f3934c;

        /* renamed from: d */
        public /* synthetic */ Object f3935d;

        /* renamed from: f */
        public int f3937f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3935d = obj;
            this.f3937f |= Integer.MIN_VALUE;
            return C8422h.this.m3685a((List) null, this);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$d */
    /* loaded from: classes7.dex */
    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public Object f3938a;

        /* renamed from: b */
        public Object f3939b;

        /* renamed from: c */
        public int f3940c;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8422h.this.new d(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: all -> 0x0032, LOOP:0: B:29:0x0087->B:31:0x008d, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:15:0x002e, B:28:0x0076, B:29:0x0087, B:31:0x008d, B:32:0x009b, B:33:0x00bc, B:35:0x00c2, B:39:0x00d1, B:41:0x00d5, B:43:0x00de, B:45:0x00e4, B:46:0x00eb), top: B:58:0x002e }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:15:0x002e, B:28:0x0076, B:29:0x0087, B:31:0x008d, B:32:0x009b, B:33:0x00bc, B:35:0x00c2, B:39:0x00d1, B:41:0x00d5, B:43:0x00de, B:45:0x00e4, B:46:0x00eb), top: B:58:0x002e }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:15:0x002e, B:28:0x0076, B:29:0x0087, B:31:0x008d, B:32:0x009b, B:33:0x00bc, B:35:0x00c2, B:39:0x00d1, B:41:0x00d5, B:43:0x00de, B:45:0x00e4, B:46:0x00eb), top: B:58:0x002e }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00d0 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C8422h c8422h;
            Mutex mutex;
            Mutex mutex2;
            List list;
            Iterator it;
            Iterator it2;
            Object next;
            C8426a c8426a;
            MutableStateFlow mutableStateFlowMo3664k;
            Mutex mutex3;
            InterfaceC8419e.a aVarM3707b;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3940c;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Mutex mutex4 = C8422h.this.f3925r;
                    c8422h = C8422h.this;
                    this.f3938a = mutex4;
                    this.f3939b = c8422h;
                    this.f3940c = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex4;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) this.f3938a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex3.unlock(null);
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        c8422h = (C8422h) this.f3939b;
                        mutex2 = (Mutex) this.f3938a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C8426a) it.next()).m3707b());
                            }
                            c8422h.f3924q = arrayList;
                            AbstractC8096e.m1796a(c8422h.f3909b, c8422h.f3918k.mo2350b(), AbstractC8371f.m3473a(c8422h.f3924q));
                            c8422h.m3687b(list);
                            it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (((C8426a) next).m3706a()) {
                                    break;
                                }
                            }
                            c8426a = (C8426a) next;
                            if (c8426a == null) {
                                c8426a = (C8426a) CollectionsKt___CollectionsKt.firstOrNull(list);
                            }
                            if (c8426a != null && (aVarM3707b = c8426a.m3707b()) != null) {
                                c8422h.f3917j.mo3644a(aVarM3707b);
                            }
                            mutableStateFlowMo3664k = c8422h.mo3664k();
                            this.f3938a = mutex2;
                            this.f3939b = null;
                            this.f3940c = 3;
                            if (mutableStateFlowMo3664k.emit(list, this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex3 = mutex2;
                            Unit unit2 = Unit.INSTANCE;
                            mutex3.unlock(null);
                            return unit2;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    c8422h = (C8422h) this.f3939b;
                    mutex = (Mutex) this.f3938a;
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC8419e.a aVar = (InterfaceC8419e.a) c8422h.f3917j.mo3643a().getValue();
                this.f3938a = mutex;
                this.f3939b = c8422h;
                this.f3940c = 2;
                obj = c8422h.m3684a(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                list = (List) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                }
                c8422h.f3924q = arrayList2;
                AbstractC8096e.m1796a(c8422h.f3909b, c8422h.f3918k.mo2350b(), AbstractC8371f.m3473a(c8422h.f3924q));
                c8422h.m3687b(list);
                it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                c8426a = (C8426a) next;
                if (c8426a == null) {
                }
                if (c8426a != null) {
                    c8422h.f3917j.mo3644a(aVarM3707b);
                }
                mutableStateFlowMo3664k = c8422h.mo3664k();
                this.f3938a = mutex2;
                this.f3939b = null;
                this.f3940c = 3;
                if (mutableStateFlowMo3664k.emit(list, this) != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$e */
    /* loaded from: classes7.dex */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3942a;

        /* renamed from: b */
        public /* synthetic */ Object f3943b;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8427a abstractC8427a, Continuation continuation) {
            return ((e) create(abstractC8427a, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = C8422h.this.new e(continuation);
            eVar.f3943b = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutableSharedFlow mutableSharedFlowMo3669i;
            AbstractC8128b.h hVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3942a;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        mutableSharedFlowMo3669i = C8422h.this.mo3669i();
                        hVar = AbstractC8128b.h.f1940a;
                        this.f3942a = 4;
                        if (mutableSharedFlowMo3669i.emit(hVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC8427a abstractC8427a = (AbstractC8427a) this.f3943b;
                if (abstractC8427a instanceof AbstractC8427a.b) {
                    MutableSharedFlow mutableSharedFlowMo3671l = C8422h.this.mo3671l();
                    AbstractC8420f.c cVar = AbstractC8420f.c.f3907a;
                    this.f3942a = 1;
                    if (mutableSharedFlowMo3671l.emit(cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (abstractC8427a instanceof AbstractC8427a.a) {
                    MutableSharedFlow mutableSharedFlowMo3671l2 = C8422h.this.mo3671l();
                    AbstractC8420f.a aVar = new AbstractC8420f.a(((AbstractC8427a.a) abstractC8427a).mo2235a());
                    this.f3942a = 3;
                    if (mutableSharedFlowMo3671l2.emit(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableSharedFlowMo3669i = C8422h.this.mo3669i();
                    hVar = AbstractC8128b.h.f1940a;
                    this.f3942a = 4;
                    if (mutableSharedFlowMo3669i.emit(hVar, this) == coroutine_suspended) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$f */
    /* loaded from: classes7.dex */
    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3945a;

        /* renamed from: b */
        public /* synthetic */ Object f3946b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8385b c8385b, Continuation continuation) {
            return ((f) create(c8385b, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = C8422h.this.new f(continuation);
            fVar.f3946b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3945a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8385b c8385b = (C8385b) this.f3946b;
                MutableSharedFlow mutableSharedFlowMo3669i = C8422h.this.mo3669i();
                AbstractC8128b abstractC8128bM3513a = c8385b.m3513a();
                this.f3945a = 1;
                if (mutableSharedFlowMo3669i.emit(abstractC8128bM3513a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$g */
    /* loaded from: classes7.dex */
    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3948a;

        /* renamed from: b */
        public /* synthetic */ Object f3949b;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8449e abstractC8449e, Continuation continuation) {
            return ((g) create(abstractC8449e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            g gVar = C8422h.this.new g(continuation);
            gVar.f3949b = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutableSharedFlow mutableSharedFlowMo3669i;
            AbstractC8128b.h hVar;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3948a;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        mutableSharedFlowMo3669i = C8422h.this.mo3669i();
                        hVar = AbstractC8128b.h.f1940a;
                        this.f3948a = 4;
                        if (mutableSharedFlowMo3669i.emit(hVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC8449e abstractC8449e = (AbstractC8449e) this.f3949b;
                if (abstractC8449e instanceof AbstractC8449e.c) {
                    MutableSharedFlow mutableSharedFlowMo3671l = C8422h.this.mo3671l();
                    AbstractC8420f.c cVar = AbstractC8420f.c.f3907a;
                    this.f3948a = 1;
                    if (mutableSharedFlowMo3671l.emit(cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (abstractC8449e instanceof AbstractC8449e.b) {
                    MutableSharedFlow mutableSharedFlowMo3671l2 = C8422h.this.mo3671l();
                    AbstractC8420f.b bVar = AbstractC8420f.b.f3906a;
                    this.f3948a = 2;
                    if (mutableSharedFlowMo3671l2.emit(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (abstractC8449e instanceof AbstractC8449e.a) {
                    MutableSharedFlow mutableSharedFlowMo3671l3 = C8422h.this.mo3671l();
                    AbstractC8420f.a aVar = new AbstractC8420f.a(((AbstractC8449e.a) abstractC8449e).mo2235a());
                    this.f3948a = 3;
                    if (mutableSharedFlowMo3671l3.emit(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableSharedFlowMo3669i = C8422h.this.mo3669i();
                    hVar = AbstractC8128b.h.f1940a;
                    this.f3948a = 4;
                    if (mutableSharedFlowMo3669i.emit(hVar, this) == coroutine_suspended) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$h */
    /* loaded from: classes7.dex */
    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3951a;

        /* renamed from: b */
        public /* synthetic */ Object f3952b;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8419e.a aVar, Continuation continuation) {
            return ((h) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            h hVar = C8422h.this.new h(continuation);
            hVar.f3952b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3951a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC8419e.a aVar = (InterfaceC8419e.a) this.f3952b;
                C8422h c8422h = C8422h.this;
                this.f3951a = 1;
                obj = c8422h.m3684a(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            C8422h.this.mo3664k().setValue(list);
            MutableSharedFlow mutableSharedFlowMo3665m = C8422h.this.mo3665m();
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((C8426a) it.next()).m3706a()) {
                    break;
                }
                i2++;
            }
            Integer numBoxInt = Boxing.boxInt(i2);
            this.f3951a = 2;
            if (mutableSharedFlowMo3665m.emit(numBoxInt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$i */
    /* loaded from: classes7.dex */
    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3954a;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8422h.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3954a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlowMo3665m = C8422h.this.mo3665m();
                Iterator it = ((List) C8422h.this.mo3664k().getValue()).iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (((C8426a) it.next()).m3706a()) {
                        break;
                    }
                    i2++;
                }
                Integer numBoxInt = Boxing.boxInt(i2);
                this.f3954a = 1;
                if (mutableSharedFlowMo3665m.emit(numBoxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$j */
    /* loaded from: classes7.dex */
    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: a */
        public int f3956a;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C8422h.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3956a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8422h.this.mo3664k().setValue(CollectionsKt__CollectionsKt.emptyList());
                MutableSharedFlow mutableSharedFlowMo3669i = C8422h.this.mo3669i();
                AbstractC8128b.a aVar = AbstractC8128b.a.f1932a;
                this.f3956a = 1;
                if (mutableSharedFlowMo3669i.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.h$k */
    public static final class k extends ContinuationImpl {

        /* renamed from: a */
        public Object f3958a;

        /* renamed from: b */
        public Object f3959b;

        /* renamed from: c */
        public /* synthetic */ Object f3960c;

        /* renamed from: e */
        public int f3962e;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3960c = obj;
            this.f3962e |= Integer.MIN_VALUE;
            return C8422h.this.mo3666a(this);
        }
    }

    public C8422h(InvoiceHolder invoiceHolder, InterfaceC8097f analytics, InternalPaylibRouter router, CoroutineDispatchers coroutineDispatchers, InterfaceC8430d sbolPayWidgetHandler, InterfaceC8380b bistroWidgetHandler, InterfaceC8446b tBankWidgetHandler, InterfaceC8404b mobileWidgetHandler, InterfaceC8452c webPayWidgetHandler, InterfaceC8392e cardPayWidgetHandler, InterfaceC8412a paymentWaySelector, InterfaceC8238l paylibStateManager) {
        Intrinsics.checkNotNullParameter(invoiceHolder, "invoiceHolder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(sbolPayWidgetHandler, "sbolPayWidgetHandler");
        Intrinsics.checkNotNullParameter(bistroWidgetHandler, "bistroWidgetHandler");
        Intrinsics.checkNotNullParameter(tBankWidgetHandler, "tBankWidgetHandler");
        Intrinsics.checkNotNullParameter(mobileWidgetHandler, "mobileWidgetHandler");
        Intrinsics.checkNotNullParameter(webPayWidgetHandler, "webPayWidgetHandler");
        Intrinsics.checkNotNullParameter(cardPayWidgetHandler, "cardPayWidgetHandler");
        Intrinsics.checkNotNullParameter(paymentWaySelector, "paymentWaySelector");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        this.f3908a = invoiceHolder;
        this.f3909b = analytics;
        this.f3910c = router;
        this.f3911d = sbolPayWidgetHandler;
        this.f3912e = bistroWidgetHandler;
        this.f3913f = tBankWidgetHandler;
        this.f3914g = mobileWidgetHandler;
        this.f3915h = webPayWidgetHandler;
        this.f3916i = cardPayWidgetHandler;
        this.f3917j = paymentWaySelector;
        this.f3918k = paylibStateManager;
        this.f3919l = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.getDefault()));
        this.f3920m = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3921n = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f3922o = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.f3923p = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f3924q = CollectionsKt__CollectionsKt.emptyList();
        this.f3925r = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: b */
    public InterfaceC8450a mo3658b() {
        return this.f3915h;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: e */
    public InterfaceC8387d mo3660e() {
        return this.f3916i;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: f */
    public InterfaceC8379a mo3661f() {
        return this.f3912e;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: g */
    public InterfaceC8403a mo3662g() {
        return this.f3914g;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: h */
    public InterfaceC8429c mo3663h() {
        return this.f3911d;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e
    /* renamed from: j */
    public void mo3670j() {
        m3695u();
        m3692r();
        m3693s();
        m3694t();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow mo3669i() {
        return this.f3923p;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow mo3664k() {
        return this.f3922o;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    public void onStart() {
        BuildersKt__Builders_commonKt.launch$default(this.f3919l, null, null, new i(null), 3, null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow mo3671l() {
        return this.f3920m;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow mo3665m() {
        return this.f3921n;
    }

    /* renamed from: r */
    public final void m3692r() {
        BuildersKt__Builders_commonKt.launch$default(this.f3919l, null, null, new d(null), 3, null);
    }

    /* renamed from: s */
    public final void m3693s() {
        FlowKt.launchIn(FlowKt.onEach(this.f3911d.mo3710d(), new e(null)), this.f3919l);
        FlowKt.launchIn(FlowKt.onEach(this.f3916i.mo3512f(), new f(null)), this.f3919l);
        FlowKt.launchIn(FlowKt.onEach(this.f3913f.mo3737h(), new g(null)), this.f3919l);
    }

    /* renamed from: t */
    public final void m3694t() {
        FlowKt.launchIn(FlowKt.onEach(this.f3917j.mo3643a(), new h(null)), this.f3919l);
    }

    /* renamed from: u */
    public final void m3695u() {
        BuildersKt__Builders_commonKt.launch$default(this.f3919l, null, null, new j(null), 3, null);
    }

    /* renamed from: a */
    public final InterfaceC8424j m3683a(InterfaceC8419e.a aVar) {
        switch (a.f3926a[aVar.ordinal()]) {
            case 1:
                return this.f3915h;
            case 2:
                return this.f3916i;
            case 3:
                return this.f3911d;
            case 4:
                return this.f3912e;
            case 5:
                return this.f3913f;
            case 6:
                return this.f3914g;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e
    /* renamed from: c */
    public void mo3668c() {
        InterfaceC8419e.a aVar = (InterfaceC8419e.a) this.f3917j.mo3643a().getValue();
        if (aVar != null) {
            m3683a(aVar).mo3490c();
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8418d
    /* renamed from: d */
    public InterfaceC8445a mo3659d() {
        return this.f3913f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3684a(InterfaceC8419e.a aVar, Continuation continuation) throws Throwable {
        b bVar;
        C8422h c8422h;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f3931e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f3931e = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object objFirst = bVar.f3929c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = bVar.f3931e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<Invoice> invoice = this.f3908a.getInvoice();
            bVar.f3927a = this;
            bVar.f3928b = aVar;
            bVar.f3931e = 1;
            objFirst = FlowKt.first(invoice, bVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8422h = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (InterfaceC8419e.a) bVar.f3927a;
                ResultKt.throwOnFailure(objFirst);
                Iterable iterable = (Iterable) objFirst;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                int i4 = 0;
                for (Object obj : iterable) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    InterfaceC8419e.a aVar2 = (InterfaceC8419e.a) obj;
                    arrayList.add(new C8426a(aVar2, aVar == null ? i4 == 0 : aVar == aVar2));
                    i4 = i5;
                }
                return arrayList;
            }
            aVar = (InterfaceC8419e.a) bVar.f3928b;
            c8422h = (C8422h) bVar.f3927a;
            ResultKt.throwOnFailure(objFirst);
        }
        List<PaymentWay> paymentWays = ((Invoice) objFirst).getPaymentWays();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = paymentWays.iterator();
        while (it.hasNext()) {
            PaymentWay.Type type = ((PaymentWay) it.next()).getType();
            if (type != null) {
                arrayList2.add(type);
            }
        }
        bVar.f3927a = aVar;
        bVar.f3928b = null;
        bVar.f3931e = 2;
        objFirst = c8422h.m3685a(arrayList2, bVar);
        if (objFirst == coroutine_suspended) {
            return coroutine_suspended;
        }
        Iterable iterable2 = (Iterable) objFirst;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        int i42 = 0;
        while (r9.hasNext()) {
        }
        return arrayList3;
    }

    /* renamed from: b */
    public final void m3687b(List list) {
        boolean zM3686a = m3686a(list);
        if (this.f3924q.contains(InterfaceC8419e.a.SBOLPAY)) {
            this.f3911d.mo3709a(zM3686a);
        }
        if (this.f3924q.contains(InterfaceC8419e.a.BISTRO)) {
            this.f3912e.mo3485a(zM3686a);
        }
        if (this.f3924q.contains(InterfaceC8419e.a.TBANK)) {
            this.f3913f.mo3735a(zM3686a);
        }
        if (this.f3924q.contains(InterfaceC8419e.a.MOBILE)) {
            this.f3914g.mo3602a(zM3686a);
        }
        this.f3916i.mo3511a(zM3686a);
        this.f3915h.mo3771a(zM3686a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3685a(List list, Continuation continuation) throws Throwable {
        c cVar;
        C8422h c8422h;
        List list2;
        List list3;
        List list4;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f3937f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f3937f = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        }
        Object objMo3509a = cVar.f3935d;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (cVar.f3937f) {
            case 0:
                ResultKt.throwOnFailure(objMo3509a);
                ArrayList arrayList = new ArrayList();
                InterfaceC8452c interfaceC8452c = this.f3915h;
                cVar.f3932a = this;
                cVar.f3933b = list;
                cVar.f3934c = arrayList;
                cVar.f3937f = 1;
                Object objMo3772c = interfaceC8452c.mo3772c(cVar);
                if (objMo3772c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8422h = this;
                list2 = list;
                list3 = arrayList;
                objMo3509a = objMo3772c;
                if (((Boolean) objMo3509a).booleanValue()) {
                    list3.add(InterfaceC8419e.a.WEBPAY);
                }
                InterfaceC8392e interfaceC8392e = c8422h.f3916i;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 2;
                objMo3509a = interfaceC8392e.mo3509a(cVar);
                if (objMo3509a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                    list3.add(InterfaceC8419e.a.CARD);
                }
                InterfaceC8446b interfaceC8446b = c8422h.f3913f;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 3;
                objMo3509a = interfaceC8446b.mo3736b(cVar);
                if (objMo3509a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                    list3.add(InterfaceC8419e.a.TBANK);
                }
                InterfaceC8404b interfaceC8404b = c8422h.f3914g;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 4;
                objMo3509a = interfaceC8404b.mo3603e(cVar);
                if (objMo3509a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                    list3.add(InterfaceC8419e.a.MOBILE);
                }
                InterfaceC8380b interfaceC8380b = c8422h.f3912e;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 5;
                objMo3509a = interfaceC8380b.mo3486d(cVar);
                if (objMo3509a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                    list3.add(InterfaceC8419e.a.BISTRO);
                }
                InterfaceC8430d interfaceC8430d = c8422h.f3911d;
                cVar.f3932a = list2;
                cVar.f3933b = list3;
                cVar.f3934c = null;
                cVar.f3937f = 6;
                objMo3509a = interfaceC8430d.mo3711f(cVar);
                if (objMo3509a != coroutine_suspended) {
                    return coroutine_suspended;
                }
                list4 = list2;
                if (((Boolean) objMo3509a).booleanValue()) {
                    list3.add(InterfaceC8419e.a.SBOLPAY);
                }
                return C8363e.m3434a(list3, list4);
            case 1:
                list3 = (List) cVar.f3934c;
                list2 = (List) cVar.f3933b;
                c8422h = (C8422h) cVar.f3932a;
                ResultKt.throwOnFailure(objMo3509a);
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8392e interfaceC8392e2 = c8422h.f3916i;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 2;
                objMo3509a = interfaceC8392e2.mo3509a(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8446b interfaceC8446b2 = c8422h.f3913f;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 3;
                objMo3509a = interfaceC8446b2.mo3736b(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8404b interfaceC8404b2 = c8422h.f3914g;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 4;
                objMo3509a = interfaceC8404b2.mo3603e(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8380b interfaceC8380b2 = c8422h.f3912e;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 5;
                objMo3509a = interfaceC8380b2.mo3486d(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8430d interfaceC8430d2 = c8422h.f3911d;
                cVar.f3932a = list2;
                cVar.f3933b = list3;
                cVar.f3934c = null;
                cVar.f3937f = 6;
                objMo3509a = interfaceC8430d2.mo3711f(cVar);
                if (objMo3509a != coroutine_suspended) {
                }
                break;
            case 2:
                list3 = (List) cVar.f3934c;
                list2 = (List) cVar.f3933b;
                c8422h = (C8422h) cVar.f3932a;
                ResultKt.throwOnFailure(objMo3509a);
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8446b interfaceC8446b22 = c8422h.f3913f;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 3;
                objMo3509a = interfaceC8446b22.mo3736b(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8404b interfaceC8404b22 = c8422h.f3914g;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 4;
                objMo3509a = interfaceC8404b22.mo3603e(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8380b interfaceC8380b22 = c8422h.f3912e;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 5;
                objMo3509a = interfaceC8380b22.mo3486d(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8430d interfaceC8430d22 = c8422h.f3911d;
                cVar.f3932a = list2;
                cVar.f3933b = list3;
                cVar.f3934c = null;
                cVar.f3937f = 6;
                objMo3509a = interfaceC8430d22.mo3711f(cVar);
                if (objMo3509a != coroutine_suspended) {
                }
                break;
            case 3:
                list3 = (List) cVar.f3934c;
                list2 = (List) cVar.f3933b;
                c8422h = (C8422h) cVar.f3932a;
                ResultKt.throwOnFailure(objMo3509a);
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8404b interfaceC8404b222 = c8422h.f3914g;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 4;
                objMo3509a = interfaceC8404b222.mo3603e(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8380b interfaceC8380b222 = c8422h.f3912e;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 5;
                objMo3509a = interfaceC8380b222.mo3486d(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8430d interfaceC8430d222 = c8422h.f3911d;
                cVar.f3932a = list2;
                cVar.f3933b = list3;
                cVar.f3934c = null;
                cVar.f3937f = 6;
                objMo3509a = interfaceC8430d222.mo3711f(cVar);
                if (objMo3509a != coroutine_suspended) {
                }
                break;
            case 4:
                list3 = (List) cVar.f3934c;
                list2 = (List) cVar.f3933b;
                c8422h = (C8422h) cVar.f3932a;
                ResultKt.throwOnFailure(objMo3509a);
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8380b interfaceC8380b2222 = c8422h.f3912e;
                cVar.f3932a = c8422h;
                cVar.f3933b = list2;
                cVar.f3934c = list3;
                cVar.f3937f = 5;
                objMo3509a = interfaceC8380b2222.mo3486d(cVar);
                if (objMo3509a == coroutine_suspended) {
                }
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8430d interfaceC8430d2222 = c8422h.f3911d;
                cVar.f3932a = list2;
                cVar.f3933b = list3;
                cVar.f3934c = null;
                cVar.f3937f = 6;
                objMo3509a = interfaceC8430d2222.mo3711f(cVar);
                if (objMo3509a != coroutine_suspended) {
                }
                break;
            case 5:
                list3 = (List) cVar.f3934c;
                list2 = (List) cVar.f3933b;
                c8422h = (C8422h) cVar.f3932a;
                ResultKt.throwOnFailure(objMo3509a);
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                InterfaceC8430d interfaceC8430d22222 = c8422h.f3911d;
                cVar.f3932a = list2;
                cVar.f3933b = list3;
                cVar.f3934c = null;
                cVar.f3937f = 6;
                objMo3509a = interfaceC8430d22222.mo3711f(cVar);
                if (objMo3509a != coroutine_suspended) {
                }
                break;
            case 6:
                list3 = (List) cVar.f3933b;
                list4 = (List) cVar.f3932a;
                ResultKt.throwOnFailure(objMo3509a);
                if (((Boolean) objMo3509a).booleanValue()) {
                }
                return C8363e.m3434a(list3, list4);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo3666a(Continuation continuation) throws Throwable {
        k kVar;
        C8422h c8422h;
        Mutex mutex;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.f3962e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.f3962e = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        }
        Object obj = kVar.f3960c;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = kVar.f3962e;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.f3925r;
            kVar.f3958a = this;
            kVar.f3959b = mutex2;
            kVar.f3962e = 1;
            if (mutex2.lock(null, kVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c8422h = this;
            mutex = mutex2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) kVar.f3959b;
            c8422h = (C8422h) kVar.f3958a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            InterfaceC8419e.a aVar = (InterfaceC8419e.a) c8422h.f3917j.mo3643a().getValue();
            if (aVar != null) {
                c8422h.m3683a(aVar).mo3490c();
            } else {
                z = false;
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
            mutex.unlock(null);
            return boolBoxBoolean;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e
    /* renamed from: a */
    public void mo3667a() {
        this.f3911d.mo3708a();
        this.f3912e.mo3484a();
        this.f3913f.mo3734a();
        this.f3914g.mo3601a();
        this.f3916i.mo3510a();
        this.f3915h.mo3770a();
        CoroutineScopeKt.cancel$default(this.f3919l, null, 1, null);
    }

    /* renamed from: a */
    public final boolean m3686a(List list) {
        return list.size() == 1;
    }
}
