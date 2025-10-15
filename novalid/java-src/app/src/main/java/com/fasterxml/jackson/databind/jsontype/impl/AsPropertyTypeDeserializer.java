package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

/* loaded from: classes6.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    public static final long serialVersionUID = 1;
    public final JsonTypeInfo.EnumC6665As _inclusion;
    public final String _msgForMissingId;

    public AsPropertyTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        this(javaType, typeIdResolver, str, z, javaType2, JsonTypeInfo.EnumC6665As.PROPERTY);
    }

    public AsPropertyTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2, JsonTypeInfo.EnumC6665As enumC6665As) {
        String str2;
        super(javaType, typeIdResolver, str, z, javaType2);
        BeanProperty beanProperty = this._property;
        if (beanProperty == null) {
            str2 = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str2 = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, beanProperty.getName());
        }
        this._msgForMissingId = str2;
        this._inclusion = enumC6665As;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        String str;
        super(asPropertyTypeDeserializer, beanProperty);
        BeanProperty beanProperty2 = this._property;
        if (beanProperty2 == null) {
            str = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, beanProperty2.getName());
        }
        this._msgForMissingId = str;
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.EnumC6665As getTypeInclusion() {
        return this._inclusion;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String valueAsString;
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        TokenBuffer tokenBufferBufferForInputBuffering = null;
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, this._msgForMissingId);
        }
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            if ((strCurrentName.equals(this._typePropertyName) || (zIsEnabled && strCurrentName.equalsIgnoreCase(this._typePropertyName))) && (valueAsString = jsonParser.getValueAsString()) != null) {
                return _deserializeTypedForId(jsonParser, deserializationContext, tokenBufferBufferForInputBuffering, valueAsString);
            }
            if (tokenBufferBufferForInputBuffering == null) {
                tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            tokenBufferBufferForInputBuffering.writeFieldName(strCurrentName);
            tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParser);
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, tokenBufferBufferForInputBuffering, this._msgForMissingId);
    }

    public Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer, String str) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, str);
        if (this._typeIdVisible) {
            if (tokenBuffer == null) {
                tokenBuffer = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            tokenBuffer.writeFieldName(jsonParser.currentName());
            tokenBuffer.writeString(str);
        }
        if (tokenBuffer != null) {
            jsonParser.clearCurrentToken();
            jsonParser = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
        }
        if (jsonParser.currentToken() != JsonToken.END_OBJECT) {
            jsonParser.nextToken();
        }
        return jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Deprecated
    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer) throws IOException {
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, tokenBuffer, null);
    }

    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer, String str) throws IOException {
        if (!hasDefaultImpl()) {
            Object objDeserializeIfNatural = TypeDeserializer.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (objDeserializeIfNatural != null) {
                return objDeserializeIfNatural;
            }
            if (jsonParser.isExpectedStartArrayToken()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().trim().isEmpty()) {
                return null;
            }
        }
        JsonDeserializer<Object> jsonDeserializer_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (jsonDeserializer_findDefaultImplDeserializer == null) {
            JavaType javaType_handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (javaType_handleMissingTypeId == null) {
                return null;
            }
            jsonDeserializer_findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleMissingTypeId, this._property);
        }
        if (tokenBuffer != null) {
            tokenBuffer.writeEndObject();
            jsonParser = tokenBuffer.asParser(jsonParser);
            jsonParser.nextToken();
        }
        return jsonDeserializer_findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.START_ARRAY)) {
            return super.deserializeTypedFromArray(jsonParser, deserializationContext);
        }
        return deserializeTypedFromObject(jsonParser, deserializationContext);
    }
}
