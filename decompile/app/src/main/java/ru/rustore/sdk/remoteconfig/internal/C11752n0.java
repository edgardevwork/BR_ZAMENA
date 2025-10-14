package ru.rustore.sdk.remoteconfig.internal;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.config.RuStoreInternalConfig;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.remoteconfig.BuildConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.n0 */
/* loaded from: classes5.dex */
public final class C11752n0 {

    /* renamed from: a */
    public final C11764t0 f10960a;

    /* renamed from: b */
    public final C11770w0 f10961b;

    /* renamed from: c */
    public final Lazy f10962c;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.n0$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            C11770w0 c11770w0 = C11752n0.this.f10961b;
            c11770w0.f10980a.getClass();
            C11774y0 c11774y0 = c11770w0.f10981b;
            c11774y0.getClass();
            String type = RuStoreInternalConfig.INSTANCE.create(c11774y0.f10985a).getSdkType().getValue();
            c11770w0.f10982c.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.SDK_NAME, "value");
            Intrinsics.checkNotNullParameter(type, "value");
            Intrinsics.checkNotNullParameter("8.0.0", "value");
            Intrinsics.checkNotNullParameter(BuildConfig.SDK_NAME, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter("8.0.0", "version");
            return MapsKt__MapsKt.mapOf(TuplesKt.m7112to("sdkName", BuildConfig.SDK_NAME), TuplesKt.m7112to("sdkType", type), TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "8.0.0"));
        }
    }

    public C11752n0(C11764t0 remoteConfigAnalyticsRepository, C11770w0 sdkInfoRepository) {
        Intrinsics.checkNotNullParameter(remoteConfigAnalyticsRepository, "remoteConfigAnalyticsRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        this.f10960a = remoteConfigAnalyticsRepository;
        this.f10961b = sdkInfoRepository;
        this.f10962c = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* renamed from: a */
    public final Single<Unit> m7548a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C11754o0 event = new C11754o0("remoteConfig.error", MapsKt__MapsKt.plus((Map) this.f10962c.getValue(), MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to("errorName", error.getClass().getSimpleName()))));
        C11764t0 c11764t0 = this.f10960a;
        c11764t0.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        return SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11758q0(c11764t0, event)), new C11760r0(c11764t0)), Dispatchers.INSTANCE.getIo()), C11762s0.f10974a);
    }
}
