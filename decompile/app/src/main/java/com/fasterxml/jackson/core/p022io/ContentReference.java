package com.fasterxml.jackson.core.p022io;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.ivy.core.cache.ArtifactOrigin;

/* loaded from: classes8.dex */
public class ContentReference implements Serializable {
    public static final int DEFAULT_MAX_CONTENT_SNIPPET = 500;
    public static final ContentReference UNKNOWN_CONTENT = new ContentReference(false, null);
    public static final long serialVersionUID = 1;
    public final boolean _isContentTextual;
    public final int _length;
    public final int _offset;
    public final transient Object _rawContent;

    public int maxContentSnippetLength() {
        return 500;
    }

    public final void readObject(ObjectInputStream objectInputStream) throws IOException {
    }

    public final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public ContentReference(boolean z, Object obj) {
        this(z, obj, -1, -1);
    }

    public ContentReference(boolean z, Object obj, int i, int i2) {
        this._isContentTextual = z;
        this._rawContent = obj;
        this._offset = i;
        this._length = i2;
    }

    public static ContentReference unknown() {
        return UNKNOWN_CONTENT;
    }

    public static ContentReference construct(boolean z, Object obj) {
        return new ContentReference(z, obj);
    }

    public static ContentReference construct(boolean z, Object obj, int i, int i2) {
        return new ContentReference(z, obj, i, i2);
    }

    public static ContentReference rawReference(boolean z, Object obj) {
        if (obj instanceof ContentReference) {
            return (ContentReference) obj;
        }
        return new ContentReference(z, obj);
    }

    public static ContentReference rawReference(Object obj) {
        return rawReference(false, obj);
    }

    public Object readResolve() {
        return UNKNOWN_CONTENT;
    }

    public boolean hasTextualContent() {
        return this._isContentTextual;
    }

    public Object getRawContent() {
        return this._rawContent;
    }

    public int contentOffset() {
        return this._offset;
    }

    public int contentLength() {
        return this._length;
    }

    public String buildSourceDescription() {
        return appendSourceDescription(new StringBuilder(200)).toString();
    }

    public StringBuilder appendSourceDescription(StringBuilder sb) {
        String str_truncate;
        Object rawContent = getRawContent();
        if (rawContent == null) {
            sb.append(ArtifactOrigin.UNKNOWN);
            return sb;
        }
        Class<?> cls = rawContent instanceof Class ? (Class) rawContent : rawContent.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (rawContent instanceof byte[]) {
            name = "byte[]";
        } else if (rawContent instanceof char[]) {
            name = "char[]";
        }
        sb.append('(');
        sb.append(name);
        sb.append(')');
        if (hasTextualContent()) {
            int iMaxContentSnippetLength = maxContentSnippetLength();
            int[] iArr = {contentOffset(), contentLength()};
            String str = " chars";
            if (rawContent instanceof CharSequence) {
                str_truncate = _truncate((CharSequence) rawContent, iArr, iMaxContentSnippetLength);
            } else if (rawContent instanceof char[]) {
                str_truncate = _truncate((char[]) rawContent, iArr, iMaxContentSnippetLength);
            } else if (rawContent instanceof byte[]) {
                str_truncate = _truncate((byte[]) rawContent, iArr, iMaxContentSnippetLength);
                str = " bytes";
            } else {
                str_truncate = null;
            }
            if (str_truncate != null) {
                _append(sb, str_truncate);
                if (iArr[1] > iMaxContentSnippetLength) {
                    sb.append("[truncated ");
                    sb.append(iArr[1] - iMaxContentSnippetLength);
                    sb.append(str);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                }
            }
        } else if (rawContent instanceof byte[]) {
            int iContentLength = contentLength();
            if (iContentLength < 0) {
                iContentLength = ((byte[]) rawContent).length;
            }
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(iContentLength);
            sb.append(" bytes]");
        }
        return sb;
    }

    public String _truncate(CharSequence charSequence, int[] iArr, int i) {
        _truncateOffsets(iArr, charSequence.length());
        int i2 = iArr[0];
        return charSequence.subSequence(i2, Math.min(iArr[1], i) + i2).toString();
    }

    public String _truncate(char[] cArr, int[] iArr, int i) {
        _truncateOffsets(iArr, cArr.length);
        return new String(cArr, iArr[0], Math.min(iArr[1], i));
    }

    public String _truncate(byte[] bArr, int[] iArr, int i) {
        _truncateOffsets(iArr, bArr.length);
        return new String(bArr, iArr[0], Math.min(iArr[1], i), Charset.forName("UTF-8"));
    }

    public void _truncateOffsets(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    public int _append(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isISOControl(cCharAt) || !_appendEscaped(sb, cCharAt)) {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
        return str.length();
    }

    public boolean _appendEscaped(StringBuilder sb, int i) {
        if (i == 13 || i == 10) {
            return false;
        }
        sb.append('\\');
        sb.append(AbstractJsonLexerKt.UNICODE_ESC);
        sb.append(CharTypes.hexToChar((i >> 12) & 15));
        sb.append(CharTypes.hexToChar((i >> 8) & 15));
        sb.append(CharTypes.hexToChar((i >> 4) & 15));
        sb.append(CharTypes.hexToChar(i & 15));
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ContentReference)) {
            return false;
        }
        ContentReference contentReference = (ContentReference) obj;
        if (this._offset != contentReference._offset || this._length != contentReference._length) {
            return false;
        }
        Object obj2 = contentReference._rawContent;
        Object obj3 = this._rawContent;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
            return obj3.equals(obj2);
        }
        return obj3 == obj2;
    }

    public int hashCode() {
        return Objects.hashCode(this._rawContent);
    }
}
