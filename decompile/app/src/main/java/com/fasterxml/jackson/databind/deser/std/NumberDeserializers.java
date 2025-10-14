package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p022io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class NumberDeserializers {
    public static final HashSet<String> _classNames = new HashSet<>();

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            _classNames.add(clsArr[i].getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
            if (cls == Void.TYPE) {
                return NullifyingDeserializer.instance;
            }
        } else {
            if (!_classNames.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }

    /* loaded from: classes6.dex */
    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        public static final long serialVersionUID = 1;
        public final T _emptyValue;
        public final LogicalType _logicalType;
        public final T _nullValue;
        public final boolean _primitive;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        @Deprecated
        public PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            this(cls, LogicalType.OtherScalar, t, t2);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            if (this._nullValue == null) {
                return AccessPattern.ALWAYS_NULL;
            }
            return AccessPattern.CONSTANT;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", ClassUtil.classNameOf(handledType()));
            }
            return this._nullValue;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return this._logicalType;
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        public static final long serialVersionUID = 1;
        public static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        public static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        public static final long serialVersionUID = 1;
        public static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        public static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public ByteDeserializer(Class<Byte> cls, Byte b) {
            super(cls, LogicalType.Integer, b, (byte) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Byte.valueOf(jsonParser.getByteValue());
            }
            if (this._primitive) {
                return Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext));
            }
            return _parseByte(jsonParser, deserializationContext);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        return Byte.valueOf(jsonParser.getByteValue());
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (Byte) getEmptyValue(deserializationContext);
                        }
                        return Byte.valueOf(jsonParser.getByteValue());
                    }
                    return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int i = NumberInput.parseInt(strTrim);
                if (_byteOverflow(i)) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) i);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        public static final long serialVersionUID = 1;
        public static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        public static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Short.valueOf(jsonParser.getShortValue());
            }
            if (this._primitive) {
                return Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext));
            }
            return _parseShort(jsonParser, deserializationContext);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        return Short.valueOf(jsonParser.getShortValue());
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (Short) getEmptyValue(deserializationContext);
                        }
                        return Short.valueOf(jsonParser.getShortValue());
                    }
                    return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int i = NumberInput.parseInt(strTrim);
                if (_shortOverflow(i)) {
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) i);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        public static final long serialVersionUID = 1;
        public static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        public static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                        int i = C66811.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionActionFindCoercionAction.ordinal()];
                        if (i == 1) {
                            _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, this._valueClass, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + ")");
                        } else if (i != 2) {
                            if (i == 3) {
                                return (Character) getEmptyValue(deserializationContext);
                            }
                            int intValue = jsonParser.getIntValue();
                            if (intValue >= 0 && intValue <= 65535) {
                                return Character.valueOf((char) intValue);
                            }
                            return (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                        }
                        return getNullValue(deserializationContext);
                    }
                    return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            if (strExtractScalarFromObject.length() == 1) {
                return Character.valueOf(strExtractScalarFromObject.charAt(0));
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            return (Character) deserializationContext.handleWeirdStringValue(handledType(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1 */
    public static /* synthetic */ class C66811 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.Fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        public static final long serialVersionUID = 1;
        public static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        public static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Integer.valueOf(jsonParser.getIntValue());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Integer.valueOf(jsonParser.getIntValue());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        public static final long serialVersionUID = 1;
        public static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        public static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, LogicalType.Integer, l, 0L);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Long.valueOf(jsonParser.getLongValue());
            }
            if (this._primitive) {
                return Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext));
            }
            return _parseLong(jsonParser, deserializationContext, Long.class);
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        public static final long serialVersionUID = 1;
        public static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        public static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, LogicalType.Float, f, Float.valueOf(0.0f));
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.getFloatValue());
            }
            if (this._primitive) {
                return Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext));
            }
            return _parseFloat(jsonParser, deserializationContext);
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (Float) getEmptyValue(deserializationContext);
                        }
                    } else if (iCurrentTokenId != 8) {
                        return (Float) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return Float.valueOf(jsonParser.getFloatValue());
                }
            }
            Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strExtractScalarFromObject);
            if (f_checkFloatSpecialValue != null) {
                return f_checkFloatSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Float) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Float.valueOf(NumberInput.parseFloat(strTrim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Float` value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        public static final long serialVersionUID = 1;
        public static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        public static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, LogicalType.Float, d, Double.valueOf(0.0d));
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.getDoubleValue());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return _parseDouble(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.getDoubleValue());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return _parseDouble(jsonParser, deserializationContext);
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = jsonParser.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (Double) getEmptyValue(deserializationContext);
                        }
                    } else if (iCurrentTokenId != 8) {
                        return (Double) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
            }
            Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strExtractScalarFromObject);
            if (d_checkDoubleSpecialValue != null) {
                return d_checkDoubleSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Double) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Double.valueOf(StdDeserializer._parseDouble(strTrim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Double` value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                            return _coerceIntegral(jsonParser, deserializationContext);
                        }
                        return jsonParser.getNumberValue();
                    }
                    if (iCurrentTokenId == 8) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonParser.isNaN()) {
                            return jsonParser.getDecimalValue();
                        }
                        return jsonParser.getNumberValue();
                    }
                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!_isIntNumber(strTrim)) {
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return NumberInput.parseBigDecimal(strTrim);
                    }
                    return Double.valueOf(NumberInput.parseDouble(strTrim, jsonParser.isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return NumberInput.parseBigInteger(strTrim);
                }
                long j = NumberInput.parseLong(strTrim);
                if (!deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && j <= ParserMinimalBase.MAX_INT_L && j >= ParserMinimalBase.MIN_INT_L) {
                    return Integer.valueOf((int) j);
                }
                return Long.valueOf(j);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid number", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 6 || iCurrentTokenId == 7 || iCurrentTokenId == 8) {
                return deserialize(jsonParser, deserializationContext);
            }
            return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            if (jsonParser.isExpectedNumberIntToken()) {
                return jsonParser.getBigIntegerValue();
            }
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (BigInteger) getEmptyValue(deserializationContext);
                        }
                        return jsonParser.getDecimalValue().toBigInteger();
                    }
                    return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return NumberInput.parseBigInteger(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes6.dex */
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Float;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (BigDecimal) getEmptyValue(deserializationContext);
                        }
                    } else if (iCurrentTokenId != 8) {
                        return (BigDecimal) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return jsonParser.getDecimalValue();
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigDecimal) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return NumberInput.parseBigDecimal(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }
}
