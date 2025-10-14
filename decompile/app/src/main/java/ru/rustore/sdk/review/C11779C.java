package ru.rustore.sdk.review;

import android.content.Context;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsClient;

/* renamed from: ru.rustore.sdk.review.C */
/* loaded from: classes5.dex */
public final class C11779C {

    /* renamed from: h */
    public static volatile C11779C f10987h;

    /* renamed from: a */
    public final Context f10988a;

    /* renamed from: b */
    public final Map<String, Object> f10989b;

    /* renamed from: c */
    public final Lazy f10990c = LazyKt__LazyJVMKt.lazy(new c());

    /* renamed from: d */
    public final Lazy f10991d = LazyKt__LazyJVMKt.lazy(new e());

    /* renamed from: e */
    public final Lazy f10992e = LazyKt__LazyJVMKt.lazy(d.f10997a);

    /* renamed from: f */
    public final Lazy f10993f = LazyKt__LazyJVMKt.lazy(new b());

    /* renamed from: g */
    public final Lazy f10994g = LazyKt__LazyJVMKt.lazy(new f());

    /* renamed from: ru.rustore.sdk.review.C$a */
    public static final class a {
    }

    /* renamed from: ru.rustore.sdk.review.C$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0<MetricsClient> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MetricsClient invoke() {
            return MetricsClient.INSTANCE.getInstance(C11779C.this.f10988a);
        }
    }

    /* renamed from: ru.rustore.sdk.review.C$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0<C11787f> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11787f invoke() {
            return new C11787f((C11793l) C11779C.this.f10991d.getValue(), (C11806y) C11779C.this.f10994g.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.review.C$d */
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements Function0<C11789h> {

        /* renamed from: a */
        public static final d f10997a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11789h invoke() {
            return new C11789h();
        }
    }

    /* renamed from: ru.rustore.sdk.review.C$e */
    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements Function0<C11793l> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11793l invoke() {
            return new C11793l((C11789h) C11779C.this.f10992e.getValue(), (MetricsClient) C11779C.this.f10993f.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.review.C$f */
    /* loaded from: classes8.dex */
    public static final class f extends Lambda implements Function0<C11806y> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11806y invoke() {
            return new C11806y(new C11807z(), new C11777A(C11779C.this.f10989b), new C11778B());
        }
    }

    public C11779C(Context context, Map map) {
        this.f10988a = context;
        this.f10989b = map;
    }
}
