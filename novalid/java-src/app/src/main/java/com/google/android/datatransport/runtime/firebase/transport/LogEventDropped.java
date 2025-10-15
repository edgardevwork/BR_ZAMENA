package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class LogEventDropped {
    public static final LogEventDropped DEFAULT_INSTANCE = new Builder().build();
    public final long events_dropped_count_;
    public final Reason reason_;

    public LogEventDropped(long j, Reason reason) {
        this.events_dropped_count_ = j;
        this.reason_ = reason;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.events_dropped_count_;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.reason_;
    }

    public static LogEventDropped getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        public long events_dropped_count_ = 0;
        public Reason reason_ = Reason.REASON_UNKNOWN;

        public LogEventDropped build() {
            return new LogEventDropped(this.events_dropped_count_, this.reason_);
        }

        public Builder setEventsDroppedCount(long j) {
            this.events_dropped_count_ = j;
            return this;
        }

        public Builder setReason(Reason reason) {
            this.reason_ = reason;
            return this;
        }
    }

    /* loaded from: classes8.dex */
    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }
}
