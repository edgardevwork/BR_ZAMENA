package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/* loaded from: classes7.dex */
public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    public static final long serialVersionUID = 1;
    public final String _message;
    public final JavaType _type;

    public UnsupportedTypeDeserializer(JavaType javaType, String str) {
        super(javaType);
        this._type = javaType;
        this._message = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object embeddedObject;
        if (jsonParser.currentToken() == JsonToken.VALUE_EMBEDDED_OBJECT && ((embeddedObject = jsonParser.getEmbeddedObject()) == null || this._type.getRawClass().isAssignableFrom(embeddedObject.getClass()))) {
            return embeddedObject;
        }
        deserializationContext.reportBadDefinition(this._type, this._message);
        return null;
    }
}
