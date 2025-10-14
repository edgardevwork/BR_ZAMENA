package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.async.NonBlockingByteBufferJsonParser;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.p022io.CharacterEscapes;
import com.fasterxml.jackson.core.p022io.ContentReference;
import com.fasterxml.jackson.core.p022io.IOContext;
import com.fasterxml.jackson.core.p022io.InputDecorator;
import com.fasterxml.jackson.core.p022io.OutputDecorator;
import com.fasterxml.jackson.core.p022io.SerializedString;
import com.fasterxml.jackson.core.p022io.UTF8Writer;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JacksonFeature;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

/* loaded from: classes6.dex */
public class JsonFactory extends TokenStreamFactory implements Versioned, Serializable {
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final String FORMAT_NAME_JSON = "JSON";
    public static final long serialVersionUID = 2;
    public final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    public CharacterEscapes _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    public InputDecorator _inputDecorator;
    public int _maximumNonEscapedChar;
    public ObjectCodec _objectCodec;
    public OutputDecorator _outputDecorator;
    public int _parserFeatures;
    public final char _quoteChar;
    public final transient CharsToNameCanonicalizer _rootCharSymbols;
    public SerializableString _rootValueSeparator;
    public static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    public static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    public static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends FormatFeature> getFormatReadFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends FormatFeature> getFormatWriteFeatureType() {
        return null;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean requiresPropertyOrdering() {
        return false;
    }

    /* loaded from: classes7.dex */
    public enum Feature implements JacksonFeature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        public final boolean _defaultState;

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((ObjectCodec) null);
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._quoteChar = '\"';
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    public JsonFactory(JsonFactoryBuilder jsonFactoryBuilder) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactoryBuilder._factoryFeatures;
        this._parserFeatures = jsonFactoryBuilder._streamReadFeatures;
        this._generatorFeatures = jsonFactoryBuilder._streamWriteFeatures;
        this._inputDecorator = jsonFactoryBuilder._inputDecorator;
        this._outputDecorator = jsonFactoryBuilder._outputDecorator;
        this._characterEscapes = jsonFactoryBuilder._characterEscapes;
        this._rootValueSeparator = jsonFactoryBuilder._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactoryBuilder._maximumNonEscapedChar;
        this._quoteChar = jsonFactoryBuilder._quoteChar;
    }

