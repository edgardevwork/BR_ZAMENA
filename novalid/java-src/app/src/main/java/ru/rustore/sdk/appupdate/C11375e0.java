package ru.rustore.sdk.appupdate;

import android.content.Context;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.metrics.MetricsClient;

/* renamed from: ru.rustore.sdk.appupdate.e0 */
/* loaded from: classes6.dex */
public final class C11375e0 {

    /* renamed from: i */
    @Nullable
    public static volatile C11375e0 f10091i;

    /* renamed from: a */
    @NotNull
    public final Context f10092a;

    /* renamed from: b */
    @Nullable
    public final Map<String, Object> f10093b;

    /* renamed from: c */
    @NotNull
    public final Lazy f10094c = LazyKt__LazyJVMKt.lazy(new d());

    /* renamed from: d */
    @NotNull
    public final Lazy f10095d = LazyKt__LazyJVMKt.lazy(new c());

    /* renamed from: e */
    @NotNull
    public final Lazy f10096e = LazyKt__LazyJVMKt.lazy(new e());

    /* renamed from: f */
    @NotNull
    public final Lazy f10097f = LazyKt__LazyJVMKt.lazy(b.f10100a);

    /* renamed from: g */
    @NotNull
    public final Lazy f10098g = LazyKt__LazyJVMKt.lazy(new f());

    /* renamed from: h */
    @NotNull
    public final Lazy f10099h = LazyKt__LazyJVMKt.lazy(new g());

    /* renamed from: ru.rustore.sdk.appupdate.e0$a */
    public static final class a {
    }

    /* renamed from: ru.rustore.sdk.appupdate.e0$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0<C11384j> {

        /* renamed from: a */
        public static final b f10100a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11384j invoke() {
            return new C11384j();
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e0$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0<C11390n> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11390n invoke() {
            return new C11390n((C11384j) C11375e0.this.f10097f.getValue(), (MetricsClient) C11375e0.this.f10098g.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e0$d */
    /* loaded from: classes7.dex */
    public static final class d extends Lambda implements Function0<C11374e> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11374e invoke() {
            return new C11374e((C11390n) C11375e0.this.f10095d.getValue(), (C11367a0) C11375e0.this.f10099h.getValue(), (C11351L) C11375e0.this.f10096e.getValue(), AnalyticsEventProvider.INSTANCE, C11375e0.this.f10092a);
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e0$e */
    /* loaded from: classes7.dex */
    public static final class e extends Lambda implements Function0<C11351L> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11351L invoke() {
            return new C11351L(new C11350K(C11375e0.this.f10092a));
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e0$f */
    /* loaded from: classes7.dex */
    public static final class f extends Lambda implements Function0<MetricsClient> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MetricsClient invoke() {
            return MetricsClient.INSTANCE.getInstance(C11375e0.this.f10092a);
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e0$g */
    /* loaded from: classes7.dex */
    public static final class g extends Lambda implements Function0<C11367a0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11367a0 invoke() {
            return new C11367a0(new C11369b0(), new C11371c0(C11375e0.this.f10093b), new C11373d0());
        }
    }

    public C11375e0(Context context, Map map) {
        this.f10092a = context;
        this.f10093b = map;
    }
}
