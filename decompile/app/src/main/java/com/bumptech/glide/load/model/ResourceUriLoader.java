package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.DefaultDataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes5.dex */
public final class ResourceUriLoader<DataT> implements ModelLoader<Uri, DataT> {
    public static final int INVALID_RESOURCE_ID = 0;
    public static final String TAG = "ResourceUriLoader";
    public final Context context;
    public final ModelLoader<Integer, DataT> delegate;

    public static ModelLoaderFactory<Uri, InputStream> newStreamFactory(Context context) {
        return new InputStreamFactory(context);
    }

    public static ModelLoaderFactory<Uri, AssetFileDescriptor> newAssetFileDescriptorFactory(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public ResourceUriLoader(Context context, ModelLoader<Integer, DataT> modelLoader) {
        this.context = context.getApplicationContext();
        this.delegate = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return parseResourceIdUri(uri, i, i2, options);
        }
        if (pathSegments.size() == 2) {
            return parseResourceNameUri(uri, i, i2, options);
        }
        if (!Log.isLoggable(TAG, 5)) {
            return null;
        }
        Log.w(TAG, "Failed to parse resource uri: " + uri);
        return null;
    }

    @Nullable
    public final ModelLoader.LoadData<DataT> parseResourceNameUri(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.context.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.context.getPackageName());
        if (identifier == 0) {
            if (!Log.isLoggable(TAG, 5)) {
                return null;
            }
            Log.w(TAG, "Failed to find resource id for: " + uri);
            return null;
        }
        return this.delegate.buildLoadData(Integer.valueOf(identifier), i, i2, options);
    }

    @Nullable
    public final ModelLoader.LoadData<DataT> parseResourceIdUri(@NonNull Uri uri, int i, int i2, @NonNull Options options) throws NumberFormatException {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 == 0) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "Failed to parse a valid non-0 resource id from: " + uri);
                }
                return null;
            }
            return this.delegate.buildLoadData(Integer.valueOf(i3), i, i2, options);
        } catch (NumberFormatException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Failed to parse resource id from: " + uri, e);
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return DefaultDataSource.SCHEME_ANDROID_RESOURCE.equals(uri.getScheme()) && this.context.getPackageName().equals(uri.getAuthority());
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        public final Context context;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public InputStreamFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.context, multiModelLoaderFactory.build(Integer.class, InputStream.class));
        }
    }

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor> {
        public final Context context;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public AssetFileDescriptorFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<Uri, AssetFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.context, multiModelLoaderFactory.build(Integer.class, AssetFileDescriptor.class));
        }
    }
}
