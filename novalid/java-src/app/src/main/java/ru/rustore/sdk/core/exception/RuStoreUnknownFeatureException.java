package ru.rustore.sdk.core.exception;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: RuStoreFeatureAvailabilityException.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"Lru/rustore/sdk/core/exception/RuStoreUnknownFeatureException;", "Lru/rustore/sdk/core/exception/RuStoreFeatureAvailabilityException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "(Ljava/lang/String;)V", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class RuStoreUnknownFeatureException extends RuStoreFeatureAvailabilityException {
    public RuStoreUnknownFeatureException(@Nullable String str) {
        super(str == null ? "Unknown feature" : str);
    }
}
