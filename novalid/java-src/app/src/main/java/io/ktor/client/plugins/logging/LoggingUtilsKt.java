package io.ktor.client.plugins.logging;

import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.StringsKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoggingUtils.kt */
@Metadata(m7104d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a2\u0010\n\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000\u001a \u0010\u0012\u001a\u00020\u0001*\u00060\u0013j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u001a>\u0010\u0018\u001a\u00020\u0001*\u00060\u0013j\u0002`\u00142\u001e\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\u001b0\u001a2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000\u001a#\u0010\u001c\u001a\u0004\u0018\u00010\u0016*\u00020\b2\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"logResponseBody", "", "log", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "contentType", "Lio/ktor/http/ContentType;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "(Ljava/lang/StringBuilder;Lio/ktor/http/ContentType;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logResponseHeader", "response", "Lio/ktor/client/statement/HttpResponse;", "level", "Lio/ktor/client/plugins/logging/LogLevel;", "sanitizedHeaders", "", "Lio/ktor/client/plugins/logging/SanitizedHeader;", "logHeader", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "key", "", "value", "logHeaders", "headers", "", "", "tryReadText", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-logging"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLoggingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n49#1,5:75\n1045#2:70\n1855#2:71\n288#2,2:72\n1856#2:74\n*S KotlinDebug\n*F\n+ 1 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n*L\n64#1:75,5\n17#1:70\n19#1:71\n20#1:72,2\n19#1:74\n*E\n"})
/* loaded from: classes4.dex */
public final class LoggingUtilsKt {

    /* compiled from: LoggingUtils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.LoggingUtilsKt", m7120f = "LoggingUtils.kt", m7121i = {0, 0}, m7122l = {71}, m7123m = "logResponseBody", m7124n = {"$this$logResponseBody_u24lambda_u244", "charset$iv"}, m7125s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1 */
    /* loaded from: classes7.dex */
    public static final class C101951 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C101951(Continuation<? super C101951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoggingUtilsKt.logResponseBody(null, null, null, this);
        }
    }

    /* compiled from: LoggingUtils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.client.plugins.logging.LoggingUtilsKt", m7120f = "LoggingUtils.kt", m7121i = {0}, m7122l = {50}, m7123m = "tryReadText", m7124n = {"charset"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nLoggingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt$tryReadText$1\n*L\n1#1,69:1\n*E\n"})
    /* renamed from: io.ktor.client.plugins.logging.LoggingUtilsKt$tryReadText$1 */
    /* loaded from: classes7.dex */
    public static final class C101961 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C101961(Continuation<? super C101961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LoggingUtilsKt.tryReadText(null, null, this);
        }
    }

    public static final void logHeaders(@NotNull Appendable appendable, @NotNull Set<? extends Map.Entry<String, ? extends List<String>>> headers, @NotNull List<SanitizedHeader> sanitizedHeaders) throws IOException {
        Object next;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.toList(headers), new Comparator() { // from class: io.ktor.client.plugins.logging.LoggingUtilsKt$logHeaders$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues((String) ((Map.Entry) t).getKey(), (String) ((Map.Entry) t2).getKey());
            }
        })) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator<T> it = sanitizedHeaders.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((SanitizedHeader) next).getPredicate().invoke(str).booleanValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SanitizedHeader sanitizedHeader = (SanitizedHeader) next;
            String placeholder = sanitizedHeader != null ? sanitizedHeader.getPlaceholder() : null;
            if (placeholder == null) {
                placeholder = CollectionsKt___CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, null, 62, null);
            }
            logHeader(appendable, str, placeholder);
        }
    }

    public static final void logHeader(@NotNull Appendable appendable, @NotNull String key, @NotNull String value) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Appendable appendableAppend = appendable.append("-> " + key + ": " + value);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
        Intrinsics.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
    }

    public static final void logResponseHeader(@NotNull StringBuilder log, @NotNull HttpResponse response, @NotNull LogLevel level, @NotNull List<SanitizedHeader> sanitizedHeaders) throws IOException {
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(sanitizedHeaders, "sanitizedHeaders");
        if (level.getInfo()) {
            log.append("RESPONSE: " + response.getStatus());
            Intrinsics.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            Intrinsics.checkNotNullExpressionValue(log, "append('\\n')");
            log.append("METHOD: " + response.getCall().getRequest().getMethod());
            Intrinsics.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            Intrinsics.checkNotNullExpressionValue(log, "append('\\n')");
            log.append("FROM: " + response.getCall().getRequest().getUrl());
            Intrinsics.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            Intrinsics.checkNotNullExpressionValue(log, "append('\\n')");
        }
        if (level.getHeaders()) {
            log.append("COMMON HEADERS");
            Intrinsics.checkNotNullExpressionValue(log, "append(value)");
            log.append('\n');
            Intrinsics.checkNotNullExpressionValue(log, "append('\\n')");
            logHeaders(log, response.getHeaders().entries(), sanitizedHeaders);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object tryReadText(@NotNull ByteReadChannel byteReadChannel, @NotNull Charset charset, @NotNull Continuation<? super String> continuation) throws Throwable {
        C101961 c101961;
        if (continuation instanceof C101961) {
            c101961 = (C101961) continuation;
            int i = c101961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101961.label = i - Integer.MIN_VALUE;
            } else {
                c101961 = new C101961(continuation);
            }
        }
        C101961 c1019612 = c101961;
        Object remaining$default = c1019612.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1019612.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(remaining$default);
                c1019612.L$0 = charset;
                c1019612.label = 1;
                remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel, 0L, c1019612, 1, null);
                if (remaining$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = (Charset) c1019612.L$0;
                ResultKt.throwOnFailure(remaining$default);
            }
            return StringsKt.readText$default((Input) remaining$default, charset, 0, 2, (Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Object tryReadText$$forInline(ByteReadChannel byteReadChannel, Charset charset, Continuation<? super String> continuation) {
        try {
            InlineMarker.mark(0);
            Object remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel, 0L, continuation, 1, null);
            InlineMarker.mark(1);
            return StringsKt.readText$default((Input) remaining$default, charset, 0, 2, (Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object logResponseBody(@NotNull StringBuilder sb, @Nullable ContentType contentType, @NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C101951 c101951;
        Charset charset;
        StringBuilder sb2;
        Charset charset2;
        if (continuation instanceof C101951) {
            c101951 = (C101951) continuation;
            int i = c101951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c101951.label = i - Integer.MIN_VALUE;
            } else {
                c101951 = new C101951(continuation);
            }
        }
        C101951 c1019512 = c101951;
        Object remaining$default = c1019512.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1019512.label;
        String text$default = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            sb.append("BODY Content-Type: " + contentType);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            sb.append("BODY START");
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            if (contentType == null || (charset = ContentTypesKt.charset(contentType)) == null) {
                charset = Charsets.UTF_8;
            }
            try {
                c1019512.L$0 = sb;
                c1019512.L$1 = charset;
                c1019512.label = 1;
                remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel, 0L, c1019512, 1, null);
                if (remaining$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Charset charset3 = charset;
                sb2 = sb;
                charset2 = charset3;
            } catch (Throwable unused) {
                sb2 = sb;
                if (text$default == null) {
                }
                sb2.append(text$default);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                sb2.append("BODY END");
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charset2 = (Charset) c1019512.L$1;
            sb2 = (StringBuilder) c1019512.L$0;
            try {
                ResultKt.throwOnFailure(remaining$default);
            } catch (Throwable unused2) {
                sb = sb2;
                sb2 = sb;
                if (text$default == null) {
                }
                sb2.append(text$default);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                sb2.append("BODY END");
                return Unit.INSTANCE;
            }
        }
        text$default = StringsKt.readText$default((Input) remaining$default, charset2, 0, 2, (Object) null);
        if (text$default == null) {
            text$default = "[response body omitted]";
        }
        sb2.append(text$default);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        sb2.append("BODY END");
        return Unit.INSTANCE;
    }
}
