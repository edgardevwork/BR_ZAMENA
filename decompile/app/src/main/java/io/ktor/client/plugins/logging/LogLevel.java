package io.ktor.client.plugins.logging;

import kotlin.Metadata;
import org.apache.commons.codec.language.p055bm.Rule;
import org.apache.ivy.ant.IvyCleanCache;

/* compiled from: LogLevel.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/client/plugins/logging/LogLevel;", "", "info", "", "headers", "body", "(Ljava/lang/String;IZZZ)V", "getBody", "()Z", "getHeaders", "getInfo", Rule.ALL, "HEADERS", "BODY", "INFO", IvyCleanCache.NONE, "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public enum LogLevel {
    ALL(true, true, true),
    HEADERS(true, true, false),
    BODY(true, false, true),
    INFO(true, false, false),
    NONE(false, false, false);

    public final boolean body;
    public final boolean headers;
    public final boolean info;

    LogLevel(boolean z, boolean z2, boolean z3) {
        this.info = z;
        this.headers = z2;
        this.body = z3;
    }

    public final boolean getInfo() {
        return this.info;
    }

    public final boolean getHeaders() {
        return this.headers;
    }

    public final boolean getBody() {
        return this.body;
    }
}
