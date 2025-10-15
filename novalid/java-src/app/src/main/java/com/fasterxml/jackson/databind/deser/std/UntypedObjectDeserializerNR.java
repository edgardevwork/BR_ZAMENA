package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    public static final long serialVersionUID = 1;
    public final boolean _nonMerging;
    public static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializerNR std = new UntypedObjectDeserializerNR();

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    public UntypedObjectDeserializerNR(boolean z) {
        super((Class<?>) Object.class);
        this._nonMerging = z;
    }

    public static UntypedObjectDeserializerNR instance(boolean z) {
        if (z) {
            return new UntypedObjectDeserializerNR(true);
        }
        return std;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        if (this._nonMerging) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return Scope.emptyMap();
            case 3:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootArrayScope());
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext);
            case 6:
                return jsonParser.getText();
            case 7:
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.getNumberValue();
            case 8:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1 || iCurrentTokenId == 3 || iCurrentTokenId == 5) {
            return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return _deserializeAnyScalar(jsonParser, deserializationContext, jsonParser.currentTokenId());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserialize;
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId != 1) {
            if (iCurrentTokenId != 2) {
                if (iCurrentTokenId == 3) {
                    if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                        return obj;
                    }
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        do {
                            collection.add(deserialize(jsonParser, deserializationContext));
                        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                    }
                    return deserialize(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 4) {
                    if (iCurrentTokenId == 5) {
                    }
                    return deserialize(jsonParser, deserializationContext);
                }
            }
            return obj;
        }
        if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
            return obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            String strCurrentName = jsonParser.currentName();
            do {
                jsonParser.nextToken();
                Object obj2 = map.get(strCurrentName);
                if (obj2 != null) {
                    objDeserialize = deserialize(jsonParser, deserializationContext, obj2);
                } else {
                    objDeserialize = deserialize(jsonParser, deserializationContext);
                }
                if (objDeserialize != obj2) {
                    map.put(strCurrentName, objDeserialize);
                }
                strCurrentName = jsonParser.nextFieldName();
            } while (strCurrentName != null);
            return obj;
        }
        return deserialize(jsonParser, deserializationContext);
    }

    public final Object _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj_deserializeNR;
        Scope scopeRootObjectScope = Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES));
        String strCurrentName = jsonParser.currentName();
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iM1012id = jsonTokenNextToken.m1012id();
            if (iM1012id == 1) {
                obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, scopeRootObjectScope.childObject());
            } else {
                if (iM1012id == 2) {
                    return scopeRootObjectScope.finishRootObject();
                }
                if (iM1012id == 3) {
                    obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, scopeRootObjectScope.childArray());
                } else {
                    obj_deserializeNR = _deserializeAnyScalar(jsonParser, deserializationContext, jsonTokenNextToken.m1012id());
                }
            }
            scopeRootObjectScope.putValue(strCurrentName, obj_deserializeNR);
            strCurrentName = jsonParser.nextFieldName();
        }
        return scopeRootObjectScope.finishRootObject();
    }

    public final Object _deserializeNR(JsonParser jsonParser, DeserializationContext deserializationContext, Scope scope) throws IOException {
        Object text;
        Object text2;
        boolean zHasSomeOfFeatures = deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Scope scopeFinishBranchObject = scope;
        while (true) {
            if (scopeFinishBranchObject.isObject()) {
                String strNextFieldName = jsonParser.nextFieldName();
                while (true) {
                    if (strNextFieldName != null) {
                        JsonToken jsonTokenNextToken = jsonParser.nextToken();
                        if (jsonTokenNextToken == null) {
                            jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
                        }
                        int iM1012id = jsonTokenNextToken.m1012id();
                        if (iM1012id == 1) {
                            scopeFinishBranchObject = scopeFinishBranchObject.childObject(strNextFieldName);
                        } else if (iM1012id == 3) {
                            scopeFinishBranchObject = scopeFinishBranchObject.childArray(strNextFieldName);
                        } else {
                            switch (iM1012id) {
                                case 6:
                                    text = jsonParser.getText();
                                    break;
                                case 7:
                                    if (!zHasSomeOfFeatures) {
                                        text = jsonParser.getNumberValue();
                                        break;
                                    } else {
                                        text = _coerceIntegral(jsonParser, deserializationContext);
                                        break;
                                    }
                                case 8:
                                    if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                                        text = jsonParser.getNumberValue();
                                        break;
                                    } else {
                                        text = jsonParser.getDecimalValue();
                                        break;
                                    }
                                case 9:
                                    text = Boolean.TRUE;
                                    break;
                                case 10:
                                    text = Boolean.FALSE;
                                    break;
                                case 11:
                                    text = null;
                                    break;
                                case 12:
                                    text = jsonParser.getEmbeddedObject();
                                    break;
                                default:
                                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            scopeFinishBranchObject.putValue(strNextFieldName, text);
                        }
                        strNextFieldName = jsonParser.nextFieldName();
                    } else {
                        if (scopeFinishBranchObject == scope) {
                            return scopeFinishBranchObject.finishRootObject();
                        }
                        scopeFinishBranchObject = scopeFinishBranchObject.finishBranchObject();
                    }
                }
            } else {
                while (true) {
                    JsonToken jsonTokenNextToken2 = jsonParser.nextToken();
                    if (jsonTokenNextToken2 == null) {
                        jsonTokenNextToken2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenNextToken2.m1012id()) {
                        case 1:
                            scopeFinishBranchObject = scopeFinishBranchObject.childObject();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                        case 3:
                            scopeFinishBranchObject = scopeFinishBranchObject.childArray();
                            continue;
                        case 4:
                            if (scopeFinishBranchObject == scope) {
                                return scopeFinishBranchObject.finishRootArray(zIsEnabled);
                            }
                            scopeFinishBranchObject = scopeFinishBranchObject.finishBranchArray(zIsEnabled);
                            continue;
                        case 6:
                            text2 = jsonParser.getText();
                            break;
                        case 7:
                            if (!zHasSomeOfFeatures) {
                                text2 = jsonParser.getNumberValue();
                                break;
                            } else {
                                text2 = _coerceIntegral(jsonParser, deserializationContext);
                                break;
                            }
                        case 8:
                            if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                                text2 = jsonParser.getNumberValue();
                                break;
                            } else {
                                text2 = jsonParser.getDecimalValue();
                                break;
                            }
                        case 9:
                            text2 = Boolean.TRUE;
                            break;
                        case 10:
                            text2 = Boolean.FALSE;
                            break;
                        case 11:
                            text2 = null;
                            break;
                        case 12:
                            text2 = jsonParser.getEmbeddedObject();
                            break;
                    }
                    scopeFinishBranchObject.addValue(text2);
                }
            }
        }
    }

    public final Object _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        switch (i) {
            case 6:
                return jsonParser.getText();
            case 7:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return jsonParser.getBigIntegerValue();
                }
                return jsonParser.getNumberValue();
            case 8:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
    }

    public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zIsEnabled) {
            _squashDups(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.nextToken();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            Object objPut = map.put(str2, objDeserialize);
            if (objPut != null && zIsEnabled) {
                _squashDups(map, str2, objPut, objDeserialize);
            }
            str2 = jsonParser.nextFieldName();
        }
        return map;
    }

    private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Scope {
        public Scope _child;
        public String _deferredKey;
        public boolean _isObject;
        public List<Object> _list;
        public Map<String, Object> _map;
        public final Scope _parent;
        public boolean _squashDups;

        public Scope(Scope scope) {
            this._parent = scope;
            this._isObject = false;
            this._squashDups = false;
        }

        public Scope(Scope scope, boolean z, boolean z2) {
            this._parent = scope;
            this._isObject = z;
            this._squashDups = z2;
        }

        public static Scope rootObjectScope(boolean z) {
            return new Scope(null, true, z);
        }

        public static Scope rootArrayScope() {
            return new Scope(null);
        }

        public final Scope resetAsArray() {
            this._isObject = false;
            return this;
        }

        public final Scope resetAsObject(boolean z) {
            this._isObject = true;
            this._squashDups = z;
            return this;
        }

        public Scope childObject() {
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            return scope.resetAsObject(this._squashDups);
        }

        public Scope childObject(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            return scope.resetAsObject(this._squashDups);
        }

        public Scope childArray() {
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            return scope.resetAsArray();
        }

        public Scope childArray(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            return scope.resetAsArray();
        }

        public boolean isObject() {
            return this._isObject;
        }

        public void putValue(String str, Object obj) {
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
        }

        public Scope putDeferredValue(Object obj) {
            String str = this._deferredKey;
            Objects.requireNonNull(str);
            this._deferredKey = null;
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return this;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
            return this;
        }

        public void addValue(Object obj) {
            if (this._list == null) {
                this._list = new ArrayList();
            }
            this._list.add(obj);
        }

        public Object finishRootObject() {
            Map<String, Object> map = this._map;
            return map == null ? emptyMap() : map;
        }

        public Scope finishBranchObject() {
            Object linkedHashMap = this._map;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                this._map = null;
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(linkedHashMap);
            }
            this._parent.addValue(linkedHashMap);
            return this._parent;
        }

        public Object finishRootArray(boolean z) {
            List<Object> list = this._list;
            if (list != null) {
                return z ? list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : list;
            }
            if (z) {
                return UntypedObjectDeserializerNR.NO_OBJECTS;
            }
            return emptyList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Scope finishBranchArray(boolean z) {
            Object objEmptyList;
            List<Object> list = this._list;
            List<Object> array = list;
            if (list != null) {
                if (z) {
                    array = list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS);
                }
                this._list = null;
                objEmptyList = array;
            } else if (z) {
                objEmptyList = UntypedObjectDeserializerNR.NO_OBJECTS;
            } else {
                objEmptyList = emptyList();
            }
            if (this._parent.isObject()) {
                return this._parent.putDeferredValue(objEmptyList);
            }
            this._parent.addValue(objEmptyList);
            return this._parent;
        }

        public final void _putValueHandleDups(String str, Object obj) {
            Map<String, Object> map = this._map;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this._map = linkedHashMap;
                linkedHashMap.put(str, obj);
                return;
            }
            Object objPut = map.put(str, obj);
            if (objPut != null) {
                if (objPut instanceof List) {
                    ((List) objPut).add(obj);
                    this._map.put(str, objPut);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objPut);
                    arrayList.add(obj);
                    this._map.put(str, arrayList);
                }
            }
        }

        public static Map<String, Object> emptyMap() {
            return new LinkedHashMap(2);
        }

        public static List<Object> emptyList() {
            return new ArrayList(2);
        }
    }
}
