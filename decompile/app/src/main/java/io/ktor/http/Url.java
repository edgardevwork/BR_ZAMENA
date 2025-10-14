package io.ktor.http;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Url.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b,\u0018\u0000 ;2\u00020\u0001:\u0001;Ba\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\u0013\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00109\u001a\u00020\u0007H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016R\u001b\u0010\u0013\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001f\u0010\u0015R\u001b\u0010!\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\"\u0010\u0015R\u001d\u0010$\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b%\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0015¨\u0006<"}, m7105d2 = {"Lio/ktor/http/Url;", "", "protocol", "Lio/ktor/http/URLProtocol;", "host", "", "specifiedPort", "", "pathSegments", "", "parameters", "Lio/ktor/http/Parameters;", FeatureParser.PluginHandler.FRAGMENT, "user", "password", "trailingQuery", "", "urlString", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "encodedFragment", "getEncodedFragment", "()Ljava/lang/String;", "encodedFragment$delegate", "Lkotlin/Lazy;", "encodedPassword", "getEncodedPassword", "encodedPassword$delegate", "encodedPath", "getEncodedPath", "encodedPath$delegate", "encodedPathAndQuery", "getEncodedPathAndQuery", "encodedPathAndQuery$delegate", "encodedQuery", "getEncodedQuery", "encodedQuery$delegate", "encodedUser", "getEncodedUser", "encodedUser$delegate", "getFragment", "getHost", "getParameters", "()Lio/ktor/http/Parameters;", "getPassword", "getPathSegments", "()Ljava/util/List;", "port", "getPort", "()I", "getProtocol", "()Lio/ktor/http/URLProtocol;", "getSpecifiedPort", "getTrailingQuery", "()Z", "getUser", "equals", "other", "hashCode", "toString", "Companion", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Url.kt\nio/ktor/http/Url\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* loaded from: classes6.dex */
public final class Url {

    /* renamed from: encodedFragment$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy encodedFragment;

    /* renamed from: encodedPassword$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy encodedPassword;

    /* renamed from: encodedPath$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy encodedPath;

    /* renamed from: encodedPathAndQuery$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy encodedPathAndQuery;

    /* renamed from: encodedQuery$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy encodedQuery;

    /* renamed from: encodedUser$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy encodedUser;

    @NotNull
    public final String fragment;

    @NotNull
    public final String host;

    @NotNull
    public final Parameters parameters;

    @Nullable
    public final String password;

    @NotNull
    public final List<String> pathSegments;

    @NotNull
    public final URLProtocol protocol;
    public final int specifiedPort;
    public final boolean trailingQuery;

    @NotNull
    public final String urlString;

    @Nullable
    public final String user;

    public Url(@NotNull URLProtocol protocol, @NotNull String host, int i, @NotNull List<String> pathSegments, @NotNull Parameters parameters, @NotNull String fragment, @Nullable String str, @Nullable String str2, boolean z, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.protocol = protocol;
        this.host = host;
        this.specifiedPort = i;
        this.pathSegments = pathSegments;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z;
        this.urlString = urlString;
        if ((i < 0 || i >= 65536) && i != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set".toString());
        }
        this.encodedPath = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.ktor.http.Url$encodedPath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                int iIndexOf$default;
                if (this.this$0.getPathSegments().isEmpty() || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, '/', this.this$0.getProtocol().getName().length() + 3, false, 4, (Object) null)) == -1) {
                    return "";
                }
                int iIndexOfAny$default = StringsKt__StringsKt.indexOfAny$default((CharSequence) this.this$0.urlString, new char[]{'?', '#'}, iIndexOf$default, false, 4, (Object) null);
                if (iIndexOfAny$default == -1) {
                    String strSubstring = this.this$0.urlString.substring(iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                String strSubstring2 = this.this$0.urlString.substring(iIndexOf$default, iIndexOfAny$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
        this.encodedQuery = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.ktor.http.Url$encodedQuery$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, '?', 0, false, 6, (Object) null) + 1;
                if (iIndexOf$default != 0) {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, '#', iIndexOf$default, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        String strSubstring = this.this$0.urlString.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        return strSubstring;
                    }
                    String strSubstring2 = this.this$0.urlString.substring(iIndexOf$default, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring2;
                }
                return "";
            }
        });
        this.encodedPathAndQuery = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.ktor.http.Url$encodedPathAndQuery$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, '/', this.this$0.getProtocol().getName().length() + 3, false, 4, (Object) null);
                if (iIndexOf$default != -1) {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, '#', iIndexOf$default, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        String strSubstring = this.this$0.urlString.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        return strSubstring;
                    }
                    String strSubstring2 = this.this$0.urlString.substring(iIndexOf$default, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring2;
                }
                return "";
            }
        });
        this.encodedUser = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.ktor.http.Url$encodedUser$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                if (this.this$0.getUser() == null) {
                    return null;
                }
                if (this.this$0.getUser().length() == 0) {
                    return "";
                }
                int length = this.this$0.getProtocol().getName().length() + 3;
                String strSubstring = this.this$0.urlString.substring(length, StringsKt__StringsKt.indexOfAny$default((CharSequence) this.this$0.urlString, new char[]{':', ObjectUtils.AT_SIGN}, length, false, 4, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        });
        this.encodedPassword = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.ktor.http.Url$encodedPassword$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                if (this.this$0.getPassword() == null) {
                    return null;
                }
                if (this.this$0.getPassword().length() == 0) {
                    return "";
                }
                String strSubstring = this.this$0.urlString.substring(StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, ':', this.this$0.getProtocol().getName().length() + 3, false, 4, (Object) null) + 1, StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, ObjectUtils.AT_SIGN, 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        });
        this.encodedFragment = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: io.ktor.http.Url$encodedFragment$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.this$0.urlString, '#', 0, false, 6, (Object) null) + 1;
                if (iIndexOf$default != 0) {
                    String strSubstring = this.this$0.urlString.substring(iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                return "";
            }
        });
    }

    @NotNull
    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    @NotNull
    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getFragment() {
        return this.fragment;
    }

    @Nullable
    public final String getUser() {
        return this.user;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final int getPort() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    @NotNull
    public final String getEncodedPath() {
        return (String) this.encodedPath.getValue();
    }

    @NotNull
    public final String getEncodedQuery() {
        return (String) this.encodedQuery.getValue();
    }

    @NotNull
    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery.getValue();
    }

    @Nullable
    public final String getEncodedUser() {
        return (String) this.encodedUser.getValue();
    }

    @Nullable
    public final String getEncodedPassword() {
        return (String) this.encodedPassword.getValue();
    }

    @NotNull
    public final String getEncodedFragment() {
        return (String) this.encodedFragment.getValue();
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getUrlString() {
        return this.urlString;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Url.class == other.getClass() && Intrinsics.areEqual(this.urlString, ((Url) other).urlString);
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }
}
