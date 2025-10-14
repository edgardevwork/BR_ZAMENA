package com.sdkit.paylib.paylibnative.api.analytics;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "", "logEvent", "", "event", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibEvent;", "metric", "Lcom/sdkit/paylib/paylibnative/api/analytics/PaylibMetric;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface CustomPaylibAnalytics {
    void logEvent(PaylibEvent event, PaylibMetric metric);
}
