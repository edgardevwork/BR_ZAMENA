package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.base.C3393R;
import coil.decode.DataSource;
import coil.decode.Decoder;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.intercept.Interceptor;
import coil.intercept.RealInterceptorChain;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.request.Tags;
import coil.request.ViewTargetRequestManager;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Deferred;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m7104d1 = {"\u0000\u009c\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020\rH\u0000\u001a\u0010\u0010N\u001a\u00020\r2\u0006\u0010L\u001a\u00020AH\u0000\u001a\u0010\u0010O\u001a\u0002022\u0006\u0010P\u001a\u00020&H\u0000\u001a\b\u0010Q\u001a\u000202H\u0000\u001a\b\u0010R\u001a\u00020SH\u0000\u001a\f\u0010T\u001a\u00020U*\u00020VH\u0000\u001a\u0017\u0010W\u001a\u00020X*\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0080\b\u001a+\u0010W\u001a\u00020X*\u00020X2\u001c\u0010[\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030]\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0018\u00010\\H\u0080\b\u001a\u0014\u0010_\u001a\u00020`*\u00020`2\u0006\u0010a\u001a\u00020\u0001H\u0000\u001a\f\u0010b\u001a\u00020U*\u00020cH\u0000\u001a\u0019\u0010d\u001a\u0004\u0018\u00010e*\u00020f2\b\u0010g\u001a\u0004\u0018\u00010hH\u0080\n\u001a\u001f\u0010i\u001a\u0004\u0018\u0001Hj\"\u0004\b\u0000\u0010j*\b\u0012\u0004\u0012\u0002Hj0kH\u0000¢\u0006\u0002\u0010l\u001a\u0018\u0010m\u001a\u0004\u0018\u00010\u0001*\u00020n2\b\u0010o\u001a\u0004\u0018\u00010\u0001H\u0000\u001a#\u0010p\u001a\u00020\u0007*\u00020q2\u0006\u0010D\u001a\u00020E2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070sH\u0080\b\u001a\f\u0010t\u001a\u000202*\u00020\u0007H\u0000\u001a\u000e\u0010u\u001a\u00020v*\u0004\u0018\u00010vH\u0000\u001a\u000e\u0010u\u001a\u00020w*\u0004\u0018\u00010wH\u0000\u001a\u000e\u0010u\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000\u001a\f\u0010x\u001a\u00020y*\u00020zH\u0000\u001a\u0014\u0010{\u001a\u00020\u0007*\u00020\u00012\u0006\u0010|\u001a\u00020\u0007H\u0000\u001a\u0014\u0010}\u001a\u00020\u0007*\u00020~2\u0006\u0010D\u001a\u00020EH\u0000\u001a#\u0010\u007f\u001a\u00020\u0007*\u00020q2\u0006\u0010D\u001a\u00020E2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070sH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018X\u0080\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0018\u0010 \u001a\u00020!*\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u001a\u0010%\u001a\u0004\u0018\u00010\u0001*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0018\u0010)\u001a\u00020\u0007*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0019\u0010-\u001a\u00020\u0007*\u00020.8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0018\u00101\u001a\u000202*\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00103\"\u0018\u00104\u001a\u000202*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0018\u00106\u001a\u00020\u0007*\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0018\u0010:\u001a\u00020;*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0018\u0010?\u001a\u00020@*\u00020A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0018\u0010D\u001a\u00020E*\u00020F8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0018\u0010I\u001a\u00020\u0007*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010,¨\u0006\u0080\u0001"}, m7105d2 = {"ASSET_FILE_PATH_ROOT", "", "DEFAULT_BITMAP_CONFIG", "Landroid/graphics/Bitmap$Config;", "getDEFAULT_BITMAP_CONFIG", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_MEMORY_CLASS_MEGABYTES", "", "EMPTY_HEADERS", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "LOW_MEMORY_MULTIPLIER", "", "MIME_TYPE_HEIC", "MIME_TYPE_HEIF", "MIME_TYPE_JPEG", "MIME_TYPE_WEBP", "NULL_COLOR_SPACE", "Landroid/graphics/ColorSpace;", "getNULL_COLOR_SPACE", "()Landroid/graphics/ColorSpace;", "STANDARD_MEMORY_MULTIPLIER", "VALID_TRANSFORMATION_CONFIGS", "", "getVALID_TRANSFORMATION_CONFIGS", "()[Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "emoji", "Lcoil/decode/DataSource;", "getEmoji", "(Lcoil/decode/DataSource;)Ljava/lang/String;", "eventListener", "Lcoil/EventListener;", "Lcoil/intercept/Interceptor$Chain;", "getEventListener", "(Lcoil/intercept/Interceptor$Chain;)Lcoil/EventListener;", "firstPathSegment", "Landroid/net/Uri;", "getFirstPathSegment", "(Landroid/net/Uri;)Ljava/lang/String;", "height", "Landroid/graphics/drawable/Drawable;", "getHeight", "(Landroid/graphics/drawable/Drawable;)I", "identityHashCode", "", "getIdentityHashCode", "(Ljava/lang/Object;)I", "isPlaceholderCached", "", "(Lcoil/intercept/Interceptor$Chain;)Z", "isVector", "(Landroid/graphics/drawable/Drawable;)Z", "nightMode", "Landroid/content/res/Configuration;", "getNightMode", "(Landroid/content/res/Configuration;)I", "requestManager", "Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View;", "getRequestManager", "(Landroid/view/View;)Lcoil/request/ViewTargetRequestManager;", "safeCacheDir", "Ljava/io/File;", "Landroid/content/Context;", "getSafeCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "scale", "Lcoil/size/Scale;", "Landroid/widget/ImageView;", "getScale", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", "width", "getWidth", "calculateMemoryCacheSize", "context", "percent", "defaultMemoryCacheSizePercent", "isAssetUri", "uri", "isMainThread", "unsupported", "", "abortQuietly", "", "Lcoil/disk/DiskCache$Editor;", "addFirst", "Lcoil/ComponentRegistry$Builder;", "factory", "Lcoil/decode/Decoder$Factory;", "pair", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "addUnsafeNonAscii", "Lokhttp3/Headers$Builder;", "line", "closeQuietly", "Ljava/io/Closeable;", "get", "Lcoil/memory/MemoryCache$Value;", "Lcoil/memory/MemoryCache;", "key", "Lcoil/memory/MemoryCache$Key;", "getCompletedOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/Deferred;", "(Lkotlinx/coroutines/Deferred;)Ljava/lang/Object;", "getMimeTypeFromUrl", "Landroid/webkit/MimeTypeMap;", "url", "heightPx", "Lcoil/size/Size;", "original", "Lkotlin/Function0;", "isMinOrMax", "orEmpty", "Lcoil/request/Parameters;", "Lcoil/request/Tags;", "requireBody", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "toNonNegativeInt", "defaultValue", "toPx", "Lcoil/size/Dimension;", "widthPx", "coil-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "-Utils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
/* renamed from: coil.util.-Utils */
/* loaded from: classes4.dex */
public final class Utils {

    @NotNull
    public static final String ASSET_FILE_PATH_ROOT = "android_asset";

    @NotNull
    public static final Bitmap.Config DEFAULT_BITMAP_CONFIG;
    public static final int DEFAULT_MEMORY_CLASS_MEGABYTES = 256;

    @NotNull
    public static final Headers EMPTY_HEADERS;
    public static final double LOW_MEMORY_MULTIPLIER = 0.15d;

    @NotNull
    public static final String MIME_TYPE_HEIC = "image/heic";

    @NotNull
    public static final String MIME_TYPE_HEIF = "image/heif";

    @NotNull
    public static final String MIME_TYPE_JPEG = "image/jpeg";

    @NotNull
    public static final String MIME_TYPE_WEBP = "image/webp";

    @Nullable
    public static final ColorSpace NULL_COLOR_SPACE = null;
    public static final double STANDARD_MEMORY_MULTIPLIER = 0.2d;

    @NotNull
    public static final Bitmap.Config[] VALID_TRANSFORMATION_CONFIGS;

    /* compiled from: Utils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: coil.util.-Utils$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final boolean isMinOrMax(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    @NotNull
    public static final ViewTargetRequestManager getRequestManager(@NotNull View view) {
        int i = C3393R.id.coil_request_manager;
        Object tag = view.getTag(i);
        ViewTargetRequestManager viewTargetRequestManager = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(i);
                    ViewTargetRequestManager viewTargetRequestManager2 = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                    if (viewTargetRequestManager2 != null) {
                        viewTargetRequestManager = viewTargetRequestManager2;
                    } else {
                        viewTargetRequestManager = new ViewTargetRequestManager(view);
                        view.addOnAttachStateChangeListener(viewTargetRequestManager);
                        view.setTag(i, viewTargetRequestManager);
                    }
                } finally {
                }
            }
        }
        return viewTargetRequestManager;
    }

    @NotNull
    public static final String getEmoji(@NotNull DataSource dataSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i == 1 || i == 2) {
            return Emoji.BRAIN;
        }
        if (i == 3) {
            return Emoji.FLOPPY;
        }
        if (i == 4) {
            return Emoji.CLOUD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getWidth(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int getHeight(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final boolean isVector(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    public static final void closeQuietly(@NotNull Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final Scale getScale(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    @Nullable
    public static final String getMimeTypeFromUrl(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    @Nullable
    public static final String getFirstPathSegment(@NotNull Uri uri) {
        return (String) CollectionsKt___CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int getNightMode(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        VALID_TRANSFORMATION_CONFIGS = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        DEFAULT_BITMAP_CONFIG = config;
        EMPTY_HEADERS = new Headers.Builder().build();
    }

    @NotNull
    public static final Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return VALID_TRANSFORMATION_CONFIGS;
    }

    @NotNull
    public static final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return DEFAULT_BITMAP_CONFIG;
    }

    @Nullable
    public static final ColorSpace getNULL_COLOR_SPACE() {
        return NULL_COLOR_SPACE;
    }

    @NotNull
    public static final Headers getEMPTY_HEADERS() {
        return EMPTY_HEADERS;
    }

    @NotNull
    public static final Headers orEmpty(@Nullable Headers headers) {
        return headers == null ? EMPTY_HEADERS : headers;
    }

    @NotNull
    public static final Tags orEmpty(@Nullable Tags tags) {
        return tags == null ? Tags.EMPTY : tags;
    }

    @NotNull
    public static final Parameters orEmpty(@Nullable Parameters parameters) {
        return parameters == null ? Parameters.EMPTY : parameters;
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final int getIdentityHashCode(@NotNull Object obj) {
        return System.identityHashCode(obj);
    }

    @Nullable
    public static final <T> T getCompletedOrNull(@NotNull Deferred<? extends T> deferred) {
        try {
            return deferred.getCompleted();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final MemoryCache.Value get(@NotNull MemoryCache memoryCache, @Nullable MemoryCache.Key key) {
        if (key != null) {
            return memoryCache.get(key);
        }
        return null;
    }

    @NotNull
    public static final File getSafeCacheDir(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ComponentRegistry.Builder addFirst(@NotNull ComponentRegistry.Builder builder, @Nullable Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> pair) {
        if (pair != 0) {
            builder.getFetcherFactories$coil_base_release().add(0, pair);
        }
        return builder;
    }

    @NotNull
    public static final ComponentRegistry.Builder addFirst(@NotNull ComponentRegistry.Builder builder, @Nullable Decoder.Factory factory) {
        if (factory != null) {
            builder.getDecoderFactories$coil_base_release().add(0, factory);
        }
        return builder;
    }

    public static final int toNonNegativeInt(@NotNull String str, int i) {
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str);
        if (longOrNull == null) {
            return i;
        }
        long jLongValue = longOrNull.longValue();
        if (jLongValue > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final void abortQuietly(@NotNull DiskCache.Editor editor) {
        try {
            editor.abort();
        } catch (Exception unused) {
        }
    }

    public static final boolean isPlaceholderCached(@NotNull Interceptor.Chain chain) {
        return (chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).getIsPlaceholderCached();
    }

    @NotNull
    public static final EventListener getEventListener(@NotNull Interceptor.Chain chain) {
        return chain instanceof RealInterceptorChain ? ((RealInterceptorChain) chain).getEventListener() : EventListener.NONE;
    }

    public static final int widthPx(@NotNull Size size, @NotNull Scale scale, @NotNull Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getWidth(), scale);
    }

    public static final int heightPx(@NotNull Size size, @NotNull Scale scale, @NotNull Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getHeight(), scale);
    }

    @NotNull
    public static final Void unsupported() {
        throw new IllegalStateException("Unsupported".toString());
    }

    public static final boolean isAssetUri(@NotNull Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), PomReader.PomProfileElement.FILE) && Intrinsics.areEqual(getFirstPathSegment(uri), "android_asset");
    }

    @NotNull
    public static final Headers.Builder addUnsafeNonAscii(@NotNull Headers.Builder builder, @NotNull String str) {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        builder.addUnsafeNonAscii(string, strSubstring2);
        return builder;
    }

    @NotNull
    public static final ResponseBody requireBody(@NotNull Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public static final int toPx(@NotNull Dimension dimension, @NotNull Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).px;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double defaultMemoryCacheSizePercent(@NotNull Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final int calculateMemoryCacheSize(@NotNull Context context, double d) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d2 = 1024;
        return (int) (d * largeMemoryClass * d2 * d2);
    }
}
