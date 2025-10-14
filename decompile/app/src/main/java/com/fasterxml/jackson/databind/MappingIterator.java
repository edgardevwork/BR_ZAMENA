package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class MappingIterator<T> implements Iterator<T>, Closeable {
    public static final MappingIterator<?> EMPTY_ITERATOR = new MappingIterator<>(null, null, null, null, false, null);
    public static final int STATE_CLOSED = 0;
    public static final int STATE_HAS_VALUE = 3;
    public static final int STATE_MAY_HAVE_VALUE = 2;
    public static final int STATE_NEED_RESYNC = 1;
    public final boolean _closeParser;
    public final DeserializationContext _context;
    public final JsonDeserializer<T> _deserializer;
    public final JsonParser _parser;
    public final JsonStreamContext _seqContext;
    public int _state;
    public final JavaType _type;
    public final T _updatedValue;

    /* JADX WARN: Multi-variable type inference failed */
    public MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        this._type = javaType;
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        if (obj == 0) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (jsonParser == null) {
            this._seqContext = null;
            this._state = 0;
            return;
        }
        JsonStreamContext parsingContext = jsonParser.getParsingContext();
        if (z && jsonParser.isExpectedStartArrayToken()) {
            jsonParser.clearCurrentToken();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.START_OBJECT || jsonTokenCurrentToken == JsonToken.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        }
        this._seqContext = parsingContext;
        this._state = 2;
    }

    public static <T> MappingIterator<T> emptyIterator() {
        return (MappingIterator<T>) EMPTY_ITERATOR;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e) {
            return ((Boolean) _handleMappingException(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) _handleIOException(e2)).booleanValue();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return nextValue();
        } catch (JsonMappingException e) {
            return (T) _handleMappingException(e);
        } catch (IOException e2) {
            return (T) _handleIOException(e2);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._state != 0) {
            this._state = 0;
            JsonParser jsonParser = this._parser;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public boolean hasNextValue() throws IOException {
        JsonToken jsonTokenNextToken;
        int i = this._state;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            _resync();
        } else if (i != 2) {
            return true;
        }
        JsonParser jsonParser = this._parser;
        if (jsonParser == null) {
            return false;
        }
        if (jsonParser.currentToken() == null && ((jsonTokenNextToken = this._parser.nextToken()) == null || jsonTokenNextToken == JsonToken.END_ARRAY)) {
            this._state = 0;
            if (this._closeParser) {
                this._parser.close();
            }
            return false;
        }
        this._state = 3;
        return true;
    }

    public T nextValue() throws IOException {
        T tDeserialize;
        int i = this._state;
        if (i == 0) {
            return (T) _throwNoSuchElement();
        }
        if ((i == 1 || i == 2) && !hasNextValue()) {
            return (T) _throwNoSuchElement();
        }
        try {
            T t = this._updatedValue;
            if (t == null) {
                tDeserialize = this._deserializer.deserialize(this._parser, this._context);
            } else {
                this._deserializer.deserialize(this._parser, this._context, t);
                tDeserialize = this._updatedValue;
            }
            this._state = 2;
            this._parser.clearCurrentToken();
            return tDeserialize;
        } catch (Throwable th) {
            this._state = 1;
            this._parser.clearCurrentToken();
            throw th;
        }
    }

    public List<T> readAll() throws IOException {
        return readAll((MappingIterator<T>) new ArrayList());
    }

    public <L extends List<? super T>> L readAll(L l) throws IOException {
        while (hasNextValue()) {
            l.add(nextValue());
        }
        return l;
    }

    public <C extends Collection<? super T>> C readAll(C c) throws IOException {
        while (hasNextValue()) {
            c.add(nextValue());
        }
        return c;
    }

    public JsonParser getParser() {
        return this._parser;
    }

    public FormatSchema getParserSchema() {
        return this._parser.getSchema();
    }

    public JsonLocation getCurrentLocation() {
        return this._parser.getCurrentLocation();
    }

    public void _resync() throws IOException {
        JsonParser jsonParser = this._parser;
        if (jsonParser.getParsingContext() == this._seqContext) {
            return;
        }
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY || jsonTokenNextToken == JsonToken.END_OBJECT) {
                if (jsonParser.getParsingContext() == this._seqContext) {
                    jsonParser.clearCurrentToken();
                    return;
                }
            } else if (jsonTokenNextToken == JsonToken.START_ARRAY || jsonTokenNextToken == JsonToken.START_OBJECT) {
                jsonParser.skipChildren();
            } else if (jsonTokenNextToken == null) {
                return;
            }
        }
    }

    public <R> R _throwNoSuchElement() {
        throw new NoSuchElementException();
    }

    public <R> R _handleMappingException(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    public <R> R _handleIOException(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }
}
