package com.google.firebase.perf.ktx;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Performance.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00060\n¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a)\u0010\u0005\u001a\u00020\u000e*\u00020\u000f2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u001a4\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0006*\u00020\u000b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00060\n¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m7105d2 = {"performance", "Lcom/google/firebase/perf/FirebasePerformance;", "Lcom/google/firebase/ktx/Firebase;", "getPerformance", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/perf/FirebasePerformance;", "trace", ExifInterface.GPS_DIRECTION_TRUE, "name", "", "block", "Lkotlin/Function1;", "Lcom/google/firebase/perf/metrics/Trace;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "Lcom/google/firebase/perf/metrics/HttpMetric;", "(Lcom/google/firebase/perf/metrics/Trace;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "com.google.firebase-firebase-perf"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPerformance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/ktx/PerformanceKt\n*L\n1#1,117:1\n78#1,5:118\n*S KotlinDebug\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/ktx/PerformanceKt\n*L\n99#1:118,5\n*E\n"})
/* loaded from: classes5.dex */
public final class PerformanceKt {
    @NotNull
    public static final FirebasePerformance getPerformance(@NotNull Firebase firebase2) {
        Intrinsics.checkNotNullParameter(firebase2, "<this>");
        FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebasePerformance, "getInstance()");
        return firebasePerformance;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final void trace(@NotNull HttpMetric httpMetric, @NotNull Function1<? super HttpMetric, Unit> block) {
        Intrinsics.checkNotNullParameter(httpMetric, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpMetric.start();
        try {
            block.invoke(httpMetric);
        } finally {
            InlineMarker.finallyStart(1);
            httpMetric.stop();
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final <T> T trace(@NotNull Trace trace, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(trace, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        trace.start();
        try {
            return block.invoke(trace);
        } finally {
            InlineMarker.finallyStart(1);
            trace.stop();
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final <T> T trace(@NotNull String name, @NotNull Function1<? super Trace, ? extends T> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace traceCreate = Trace.create(name);
        Intrinsics.checkNotNullExpressionValue(traceCreate, "create(name)");
        traceCreate.start();
        try {
            return block.invoke(traceCreate);
        } finally {
            InlineMarker.finallyStart(1);
            traceCreate.stop();
            InlineMarker.finallyEnd(1);
        }
    }
}
