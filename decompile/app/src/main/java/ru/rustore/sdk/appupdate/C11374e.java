package ru.rustore.sdk.appupdate;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.core.config.RuStoreInternalConfig;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* renamed from: ru.rustore.sdk.appupdate.e */
/* loaded from: classes6.dex */
public final class C11374e {

    /* renamed from: a */
    @NotNull
    public final C11390n f10081a;

    /* renamed from: b */
    @NotNull
    public final C11367a0 f10082b;

    /* renamed from: c */
    @NotNull
    public final C11351L f10083c;

    /* renamed from: d */
    @NotNull
    public final AnalyticsEventProvider f10084d;

    /* renamed from: e */
    @NotNull
    public final Context f10085e;

    /* renamed from: f */
    @NotNull
    public final Lazy f10086f;

    /* renamed from: ru.rustore.sdk.appupdate.e$a */
    /* loaded from: classes7.dex */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        public final /* synthetic */ C11382i f10088b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11382i c11382i) {
            super(0);
            this.f10088b = c11382i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C11374e c11374e = C11374e.this;
            AnalyticsEventProvider analyticsEventProvider = c11374e.f10084d;
            Context context = c11374e.f10085e;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            analyticsEventProvider.postAnalyticsEvent(context, packageName, this.f10088b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final b f10089a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.e$c */
    /* loaded from: classes7.dex */
    public static final class c extends Lambda implements Function0<Map<String, ? extends String>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            C11367a0 c11367a0 = C11374e.this.f10082b;
            c11367a0.f10073a.getClass();
            C11371c0 c11371c0 = c11367a0.f10074b;
            c11371c0.getClass();
            String type = RuStoreInternalConfig.INSTANCE.create(c11371c0.f10079a).getSdkType().getValue();
            c11367a0.f10075c.getClass();
            Intrinsics.checkNotNullParameter("ru.rustore.sdk:appupdate", "value");
            Intrinsics.checkNotNullParameter(type, "value");
            Intrinsics.checkNotNullParameter("8.0.0", "value");
            Intrinsics.checkNotNullParameter("ru.rustore.sdk:appupdate", "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter("8.0.0", "version");
            return MapsKt__MapsKt.mapOf(TuplesKt.m7112to("sdkName", "ru.rustore.sdk:appupdate"), TuplesKt.m7112to("sdkType", type), TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "8.0.0"));
        }
    }

    public C11374e(@NotNull C11390n analyticsRepository, @NotNull C11367a0 sdkInfoRepository, @NotNull C11351L appVersionNameRepository, @NotNull AnalyticsEventProvider analyticsEventProvider, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(appVersionNameRepository, "appVersionNameRepository");
        Intrinsics.checkNotNullParameter(analyticsEventProvider, "analyticsEventProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10081a = analyticsRepository;
        this.f10082b = sdkInfoRepository;
        this.f10083c = appVersionNameRepository;
        this.f10084d = analyticsEventProvider;
        this.f10085e = context;
        this.f10086f = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* renamed from: a */
    public final LinkedHashMap m7430a(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String value = (String) this.f10083c.f10044a.f10042b.getValue();
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        if (value != null) {
            linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, value);
        }
        String packageName = this.f10085e.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        linkedHashMap.put("app_bundle", packageName);
        linkedHashMap.put("update_type", i != 0 ? i != 1 ? "SILENT" : "IMMEDIATE" : "FLEXIBLE");
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void m7431a(int i, @NotNull String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(m7430a(i));
        linkedHashMap.put("errorCode", errorCode);
        SingleSubscribeKt.subscribe$default(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new a(new C11382i("updateStart.error", linkedHashMap))), Dispatchers.INSTANCE.getIo()), null, b.f10089a, 1, null);
    }
}
