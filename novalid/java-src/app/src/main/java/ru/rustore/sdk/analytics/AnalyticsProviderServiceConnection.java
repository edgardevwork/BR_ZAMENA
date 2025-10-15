package ru.rustore.sdk.analytics;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.p068vk.store.provider.analytics.AnalyticsProvider;
import ru.p068vk.store.provider.analytics.AnalyticsProviderCallback;
import ru.rustore.sdk.core.exception.RuStoreException;

/* compiled from: AnalyticsProviderServiceConnection.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lru/rustore/sdk/analytics/AnalyticsProviderServiceConnection;", "Landroid/content/ServiceConnection;", "applicationId", "", "eventName", "eventData", "", "onSuccess", "Lkotlin/Function0;", "", "onError", "Lkotlin/Function1;", "Lru/rustore/sdk/core/exception/RuStoreException;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "onServiceConnected", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "sdk-public-analytics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsProviderServiceConnection implements ServiceConnection {

    @NotNull
    public final String applicationId;

    @NotNull
    public final Map<String, String> eventData;

    @NotNull
    public final String eventName;

    @NotNull
    public final Function1<RuStoreException, Unit> onError;

    @NotNull
    public final Function0<Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsProviderServiceConnection(@NotNull String applicationId, @NotNull String eventName, @NotNull Map<String, String> eventData, @NotNull Function0<Unit> onSuccess, @NotNull Function1<? super RuStoreException, Unit> onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.applicationId = applicationId;
        this.eventName = eventName;
        this.eventData = eventData;
        this.onSuccess = onSuccess;
        this.onError = onError;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
        try {
            AnalyticsProvider.Stub.asInterface(service).postAnalytcsEvent(this.applicationId, this.eventName, MappingExtKt.toBundle(this.eventData), new AnalyticsProviderCallback.Stub() { // from class: ru.rustore.sdk.analytics.AnalyticsProviderServiceConnection$onServiceConnected$callback$1
                @Override // ru.p068vk.store.provider.analytics.AnalyticsProviderCallback
                public void onSuccess() {
                    this.this$0.onSuccess.invoke();
                }

                @Override // ru.p068vk.store.provider.analytics.AnalyticsProviderCallback
                public void onError(int errorCode, String errorMessage) {
                    Function1 function1 = this.this$0.onError;
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    function1.invoke(new RuStoreException(errorMessage));
                }
            });
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.onError;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName name) {
        this.onError.invoke(new RuStoreException("onServiceDisconnected"));
    }
}
