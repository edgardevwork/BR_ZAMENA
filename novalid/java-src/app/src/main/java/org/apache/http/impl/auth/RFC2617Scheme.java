package org.apache.http.impl.auth;

import io.ktor.http.auth.HttpAuthHeader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.ParseException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.params.AuthPNames;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.CharsetUtils;

/* loaded from: classes5.dex */
public abstract class RFC2617Scheme extends AuthSchemeBase implements Serializable {
    public static final long serialVersionUID = -2845454858205884623L;
    public transient Charset credentialsCharset;
    public final Map<String, String> params;

    public final void readObjectNoData() throws ObjectStreamException {
    }

    @Deprecated
    public RFC2617Scheme(ChallengeState challengeState) {
        super(challengeState);
        this.params = new HashMap();
        this.credentialsCharset = Consts.ASCII;
    }

    public RFC2617Scheme(Charset charset) {
        this.params = new HashMap();
        this.credentialsCharset = charset == null ? Consts.ASCII : charset;
    }

    public RFC2617Scheme() {
        this(Consts.ASCII);
    }

    public Charset getCredentialsCharset() {
        Charset charset = this.credentialsCharset;
        return charset != null ? charset : Consts.ASCII;
    }

    public String getCredentialsCharset(HttpRequest httpRequest) {
        String str = (String) httpRequest.getParams().getParameter(AuthPNames.CREDENTIAL_CHARSET);
        return str == null ? getCredentialsCharset().name() : str;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws ParseException, MalformedChallengeException {
        HeaderElement[] elements = BasicHeaderValueParser.INSTANCE.parseElements(charArrayBuffer, new ParserCursor(i, charArrayBuffer.length()));
        this.params.clear();
        for (HeaderElement headerElement : elements) {
            this.params.put(headerElement.getName().toLowerCase(Locale.ROOT), headerElement.getValue());
        }
    }

    public Map<String, String> getParameters() {
        return this.params;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        if (str == null) {
            return null;
        }
        return this.params.get(str.toLowerCase(Locale.ROOT));
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return getParameter(HttpAuthHeader.Parameters.Realm);
    }

    public final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(this.credentialsCharset.name());
        objectOutputStream.writeObject(this.challengeState);
    }

    public final void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Charset charset = CharsetUtils.get(objectInputStream.readUTF());
        this.credentialsCharset = charset;
        if (charset == null) {
            this.credentialsCharset = Consts.ASCII;
        }
        this.challengeState = (ChallengeState) objectInputStream.readObject();
    }
}
