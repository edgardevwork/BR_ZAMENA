package com.sdkit.paylib.payliblogging.impl.logging;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;

/* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c */
/* loaded from: classes5.dex */
public final class C8080c implements PaylibLogger {

    /* renamed from: a */
    public final PaylibLoggingConfig f1579a;

    /* renamed from: b */
    public final ExternalPaylibLogger f1580b;

    /* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a */
        public static final a f1581a = new a();

        public a() {
            super(3, ExternalPaylibLogger.class, "d", "d(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: a */
        public final void m1717a(ExternalPaylibLogger p0, Throwable th, Function0 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            p0.mo1695d(th, p2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m1717a((ExternalPaylibLogger) obj, (Throwable) obj2, (Function0) obj3);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a */
        public static final b f1582a = new b();

        public b() {
            super(3, ExternalPaylibLogger.class, "e", "e(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: a */
        public final void m1718a(ExternalPaylibLogger p0, Throwable th, Function0 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            p0.mo1696e(th, p2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m1718a((ExternalPaylibLogger) obj, (Throwable) obj2, (Function0) obj3);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a */
        public static final c f1583a = new c();

        public c() {
            super(3, ExternalPaylibLogger.class, "i", "i(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: a */
        public final void m1719a(ExternalPaylibLogger p0, Throwable th, Function0 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            p0.mo1697i(th, p2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m1719a((ExternalPaylibLogger) obj, (Throwable) obj2, (Function0) obj3);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Function0 f1584a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f1584a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "[SANDBOX] " + ((String) this.f1584a.invoke());
        }
    }

    /* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c$e */
    /* loaded from: classes8.dex */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a */
        public static final e f1585a = new e();

        public e() {
            super(3, ExternalPaylibLogger.class, "v", "v(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: a */
        public final void m1721a(ExternalPaylibLogger p0, Throwable th, Function0 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            p0.mo1698v(th, p2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m1721a((ExternalPaylibLogger) obj, (Throwable) obj2, (Function0) obj3);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.payliblogging.impl.logging.c$f */
    /* loaded from: classes8.dex */
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a */
        public static final f f1586a = new f();

        public f() {
            super(3, ExternalPaylibLogger.class, "w", "w(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        /* renamed from: a */
        public final void m1722a(ExternalPaylibLogger p0, Throwable th, Function0 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            p0.mo1699w(th, p2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m1722a((ExternalPaylibLogger) obj, (Throwable) obj2, (Function0) obj3);
            return Unit.INSTANCE;
        }
    }

    public C8080c(PaylibLoggingConfig paylibLoggingConfig, ExternalPaylibLogger externalPaylibLogger) {
        this.f1579a = paylibLoggingConfig;
        this.f1580b = externalPaylibLogger;
    }

    /* renamed from: a */
    public final void m1715a(KFunction kFunction, Throwable th, Function0 function0) {
        if (this.f1580b != null) {
            if (m1716a()) {
                function0 = new d(function0);
            }
            ((Function3) kFunction).invoke(this.f1580b, th, function0);
        }
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLogger
    /* renamed from: d */
    public void mo1700d(Throwable th, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m1715a(a.f1581a, th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLogger
    /* renamed from: e */
    public void mo1701e(Throwable th, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m1715a(b.f1582a, th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLogger
    /* renamed from: i */
    public void mo1702i(Throwable th, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m1715a(c.f1583a, th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLogger
    /* renamed from: v */
    public void mo1703v(Throwable th, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m1715a(e.f1585a, th, message);
    }

    @Override // com.sdkit.paylib.payliblogging.api.logging.PaylibLogger
    /* renamed from: w */
    public void mo1704w(Throwable th, Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m1715a(f.f1586a, th, message);
    }

    /* renamed from: a */
    public final boolean m1716a() {
        PaylibLoggingConfig paylibLoggingConfig = this.f1579a;
        return paylibLoggingConfig != null && paylibLoggingConfig.isSandbox();
    }
}
