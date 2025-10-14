package androidx.tracing;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Trace {
    public static final String TAG = "Trace";
    public static Method sAsyncTraceBeginMethod;
    public static Method sAsyncTraceEndMethod;
    public static Method sIsTagEnabledMethod;
    public static Method sTraceCounterMethod;
    public static long sTraceTagApp;

    @SuppressLint({"NewApi"})
    public static boolean isEnabled() {
        try {
            if (sIsTagEnabledMethod == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return isEnabledFallback();
    }

    public static void beginSection(@NonNull String str) {
        TraceApi18Impl.beginSection(str);
    }

    public static void endSection() {
        TraceApi18Impl.endSection();
    }

    @SuppressLint({"NewApi"})
    public static void beginAsyncSection(@NonNull String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (sAsyncTraceBeginMethod == null) {
                TraceApi29Impl.beginAsyncSection(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        beginAsyncSectionFallback(str, i);
    }

    @SuppressLint({"NewApi"})
    public static void endAsyncSection(@NonNull String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (sAsyncTraceEndMethod == null) {
                TraceApi29Impl.endAsyncSection(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        endAsyncSectionFallback(str, i);
    }

    @SuppressLint({"NewApi"})
    public static void setCounter(@NonNull String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (sTraceCounterMethod == null) {
                TraceApi29Impl.setCounter(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        setCounterFallback(str, i);
    }

    public static boolean isEnabledFallback() {
        try {
            if (sIsTagEnabledMethod == null) {
                sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) sIsTagEnabledMethod.invoke(null, Long.valueOf(sTraceTagApp))).booleanValue();
        } catch (Exception e) {
            handleException("isTagEnabled", e);
            return false;
        }
    }

    public static void beginAsyncSectionFallback(@NonNull String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (sAsyncTraceBeginMethod == null) {
                sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            sAsyncTraceBeginMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i));
        } catch (Exception e) {
            handleException("asyncTraceBegin", e);
        }
    }

    public static void endAsyncSectionFallback(@NonNull String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (sAsyncTraceEndMethod == null) {
                sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            sAsyncTraceEndMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i));
        } catch (Exception e) {
            handleException("asyncTraceEnd", e);
        }
    }

    public static void setCounterFallback(@NonNull String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (sTraceCounterMethod == null) {
                sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            sTraceCounterMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i));
        } catch (Exception e) {
            handleException("traceCounter", e);
        }
    }

    public static void handleException(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }
}
