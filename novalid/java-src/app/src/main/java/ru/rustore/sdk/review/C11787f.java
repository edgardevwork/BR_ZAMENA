package ru.rustore.sdk.review;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.config.RuStoreInternalConfig;

/* renamed from: ru.rustore.sdk.review.f */
/* loaded from: classes5.dex */
public final class C11787f {

    /* renamed from: a */
    public final C11793l f11015a;

    /* renamed from: b */
    public final C11806y f11016b;

    /* renamed from: c */
    public final Lazy f11017c;

    /* renamed from: ru.rustore.sdk.review.f$a */
    /* loaded from: classes8.dex */
    public static final class a extends Lambda implements Function0<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            C11806y c11806y = C11787f.this.f11016b;
            c11806y.f11044a.getClass();
            C11777A c11777a = c11806y.f11045b;
            c11777a.getClass();
            String type = RuStoreInternalConfig.INSTANCE.create(c11777a.f10986a).getSdkType().getValue();
            c11806y.f11046c.getClass();
            Intrinsics.checkNotNullParameter("ru.rustore.sdk:review", "value");
            Intrinsics.checkNotNullParameter(type, "value");
            Intrinsics.checkNotNullParameter("8.0.0", "value");
            Intrinsics.checkNotNullParameter("ru.rustore.sdk:review", "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter("8.0.0", "version");
            return MapsKt__MapsKt.mapOf(TuplesKt.m7112to("sdkName", "ru.rustore.sdk:review"), TuplesKt.m7112to("sdkType", type), TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "8.0.0"));
        }
    }

    public C11787f(C11793l reviewAnalyticsRepository, C11806y sdkInfoRepository) {
        Intrinsics.checkNotNullParameter(reviewAnalyticsRepository, "reviewAnalyticsRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        this.f11015a = reviewAnalyticsRepository;
        this.f11016b = sdkInfoRepository;
        this.f11017c = LazyKt__LazyJVMKt.lazy(new a());
    }
}
