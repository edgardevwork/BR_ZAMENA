package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ModelLoaderRegistry {
    public final ModelLoaderCache cache;
    public final MultiModelLoaderFactory multiModelLoaderFactory;

    public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new MultiModelLoaderFactory(pool));
    }

    public ModelLoaderRegistry(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
        this.cache = new ModelLoaderCache();
        this.multiModelLoaderFactory = multiModelLoaderFactory;
    }

    public synchronized <Model, Data> void append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.multiModelLoaderFactory.append(cls, cls2, modelLoaderFactory);
        this.cache.clear();
    }

    public synchronized <Model, Data> void prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.multiModelLoaderFactory.prepend(cls, cls2, modelLoaderFactory);
        this.cache.clear();
    }

    public synchronized <Model, Data> void remove(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        tearDown(this.multiModelLoaderFactory.remove(cls, cls2));
        this.cache.clear();
    }

    public synchronized <Model, Data> void replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        tearDown(this.multiModelLoaderFactory.replace(cls, cls2, modelLoaderFactory));
        this.cache.clear();
    }

    public final <Model, Data> void tearDown(@NonNull List<ModelLoaderFactory<? extends Model, ? extends Data>> list) {
        Iterator<ModelLoaderFactory<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().teardown();
        }
    }

    @NonNull
    public <A> List<ModelLoader<A, ?>> getModelLoaders(@NonNull A a2) {
        List<ModelLoader<A, ?>> modelLoadersForClass = getModelLoadersForClass(getClass(a2));
        if (modelLoadersForClass.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2);
        }
        int size = modelLoadersForClass.size();
        List<ModelLoader<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ModelLoader<A, ?> modelLoader = modelLoadersForClass.get(i);
            if (modelLoader.handles(a2)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(modelLoader);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a2, modelLoadersForClass);
        }
        return listEmptyList;
    }

    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.multiModelLoaderFactory.build(cls, cls2);
    }

    @NonNull
    public synchronized List<Class<?>> getDataClasses(@NonNull Class<?> cls) {
        return this.multiModelLoaderFactory.getDataClasses(cls);
    }

    @NonNull
    public final synchronized <A> List<ModelLoader<A, ?>> getModelLoadersForClass(@NonNull Class<A> cls) {
        List<ModelLoader<A, ?>> listUnmodifiableList;
        listUnmodifiableList = this.cache.get(cls);
        if (listUnmodifiableList == null) {
            listUnmodifiableList = Collections.unmodifiableList(this.multiModelLoaderFactory.build(cls));
            this.cache.put(cls, listUnmodifiableList);
        }
        return listUnmodifiableList;
    }

    @NonNull
    public static <A> Class<A> getClass(@NonNull A a2) {
        return (Class<A>) a2.getClass();
    }

    public static class ModelLoaderCache {
        public final Map<Class<?>, Entry<?>> cachedModelLoaders = new HashMap();

        public void clear() {
            this.cachedModelLoaders.clear();
        }

        public <Model> void put(Class<Model> cls, List<ModelLoader<Model, ?>> list) {
            if (this.cachedModelLoaders.put(cls, new Entry<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }

        @Nullable
        public <Model> List<ModelLoader<Model, ?>> get(Class<Model> cls) {
            Entry<?> entry = this.cachedModelLoaders.get(cls);
            if (entry == null) {
                return null;
            }
            return (List<ModelLoader<Model, ?>>) entry.loaders;
        }

        public static class Entry<Model> {
            public final List<ModelLoader<Model, ?>> loaders;

            public Entry(List<ModelLoader<Model, ?>> list) {
                this.loaders = list;
            }
        }
    }
}
