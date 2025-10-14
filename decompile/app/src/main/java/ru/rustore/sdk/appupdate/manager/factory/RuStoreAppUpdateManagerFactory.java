package ru.rustore.sdk.appupdate.manager.factory;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.analytics.event.common.SdkInfoAnalyticsEvent;
import ru.rustore.sdk.appupdate.C11365Z;
import ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager;
import ru.rustore.sdk.core.config.RuStoreInternalConfig;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¨\u0006\n"}, m7105d2 = {"Lru/rustore/sdk/appupdate/manager/factory/RuStoreAppUpdateManagerFactory;", "", "()V", "create", "Lru/rustore/sdk/appupdate/manager/RuStoreAppUpdateManager;", "context", "Landroid/content/Context;", "internalConfig", "", "", "sdk-public-appupdate_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class RuStoreAppUpdateManagerFactory {

    @NotNull
    public static final RuStoreAppUpdateManagerFactory INSTANCE = new RuStoreAppUpdateManagerFactory();

    /* renamed from: ru.rustore.sdk.appupdate.manager.factory.RuStoreAppUpdateManagerFactory$a */
    /* loaded from: classes8.dex */
    public static final class C11388a extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public final /* synthetic */ Context f10131a;

        /* renamed from: b */
        public final /* synthetic */ Map<String, Object> f10132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11388a(Context context, Map<String, ? extends Object> map) {
            super(0);
            this.f10131a = context;
            this.f10132b = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AnalyticsEventProvider analyticsEventProvider = AnalyticsEventProvider.INSTANCE;
            Context context = this.f10131a;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            analyticsEventProvider.postAnalyticsEvent(context, packageName, new SdkInfoAnalyticsEvent("ru.rustore.sdk:appupdate", "8.0.0", RuStoreInternalConfig.INSTANCE.create(this.f10132b).getSdkType().getValue()));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.manager.factory.RuStoreAppUpdateManagerFactory$b */
    /* loaded from: classes8.dex */
    public static final class C11389b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final C11389b f10133a = new C11389b();

        public C11389b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuStoreAppUpdateManager create$default(RuStoreAppUpdateManagerFactory ruStoreAppUpdateManagerFactory, Context context, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return ruStoreAppUpdateManagerFactory.create(context, map);
    }

    @JvmOverloads
    @NotNull
    public final RuStoreAppUpdateManager create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return create$default(this, context, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final RuStoreAppUpdateManager create(@NotNull Context context, @Nullable Map<String, ? extends Object> internalConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        SingleSubscribeKt.subscribe$default(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11388a(context, internalConfig)), Dispatchers.INSTANCE.getIo()), null, C11389b.f10133a, 1, null);
        return new C11365Z(context);
    }
}
