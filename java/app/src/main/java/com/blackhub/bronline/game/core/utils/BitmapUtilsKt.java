package com.blackhub.bronline.game.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.core.content.res.ResourcesCompat;
import androidx.multidex.MultiDexExtractor;
import com.blackhub.bronline.game.core.constants.FileFormats;
import com.blackhub.bronline.game.core.constants.PathConstants;
import com.blackhub.bronline.game.core.enums.ImageFormatTypeEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.launcher.p021di.AppContext;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p051io.CloseableKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BitmapUtils.kt */
@SourceDebugExtension({"SMAP\nBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtils.kt\ncom/blackhub/bronline/game/core/utils/BitmapUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,358:1\n1271#2,2:359\n1285#2,4:361\n*S KotlinDebug\n*F\n+ 1 BitmapUtils.kt\ncom/blackhub/bronline/game/core/utils/BitmapUtilsKt\n*L\n308#1:359,2\n308#1:361,4\n*E\n"})
/* loaded from: classes3.dex */
public final class BitmapUtilsKt {
    @NotNull
    public static final Bitmap getBitmap(@NotNull Resources resources, @DrawableRes int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, null);
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(IntExtensionKt.getOrOne(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null), IntExtensionKt.getOrOne(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        canvas.setBitmap(bitmapCreateBitmap);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    @Nullable
    public static final Bitmap drawableToBitmap(@AppContext @NotNull Context context, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, null);
            if (drawable == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed drawableToBitmap() - transform drawableId " + i + " to Bitmap: " + e);
            return null;
        }
    }

    @Nullable
    public static final Bitmap getPngBitmapFromZip(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        if (imageName.length() > 0) {
            Bitmap bitmapFromDisk = getBitmapFromDisk(context, imageName);
            if (bitmapFromDisk != null) {
                return bitmapFromDisk;
            }
            File externalFilesDir = context.getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            String str = absolutePath + PathConstants.RESOURCES_IMAGES_PATH + imageType.getType() + StringsKt__StringsKt.removeSuffix(imageName, (CharSequence) ImageFormatTypeEnum.PNG.getDotType()) + MultiDexExtractor.EXTRACTED_SUFFIX;
            for (int i = 1; i <= 8; i *= 2) {
                try {
                    Bitmap bitmapDecodeBitmapFromZip = decodeBitmapFromZip(str, imageName, i);
                    if (bitmapDecodeBitmapFromZip != null) {
                        saveBitmapToDisk(context, bitmapDecodeBitmapFromZip, imageName);
                        return bitmapDecodeBitmapFromZip;
                    }
                    return drawableToBitmap(context, R.drawable.img_not_found);
                } catch (FileNotFoundException unused) {
                    UtilsKt.crashlyticsRecordNewException("Failed getPngBitmapFromZip() - imageName: " + imageName + " throw FileNotFoundException: " + str + " after several attempts");
                    return drawableToBitmap(context, R.drawable.img_not_found);
                } catch (Exception e) {
                    UtilsKt.crashlyticsRecordNewException("Failed getPngBitmapFromZip() - imageName: " + imageName + " throw: " + e + " path: " + str + " after several attempts");
                    return null;
                } catch (OutOfMemoryError unused2) {
                    UtilsKt.crashlyticsRecordNewException("Failed getPngBitmapFromZip() - imageName: " + imageName + " throw OutOfMemoryError: " + str + " inSampleSize: " + i);
                }
            }
        }
        return null;
    }

    @Nullable
    public static final Bitmap getSvgBitmapFromZip(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType) {
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        Bitmap bitmapFromDisk = getBitmapFromDisk(context, imageName);
        if (bitmapFromDisk != null) {
            return bitmapFromDisk;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        String str = absolutePath + PathConstants.RESOURCES_IMAGES_PATH + imageType.getType() + StringsKt__StringsKt.removeSuffix(imageName, (CharSequence) ImageFormatTypeEnum.SVG.getDotType()) + MultiDexExtractor.EXTRACTED_SUFFIX;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry(imageName);
                if (entry != null) {
                    Intrinsics.checkNotNull(entry);
                    String name = entry.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (StringsKt__StringsJVMKt.endsWith$default(name, FileFormats.SVG_FORMAT, false, 2, null)) {
                        InputStream inputStream = zipFile.getInputStream(entry);
                        try {
                            SVG fromInputStream = SVG.getFromInputStream(inputStream);
                            if (StringsKt__StringsJVMKt.startsWith$default(imageName, "bg", false, 2, null)) {
                                float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentHeight(), 1.0f) * 2.5f;
                                float fCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentWidth(), 1.0f) * 2.5f;
                                fromInputStream.setDocumentHeight(fCoerceAtLeast);
                                fromInputStream.setDocumentWidth(fCoerceAtLeast2);
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentWidth(), 1.0f)), FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentHeight(), 1.0f)), Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                            fromInputStream.renderToCanvas(new Canvas(bitmapCreateBitmap));
                            CloseableKt.closeFinally(inputStream, null);
                        } finally {
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                } else {
                    bitmapCreateBitmap = null;
                }
                CloseableKt.closeFinally(zipFile, null);
                saveBitmapToDisk(context, bitmapCreateBitmap, imageName);
                return bitmapCreateBitmap;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZip() - imageName: " + imageName + " throw FileNotFoundException: " + str);
            return drawableToBitmap(context, R.drawable.img_not_found);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZip() - imageName: " + imageName + " throw: " + e);
            return null;
        }
    }

    @Nullable
    public static final Bitmap getSvgBitmapFromZipWithSize(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType, float f, float f2) {
        Bitmap bitmapDrawableToBitmap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        Bitmap bitmapFromDisk = getBitmapFromDisk(context, imageName);
        if (bitmapFromDisk != null) {
            return bitmapFromDisk;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        String str = absolutePath + PathConstants.RESOURCES_IMAGES_PATH + imageType.getType() + StringsKt__StringsKt.removeSuffix(imageName, (CharSequence) ImageFormatTypeEnum.SVG.getDotType()) + MultiDexExtractor.EXTRACTED_SUFFIX;
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry(imageName);
                if (entry != null) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        SVG fromInputStream = SVG.getFromInputStream(inputStream);
                        fromInputStream.setDocumentHeight(f);
                        fromInputStream.setDocumentWidth(f2);
                        bitmapDrawableToBitmap = Bitmap.createBitmap(IntExtensionKt.getOrZero(Integer.valueOf(FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentWidth(), 1.0f)))), IntExtensionKt.getOrZero(Integer.valueOf(FloatExtensionKt.roundToIntSafely(RangesKt___RangesKt.coerceAtLeast(fromInputStream.getDocumentHeight(), 1.0f)))), Bitmap.Config.ARGB_8888);
                        Intrinsics.checkNotNullExpressionValue(bitmapDrawableToBitmap, "createBitmap(...)");
                        fromInputStream.renderToCanvas(new Canvas(bitmapDrawableToBitmap));
                        CloseableKt.closeFinally(inputStream, null);
                    } finally {
                    }
                } else {
                    UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZipWithSize() - imageName: " + imageName + " NotFound in zip: " + str);
                    bitmapDrawableToBitmap = drawableToBitmap(context, R.drawable.img_not_found);
                }
                CloseableKt.closeFinally(zipFile, null);
                saveBitmapToDisk(context, bitmapDrawableToBitmap, imageName);
                return bitmapDrawableToBitmap;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            UtilsKt.crashlyticsRecordNewException("Failed getSvgBitmapFromZipWithSize() - imageName: " + imageName + " throw FileNotFoundException: " + str);
            return drawableToBitmap(context, R.drawable.img_not_found);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed to getSvgBitmapFromZipWithSizew(), imageName: " + imageName + " throw: " + e);
            return null;
        }
    }

    public static /* synthetic */ Bitmap getBitmapFromZip$default(Context context, String str, ImageTypePathInCDNEnum imageTypePathInCDNEnum, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        if ((i & 16) != 0) {
            f2 = 0.0f;
        }
        return getBitmapFromZip(context, str, imageTypePathInCDNEnum, f, f2);
    }

    @Nullable
    public static final Bitmap getBitmapFromZip(@AppContext @NotNull Context context, @NotNull String imageName, @NotNull ImageTypePathInCDNEnum imageType, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        UtilsKt.crashlyticsLog("getBitmapFromZip, imageName=" + imageName + ", imageType=" + imageType.getType());
        if (StringsKt__StringsJVMKt.endsWith$default(imageName, ".png", false, 2, null)) {
            return getPngBitmapFromZip(context, imageName, imageType);
        }
        if (!StringsKt__StringsJVMKt.endsWith$default(imageName, FileFormats.SVG_FORMAT, false, 2, null)) {
            return null;
        }
        if (f != 0.0f) {
            return getSvgBitmapFromZipWithSize(context, imageName, imageType, f, f2);
        }
        return getSvgBitmapFromZip(context, imageName, imageType);
    }

    @NotNull
    public static final Map<String, Bitmap> getBitmapMapFromZip(@AppContext @NotNull Context context, @NotNull List<String> imgNameList, @NotNull ImageTypePathInCDNEnum imageType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imgNameList, "imgNameList");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        List<String> list = imgNameList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, getBitmapFromZip$default(context, (String) obj, imageType, 0.0f, 0.0f, 24, null));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Bitmap decodeBitmapFromZip$default(String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return decodeBitmapFromZip(str, str2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap decodeBitmapFromZip(String str, String str2, int i) {
        Bitmap bitmapDecodeStream;
        ZipFile zipFile = new ZipFile(str);
        try {
            ZipEntry entry = zipFile.getEntry(str2);
            if (entry != null) {
                Intrinsics.checkNotNull(entry);
                String name = entry.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt__StringsJVMKt.endsWith$default(name, ".png", false, 2, null)) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        CloseableKt.closeFinally(inputStream, null);
                    } finally {
                    }
                } else {
                    bitmapDecodeStream = null;
                }
            }
            CloseableKt.closeFinally(zipFile, null);
            return bitmapDecodeStream;
        } finally {
        }
    }

    public static final void saveBitmapToDisk(Context context, Bitmap bitmap, String str) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getCacheDir(), str));
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            UtilsKt.crashlyticsRecordNewException("Failed to saveBitmapToDisk() key: " + str + " throw: " + e);
        }
    }

    public static final Bitmap getBitmapFromDisk(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), str);
            if (file.exists()) {
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            return null;
        } catch (IOException e) {
            UtilsKt.crashlyticsRecordNewException("Failed to getBitmapFromDisk() key: " + str + " throw: " + e);
            return null;
        }
    }
}

