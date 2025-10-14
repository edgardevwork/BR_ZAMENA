package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.p022io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class StdDeserializer<T> extends JsonDeserializer<T> implements Serializable, ValueInstantiator.Gettable {
    public static final long serialVersionUID = 1;
    public final Class<?> _valueClass;
    public final JavaType _valueType;
    public static final int F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();

    @Deprecated
    public static final int F_MASK_ACCEPT_ARRAYS = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public final boolean _byteOverflow(int i) {
        return i < -128 || i > 255;
    }

    public final boolean _intOverflow(long j) {
        return j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L;
    }

    public final boolean _shortOverflow(int i) {
        return i < -32768 || i > 32767;
    }

    public ValueInstantiator getValueInstantiator() {
        return null;
    }

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    public StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
        this._valueType = javaType;
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._valueClass;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public JavaType getValueType() {
        return this._valueType;
    }

    public JavaType getValueType(DeserializationContext deserializationContext) {
        JavaType javaType = this._valueType;
        return javaType != null ? javaType : deserializationContext.constructType(this._valueClass);
    }

    public boolean isDefaultDeserializer(JsonDeserializer<?> jsonDeserializer) {
        return ClassUtil.isJacksonStdImpl(jsonDeserializer);
    }

    public boolean isDefaultKeyDeserializer(KeyDeserializer keyDeserializer) {
        return ClassUtil.isJacksonStdImpl(keyDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenNextToken == jsonToken) {
                int i = C66821.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return (T) getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return getNullValue(deserializationContext);
                }
            } else if (zIsEnabled) {
                T t_deserializeWrappedValue = _deserializeWrappedValue(jsonParser, deserializationContext);
                if (jsonParser.nextToken() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return t_deserializeWrappedValue;
            }
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.StdDeserializer$1 */
    public static /* synthetic */ class C66821 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.Fail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Deprecated
    public T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.START_ARRAY) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                return null;
            }
            return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        return (T) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    public T _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        Class<?> clsHandledType = handledType();
        String valueAsString = jsonParser.getValueAsString();
        if (valueInstantiator != null && valueInstantiator.canCreateFromString()) {
            return (T) valueInstantiator.createFromString(deserializationContext, valueAsString);
        }
        if (valueAsString.isEmpty()) {
            return (T) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionAction(logicalType(), clsHandledType, CoercionInputShape.EmptyString), clsHandledType, "empty String (\"\")");
        }
        if (_isBlank(valueAsString)) {
            return (T) _deserializeFromEmptyString(jsonParser, deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType(), clsHandledType, CoercionAction.Fail), clsHandledType, "blank String (all whitespace)");
        }
        if (valueInstantiator != null) {
            valueAsString = valueAsString.trim();
            if (valueInstantiator.canCreateFromInt() && deserializationContext.findCoercionAction(LogicalType.Integer, Integer.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return (T) valueInstantiator.createFromInt(deserializationContext, _parseIntPrimitive(deserializationContext, valueAsString));
            }
            if (valueInstantiator.canCreateFromLong() && deserializationContext.findCoercionAction(LogicalType.Integer, Long.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                return (T) valueInstantiator.createFromLong(deserializationContext, _parseLongPrimitive(deserializationContext, valueAsString));
            }
            if (valueInstantiator.canCreateFromBoolean() && deserializationContext.findCoercionAction(LogicalType.Boolean, Boolean.class, CoercionInputShape.String) == CoercionAction.TryConvert) {
                String strTrim = valueAsString.trim();
                if ("true".equals(strTrim)) {
                    return (T) valueInstantiator.createFromBoolean(deserializationContext, true);
                }
                if ("false".equals(strTrim)) {
                    return (T) valueInstantiator.createFromBoolean(deserializationContext, false);
                }
            }
        }
        return (T) deserializationContext.handleMissingInstantiator(clsHandledType, valueInstantiator, deserializationContext.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", valueAsString);
    }

    public Object _deserializeFromEmptyString(JsonParser jsonParser, DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, String str) throws IOException {
        int i = C66821.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionAction.ordinal()];
        if (i == 1) {
            return getEmptyValue(deserializationContext);
        }
        if (i != 4) {
            return null;
        }
        _checkCoercionFail(deserializationContext, coercionAction, cls, "", "empty String (\"\")");
        return null;
    }

    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.START_ARRAY)) {
            return (T) handleNestedArrayForSingle(jsonParser, deserializationContext);
        }
        return deserialize(jsonParser, deserializationContext);
    }

    @Deprecated
    public final boolean _parseBooleanPrimitive(DeserializationContext deserializationContext, JsonParser jsonParser, Class<?> cls) throws IOException {
        return _parseBooleanPrimitive(jsonParser, deserializationContext);
    }

    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Boolean.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return Boolean.TRUE.equals(_coerceBooleanFromInt(jsonParser, deserializationContext, Boolean.TYPE));
                    }
                    switch (iCurrentTokenId) {
                        case 9:
                            return true;
                        case 11:
                            _verifyNullForPrimitive(deserializationContext);
                        case 10:
                            return false;
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Boolean) handleNestedArrayForSingle(jsonParser, deserializationContext)).booleanValue();
                }
                boolean z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return z_parseBooleanPrimitive;
            }
            return ((Boolean) deserializationContext.handleUnexpectedToken(Boolean.TYPE, jsonParser)).booleanValue();
        }
        LogicalType logicalType = LogicalType.Boolean;
        Class<?> cls = Boolean.TYPE;
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, logicalType, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return false;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return false;
        }
        String strTrim = strExtractScalarFromObject.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (_isTrue(strTrim)) {
                return true;
            }
        } else if (length == 5 && _isFalse(strTrim)) {
            return false;
        }
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return false;
        }
        return Boolean.TRUE.equals((Boolean) deserializationContext.handleWeirdStringValue(cls, strTrim, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized", new Object[0]));
    }

    public boolean _isTrue(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 't') {
            return "true".equals(str);
        }
        if (cCharAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public boolean _isFalse(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'f') {
            return "false".equals(str);
        }
        if (cCharAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                return (Boolean) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    return _coerceBooleanFromInt(jsonParser, deserializationContext, cls);
                }
                switch (iCurrentTokenId) {
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    default:
                        return (Boolean) deserializationContext.handleUnexpectedToken(cls, jsonParser);
                }
            }
            strExtractScalarFromObject = jsonParser.getText();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Boolean, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            return null;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return Boolean.FALSE;
        }
        String strTrim = strExtractScalarFromObject.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (_isTrue(strTrim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && _isFalse(strTrim)) {
            return Boolean.FALSE;
        }
        if (_checkTextualNull(deserializationContext, strTrim)) {
            return null;
        }
        return (Boolean) deserializationContext.handleWeirdStringValue(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
    }

    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Byte.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return (byte) 0;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return jsonParser.getByteValue();
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Byte.TYPE);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (byte) 0;
                        }
                        return jsonParser.getByteValue();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Byte) handleNestedArrayForSingle(jsonParser, deserializationContext)).byteValue();
                }
                byte b_parseBytePrimitive = _parseBytePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return b_parseBytePrimitive;
            }
            return ((Byte) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(Byte.TYPE), jsonParser)).byteValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, Byte.TYPE);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return (byte) 0;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (byte) 0;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return (byte) 0;
        }
        try {
            int i = NumberInput.parseInt(strTrim);
            return _byteOverflow(i) ? ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) i;
        } catch (IllegalArgumentException unused) {
            return ((Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `byte` value", new Object[0])).byteValue();
        }
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Short.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return (short) 0;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return jsonParser.getShortValue();
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Short.TYPE);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (short) 0;
                        }
                        return jsonParser.getShortValue();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Short) handleNestedArrayForSingle(jsonParser, deserializationContext)).shortValue();
                }
                short s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return s_parseShortPrimitive;
            }
            return ((Short) deserializationContext.handleUnexpectedToken(deserializationContext.constructType(Short.TYPE), jsonParser)).shortValue();
        }
        LogicalType logicalType = LogicalType.Integer;
        Class<?> cls = Short.TYPE;
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, logicalType, cls);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return (short) 0;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (short) 0;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return (short) 0;
        }
        try {
            int i = NumberInput.parseInt(strTrim);
            return _shortOverflow(i) ? ((Short) deserializationContext.handleWeirdStringValue(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) i;
        } catch (IllegalArgumentException unused) {
            return ((Short) deserializationContext.handleWeirdStringValue(Short.TYPE, strTrim, "not a valid `short` value", new Object[0])).shortValue();
        }
    }

    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Integer.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return jsonParser.getIntValue();
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Integer.TYPE);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0;
                        }
                        return jsonParser.getValueAsInt();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Integer) handleNestedArrayForSingle(jsonParser, deserializationContext)).intValue();
                }
                int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return i_parseIntPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(Integer.TYPE, jsonParser)).intValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, Integer.TYPE);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return 0;
        }
        return _parseIntPrimitive(deserializationContext, strTrim);
    }

    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            if (str.length() > 9) {
                long j = NumberInput.parseLong(str);
                return _intOverflow(j) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue() : (int) j;
            }
            return NumberInput.parseInt(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Integer.TYPE, str, "not a valid `int` value", new Object[0])).intValue();
        }
    }

    public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                return (Integer) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iCurrentTokenId == 11) {
                return (Integer) getNullValue(deserializationContext);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                if (iCurrentTokenId == 8) {
                    CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                    if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return (Integer) getNullValue(deserializationContext);
                    }
                    if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                        return (Integer) getEmptyValue(deserializationContext);
                    }
                    return Integer.valueOf(jsonParser.getValueAsInt());
                }
                return (Integer) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
            strExtractScalarFromObject = jsonParser.getText();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Integer) getNullValue(deserializationContext);
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Integer) getEmptyValue(deserializationContext);
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_checkTextualNull(deserializationContext, strTrim)) {
            return (Integer) getNullValue(deserializationContext);
        }
        return _parseInteger(deserializationContext, strTrim);
    }

    public final Integer _parseInteger(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            if (str.length() > 9) {
                long j = NumberInput.parseLong(str);
                if (_intOverflow(j)) {
                    return (Integer) deserializationContext.handleWeirdStringValue(Integer.class, str, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
                return Integer.valueOf((int) j);
            }
            return Integer.valueOf(NumberInput.parseInt(str));
        } catch (IllegalArgumentException unused) {
            return (Integer) deserializationContext.handleWeirdStringValue(Integer.class, str, "not a valid `java.lang.Integer` value", new Object[0]);
        }
    }

    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Long.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0L;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return jsonParser.getLongValue();
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, Long.TYPE);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull || coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return 0L;
                        }
                        return jsonParser.getValueAsLong();
                    }
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Long) handleNestedArrayForSingle(jsonParser, deserializationContext)).longValue();
                }
                long j_parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return j_parseLongPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(Long.TYPE, jsonParser)).longValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, Long.TYPE);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0L;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0L;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return 0L;
        }
        return _parseLongPrimitive(deserializationContext, strTrim);
    }

    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return NumberInput.parseLong(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Long.TYPE, str, "not a valid `long` value", new Object[0])).longValue();
        }
    }

    public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                return (Long) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iCurrentTokenId == 11) {
                return (Long) getNullValue(deserializationContext);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    return Long.valueOf(jsonParser.getLongValue());
                }
                if (iCurrentTokenId == 8) {
                    CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, cls);
                    if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                        return (Long) getNullValue(deserializationContext);
                    }
                    if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                        return (Long) getEmptyValue(deserializationContext);
                    }
                    return Long.valueOf(jsonParser.getValueAsLong());
                }
                return (Long) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
            strExtractScalarFromObject = jsonParser.getText();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            return (Long) getNullValue(deserializationContext);
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return (Long) getEmptyValue(deserializationContext);
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_checkTextualNull(deserializationContext, strTrim)) {
            return (Long) getNullValue(deserializationContext);
        }
        return _parseLong(deserializationContext, strTrim);
    }

    public final Long _parseLong(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return Long.valueOf(NumberInput.parseLong(str));
        } catch (IllegalArgumentException unused) {
            return (Long) deserializationContext.handleWeirdStringValue(Long.class, str, "not a valid `java.lang.Long` value", new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0017, code lost:
    
        if (r0 != 8) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Float.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0.0f;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, Float.TYPE);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull || coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return 0.0f;
                        }
                    }
                    return jsonParser.getFloatValue();
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Float) handleNestedArrayForSingle(jsonParser, deserializationContext)).floatValue();
                }
                float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return f_parseFloatPrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(Float.TYPE, jsonParser)).floatValue();
        }
        Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strExtractScalarFromObject);
        if (f_checkFloatSpecialValue != null) {
            return f_checkFloatSpecialValue.floatValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, Float.TYPE);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0.0f;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0.0f;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return 0.0f;
        }
        return _parseFloatPrimitive(jsonParser, deserializationContext, strTrim);
    }

    public final float _parseFloatPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return NumberInput.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Float.TYPE, str, "not a valid `float` value", new Object[0])).floatValue();
        }
    }

    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return NumberInput.parseFloat(str, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Float.TYPE, str, "not a valid `float` value", new Object[0])).floatValue();
        }
    }

    public Float _checkFloatSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (_isNegInf(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (_isPosInf(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && _isNaN(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0018, code lost:
    
        if (r0 != 8) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, Double.TYPE);
        } else {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    _verifyNullForPrimitive(deserializationContext);
                    return 0.0d;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, Double.TYPE);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull || coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return 0.0d;
                        }
                    }
                    return jsonParser.getDoubleValue();
                }
            } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jsonParser.nextToken() == JsonToken.START_ARRAY) {
                    return ((Double) handleNestedArrayForSingle(jsonParser, deserializationContext)).doubleValue();
                }
                double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return d_parseDoublePrimitive;
            }
            return ((Number) deserializationContext.handleUnexpectedToken(Double.TYPE, jsonParser)).doubleValue();
        }
        Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strExtractScalarFromObject);
        if (d_checkDoubleSpecialValue != null) {
            return d_checkDoubleSpecialValue.doubleValue();
        }
        CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject, LogicalType.Integer, Double.TYPE);
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
            _verifyNullForPrimitive(deserializationContext);
            return 0.0d;
        }
        if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
            return 0.0d;
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (_hasTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return 0.0d;
        }
        return _parseDoublePrimitive(jsonParser, deserializationContext, strTrim);
    }

    public final double _parseDoublePrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return _parseDouble(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return _parseDouble(str, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public static final double _parseDouble(String str) throws NumberFormatException {
        return _parseDouble(str, false);
    }

    public static final double _parseDouble(String str, boolean z) throws NumberFormatException {
        return NumberInput.parseDouble(str, z);
    }

    public Double _checkDoubleSpecialValue(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (_isNegInf(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (_isPosInf(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && _isNaN(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strExtractScalarFromObject;
        long jLongValue;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        } else {
            if (iCurrentTokenId == 3) {
                return _parseDateFromArray(jsonParser, deserializationContext);
            }
            if (iCurrentTokenId == 11) {
                return (Date) getNullValue(deserializationContext);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    try {
                        jLongValue = jsonParser.getLongValue();
                    } catch (StreamReadException unused) {
                        jLongValue = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.getNumberValue(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0])).longValue();
                    }
                    return new Date(jLongValue);
                }
                return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            strExtractScalarFromObject = jsonParser.getText();
        }
        return _parseDate(strExtractScalarFromObject.trim(), deserializationContext);
    }

    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                int i = C66821.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return (Date) getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return (Date) getNullValue(deserializationContext);
                }
            } else if (zIsEnabled) {
                if (jsonTokenNextToken == JsonToken.START_ARRAY) {
                    return (Date) handleNestedArrayForSingle(jsonParser, deserializationContext);
                }
                Date date_parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return date_parseDate;
            }
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
    }

    public Date _parseDate(String str, DeserializationContext deserializationContext) throws IOException {
        try {
            if (str.isEmpty()) {
                if (C66821.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[_checkFromStringCoercion(deserializationContext, str).ordinal()] != 1) {
                    return null;
                }
                return new Date(0L);
            }
            if (_hasTextualNull(str)) {
                return null;
            }
            return deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", ClassUtil.exceptionMessage(e));
        }
    }

    @Deprecated
    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _parseString(jsonParser, deserializationContext, NullsConstantProvider.nuller());
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext, NullValueProvider nullValueProvider) throws IOException {
        String valueAsString;
        CoercionAction coercionAction_checkIntToStringCoercion = CoercionAction.TryConvert;
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        if (iCurrentTokenId != 12) {
            switch (iCurrentTokenId) {
                case 6:
                    return jsonParser.getText();
                case 7:
                    coercionAction_checkIntToStringCoercion = _checkIntToStringCoercion(jsonParser, deserializationContext, this._valueClass);
                    break;
                case 8:
                    coercionAction_checkIntToStringCoercion = _checkFloatToStringCoercion(jsonParser, deserializationContext, this._valueClass);
                    break;
                case 9:
                case 10:
                    coercionAction_checkIntToStringCoercion = _checkBooleanToStringCoercion(jsonParser, deserializationContext, this._valueClass);
                    break;
            }
            if (coercionAction_checkIntToStringCoercion == CoercionAction.AsNull) {
                return (String) nullValueProvider.getNullValue(deserializationContext);
            }
            if (coercionAction_checkIntToStringCoercion == CoercionAction.AsEmpty) {
                return "";
            }
            return (!jsonParser.currentToken().isScalarValue() || (valueAsString = jsonParser.getValueAsString()) == null) ? (String) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser) : valueAsString;
        }
        Object embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject instanceof byte[]) {
            return deserializationContext.getBase64Variant().encode((byte[]) embeddedObject, false);
        }
        if (embeddedObject == null) {
            return null;
        }
        return embeddedObject.toString();
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public static final boolean _isBlank(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str) throws IOException {
        return _checkFromStringCoercion(deserializationContext, str, logicalType(), handledType());
    }

    public CoercionAction _checkFromStringCoercion(DeserializationContext deserializationContext, String str, LogicalType logicalType, Class<?> cls) throws IOException {
        if (str.isEmpty()) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.EmptyString), cls, str, "empty String (\"\")");
        }
        if (_isBlank(str)) {
            return _checkCoercionFail(deserializationContext, deserializationContext.findCoercionFromBlankString(logicalType, cls, CoercionAction.Fail), cls, str, "blank String (all whitespace)");
        }
        if (deserializationContext.isEnabled(StreamReadCapability.UNTYPED_SCALARS)) {
            return CoercionAction.TryConvert;
        }
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType, cls, CoercionInputShape.String);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, _coercedTypeDesc());
        }
        return coercionActionFindCoercionAction;
    }

    public CoercionAction _checkFloatToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(LogicalType.Integer, cls, CoercionInputShape.Float);
        if (coercionActionFindCoercionAction != CoercionAction.Fail) {
            return coercionActionFindCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, cls, jsonParser.getNumberValue(), "Floating-point value (" + jsonParser.getText() + ")");
    }

    public CoercionAction _checkIntToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        return _checkToStringCoercion(jsonParser, deserializationContext, cls, jsonParser.getNumberValue(), CoercionInputShape.Integer);
    }

    public CoercionAction _checkFloatToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        return _checkToStringCoercion(jsonParser, deserializationContext, cls, jsonParser.getNumberValue(), CoercionInputShape.Float);
    }

    public CoercionAction _checkBooleanToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        return _checkToStringCoercion(jsonParser, deserializationContext, cls, Boolean.valueOf(jsonParser.getBooleanValue()), CoercionInputShape.Boolean);
    }

    public CoercionAction _checkToStringCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls, Object obj, CoercionInputShape coercionInputShape) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(LogicalType.Textual, cls, coercionInputShape);
        if (coercionActionFindCoercionAction != CoercionAction.Fail) {
            return coercionActionFindCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, cls, obj, coercionInputShape.name() + " value (" + jsonParser.getText() + ")");
    }

    public CoercionAction _checkIntToFloatCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(LogicalType.Float, cls, CoercionInputShape.Integer);
        if (coercionActionFindCoercionAction != CoercionAction.Fail) {
            return coercionActionFindCoercionAction;
        }
        return _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, cls, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + ")");
    }

    public Boolean _coerceBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(LogicalType.Boolean, cls, CoercionInputShape.Integer);
        int i = C66821.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionActionFindCoercionAction.ordinal()];
        if (i == 1) {
            return Boolean.FALSE;
        }
        if (i == 2) {
            return null;
        }
        if (i == 4) {
            _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, cls, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + ")");
            return Boolean.FALSE;
        }
        if (jsonParser.getNumberType() == JsonParser.NumberType.INT) {
            return Boolean.valueOf(jsonParser.getIntValue() != 0);
        }
        return Boolean.valueOf(!"0".equals(jsonParser.getText()));
    }

    public CoercionAction _checkCoercionFail(DeserializationContext deserializationContext, CoercionAction coercionAction, Class<?> cls, Object obj, String str) throws IOException {
        if (coercionAction == CoercionAction.Fail) {
            deserializationContext.reportBadCoercion(this, cls, obj, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, _coercedTypeDesc());
        }
        return coercionAction;
    }

    public boolean _checkTextualNull(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        if (!_hasTextualNull(str)) {
            return false;
        }
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
        }
        return true;
    }

    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
            return jsonParser.getBigIntegerValue();
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS)) {
            return Long.valueOf(jsonParser.getLongValue());
        }
        return jsonParser.getNumberValue();
    }

    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    public final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        boolean z;
        MapperFeature mapperFeature;
        MapperFeature mapperFeature2 = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature2)) {
            DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.isEnabled(deserializationFeature)) {
                return;
            }
            z = false;
            mapperFeature = deserializationFeature;
        } else {
            z = true;
            mapperFeature = mapperFeature2;
        }
        _reportFailedNullCoerce(deserializationContext, z, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z, Enum<?> r5, String str) throws JsonMappingException {
        deserializationContext.reportInputMismatch(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z ? "enable" : "disable", r5.getDeclaringClass().getSimpleName(), r5.name());
    }

    public String _coercedTypeDesc() {
        String classDescription;
        JavaType valueType = getValueType();
        boolean z = true;
        if (valueType != null && !valueType.isPrimitive()) {
            if (!valueType.isContainerType() && !valueType.isReferenceType()) {
                z = false;
            }
            classDescription = ClassUtil.getTypeDescription(valueType);
        } else {
            Class<?> clsHandledType = handledType();
            if (!clsHandledType.isArray() && !Collection.class.isAssignableFrom(clsHandledType) && !Map.class.isAssignableFrom(clsHandledType)) {
                z = false;
            }
            classDescription = ClassUtil.getClassDescription(clsHandledType);
        }
        if (z) {
            return "element of " + classDescription;
        }
        return classDescription + " value";
    }

    @Deprecated
    public boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
        return !"0".equals(jsonParser.getText());
    }

    @Deprecated
    public void _verifyStringForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce String \"%s\" to %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), mapperFeature.getDeclaringClass().getSimpleName(), mapperFeature.name());
    }

    @Deprecated
    public Object _coerceEmptyString(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        boolean z2;
        MapperFeature mapperFeature;
        MapperFeature mapperFeature2 = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature2)) {
            if (z) {
                DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.isEnabled(deserializationFeature)) {
                    z2 = false;
                    mapperFeature = deserializationFeature;
                }
            }
            return getNullValue(deserializationContext);
        }
        z2 = true;
        mapperFeature = mapperFeature2;
        _reportFailedNullCoerce(deserializationContext, z2, mapperFeature, "empty String (\"\")");
        return null;
    }

    @Deprecated
    public void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        deserializationContext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.getValueAsString(), str);
    }

    @Deprecated
    public final void _verifyNullForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        _reportFailedNullCoerce(deserializationContext, true, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    @Deprecated
    public void _verifyNumberForScalarCoercion(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce Number (%s) to %s (enable `%s.%s` to allow)", jsonParser.getText(), _coercedTypeDesc(), mapperFeature.getDeclaringClass().getSimpleName(), mapperFeature.name());
    }

    @Deprecated
    public Object _coerceNullToken(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        if (z) {
            _verifyNullForPrimitive(deserializationContext);
        }
        return getNullValue(deserializationContext);
    }

    @Deprecated
    public Object _coerceTextualNull(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (!deserializationContext.isEnabled(mapperFeature)) {
            _reportFailedNullCoerce(deserializationContext, true, mapperFeature, "String \"null\"");
        }
        return getNullValue(deserializationContext);
    }

    @Deprecated
    public boolean _isEmptyOrTextualNull(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    public JsonDeserializer<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public final boolean _isIntNumber(String str) {
        int i;
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '-' && cCharAt != '+') {
            i = 0;
        } else {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
            i++;
        }
        return true;
    }

    public JsonDeserializer<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return jsonDeserializer;
        }
        Converter<Object, Object> converterConverterInstance = deserializationContext.converterInstance(beanProperty.getMember(), objFindDeserializationContentConverter);
        JavaType inputType = converterConverterInstance.getInputType(deserializationContext.getTypeFactory());
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(inputType, beanProperty);
        }
        return new StdDelegatingDeserializer(converterConverterInstance, inputType, jsonDeserializer);
    }

    public JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls);
        }
        return deserializationContext.getDefaultPropertyFormat(cls);
    }

    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public final NullValueProvider findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    public NullValueProvider findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        if (nullsFindContentNullStyle != Nulls.FAIL) {
            NullValueProvider nullValueProvider_findNullProvider = _findNullProvider(deserializationContext, beanProperty, nullsFindContentNullStyle, jsonDeserializer);
            return nullValueProvider_findNullProvider != null ? nullValueProvider_findNullProvider : jsonDeserializer;
        }
        if (beanProperty == null) {
            JavaType javaTypeConstructType = deserializationContext.constructType(jsonDeserializer.handledType());
            if (javaTypeConstructType.isContainerType()) {
                javaTypeConstructType = javaTypeConstructType.getContentType();
            }
            return NullsFailProvider.constructForRootValue(javaTypeConstructType);
        }
        return NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
    }

    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        if (beanProperty != null) {
            return beanProperty.getMetadata().getContentNulls();
        }
        return deserializationContext.getConfig().getDefaultSetterInfo().getContentNulls();
    }

    public final NullValueProvider _findNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        if (nulls == Nulls.FAIL) {
            if (beanProperty == null) {
                return NullsFailProvider.constructForRootValue(deserializationContext.constructType(jsonDeserializer == null ? Object.class : jsonDeserializer.handledType()));
            }
            return NullsFailProvider.constructForProperty(beanProperty);
        }
        if (nulls != Nulls.AS_EMPTY) {
            if (nulls == Nulls.SKIP) {
                return NullsConstantProvider.skipper();
            }
            return null;
        }
        if (jsonDeserializer == null) {
            return null;
        }
        if (jsonDeserializer instanceof BeanDeserializerBase) {
            BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
            if (!beanDeserializerBase.getValueInstantiator().canCreateUsingDefault()) {
                JavaType valueType = beanProperty == null ? beanDeserializerBase.getValueType() : beanProperty.getType();
                return (NullValueProvider) deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
            }
        }
        AccessPattern emptyAccessPattern = jsonDeserializer.getEmptyAccessPattern();
        if (emptyAccessPattern == AccessPattern.ALWAYS_NULL) {
            return NullsConstantProvider.nuller();
        }
        if (emptyAccessPattern == AccessPattern.CONSTANT) {
            return NullsConstantProvider.forValue(jsonDeserializer.getEmptyValue(deserializationContext));
        }
        return new NullsAsEmptyProvider(jsonDeserializer);
    }

    public CoercionAction _findCoercionFromEmptyString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
    }

    public CoercionAction _findCoercionFromEmptyArray(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyArray);
    }

    public CoercionAction _findCoercionFromBlankString(DeserializationContext deserializationContext) {
        return deserializationContext.findCoercionFromBlankString(logicalType(), handledType(), CoercionAction.Fail);
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = handledType();
        }
        if (deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.skipChildren();
    }

    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public Object handleNestedArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.currentToken(), jsonParser, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", ClassUtil.nameOf(this._valueClass), JsonToken.START_ARRAY, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"), new Object[0]);
    }

    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }
}
