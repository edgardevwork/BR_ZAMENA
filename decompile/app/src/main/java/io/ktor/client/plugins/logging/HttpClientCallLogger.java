package io.ktor.client.plugins.logging;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClientCallLogger.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001b\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m7105d2 = {"Lio/ktor/client/plugins/logging/HttpClientCallLogger;", "Lio/ktor/client/plugins/logging/Logger;", "logger", SegmentConstantPool.INITSTRING, "(Lio/ktor/client/plugins/logging/Logger;)V", "", "closeRequestLog", "()V", "closeResponseLog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "logRequest", "(Ljava/lang/String;)V", "logResponseBody", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logResponseException", "logResponseHeader", "Lio/ktor/client/plugins/logging/Logger;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "requestLog", "Ljava/lang/StringBuilder;", "Lkotlinx/coroutines/CompletableJob;", "requestLoggedMonitor", "Lkotlinx/coroutines/CompletableJob;", "responseHeaderMonitor", "responseLog", "ktor-client-logging", ""}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HttpClientCallLogger {
    public static final /* synthetic */ AtomicIntegerFieldUpdater requestLogged$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCallLogger.class, "requestLogged");
    public static final /* synthetic */ AtomicIntegerFieldUpdater responseLogged$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCallLogger.class, "responseLogged");

    @NotNull
    public final Logger logger;

    @NotNull
    public final StringBuilder requestLog;

    @NotNull
    private volatile /* synthetic */ int requestLogged;

    @NotNull
    public final CompletableJob requestLoggedMonitor;

    @NotNull
    public final CompletableJob responseHeaderMonitor;

    @NotNull
    public final StringBuilder responseLog;

    @NotNull
    private volatile /* synthetic */ int responseLogged;

    /* compiled from: HttpClientCallLogger.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.HttpClientCallLogger", m7120f = "HttpClientCallLogger.kt", m7121i = {0}, m7122l = {52}, m7123m = "closeResponseLog", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1 */
    /* loaded from: classes7.dex */
    public static final class C101861 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101861(Continuation<? super C101861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCallLogger.this.closeResponseLog(this);
        }
    }

    /* compiled from: HttpClientCallLogger.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.HttpClientCallLogger", m7120f = "HttpClientCallLogger.kt", m7121i = {0, 0}, m7122l = {34}, m7123m = "logResponseBody", m7124n = {"this", ThrowableDeserializer.PROP_NAME_MESSAGE}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1 */
    /* loaded from: classes7.dex */
    public static final class C101871 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101871(Continuation<? super C101871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCallLogger.this.logResponseBody(null, this);
        }
    }

    /* compiled from: HttpClientCallLogger.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.HttpClientCallLogger", m7120f = "HttpClientCallLogger.kt", m7121i = {0, 0}, m7122l = {29}, m7123m = "logResponseException", m7124n = {"this", ThrowableDeserializer.PROP_NAME_MESSAGE}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1 */
    /* loaded from: classes7.dex */
    public static final class C101881 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101881(Continuation<? super C101881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCallLogger.this.logResponseException(null, this);
        }
    }

    public HttpClientCallLogger(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.requestLog = new StringBuilder();
        this.responseLog = new StringBuilder();
        this.requestLoggedMonitor = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.responseHeaderMonitor = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.requestLogged = 0;
        this.responseLogged = 0;
    }

    public final void logRequest(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = this.requestLog;
        sb.append(StringsKt__StringsKt.trim((CharSequence) message).toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
    }

    public final void logResponseHeader(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = this.responseLog;
        sb.append(StringsKt__StringsKt.trim((CharSequence) message).toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        this.responseHeaderMonitor.complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logResponseException(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101881 c101881;
        HttpClientCallLogger httpClientCallLogger;
        if (continuation instanceof C101881) {
            c101881 = (C101881) continuation;
            int i = c101881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101881.label = i - Integer.MIN_VALUE;
            } else {
                c101881 = new C101881(continuation);
            }
        }
        Object obj = c101881.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableJob completableJob = this.requestLoggedMonitor;
            c101881.L$0 = this;
            c101881.L$1 = str;
            c101881.label = 1;
            if (completableJob.join(c101881) == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientCallLogger = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c101881.L$1;
            httpClientCallLogger = (HttpClientCallLogger) c101881.L$0;
            ResultKt.throwOnFailure(obj);
        }
        httpClientCallLogger.logger.log(StringsKt__StringsKt.trim((CharSequence) str).toString());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logResponseBody(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101871 c101871;
        HttpClientCallLogger httpClientCallLogger;
        if (continuation instanceof C101871) {
            c101871 = (C101871) continuation;
            int i = c101871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101871.label = i - Integer.MIN_VALUE;
            } else {
                c101871 = new C101871(continuation);
            }
        }
        Object obj = c101871.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableJob completableJob = this.responseHeaderMonitor;
            c101871.L$0 = this;
            c101871.L$1 = str;
            c101871.label = 1;
            if (completableJob.join(c101871) == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientCallLogger = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c101871.L$1;
            httpClientCallLogger = (HttpClientCallLogger) c101871.L$0;
            ResultKt.throwOnFailure(obj);
        }
        httpClientCallLogger.responseLog.append(str);
        return Unit.INSTANCE;
    }

    public final void closeRequestLog() {
        if (requestLogged$FU.compareAndSet(this, 0, 1)) {
            try {
                String string = StringsKt__StringsKt.trim(this.requestLog).toString();
                if (string.length() > 0) {
                    this.logger.log(string);
                }
            } finally {
                this.requestLoggedMonitor.complete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object closeResponseLog(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101861 c101861;
        HttpClientCallLogger httpClientCallLogger;
        if (continuation instanceof C101861) {
            c101861 = (C101861) continuation;
            int i = c101861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101861.label = i - Integer.MIN_VALUE;
            } else {
                c101861 = new C101861(continuation);
            }
        }
        Object obj = c101861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c101861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!responseLogged$FU.compareAndSet(this, 0, 1)) {
                return Unit.INSTANCE;
            }
            CompletableJob completableJob = this.requestLoggedMonitor;
            c101861.L$0 = this;
            c101861.label = 1;
            if (completableJob.join(c101861) == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientCallLogger = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpClientCallLogger = (HttpClientCallLogger) c101861.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String string = StringsKt__StringsKt.trim(httpClientCallLogger.responseLog).toString();
        if (string.length() > 0) {
            httpClientCallLogger.logger.log(string);
        }
        return Unit.INSTANCE;
    }
}
