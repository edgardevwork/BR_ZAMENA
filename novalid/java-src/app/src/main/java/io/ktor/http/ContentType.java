package io.ktor.http;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.common.net.MediaType;
import io.ktor.http.HeaderValueWithParameters;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.http.HttpHost;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentTypes.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001d2\u00020\u0001:\t\u001b\u001c\u001d\u001e\u001f !\"#B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bB/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0003J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006$"}, m7105d2 = {"Lio/ktor/http/ContentType;", "Lio/ktor/http/HeaderValueWithParameters;", "contentType", "", "contentSubtype", "parameters", "", "Lio/ktor/http/HeaderValueParam;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "existingContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContentSubtype", "()Ljava/lang/String;", "getContentType", "equals", "", "other", "", "hasParameter", "name", "value", "hashCode", "", FeatureParser.ImportHandler.MATCH, "pattern", "withParameter", "withoutParameters", "Application", "Audio", "Companion", "Font", "Image", "Message", "MultiPart", "Text", "Video", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContentTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1#2:319\n1747#3,3:320\n1747#3,3:323\n*S KotlinDebug\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType\n*L\n44#1:320,3\n72#1:323,3\n*E\n"})
/* loaded from: classes7.dex */
public final class ContentType extends HeaderValueWithParameters {

    @NotNull
    public final String contentSubtype;

    @NotNull
    public final String contentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ContentType Any = new ContentType("*", "*", null, 4, null);

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getContentSubtype() {
        return this.contentSubtype;
    }

