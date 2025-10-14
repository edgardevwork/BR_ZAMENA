package com.thoughtworks.xstream.core.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ObjectIdDictionary {
    public final Map map = new HashMap();
    public final ReferenceQueue queue = new ReferenceQueue();

    public interface Wrapper {
        boolean equals(Object obj);

        Object get();

        int hashCode();

        String toString();
    }

    /* loaded from: classes5.dex */
    public static class IdWrapper implements Wrapper {
        public final int hashCode;
        public final Object obj;

        public IdWrapper(Object obj) {
            this.hashCode = System.identityHashCode(obj);
            this.obj = obj;
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public int hashCode() {
            return this.hashCode;
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public boolean equals(Object obj) {
            return this.obj == ((Wrapper) obj).get();
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public String toString() {
            return this.obj.toString();
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public Object get() {
            return this.obj;
        }
    }

    /* loaded from: classes5.dex */
    public class WeakIdWrapper extends WeakReference implements Wrapper {
        public final int hashCode;

        public WeakIdWrapper(Object obj) {
            super(obj, ObjectIdDictionary.this.queue);
            this.hashCode = System.identityHashCode(obj);
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public int hashCode() {
            return this.hashCode;
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public boolean equals(Object obj) {
            return get() == ((Wrapper) obj).get();
        }

        @Override // com.thoughtworks.xstream.core.util.ObjectIdDictionary.Wrapper
        public String toString() {
            T t = get();
            return t == 0 ? "(null)" : t.toString();
        }
    }

    public void associateId(Object obj, Object obj2) {
        this.map.put(new WeakIdWrapper(obj), obj2);
        cleanup();
    }

    public Object lookupId(Object obj) {
        return this.map.get(new IdWrapper(obj));
    }

    public boolean containsId(Object obj) {
        return this.map.containsKey(new IdWrapper(obj));
    }

    public void removeId(Object obj) {
        this.map.remove(new IdWrapper(obj));
        cleanup();
    }

    public int size() {
        cleanup();
        return this.map.size();
    }

    public final void cleanup() {
        while (true) {
            WeakIdWrapper weakIdWrapper = (WeakIdWrapper) this.queue.poll();
            if (weakIdWrapper == null) {
                return;
            } else {
                this.map.remove(weakIdWrapper);
            }
        }
    }
}
