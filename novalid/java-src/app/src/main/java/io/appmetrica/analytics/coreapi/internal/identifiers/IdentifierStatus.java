package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/identifiers/IdentifierStatus;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Companion", "OK", "IDENTIFIER_PROVIDER_UNAVAILABLE", "INVALID_ADV_ID", "NO_STARTUP", "FEATURE_DISABLED", ArtifactOrigin.UNKNOWN, "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN(ArtifactOrigin.UNKNOWN);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String value;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0006"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/identifiers/IdentifierStatus$Companion;", "", "", "stringValue", "Lio/appmetrica/analytics/coreapi/internal/identifiers/IdentifierStatus;", "from", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final IdentifierStatus from(@Nullable String stringValue) {
            IdentifierStatus identifierStatus;
            IdentifierStatus[] identifierStatusArrValues = IdentifierStatus.values();
            int length = identifierStatusArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    identifierStatus = null;
                    break;
                }
                identifierStatus = identifierStatusArrValues[i];
                if (Intrinsics.areEqual(identifierStatus.getValue(), stringValue)) {
                    break;
                }
                i++;
            }
            return identifierStatus == null ? IdentifierStatus.UNKNOWN : identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.value = str;
    }

    @JvmStatic
    @NotNull
    public static final IdentifierStatus from(@Nullable String str) {
        return INSTANCE.from(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
