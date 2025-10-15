package com.airbnb.lottie.compose;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LottieCompositionSpec.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface LottieCompositionSpec {

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "constructor-impl", "(I)I", "getResId", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class RawRes implements LottieCompositionSpec {
        public final int resId;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RawRes m14337boximpl(int i) {
            return new RawRes(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m14338constructorimpl(@androidx.annotation.RawRes int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m14339equalsimpl(int i, Object obj) {
            return (obj instanceof RawRes) && i == ((RawRes) obj).m14343unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m14340equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14341hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m14342toStringimpl(int i) {
            return "RawRes(resId=" + i + ")";
        }

        public boolean equals(Object obj) {
            return m14339equalsimpl(this.resId, obj);
        }

        public int hashCode() {
            return m14341hashCodeimpl(this.resId);
        }

        public String toString() {
            return m14342toStringimpl(this.resId);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m14343unboximpl() {
            return this.resId;
        }

        public /* synthetic */ RawRes(@androidx.annotation.RawRes int i) {
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "url", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class Url implements LottieCompositionSpec {

        @NotNull
        public final String url;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Url m14344boximpl(String str) {
            return new Url(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m14345constructorimpl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m14346equalsimpl(String str, Object obj) {
            return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m14350unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m14347equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14348hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m14349toStringimpl(String str) {
            return "Url(url=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m14346equalsimpl(this.url, obj);
        }

        public int hashCode() {
            return m14348hashCodeimpl(this.url);
        }

        public String toString() {
            return m14349toStringimpl(this.url);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m14350unboximpl() {
            return this.url;
        }

        public /* synthetic */ Url(String str) {
            this.url = str;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "fileName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class File implements LottieCompositionSpec {

        @NotNull
        public final String fileName;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ File m14323boximpl(String str) {
            return new File(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m14324constructorimpl(@NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return fileName;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m14325equalsimpl(String str, Object obj) {
            return (obj instanceof File) && Intrinsics.areEqual(str, ((File) obj).m14329unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m14326equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14327hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m14328toStringimpl(String str) {
            return "File(fileName=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m14325equalsimpl(this.fileName, obj);
        }

        public int hashCode() {
            return m14327hashCodeimpl(this.fileName);
        }

        public String toString() {
            return m14328toStringimpl(this.fileName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m14329unboximpl() {
            return this.fileName;
        }

        public /* synthetic */ File(String str) {
            this.fileName = str;
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class Asset implements LottieCompositionSpec {

        @NotNull
        public final String assetName;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Asset m14309boximpl(String str) {
            return new Asset(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m14310constructorimpl(@NotNull String assetName) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            return assetName;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m14311equalsimpl(String str, Object obj) {
            return (obj instanceof Asset) && Intrinsics.areEqual(str, ((Asset) obj).m14315unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m14312equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14313hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m14314toStringimpl(String str) {
            return "Asset(assetName=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m14311equalsimpl(this.assetName, obj);
        }

        public int hashCode() {
            return m14313hashCodeimpl(this.assetName);
        }

        public String toString() {
            return m14314toStringimpl(this.assetName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m14315unboximpl() {
            return this.assetName;
        }

        public /* synthetic */ Asset(String str) {
            this.assetName = str;
        }

        @NotNull
        public final String getAssetName() {
            return this.assetName;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class JsonString implements LottieCompositionSpec {

        @NotNull
        public final String jsonString;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ JsonString m14330boximpl(String str) {
            return new JsonString(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m14331constructorimpl(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            return jsonString;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m14332equalsimpl(String str, Object obj) {
            return (obj instanceof JsonString) && Intrinsics.areEqual(str, ((JsonString) obj).m14336unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m14333equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14334hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m14335toStringimpl(String str) {
            return "JsonString(jsonString=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m14332equalsimpl(this.jsonString, obj);
        }

        public int hashCode() {
            return m14334hashCodeimpl(this.jsonString);
        }

        public String toString() {
            return m14335toStringimpl(this.jsonString);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m14336unboximpl() {
            return this.jsonString;
        }

        public /* synthetic */ JsonString(String str) {
            this.jsonString = str;
        }

        @NotNull
        public final String getJsonString() {
            return this.jsonString;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "equals", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/net/Uri;)I", "toString", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class ContentProvider implements LottieCompositionSpec {

        @NotNull
        public final Uri uri;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ContentProvider m14316boximpl(Uri uri) {
            return new ContentProvider(uri);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Uri m14317constructorimpl(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return uri;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m14318equalsimpl(Uri uri, Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.areEqual(uri, ((ContentProvider) obj).m14322unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m14319equalsimpl0(Uri uri, Uri uri2) {
            return Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14320hashCodeimpl(Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m14321toStringimpl(Uri uri) {
            return "ContentProvider(uri=" + uri + ")";
        }

        public boolean equals(Object obj) {
            return m14318equalsimpl(this.uri, obj);
        }

        public int hashCode() {
            return m14320hashCodeimpl(this.uri);
        }

        public String toString() {
            return m14321toStringimpl(this.uri);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Uri m14322unboximpl() {
            return this.uri;
        }

        public /* synthetic */ ContentProvider(Uri uri) {
            this.uri = uri;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }
    }
}
