package com.google.api;

import com.google.api.LabelDescriptor;
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

/* loaded from: classes8.dex */
public final class LogDescriptor extends GeneratedMessageLite<LogDescriptor, Builder> implements LogDescriptorOrBuilder {
    private static final LogDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<LogDescriptor> PARSER;
    private String name_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = GeneratedMessageLite.emptyProtobufList();
    private String description_ = "";
    private String displayName_ = "";

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
        return this.labels_.get(i);
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    public final void ensureLabelsIsMutable() {
        Internal.ProtobufList<LabelDescriptor> protobufList = this.labels_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.labels_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, labelDescriptor);
    }

    public final void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    public final void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public final void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.labels_);
    }

    public final void clearLabels() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public ByteString getDisplayNameBytes() {
        return ByteString.copyFromUtf8(this.displayName_);
    }

    public final void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    public final void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    public final void setDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.displayName_ = byteString.toStringUtf8();
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LogDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LogDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LogDescriptor logDescriptor) {
        return DEFAULT_INSTANCE.createBuilder(logDescriptor);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LogDescriptor, Builder> implements LogDescriptorOrBuilder {
        public /* synthetic */ Builder(C71181 c71181) {
            this();
        }

        public Builder() {
            super(LogDescriptor.DEFAULT_INSTANCE);
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getName() {
            return ((LogDescriptor) this.instance).getName();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public ByteString getNameBytes() {
            return ((LogDescriptor) this.instance).getNameBytes();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setName(str);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((LogDescriptor) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((LogDescriptor) this.instance).getLabelsList());
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public int getLabelsCount() {
            return ((LogDescriptor) this.instance).getLabelsCount();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
            return ((LogDescriptor) this.instance).getLabels(i);
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setLabels(i, labelDescriptor);
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setLabels(i, builder.build());
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(i, labelDescriptor);
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(builder.build());
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addLabels(i, builder.build());
            return this;
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            copyOnWrite();
            ((LogDescriptor) this.instance).addAllLabels(iterable);
            return this;
        }

        public Builder clearLabels() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearLabels();
            return this;
        }

        public Builder removeLabels(int i) {
            copyOnWrite();
            ((LogDescriptor) this.instance).removeLabels(i);
            return this;
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getDescription() {
            return ((LogDescriptor) this.instance).getDescription();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
            return ((LogDescriptor) this.instance).getDescriptionBytes();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDescription(str);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearDescription();
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getDisplayName() {
            return ((LogDescriptor) this.instance).getDisplayName();
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public ByteString getDisplayNameBytes() {
            return ((LogDescriptor) this.instance).getDisplayNameBytes();
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDisplayName(str);
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((LogDescriptor) this.instance).clearDisplayName();
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((LogDescriptor) this.instance).setDisplayNameBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.api.LogDescriptor$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C71181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f748xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f748xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f748xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f748xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f748xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f748xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f748xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f748xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C71181 c71181 = null;
        switch (C71181.f748xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LogDescriptor();
            case 2:
                return new Builder(c71181);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", LabelDescriptor.class, "description_", "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LogDescriptor> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LogDescriptor.class) {
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
        LogDescriptor logDescriptor = new LogDescriptor();
        DEFAULT_INSTANCE = logDescriptor;
        GeneratedMessageLite.registerDefaultInstance(LogDescriptor.class, logDescriptor);
    }

    public static LogDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LogDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
