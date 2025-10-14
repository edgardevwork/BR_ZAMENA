package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.JsonPointerBasedFilter;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class ObjectReader extends ObjectCodec implements Versioned, Serializable {
    public static final long serialVersionUID = 2;
    public final DeserializationConfig _config;
    public final DefaultDeserializationContext _context;
    public final DataFormatReaders _dataFormatReaders;
    public final TokenFilter _filter;
    public final InjectableValues _injectableValues;
    public transient JavaType _jsonNodeType;
    public final JsonFactory _parserFactory;
    public final JsonDeserializer<Object> _rootDeserializer;
    public final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    public final FormatSchema _schema;
    public final boolean _unwrapRoot;
    public final Object _valueToUpdate;
    public final JavaType _valueType;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, TokenFilter tokenFilter) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = tokenFilter;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, jsonDeserializer, obj, formatSchema, injectableValues, dataFormatReaders);
    }

    public <T> MappingIterator<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z) {
        return new MappingIterator<>(this._valueType, jsonParser, deserializationContext, jsonDeserializer, z, this._valueToUpdate);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenCurrentToken;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader with(DatatypeFeature datatypeFeature) {
        return _with(this._config.with(datatypeFeature));
    }

    public ObjectReader withFeatures(DatatypeFeature... datatypeFeatureArr) {
        return _with(this._config.withFeatures(datatypeFeatureArr));
    }

    public ObjectReader without(DatatypeFeature datatypeFeature) {
        return _with(this._config.without(datatypeFeature));
    }

    public ObjectReader withoutFeatures(DatatypeFeature... datatypeFeatureArr) {
        return _with(this._config.withoutFeatures(datatypeFeatureArr));
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader with(StreamReadFeature streamReadFeature) {
        return _with(this._config.with(streamReadFeature.mappedFeature()));
    }

    public ObjectReader without(StreamReadFeature streamReadFeature) {
        return _with(this._config.without(streamReadFeature.mappedFeature()));
    }

    public ObjectReader with(FormatFeature formatFeature) {
        return _with(this._config.with(formatFeature));
    }

    public ObjectReader withFeatures(FormatFeature... formatFeatureArr) {
        return _with(this._config.withFeatures(formatFeatureArr));
    }

    public ObjectReader without(FormatFeature formatFeature) {
        return _with(this._config.without(formatFeature));
    }

    public ObjectReader withoutFeatures(FormatFeature... formatFeatureArr) {
        return _with(this._config.withoutFeatures(formatFeatureArr));
    }

    /* renamed from: at */
    public ObjectReader m1020at(String str) {
        _assertNotNull("pointerExpr", str);
        return new ObjectReader(this, new JsonPointerBasedFilter(str));
    }

    /* renamed from: at */
    public ObjectReader m1019at(JsonPointer jsonPointer) {
        _assertNotNull("pointer", jsonPointer);
        return new ObjectReader(this, new JsonPointerBasedFilter(jsonPointer));
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public ObjectReader with(InjectableValues injectableValues) {
        return this._injectableValues == injectableValues ? this : _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, injectableValues, this._dataFormatReaders);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(objectReader_new);
        }
        return objectReader_new;
    }

    public ObjectReader withRootName(String str) {
        return _with(this._config.withRootName(str));
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    public ObjectReader with(FormatSchema formatSchema) {
        if (this._schema == formatSchema) {
            return this;
        }
        _verifySchemaType(formatSchema);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, formatSchema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        JsonDeserializer<Object> jsonDeserializer_prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        DataFormatReaders dataFormatReadersWithType = this._dataFormatReaders;
        if (dataFormatReadersWithType != null) {
            dataFormatReadersWithType = dataFormatReadersWithType.withType(javaType);
        }
        return _new(this, this._config, javaType, jsonDeserializer_prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReadersWithType);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader forType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    @Deprecated
    public ObjectReader withType(TypeReference<?> typeReference) {
        return forType(this._config.getTypeFactory().constructType(typeReference.getType()));
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaTypeConstructType = this._valueType;
        if (javaTypeConstructType == null) {
            javaTypeConstructType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaTypeConstructType, this._rootDeserializer, obj, this._schema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader with(Locale locale) {
        return _with(this._config.with(locale));
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with(this._config.with(timeZone));
    }

    public ObjectReader withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return _with(this._config.withHandler(deserializationProblemHandler));
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with(this._config.with(base64Variant));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new DataFormatReaders(objectReaderArr));
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataFormatReaders) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with(this._config.withAttributes(map));
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with(this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with(this._config.withoutAttribute(obj));
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, deserializationConfig);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        return dataFormatReaders != null ? objectReader_new.withFormatDetection(dataFormatReaders.with(deserializationConfig)) : objectReader_new;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._config.isEnabled(datatypeFeature);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._config.isEnabled(feature, this._parserFactory);
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return this._config.isEnabled(streamReadFeature.mappedFeature(), this._parserFactory);
    }

    public DeserializationConfig getConfig() {
        return this._config;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        return this._config.initialize(this._parserFactory.createParser(file), this._schema);
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        return this._config.initialize(this._parserFactory.createParser(url), this._schema);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._config.initialize(this._parserFactory.createParser(inputStream), this._schema);
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._config.initialize(this._parserFactory.createParser(reader), this._schema);
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr), this._schema);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr, i, i2), this._schema);
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        return this._config.initialize(this._parserFactory.createParser(str), this._schema);
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr), this._schema);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull("content", cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr, i, i2), this._schema);
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        return this._config.initialize(this._parserFactory.createParser(dataInput), this._schema);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._config.initialize(this._parserFactory.createNonBlockingByteArrayParser(), this._schema);
    }

    public <T> T readValue(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) _bind(jsonParser, this._valueToUpdate);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType((Class<?>) cls).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType((TypeReference<?>) typeReference).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType((JavaType) resolvedType).readValue(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return (T) forType(javaType).readValue(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, TypeReference<T> typeReference) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType((TypeReference<?>) typeReference).readValues(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> Iterator<T> readValues(JsonParser jsonParser, ResolvedType resolvedType) throws IOException {
        _assertNotNull("p", jsonParser);
        return readValues(jsonParser, (JavaType) resolvedType);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull("p", jsonParser);
        return forType(javaType).readValues(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonNode createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonNode createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public JsonNode missingNode() {
        return this._config.getNodeFactory().missingNode();
    }

    @Override // com.fasterxml.jackson.core.TreeCodec
    public JsonNode nullNode() {
        return this._config.getNodeFactory().nullNode();
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public JsonParser treeAsTokens(TreeNode treeNode) {
        _assertNotNull("n", treeNode);
        return new TreeTraversingParser((JsonNode) treeNode, withValueToUpdate(null));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.TreeCodec
    public void writeTree(JsonGenerator jsonGenerator, TreeNode treeNode) {
        throw new UnsupportedOperationException();
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return (T) _detectBindAndClose(dataFormatReaders.findFormat(inputStream), false);
        }
        return (T) _bindAndClose(_considerFilter(createParser(inputStream), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(inputStream);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(reader);
    }

    public <T> T readValue(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return (T) _bindAndClose(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(str);
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, 0, bArr.length);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr);
    }

    public <T> T readValue(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, i, i2);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr, i, i2), false));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr, i, i2);
    }

    public <T> T readValue(File file) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return (T) _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(file)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(file), false));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return (T) _detectBindAndClose(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(url), false));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(url);
    }

    public <T> T readValue(JsonNode jsonNode) throws IOException {
        _assertNotNull("content", jsonNode);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(jsonNode);
        }
        return (T) _bindAndClose(_considerFilter(treeAsTokens(jsonNode), false));
    }

    public <T> T readValue(JsonNode jsonNode, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(jsonNode);
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return (T) _bindAndClose(_considerFilter(createParser(dataInput), false));
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(dataInput);
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(inputStream), false));
    }

    public JsonNode readTree(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(reader), false));
    }

    public JsonNode readTree(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndCloseAsTree(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull("json", bArr);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr), false));
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr, i, i2), false));
    }

    public JsonNode readTree(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(dataInput), false));
    }

    public <T> MappingIterator<T> readValues(JsonParser jsonParser) throws IOException {
        _assertNotNull("p", jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), false);
    }

    public <T> MappingIterator<T> readValues(InputStream inputStream) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(inputStream), true));
    }

    public <T> MappingIterator<T> readValues(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(reader), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.nextToken();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public <T> MappingIterator<T> readValues(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(str), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.nextToken();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public <T> MappingIterator<T> readValues(byte[] bArr, int i, int i2) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(bArr, i, i2), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(bArr, i, i2), true));
    }

    public final <T> MappingIterator<T> readValues(byte[] bArr) throws IOException {
        _assertNotNull("src", bArr);
        return readValues(bArr, 0, bArr.length);
    }

    public <T> MappingIterator<T> readValues(File file) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(file), true));
    }

    public <T> MappingIterator<T> readValues(URL url) throws IOException {
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            return _detectBindAndReadValues(dataFormatReaders.findFormat(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(createParser(url), true));
    }

    public <T> MappingIterator<T> readValues(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(createParser(dataInput), true));
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("n", treeNode);
        try {
            return (T) readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T treeToValue(TreeNode treeNode, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("n", treeNode);
        try {
            return (T) readValue(treeAsTokens(treeNode), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            }
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            obj = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
        }
        return obj;
    }

    public Object _bindAndClose(JsonParser jsonParser) throws IOException {
        Object rootValue;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = this._valueToUpdate;
                if (rootValue == null) {
                    rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                rootValue = this._valueToUpdate;
            } else {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
            }
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final JsonNode _bindAndCloseAsTree(JsonParser jsonParser) throws IOException {
        try {
            JsonNode jsonNode_bindAsTree = _bindAsTree(jsonParser);
            if (jsonParser != null) {
                jsonParser.close();
            }
            return jsonNode_bindAsTree;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final JsonNode _bindAsTree(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (JsonNode) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            return this._config.getNodeFactory().missingNode();
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().nullNode();
        } else {
            jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    public final JsonNode _bindAsTreeOrNull(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (JsonNode) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null && (jsonTokenCurrentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().nullNode();
        } else {
            jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    public <T> MappingIterator<T> _bindAndReadValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        jsonParser.nextToken();
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z);
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        if (jsonTokenNextToken != null) {
            Class<?> clsRawClass = ClassUtil.rawClass(javaType);
            if (clsRawClass == null && (obj = this._valueToUpdate) != null) {
                clsRawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsRawClass, jsonParser, jsonTokenNextToken);
        }
    }

    public Object _detectBindAndClose(byte[] bArr, int i, int i2) throws IOException {
        DataFormatReaders.Match matchFindFormat = this._dataFormatReaders.findFormat(bArr, i, i2);
        if (!matchFindFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, matchFindFormat);
        }
        return matchFindFormat.getReader()._bindAndClose(matchFindFormat.createParserWithMatch());
    }

    public Object _detectBindAndClose(DataFormatReaders.Match match, boolean z) throws IOException {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser jsonParserCreateParserWithMatch = match.createParserWithMatch();
        if (z) {
            jsonParserCreateParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndClose(jsonParserCreateParserWithMatch);
    }

    public <T> MappingIterator<T> _detectBindAndReadValues(DataFormatReaders.Match match, boolean z) throws IOException {
        if (!match.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, match);
        }
        JsonParser jsonParserCreateParserWithMatch = match.createParserWithMatch();
        if (z) {
            jsonParserCreateParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return match.getReader()._bindAndReadValues(jsonParserCreateParserWithMatch);
    }

    public JsonNode _detectBindAndCloseAsTree(InputStream inputStream) throws IOException {
        DataFormatReaders.Match matchFindFormat = this._dataFormatReaders.findFormat(inputStream);
        if (!matchFindFormat.hasMatch()) {
            _reportUnkownFormat(this._dataFormatReaders, matchFindFormat);
        }
        JsonParser jsonParserCreateParserWithMatch = matchFindFormat.createParserWithMatch();
        jsonParserCreateParserWithMatch.enable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return matchFindFormat.getReader()._bindAndCloseAsTree(jsonParserCreateParserWithMatch);
    }

    public void _reportUnkownFormat(DataFormatReaders dataFormatReaders, DataFormatReaders.Match match) throws IOException {
        throw new JsonParseException((JsonParser) null, "Cannot detect format from input, does not look like any of detectable formats " + dataFormatReaders.toString());
    }

    public void _verifySchemaType(FormatSchema formatSchema) {
        if (formatSchema == null || this._parserFactory.canUseSchema(formatSchema)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + formatSchema.getClass().getName() + " for format " + this._parserFactory.getFormatName());
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public DefaultDeserializationContext createDummyDeserializationContext() {
        return this._context.createDummyInstance(this._config);
    }

    public InputStream _inputStream(URL url) throws IOException {
        return FirebasePerfUrlConnection.openStream(url);
    }

    public InputStream _inputStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    public void _reportUndetectableSource(Object obj) throws StreamReadException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
        return jsonDeserializerFindRootValueDeserializer;
    }

    public JsonDeserializer<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JavaType javaType_jsonNodeType = _jsonNodeType();
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType_jsonNodeType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            jsonDeserializerFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType_jsonNodeType);
            if (jsonDeserializerFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaType_jsonNodeType, "Cannot find a deserializer for type " + javaType_jsonNodeType);
            }
            this._rootDeserializers.put(javaType_jsonNodeType, jsonDeserializerFindRootValueDeserializer);
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializerFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializerFindRootValueDeserializer == null) {
            try {
                jsonDeserializerFindRootValueDeserializer = createDummyDeserializationContext().findRootValueDeserializer(javaType);
                if (jsonDeserializerFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, jsonDeserializerFindRootValueDeserializer);
                }
            } catch (JacksonException unused) {
            }
        }
        return jsonDeserializerFindRootValueDeserializer;
    }

    public final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType javaTypeConstructType = getTypeFactory().constructType(JsonNode.class);
        this._jsonNodeType = javaTypeConstructType;
        return javaTypeConstructType;
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
