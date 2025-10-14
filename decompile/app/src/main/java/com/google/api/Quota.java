package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class Quota extends GeneratedMessageLite<Quota, Builder> implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser<Quota> PARSER;
    private Internal.ProtobufList<QuotaLimit> limits_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<MetricRule> metricRules_ = GeneratedMessageLite.emptyProtobufList();

    @Override // com.google.api.QuotaOrBuilder
    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public QuotaLimit getLimits(int i) {
        return this.limits_.get(i);
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int i) {
        return this.limits_.get(i);
    }

    public final void ensureLimitsIsMutable() {
        Internal.ProtobufList<QuotaLimit> protobufList = this.limits_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.limits_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setLimits(int i, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.set(i, quotaLimit);
    }

    public final void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    public final void addLimits(int i, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(i, quotaLimit);
    }

    public final void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        ensureLimitsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.limits_);
    }

    public final void clearLimits() {
        this.limits_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeLimits(int i) {
        ensureLimitsIsMutable();
        this.limits_.remove(i);
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public MetricRule getMetricRules(int i) {
        return this.metricRules_.get(i);
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int i) {
        return this.metricRules_.get(i);
    }

    public final void ensureMetricRulesIsMutable() {
        Internal.ProtobufList<MetricRule> protobufList = this.metricRules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.metricRules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setMetricRules(int i, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i, metricRule);
    }

    public final void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    public final void addMetricRules(int i, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i, metricRule);
    }

    public final void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        ensureMetricRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.metricRules_);
    }

    public final void clearMetricRules() {
        this.metricRules_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeMetricRules(int i) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Quota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quota parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Quota quota) {
        return DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Quota, Builder> implements QuotaOrBuilder {
        public /* synthetic */ Builder(C71341 c71341) {
            this();
        }

        public Builder() {
            super(Quota.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<QuotaLimit> getLimitsList() {
            return Collections.unmodifiableList(((Quota) this.instance).getLimitsList());
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getLimitsCount() {
            return ((Quota) this.instance).getLimitsCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public QuotaLimit getLimits(int i) {
            return ((Quota) this.instance).getLimits(i);
        }

        public Builder setLimits(int i, QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).setLimits(i, quotaLimit);
            return this;
        }

        public Builder setLimits(int i, QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).setLimits(i, builder.build());
            return this;
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(quotaLimit);
            return this;
        }

        public Builder addLimits(int i, QuotaLimit quotaLimit) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(i, quotaLimit);
            return this;
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(builder.build());
            return this;
        }

        public Builder addLimits(int i, QuotaLimit.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addLimits(i, builder.build());
            return this;
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
            copyOnWrite();
            ((Quota) this.instance).addAllLimits(iterable);
            return this;
        }

        public Builder clearLimits() {
            copyOnWrite();
            ((Quota) this.instance).clearLimits();
            return this;
        }

        public Builder removeLimits(int i) {
            copyOnWrite();
            ((Quota) this.instance).removeLimits(i);
            return this;
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<MetricRule> getMetricRulesList() {
            return Collections.unmodifiableList(((Quota) this.instance).getMetricRulesList());
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getMetricRulesCount() {
            return ((Quota) this.instance).getMetricRulesCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public MetricRule getMetricRules(int i) {
            return ((Quota) this.instance).getMetricRules(i);
        }

        public Builder setMetricRules(int i, MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).setMetricRules(i, metricRule);
            return this;
        }

        public Builder setMetricRules(int i, MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).setMetricRules(i, builder.build());
            return this;
        }

        public Builder addMetricRules(MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(metricRule);
            return this;
        }

        public Builder addMetricRules(int i, MetricRule metricRule) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(i, metricRule);
            return this;
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(builder.build());
            return this;
        }

        public Builder addMetricRules(int i, MetricRule.Builder builder) {
            copyOnWrite();
            ((Quota) this.instance).addMetricRules(i, builder.build());
            return this;
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
            copyOnWrite();
            ((Quota) this.instance).addAllMetricRules(iterable);
            return this;
        }

        public Builder clearMetricRules() {
            copyOnWrite();
            ((Quota) this.instance).clearMetricRules();
            return this;
        }

        public Builder removeMetricRules(int i) {
            copyOnWrite();
            ((Quota) this.instance).removeMetricRules(i);
            return this;
        }
    }

    /* renamed from: com.google.api.Quota$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C71341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f761xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f761xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f761xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f761xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f761xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f761xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f761xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f761xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C71341 c71341 = null;
        switch (C71341.f761xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Quota();
            case 2:
                return new Builder(c71341);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Quota> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Quota.class) {
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
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        GeneratedMessageLite.registerDefaultInstance(Quota.class, quota);
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Quota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
