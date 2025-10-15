package kotlinx.serialization.json.internal;

import androidx.media3.extractor.text.ttml.TtmlParser;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: WriteMode.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m7105d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", TtmlParser.ATTR_BEGIN, "", "end", "(Ljava/lang/String;ICC)V", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public enum WriteMode {
    OBJ('{', '}'),
    LIST(AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST),
    MAP('{', '}'),
    POLY_OBJ(AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST);


    @JvmField
    public final char begin;

    @JvmField
    public final char end;

    WriteMode(char c, char c2) {
        this.begin = c;
        this.end = c2;
    }
}
