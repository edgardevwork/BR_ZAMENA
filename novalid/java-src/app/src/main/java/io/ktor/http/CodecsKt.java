package io.ktor.http;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.common.base.Ascii;
import io.ktor.util.date.GMTDateParser;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import io.ktor.utils.p050io.charsets.EncodingKt;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.jetbrains.annotations.NotNull;

/* compiled from: Codecs.kt */
@Metadata(m7104d1 = {"\u0000R\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0002\u001a8\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cH\u0002\u001a0\u0010\u001d\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cH\u0002\u001a,\u0010\u001e\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\f\b\u0002\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c\u001a6\u0010\u001f\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\f\b\u0002\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c\u001a\n\u0010 \u001a\u00020\u0013*\u00020\u0013\u001a\u0014\u0010!\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\u0019\u001a\f\u0010#\u001a\u00020\u0013*\u00020\u0013H\u0000\u001a\n\u0010$\u001a\u00020\u0013*\u00020\u0013\u001a\u0014\u0010$\u001a\u00020\u0013*\u00020\u00132\u0006\u0010%\u001a\u00020\u0019H\u0000\u001a\n\u0010&\u001a\u00020\u0013*\u00020\u0013\u001a,\u0010'\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u00192\f\b\u0002\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c\u001a \u0010)\u001a\u00020**\u00020+2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020*0-H\u0002\u001a\f\u0010.\u001a\u00020\u0013*\u00020\bH\u0002\u001a\u001a\u0010.\u001a\u00020\u0013*\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m7105d2 = {"ATTRIBUTE_CHARACTERS", "", "", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "HEX_ALPHABET", "SPECIAL_SYMBOLS", "", "", "URL_ALPHABET", "URL_ALPHABET_CHARS", "URL_PROTOCOL_PART", "VALID_PATH_PART", "charToHexDigit", "", "c2", "hexDigitToChar", "digit", "decodeImpl", "", "", TtmlNode.START, "end", "prefixEnd", "plusIsSpace", "", "charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "decodeScan", "decodeURLPart", "decodeURLQueryComponent", "encodeOAuth", "encodeURLParameter", "spaceToPlus", "encodeURLParameterValue", "encodeURLPath", "encodeSlash", "encodeURLPathPart", "encodeURLQueryComponent", "encodeFull", "forEach", "", "Lio/ktor/utils/io/core/ByteReadPacket;", "block", "Lkotlin/Function1;", "percentEncode", "allowedSet", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCodecs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Codecs.kt\nio/ktor/http/CodecsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 Strings.kt\nio/ktor/utils/io/core/StringsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 StringsJVM.kt\nio/ktor/utils/io/core/StringsJVMKt\n+ 6 Input.kt\nio/ktor/utils/io/core/InputKt\n+ 7 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,296:1\n1099#2,3:297\n8#3,3:300\n13586#4,2:303\n11#5:305\n823#6,6:306\n829#6,13:313\n355#7:312\n1549#8:326\n1620#8,3:327\n1549#8:330\n1620#8,3:331\n1549#8:334\n1620#8,3:335\n*S KotlinDebug\n*F\n+ 1 Codecs.kt\nio/ktor/http/CodecsKt\n*L\n130#1:297,3\n133#1:300,3\n141#1:303,2\n250#1:305\n289#1:306,6\n289#1:313,13\n290#1:312\n9#1:326\n9#1:327,3\n20#1:330\n20#1:331,3\n42#1:334\n42#1:335,3\n*E\n"})
/* loaded from: classes5.dex */
public final class CodecsKt {

    @NotNull
    public static final Set<Character> ATTRIBUTE_CHARACTERS;

    @NotNull
    public static final Set<Character> HEX_ALPHABET;

    @NotNull
    public static final List<Byte> SPECIAL_SYMBOLS;

    @NotNull
    public static final Set<Byte> URL_ALPHABET;

    @NotNull
    public static final Set<Character> URL_ALPHABET_CHARS;

    @NotNull
    public static final List<Byte> URL_PROTOCOL_PART;

    @NotNull
    public static final Set<Character> VALID_PATH_PART;

    public static final int charToHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    public static final char hexDigitToChar(int i) {
        return (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48);
    }

    static {
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Iterable) new CharRange('a', GMTDateParser.ZONE), (Iterable) new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9'));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        URL_ALPHABET = CollectionsKt___CollectionsKt.toSet(arrayList);
        URL_ALPHABET_CHARS = CollectionsKt___CollectionsKt.toSet(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Iterable) new CharRange('a', GMTDateParser.ZONE), (Iterable) new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9')));
        HEX_ALPHABET = CollectionsKt___CollectionsKt.toSet(CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Iterable) new CharRange('a', 'f'), (Iterable) new CharRange('A', 'F')), (Iterable) new CharRange('0', '9')));
        Set of = SetsKt__SetsKt.setOf((Object[]) new Character[]{':', '/', '?', '#', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), Character.valueOf(ObjectUtils.AT_SIGN), Character.valueOf(PublicSuffixDatabase.EXCEPTION_MARKER), '$', '&', Character.valueOf(ExtendedMessageFormat.QUOTE), '(', ')', Character.valueOf(GMTDateParser.ANY), ',', ';', '=', '-', '.', Character.valueOf(LauncherConstants.UNDERSCORE_CHAR), '~', '+'});
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10));
        Iterator it2 = of.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = SetsKt__SetsKt.setOf((Object[]) new Character[]{':', Character.valueOf(ObjectUtils.AT_SIGN), Character.valueOf(PublicSuffixDatabase.EXCEPTION_MARKER), '$', '&', Character.valueOf(ExtendedMessageFormat.QUOTE), '(', ')', Character.valueOf(GMTDateParser.ANY), '+', ',', ';', '=', '-', '.', Character.valueOf(LauncherConstants.UNDERSCORE_CHAR), '~'});
        ATTRIBUTE_CHARACTERS = SetsKt___SetsKt.plus((Set) URL_ALPHABET_CHARS, (Iterable) SetsKt__SetsKt.setOf((Object[]) new Character[]{Character.valueOf(PublicSuffixDatabase.EXCEPTION_MARKER), '#', '$', '&', '+', '-', '.', '^', Character.valueOf(LauncherConstants.UNDERSCORE_CHAR), '`', '|', '~'}));
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'-', '.', Character.valueOf(LauncherConstants.UNDERSCORE_CHAR), '~'});
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it3 = listListOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        SPECIAL_SYMBOLS = arrayList3;
    }

    @NotNull
    public static final Set<Character> getATTRIBUTE_CHARACTERS() {
        return ATTRIBUTE_CHARACTERS;
    }

    public static /* synthetic */ String encodeURLQueryComponent$default(String str, boolean z, boolean z2, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return encodeURLQueryComponent(str, z, z2, charset);
    }

    @NotNull
    public static final String encodeURLQueryComponent(@NotNull String str, final boolean z, final boolean z2, @NotNull Charset charset) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new Function1<Byte, Unit>() { // from class: io.ktor.http.CodecsKt$encodeURLQueryComponent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                invoke(b.byteValue());
                return Unit.INSTANCE;
            }

            public final void invoke(byte b) {
                if (b != 32) {
                    if (!CodecsKt.URL_ALPHABET.contains(Byte.valueOf(b)) && (z || !CodecsKt.URL_PROTOCOL_PART.contains(Byte.valueOf(b)))) {
                        sb.append(CodecsKt.percentEncode(b));
                        return;
                    } else {
                        sb.append((char) b);
                        return;
                    }
                }
                if (z2) {
                    sb.append('+');
                } else {
                    sb.append("%20");
                }
            }
        });
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public static final String encodeURLPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLPath(str, false);
    }

    @NotNull
    public static final String encodeURLPathPart(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLPath(str, true);
    }

    @NotNull
    public static final String encodeURLPath(@NotNull String str, boolean z) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb = new StringBuilder();
        Charset charset = Charsets.UTF_8;
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if ((!z && cCharAt == '/') || URL_ALPHABET_CHARS.contains(Character.valueOf(cCharAt)) || VALID_PATH_PART.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i2++;
            } else {
                if (cCharAt == '%' && (i = i2 + 2) < str.length()) {
                    Set<Character> set = HEX_ALPHABET;
                    int i3 = i2 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i3))) && set.contains(Character.valueOf(str.charAt(i)))) {
                        sb.append(cCharAt);
                        sb.append(str.charAt(i3));
                        sb.append(str.charAt(i));
                        i2 += 3;
                    }
                }
                int i4 = CharsKt__CharKt.isSurrogate(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
                int i5 = i4 + i2;
                forEach(EncodingKt.encode(charsetEncoderNewEncoder, str, i2, i5), new Function1<Byte, Unit>() { // from class: io.ktor.http.CodecsKt$encodeURLPath$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                        invoke(b.byteValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(byte b) {
                        sb.append(CodecsKt.percentEncode(b));
                    }
                });
                i2 = i5;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public static final String encodeOAuth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static /* synthetic */ String encodeURLParameter$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return encodeURLParameter(str, z);
    }

    @NotNull
    public static final String encodeURLParameter(@NotNull String str, final boolean z) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new Function1<Byte, Unit>() { // from class: io.ktor.http.CodecsKt$encodeURLParameter$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                invoke(b.byteValue());
                return Unit.INSTANCE;
            }

            public final void invoke(byte b) {
                if (CodecsKt.URL_ALPHABET.contains(Byte.valueOf(b)) || CodecsKt.SPECIAL_SYMBOLS.contains(Byte.valueOf(b))) {
                    sb.append((char) b);
                } else if (z && b == 32) {
                    sb.append('+');
                } else {
                    sb.append(CodecsKt.percentEncode(b));
                }
            }
        });
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public static final String encodeURLParameterValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLParameter(str, true);
    }

    public static /* synthetic */ String decodeURLQueryComponent$default(String str, int i, int i2, boolean z, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        return decodeURLQueryComponent(str, i, i2, z, charset);
    }

    @NotNull
    public static final String decodeURLQueryComponent(@NotNull String str, int i, int i2, boolean z, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i, i2, z, charset);
    }

    public static /* synthetic */ String decodeURLPart$default(String str, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return decodeURLPart(str, i, i2, charset);
    }

    @NotNull
    public static final String decodeURLPart(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i, i2, false, charset);
    }

    public static final String decodeScan(String str, int i, int i2, boolean z, Charset charset) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                return decodeImpl(str, i, i2, i3, z, charset);
            }
        }
        if (i == 0 && i2 == str.length()) {
            return str;
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String decodeImpl(CharSequence charSequence, int i, int i2, int i3, boolean z, Charset charset) throws URLDecodeException {
        int i4 = i2 - i;
        if (i4 > 255) {
            i4 /= 3;
        }
        StringBuilder sb = new StringBuilder(i4);
        if (i3 > i) {
            sb.append(charSequence, i, i3);
        }
        byte[] bArr = null;
        while (i3 < i2) {
            char cCharAt = charSequence.charAt(i3);
            if (z && cCharAt == '+') {
                sb.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i2 - i3) / 3];
                }
                int i5 = 0;
                while (i3 < i2 && charSequence.charAt(i3) == '%') {
                    int i6 = i3 + 2;
                    if (i6 >= i2) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i3, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i3);
                    }
                    int i7 = i3 + 1;
                    int iCharToHexDigit = charToHexDigit(charSequence.charAt(i7));
                    int iCharToHexDigit2 = charToHexDigit(charSequence.charAt(i6));
                    if (iCharToHexDigit == -1 || iCharToHexDigit2 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i7) + charSequence.charAt(i6) + ", in " + ((Object) charSequence) + ", at " + i3);
                    }
                    bArr[i5] = (byte) ((iCharToHexDigit * 16) + iCharToHexDigit2);
                    i3 += 3;
                    i5++;
                }
                sb.append(new String(bArr, 0, i5, charset));
            } else {
                sb.append(cCharAt);
            }
            i3++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public static final String percentEncode(byte b) {
        return StringsKt__StringsJVMKt.concatToString(new char[]{'%', hexDigitToChar((b & 255) >> 4), hexDigitToChar(b & Ascii.f786SI)});
    }

    @NotNull
    public static final String percentEncode(@NotNull String str, @NotNull Set<Character> allowedSet) {
        byte[] bArrEncodeToByteArray;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(allowedSet, "allowedSet");
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!allowedSet.contains(Character.valueOf(str.charAt(i2)))) {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            bArrEncodeToByteArray = StringsKt__StringsJVMKt.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        int length = str.length() - i;
        char[] cArr = new char[length + ((bArrEncodeToByteArray.length - length) * 3)];
        int i3 = 0;
        for (byte b : bArrEncodeToByteArray) {
            char c = (char) b;
            if (allowedSet.contains(Character.valueOf(c))) {
                cArr[i3] = c;
                i3++;
            } else {
                cArr[i3] = '%';
                int i4 = i3 + 2;
                cArr[i3 + 1] = hexDigitToChar((b & 255) >> 4);
                i3 += 3;
                cArr[i4] = hexDigitToChar(b & Ascii.f786SI);
            }
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    public static final void forEach(ByteReadPacket byteReadPacket, Function1<? super Byte, Unit> function1) throws Throwable {
        boolean z = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(byteReadPacket, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                if (chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                    function1.invoke(Byte.valueOf(chunkBufferPrepareReadFirstHead.readByte()));
                } else {
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(byteReadPacket, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (z) {
                            UnsafeKt.completeReadHead(byteReadPacket, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
