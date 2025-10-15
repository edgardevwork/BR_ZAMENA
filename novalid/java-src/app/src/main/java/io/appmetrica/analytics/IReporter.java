package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* loaded from: classes8.dex */
public interface IReporter {
    void clearAppEnvironment();

    @NonNull
    IPluginReporter getPluginExtension();

    void pauseSession();

    void putAppEnvironmentValue(@NonNull String str, @Nullable String str2);

    void reportAdRevenue(@NonNull AdRevenue adRevenue);

    void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map);

    void reportECommerce(@NonNull ECommerceEvent eCommerceEvent);

    void reportError(@NonNull String str, @Nullable String str2);

    void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th);

    void reportError(@NonNull String str, @Nullable Throwable th);

    void reportEvent(@NonNull String str);

    void reportEvent(@NonNull String str, @Nullable String str2);

    void reportEvent(@NonNull String str, @Nullable Map<String, Object> map);

    void reportRevenue(@NonNull Revenue revenue);

    void reportUnhandledException(@NonNull Throwable th);

    void reportUserProfile(@NonNull UserProfile userProfile);

    void resumeSession();

    void sendEventsBuffer();

    void setDataSendingEnabled(boolean z);

    void setUserProfileID(@Nullable String str);
}
