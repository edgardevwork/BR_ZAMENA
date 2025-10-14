package io.appmetrica.analytics.coreapi.internal.data;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/Parser;", "IN", "OUT", "", "parse", Constants.MessagePayloadKeys.RAW_DATA, "(Ljava/lang/Object;)Ljava/lang/Object;", "parseOrNull", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface Parser<IN, OUT> {

    @Metadata(m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static <IN, OUT> OUT parseOrNull(@NotNull Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                Result.Companion companion = Result.INSTANCE;
                out = (OUT) Result.m15699constructorimpl(parser.parse(in));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                out = (OUT) Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m15705isFailureimpl(out)) {
                return null;
            }
            return out;
        }
    }

    @NotNull
    OUT parse(IN in);

    @Nullable
    OUT parseOrNull(IN in);
}
