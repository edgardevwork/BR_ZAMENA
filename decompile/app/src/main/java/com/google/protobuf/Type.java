package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList<Field> fields_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private String edition_ = "";

    @Override // com.google.protobuf.TypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
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

    @Override // com.google.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Field getFields(int index) {
        return this.fields_.get(index);
    }

    public FieldOrBuilder getFieldsOrBuilder(int index) {
        return this.fields_.get(index);
    }

    public final void ensureFieldsIsMutable() {
        Internal.ProtobufList<Field> protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setFields(int index, Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(index, value);
    }

    public final void addFields(Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(value);
    }

    public final void addFields(int index, Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(index, value);
    }

    public final void addAllFields(Iterable<? extends Field> values) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.fields_);
    }

    public final void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeFields(int index) {
        ensureFieldsIsMutable();
        this.fields_.remove(index);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getOneofs(int index) {
        return this.oneofs_.get(index);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int index) {
        return ByteString.copyFromUtf8(this.oneofs_.get(index));
    }

    public final void ensureOneofsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.oneofs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.oneofs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void setOneofs(int index, String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(index, value);
    }

    public final void addOneofs(String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(value);
    }

    public final void addAllOneofs(Iterable<String> values) {
        ensureOneofsIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.oneofs_);
    }

    public final void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void addOneofsBytes(ByteString value) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(value);
        ensureOneofsIsMutable();
        this.oneofs_.add(value.toStringUtf8());
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
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

    @Override // com.google.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(SourceContext value) {
        value.getClass();
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext != null && sourceContext != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom((SourceContext.Builder) value).buildPartial();
        } else {
            this.sourceContext_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(Syntax value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public String getEdition() {
        return this.edition_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public ByteString getEditionBytes() {
        return ByteString.copyFromUtf8(this.edition_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(ByteString value) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(value);
        this.edition_ = value.toStringUtf8();
    }

    public static Type parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Type parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Type parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Type parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Type parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Type parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Type parseFrom(InputStream input) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Type parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Type parseDelimitedFrom(InputStream input) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Type parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Type parseFrom(CodedInputStream input) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Type parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Type prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        public /* synthetic */ Builder(C79661 c79661) {
            this();
        }

        public Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getName() {
            return ((Type) this.instance).getName();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
            return ((Type) this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((Type) this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Type) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) throws IllegalArgumentException {
            copyOnWrite();
            ((Type) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((Type) this.instance).getFieldsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type) this.instance).getFieldsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Field getFields(int index) {
            return ((Type) this.instance).getFields(index);
        }

        public Builder setFields(int index, Field value) {
            copyOnWrite();
            ((Type) this.instance).setFields(index, value);
            return this;
        }

        public Builder setFields(int index, Field.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).setFields(index, builderForValue.build());
            return this;
        }

        public Builder addFields(Field value) {
            copyOnWrite();
            ((Type) this.instance).addFields(value);
            return this;
        }

        public Builder addFields(int index, Field value) {
            copyOnWrite();
            ((Type) this.instance).addFields(index, value);
            return this;
        }

        public Builder addFields(Field.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).addFields(builderForValue.build());
            return this;
        }

        public Builder addFields(int index, Field.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).addFields(index, builderForValue.build());
            return this;
        }

        public Builder addAllFields(Iterable<? extends Field> values) {
            copyOnWrite();
            ((Type) this.instance).addAllFields(values);
            return this;
        }

        public Builder clearFields() {
            copyOnWrite();
            ((Type) this.instance).clearFields();
            return this;
        }

        public Builder removeFields(int index) {
            copyOnWrite();
            ((Type) this.instance).removeFields(index);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOneofsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type) this.instance).getOneofsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getOneofs(int index) {
            return ((Type) this.instance).getOneofs(index);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int index) {
            return ((Type) this.instance).getOneofsBytes(index);
        }

        public Builder setOneofs(int index, String value) {
            copyOnWrite();
            ((Type) this.instance).setOneofs(index, value);
            return this;
        }

        public Builder addOneofs(String value) {
            copyOnWrite();
            ((Type) this.instance).addOneofs(value);
            return this;
        }

        public Builder addAllOneofs(Iterable<String> values) {
            copyOnWrite();
            ((Type) this.instance).addAllOneofs(values);
            return this;
        }

        public Builder clearOneofs() {
            copyOnWrite();
            ((Type) this.instance).clearOneofs();
            return this;
        }

        public Builder addOneofsBytes(ByteString value) throws IllegalArgumentException {
            copyOnWrite();
            ((Type) this.instance).addOneofsBytes(value);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Type) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Option getOptions(int index) {
            return ((Type) this.instance).getOptions(index);
        }

        public Builder setOptions(int index, Option value) {
            copyOnWrite();
            ((Type) this.instance).setOptions(index, value);
            return this;
        }

        public Builder setOptions(int index, Option.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public Builder addOptions(Option value) {
            copyOnWrite();
            ((Type) this.instance).addOptions(value);
            return this;
        }

        public Builder addOptions(int index, Option value) {
            copyOnWrite();
            ((Type) this.instance).addOptions(index, value);
            return this;
        }

        public Builder addOptions(Option.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public Builder addOptions(int index, Option.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> values) {
            copyOnWrite();
            ((Type) this.instance).addAllOptions(values);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Type) this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int index) {
            copyOnWrite();
            ((Type) this.instance).removeOptions(index);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type) this.instance).hasSourceContext();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type) this.instance).getSourceContext();
        }

        public Builder setSourceContext(SourceContext value) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(value);
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builderForValue) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(builderForValue.build());
            return this;
        }

        public Builder mergeSourceContext(SourceContext value) {
            copyOnWrite();
            ((Type) this.instance).mergeSourceContext(value);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Type) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type) this.instance).getSyntaxValue();
        }

        public Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((Type) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
            return ((Type) this.instance).getSyntax();
        }

        public Builder setSyntax(Syntax value) {
            copyOnWrite();
            ((Type) this.instance).setSyntax(value);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Type) this.instance).clearSyntax();
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public String getEdition() {
            return ((Type) this.instance).getEdition();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public ByteString getEditionBytes() {
            return ((Type) this.instance).getEditionBytes();
        }

        public Builder setEdition(String value) {
            copyOnWrite();
            ((Type) this.instance).setEdition(value);
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((Type) this.instance).clearEdition();
            return this;
        }

        public Builder setEditionBytes(ByteString value) throws IllegalArgumentException {
            copyOnWrite();
            ((Type) this.instance).setEditionBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.Type$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C79661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f929xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f929xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f929xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f929xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f929xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f929xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f929xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f929xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        C79661 c79661 = null;
        switch (C79661.f929xa1df5c61[method.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new Builder(c79661);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new Object[]{"bitField0_", "name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Type> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Type.class) {
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
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
