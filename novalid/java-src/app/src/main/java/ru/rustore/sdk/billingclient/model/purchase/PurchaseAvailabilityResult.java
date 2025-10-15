package ru.rustore.sdk.billingclient.model.purchase;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jfrog.build.extractor.scan.License;
import ru.rustore.sdk.core.exception.RuStoreException;

@Deprecated(message = "Будет удалён в следующей версии SDK")
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;", "", "Available", "Unavailable", License.UNKNOWN_LICENCE_NAME, "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult$Available;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult$Unavailable;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult$Unknown;", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface PurchaseAvailabilityResult {

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult$Available;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;", "()V", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Available implements PurchaseAvailabilityResult {
        public static final Available INSTANCE = new Available();

        private Available() {
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult$Unavailable;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;", "cause", "Lru/rustore/sdk/core/exception/RuStoreException;", "(Lru/rustore/sdk/core/exception/RuStoreException;)V", "getCause", "()Lru/rustore/sdk/core/exception/RuStoreException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class Unavailable implements PurchaseAvailabilityResult {
        private final RuStoreException cause;

        public Unavailable(RuStoreException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, RuStoreException ruStoreException, int i, Object obj) {
            if ((i & 1) != 0) {
                ruStoreException = unavailable.cause;
            }
            return unavailable.copy(ruStoreException);
        }

        /* renamed from: component1, reason: from getter */
        public final RuStoreException getCause() {
            return this.cause;
        }

        public final Unavailable copy(RuStoreException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Unavailable(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unavailable) && Intrinsics.areEqual(this.cause, ((Unavailable) other).cause);
        }

        public final RuStoreException getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Unavailable(cause=" + this.cause + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult$Unknown;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;", "()V", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Unknown implements PurchaseAvailabilityResult {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }
    }
}
