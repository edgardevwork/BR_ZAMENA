package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class FragmentStateMonitor extends FragmentManager.FragmentLifecycleCallbacks {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final FrameMetricsRecorder activityFramesRecorder;
    private final AppStateMonitor appStateMonitor;
    private final Clock clock;
    private final WeakHashMap<Fragment, Trace> fragmentToTraceMap = new WeakHashMap<>();
    private final TransportManager transportManager;

    public FragmentStateMonitor(Clock clock, TransportManager transportManager, AppStateMonitor appStateMonitor, FrameMetricsRecorder frameMetricsRecorder) {
        this.clock = clock;
        this.transportManager = transportManager;
        this.appStateMonitor = appStateMonitor;
        this.activityFramesRecorder = frameMetricsRecorder;
    }

    public String getFragmentScreenTraceName(Fragment fragment) {
        return Constants.SCREEN_TRACE_PREFIX + fragment.getClass().getSimpleName();
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        String simpleName;
        super.onFragmentResumed(fragmentManager, fragment);
        logger.debug("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(getFragmentScreenTraceName(fragment), this.transportManager, this.clock, this.appStateMonitor);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = Constants.PARENT_FRAGMENT_ATTRIBUTE_VALUE_NONE;
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute(Constants.PARENT_FRAGMENT_ATTRIBUTE_KEY, simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute(Constants.ACTIVITY_ATTRIBUTE_KEY, fragment.getActivity().getClass().getSimpleName());
        }
        this.fragmentToTraceMap.put(fragment, trace);
        this.activityFramesRecorder.startFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        AndroidLogger androidLogger = logger;
        androidLogger.debug("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.fragmentToTraceMap.containsKey(fragment)) {
            androidLogger.warn("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.fragmentToTraceMap.get(fragment);
        this.fragmentToTraceMap.remove(fragment);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalStopFragment = this.activityFramesRecorder.stopFragment(fragment);
        if (!optionalStopFragment.isAvailable()) {
            androidLogger.warn("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            ScreenTraceUtil.addFrameCounters(trace, optionalStopFragment.get());
            trace.stop();
        }
    }

    @VisibleForTesting
    public WeakHashMap<Fragment, Trace> getFragmentToTraceMap() {
        return this.fragmentToTraceMap;
    }
}
