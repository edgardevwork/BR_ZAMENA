package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C8858Dm;
import io.appmetrica.analytics.impl.C9979xd;
import java.util.Currency;

/* loaded from: classes8.dex */
public class Revenue {

    @NonNull
    public final Currency currency;

    @Nullable
    public final String payload;
    public final long priceMicros;

    @Nullable
    public final String productID;

    @Nullable
    public final Integer quantity;

    @Nullable
    public final Receipt receipt;

    public static class Builder {

        /* renamed from: g */
        private static final C8858Dm f5996g = new C8858Dm(new C9979xd("revenue currency"));

        /* renamed from: a */
        final long f5997a;

        /* renamed from: b */
        final Currency f5998b;

        /* renamed from: c */
        Integer f5999c;

        /* renamed from: d */
        String f6000d;

        /* renamed from: e */
        String f6001e;

        /* renamed from: f */
        Receipt f6002f;

        public /* synthetic */ Builder(long j, Currency currency, int i) {
            this(j, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f6001e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f6000d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f5999c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f6002f = receipt;
            return this;
        }

        private Builder(long j, Currency currency) {
            f5996g.mo5086a(currency);
            this.f5997a = j;
            this.f5998b = currency;
        }
    }

    public static class Receipt {

        @Nullable
        public final String data;

        @Nullable
        public final String signature;

        public static class Builder {

            /* renamed from: a */
            private String f6003a;

            /* renamed from: b */
            private String f6004b;

            public /* synthetic */ Builder(int i) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f6003a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f6004b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f6003a;
            this.signature = builder.f6004b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j, @NonNull Currency currency) {
        return new Builder(j, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f5997a;
        this.currency = builder.f5998b;
        this.quantity = builder.f5999c;
        this.productID = builder.f6000d;
        this.payload = builder.f6001e;
        this.receipt = builder.f6002f;
    }
}
