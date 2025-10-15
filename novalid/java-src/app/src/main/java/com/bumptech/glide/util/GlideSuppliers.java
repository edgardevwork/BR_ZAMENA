package com.bumptech.glide.util;

/* loaded from: classes2.dex */
public final class GlideSuppliers {

    public interface GlideSupplier<T> {
        T get();
    }

    public static <T> GlideSupplier<T> memorize(final GlideSupplier<T> glideSupplier) {
        return new GlideSupplier<T>() { // from class: com.bumptech.glide.util.GlideSuppliers.1
            public volatile T instance;

            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public T get() {
                if (this.instance == null) {
                    synchronized (this) {
                        try {
                            if (this.instance == null) {
                                this.instance = (T) Preconditions.checkNotNull(glideSupplier.get());
                            }
                        } finally {
                        }
                    }
                }
                return this.instance;
            }
        };
    }
}
