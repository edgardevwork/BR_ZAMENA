package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class JsonParserSequence extends JsonParserDelegate {
    public final boolean _checkForExistingToken;
    public boolean _hasToken;
    public int _nextParserIndex;
    public final JsonParser[] _parsers;

    @Deprecated
    public JsonParserSequence(JsonParser[] jsonParserArr) {
        this(false, jsonParserArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonParserSequence(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this._checkForExistingToken = z;
        if (z && this.delegate.hasCurrentToken()) {
            z2 = true;
        }
        this._hasToken = z2;
        this._parsers = jsonParserArr;
        this._nextParserIndex = 1;
    }

    public static JsonParserSequence createFlattened(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof JsonParserSequence;
        if (!z2 && !(jsonParser2 instanceof JsonParserSequence)) {
            return new JsonParserSequence(z, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof JsonParserSequence) {
            ((JsonParserSequence) jsonParser2).addFlattenedActiveParsers(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new JsonParserSequence(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Deprecated
    public static JsonParserSequence createFlattened(JsonParser jsonParser, JsonParser jsonParser2) {
        return createFlattened(false, jsonParser, jsonParser2);
    }

    public void addFlattenedActiveParsers(List<JsonParser> list) {
        int length = this._parsers.length;
        for (int i = this._nextParserIndex - 1; i < length; i++) {
            JsonParser jsonParser = this._parsers[i];
            if (jsonParser instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            this.delegate.close();
        } while (switchToNext());
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonParser jsonParser = this.delegate;
        if (jsonParser == null) {
            return null;
        }
        if (this._hasToken) {
            this._hasToken = false;
            return jsonParser.currentToken();
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        return jsonTokenNextToken == null ? switchAndReturnNext() : jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        if (this.delegate.currentToken() != JsonToken.START_OBJECT && this.delegate.currentToken() != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken jsonTokenNextToken = nextToken();
            if (jsonTokenNextToken == null) {
                return this;
            }
            if (jsonTokenNextToken.isStructStart()) {
                i++;
            } else if (jsonTokenNextToken.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    public int containedParsersCount() {
        return this._parsers.length;
    }

    public boolean switchToNext() {
        int i = this._nextParserIndex;
        JsonParser[] jsonParserArr = this._parsers;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this._nextParserIndex = i + 1;
        this.delegate = jsonParserArr[i];
        return true;
    }

    public JsonToken switchAndReturnNext() throws IOException {
        JsonToken jsonTokenNextToken;
        do {
            int i = this._nextParserIndex;
            JsonParser[] jsonParserArr = this._parsers;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this._nextParserIndex = i + 1;
            JsonParser jsonParser = jsonParserArr[i];
            this.delegate = jsonParser;
            if (this._checkForExistingToken && jsonParser.hasCurrentToken()) {
                return this.delegate.getCurrentToken();
            }
            jsonTokenNextToken = this.delegate.nextToken();
        } while (jsonTokenNextToken == null);
        return jsonTokenNextToken;
    }
}
