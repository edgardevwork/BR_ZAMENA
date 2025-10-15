package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, Builder> implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<EnumValue> PARSER;
    private int number_;
    private String name_ = "";
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    @Override // com.google.protobuf.EnumValueOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString value) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int value) {
        this.number_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.EnumValueOrBuilder
    public Option getOptions(int index) {
        return this.options_.get(index);
    }

    public OptionOrBuilder getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> values) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    public static EnumValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EnumValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EnumValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EnumValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EnumValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EnumValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EnumValue parseFrom(InputStream input) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EnumValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EnumValue parseDelimitedFrom(InputStream input) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EnumValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EnumValue parseFrom(CodedInputStream input) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EnumValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EnumValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements EnumValueOrBuilder {
        public /* synthetic */ Builder(C79281 c79281) {
            this();
        }

        public Builder() {
            super(EnumValue.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public String getName() {
            return ((EnumValue) this.instance).getName();
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
            return ((EnumValue) this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((EnumValue) this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EnumValue) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) throws IllegalArgumentException {
            copyOnWrite();
            ((EnumValue) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((EnumValue) this.instance).getNumber();
        }

        public Builder setNumber(int value) {
            copyOnWrite();
            ((EnumValue) this.instance).setNumber(value);
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((EnumValue) this.instance).clearNumber();
            return this;
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((EnumValue) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.EnumValueOrBuilder
        public Option getOptions(int index) {
            return ((EnumValue) this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            copyOnWrite();
            ((EnumValue) this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            copyOnWrite();
            ((EnumValue) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            copyOnWrite();
            ((EnumValue) this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            copyOnWrite();
            ((EnumValue) this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            copyOnWrite();
            ((EnumValue) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            copyOnWrite();
            ((EnumValue) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            copyOnWrite();
            ((EnumValue) this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((EnumValue) this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            copyOnWrite();
            ((EnumValue) this.instance).removeOptions(index);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.EnumValue$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C79281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f913xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f913xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f913xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f913xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f913xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f913xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f913xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f913xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        C79281 c79281 = null;
        switch (C79281.f913xa1df5c61[method.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new Builder(c79281);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EnumValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EnumValue.class) {
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
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
