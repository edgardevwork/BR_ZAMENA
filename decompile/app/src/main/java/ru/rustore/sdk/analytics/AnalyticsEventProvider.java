package ru.rustore.sdk.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.analytics.event.AnalyticsEvent;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;

/* compiled from: AnalyticsEventProvider.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rJ\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lru/rustore/sdk/analytics/AnalyticsEventProvider;", "", "()V", "ACTION", "", "TAG", "postAnalyticsEvent", "", "context", "Landroid/content/Context;", "applicationId", "eventName", "eventData", "", "analyticsEvent", "Lru/rustore/sdk/analytics/event/AnalyticsEvent;", "sdk-public-analytics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsEventProvider {

    @NotNull
    public static final String ACTION = "ru.vk.store.provider.analytics.RemoteAnalyticsProvider";

    @NotNull
    public static final AnalyticsEventProvider INSTANCE = new AnalyticsEventProvider();

    @NotNull
    public static final String TAG = "AnalyticsEventProvider";

    public final void postAnalyticsEvent(@NotNull Context context, @NotNull String applicationId, @NotNull AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        postAnalyticsEvent(context, applicationId, analyticsEvent.getEventName(), analyticsEvent.getEventData());
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [T, ru.rustore.sdk.analytics.AnalyticsProviderServiceConnection] */
    public final void postAnalyticsEvent(@NotNull Context context, @NotNull String applicationId, @NotNull String eventName, @NotNull Map<String, String> eventData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            Intent intent = new Intent(ACTION);
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
            ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
            if (componentNameFindRuStoreServiceComponentName == null) {
                return;
            }
            intent.setComponent(componentNameFindRuStoreServiceComponentName);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? analyticsProviderServiceConnection = new AnalyticsProviderServiceConnection(applicationId, eventName, eventData, new Function0<Unit>() { // from class: ru.rustore.sdk.analytics.AnalyticsEventProvider.postAnalyticsEvent.1
                public final /* synthetic */ Context $context;
                public final /* synthetic */ Ref.ObjectRef<ServiceConnection> $serviceConnection;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C113371(Context context2, Ref.ObjectRef<ServiceConnection> objectRef2) {
                    super(0);
                    context = context2;
                    objectRef = objectRef2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    ContextExtKt.unbindServiceSafely(context, objectRef.element);
                }
            }, new Function1<RuStoreException, Unit>() { // from class: ru.rustore.sdk.analytics.AnalyticsEventProvider.postAnalyticsEvent.2
                public final /* synthetic */ Context $context;
                public final /* synthetic */ Ref.ObjectRef<ServiceConnection> $serviceConnection;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C113382(Context context2, Ref.ObjectRef<ServiceConnection> objectRef2) {
                    super(1);
                    context = context2;
                    objectRef = objectRef2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RuStoreException ruStoreException) {
                    invoke2(ruStoreException);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(RuStoreException it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ContextExtKt.unbindServiceSafely(context, objectRef.element);
                }
            });
            objectRef2.element = analyticsProviderServiceConnection;
            try {
                context2.bindService(intent, (ServiceConnection) analyticsProviderServiceConnection, 1);
            } catch (SecurityException e) {
                Log.e(TAG, "postAnalyticsEvent", e);
            }
        }
    }

    /* compiled from: AnalyticsEventProvider.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.analytics.AnalyticsEventProvider$postAnalyticsEvent$1 */
    /* loaded from: classes7.dex */
    public static final class C113371 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Ref.ObjectRef<ServiceConnection> $serviceConnection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113371(Context context2, Ref.ObjectRef<ServiceConnection> objectRef2) {
            super(0);
            context = context2;
            objectRef = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            ContextExtKt.unbindServiceSafely(context, objectRef.element);
        }
    }

    /* compiled from: AnalyticsEventProvider.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Lru/rustore/sdk/core/exception/RuStoreException;", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.analytics.AnalyticsEventProvider$postAnalyticsEvent$2 */
    /* loaded from: classes7.dex */
    public static final class C113382 extends Lambda implements Function1<RuStoreException, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Ref.ObjectRef<ServiceConnection> $serviceConnection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113382(Context context2, Ref.ObjectRef<ServiceConnection> objectRef2) {
            super(1);
            context = context2;
            objectRef = objectRef2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RuStoreException ruStoreException) {
            invoke2(ruStoreException);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(RuStoreException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ContextExtKt.unbindServiceSafely(context, objectRef.element);
        }
    }
}
