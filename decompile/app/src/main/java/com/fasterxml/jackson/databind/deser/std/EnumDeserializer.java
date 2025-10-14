package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    public static final long serialVersionUID = 1;
    public final Boolean _caseInsensitive;
    public final Enum<?> _enumDefaultValue;
    public Object[] _enumsByIndex;
    public final boolean _isFromIntValue;
    public final CompactStringObjectMap _lookupByName;
    public CompactStringObjectMap _lookupByToString;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = bool;
        this._isFromIntValue = enumResolver.isFromIntValue();
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = bool;
        this._isFromIntValue = enumDeserializer._isFromIntValue;
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver) {
        this(enumResolver, (Boolean) null);
    }

    @Deprecated
    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        return deserializerForCreator(deserializationConfig, cls, annotatedMethod, null, null);
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) throws SecurityException {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public static JsonDeserializer<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) throws SecurityException {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    public EnumDeserializer withResolved(Boolean bool) {
        return Objects.equals(this._caseInsensitive, bool) ? this : new EnumDeserializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (boolFindFormatFeature == null) {
            boolFindFormatFeature = this._caseInsensitive;
        }
        return withResolved(boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._enumDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return _fromString(jsonParser, deserializationContext, jsonParser.getText());
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            if (this._isFromIntValue) {
                return _fromString(jsonParser, deserializationContext, jsonParser.getText());
            }
            return _fromInteger(jsonParser, deserializationContext, jsonParser.getIntValue());
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            return _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass));
        }
        return _deserializeOther(jsonParser, deserializationContext);
    }

    public Object _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Object objFind;
        CompactStringObjectMap compactStringObjectMap_getToStringLookup = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
        Object objFind2 = compactStringObjectMap_getToStringLookup.find(str);
        if (objFind2 != null) {
            return objFind2;
        }
        String strTrim = str.trim();
        return (strTrim == str || (objFind = compactStringObjectMap_getToStringLookup.find(strTrim)) == null) ? _deserializeAltString(jsonParser, deserializationContext, compactStringObjectMap_getToStringLookup, strTrim) : objFind;
    }

    public Object _fromInteger(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, handledType(), Integer.valueOf(i), "Integer value (" + i + ")");
        }
        int i2 = C66801.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionActionFindCoercionAction.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return getEmptyValue(deserializationContext);
        }
        if (i >= 0) {
            Object[] objArr = this._enumsByIndex;
            if (i < objArr.length) {
                return objArr[i];
            }
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i), "index value outside legal index range [0..%s]", Integer.valueOf(this._enumsByIndex.length - 1));
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.EnumDeserializer$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C66801 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final Object _deserializeAltString(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws IOException, NumberFormatException {
        char cCharAt;
        CoercionAction coercionAction_checkCoercionFail;
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this._enumDefaultValue;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            if (str.isEmpty()) {
                coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext, _findCoercionFromEmptyString(deserializationContext), handledType(), str, "empty String (\"\")");
            } else {
                coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext, _findCoercionFromBlankString(deserializationContext), handledType(), str, "blank String (all whitespace)");
            }
            int i = C66801.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[coercionAction_checkCoercionFail.ordinal()];
            if (i == 2 || i == 3) {
                return getEmptyValue(deserializationContext);
            }
            return null;
        }
        if (Boolean.TRUE.equals(this._caseInsensitive)) {
            Object objFindCaseInsensitive = compactStringObjectMap.findCaseInsensitive(strTrim);
            if (objFindCaseInsensitive != null) {
                return objFindCaseInsensitive;
            }
        } else if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !this._isFromIntValue && (cCharAt = strTrim.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i2 = Integer.parseInt(strTrim);
                if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    return deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (i2 >= 0) {
                    Object[] objArr = this._enumsByIndex;
                    if (i2 < objArr.length) {
                        return objArr[i2];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this._enumDefaultValue;
        }
        if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "not one of the values accepted for Enum class: %s", compactStringObjectMap.keys());
    }

    public Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.START_ARRAY)) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    public Class<?> _enumClass() {
        return handledType();
    }

    public CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMapConstructLookup = this._lookupByToString;
        if (compactStringObjectMapConstructLookup == null) {
            synchronized (this) {
                compactStringObjectMapConstructLookup = EnumResolver.constructUsingToString(deserializationContext.getConfig(), _enumClass()).constructLookup();
            }
            this._lookupByToString = compactStringObjectMapConstructLookup;
        }
        return compactStringObjectMapConstructLookup;
    }
}
