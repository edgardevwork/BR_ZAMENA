package ru.rustore.sdk.metrics;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\b\t\nB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "MetricsDbError", "NetworkError", "SaveMetricsEventError", "Lru/rustore/sdk/metrics/MetricsException$MetricsDbError;", "Lru/rustore/sdk/metrics/MetricsException$NetworkError;", "Lru/rustore/sdk/metrics/MetricsException$SaveMetricsEventError;", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class MetricsException extends Exception {

    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsException$MetricsDbError;", "Lru/rustore/sdk/metrics/MetricsException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class MetricsDbError extends MetricsException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetricsDbError(String message, Throwable cause) {
            super(message, cause, null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsException$NetworkError;", "Lru/rustore/sdk/metrics/MetricsException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class NetworkError extends MetricsException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public /* synthetic */ NetworkError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsException$SaveMetricsEventError;", "Lru/rustore/sdk/metrics/MetricsException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "(Ljava/lang/String;)V", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class SaveMetricsEventError extends MetricsException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveMetricsEventError(String message) {
            super(message, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public MetricsException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ MetricsException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    public /* synthetic */ MetricsException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
