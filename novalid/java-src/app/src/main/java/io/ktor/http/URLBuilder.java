package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: URLBuilder.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 G2\u00020\u0001:\u0001GBi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010A\u001a\u00020BH\u0002J\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020\u0005J\b\u0010F\u001a\u00020\u0005H\u0016R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001e\u0010\f\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR(\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016¨\u0006H"}, m7105d2 = {"Lio/ktor/http/URLBuilder;", "", "protocol", "Lio/ktor/http/URLProtocol;", "host", "", "port", "", "user", "password", "pathSegments", "", "parameters", "Lio/ktor/http/Parameters;", FeatureParser.PluginHandler.FRAGMENT, "trailingQuery", "", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Z)V", "encodedFragment", "getEncodedFragment", "()Ljava/lang/String;", "setEncodedFragment", "(Ljava/lang/String;)V", "value", "Lio/ktor/http/ParametersBuilder;", "encodedParameters", "getEncodedParameters", "()Lio/ktor/http/ParametersBuilder;", "setEncodedParameters", "(Lio/ktor/http/ParametersBuilder;)V", "encodedPassword", "getEncodedPassword", "setEncodedPassword", "encodedPathSegments", "getEncodedPathSegments", "()Ljava/util/List;", "setEncodedPathSegments", "(Ljava/util/List;)V", "encodedUser", "getEncodedUser", "setEncodedUser", "getFragment", "setFragment", "getHost", "setHost", "<set-?>", "getParameters", "getPassword", "setPassword", "getPathSegments", "setPathSegments", "getPort", "()I", "setPort", "(I)V", "getProtocol", "()Lio/ktor/http/URLProtocol;", "setProtocol", "(Lio/ktor/http/URLProtocol;)V", "getTrailingQuery", "()Z", "setTrailingQuery", "(Z)V", "getUser", "setUser", "applyOrigin", "", "build", "Lio/ktor/http/Url;", "buildString", "toString", "Companion", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nURLBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1549#2:309\n1620#2,3:310\n1549#2:313\n1620#2,3:314\n1549#2:317\n1620#2,3:318\n*S KotlinDebug\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilder\n*L\n58#1:309\n58#1:310,3\n61#1:313\n61#1:314,3\n63#1:317\n63#1:318,3\n*E\n"})
/* loaded from: classes6.dex */
public final class URLBuilder {

    @NotNull
    public static final Url originUrl;

    @NotNull
    public String encodedFragment;

    @NotNull
    public ParametersBuilder encodedParameters;

    @Nullable
    public String encodedPassword;

    @NotNull
    public List<String> encodedPathSegments;

    @Nullable
    public String encodedUser;

    @NotNull
    public String host;

    @NotNull
    public ParametersBuilder parameters;
    public int port;

    @NotNull
    public URLProtocol protocol;
    public boolean trailingQuery;

    public URLBuilder() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    public URLBuilder(@NotNull URLProtocol protocol, @NotNull String host, int i, @Nullable String str, @Nullable String str2, @NotNull List<String> pathSegments, @NotNull Parameters parameters, @NotNull String fragment, boolean z) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.protocol = protocol;
        this.host = host;
        this.port = i;
        this.trailingQuery = z;
        this.encodedUser = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
        this.encodedPassword = str2 != null ? CodecsKt.encodeURLParameter$default(str2, false, 1, null) : null;
        this.encodedFragment = CodecsKt.encodeURLQueryComponent$default(fragment, false, false, null, 7, null);
        List<String> list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLPathPart((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
        ParametersBuilder parametersBuilderEncodeParameters = UrlDecodedParametersBuilderKt.encodeParameters(parameters);
        this.encodedParameters = parametersBuilderEncodeParameters;
        this.parameters = new UrlDecodedParametersBuilder(parametersBuilderEncodeParameters);
    }

    public /* synthetic */ URLBuilder(URLProtocol uRLProtocol, String str, int i, String str2, String str3, List list, Parameters parameters, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? URLProtocol.INSTANCE.getHTTP() : uRLProtocol, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? str3 : null, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? Parameters.INSTANCE.getEmpty() : parameters, (i2 & 128) == 0 ? str4 : "", (i2 & 256) == 0 ? z : false);
    }

    @NotNull
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final void setProtocol(@NotNull URLProtocol uRLProtocol) {
        Intrinsics.checkNotNullParameter(uRLProtocol, "<set-?>");
        this.protocol = uRLProtocol;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final int getPort() {
        return this.port;
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final void setTrailingQuery(boolean z) {
        this.trailingQuery = z;
    }

    @Nullable
    public final String getEncodedUser() {
        return this.encodedUser;
    }

    public final void setEncodedUser(@Nullable String str) {
        this.encodedUser = str;
    }

    @Nullable
    public final String getUser() {
        String str = this.encodedUser;
        if (str != null) {
            return CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setUser(@Nullable String str) {
        this.encodedUser = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    @Nullable
    public final String getEncodedPassword() {
        return this.encodedPassword;
    }

    public final void setEncodedPassword(@Nullable String str) {
        this.encodedPassword = str;
    }

    @Nullable
    public final String getPassword() {
        String str = this.encodedPassword;
        if (str != null) {
            return CodecsKt.decodeURLPart$default(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void setPassword(@Nullable String str) {
        this.encodedPassword = str != null ? CodecsKt.encodeURLParameter$default(str, false, 1, null) : null;
    }

    @NotNull
    public final String getEncodedFragment() {
        return this.encodedFragment;
    }

    public final void setEncodedFragment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.encodedFragment = str;
    }

    @NotNull
    public final String getFragment() {
        return CodecsKt.decodeURLQueryComponent$default(this.encodedFragment, 0, 0, false, null, 15, null);
    }

    public final void setFragment(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodedFragment = CodecsKt.encodeURLQueryComponent$default(value, false, false, null, 7, null);
    }

    @NotNull
    public final List<String> getEncodedPathSegments() {
        return this.encodedPathSegments;
    }

    public final void setEncodedPathSegments(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.encodedPathSegments = list;
    }

    @NotNull
    public final List<String> getPathSegments() {
        List<String> list = this.encodedPathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.decodeURLPart$default((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final void setPathSegments(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLPathPart((String) it.next()));
        }
        this.encodedPathSegments = arrayList;
    }

    @NotNull
    public final ParametersBuilder getEncodedParameters() {
        return this.encodedParameters;
    }

    public final void setEncodedParameters(@NotNull ParametersBuilder value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.encodedParameters = value;
        this.parameters = new UrlDecodedParametersBuilder(value);
    }

    @NotNull
    public final ParametersBuilder getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String buildString() {
        applyOrigin();
        String string = ((StringBuilder) URLBuilderKt.appendTo(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    @NotNull
    public String toString() {
        String string = ((StringBuilder) URLBuilderKt.appendTo(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    @NotNull
    public final Url build() {
        applyOrigin();
        return new Url(this.protocol, this.host, this.port, getPathSegments(), this.parameters.build(), getFragment(), getUser(), getPassword(), this.trailingQuery, buildString());
    }

    public final void applyOrigin() {
        if (this.host.length() <= 0 && !Intrinsics.areEqual(this.protocol.getName(), PomReader.PomProfileElement.FILE)) {
            Url url = originUrl;
            this.host = url.getHost();
            if (Intrinsics.areEqual(this.protocol, URLProtocol.INSTANCE.getHTTP())) {
                this.protocol = url.getProtocol();
            }
            if (this.port == 0) {
                this.port = url.getSpecifiedPort();
            }
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        originUrl = URLUtilsKt.Url(URLBuilderJvmKt.getOrigin(companion));
    }
}