    public JsonFactory(TSFBuilder<?, ?> tSFBuilder, boolean z) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = tSFBuilder._factoryFeatures;
        this._parserFeatures = tSFBuilder._streamReadFeatures;
        this._generatorFeatures = tSFBuilder._streamWriteFeatures;
        this._inputDecorator = tSFBuilder._inputDecorator;
        this._outputDecorator = tSFBuilder._outputDecorator;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = '\"';
    }

    public TSFBuilder<?, ?> rebuild() {
        _requireJSONFactory("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new JsonFactoryBuilder(this);
    }

    public static TSFBuilder<?, ?> builder() {
        return new JsonFactoryBuilder();
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (ObjectCodec) null);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canUseSchema(FormatSchema formatSchema) {
        String formatName;
        return (formatSchema == null || (formatName = getFormatName()) == null || !formatName.equals(formatSchema.getSchemaType())) ? false : true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public MatchStrength hasFormat(InputAccessor inputAccessor) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(inputAccessor);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        return ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor);
    }

    @Override // com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (streamReadFeature.mappedFeature().getMask() & this._parserFeatures) != 0;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (streamWriteFeature.mappedFeature().getMask() & this._generatorFeatures) != 0;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public String getRootValueSeparator() {
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString == null) {
            return null;
        }
        return serializableString.getValue();
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(File file) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(_fileInputStream(file), iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(URL url) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(InputStream inputStream) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(Reader reader) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        IOContext iOContext_createContext = _createContext(_createContentReference(bArr), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(iOContext_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(inputStreamDecorate, iOContext_createContext);
        }
        return _createParser(bArr, 0, bArr.length, iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException, IllegalArgumentException {
        InputStream inputStreamDecorate;
        _checkRangeBoundsForByteArray(bArr, i, i2);
        IOContext iOContext_createContext = _createContext(_createContentReference(bArr, i, i2), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(iOContext_createContext, bArr, i, i2)) != null) {
            return _createParser(inputStreamDecorate, iOContext_createContext);
        }
        return _createParser(bArr, i, i2, iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser(new StringReader(str));
        }
        IOContext iOContext_createContext = _createContext(_createContentReference(str), true);
        char[] cArrAllocTokenBuffer = iOContext_createContext.allocTokenBuffer(length);
        str.getChars(0, length, cArrAllocTokenBuffer, 0);
        return _createParser(cArrAllocTokenBuffer, 0, length, iOContext_createContext, true);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException {
        _checkRangeBoundsForCharArray(cArr, i, i2);
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(DataInput dataInput) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new NonBlockingJsonParser(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.makeChild(this._factoryFeatures));
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteBufferParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new NonBlockingByteBufferJsonParser(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.makeChild(this._factoryFeatures));
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(outputStream), false);
        iOContext_createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, iOContext_createContext), iOContext_createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, iOContext_createContext), iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(Writer writer) throws IOException {
        IOContext iOContext_createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream outputStream_fileOutputStream = _fileOutputStream(file);
        IOContext iOContext_createContext = _createContext(_createContentReference(outputStream_fileOutputStream), true);
        iOContext_createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream_fileOutputStream, iOContext_createContext), iOContext_createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream_fileOutputStream, jsonEncoding, iOContext_createContext), iOContext_createContext), iOContext_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException {
        return createParser(file);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException {
        return createParser(url);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException {
        return createParser(inputStream);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException {
        return createParser(reader);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException {
        return createParser(bArr);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException {
        return createParser(bArr, i, i2);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException {
        return createParser(str);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) throws IOException {
        try {
            return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
        } catch (IOException | RuntimeException e) {
            if (iOContext.isResourceManaged()) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    public JsonParser _createParser(Reader reader, IOContext iOContext) throws IOException {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures));
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, IOContext iOContext, boolean z) throws IOException {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures), cArr, i, i + i2, z);
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) throws IOException {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonParser _createParser(DataInput dataInput, IOContext iOContext) throws IOException {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int iSkipUTF8BOM = ByteSourceJsonBootstrapper.skipUTF8BOM(dataInput);
        return new UTF8DataInputJsonParser(iOContext, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.makeChild(this._factoryFeatures), iSkipUTF8BOM);
    }

    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            writerBasedJsonGenerator.setHighestNonEscapedChar(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) throws IOException {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            uTF8JsonGenerator.setHighestNonEscapedChar(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) throws IOException {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new UTF8Writer(iOContext, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public final InputStream _decorate(InputStream inputStream, IOContext iOContext) throws IOException {
        InputStream inputStreamDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (inputStreamDecorate = inputDecorator.decorate(iOContext, inputStream)) == null) ? inputStream : inputStreamDecorate;
    }

    public final Reader _decorate(Reader reader, IOContext iOContext) throws IOException {
        Reader readerDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (readerDecorate = inputDecorator.decorate(iOContext, reader)) == null) ? reader : readerDecorate;
    }

    public final DataInput _decorate(DataInput dataInput, IOContext iOContext) throws IOException {
        DataInput dataInputDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (dataInputDecorate = inputDecorator.decorate(iOContext, dataInput)) == null) ? dataInput : dataInputDecorate;
    }

    public final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) throws IOException {
        OutputStream outputStreamDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (outputStreamDecorate = outputDecorator.decorate(iOContext, outputStream)) == null) ? outputStream : outputStreamDecorate;
    }

    public final Writer _decorate(Writer writer, IOContext iOContext) throws IOException {
        Writer writerDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (writerDecorate = outputDecorator.decorate(iOContext, writer)) == null) ? writer : writerDecorate;
    }

    public BufferRecycler _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return BufferRecyclers.getBufferRecycler();
        }
        return new BufferRecycler();
    }

    public IOContext _createContext(ContentReference contentReference, boolean z) {
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        }
        return new IOContext(_getBufferRecycler(), contentReference, z);
    }

    @Deprecated
    public IOContext _createContext(Object obj, boolean z) {
        return new IOContext(_getBufferRecycler(), _createContentReference(obj), z);
    }

    public IOContext _createNonBlockingContext(Object obj) {
        return new IOContext(_getBufferRecycler(), _createContentReference(obj), false);
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj);
    }

    public ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i, i2);
    }

    public final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    public final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }
}
