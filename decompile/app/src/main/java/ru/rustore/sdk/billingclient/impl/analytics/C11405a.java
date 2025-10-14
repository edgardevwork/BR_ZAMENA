package ru.rustore.sdk.billingclient.impl.analytics;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.BuildConfig;
import ru.rustore.sdk.billingclient.impl.data.repository.C11473a;
import ru.rustore.sdk.billingclient.impl.data.repository.C11474b;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11489q;
import ru.rustore.sdk.billingclient.impl.domain.model.C11505b;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11519f;

/* renamed from: ru.rustore.sdk.billingclient.impl.analytics.a */
/* loaded from: classes5.dex */
public final class C11405a {

    /* renamed from: a */
    public final C11474b f10160a;

    /* renamed from: b */
    public final C11486n f10161b;

    /* renamed from: c */
    public final C11473a f10162c;

    /* renamed from: d */
    public final C11489q f10163d;

    /* renamed from: e */
    public final C11519f f10164e;

    /* renamed from: f */
    public final String f10165f;

    /* renamed from: g */
    public final Lazy f10166g;

    /* renamed from: h */
    public final Lazy f10167h;

    /* renamed from: ru.rustore.sdk.billingclient.impl.analytics.a$a */
    /* loaded from: classes8.dex */
    public static final class a extends Lambda implements Function0<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            C11405a c11405a = C11405a.this;
            Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
            String value = (String) c11405a.f10162c.f10280a.f10205b.getValue();
            if (value != null) {
                Intrinsics.checkNotNullParameter(value, "value");
            } else {
                value = null;
            }
            if (value != null) {
            }
            mapCreateMapBuilder.put("sandbox", String.valueOf(c11405a.f10164e.m7469a()));
            mapCreateMapBuilder.put("package_name", c11405a.f10165f);
            mapCreateMapBuilder.put("without_rustore", String.valueOf(c11405a.m7440a()));
            mapCreateMapBuilder.putAll((Map) c11405a.f10166g.getValue());
            return MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.analytics.a$b */
    /* loaded from: classes8.dex */
    public static final class b extends Lambda implements Function0<Map<String, ? extends String>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return MapsKt__MapsKt.mapOf(TuplesKt.m7112to("sdkName", BuildConfig.SDK_NAME), TuplesKt.m7112to("sdkType", C11405a.this.f10163d.m7459a().f10491b), TuplesKt.m7112to(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "8.0.0"));
        }
    }

    public C11405a(C11474b billingAnalyticsRepository, C11486n ruStoreInstallStatusRepository, C11473a appVersionNameRepository, C11489q sdkInfoRepository, C11519f getSandboxInfoUseCase, String packageName) {
        Intrinsics.checkNotNullParameter(billingAnalyticsRepository, "billingAnalyticsRepository");
        Intrinsics.checkNotNullParameter(ruStoreInstallStatusRepository, "ruStoreInstallStatusRepository");
        Intrinsics.checkNotNullParameter(appVersionNameRepository, "appVersionNameRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(getSandboxInfoUseCase, "getSandboxInfoUseCase");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f10160a = billingAnalyticsRepository;
        this.f10161b = ruStoreInstallStatusRepository;
        this.f10162c = appVersionNameRepository;
        this.f10163d = sdkInfoRepository;
        this.f10164e = getSandboxInfoUseCase;
        this.f10165f = packageName;
        this.f10166g = LazyKt__LazyJVMKt.lazy(new b());
        this.f10167h = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* renamed from: a */
    public final boolean m7440a() {
        int iM7466a = C11505b.m7466a(this.f10161b.m7456a());
        if (iM7466a == 0) {
            return false;
        }
        if (iM7466a == 1) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
