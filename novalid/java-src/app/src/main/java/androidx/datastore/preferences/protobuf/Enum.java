package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.EnumValue;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList<EnumValue> enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
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
        byteString.getClass();
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    public final void ensureEnumvalueIsMutable() {
        if (this.enumvalue_.isModifiable()) {
            return;
        }
        this.enumvalue_ = GeneratedMessageLite.mutableCopy(this.enumvalue_);
    }

    public final void setEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, enumValue);
    }

    public final void setEnumvalue(int i, EnumValue.Builder builder) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, builder.build());
    }

    public final void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    public final void addEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, enumValue);
    }

    public final void addEnumvalue(EnumValue.Builder builder) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(builder.build());
    }

    public final void addEnumvalue(int i, EnumValue.Builder builder) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, builder.build());
    }

    public final void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.enumvalue_);
    }

    public final void clearEnumvalue() {
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    }

    public final void removeEnumvalue(int i) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    private void ensureOptionsIsMutable() {
        if (this.options_.isModifiable()) {
            return;
        }
        this.options_ = GeneratedMessageLite.mutableCopy(this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, Option.Builder builder) {
        ensureOptionsIsMutable();
        this.options_.set(i, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option.Builder builder) {
        ensureOptionsIsMutable();
        this.options_.add(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, Option.Builder builder) {
        ensureOptionsIsMutable();
        this.options_.add(i, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext.Builder builder) {
        this.sourceContext_ = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom((SourceContext.Builder) sourceContext).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Enum r1) {
        return DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
        public /* synthetic */ Builder(C24521 c24521) {
            this();
        }

        public Builder() {
            super(Enum.DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public String getName() {
            return ((Enum) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
            return ((Enum) this.instance).getNameBytes();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Enum) this.instance).setName(str);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Enum) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((Enum) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List<EnumValue> getEnumvalueList() {
            return Collections.unmodifiableList(((Enum) this.instance).getEnumvalueList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            return ((Enum) this.instance).getEnumvalueCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int i) {
            return ((Enum) this.instance).getEnumvalue(i);
        }

        public Builder setEnumvalue(int i, EnumValue enumValue) {
            copyOnWrite();
            ((Enum) this.instance).setEnumvalue(i, enumValue);
            return this;
        }

        public Builder setEnumvalue(int i, EnumValue.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).setEnumvalue(i, builder);
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(enumValue);
            return this;
        }

        public Builder addEnumvalue(int i, EnumValue enumValue) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(i, enumValue);
            return this;
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(builder);
            return this;
        }

        public Builder addEnumvalue(int i, EnumValue.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addEnumvalue(i, builder);
            return this;
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            copyOnWrite();
            ((Enum) this.instance).addAllEnumvalue(iterable);
            return this;
        }

        public Builder clearEnumvalue() {
            copyOnWrite();
            ((Enum) this.instance).clearEnumvalue();
            return this;
        }

        public Builder removeEnumvalue(int i) {
            copyOnWrite();
            ((Enum) this.instance).removeEnumvalue(i);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Enum) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            return ((Enum) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Option getOptions(int i) {
            return ((Enum) this.instance).getOptions(i);
        }

        public Builder setOptions(int i, Option option) {
            copyOnWrite();
            ((Enum) this.instance).setOptions(i, option);
            return this;
        }

        public Builder setOptions(int i, Option.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).setOptions(i, builder);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(option);
            return this;
        }

        public Builder addOptions(int i, Option option) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(i, option);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(builder);
            return this;
        }

        public Builder addOptions(int i, Option.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).addOptions(i, builder);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Enum) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Enum) this.instance).clearOptions();
            return this;
        }

        public Builder removeOptions(int i) {
            copyOnWrite();
            ((Enum) this.instance).removeOptions(i);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return ((Enum) this.instance).hasSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            return ((Enum) this.instance).getSourceContext();
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Enum) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            ((Enum) this.instance).setSourceContext(builder);
            return this;
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Enum) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Enum) this.instance).clearSourceContext();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return ((Enum) this.instance).getSyntaxValue();
        }

        public Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((Enum) this.instance).setSyntaxValue(i);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
            return ((Enum) this.instance).getSyntax();
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            ((Enum) this.instance).setSyntax(syntax);
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Enum) this.instance).clearSyntax();
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Enum$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C24521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f267xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f267xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f267xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f267xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f267xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f267xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f267xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f267xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C24521 c24521 = null;
        switch (C24521.f267xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new Builder(c24521);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Enum> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Enum.class) {
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
        Enum r0 = new Enum();
        DEFAULT_INSTANCE = r0;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, r0);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
