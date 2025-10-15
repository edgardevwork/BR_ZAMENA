package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public class ReadableObjectId {
    public Object _item;
    public final ObjectIdGenerator.IdKey _key;
    public LinkedList<Referring> _referringProperties;
    public ObjectIdResolver _resolver;

    public boolean tryToResolveUnresolved(DeserializationContext deserializationContext) {
        return false;
    }

    public ReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        this._key = idKey;
    }

    public void setResolver(ObjectIdResolver objectIdResolver) {
        this._resolver = objectIdResolver;
    }

    public ObjectIdGenerator.IdKey getKey() {
        return this._key;
    }

    public void appendReferring(Referring referring) {
        if (this._referringProperties == null) {
            this._referringProperties = new LinkedList<>();
        }
        this._referringProperties.add(referring);
    }

    public void bindItem(Object obj) throws IOException {
        this._resolver.bindItem(this._key, obj);
        this._item = obj;
        Object obj2 = this._key.key;
        LinkedList<Referring> linkedList = this._referringProperties;
        if (linkedList != null) {
            Iterator<Referring> it = linkedList.iterator();
            this._referringProperties = null;
            while (it.hasNext()) {
                it.next().handleResolvedForwardReference(obj2, obj);
            }
        }
    }

    public Object resolve() {
        Object objResolveId = this._resolver.resolveId(this._key);
        this._item = objResolveId;
        return objResolveId;
    }

    public boolean hasReferringProperties() {
        LinkedList<Referring> linkedList = this._referringProperties;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<Referring> referringProperties() {
        LinkedList<Referring> linkedList = this._referringProperties;
        if (linkedList == null) {
            return Collections.emptyList().iterator();
        }
        return linkedList.iterator();
    }

    public ObjectIdResolver getResolver() {
        return this._resolver;
    }

    public String toString() {
        return String.valueOf(this._key);
    }

    public static abstract class Referring {
        public final Class<?> _beanType;
        public final UnresolvedForwardReference _reference;

        public abstract void handleResolvedForwardReference(Object obj, Object obj2) throws IOException;

        public Referring(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this._reference = unresolvedForwardReference;
            this._beanType = cls;
        }

        public Referring(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this._reference = unresolvedForwardReference;
            this._beanType = javaType.getRawClass();
        }

        public JsonLocation getLocation() {
            return this._reference.getLocation();
        }

        public Class<?> getBeanType() {
            return this._beanType;
        }

        public boolean hasId(Object obj) {
            return obj.equals(this._reference.getUnresolvedId());
        }
    }
}
