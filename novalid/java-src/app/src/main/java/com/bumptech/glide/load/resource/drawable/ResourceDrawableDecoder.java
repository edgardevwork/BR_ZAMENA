package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.DefaultDataSource;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.util.List;

/* loaded from: classes6.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    public static final String ANDROID_PACKAGE_NAME = "android";
    public static final int ID_PATH_SEGMENTS = 1;
    public static final int MISSING_RESOURCE_ID = 0;
    public static final int NAME_PATH_SEGMENT_INDEX = 1;
    public static final int NAME_URI_PATH_SEGMENTS = 2;
    public static final int RESOURCE_ID_SEGMENT_INDEX = 0;
    public static final Option<Resources.Theme> THEME = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public static final int TYPE_PATH_SEGMENT_INDEX = 0;
    public final Context context;

    public ResourceDrawableDecoder(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Uri uri, @NonNull Options options) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals(DefaultDataSource.SCHEME_ANDROID_RESOURCE);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource<Drawable> decode(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        Drawable drawable;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context contextFindContextForPackage = findContextForPackage(uri, authority);
        int iFindResourceIdFromUri = findResourceIdFromUri(contextFindContextForPackage, uri);
        Resources.Theme theme = ((String) Preconditions.checkNotNull(authority)).equals(this.context.getPackageName()) ? (Resources.Theme) options.get(THEME) : null;
        if (theme == null) {
            drawable = DrawableDecoderCompat.getDrawable(this.context, contextFindContextForPackage, iFindResourceIdFromUri);
        } else {
            drawable = DrawableDecoderCompat.getDrawable(this.context, iFindResourceIdFromUri, theme);
        }
        return NonOwnedDrawableResource.newInstance(drawable);
    }

    @NonNull
    public final Context findContextForPackage(Uri uri, @NonNull String str) {
        if (str.equals(this.context.getPackageName())) {
            return this.context;
        }
        try {
            return this.context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.context.getPackageName())) {
                return this.context;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @DrawableRes
    public final int findResourceIdFromUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return findResourceIdFromTypeAndNameResourceUri(context, uri);
        }
        if (pathSegments.size() == 1) {
            return findResourceIdFromResourceIdUri(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @DrawableRes
    public final int findResourceIdFromTypeAndNameResourceUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    public final int findResourceIdFromResourceIdUri(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }
}
