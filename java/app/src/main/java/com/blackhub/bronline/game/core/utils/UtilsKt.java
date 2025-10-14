package com.blackhub.bronline.game.core.utils;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.DragEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.BaseModel;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.RenderAttachment;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.PointViewListenerEnum;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataDragView;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.core.utils.draganddrop.model.PointFloat;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.blackhub.bronline.launcher.Settings;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p051io.ByteStreamsKt;
import kotlin.p051io.CloseableKt;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/blackhub/bronline/game/core/utils/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,505:1\n288#2,2:506\n1#3:508\n179#4,2:509\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/blackhub/bronline/game/core/utils/UtilsKt\n*L\n215#1:506,2\n340#1:509,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointViewListenerEnum.values().length];
            try {
                iArr[PointViewListenerEnum.TOP_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isFlavorWithLogo() {
        return true;
    }

    public static final boolean isMarketBuildVariant() {
        return false;
    }

    public static final boolean isNotPublicBuildType() {
        return false;
    }

    public static final boolean isRustoreBuildVariant() {
        return false;
    }

    @NotNull
    public static final CharSequence transformSpannableToUpperCase(@NotNull CharSequence source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String upperCase = source.toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        SpannableString spannableString = new SpannableString(upperCase);
        TextUtils.copySpansFrom((Spanned) source, 0, source.length(), null, spannableString, 0);
        return spannableString;
    }

    public static final float setVerticalRandomBias(@NotNull ConstraintLayout constraintLayout, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(constraintLayout, "constraintLayout");
        float fRandom = RangesKt___RangesKt.random(new IntRange(i2, i3), Random.INSTANCE) / 10.0f;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.setVerticalBias(i, 1.0f - fRandom);
        constraintSet.applyTo(constraintLayout);
        return fRandom;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    @NotNull
    public static final ObjectAnimator animateProgressBarUp(@NotNull final ProgressBar progressBar, long j) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "animateProgressBar", progressBar.getProgress(), progressBar.getProgress() + 10);
        objectAnimatorOfInt.setDuration(j);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.core.utils.UtilsKt$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UtilsKt.animateProgressBarUp$lambda$1$lambda$0(progressBar, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfInt, "apply(...)");
        return objectAnimatorOfInt;
    }

    public static final void animateProgressBarUp$lambda$1$lambda$0(ProgressBar progressBar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(progressBar, "$progressBar");
        Intrinsics.checkNotNullParameter(it, "it");
        progressBar.setProgress(Integer.parseInt(it.getAnimatedValue().toString()));
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    @NotNull
    public static final ObjectAnimator animateProgressBarDown(@NotNull final ProgressBar progressBar, long j) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "animateProgressBar", progressBar.getProgress(), 0);
        objectAnimatorOfInt.setDuration((progressBar.getProgress() / 10) * j);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.blackhub.bronline.game.core.utils.UtilsKt$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UtilsKt.animateProgressBarDown$lambda$3$lambda$2(progressBar, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfInt, "apply(...)");
        return objectAnimatorOfInt;
    }

    public static final void animateProgressBarDown$lambda$3$lambda$2(ProgressBar progressBar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(progressBar, "$progressBar");
        Intrinsics.checkNotNullParameter(it, "it");
        progressBar.setProgress(Integer.parseInt(it.getAnimatedValue().toString()));
    }

    public static final void crashlyticsLog(@NotNull String logString) {
        Intrinsics.checkNotNullParameter(logString, "logString");
        if (isNotPublicBuildType()) {
            Log.d(LogTagConstants.CRASHLYTICS_LOG_TAG, logString);
        }
        FirebaseCrashlytics.getInstance().log("site-release: " + logString);
    }

    public static /* synthetic */ void crashlyticsLog$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = LogTagConstants.CRASHLYTICS_LOG_TAG;
        }
        crashlyticsLog(str, str2);
    }

    public static final void crashlyticsLog(@NotNull String logString, @NotNull String defaultTag) {
        Intrinsics.checkNotNullParameter(logString, "logString");
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        if (isNotPublicBuildType()) {
            Log.d(defaultTag, logString);
        }
        FirebaseCrashlytics.getInstance().log("site-release: " + logString);
    }

    public static final void crashlyticsException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FirebaseCrashlytics.getInstance().recordException(throwable);
    }

    public static final void crashlyticsRecordNewException(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        if (isNotPublicBuildType()) {
            Log.e(LogTagConstants.RECORD_NEW_EXCEPTION_TAG, "message exception: " + message);
        }
        firebaseCrashlytics.log(message);
        firebaseCrashlytics.recordException(new Throwable());
    }

    public static /* synthetic */ void crashlyticsRecordNewException$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = LogTagConstants.RECORD_NEW_EXCEPTION_TAG;
        }
        crashlyticsRecordNewException(str, str2);
    }

    public static final void crashlyticsRecordNewException(@NotNull String message, @NotNull String logTag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        if (isNotPublicBuildType()) {
            Log.e(logTag, "message exception: " + message);
        }
        firebaseCrashlytics.log(message);
        firebaseCrashlytics.recordException(new Throwable());
    }

    public static final int getHeightScreenPx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static /* synthetic */ DragAndDropCallback checkIfDraggableItemIsOnTargetArea$default(DragEvent dragEvent, DataDragView dataDragView, List list, Float f, int i, Object obj) {
        if ((i & 8) != 0) {
            f = null;
        }
        return checkIfDraggableItemIsOnTargetArea(dragEvent, dataDragView, list, f);
    }

    @NotNull
    public static final DragAndDropCallback checkIfDraggableItemIsOnTargetArea(@NotNull DragEvent dragEvent, @NotNull DataDragView dataDragView, @NotNull List<DataTargetArea> dataTargetAreaList, @Nullable Float f) {
        Object next;
        Intrinsics.checkNotNullParameter(dragEvent, "dragEvent");
        Intrinsics.checkNotNullParameter(dataDragView, "dataDragView");
        Intrinsics.checkNotNullParameter(dataTargetAreaList, "dataTargetAreaList");
        PointFloat pointWithOptions = getPointWithOptions(dataDragView.getDraggableView().getRotation(), (dataDragView.getDraggableView().getHeight() * dataDragView.getDataDragAndDrop().getNewScale()) / 2, dataDragView.getPointListener(), dragEvent.getX(), dragEvent.getY());
        Iterator<T> it = dataTargetAreaList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DataTargetArea dataTargetArea = (DataTargetArea) next;
            if (dataTargetArea.getDataDragViewList().contains(dataDragView)) {
                PointFloat pointCenter = dataTargetArea.getPointCenter();
                float fFloatValue = f != null ? f.floatValue() : dataTargetArea.getCenterError();
                float x = pointCenter.getX() - fFloatValue;
                float x2 = pointCenter.getX() + fFloatValue;
                float x3 = pointWithOptions.getX();
                if (x <= x3 && x3 <= x2) {
                    float y = pointCenter.getY() - fFloatValue;
                    float y2 = pointCenter.getY() + fFloatValue;
                    float y3 = pointWithOptions.getY();
                    if (y <= y3 && y3 <= y2) {
                        break;
                    }
                }
            }
        }
        DataTargetArea dataTargetArea2 = (DataTargetArea) next;
        return new DragAndDropCallback(dataDragView.getCurrentDraggableItem(), dataTargetArea2 != null ? dataDragView.getDataDragAndDrop() : null, dataTargetArea2, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0097  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PointFloat getPointWithOptions(float f, float f2, @Nullable PointViewListenerEnum pointViewListenerEnum, float f3, float f4) {
        float f5;
        double dAbs;
        float fAbs = f3;
        double d = f;
        double radians = Math.toRadians((-90) + d);
        if ((pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()]) == 1) {
            if (0.0d <= d && d <= 180.0d) {
                fAbs = (float) (fAbs + (Math.abs(Math.cos(radians)) * f2));
            } else {
                fAbs = (float) (fAbs - (Math.abs(Math.cos(radians)) * f2));
            }
        }
        if ((pointViewListenerEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pointViewListenerEnum.ordinal()]) == 1) {
            if (0.0d <= d && d <= 90.0d) {
                dAbs = f4 - (Math.abs(Math.sin(radians)) * f2);
                f5 = (float) dAbs;
            } else {
                if (!(270.0d <= d && d <= 360.0d)) {
                    dAbs = f4 + (Math.abs(Math.sin(radians)) * f2);
                }
                f5 = (float) dAbs;
            }
        } else {
            f5 = f4;
        }
        return new PointFloat(fAbs, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] getClipboardStringUtils() {
        String string;
        CharSequence text;
        Object systemService = JNIActivity.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager.getPrimaryClip() != null) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            Intrinsics.checkNotNull(primaryClip);
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt != null && (text = itemAt.getText()) != null) {
                string = text.toString();
            } else {
                string = "nullstr";
            }
        }
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = string.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            crashlyticsRecordNewException(message);
            return null;
        }
    }

    @Nullable
    public static final Activity scanForActivity(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Nullable
    public static final <T> T buildTypeMerge(@Nullable T t, @Nullable T t2) {
        AnyExtensionKt.isNull(t2);
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0017  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getCurrentCDNUrl(@Nullable Integer num, @Nullable String str) {
        if (num != null && 1132 == num.intValue()) {
            if (str == null) {
                str = Settings.CURRENT_CDN_URL;
            } else {
                if (str.length() == 0) {
                    str = Settings.CURRENT_CDN_URL;
                }
                if (str == null) {
                }
            }
            Intrinsics.checkNotNull(str);
            return str;
        }
        String CURRENT_CDN_URL = Settings.CURRENT_CDN_URL;
        Intrinsics.checkNotNullExpressionValue(CURRENT_CDN_URL, "CURRENT_CDN_URL");
        return CURRENT_CDN_URL;
    }

    @Nullable
    public static final String getTestServerPort(@Nullable Integer num, @Nullable String str) {
        if (num != null && 1132 == num.intValue()) {
            return str;
        }
        return null;
    }

    public static final boolean isAddBasicAuth() {
        return !Intrinsics.areEqual(Settings.CURRENT_CDN_URL, "https://dl.blackcdn.me/");
    }

    public static /* synthetic */ String getIPAddress$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getIPAddress(z);
    }

    /* compiled from: Utils.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "it", "Ljava/net/NetworkInterface;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.utils.UtilsKt$getIPAddress$1 */
    
    public static final class C35471 extends Lambda implements Function1<NetworkInterface, Sequence<? extends InetAddress>> {
        public static final C35471 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Sequence<InetAddress> invoke(NetworkInterface networkInterface) {
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            Intrinsics.checkNotNullExpressionValue(inetAddresses, "getInetAddresses(...)");
            return SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(inetAddresses));
        }
    }

    @NotNull
    public static final String getIPAddress(boolean z) throws SocketException {
        String str;
        Object next;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
            Iterator it = SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filterNot(SequencesKt___SequencesKt.flatMap(SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(networkInterfaces)), C35471.INSTANCE), C35482.INSTANCE), C35493.INSTANCE).iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                boolean z2 = false;
                boolean z3 = !StringsKt__StringsKt.contains$default((CharSequence) next, ':', false, 2, (Object) null);
                if (z) {
                    z2 = z3;
                } else if (!z3) {
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                if (z) {
                    str = str2;
                } else {
                    String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(str2, '%', (String) null, 2, (Object) null);
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = strSubstringBefore$default.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    str = upperCase;
                }
            }
            return str == null ? "" : str;
        } catch (Exception e) {
            crashlyticsRecordNewException("getIPAddress exception: " + e);
            return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
    }

    /* compiled from: Utils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/net/InetAddress;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.utils.UtilsKt$getIPAddress$2 */
    
    public static final class C35482 extends Lambda implements Function1<InetAddress, Boolean> {
        public static final C35482 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(InetAddress inetAddress) {
            return Boolean.valueOf(inetAddress.isLoopbackAddress());
        }
    }

    /* compiled from: Utils.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.utils.UtilsKt$getIPAddress$3 */
    
    public static final class C35493 extends Lambda implements Function1<InetAddress, String> {
        public static final C35493 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final String invoke(InetAddress inetAddress) {
            return inetAddress.getHostAddress();
        }
    }

    @Nullable
    public static final File getVideoFromZip(@NotNull String fileName, @NotNull Context context) {
        File fileCreateTempFile;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        File externalFilesDir = context.getExternalFilesDir(null);
        try {
            ZipFile zipFile = new ZipFile((externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + "/resources/video/video.zip");
            try {
                ZipEntry entry = zipFile.getEntry(fileName);
                if (entry != null) {
                    Intrinsics.checkNotNull(entry);
                    InputStream inputStream = zipFile.getInputStream(entry);
                    fileCreateTempFile = File.createTempFile("video_" + fileName, ".mp4", context.getCacheDir());
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    Intrinsics.checkNotNull(inputStream);
                    ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                    inputStream.close();
                    fileOutputStream.close();
                } else {
                    fileCreateTempFile = null;
                }
                CloseableKt.closeFinally(zipFile, null);
                return fileCreateTempFile;
            } finally {
            }
        } catch (Exception e) {
            crashlyticsRecordNewException("Failed to get video from zip: " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0157  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ImageModel setImageModel(@NotNull BaseModel baseModel, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Object next;
        List<String> imageList;
        ImageTypePathInCDNEnum imageTypePathInCDNEnum;
        Object next2;
        List<String> imageList2;
        Object next3;
        String imageName;
        Object next4;
        String imageName2;
        String name;
        Intrinsics.checkNotNullParameter(baseModel, "baseModel");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        int typeId = baseModel.getTypeId();
        String str = null;
        str = null;
        String str2 = null;
        str = null;
        if (typeId != 20 && typeId != 21) {
            switch (typeId) {
                case 1:
                case 2:
                case 3:
                case 6:
                    break;
                case 4:
                    if (baseModel.getTypeId() == 4) {
                        imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
                    } else {
                        imageTypePathInCDNEnum = ImageTypePathInCDNEnum.ICON;
                    }
                    ImageTypePathInCDNEnum imageTypePathInCDNEnum2 = imageTypePathInCDNEnum;
                    Iterator<T> it = listOfAwardsTypes.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = it.next();
                            if (((BpRewardsAwardsDto) next2).getId() == baseModel.getTypeId()) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next2;
                    if (bpRewardsAwardsDto != null && (imageList2 = bpRewardsAwardsDto.getImageList()) != null) {
                        str2 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList2, IntExtensionKt.getOrOne(Integer.valueOf(baseModel.getAwardId())) - 1);
                    }
                    String str3 = str2 == null ? "" : str2;
                    int orZero = IntExtensionKt.getOrZero(Integer.valueOf(baseModel.getObjectId()));
                    String str4 = (String) buildTypeMerge(baseModel.getObjectName(), baseModel.getObjectStoreName());
                    return new ImageModel(orZero, null, str3, str4 == null ? "" : str4, imageTypePathInCDNEnum2, 2, null);
                case 5:
                    Iterator<T> it2 = vehiclesList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                            Integer modelId = ((VehiclesDTO) next3).getModelId();
                            int awardId = baseModel.getAwardId();
                            if (modelId != null && modelId.intValue() == awardId) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    VehiclesDTO vehiclesDTO = (VehiclesDTO) next3;
                    int orZero2 = IntExtensionKt.getOrZero(Integer.valueOf(baseModel.getObjectId()));
                    if (vehiclesDTO == null || (imageName = vehiclesDTO.getImageName()) == null) {
                        imageName = baseModel.getImageName();
                    }
                    String str5 = imageName;
                    String str6 = (String) buildTypeMerge(vehiclesDTO != null ? vehiclesDTO.getName() : null, vehiclesDTO != null ? vehiclesDTO.getNameStore() : null);
                    return new ImageModel(orZero2, null, str5, str6 == null ? "" : str6, ImageTypePathInCDNEnum.VEHICLE, 2, null);
                default:
                    switch (typeId) {
                        case 8:
                        case 10:
                            break;
                        case 9:
                            break;
                        case 11:
                            Iterator<T> it3 = skinsList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next4 = it3.next();
                                    Integer modelId2 = ((SkinsDTO) next4).getModelId();
                                    int awardId2 = baseModel.getAwardId();
                                    if (modelId2 != null && modelId2.intValue() == awardId2) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            SkinsDTO skinsDTO = (SkinsDTO) next4;
                            if (skinsDTO == null || (imageName2 = skinsDTO.getImageName()) == null) {
                                imageName2 = baseModel.getImageName();
                            }
                            String str7 = imageName2;
                            return new ImageModel(IntExtensionKt.getOrZero(Integer.valueOf(baseModel.getObjectId())), str7.length() <= 0 ? new RenderAttachment(0, IntExtensionKt.getOrZero(Integer.valueOf(baseModel.getObjectId())), IntExtensionKt.getOrZero(Integer.valueOf(baseModel.getAwardId())), 3, 0.9f, 20.0f, 180.0f, 45.0f) : null, str7, ((skinsDTO == null || (name = skinsDTO.getName()) == null) && (name = (String) buildTypeMerge(baseModel.getObjectName(), baseModel.getObjectStoreName())) == null) ? "" : name, AnyExtensionKt.isNotNull(skinsDTO) ? ImageTypePathInCDNEnum.SKIN : ImageTypePathInCDNEnum.ACCESSORY);
                        default:
                            return new ImageModel(0, null, null, null, null, 31, null);
                    }
            }
        }
        Iterator<T> it4 = listOfAwardsTypes.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                if (((BpRewardsAwardsDto) next).getId() == baseModel.getTypeId()) {
                }
            } else {
                next = null;
            }
        }
        BpRewardsAwardsDto bpRewardsAwardsDto2 = (BpRewardsAwardsDto) next;
        if (bpRewardsAwardsDto2 != null && (imageList = bpRewardsAwardsDto2.getImageList()) != null) {
            str = (String) CollectionsKt___CollectionsKt.getOrNull(imageList, 0);
        }
        String str8 = str == null ? "" : str;
        int orZero3 = IntExtensionKt.getOrZero(Integer.valueOf(baseModel.getObjectId()));
        String str9 = (String) buildTypeMerge(baseModel.getObjectName(), baseModel.getObjectStoreName());
        return new ImageModel(orZero3, null, str8, str9 == null ? "" : str9, ImageTypePathInCDNEnum.ICON, 2, null);
    }

    @NotNull
    public static final String getNetworkCountry(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
        return networkCountryIso;
    }

    public static final boolean isRuRegion() {
        return Settings.IS_RU_REGION;
    }
}

