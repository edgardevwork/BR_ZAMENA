package org.apache.commons.compress.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

@Deprecated
/* loaded from: classes8.dex */
public class ServiceLoaderIterator<E> implements Iterator<E> {
    public E nextServiceLoader;
    public final Class<E> service;
    public final Iterator<E> serviceLoaderIterator;

    public ServiceLoaderIterator(Class<E> cls) {
        this(cls, ClassLoader.getSystemClassLoader());
    }

    public ServiceLoaderIterator(Class<E> cls, ClassLoader classLoader) {
        this.service = cls;
        this.serviceLoaderIterator = ServiceLoader.load(cls, classLoader).iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (this.nextServiceLoader == null) {
            try {
            } catch (ServiceConfigurationError e) {
                if (!(e.getCause() instanceof SecurityException)) {
                    throw e;
                }
            }
            if (!this.serviceLoaderIterator.hasNext()) {
                return false;
            }
            this.nextServiceLoader = this.serviceLoaderIterator.next();
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements for service " + this.service.getName());
        }
        E e = this.nextServiceLoader;
        this.nextServiceLoader = null;
        return e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("service=" + this.service.getName());
    }
}
