package org.jfrog.build.extractor.clientConfiguration.client.distribution.types;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class ReleaseNotes implements Serializable {
    public static final long serialVersionUID = 1;
    public String content;
    public Syntax syntax;

    public enum Syntax {
        markdown,
        asciidoc,
        plain_text
    }

    public Syntax getSyntax() {
        return this.syntax;
    }

    public void setSyntax(Syntax syntax) {
        this.syntax = syntax;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
