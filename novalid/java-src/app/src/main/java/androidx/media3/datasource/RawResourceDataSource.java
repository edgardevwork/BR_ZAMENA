package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

@UnstableApi
/* loaded from: classes.dex */
public final class RawResourceDataSource extends BaseDataSource {

    @Deprecated
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    public final Context applicationContext;

    @Nullable
    public AssetFileDescriptor assetFileDescriptor;
    public long bytesRemaining;

    @Nullable
    public DataSpec dataSpec;

    @Nullable
    public InputStream inputStream;
    public boolean opened;

    /* loaded from: classes2.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.applicationContext = context.getApplicationContext();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        this.dataSpec = dataSpec;
        transferInitializing(dataSpec);
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = openAssetFileDescriptor(this.applicationContext, dataSpec);
        this.assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
        this.inputStream = fileInputStream;
        if (length != -1) {
            try {
                if (dataSpec.position > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e) {
                throw e;
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(null, e2, 2000);
            }
        }
        long startOffset = this.assetFileDescriptor.getStartOffset();
        long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
        if (jSkip != dataSpec.position) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.bytesRemaining = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.bytesRemaining = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j = length - jSkip;
            this.bytesRemaining = j;
            if (j < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = dataSpec.length;
        if (jMin != -1) {
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                jMin = Math.min(j2, jMin);
            }
            this.bytesRemaining = jMin;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j3 = dataSpec.length;
        return j3 != -1 ? j3 : this.bytesRemaining;
    }

    public static AssetFileDescriptor openAssetFileDescriptor(Context context, DataSpec dataSpec) throws Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, RawResourceDataSourceException {
        Resources resources;
        int identifier;
        String host;
        Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme()) || (TextUtils.equals(DefaultDataSource.SCHEME_ANDROID_RESOURCE, uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) Assertions.checkNotNull(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            resources = context.getResources();
            try {
                identifier = Integer.parseInt((String) Assertions.checkNotNull(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else if (TextUtils.equals(DefaultDataSource.SCHEME_ANDROID_RESOURCE, uriNormalizeScheme.getScheme())) {
            String strSubstring = (String) Assertions.checkNotNull(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            if (TextUtils.isEmpty(uriNormalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = uriNormalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resources = context.getResources();
            } else {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
            identifier = resources.getIdentifier(host + StringUtils.PROCESS_POSTFIX_DELIMITER + strSubstring, "raw", null);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
            }
        } else {
            throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only " + DefaultDataSource.SCHEME_ANDROID_RESOURCE + " is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new RawResourceDataSourceException(null, e2, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(null, e, 2000);
            }
        }
        int i3 = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - i3;
        }
        bytesTransferred(i3);
        return i3;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws RawResourceDataSourceException {
        this.dataSpec = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (Throwable th) {
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                        throw th;
                    } finally {
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                    }
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(null, e3, 2000);
        }
    }
}