    public /* synthetic */ ContentType(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    public ContentType(String str, String str2, String str3, List<HeaderValueParam> list) {
        super(str3, list);
        this.contentType = str;
        this.contentSubtype = str2;
    }

    public /* synthetic */ ContentType(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(@NotNull String contentType, @NotNull String contentSubtype, @NotNull List<HeaderValueParam> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentSubtype, "contentSubtype");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @NotNull
    public final ContentType withParameter(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return hasParameter(name, value) ? this : new ContentType(this.contentType, this.contentSubtype, getContent(), CollectionsKt___CollectionsKt.plus((Collection<? extends HeaderValueParam>) getParameters(), new HeaderValueParam(name, value)));
    }

    public final boolean hasParameter(String name, String value) {
        int size = getParameters().size();
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            HeaderValueParam headerValueParam = getParameters().get(0);
            if (!StringsKt__StringsJVMKt.equals(headerValueParam.getName(), name, true) || !StringsKt__StringsJVMKt.equals(headerValueParam.getValue(), value, true)) {
                return false;
            }
        } else {
            List<HeaderValueParam> parameters = getParameters();
            if ((parameters instanceof Collection) && parameters.isEmpty()) {
                return false;
            }
            for (HeaderValueParam headerValueParam2 : parameters) {
                if (!StringsKt__StringsJVMKt.equals(headerValueParam2.getName(), name, true) || !StringsKt__StringsJVMKt.equals(headerValueParam2.getValue(), value, true)) {
                }
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final ContentType withoutParameters() {
        if (getParameters().isEmpty()) {
            return this;
        }
        return new ContentType(this.contentType, this.contentSubtype, null, 4, null);
    }

    public final boolean match(@NotNull ContentType pattern) {
        boolean zEquals;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!Intrinsics.areEqual(pattern.contentType, "*") && !StringsKt__StringsJVMKt.equals(pattern.contentType, this.contentType, true)) {
            return false;
        }
        if (!Intrinsics.areEqual(pattern.contentSubtype, "*") && !StringsKt__StringsJVMKt.equals(pattern.contentSubtype, this.contentSubtype, true)) {
            return false;
        }
        for (HeaderValueParam headerValueParam : pattern.getParameters()) {
            String name = headerValueParam.getName();
            String value = headerValueParam.getValue();
            if (Intrinsics.areEqual(name, "*")) {
                if (!Intrinsics.areEqual(value, "*")) {
                    List<HeaderValueParam> parameters = getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            if (StringsKt__StringsJVMKt.equals(((HeaderValueParam) it.next()).getValue(), value, true)) {
                            }
                        }
                    }
                    zEquals = false;
                }
                zEquals = true;
                break;
            }
            String strParameter = parameter(name);
            if (!Intrinsics.areEqual(value, "*")) {
                zEquals = StringsKt__StringsJVMKt.equals(strParameter, value, true);
            } else {
                if (strParameter != null) {
                    zEquals = true;
                    break;
                    break;
                }
                zEquals = false;
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public final boolean match(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return match(INSTANCE.parse(pattern));
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ContentType) {
            ContentType contentType = (ContentType) other;
            if (StringsKt__StringsJVMKt.equals(this.contentType, contentType.contentType, true) && StringsKt__StringsJVMKt.equals(this.contentSubtype, contentType.contentSubtype, true) && Intrinsics.areEqual(getParameters(), contentType.getParameters())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.contentType;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.contentSubtype.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (getParameters().hashCode() * 31);
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m7105d2 = {"Lio/ktor/http/ContentType$Companion;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "parse", "value", "", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nContentTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType$Companion\n+ 2 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters$Companion\n*L\n1#1,318:1\n63#2,2:319\n*S KotlinDebug\n*F\n+ 1 ContentTypes.kt\nio/ktor/http/ContentType$Companion\n*L\n117#1:319,2\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ContentType parse(@NotNull String value) throws BadContentTypeFormatException {
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt__StringsJVMKt.isBlank(value)) {
                return getAny();
            }
            HeaderValueWithParameters.Companion companion = HeaderValueWithParameters.INSTANCE;
            HeaderValue headerValue = (HeaderValue) CollectionsKt___CollectionsKt.last((List) HttpHeaderValueParserKt.parseHeaderValue(value));
            String value2 = headerValue.getValue();
            List<HeaderValueParam> params = headerValue.getParams();
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) value2, '/', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) value2).toString(), "*")) {
                    return ContentType.INSTANCE.getAny();
                }
                throw new BadContentTypeFormatException(value);
            }
            String strSubstring = value2.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(value);
            }
            String strSubstring2 = value2.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string2 = StringsKt__StringsKt.trim((CharSequence) strSubstring2).toString();
            if (StringsKt__StringsKt.contains$default((CharSequence) string, ' ', false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) string2, ' ', false, 2, (Object) null)) {
                throw new BadContentTypeFormatException(value);
            }
            if (string2.length() == 0 || StringsKt__StringsKt.contains$default((CharSequence) string2, '/', false, 2, (Object) null)) {
                throw new BadContentTypeFormatException(value);
            }
            return new ContentType(string, string2, params);
        }

        @NotNull
        public final ContentType getAny() {
            return ContentType.Any;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010'\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006¨\u0006/"}, m7105d2 = {"Lio/ktor/http/ContentType$Application;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Atom", "getAtom", "Cbor", "getCbor", "Docx", "getDocx", "FormUrlEncoded", "getFormUrlEncoded", "GZip", "getGZip", "HalJson", "getHalJson", "JavaScript", "getJavaScript", "Json", "getJson", "OctetStream", "getOctetStream", "Pdf", "getPdf", "Pptx", "getPptx", "ProblemJson", "getProblemJson", "ProblemXml", "getProblemXml", "ProtoBuf", "getProtoBuf", "Rss", "getRss", "Wasm", "getWasm", "Xlsx", "getXlsx", "Xml", "getXml", "Xml_Dtd", "getXml_Dtd", "Zip", "getZip", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Application {

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final ContentType Atom;

        @NotNull
        public static final ContentType Cbor;

        @NotNull
        public static final ContentType Docx;

        @NotNull
        public static final ContentType FormUrlEncoded;

        @NotNull
        public static final ContentType GZip;

        @NotNull
        public static final ContentType HalJson;

        @NotNull
        public static final Application INSTANCE = new Application();

        @NotNull
        public static final ContentType JavaScript;

        @NotNull
        public static final ContentType Json;

        @NotNull
        public static final ContentType OctetStream;

        @NotNull
        public static final ContentType Pdf;

        @NotNull
        public static final ContentType Pptx;

        @NotNull
        public static final ContentType ProblemJson;

        @NotNull
        public static final ContentType ProblemXml;

        @NotNull
        public static final ContentType ProtoBuf;

        @NotNull
        public static final ContentType Rss;

        @NotNull
        public static final ContentType Wasm;

        @NotNull
        public static final ContentType Xlsx;

        @NotNull
        public static final ContentType Xml;

        @NotNull
        public static final ContentType Xml_Dtd;

        @NotNull
        public static final ContentType Zip;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("application", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Atom = new ContentType("application", "atom+xml", list2, i2, defaultConstructorMarker2);
            Cbor = new ContentType("application", "cbor", list, i, defaultConstructorMarker);
            Json = new ContentType("application", "json", list2, i2, defaultConstructorMarker2);
            HalJson = new ContentType("application", "hal+json", list, i, defaultConstructorMarker);
            JavaScript = new ContentType("application", "javascript", list2, i2, defaultConstructorMarker2);
            OctetStream = new ContentType("application", "octet-stream", list, i, defaultConstructorMarker);
            Rss = new ContentType("application", "rss+xml", list2, i2, defaultConstructorMarker2);
            Xml = new ContentType("application", "xml", list, i, defaultConstructorMarker);
            Xml_Dtd = new ContentType("application", "xml-dtd", list2, i2, defaultConstructorMarker2);
            Zip = new ContentType("application", ArchiveStreamFactory.ZIP, list, i, defaultConstructorMarker);
            GZip = new ContentType("application", "gzip", list2, i2, defaultConstructorMarker2);
            FormUrlEncoded = new ContentType("application", "x-www-form-urlencoded", list, i, defaultConstructorMarker);
            Pdf = new ContentType("application", "pdf", list2, i2, defaultConstructorMarker2);
            Xlsx = new ContentType("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", list, i, defaultConstructorMarker);
            Docx = new ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", list2, i2, defaultConstructorMarker2);
            Pptx = new ContentType("application", "vnd.openxmlformats-officedocument.presentationml.presentation", list, i, defaultConstructorMarker);
            ProtoBuf = new ContentType("application", "protobuf", list2, i2, defaultConstructorMarker2);
            Wasm = new ContentType("application", "wasm", list, i, defaultConstructorMarker);
            ProblemJson = new ContentType("application", "problem+json", list2, i2, defaultConstructorMarker2);
            ProblemXml = new ContentType("application", "problem+xml", list, i, defaultConstructorMarker);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getAtom() {
            return Atom;
        }

        @NotNull
        public final ContentType getCbor() {
            return Cbor;
        }

        @NotNull
        public final ContentType getJson() {
            return Json;
        }

        @NotNull
        public final ContentType getHalJson() {
            return HalJson;
        }

        @NotNull
        public final ContentType getJavaScript() {
            return JavaScript;
        }

        @NotNull
        public final ContentType getOctetStream() {
            return OctetStream;
        }

        @NotNull
        public final ContentType getRss() {
            return Rss;
        }

        @NotNull
        public final ContentType getXml() {
            return Xml;
        }

        @NotNull
        public final ContentType getXml_Dtd() {
            return Xml_Dtd;
        }

        @NotNull
        public final ContentType getZip() {
            return Zip;
        }

        @NotNull
        public final ContentType getGZip() {
            return GZip;
        }

        @NotNull
        public final ContentType getFormUrlEncoded() {
            return FormUrlEncoded;
        }

        @NotNull
        public final ContentType getPdf() {
            return Pdf;
        }

        @NotNull
        public final ContentType getXlsx() {
            return Xlsx;
        }

        @NotNull
        public final ContentType getDocx() {
            return Docx;
        }

        @NotNull
        public final ContentType getPptx() {
            return Pptx;
        }

        @NotNull
        public final ContentType getProtoBuf() {
            return ProtoBuf;
        }

        @NotNull
        public final ContentType getWasm() {
            return Wasm;
        }

        @NotNull
        public final ContentType getProblemJson() {
            return ProblemJson;
        }

        @NotNull
        public final ContentType getProblemXml() {
            return ProblemXml;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, m7105d2 = {"Lio/ktor/http/ContentType$Audio;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "MP4", "getMP4", "MPEG", "getMPEG", "OGG", "getOGG", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Audio {

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final Audio INSTANCE = new Audio();

        @NotNull
        public static final ContentType MP4;

        @NotNull
        public static final ContentType MPEG;

        @NotNull
        public static final ContentType OGG;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("audio", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            MP4 = new ContentType("audio", "mp4", list2, i2, defaultConstructorMarker2);
            MPEG = new ContentType("audio", "mpeg", list, i, defaultConstructorMarker);
            OGG = new ContentType("audio", "ogg", list2, i2, defaultConstructorMarker2);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getMP4() {
            return MP4;
        }

        @NotNull
        public final ContentType getMPEG() {
            return MPEG;
        }

        @NotNull
        public final ContentType getOGG() {
            return OGG;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/http/ContentType$Image;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "GIF", "getGIF", "JPEG", "getJPEG", "PNG", "getPNG", "SVG", "getSVG", "XIcon", "getXIcon", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Image {

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final ContentType GIF;

        @NotNull
        public static final Image INSTANCE = new Image();

        @NotNull
        public static final ContentType JPEG;

        @NotNull
        public static final ContentType PNG;

        @NotNull
        public static final ContentType SVG;

        @NotNull
        public static final ContentType XIcon;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("image", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            GIF = new ContentType("image", "gif", list2, i2, defaultConstructorMarker2);
            JPEG = new ContentType("image", "jpeg", list, i, defaultConstructorMarker);
            PNG = new ContentType("image", "png", list2, i2, defaultConstructorMarker2);
            SVG = new ContentType("image", "svg+xml", list, i, defaultConstructorMarker);
            XIcon = new ContentType("image", "x-icon", list2, i2, defaultConstructorMarker2);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getGIF() {
            return GIF;
        }

        @NotNull
        public final ContentType getJPEG() {
            return JPEG;
        }

        @NotNull
        public final ContentType getPNG() {
            return PNG;
        }

        @NotNull
        public final ContentType getSVG() {
            return SVG;
        }

        @NotNull
        public final ContentType getXIcon() {
            return XIcon;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lio/ktor/http/ContentType$Message;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Http", "getHttp", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Message {

        @NotNull
        public static final Message INSTANCE = new Message();

        @NotNull
        public static final ContentType Any = new ContentType(ThrowableDeserializer.PROP_NAME_MESSAGE, "*", null, 4, null);

        @NotNull
        public static final ContentType Http = new ContentType(ThrowableDeserializer.PROP_NAME_MESSAGE, HttpHost.DEFAULT_SCHEME_NAME, null, 4, null);

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getHttp() {
            return Http;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/http/ContentType$MultiPart;", "", "()V", "Alternative", "Lio/ktor/http/ContentType;", "getAlternative", "()Lio/ktor/http/ContentType;", "Any", "getAny", "ByteRanges", "getByteRanges", "Encrypted", "getEncrypted", "FormData", "getFormData", "Mixed", "getMixed", "Related", "getRelated", "Signed", "getSigned", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class MultiPart {

        @NotNull
        public static final ContentType Alternative;

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final ContentType ByteRanges;

        @NotNull
        public static final ContentType Encrypted;

        @NotNull
        public static final ContentType FormData;

        @NotNull
        public static final MultiPart INSTANCE = new MultiPart();

        @NotNull
        public static final ContentType Mixed;

        @NotNull
        public static final ContentType Related;

        @NotNull
        public static final ContentType Signed;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("multipart", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Mixed = new ContentType("multipart", "mixed", list2, i2, defaultConstructorMarker2);
            Alternative = new ContentType("multipart", "alternative", list, i, defaultConstructorMarker);
            Related = new ContentType("multipart", "related", list2, i2, defaultConstructorMarker2);
            FormData = new ContentType("multipart", "form-data", list, i, defaultConstructorMarker);
            Signed = new ContentType("multipart", "signed", list2, i2, defaultConstructorMarker2);
            Encrypted = new ContentType("multipart", "encrypted", list, i, defaultConstructorMarker);
            ByteRanges = new ContentType("multipart", "byteranges", list2, i2, defaultConstructorMarker2);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getMixed() {
            return Mixed;
        }

        @NotNull
        public final ContentType getAlternative() {
            return Alternative;
        }

        @NotNull
        public final ContentType getRelated() {
            return Related;
        }

        @NotNull
        public final ContentType getFormData() {
            return FormData;
        }

        @NotNull
        public final ContentType getSigned() {
            return Signed;
        }

        @NotNull
        public final ContentType getEncrypted() {
            return Encrypted;
        }

        @NotNull
        public final ContentType getByteRanges() {
            return ByteRanges;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, m7105d2 = {"Lio/ktor/http/ContentType$Text;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "CSS", "getCSS", "CSV", "getCSV", "EventStream", "getEventStream", "Html", "getHtml", "JavaScript", "getJavaScript", "Plain", "getPlain", "VCard", "getVCard", "Xml", "getXml", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Text {

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final ContentType CSS;

        @NotNull
        public static final ContentType CSV;

        @NotNull
        public static final ContentType EventStream;

        @NotNull
        public static final ContentType Html;

        @NotNull
        public static final Text INSTANCE = new Text();

        @NotNull
        public static final ContentType JavaScript;

        @NotNull
        public static final ContentType Plain;

        @NotNull
        public static final ContentType VCard;

        @NotNull
        public static final ContentType Xml;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("text", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Plain = new ContentType("text", "plain", list2, i2, defaultConstructorMarker2);
            CSS = new ContentType("text", "css", list, i, defaultConstructorMarker);
            CSV = new ContentType("text", "csv", list2, i2, defaultConstructorMarker2);
            Html = new ContentType("text", "html", list, i, defaultConstructorMarker);
            JavaScript = new ContentType("text", "javascript", list2, i2, defaultConstructorMarker2);
            VCard = new ContentType("text", "vcard", list, i, defaultConstructorMarker);
            Xml = new ContentType("text", "xml", list2, i2, defaultConstructorMarker2);
            EventStream = new ContentType("text", "event-stream", list, i, defaultConstructorMarker);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getPlain() {
            return Plain;
        }

        @NotNull
        public final ContentType getCSS() {
            return CSS;
        }

        @NotNull
        public final ContentType getCSV() {
            return CSV;
        }

        @NotNull
        public final ContentType getHtml() {
            return Html;
        }

        @NotNull
        public final ContentType getJavaScript() {
            return JavaScript;
        }

        @NotNull
        public final ContentType getVCard() {
            return VCard;
        }

        @NotNull
        public final ContentType getXml() {
            return Xml;
        }

        @NotNull
        public final ContentType getEventStream() {
            return EventStream;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/http/ContentType$Video;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "MP4", "getMP4", "MPEG", "getMPEG", "OGG", "getOGG", "QuickTime", "getQuickTime", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Video {

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final Video INSTANCE = new Video();

        @NotNull
        public static final ContentType MP4;

        @NotNull
        public static final ContentType MPEG;

        @NotNull
        public static final ContentType OGG;

        @NotNull
        public static final ContentType QuickTime;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType("video", "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            MPEG = new ContentType("video", "mpeg", list2, i2, defaultConstructorMarker2);
            MP4 = new ContentType("video", "mp4", list, i, defaultConstructorMarker);
            OGG = new ContentType("video", "ogg", list2, i2, defaultConstructorMarker2);
            QuickTime = new ContentType("video", "quicktime", list, i, defaultConstructorMarker);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getMPEG() {
            return MPEG;
        }

        @NotNull
        public final ContentType getMP4() {
            return MP4;
        }

        @NotNull
        public final ContentType getOGG() {
            return OGG;
        }

        @NotNull
        public final ContentType getQuickTime() {
            return QuickTime;
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m7105d2 = {"Lio/ktor/http/ContentType$Font;", "", "()V", "Any", "Lio/ktor/http/ContentType;", "getAny", "()Lio/ktor/http/ContentType;", "Collection", "getCollection", "Otf", "getOtf", "Sfnt", "getSfnt", "Ttf", "getTtf", "Woff", "getWoff", "Woff2", "getWoff2", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static final class Font {

        @NotNull
        public static final ContentType Any;

        @NotNull
        public static final ContentType Collection;

        @NotNull
        public static final Font INSTANCE = new Font();

        @NotNull
        public static final ContentType Otf;

        @NotNull
        public static final ContentType Sfnt;

        @NotNull
        public static final ContentType Ttf;

        @NotNull
        public static final ContentType Woff;

        @NotNull
        public static final ContentType Woff2;

        static {
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list = null;
            Any = new ContentType(MediaType.FONT_TYPE, "*", list, i, defaultConstructorMarker);
            int i2 = 4;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list2 = null;
            Collection = new ContentType(MediaType.FONT_TYPE, "collection", list2, i2, defaultConstructorMarker2);
            Otf = new ContentType(MediaType.FONT_TYPE, "otf", list, i, defaultConstructorMarker);
            Sfnt = new ContentType(MediaType.FONT_TYPE, "sfnt", list2, i2, defaultConstructorMarker2);
            Ttf = new ContentType(MediaType.FONT_TYPE, "ttf", list, i, defaultConstructorMarker);
            Woff = new ContentType(MediaType.FONT_TYPE, "woff", list2, i2, defaultConstructorMarker2);
            Woff2 = new ContentType(MediaType.FONT_TYPE, "woff2", list, i, defaultConstructorMarker);
        }

        @NotNull
        public final ContentType getAny() {
            return Any;
        }

        @NotNull
        public final ContentType getCollection() {
            return Collection;
        }

        @NotNull
        public final ContentType getOtf() {
            return Otf;
        }

        @NotNull
        public final ContentType getSfnt() {
            return Sfnt;
        }

        @NotNull
        public final ContentType getTtf() {
            return Ttf;
        }

        @NotNull
        public final ContentType getWoff() {
            return Woff;
        }

        @NotNull
        public final ContentType getWoff2() {
            return Woff2;
        }
    }
}
