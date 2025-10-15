package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.TimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class DateTime extends GeneratedMessageLite<DateTime, Builder> implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    /* loaded from: classes8.dex */
    public enum TimeOffsetCase {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);

        public final int value;

        TimeOffsetCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static TimeOffsetCase valueOf(int i) {
            return forNumber(i);
        }

        public static TimeOffsetCase forNumber(int i) {
            if (i == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i == 8) {
                return UTC_OFFSET;
            }
            if (i != 9) {
                return null;
            }
            return TIME_ZONE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.type.DateTimeOrBuilder
    public TimeOffsetCase getTimeOffsetCase() {
        return TimeOffsetCase.forNumber(this.timeOffsetCase_);
    }

    public final void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getYear() {
        return this.year_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYear(int i) {
        this.year_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYear() {
        this.year_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getMonth() {
        return this.month_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonth(int i) {
        this.month_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonth() {
        this.month_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getDay() {
        return this.day_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getHours() {
        return this.hours_;
    }

    public final void setHours(int i) {
        this.hours_ = i;
    }

    public final void clearHours() {
        this.hours_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getMinutes() {
        return this.minutes_;
    }

    public final void setMinutes(int i) {
        this.minutes_ = i;
    }

    public final void clearMinutes() {
        this.minutes_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getSeconds() {
        return this.seconds_;
    }

    public final void setSeconds(int i) {
        this.seconds_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public boolean hasUtcOffset() {
        return this.timeOffsetCase_ == 8;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public Duration getUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return (Duration) this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    public final void setUtcOffset(Duration duration) {
        duration.getClass();
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    public final void mergeUtcOffset(Duration duration) {
        duration.getClass();
        if (this.timeOffsetCase_ == 8 && this.timeOffset_ != Duration.getDefaultInstance()) {
            this.timeOffset_ = Duration.newBuilder((Duration) this.timeOffset_).mergeFrom((Duration.Builder) duration).buildPartial();
        } else {
            this.timeOffset_ = duration;
        }
        this.timeOffsetCase_ = 8;
    }

    public final void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    @Override // com.google.type.DateTimeOrBuilder
    public boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    @Override // com.google.type.DateTimeOrBuilder
    public TimeZone getTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return (TimeZone) this.timeOffset_;
        }
        return TimeZone.getDefaultInstance();
    }

    public final void setTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    public final void mergeTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        if (this.timeOffsetCase_ == 9 && this.timeOffset_ != TimeZone.getDefaultInstance()) {
            this.timeOffset_ = TimeZone.newBuilder((TimeZone) this.timeOffset_).mergeFrom((TimeZone.Builder) timeZone).buildPartial();
        } else {
            this.timeOffset_ = timeZone;
        }
        this.timeOffsetCase_ = 9;
    }

    public final void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DateTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DateTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DateTime dateTime) {
        return DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DateTime, Builder> implements DateTimeOrBuilder {
        public /* synthetic */ Builder(C79971 c79971) {
            this();
        }

        public Builder() {
            super(DateTime.DEFAULT_INSTANCE);
        }

        @Override // com.google.type.DateTimeOrBuilder
        public TimeOffsetCase getTimeOffsetCase() {
            return ((DateTime) this.instance).getTimeOffsetCase();
        }

        public Builder clearTimeOffset() {
            copyOnWrite();
            ((DateTime) this.instance).clearTimeOffset();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getYear() {
            return ((DateTime) this.instance).getYear();
        }

        public Builder setYear(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setYear(i);
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((DateTime) this.instance).clearYear();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getMonth() {
            return ((DateTime) this.instance).getMonth();
        }

        public Builder setMonth(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setMonth(i);
            return this;
        }

        public Builder clearMonth() {
            copyOnWrite();
            ((DateTime) this.instance).clearMonth();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getDay() {
            return ((DateTime) this.instance).getDay();
        }

        public Builder setDay(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setDay(i);
            return this;
        }

        public Builder clearDay() {
            copyOnWrite();
            ((DateTime) this.instance).clearDay();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getHours() {
            return ((DateTime) this.instance).getHours();
        }

        public Builder setHours(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setHours(i);
            return this;
        }

        public Builder clearHours() {
            copyOnWrite();
            ((DateTime) this.instance).clearHours();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getMinutes() {
            return ((DateTime) this.instance).getMinutes();
        }

        public Builder setMinutes(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setMinutes(i);
            return this;
        }

        public Builder clearMinutes() {
            copyOnWrite();
            ((DateTime) this.instance).clearMinutes();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getSeconds() {
            return ((DateTime) this.instance).getSeconds();
        }

        public Builder setSeconds(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setSeconds(i);
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            ((DateTime) this.instance).clearSeconds();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getNanos() {
            return ((DateTime) this.instance).getNanos();
        }

        public Builder setNanos(int i) {
            copyOnWrite();
            ((DateTime) this.instance).setNanos(i);
            return this;
        }

        public Builder clearNanos() {
            copyOnWrite();
            ((DateTime) this.instance).clearNanos();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public boolean hasUtcOffset() {
            return ((DateTime) this.instance).hasUtcOffset();
        }

        @Override // com.google.type.DateTimeOrBuilder
        public Duration getUtcOffset() {
            return ((DateTime) this.instance).getUtcOffset();
        }

        public Builder setUtcOffset(Duration duration) {
            copyOnWrite();
            ((DateTime) this.instance).setUtcOffset(duration);
            return this;
        }

        public Builder setUtcOffset(Duration.Builder builder) {
            copyOnWrite();
            ((DateTime) this.instance).setUtcOffset(builder.build());
            return this;
        }

        public Builder mergeUtcOffset(Duration duration) {
            copyOnWrite();
            ((DateTime) this.instance).mergeUtcOffset(duration);
            return this;
        }

        public Builder clearUtcOffset() {
            copyOnWrite();
            ((DateTime) this.instance).clearUtcOffset();
            return this;
        }

        @Override // com.google.type.DateTimeOrBuilder
        public boolean hasTimeZone() {
            return ((DateTime) this.instance).hasTimeZone();
        }

        @Override // com.google.type.DateTimeOrBuilder
        public TimeZone getTimeZone() {
            return ((DateTime) this.instance).getTimeZone();
        }

        public Builder setTimeZone(TimeZone timeZone) {
            copyOnWrite();
            ((DateTime) this.instance).setTimeZone(timeZone);
            return this;
        }

        public Builder setTimeZone(TimeZone.Builder builder) {
            copyOnWrite();
            ((DateTime) this.instance).setTimeZone(builder.build());
            return this;
        }

        public Builder mergeTimeZone(TimeZone timeZone) {
            copyOnWrite();
            ((DateTime) this.instance).mergeTimeZone(timeZone);
            return this;
        }

        public Builder clearTimeZone() {
            copyOnWrite();
            ((DateTime) this.instance).clearTimeZone();
            return this;
        }
    }

    /* renamed from: com.google.type.DateTime$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C79971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f948xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f948xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f948xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f948xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f948xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C79971 c79971 = null;
        switch (C79971.f948xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DateTime();
            case 2:
                return new Builder(c79971);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DateTime> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DateTime.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } finally {
                        }
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, dateTime);
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<DateTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
