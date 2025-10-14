package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationStateProvider;", "", "currentState", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationState;", "getCurrentState", "()Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationState;", "registerStickyObserver", "observer", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/applicationstate/ApplicationStateObserver;", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ApplicationStateProvider {
    @NotNull
    ApplicationState getCurrentState();

    @NotNull
    ApplicationState registerStickyObserver(@NotNull ApplicationStateObserver observer);
}
