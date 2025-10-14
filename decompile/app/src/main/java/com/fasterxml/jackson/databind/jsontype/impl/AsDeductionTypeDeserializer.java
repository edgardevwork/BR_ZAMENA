package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {
    public static final BitSet EMPTY_CLASS_FINGERPRINT = new BitSet(0);
    public static final long serialVersionUID = 1;
    public final Map<String, Integer> fieldBitIndex;
    public final Map<BitSet, String> subtypeFingerprints;

    public AsDeductionTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, JavaType javaType2, DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        super(javaType, typeIdResolver, null, false, javaType2, null);
        this.fieldBitIndex = new HashMap();
        this.subtypeFingerprints = buildFingerprints(deserializationConfig, collection);
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.fieldBitIndex = asDeductionTypeDeserializer.fieldBitIndex;
        this.subtypeFingerprints = asDeductionTypeDeserializer.subtypeFingerprints;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsDeductionTypeDeserializer(this, beanProperty);
    }

    public Map<BitSet, String> buildFingerprints(DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        int i = 0;
        for (NamedType namedType : collection) {
            List<BeanPropertyDefinition> listFindProperties = deserializationConfig.introspect(deserializationConfig.getTypeFactory().constructType(namedType.getType())).findProperties();
            BitSet bitSet = new BitSet(listFindProperties.size() + i);
            Iterator<BeanPropertyDefinition> it = listFindProperties.iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (zIsEnabled) {
                    name = name.toLowerCase();
                }
                Integer numValueOf = this.fieldBitIndex.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i);
                    this.fieldBitIndex.put(name, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(numValueOf.intValue());
            }
            String str = (String) map.put(bitSet, namedType.getType().getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", str, namedType.getType().getName()));
            }
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, "Unexpected input");
        }
        if (jsonTokenCurrentToken == JsonToken.END_OBJECT && (str = this.subtypeFingerprints.get(EMPTY_CLASS_FINGERPRINT)) != null) {
            return _deserializeTypedForId(jsonParser, deserializationContext, null, str);
        }
        LinkedList linkedList = new LinkedList(this.subtypeFingerprints.keySet());
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            if (zIsEnabled) {
                strCurrentName = strCurrentName.toLowerCase();
            }
            tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParser);
            Integer num = this.fieldBitIndex.get(strCurrentName);
            if (num != null) {
                prune(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return _deserializeTypedForId(jsonParser, deserializationContext, tokenBufferBufferForInputBuffering, this.subtypeFingerprints.get(linkedList.get(0)));
                }
            }
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, tokenBufferBufferForInputBuffering, String.format("Cannot deduce unique subtype of %s (%d candidates match)", ClassUtil.getTypeDescription(this._baseType), Integer.valueOf(linkedList.size())));
    }

    public static void prune(List<BitSet> list, int i) {
        Iterator<BitSet> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().get(i)) {
                it.remove();
            }
        }
    }
}
