package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p022io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    public static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_BINARY_WRITE_CAPABILITIES;
    public static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_TEXTUAL_WRITE_CAPABILITIES;
    public static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_WRITE_CAPABILITIES;
    public PrettyPrinter _cfgPrettyPrinter;

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public JsonGenerator overrideFormatFeatures(int i, int i2) {
        return this;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i);

    public JsonGenerator setHighestNonEscapedChar(int i) {
        return this;
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public abstract void writeFieldName(SerializableString serializableString) throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeNull() throws IOException;

    public abstract void writeNumber(double d) throws IOException;

    public abstract void writeNumber(float f) throws IOException;

    public abstract void writeNumber(int i) throws IOException;

    public abstract void writeNumber(long j) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public abstract void writeObject(Object obj) throws IOException;

    public void writeOmittedField(String str) throws IOException {
    }

    public abstract void writeRaw(char c) throws IOException;

    public abstract void writeRaw(String str) throws IOException;

    public abstract void writeRaw(String str, int i, int i2) throws IOException;

    public abstract void writeRaw(char[] cArr, int i, int i2) throws IOException;

    public abstract void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeRawValue(String str) throws IOException;

    public abstract void writeRawValue(String str, int i, int i2) throws IOException;

    public abstract void writeRawValue(char[] cArr, int i, int i2) throws IOException;

    public abstract void writeStartArray() throws IOException;

    public abstract void writeStartObject() throws IOException;

    public abstract void writeString(SerializableString serializableString) throws IOException;

    public abstract void writeString(String str) throws IOException;

    public abstract void writeString(char[] cArr, int i, int i2) throws IOException;

    public abstract void writeTree(TreeNode treeNode) throws IOException;

    public abstract void writeUTF8String(byte[] bArr, int i, int i2) throws IOException;

    static {
        JacksonFeatureSet<StreamWriteCapability> jacksonFeatureSetFromDefaults = JacksonFeatureSet.fromDefaults(StreamWriteCapability.values());
        DEFAULT_WRITE_CAPABILITIES = jacksonFeatureSetFromDefaults;
        DEFAULT_TEXTUAL_WRITE_CAPABILITIES = jacksonFeatureSetFromDefaults.with(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        DEFAULT_BINARY_WRITE_CAPABILITIES = jacksonFeatureSetFromDefaults.with(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    /* loaded from: classes2.dex */
    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);

        public final boolean _defaultState;
        public final int _mask = 1 << ordinal();

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

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public Object currentValue() {
        return getCurrentValue();
    }

    public void assignCurrentValue(Object obj) {
        setCurrentValue(obj);
    }

    public Object getCurrentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    public final JsonGenerator configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public JsonGenerator overrideStdFeatures(int i, int i2) {
        return setFeatureMask((i & i2) | (getFeatureMask() & (~i2)));
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), formatSchema.getSchemaType()));
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public JacksonFeatureSet<StreamWriteCapability> getWriteCapabilities() {
        return DEFAULT_WRITE_CAPABILITIES;
    }

    @Deprecated
    public void writeStartArray(int i) throws IOException {
        writeStartArray();
    }

    public void writeStartArray(Object obj) throws IOException {
        writeStartArray();
        setCurrentValue(obj);
    }

    public void writeStartArray(Object obj, int i) throws IOException {
        writeStartArray(i);
        setCurrentValue(obj);
    }

    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        setCurrentValue(obj);
    }

    public void writeStartObject(Object obj, int i) throws IOException {
        writeStartObject(obj);
    }

    public void writeFieldId(long j) throws IOException {
        writeFieldName(Long.toString(j));
    }

    public void writeArray(int[] iArr, int i, int i2) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(iArr.length, i, i2);
        writeStartArray(iArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            writeNumber(iArr[i]);
            i++;
        }
        writeEndArray();
    }

    public void writeArray(long[] jArr, int i, int i2) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(jArr.length, i, i2);
        writeStartArray(jArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            writeNumber(jArr[i]);
            i++;
        }
        writeEndArray();
    }

    public void writeArray(double[] dArr, int i, int i2) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(dArr.length, i, i2);
        writeStartArray(dArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            writeNumber(dArr[i]);
            i++;
        }
        writeEndArray();
    }

    public void writeArray(String[] strArr, int i, int i2) throws IOException {
        if (strArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(strArr.length, i, i2);
        writeStartArray(strArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            writeString(strArr[i]);
            i++;
        }
        writeEndArray();
    }

    public void writeString(Reader reader, int i) throws IOException {
        _reportUnsupportedOperation();
    }

    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    public void writeRawValue(SerializableString serializableString) throws IOException {
        writeRawValue(serializableString.getValue());
    }

    public void writeBinary(byte[] bArr, int i, int i2) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i, i2);
    }

    public void writeBinary(byte[] bArr) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public int writeBinary(InputStream inputStream, int i) throws IOException {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i);
    }

    public void writeNumber(short s) throws IOException {
        writeNumber((int) s);
    }

    public void writeNumber(char[] cArr, int i, int i2) throws IOException {
        writeNumber(new String(cArr, i, i2));
    }

    public void writeEmbeddedObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else {
            if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public void writeObjectId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeTypeId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.f644id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.include = inclusion;
            }
            int i = C66671.f617xa51b40dc[inclusion.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, strValueOf);
                    return writableTypeId;
                }
                if (i == 4) {
                    writeStartObject();
                    writeFieldName(strValueOf);
                } else {
                    writeStartArray();
                    writeString(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C66671 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion */
        public static final /* synthetic */ int[] f617xa51b40dc;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f617xa51b40dc = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f617xa51b40dc[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f617xa51b40dc[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f617xa51b40dc[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f617xa51b40dc[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int i = C66671.f617xa51b40dc[writableTypeId.include.ordinal()];
            if (i == 1) {
                Object obj = writableTypeId.f644id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i != 2 && i != 3) {
                if (i == 5) {
                    writeEndArray();
                } else {
                    writeEndObject();
                }
            }
        }
        return writableTypeId;
    }

    public void writePOJO(Object obj) throws IOException {
        writeObject(obj);
    }

    public void writeBinaryField(String str, byte[] bArr) throws IOException {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public void writeBooleanField(String str, boolean z) throws IOException {
        writeFieldName(str);
        writeBoolean(z);
    }

    public void writeNullField(String str) throws IOException {
        writeFieldName(str);
        writeNull();
    }

    public void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }

    public void writeNumberField(String str, short s) throws IOException {
        writeFieldName(str);
        writeNumber(s);
    }

    public void writeNumberField(String str, int i) throws IOException {
        writeFieldName(str);
        writeNumber(i);
    }

    public void writeNumberField(String str, long j) throws IOException {
        writeFieldName(str);
        writeNumber(j);
    }

    public void writeNumberField(String str, BigInteger bigInteger) throws IOException {
        writeFieldName(str);
        writeNumber(bigInteger);
    }

    public void writeNumberField(String str, float f) throws IOException {
        writeFieldName(str);
        writeNumber(f);
    }

    public void writeNumberField(String str, double d) throws IOException {
        writeFieldName(str);
        writeNumber(d);
    }

    public void writeNumberField(String str, BigDecimal bigDecimal) throws IOException {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArrayFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartArray();
    }

    public void writeObjectFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartObject();
    }

    public void writePOJOField(String str, Object obj) throws IOException {
        writeObjectField(str, obj);
    }

    public void writeObjectField(String str, Object obj) throws IOException {
        writeFieldName(str);
        writeObject(obj);
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        switch (jsonTokenCurrentToken == null ? -1 : jsonTokenCurrentToken.m1012id()) {
            case -1:
                _reportError("No current event to copy");
                return;
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + jsonTokenCurrentToken);
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                JsonParser.NumberType numberType = jsonParser.getNumberType();
                if (numberType == JsonParser.NumberType.INT) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                } else {
                    writeNumber(jsonParser.getLongValue());
                    return;
                }
            case 8:
                JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                } else {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        int iM1012id = jsonTokenCurrentToken == null ? -1 : jsonTokenCurrentToken.m1012id();
        if (iM1012id == 5) {
            writeFieldName(jsonParser.getCurrentName());
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            iM1012id = jsonTokenNextToken != null ? jsonTokenNextToken.m1012id() : -1;
        }
        if (iM1012id == 1) {
            writeStartObject();
            _copyCurrentContents(jsonParser);
        } else if (iM1012id == 3) {
            writeStartArray();
            _copyCurrentContents(jsonParser);
        } else {
            copyCurrentEvent(jsonParser);
        }
    }

    public void _copyCurrentContents(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                return;
            }
            switch (jsonTokenNextToken.m1012id()) {
                case 1:
                    writeStartObject();
                    break;
                case 2:
                    writeEndObject();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    writeStartArray();
                    break;
                case 4:
                    writeEndArray();
                    i--;
                    if (i == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    writeFieldName(jsonParser.getCurrentName());
                    continue;
                case 6:
                    if (jsonParser.hasTextCharacters()) {
                        writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    } else {
                        writeString(jsonParser.getText());
                        continue;
                    }
                case 7:
                    JsonParser.NumberType numberType = jsonParser.getNumberType();
                    if (numberType == JsonParser.NumberType.INT) {
                        writeNumber(jsonParser.getIntValue());
                    } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                        writeNumber(jsonParser.getBigIntegerValue());
                    } else {
                        writeNumber(jsonParser.getLongValue());
                        continue;
                    }
                case 8:
                    JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                    if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                        writeNumber(jsonParser.getDecimalValue());
                    } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                        writeNumber(jsonParser.getFloatValue());
                    } else {
                        writeNumber(jsonParser.getDoubleValue());
                        continue;
                    }
                case 9:
                    writeBoolean(true);
                    continue;
                case 10:
                    writeBoolean(false);
                    continue;
                case 11:
                    writeNull();
                    continue;
                case 12:
                    writeObject(jsonParser.getEmbeddedObject());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + jsonTokenNextToken);
            }
            i++;
        }
    }

    public void _reportError(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    public final void _verifyOffsets(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public void _writeSimpleObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }
}
