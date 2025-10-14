package kotlinx.serialization;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.Nullable;

/* compiled from: SerializationExceptions.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", FirebaseAnalytics.Param.INDEX, "", "(I)V", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@PublishedApi
/* loaded from: classes5.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(@Nullable String str) {
        super(str);
    }

    public UnknownFieldException(int i) {
        this("An unknown field for index " + i);
    }
}
