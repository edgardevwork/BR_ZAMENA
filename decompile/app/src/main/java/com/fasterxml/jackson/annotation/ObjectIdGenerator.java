package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import org.apache.ivy.ant.IvyCleanCache;

/* loaded from: classes4.dex */
public abstract class ObjectIdGenerator<T> implements Serializable {
    public abstract boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator);

    public abstract ObjectIdGenerator<T> forScope(Class<?> cls);

    public abstract T generateId(Object obj);

    public abstract Class<?> getScope();

    public boolean isValidReferencePropertyName(String str, Object obj) {
        return false;
    }

    public abstract IdKey key(Object obj);

    public boolean maySerializeAsObject() {
        return false;
    }

    public abstract ObjectIdGenerator<T> newForSerialization(Object obj);

    public static final class IdKey implements Serializable {
        public static final long serialVersionUID = 1;
        public final int hashCode;
        public final Object key;
        public final Class<?> scope;
        public final Class<?> type;

        public IdKey(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.type = cls;
            this.scope = cls2;
            this.key = obj;
            int iHashCode = obj.hashCode() + cls.getName().hashCode();
            this.hashCode = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != IdKey.class) {
                return false;
            }
            IdKey idKey = (IdKey) obj;
            return idKey.key.equals(this.key) && idKey.type == this.type && idKey.scope == this.scope;
        }

        public String toString() {
            Object obj = this.key;
            Class<?> cls = this.type;
            String name = IvyCleanCache.NONE;
            String name2 = cls == null ? IvyCleanCache.NONE : cls.getName();
            Class<?> cls2 = this.scope;
            if (cls2 != null) {
                name = cls2.getName();
            }
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", obj, name2, name);
        }
    }
}
