package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.firebase.perf.p025v1.PerfSession;
import com.google.firebase.perf.p025v1.TraceMetric;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class TraceMetricBuilder {
    private final Trace trace;

    public TraceMetricBuilder(@NonNull Trace trace) {
        this.trace = trace;
    }

    public TraceMetric build() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(this.trace.getName()).setClientStartTimeUs(this.trace.getStartTime().getMicros()).setDurationUs(this.trace.getStartTime().getDurationMicros(this.trace.getEndTime()));
        for (Counter counter : this.trace.getCounters().values()) {
            durationUs.putCounters(counter.getName(), counter.getCount());
        }
        List<Trace> subtraces = this.trace.getSubtraces();
        if (!subtraces.isEmpty()) {
            Iterator<Trace> it = subtraces.iterator();
            while (it.hasNext()) {
                durationUs.addSubtraces(new TraceMetricBuilder(it.next()).build());
            }
        }
        durationUs.putAllCustomAttributes(this.trace.getAttributes());
        PerfSession[] perfSessionArrBuildAndSort = com.google.firebase.perf.session.PerfSession.buildAndSort(this.trace.getSessions());
        if (perfSessionArrBuildAndSort != null) {
            durationUs.addAllPerfSessions(Arrays.asList(perfSessionArrBuildAndSort));
        }
        return durationUs.build();
    }
}
