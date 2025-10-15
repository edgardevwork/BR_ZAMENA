package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.util.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class ConfigurationConstants {

    /* loaded from: classes7.dex */
    public static final class CollectionDeactivated extends ConfigurationFlag<Boolean> {
        private static CollectionDeactivated instance;

        private CollectionDeactivated() {
        }

        public static synchronized CollectionDeactivated getInstance() {
            try {
                if (instance == null) {
                    instance = new CollectionDeactivated();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.FALSE;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "firebase_performance_collection_deactivated";
        }
    }

    /* loaded from: classes7.dex */
    public static final class CollectionEnabled extends ConfigurationFlag<Boolean> {
        private static CollectionEnabled instance;

        private CollectionEnabled() {
        }

        public static synchronized CollectionEnabled getInstance() {
            try {
                if (instance == null) {
                    instance = new CollectionEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.TRUE;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "firebase_performance_collection_enabled";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return Constants.ENABLE_DISABLE;
        }
    }

    public static final class SdkEnabled extends ConfigurationFlag<Boolean> {
        private static SdkEnabled instance;

        public static synchronized SdkEnabled getInstance() {
            try {
                if (instance == null) {
                    instance = new SdkEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.TRUE;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_enabled";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SdkEnabled";
        }
    }

    /* loaded from: classes7.dex */
    public static final class SdkDisabledVersions extends ConfigurationFlag<String> {
        private static SdkDisabledVersions instance;

        public static synchronized SdkDisabledVersions getInstance() {
            try {
                if (instance == null) {
                    instance = new SdkDisabledVersions();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDefault() {
            return "";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_disabled_android_versions";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }
    }

    public static final class TraceSamplingRate extends ConfigurationFlag<Double> {
        private static TraceSamplingRate instance;

        private TraceSamplingRate() {
        }

        public static synchronized TraceSamplingRate getInstance() {
            try {
                if (instance == null) {
                    instance = new TraceSamplingRate();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(1.0d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefaultOnRcFetchFail() {
            return Double.valueOf(getDefault().doubleValue() / 1000.0d);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_trace_sampling_rate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }
    }

    /* loaded from: classes7.dex */
    public static final class NetworkRequestSamplingRate extends ConfigurationFlag<Double> {
        private static NetworkRequestSamplingRate instance;

        private NetworkRequestSamplingRate() {
        }

        public static synchronized NetworkRequestSamplingRate getInstance() {
            try {
                if (instance == null) {
                    instance = new NetworkRequestSamplingRate();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(1.0d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefaultOnRcFetchFail() {
            return Double.valueOf(getDefault().doubleValue() / 1000.0d);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_network_request_sampling_rate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }
    }

    public static final class SessionsCpuCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
        private static SessionsCpuCaptureFrequencyForegroundMs instance;

        private SessionsCpuCaptureFrequencyForegroundMs() {
        }

        public static synchronized SessionsCpuCaptureFrequencyForegroundMs getInstance() {
            try {
                if (instance == null) {
                    instance = new SessionsCpuCaptureFrequencyForegroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 100L;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefaultOnRcFetchFail() {
            return Long.valueOf(getDefault().longValue() * 3);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }
    }

    public static final class SessionsCpuCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
        private static SessionsCpuCaptureFrequencyBackgroundMs instance;

        private SessionsCpuCaptureFrequencyBackgroundMs() {
        }

        public static synchronized SessionsCpuCaptureFrequencyBackgroundMs getInstance() {
            try {
                if (instance == null) {
                    instance = new SessionsCpuCaptureFrequencyBackgroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 0L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }
    }

    public static final class SessionsMemoryCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
        private static SessionsMemoryCaptureFrequencyForegroundMs instance;

        private SessionsMemoryCaptureFrequencyForegroundMs() {
        }

        public static synchronized SessionsMemoryCaptureFrequencyForegroundMs getInstance() {
            try {
                if (instance == null) {
                    instance = new SessionsMemoryCaptureFrequencyForegroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 100L;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefaultOnRcFetchFail() {
            return Long.valueOf(getDefault().longValue() * 3);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }
    }

    public static final class SessionsMemoryCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
        private static SessionsMemoryCaptureFrequencyBackgroundMs instance;

        private SessionsMemoryCaptureFrequencyBackgroundMs() {
        }

        public static synchronized SessionsMemoryCaptureFrequencyBackgroundMs getInstance() {
            try {
                if (instance == null) {
                    instance = new SessionsMemoryCaptureFrequencyBackgroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 0L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }
    }

    public static final class SessionsMaxDurationMinutes extends ConfigurationFlag<Long> {
        private static SessionsMaxDurationMinutes instance;

        private SessionsMaxDurationMinutes() {
        }

        public static synchronized SessionsMaxDurationMinutes getInstance() {
            try {
                if (instance == null) {
                    instance = new SessionsMaxDurationMinutes();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 240L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_max_duration_min";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_max_length_minutes";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }
    }

    public static final class TraceEventCountForeground extends ConfigurationFlag<Long> {
        private static TraceEventCountForeground instance;

        private TraceEventCountForeground() {
        }

        public static synchronized TraceEventCountForeground getInstance() {
            try {
                if (instance == null) {
                    instance = new TraceEventCountForeground();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 300L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_trace_event_count_fg";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }
    }

    public static final class TraceEventCountBackground extends ConfigurationFlag<Long> {
        private static TraceEventCountBackground instance;

        private TraceEventCountBackground() {
        }

        public static synchronized TraceEventCountBackground getInstance() {
            try {
                if (instance == null) {
                    instance = new TraceEventCountBackground();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 30L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_trace_event_count_bg";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }
    }

    /* loaded from: classes7.dex */
    public static final class NetworkEventCountForeground extends ConfigurationFlag<Long> {
        private static NetworkEventCountForeground instance;

        private NetworkEventCountForeground() {
        }

        public static synchronized NetworkEventCountForeground getInstance() {
            try {
                if (instance == null) {
                    instance = new NetworkEventCountForeground();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 700L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_network_event_count_fg";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }
    }

    /* loaded from: classes7.dex */
    public static final class NetworkEventCountBackground extends ConfigurationFlag<Long> {
        private static NetworkEventCountBackground instance;

        private NetworkEventCountBackground() {
        }

        public static synchronized NetworkEventCountBackground getInstance() {
            try {
                if (instance == null) {
                    instance = new NetworkEventCountBackground();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 70L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_network_event_count_bg";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }
    }

    /* loaded from: classes7.dex */
    public static final class RateLimitSec extends ConfigurationFlag<Long> {
        private static RateLimitSec instance;

        private RateLimitSec() {
        }

        public static synchronized RateLimitSec getInstance() {
            try {
                if (instance == null) {
                    instance = new RateLimitSec();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 600L;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_time_limit_sec";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TimeLimitSec";
        }
    }

    public static final class SessionsSamplingRate extends ConfigurationFlag<Double> {
        private static SessionsSamplingRate instance;

        private SessionsSamplingRate() {
        }

        public static synchronized SessionsSamplingRate getInstance() {
            try {
                if (instance == null) {
                    instance = new SessionsSamplingRate();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(0.01d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefaultOnRcFetchFail() {
            return Double.valueOf(getDefault().doubleValue() / 1000.0d);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_session_sampling_rate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_sampling_percentage";
        }
    }

    /* loaded from: classes7.dex */
    public static final class LogSourceName extends ConfigurationFlag<String> {
        private static final Map<Long, String> LOG_SOURCE_MAP = Collections.unmodifiableMap(new HashMap<Long, String>() { // from class: com.google.firebase.perf.config.ConfigurationConstants.LogSourceName.1
            {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        });
        private static LogSourceName instance;

        private LogSourceName() {
        }

        public static synchronized LogSourceName getInstance() {
            try {
                if (instance == null) {
                    instance = new LogSourceName();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        public static String getLogSourceName(long j) {
            return LOG_SOURCE_MAP.get(Long.valueOf(j));
        }

        public static boolean isLogSourceKnown(long j) {
            return LOG_SOURCE_MAP.containsKey(Long.valueOf(j));
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDefault() {
            return BuildConfig.TRANSPORT_LOG_SRC;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_log_source";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.LogSourceName";
        }
    }

    /* loaded from: classes7.dex */
    public static final class FragmentSamplingRate extends ConfigurationFlag<Double> {
        private static FragmentSamplingRate instance;

        private FragmentSamplingRate() {
        }

        public static synchronized FragmentSamplingRate getInstance() {
            try {
                if (instance == null) {
                    instance = new FragmentSamplingRate();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(0.0d);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_fragment_sampling_rate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "fragment_sampling_percentage";
        }
    }

    /* loaded from: classes7.dex */
    public static final class ExperimentTTID extends ConfigurationFlag<Boolean> {
        private static ExperimentTTID instance;

        private ExperimentTTID() {
        }

        public static synchronized ExperimentTTID getInstance() {
            try {
                if (instance == null) {
                    instance = new ExperimentTTID();
                }
            } catch (Throwable th) {
                throw th;
            }
            return instance;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.FALSE;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_experiment_app_start_ttid";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "experiment_app_start_ttid";
        }
    }
}
