package com.sdkit.paylib.paylibdomain.impl.entity.mapper;

import com.sdkit.paylib.paylibdomain.impl.entity.PaylibDomainException;
import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithError;
import com.sdkit.paylib.paylibutils.lib.AbstractC8609a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b */
/* loaded from: classes6.dex */
public abstract class AbstractC8056b {

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$a */
    /* loaded from: classes7.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public Object f1226a;

        /* renamed from: b */
        public Object f1227b;

        /* renamed from: c */
        public Object f1228c;

        /* renamed from: d */
        public /* synthetic */ Object f1229d;

        /* renamed from: e */
        public int f1230e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1229d = obj;
            this.f1230e |= Integer.MIN_VALUE;
            Object objM1555b = AbstractC8056b.m1555b(null, null, null, null, this);
            return objM1555b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1555b : Result.m15698boximpl(objM1555b);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1231a;

        /* renamed from: b */
        public int f1232b;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1231a = obj;
            this.f1232b |= Integer.MIN_VALUE;
            Object objM1550a = AbstractC8056b.m1550a(null, null, this);
            return objM1550a == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1550a : Result.m15698boximpl(objM1550a);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class c extends PropertyReference1Impl {

        /* renamed from: a */
        public static final c f1233a = ;

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public Object get(Object obj) {
            return Integer.valueOf(((ResponseWithCode) obj).getCode());
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final d f1234a = new d();

        public d() {
            super(1, AbstractC8056b.class, "toDomainException", "toDomainException(Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithCode;)Lcom/sdkit/paylib/paylibdomain/impl/entity/PaylibDomainException;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PaylibDomainException invoke(ResponseWithCode p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return AbstractC8056b.m1552b(p0);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$e */
    /* loaded from: classes7.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1235a;

        /* renamed from: b */
        public int f1236b;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f1235a = obj;
            this.f1236b |= Integer.MIN_VALUE;
            Object objM1554b = AbstractC8056b.m1554b(null, null, this);
            return objM1554b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM1554b : Result.m15698boximpl(objM1554b);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$f */
    /* loaded from: classes7.dex */
    public static final class f extends Lambda implements Function1 {

        /* renamed from: a */
        public static final f f1237a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(ResponseWithError mapResponse) {
            Intrinsics.checkNotNullParameter(mapResponse, "$this$mapResponse");
            ErrorModel error = mapResponse.getError();
            if (error != null) {
                return Integer.valueOf(error.getCode());
            }
            return null;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.entity.mapper.b$g */
    /* loaded from: classes8.dex */
    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1 {

        /* renamed from: a */
        public static final g f1238a = new g();

        public g() {
            super(1, AbstractC8056b.class, "toDomainException", "toDomainException(Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;)Lcom/sdkit/paylib/paylibdomain/impl/entity/PaylibDomainException;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PaylibDomainException invoke(ResponseWithError p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return AbstractC8056b.m1553b(p0);
        }
    }

    /* renamed from: b */
    public static final PaylibDomainException m1552b(ResponseWithCode responseWithCode) {
        return new PaylibDomainException(responseWithCode.getMeta(), responseWithCode.getCode(), responseWithCode.getErrorMessage(), responseWithCode.getRu.rustore.sdk.activitylauncher.ActivityLauncherAnalytics.ERROR_DESCRIPTION java.lang.String());
    }

    /* renamed from: b */
    public static final PaylibDomainException m1553b(ResponseWithError responseWithError) {
        RequestMeta meta = responseWithError.getMeta();
        ErrorModel error = responseWithError.getError();
        int code = error != null ? error.getCode() : 0;
        ErrorModel error2 = responseWithError.getError();
        String userMessage = error2 != null ? error2.getUserMessage() : null;
        ErrorModel error3 = responseWithError.getError();
        return new PaylibDomainException(meta, code, userMessage, error3 != null ? error3.getDescription() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1550a(Function1 function1, Function1 function12, Continuation continuation) throws Throwable {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f1232b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f1232b = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        }
        Object obj = bVar.f1231a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f1232b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        c cVar = c.f1233a;
        d dVar = d.f1234a;
        bVar.f1232b = 1;
        Object objM1555b = m1555b(function1, cVar, function12, dVar, bVar);
        return objM1555b == coroutine_suspended ? coroutine_suspended : objM1555b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1554b(Function1 function1, Function1 function12, Continuation continuation) throws Throwable {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f1236b;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f1236b = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        }
        Object obj = eVar.f1235a;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f1236b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        f fVar = f.f1237a;
        g gVar = g.f1238a;
        eVar.f1236b = 1;
        Object objM1555b = m1555b(function1, fVar, function12, gVar, eVar);
        return objM1555b == coroutine_suspended ? coroutine_suspended : objM1555b;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1555b(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Continuation continuation) throws Throwable {
        a aVar;
        Object objM15699constructorimpl;
        Object obj;
        Object objInvoke;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f1230e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f1230e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object objInvoke2 = aVar.f1229d;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f1230e;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInvoke2);
                Result.Companion companion = Result.INSTANCE;
                aVar.f1226a = function12;
                aVar.f1227b = function13;
                aVar.f1228c = function14;
                aVar.f1230e = 1;
                objInvoke2 = function1.invoke(aVar);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function14 = (Function1) aVar.f1228c;
                function13 = (Function1) aVar.f1227b;
                function12 = (Function1) aVar.f1226a;
                ResultKt.throwOnFailure(objInvoke2);
            }
            Integer num = (Integer) function12.invoke(objInvoke2);
            obj = (num != null && num.intValue() == 0) ? objInvoke2 : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (obj == null || (objInvoke = function13.invoke(obj)) == null) {
            throw ((Throwable) function14.invoke(objInvoke2));
        }
        objM15699constructorimpl = Result.m15699constructorimpl(objInvoke);
        return AbstractC8609a.m4713a(objM15699constructorimpl);
    }
}
