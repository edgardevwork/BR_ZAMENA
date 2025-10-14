package com.google.common.html;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public final class HtmlEscapers {
    public static final Escaper HTML_ESCAPER = Escapers.builder().addEscape('\"', "&quot;").addEscape(ExtendedMessageFormat.QUOTE, "&#39;").addEscape('&', "&amp;").addEscape('<', "&lt;").addEscape('>', "&gt;").build();

    public static Escaper htmlEscaper() {
        return HTML_ESCAPER;
    }
}
